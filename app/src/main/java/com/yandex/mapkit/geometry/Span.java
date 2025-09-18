package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Span implements Serializable {
    private double horizontalAngle;
    private double verticalAngle;

    public Span(double d, double d2) {
        this.horizontalAngle = d;
        this.verticalAngle = d2;
    }

    public double getHorizontalAngle() {
        return this.horizontalAngle;
    }

    public double getVerticalAngle() {
        return this.verticalAngle;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.horizontalAngle = archive.add(this.horizontalAngle);
        this.verticalAngle = archive.add(this.verticalAngle);
    }

    public Span() {
    }
}
