package defpackage;

/* renamed from: i20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4268i20 extends AbstractC6716qn1 {
    @Override // defpackage.SH
    public final void a(SH sh) {
        XH xh = this.h;
        if (xh.c && !xh.j) {
            xh.d((int) ((((XH) xh.l.get(0)).g * ((C4077h20) this.b).d0) + 0.5f));
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void d() {
        C3488dy c3488dy = this.b;
        C4077h20 c4077h20 = (C4077h20) c3488dy;
        int i = c4077h20.e0;
        int i2 = c4077h20.f0;
        int i3 = c4077h20.h0;
        XH xh = this.h;
        if (i3 == 1) {
            if (i != -1) {
                xh.l.add(c3488dy.I.d.h);
                this.b.I.d.h.k.add(xh);
                xh.f = i;
            } else if (i2 != -1) {
                xh.l.add(c3488dy.I.d.i);
                this.b.I.d.i.k.add(xh);
                xh.f = -i2;
            } else {
                xh.b = true;
                xh.l.add(c3488dy.I.d.i);
                this.b.I.d.i.k.add(xh);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            xh.l.add(c3488dy.I.e.h);
            this.b.I.e.h.k.add(xh);
            xh.f = i;
        } else if (i2 != -1) {
            xh.l.add(c3488dy.I.e.i);
            this.b.I.e.i.k.add(xh);
            xh.f = -i2;
        } else {
            xh.b = true;
            xh.l.add(c3488dy.I.e.i);
            this.b.I.e.i.k.add(xh);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.AbstractC6716qn1
    public final void e() {
        C3488dy c3488dy = this.b;
        int i = ((C4077h20) c3488dy).h0;
        XH xh = this.h;
        if (i == 1) {
            c3488dy.N = xh.g;
        } else {
            c3488dy.O = xh.g;
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.AbstractC6716qn1
    public final boolean k() {
        return false;
    }

    public final void m(XH xh) {
        XH xh2 = this.h;
        xh2.k.add(xh);
        xh.l.add(xh2);
    }
}
