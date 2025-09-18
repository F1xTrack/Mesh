package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class W20 extends AbstractC6716qn1 {
    @Override // defpackage.SH
    public final void a(SH sh) {
        C0737Jf c0737Jf = (C0737Jf) this.b;
        int i = c0737Jf.f0;
        XH xh = this.h;
        Iterator it = xh.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((XH) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            xh.d(i3 + c0737Jf.h0);
        } else {
            xh.d(i2 + c0737Jf.h0);
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void d() {
        C3488dy c3488dy = this.b;
        if (c3488dy instanceof C0737Jf) {
            XH xh = this.h;
            xh.b = true;
            C0737Jf c0737Jf = (C0737Jf) c3488dy;
            int i = c0737Jf.f0;
            boolean z = c0737Jf.g0;
            int i2 = 0;
            if (i == 0) {
                xh.e = 4;
                while (i2 < c0737Jf.e0) {
                    C3488dy c3488dy2 = c0737Jf.d0[i2];
                    if (z || c3488dy2.V != 8) {
                        XH xh2 = c3488dy2.d.h;
                        xh2.k.add(xh);
                        xh.l.add(xh2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                xh.e = 5;
                while (i2 < c0737Jf.e0) {
                    C3488dy c3488dy3 = c0737Jf.d0[i2];
                    if (z || c3488dy3.V != 8) {
                        XH xh3 = c3488dy3.d.i;
                        xh3.k.add(xh);
                        xh.l.add(xh3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                xh.e = 6;
                while (i2 < c0737Jf.e0) {
                    C3488dy c3488dy4 = c0737Jf.d0[i2];
                    if (z || c3488dy4.V != 8) {
                        XH xh4 = c3488dy4.e.h;
                        xh4.k.add(xh);
                        xh.l.add(xh4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            xh.e = 7;
            while (i2 < c0737Jf.e0) {
                C3488dy c3488dy5 = c0737Jf.d0[i2];
                if (z || c3488dy5.V != 8) {
                    XH xh5 = c3488dy5.e.i;
                    xh5.k.add(xh);
                    xh.l.add(xh5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void e() {
        C3488dy c3488dy = this.b;
        if (c3488dy instanceof C0737Jf) {
            int i = ((C0737Jf) c3488dy).f0;
            XH xh = this.h;
            if (i == 0 || i == 1) {
                c3488dy.N = xh.g;
            } else {
                c3488dy.O = xh.g;
            }
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void f() {
        this.c = null;
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
