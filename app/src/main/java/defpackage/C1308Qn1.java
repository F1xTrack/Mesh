package defpackage;

import android.view.WindowInsets;

/* renamed from: Qn1 */
/* loaded from: classes.dex */
public class C1308Qn1 extends C1230Pn1 {
    public J80 n;
    public J80 o;
    public J80 p;

    public C1308Qn1(C1698Vn1 c1698Vn1, WindowInsets windowInsets) {
        super(c1698Vn1, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.C1464Sn1
    public J80 g() {
        if (this.o == null) {
            this.o = J80.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.C1464Sn1
    public J80 i() {
        if (this.n == null) {
            this.n = J80.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.C1464Sn1
    public J80 k() {
        if (this.p == null) {
            this.p = J80.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.AbstractC1074Nn1, defpackage.C1464Sn1
    public C1698Vn1 l(int i, int i2, int i3, int i4) {
        return C1698Vn1.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.C1152On1, defpackage.C1464Sn1
    public void r(J80 j80) {
    }
}
