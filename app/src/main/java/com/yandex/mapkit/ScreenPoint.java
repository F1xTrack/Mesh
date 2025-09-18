package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class ScreenPoint implements Serializable {

    /* renamed from: x */
    private float f20713x;

    /* renamed from: y */
    private float f20714y;

    public ScreenPoint(float f, float f2) {
        this.f20713x = f;
        this.f20714y = f2;
    }

    public float getX() {
        return this.f20713x;
    }

    public float getY() {
        return this.f20714y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f20713x = archive.add(this.f20713x);
        this.f20714y = archive.add(this.f20714y);
    }

    public ScreenPoint() {
    }
}
