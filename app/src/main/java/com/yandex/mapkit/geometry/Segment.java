package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Segment implements Serializable {
    private Point endPoint;
    private Point startPoint;

    public Segment(Point point, Point point2) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"startPoint\" cannot be null");
        }
        if (point2 == null) {
            throw new IllegalArgumentException("Required field \"endPoint\" cannot be null");
        }
        this.startPoint = point;
        this.endPoint = point2;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getStartPoint() {
        return this.startPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.startPoint = (Point) archive.add((Archive) this.startPoint, false, (Class<Archive>) Point.class);
        this.endPoint = (Point) archive.add((Archive) this.endPoint, false, (Class<Archive>) Point.class);
    }

    public Segment() {
    }
}
