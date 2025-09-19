package com.horcrux.svg;

import android.graphics.Matrix;
import android.view.View;
import defpackage.C8372zU0;

/* renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597l extends C2592g {
    public C8372zU0 f;
    public C8372zU0 g;
    public C8372zU0 h;
    public C8372zU0 i;
    public String j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public String p;
    public int q;
    public Matrix r;

    @Override // com.horcrux.svg.C2592g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }
}
