package com.horcrux.svg;

import defpackage.C8372zU0;

/* renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598m extends C2592g {
    public C8372zU0 f;
    public C8372zU0 g;
    public C8372zU0 h;
    public C8372zU0 i;
    public int j;
    public int k;

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
