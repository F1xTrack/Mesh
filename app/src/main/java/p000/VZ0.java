package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class VZ0 extends AbstractC6504ng {

    /* renamed from: D */
    public final C7108wy f12620D;

    /* renamed from: E */
    public final C4210hw f12621E;

    public VZ0(C10307mm0 c10307mm0, C8574Yg0 c8574Yg0, C4210hw c4210hw, C8532Xl0 c8532Xl0) {
        super(c10307mm0, c8574Yg0);
        this.f12621E = c4210hw;
        C7108wy c7108wy = new C7108wy(c10307mm0, this, new SZ0("__container", c8574Yg0.f14418a, false), c8532Xl0);
        this.f12620D = c7108wy;
        c7108wy.mo1742b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p000.AbstractC6504ng, p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1744d(rectF, matrix, z);
        this.f12620D.mo1744d(rectF, this.f38455n, z);
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: k */
    public final void mo5542k(Canvas canvas, Matrix matrix, int i) {
        this.f12620D.mo1745f(canvas, matrix, i);
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: l */
    public final C7621Fx1 mo8507l() {
        C7621Fx1 c7621Fx1 = this.f38457p.f14440w;
        return c7621Fx1 != null ? c7621Fx1 : this.f12621E.f38457p.f14440w;
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: m */
    public final C6937uF mo8508m() {
        C6937uF c6937uF = this.f38457p.f14441x;
        return c6937uF != null ? c6937uF : this.f12621E.f38457p.f14441x;
    }

    @Override // p000.AbstractC6504ng
    /* renamed from: q */
    public final void mo8509q(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        this.f12620D.mo1743c(c7948Mf0, i, arrayList, c7948Mf02);
    }
}
