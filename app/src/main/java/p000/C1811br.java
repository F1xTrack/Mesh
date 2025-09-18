package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: br */
/* loaded from: classes.dex */
public final class C1811br extends AbstractC10822qn1 {

    /* renamed from: k */
    public final ArrayList f17187k;

    /* renamed from: l */
    public int f17188l;

    public C1811br(C3960dy c3960dy, int i) {
        C3960dy c3960dy2;
        super(c3960dy);
        this.f17187k = new ArrayList();
        this.f41161f = i;
        C3960dy c3960dy3 = this.f41157b;
        C3960dy c3960dyM17788k = c3960dy3.m17788k(i);
        while (true) {
            C3960dy c3960dy4 = c3960dyM17788k;
            c3960dy2 = c3960dy3;
            c3960dy3 = c3960dy4;
            if (c3960dy3 == null) {
                break;
            } else {
                c3960dyM17788k = c3960dy3.m17788k(this.f41161f);
            }
        }
        this.f41157b = c3960dy2;
        int i2 = this.f41161f;
        InterfaceC1150SH interfaceC1150SH = i2 == 0 ? c3960dy2.f26434d : i2 == 1 ? c3960dy2.f26435e : null;
        ArrayList arrayList = this.f17187k;
        arrayList.add(interfaceC1150SH);
        C3960dy c3960dyM17787j = c3960dy2.m17787j(this.f41161f);
        while (c3960dyM17787j != null) {
            int i3 = this.f41161f;
            arrayList.add(i3 == 0 ? c3960dyM17787j.f26434d : i3 == 1 ? c3960dyM17787j.f26435e : null);
            c3960dyM17787j = c3960dyM17787j.m17787j(this.f41161f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10822qn1 abstractC10822qn1 = (AbstractC10822qn1) it.next();
            int i4 = this.f41161f;
            if (i4 == 0) {
                abstractC10822qn1.f41157b.f26430b = this;
            } else if (i4 == 1) {
                abstractC10822qn1.f41157b.f26432c = this;
            }
        }
        if (this.f41161f == 0 && ((C4023ey) this.f41157b.f26410I).f26972h0 && arrayList.size() > 1) {
            this.f41157b = ((AbstractC10822qn1) AbstractC7222ym.m26228e(1, arrayList)).f41157b;
        }
        this.f17188l = this.f41161f == 0 ? this.f41157b.f26425X : this.f41157b.f26426Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[PHI: r2 r25
  0x01c2: PHI (r2v71 int) = (r2v67 int), (r2v76 int) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r25v1 float) = (r25v0 float), (r25v3 float) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3126a(p000.InterfaceC1150SH r27) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1811br.mo3126a(SH):void");
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: d */
    public final void mo3127d() {
        ArrayList arrayList = this.f17187k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC10822qn1) it.next()).mo3127d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C3960dy c3960dy = ((AbstractC10822qn1) arrayList.get(0)).f41157b;
        C3960dy c3960dy2 = ((AbstractC10822qn1) arrayList.get(size - 1)).f41157b;
        int i = this.f41161f;
        C1465XH c1465xh = this.f41164i;
        C1465XH c1465xh2 = this.f41163h;
        if (i == 0) {
            C0627Jx c0627Jx = c3960dy.f26454x;
            C0627Jx c0627Jx2 = c3960dy2.f26456z;
            C1465XH c1465xhM24066i = AbstractC10822qn1.m24066i(c0627Jx, 0);
            int iM4472c = c0627Jx.m4472c();
            C3960dy c3960dyM10528m = m10528m();
            if (c3960dyM10528m != null) {
                iM4472c = c3960dyM10528m.f26454x.m4472c();
            }
            if (c1465xhM24066i != null) {
                AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24066i, iM4472c);
            }
            C1465XH c1465xhM24066i2 = AbstractC10822qn1.m24066i(c0627Jx2, 0);
            int iM4472c2 = c0627Jx2.m4472c();
            C3960dy c3960dyM10529n = m10529n();
            if (c3960dyM10529n != null) {
                iM4472c2 = c3960dyM10529n.f26456z.m4472c();
            }
            if (c1465xhM24066i2 != null) {
                AbstractC10822qn1.m24064b(c1465xh, c1465xhM24066i2, -iM4472c2);
            }
        } else {
            C0627Jx c0627Jx3 = c3960dy.f26455y;
            C0627Jx c0627Jx4 = c3960dy2.f26402A;
            C1465XH c1465xhM24066i3 = AbstractC10822qn1.m24066i(c0627Jx3, 1);
            int iM4472c3 = c0627Jx3.m4472c();
            C3960dy c3960dyM10528m2 = m10528m();
            if (c3960dyM10528m2 != null) {
                iM4472c3 = c3960dyM10528m2.f26455y.m4472c();
            }
            if (c1465xhM24066i3 != null) {
                AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24066i3, iM4472c3);
            }
            C1465XH c1465xhM24066i4 = AbstractC10822qn1.m24066i(c0627Jx4, 1);
            int iM4472c4 = c0627Jx4.m4472c();
            C3960dy c3960dyM10529n2 = m10529n();
            if (c3960dyM10529n2 != null) {
                iM4472c4 = c3960dyM10529n2.f26402A.m4472c();
            }
            if (c1465xhM24066i4 != null) {
                AbstractC10822qn1.m24064b(c1465xh, c1465xhM24066i4, -iM4472c4);
            }
        }
        c1465xh2.f13651a = this;
        c1465xh.f13651a = this;
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: e */
    public final void mo3128e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17187k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC10822qn1) arrayList.get(i)).mo3128e();
            i++;
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: f */
    public final void mo3129f() {
        this.f41158c = null;
        Iterator it = this.f17187k.iterator();
        while (it.hasNext()) {
            ((AbstractC10822qn1) it.next()).mo3129f();
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: j */
    public final long mo10527j() {
        ArrayList arrayList = this.f17187k;
        int size = arrayList.size();
        long jMo10527j = 0;
        for (int i = 0; i < size; i++) {
            jMo10527j = r5.f41164i.f13656f + ((AbstractC10822qn1) arrayList.get(i)).mo10527j() + jMo10527j + r5.f41163h.f13656f;
        }
        return jMo10527j;
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: k */
    public final boolean mo3130k() {
        ArrayList arrayList = this.f17187k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC10822qn1) arrayList.get(i)).mo3130k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C3960dy m10528m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17187k;
            if (i >= arrayList.size()) {
                return null;
            }
            C3960dy c3960dy = ((AbstractC10822qn1) arrayList.get(i)).f41157b;
            if (c3960dy.f26423V != 8) {
                return c3960dy;
            }
            i++;
        }
    }

    /* renamed from: n */
    public final C3960dy m10529n() {
        ArrayList arrayList = this.f17187k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3960dy c3960dy = ((AbstractC10822qn1) arrayList.get(size)).f41157b;
            if (c3960dy.f26423V != 8) {
                return c3960dy;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f41161f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f17187k.iterator();
        while (it.hasNext()) {
            AbstractC10822qn1 abstractC10822qn1 = (AbstractC10822qn1) it.next();
            strConcat = AbstractC7222ym.m26232i(AbstractC7222ym.m26232i(strConcat, "<") + abstractC10822qn1, "> ");
        }
        return strConcat;
    }
}
