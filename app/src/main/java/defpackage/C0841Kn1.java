package defpackage;

import android.view.WindowInsets;

/* renamed from: Kn1 */
/* loaded from: classes.dex */
public class C0841Kn1 extends AbstractC0996Mn1 {
    public final WindowInsets.Builder c;

    public C0841Kn1() {
        this.c = AbstractC6977s91.l();
    }

    @Override // defpackage.AbstractC0996Mn1
    public C1698Vn1 b() {
        a();
        C1698Vn1 c1698Vn1H = C1698Vn1.h(null, this.c.build());
        c1698Vn1H.a.p(this.b);
        return c1698Vn1H;
    }

    @Override // defpackage.AbstractC0996Mn1
    public void d(J80 j80) {
        this.c.setMandatorySystemGestureInsets(j80.d());
    }

    @Override // defpackage.AbstractC0996Mn1
    public void e(J80 j80) {
        this.c.setStableInsets(j80.d());
    }

    @Override // defpackage.AbstractC0996Mn1
    public void f(J80 j80) {
        this.c.setSystemGestureInsets(j80.d());
    }

    @Override // defpackage.AbstractC0996Mn1
    public void g(J80 j80) {
        this.c.setSystemWindowInsets(j80.d());
    }

    @Override // defpackage.AbstractC0996Mn1
    public void h(J80 j80) {
        this.c.setTappableElementInsets(j80.d());
    }

    public C0841Kn1(C1698Vn1 c1698Vn1) {
        WindowInsets.Builder builderL;
        super(c1698Vn1);
        WindowInsets windowInsetsG = c1698Vn1.g();
        if (windowInsetsG != null) {
            builderL = AbstractC6977s91.m(windowInsetsG);
        } else {
            builderL = AbstractC6977s91.l();
        }
        this.c = builderL;
    }
}
