package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2402br extends AbstractC6716qn1 {
    public final ArrayList k;
    public int l;

    public C2402br(C3488dy c3488dy, int i) {
        C3488dy c3488dy2;
        super(c3488dy);
        this.k = new ArrayList();
        this.f = i;
        C3488dy c3488dy3 = this.b;
        C3488dy c3488dyK = c3488dy3.k(i);
        while (true) {
            C3488dy c3488dy4 = c3488dyK;
            c3488dy2 = c3488dy3;
            c3488dy3 = c3488dy4;
            if (c3488dy3 == null) {
                break;
            } else {
                c3488dyK = c3488dy3.k(this.f);
            }
        }
        this.b = c3488dy2;
        int i2 = this.f;
        SH sh = i2 == 0 ? c3488dy2.d : i2 == 1 ? c3488dy2.e : null;
        ArrayList arrayList = this.k;
        arrayList.add(sh);
        C3488dy c3488dyJ = c3488dy2.j(this.f);
        while (c3488dyJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? c3488dyJ.d : i3 == 1 ? c3488dyJ.e : null);
            c3488dyJ = c3488dyJ.j(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC6716qn1 abstractC6716qn1 = (AbstractC6716qn1) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                abstractC6716qn1.b.b = this;
            } else if (i4 == 1) {
                abstractC6716qn1.b.c = this;
            }
        }
        if (this.f == 0 && ((C3679ey) this.b.I).h0 && arrayList.size() > 1) {
            this.b = ((AbstractC6716qn1) AbstractC8235ym.e(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.X : this.b.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2 A[PHI: r2 r25
  0x01c2: PHI (r2v71 int) = (r2v67 int), (r2v76 int) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r25v1 float) = (r25v0 float), (r25v3 float) binds: [B:120:0x01c0, B:111:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0155  */
    @Override // defpackage.SH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.SH r27) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2402br.a(SH):void");
    }

    @Override // defpackage.AbstractC6716qn1
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC6716qn1) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C3488dy c3488dy = ((AbstractC6716qn1) arrayList.get(0)).b;
        C3488dy c3488dy2 = ((AbstractC6716qn1) arrayList.get(size - 1)).b;
        int i = this.f;
        XH xh = this.i;
        XH xh2 = this.h;
        if (i == 0) {
            C0791Jx c0791Jx = c3488dy.x;
            C0791Jx c0791Jx2 = c3488dy2.z;
            XH xhI = AbstractC6716qn1.i(c0791Jx, 0);
            int iC = c0791Jx.c();
            C3488dy c3488dyM = m();
            if (c3488dyM != null) {
                iC = c3488dyM.x.c();
            }
            if (xhI != null) {
                AbstractC6716qn1.b(xh2, xhI, iC);
            }
            XH xhI2 = AbstractC6716qn1.i(c0791Jx2, 0);
            int iC2 = c0791Jx2.c();
            C3488dy c3488dyN = n();
            if (c3488dyN != null) {
                iC2 = c3488dyN.z.c();
            }
            if (xhI2 != null) {
                AbstractC6716qn1.b(xh, xhI2, -iC2);
            }
        } else {
            C0791Jx c0791Jx3 = c3488dy.y;
            C0791Jx c0791Jx4 = c3488dy2.A;
            XH xhI3 = AbstractC6716qn1.i(c0791Jx3, 1);
            int iC3 = c0791Jx3.c();
            C3488dy c3488dyM2 = m();
            if (c3488dyM2 != null) {
                iC3 = c3488dyM2.y.c();
            }
            if (xhI3 != null) {
                AbstractC6716qn1.b(xh2, xhI3, iC3);
            }
            XH xhI4 = AbstractC6716qn1.i(c0791Jx4, 1);
            int iC4 = c0791Jx4.c();
            C3488dy c3488dyN2 = n();
            if (c3488dyN2 != null) {
                iC4 = c3488dyN2.A.c();
            }
            if (xhI4 != null) {
                AbstractC6716qn1.b(xh, xhI4, -iC4);
            }
        }
        xh2.a = this;
        xh.a = this;
    }

    @Override // defpackage.AbstractC6716qn1
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC6716qn1) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((AbstractC6716qn1) it.next()).f();
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((AbstractC6716qn1) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.AbstractC6716qn1
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC6716qn1) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C3488dy m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            C3488dy c3488dy = ((AbstractC6716qn1) arrayList.get(i)).b;
            if (c3488dy.V != 8) {
                return c3488dy;
            }
            i++;
        }
    }

    public final C3488dy n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3488dy c3488dy = ((AbstractC6716qn1) arrayList.get(size)).b;
            if (c3488dy.V != 8) {
                return c3488dy;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            AbstractC6716qn1 abstractC6716qn1 = (AbstractC6716qn1) it.next();
            strConcat = AbstractC8235ym.i(AbstractC8235ym.i(strConcat, "<") + abstractC6716qn1, "> ");
        }
        return strConcat;
    }
}
