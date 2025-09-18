package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Location implements Serializable {
    private long absoluteTimestamp;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private Point position;
    private long relativeTimestamp;
    private Double speed;

    public Location(Point point, Double d, Double d2, Double d3, Double d4, Double d5, long j, long j2) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = point;
        this.accuracy = d;
        this.altitude = d2;
        this.altitudeAccuracy = d3;
        this.heading = d4;
        this.speed = d5;
        this.absoluteTimestamp = j;
        this.relativeTimestamp = j2;
    }

    public long getAbsoluteTimestamp() {
        return this.absoluteTimestamp;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public Double getHeading() {
        return this.heading;
    }

    public Point getPosition() {
        return this.position;
    }

    public long getRelativeTimestamp() {
        return this.relativeTimestamp;
    }

    public Double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.accuracy = archive.add(this.accuracy, true);
        this.altitude = archive.add(this.altitude, true);
        this.altitudeAccuracy = archive.add(this.altitudeAccuracy, true);
        this.heading = archive.add(this.heading, true);
        this.speed = archive.add(this.speed, true);
        this.absoluteTimestamp = archive.add(this.absoluteTimestamp);
        this.relativeTimestamp = archive.add(this.relativeTimestamp);
    }

    public Location() {
    }
}
