package fr.isima.controllers;

import fr.isima.service.GameOfLifeGrid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grids")
public class GridController {
    private GameOfLifeGrid grid;

    @GetMapping("{largeur}/{hauteur}")
    public GameOfLifeGrid grids(@PathVariable Integer largeur, @PathVariable Integer hauteur) {
        grid = new GameOfLifeGrid(largeur,hauteur);
        return grid;
    }

    @GetMapping("/modify/{id}/{x}/{y}")
    public void modifyliving(@PathVariable Integer id, @PathVariable Integer x, @PathVariable Integer y) {
       // grid = getGridBDD(id);
        grid.living(x,y);
    }

    @GetMapping("/save/{id}")
    public void savegrid(@PathVariable Integer id) {
        //grid = putGridBDD(id,grid);
        
    }
}
