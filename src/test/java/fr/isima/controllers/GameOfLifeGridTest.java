package fr.isima.controllers;

import fr.isima.service.GameOfLifeGrid;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GameOfLifeGridTest {

    private GameOfLifeGrid lifeGameController = new GameOfLifeGrid(5, 5);

    @Test
    public void goodSize() {
        assertThat(lifeGameController.getGrid()).hasSize(25);
    }

    @Test
    public void allCellsShouldBeFalse() {
        assertThat(lifeGameController.getGrid().values()).containsOnly(false);
    }

    @Test
    public void livingWork() {
        assertThat(lifeGameController.alive(3, 2)).isFalse();
        lifeGameController.living(3, 2);
        assertThat(lifeGameController.alive(3, 2)).isTrue();

    }

    @Test
    public void numberLifeNeighboor_allDead_returns0() {
        lifeGameController.living(3, 2);
        assertThat(lifeGameController.numberLivingNeighboor(3, 2)).isEqualTo(0);
    }

    @Test
    public void numberLifeNeighboor_cornerCellAndallDead_returns0() {
        assertThat(lifeGameController.numberLivingNeighboor(0, 0)).isEqualTo(0);
    }

 @Test(expected = IllegalArgumentException.class)
    public void living_outOfBounds_throws() {
        lifeGameController.living(-1, -1);
    }

    @Test
    public void numberLifeNeighboor_allLiving_returns8() {
        lifeGameController.living(2, 1);
        lifeGameController.living(3, 1);
        lifeGameController.living(4, 1);
        lifeGameController.living(2, 2);
        lifeGameController.living(4, 2);
        lifeGameController.living(2, 3);
        lifeGameController.living(3, 3);
        lifeGameController.living(4, 3);

        assertThat(lifeGameController.numberLivingNeighboor(3, 2)).isEqualTo(8);
    }


}