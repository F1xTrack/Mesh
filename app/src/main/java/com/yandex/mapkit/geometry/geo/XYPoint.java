package com.yandex.mapkit.geometry.geo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class XYPoint implements Serializable {

    /* renamed from: x */
    private double f20718x;

    /* renamed from: y */
    private double f20719y;

    public XYPoint(double d, double d2) {
        this.f20718x = d;
        this.f20719y = d2;
    }

    public double getX() {
        return this.f20718x;
    }

    public double getY() {
        return this.f20719y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f20718x = archive.add(this.f20718x);
        this.f20719y = archive.add(this.f20719y);
    }

    public XYPoint() {
    }
}
