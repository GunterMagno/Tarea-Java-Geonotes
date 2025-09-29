package com.example.geonotesteaching;

import java.util.Objects;

public class LegacyPoint {

    private final double lat;
    private final double lon;

    public LegacyPoint(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public String toString() {
        return String.format("Legacy Point: lat = %s, lon = %s", lat, lon);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        LegacyPoint that = (LegacyPoint) obj;
        return Double.compare(that.lat, lat) == 0 && Double.compare(that.lon, lon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon);
    }
}
