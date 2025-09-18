package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;
import p000.AbstractC6733rH;
import p000.C11931zU0;
import p000.C4134gj;

/* renamed from: com.horcrux.svg.o */
/* loaded from: classes.dex */
public final class C2001o extends AbstractC6733rH {

    /* renamed from: j */
    public static final float[] f18663j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public C11931zU0 f18664a;

    /* renamed from: b */
    public C11931zU0 f18665b;

    /* renamed from: c */
    public C11931zU0 f18666c;

    /* renamed from: d */
    public C11931zU0 f18667d;

    /* renamed from: e */
    public C11931zU0 f18668e;

    /* renamed from: f */
    public C11931zU0 f18669f;

    /* renamed from: g */
    public ReadableArray f18670g;

    /* renamed from: h */
    public int f18671h;

    /* renamed from: i */
    public Matrix f18672i;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C4134gj c4134gj = new C4134gj(2, new C11931zU0[]{this.f18664a, this.f18665b, this.f18666c, this.f18667d, this.f18668e, this.f18669f}, this.f18671h);
            c4134gj.f27955c = this.f18670g;
            Matrix matrix = this.f18672i;
            if (matrix != null) {
                c4134gj.f27958f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f18671h == 2) {
                c4134gj.f27959g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c4134gj, this.mName);
        }
    }
}
