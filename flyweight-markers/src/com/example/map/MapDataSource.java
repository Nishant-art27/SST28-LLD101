package com.example.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates markers using shared styles from factory.
 */
public class MapDataSource {

    private static final String[] SHAPES = {"PIN", "CIRCLE", "SQUARE"};
    private static final String[] COLORS = {"RED", "BLUE", "GREEN", "ORANGE"};
    private static final int[] SIZES = {10, 12, 14, 16};

    private final MarkerStyleFactory styleFactory = new MarkerStyleFactory();

    public List<MapMarker> loadMarkers(int count) {
        Random random = new Random(7);
        List<MapMarker> markerList = new ArrayList<>(count);

        for (int markerIndex = 0; markerIndex < count; markerIndex++) {
            double lat = 12.9000 + random.nextDouble() * 0.2000;
            double lng = 77.5000 + random.nextDouble() * 0.2000;
            String label = "M-" + markerIndex;

            String shape = SHAPES[random.nextInt(SHAPES.length)];
            String color = COLORS[random.nextInt(COLORS.length)];
            int size = SIZES[random.nextInt(SIZES.length)];
            boolean filled = random.nextBoolean();

            MarkerStyle markerStyle = styleFactory.get(shape, color, size, filled);

            markerList.add(new MapMarker(lat, lng, label, markerStyle));
        }

        System.out.println("[factory] unique styles cached: " + styleFactory.cacheSize());
        return markerList;
    }
}