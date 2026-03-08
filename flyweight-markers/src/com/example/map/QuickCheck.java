package com.example.map;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Quick validation:
 * - counts unique style object references used by markers.
 *
 * Starter should report a large number (close to marker count).
 * After Flyweight refactor, it should report a small number
 * (bounded by unique combinations of shape/color/size/filled).
 */
public class QuickCheck {

    public static void main(String[] args) {
        int markerCount = 20_000;

        MapDataSource dataSource = new MapDataSource();
        List<MapMarker> markers = dataSource.loadMarkers(markerCount);

        Set<Integer> styleIdentities = new HashSet<>();
        for (MapMarker marker : markers) {
            styleIdentities.add(System.identityHashCode(marker.getStyle()));
        }

        System.out.println("Markers: " + markerCount);
        System.out.println("Unique style instances (by identity): " + styleIdentities.size());
        System.out.println("Expected after Flyweight: <= " + (3 * 4 * 4 * 2) + " (shape*color*size*filled)");
    }
}