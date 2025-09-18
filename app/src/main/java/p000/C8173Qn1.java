package p000;

import android.view.WindowInsets;

/* renamed from: Qn1 */
/* loaded from: classes.dex */
public class C8173Qn1 extends C8121Pn1 {

    /* renamed from: n */
    public J80 f9784n;

    /* renamed from: o */
    public J80 f9785o;

    /* renamed from: p */
    public J80 f9786p;

    public C8173Qn1(C8433Vn1 c8433Vn1, WindowInsets windowInsets) {
        super(c8433Vn1, windowInsets);
        this.f9784n = null;
        this.f9785o = null;
        this.f9786p = null;
    }

    @Override // p000.C8277Sn1
    /* renamed from: g */
    public J80 mo6785g() {
        if (this.f9785o == null) {
            this.f9785o = J80.m4202c(this.f8002c.getMandatorySystemGestureInsets());
        }
        return this.f9785o;
    }

    @Override // p000.C8277Sn1
    /* renamed from: i */
    public J80 mo6786i() {
        if (this.f9784n == null) {
            this.f9784n = J80.m4202c(this.f8002c.getSystemGestureInsets());
        }
        return this.f9784n;
    }

    @Override // p000.C8277Sn1
    /* renamed from: k */
    public J80 mo6787k() {
        if (this.f9786p == null) {
            this.f9786p = J80.m4202c(this.f8002c.getTappableElementInsets());
        }
        return this.f9786p;
    }

    @Override // p000.AbstractC8017Nn1, p000.C8277Sn1
    /* renamed from: l */
    public C8433Vn1 mo5839l(int i, int i2, int i3, int i4) {
        return C8433Vn1.m8551h(null, this.f8002c.inset(i, i2, i3, i4));
    }

    @Override // p000.C8069On1, p000.C8277Sn1
    /* renamed from: r */
    public void mo6143r(J80 j80) {
    }
}
