package com.example.map;

import java.util.List;

/**
 * Renders markers to console (simulating a UI renderer).
 */
public class MapRenderer {

    public void render(List<MapMarker> markers) {
        System.out.println("Rendering " + markers.size() + " markers...");
        int displayedCount = 0;

        for (MapMarker marker : markers) {
            // Simulate some "rendering" work
            if (displayedCount < 8) {
                System.out.println(format(marker));
                displayedCount++;
            }
        }

        if (markers.size() > displayedCount) {
            System.out.println("... (" + (markers.size() - displayedCount) + " more not shown)");
        }
    }

    private String format(MapMarker marker) {
        return String.format("%s @ (%.4f, %.4f) style=%s",
                marker.getLabel(), marker.getLat(), marker.getLng(), marker.getStyle());
    }
}