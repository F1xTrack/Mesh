package com.horcrux.svg;

import android.graphics.Matrix;
import defpackage.C4016gj;
import defpackage.C8372zU0;

/* renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2599n extends C2592g {
    public static final float[] s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public C8372zU0 f;
    public C8372zU0 g;
    public C8372zU0 h;
    public C8372zU0 i;
    public int j;
    public int k;
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
            C4016gj c4016gj = new C4016gj(3, new C8372zU0[]{this.f, this.g, this.h, this.i}, this.j);
            c4016gj.e = this.k == 1;
            c4016gj.h = this;
            Matrix matrix = this.r;
            if (matrix != null) {
                c4016gj.f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.j == 2 || this.k == 2) {
                c4016gj.g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c4016gj, this.mName);
        }
    }
}
