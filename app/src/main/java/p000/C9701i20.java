package p000;

/* renamed from: i20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9701i20 extends AbstractC10822qn1 {
    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    public final void mo3126a(InterfaceC1150SH interfaceC1150SH) {
        C1465XH c1465xh = this.f41163h;
        if (c1465xh.f13653c && !c1465xh.f13660j) {
            c1465xh.mo5302d((int) ((((C1465XH) c1465xh.f13662l.get(0)).f13657g * ((C9573h20) this.f41157b).f28169d0) + 0.5f));
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: d */
    public final void mo3127d() {
        C3960dy c3960dy = this.f41157b;
        C9573h20 c9573h20 = (C9573h20) c3960dy;
        int i = c9573h20.f28170e0;
        int i2 = c9573h20.f28171f0;
        int i3 = c9573h20.f28173h0;
        C1465XH c1465xh = this.f41163h;
        if (i3 == 1) {
            if (i != -1) {
                c1465xh.f13662l.add(c3960dy.f26410I.f26434d.f41163h);
                this.f41157b.f26410I.f26434d.f41163h.f13661k.add(c1465xh);
                c1465xh.f13656f = i;
            } else if (i2 != -1) {
                c1465xh.f13662l.add(c3960dy.f26410I.f26434d.f41164i);
                this.f41157b.f26410I.f26434d.f41164i.f13661k.add(c1465xh);
                c1465xh.f13656f = -i2;
            } else {
                c1465xh.f13652b = true;
                c1465xh.f13662l.add(c3960dy.f26410I.f26434d.f41164i);
                this.f41157b.f26410I.f26434d.f41164i.f13661k.add(c1465xh);
            }
            m18933m(this.f41157b.f26434d.f41163h);
            m18933m(this.f41157b.f26434d.f41164i);
            return;
        }
        if (i != -1) {
            c1465xh.f13662l.add(c3960dy.f26410I.f26435e.f41163h);
            this.f41157b.f26410I.f26435e.f41163h.f13661k.add(c1465xh);
            c1465xh.f13656f = i;
        } else if (i2 != -1) {
            c1465xh.f13662l.add(c3960dy.f26410I.f26435e.f41164i);
            this.f41157b.f26410I.f26435e.f41164i.f13661k.add(c1465xh);
            c1465xh.f13656f = -i2;
        } else {
            c1465xh.f13652b = true;
            c1465xh.f13662l.add(c3960dy.f26410I.f26435e.f41164i);
            this.f41157b.f26410I.f26435e.f41164i.f13661k.add(c1465xh);
        }
        m18933m(this.f41157b.f26435e.f41163h);
        m18933m(this.f41157b.f26435e.f41164i);
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: e */
    public final void mo3128e() {
        C3960dy c3960dy = this.f41157b;
        int i = ((C9573h20) c3960dy).f28173h0;
        C1465XH c1465xh = this.f41163h;
        if (i == 1) {
            c3960dy.f26415N = c1465xh.f13657g;
        } else {
            c3960dy.f26416O = c1465xh.f13657g;
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: f */
    public final void mo3129f() {
        this.f41163h.m8963c();
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: k */
    public final boolean mo3130k() {
        return false;
    }

    /* renamed from: m */
    public final void m18933m(C1465XH c1465xh) {
        C1465XH c1465xh2 = this.f41163h;
        c1465xh2.f13661k.add(c1465xh);
        c1465xh.f13662l.add(c1465xh2);
    }
}
