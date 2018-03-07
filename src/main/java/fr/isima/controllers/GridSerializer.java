package fr.isima.controllers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import fr.isima.service.GameOfLifeGrid;
import fr.isima.service.Point;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridSerializer extends StdSerializer<GameOfLifeGrid> {

    public GridSerializer() {
        this(null);
    }

    public GridSerializer(Class<GameOfLifeGrid> t) {
        super(t);
    }

    @Override
    public void serialize(
            GameOfLifeGrid grid, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeObjectField("grid", grid(grid));
        jgen.writeEndObject();
    }

    private Map<String, Object> grid(GameOfLifeGrid grid) {
        final Map<String, Object> map = new HashMap<>();
        map.put("width", grid.getWidth());
        map.put("height", grid.getHeight());
        map.put("id", grid.getId());
        map.put("cells", cells(grid.getGrid()));
        return map;
    }



    private List<Map<String, Object>> cells(Map<Point, Boolean> grid) {
        final List<Map<String,Object>> cells = new ArrayList<>();
        for (final Map.Entry<Point, Boolean> cellEntry : grid.entrySet()) {
           final Map<String, Object> cell = new HashMap<>();
            cell.put("x",cellEntry.getKey().getX());
            cell.put("y",cellEntry.getKey().getY());
            cell.put("alive", cellEntry.getValue());
            cells.add(cell);
        }

        return cells;

    }
}
