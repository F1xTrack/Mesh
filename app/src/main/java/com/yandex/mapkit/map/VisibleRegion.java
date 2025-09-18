package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class VisibleRegion implements Serializable {
    private Point bottomLeft;
    private Point bottomRight;
    private Point topLeft;
    private Point topRight;

    public VisibleRegion(Point point, Point point2, Point point3, Point point4) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"topLeft\" cannot be null");
        }
        if (point2 == null) {
            throw new IllegalArgumentException("Required field \"topRight\" cannot be null");
        }
        if (point3 == null) {
            throw new IllegalArgumentException("Required field \"bottomLeft\" cannot be null");
        }
        if (point4 == null) {
            throw new IllegalArgumentException("Required field \"bottomRight\" cannot be null");
        }
        this.topLeft = point;
        this.topRight = point2;
        this.bottomLeft = point3;
        this.bottomRight = point4;
    }

    public Point getBottomLeft() {
        return this.bottomLeft;
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getTopRight() {
        return this.topRight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.topLeft = (Point) archive.add((Archive) this.topLeft, false, (Class<Archive>) Point.class);
        this.topRight = (Point) archive.add((Archive) this.topRight, false, (Class<Archive>) Point.class);
        this.bottomLeft = (Point) archive.add((Archive) this.bottomLeft, false, (Class<Archive>) Point.class);
        this.bottomRight = (Point) archive.add((Archive) this.bottomRight, false, (Class<Archive>) Point.class);
    }

    public VisibleRegion() {
    }
}
