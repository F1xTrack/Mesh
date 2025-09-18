package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class VZ0 extends AbstractC6120ng {
    public final C7891wy D;
    public final C4246hw E;

    public VZ0(C5948mm0 c5948mm0, C1910Yg0 c1910Yg0, C4246hw c4246hw, C1847Xl0 c1847Xl0) {
        super(c5948mm0, c1910Yg0);
        this.E = c4246hw;
        C7891wy c7891wy = new C7891wy(c5948mm0, this, new SZ0("__container", c1910Yg0.a, false), c1847Xl0);
        this.D = c7891wy;
        c7891wy.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.AbstractC6120ng, defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.n, z);
    }

    @Override // defpackage.AbstractC6120ng
    public final void k(Canvas canvas, Matrix matrix, int i) {
        this.D.f(canvas, matrix, i);
    }

    @Override // defpackage.AbstractC6120ng
    public final C0481Fx1 l() {
        C0481Fx1 c0481Fx1 = this.p.w;
        return c0481Fx1 != null ? c0481Fx1 : this.E.p.w;
    }

    @Override // defpackage.AbstractC6120ng
    public final C7375uF m() {
        C7375uF c7375uF = this.p.x;
        return c7375uF != null ? c7375uF : this.E.p.x;
    }

    @Override // defpackage.AbstractC6120ng
    public final void q(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        this.D.c(c0971Mf0, i, arrayList, c0971Mf02);
    }
}
