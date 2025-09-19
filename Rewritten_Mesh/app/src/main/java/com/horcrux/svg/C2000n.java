package com.horcrux.svg;

import android.graphics.Matrix;
import p000.C11931zU0;
import p000.C4134gj;

/* renamed from: com.horcrux.svg.n */
/* loaded from: classes.dex */
public final class C2000n extends C1993g {

    /* renamed from: s */
    public static final float[] f18649s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f */
    public C11931zU0 f18650f;

    /* renamed from: g */
    public C11931zU0 f18651g;

    /* renamed from: h */
    public C11931zU0 f18652h;

    /* renamed from: i */
    public C11931zU0 f18653i;

    /* renamed from: j */
    public int f18654j;

    /* renamed from: k */
    public int f18655k;

    /* renamed from: l */
    public float f18656l;

    /* renamed from: m */
    public float f18657m;

    /* renamed from: n */
    public float f18658n;

    /* renamed from: o */
    public float f18659o;

    /* renamed from: p */
    public String f18660p;

    /* renamed from: q */
    public int f18661q;

    /* renamed from: r */
    public Matrix f18662r;

    @Override // com.horcrux.svg.C1993g, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C4134gj c4134gj = new C4134gj(3, new C11931zU0[]{this.f18650f, this.f18651g, this.f18652h, this.f18653i}, this.f18654j);
            c4134gj.f27957e = this.f18655k == 1;
            c4134gj.f27960h = this;
            Matrix matrix = this.f18662r;
            if (matrix != null) {
                c4134gj.f27958f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f18654j == 2 || this.f18655k == 2) {
                c4134gj.f27959g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c4134gj, this.mName);
        }
    }
}
