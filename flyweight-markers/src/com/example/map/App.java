package com.example.map;

import java.util.List;

/**
 * Entry point for the demo.
 */
public class App {

    public static void main(String[] args) {
        int totalMarkers = 30_000;

        MapDataSource dataSource = new MapDataSource();
        List<MapMarker> markers = dataSource.loadMarkers(totalMarkers);

        new MapRenderer().render(markers);

        System.out.println();
        System.out.println("Run QuickCheck to verify Flyweight sharing:");
        System.out.println("  java com.example.map.QuickCheck");
    }
}