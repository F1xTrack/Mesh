package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;
import defpackage.AbstractC6808rH;
import defpackage.C4016gj;
import defpackage.C8372zU0;

/* renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2600o extends AbstractC6808rH {
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public C8372zU0 a;
    public C8372zU0 b;
    public C8372zU0 c;
    public C8372zU0 d;
    public C8372zU0 e;
    public C8372zU0 f;
    public ReadableArray g;
    public int h;
    public Matrix i;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C4016gj c4016gj = new C4016gj(2, new C8372zU0[]{this.a, this.b, this.c, this.d, this.e, this.f}, this.h);
            c4016gj.c = this.g;
            Matrix matrix = this.i;
            if (matrix != null) {
                c4016gj.f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.h == 2) {
                c4016gj.g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c4016gj, this.mName);
        }
    }
}
