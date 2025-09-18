package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class TileId implements Serializable {

    /* renamed from: x */
    private int f20715x;

    /* renamed from: y */
    private int f20716y;

    /* renamed from: z */
    private int f20717z;

    public TileId(int i, int i2, int i3) {
        this.f20715x = i;
        this.f20716y = i2;
        this.f20717z = i3;
    }

    public int getX() {
        return this.f20715x;
    }

    public int getY() {
        return this.f20716y;
    }

    public int getZ() {
        return this.f20717z;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f20715x = archive.add(this.f20715x);
        this.f20716y = archive.add(this.f20716y);
        this.f20717z = archive.add(this.f20717z);
    }

    public TileId() {
    }
}
