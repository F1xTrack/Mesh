package p000;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class W20 extends AbstractC10822qn1 {
    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    public final void mo3126a(InterfaceC1150SH interfaceC1150SH) {
        C0609Jf c0609Jf = (C0609Jf) this.f41157b;
        int i = c0609Jf.f5662f0;
        C1465XH c1465xh = this.f41163h;
        Iterator it = c1465xh.f13662l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1465XH) it.next()).f13657g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1465xh.mo5302d(i3 + c0609Jf.f5664h0);
        } else {
            c1465xh.mo5302d(i2 + c0609Jf.f5664h0);
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: d */
    public final void mo3127d() {
        C3960dy c3960dy = this.f41157b;
        if (c3960dy instanceof C0609Jf) {
            C1465XH c1465xh = this.f41163h;
            c1465xh.f13652b = true;
            C0609Jf c0609Jf = (C0609Jf) c3960dy;
            int i = c0609Jf.f5662f0;
            boolean z = c0609Jf.f5663g0;
            int i2 = 0;
            if (i == 0) {
                c1465xh.f13655e = 4;
                while (i2 < c0609Jf.f13525e0) {
                    C3960dy c3960dy2 = c0609Jf.f13524d0[i2];
                    if (z || c3960dy2.f26423V != 8) {
                        C1465XH c1465xh2 = c3960dy2.f26434d.f41163h;
                        c1465xh2.f13661k.add(c1465xh);
                        c1465xh.f13662l.add(c1465xh2);
                    }
                    i2++;
                }
                m8652m(this.f41157b.f26434d.f41163h);
                m8652m(this.f41157b.f26434d.f41164i);
                return;
            }
            if (i == 1) {
                c1465xh.f13655e = 5;
                while (i2 < c0609Jf.f13525e0) {
                    C3960dy c3960dy3 = c0609Jf.f13524d0[i2];
                    if (z || c3960dy3.f26423V != 8) {
                        C1465XH c1465xh3 = c3960dy3.f26434d.f41164i;
                        c1465xh3.f13661k.add(c1465xh);
                        c1465xh.f13662l.add(c1465xh3);
                    }
                    i2++;
                }
                m8652m(this.f41157b.f26434d.f41163h);
                m8652m(this.f41157b.f26434d.f41164i);
                return;
            }
            if (i == 2) {
                c1465xh.f13655e = 6;
                while (i2 < c0609Jf.f13525e0) {
                    C3960dy c3960dy4 = c0609Jf.f13524d0[i2];
                    if (z || c3960dy4.f26423V != 8) {
                        C1465XH c1465xh4 = c3960dy4.f26435e.f41163h;
                        c1465xh4.f13661k.add(c1465xh);
                        c1465xh.f13662l.add(c1465xh4);
                    }
                    i2++;
                }
                m8652m(this.f41157b.f26435e.f41163h);
                m8652m(this.f41157b.f26435e.f41164i);
                return;
            }
            if (i != 3) {
                return;
            }
            c1465xh.f13655e = 7;
            while (i2 < c0609Jf.f13525e0) {
                C3960dy c3960dy5 = c0609Jf.f13524d0[i2];
                if (z || c3960dy5.f26423V != 8) {
                    C1465XH c1465xh5 = c3960dy5.f26435e.f41164i;
                    c1465xh5.f13661k.add(c1465xh);
                    c1465xh.f13662l.add(c1465xh5);
                }
                i2++;
            }
            m8652m(this.f41157b.f26435e.f41163h);
            m8652m(this.f41157b.f26435e.f41164i);
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: e */
    public final void mo3128e() {
        C3960dy c3960dy = this.f41157b;
        if (c3960dy instanceof C0609Jf) {
            int i = ((C0609Jf) c3960dy).f5662f0;
            C1465XH c1465xh = this.f41163h;
            if (i == 0 || i == 1) {
                c3960dy.f26415N = c1465xh.f13657g;
            } else {
                c3960dy.f26416O = c1465xh.f13657g;
            }
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: f */
    public final void mo3129f() {
        this.f41158c = null;
        this.f41163h.m8963c();
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: k */
    public final boolean mo3130k() {
        return false;
    }

    /* renamed from: m */
    public final void m8652m(C1465XH c1465xh) {
        C1465XH c1465xh2 = this.f41163h;
        c1465xh2.f13661k.add(c1465xh);
        c1465xh.f13662l.add(c1465xh2);
    }
}
