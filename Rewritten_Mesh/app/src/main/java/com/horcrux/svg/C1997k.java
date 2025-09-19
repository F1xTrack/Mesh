package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;
import p000.AbstractC6733rH;
import p000.C11931zU0;
import p000.C4134gj;

/* renamed from: com.horcrux.svg.k */
/* loaded from: classes.dex */
public final class C1997k extends AbstractC6733rH {

    /* renamed from: h */
    public static final float[] f18622h = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public C11931zU0 f18623a;

    /* renamed from: b */
    public C11931zU0 f18624b;

    /* renamed from: c */
    public C11931zU0 f18625c;

    /* renamed from: d */
    public C11931zU0 f18626d;

    /* renamed from: e */
    public ReadableArray f18627e;

    /* renamed from: f */
    public int f18628f;

    /* renamed from: g */
    public Matrix f18629g;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C4134gj c4134gj = new C4134gj(1, new C11931zU0[]{this.f18623a, this.f18624b, this.f18625c, this.f18626d}, this.f18628f);
            c4134gj.f27955c = this.f18627e;
            Matrix matrix = this.f18629g;
            if (matrix != null) {
                c4134gj.f27958f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f18628f == 2) {
                c4134gj.f27959g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c4134gj, this.mName);
        }
    }
}
