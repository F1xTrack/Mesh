package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Circle implements Serializable {
    private Point center;
    private float radius;

    public Circle(Point point, float f) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"center\" cannot be null");
        }
        this.center = point;
        this.radius = f;
    }

    public Point getCenter() {
        return this.center;
    }

    public float getRadius() {
        return this.radius;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.center = (Point) archive.add((Archive) this.center, false, (Class<Archive>) Point.class);
        this.radius = archive.add(this.radius);
    }

    public Circle() {
    }
}
