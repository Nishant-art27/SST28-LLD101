package com.example.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight factory - caches and shares MarkerStyle instances.
 */
public class MarkerStyleFactory {

    private final Map<String, MarkerStyle> styleCache = new HashMap<>();

    public MarkerStyle get(String shape, String color, int size, boolean filled) {
        String cacheKey = shape + "|" + color + "|" + size + "|" + (filled ? "F" : "O");

        if (styleCache.containsKey(cacheKey)) {
            return styleCache.get(cacheKey);
        }

        MarkerStyle newStyle = new MarkerStyle(shape, color, size, filled);
        styleCache.put(cacheKey, newStyle);
        return newStyle;
    }

    public int cacheSize() {
        return styleCache.size();
    }
}