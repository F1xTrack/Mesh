package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A30 implements InterfaceC3403dV0 {
    public final int a;
    public final E30 b;
    public int c = -1;

    public A30(E30 e30, int i) {
        this.b = e30;
        this.a = i;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() throws IOException {
        int i = this.c;
        E30 e30 = this.b;
        if (i == -2) {
            e30.f();
            throw new C6353ou(AbstractC8235ym.k("Unable to bind a sample queue to TrackGroup with MIME type ", e30.I.a(this.a).d[0].m, "."));
        }
        if (i == -1) {
            e30.D();
        } else if (i != -3) {
            e30.D();
            e30.v[i].y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.YN1.c(r0)
            E30 r0 = r6.b
            r0.f()
            int[] r3 = r0.K
            r3.getClass()
            int[] r3 = r0.K
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.J
            Rb1 r0 = r0.I
            Qb1 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = r0
            goto L3a
        L30:
            boolean[] r0 = r0.N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = r5
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A30.b():void");
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        if (this.c != -3) {
            if (c()) {
                int i = this.c;
                E30 e30 = this.b;
                if (e30.B() || !e30.v[i].w(e30.T)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        if (!c()) {
            return 0;
        }
        int i = this.c;
        E30 e30 = this.b;
        if (e30.B()) {
            return 0;
        }
        D30 d30 = e30.v[i];
        int iT = d30.t(j, e30.T);
        ArrayList arrayList = e30.n;
        Object next = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        C5239j30 c5239j30 = (C5239j30) next;
        if (c5239j30 != null && !c5239j30.K) {
            iT = Math.min(iT, c5239j30.f(i) - d30.r());
        }
        d30.G(iT);
        return iT;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        C6666qX c6666qX;
        C6666qX c6666qX2;
        int iB = -3;
        if (this.c == -3) {
            zd.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            E30 e30 = this.b;
            if (!e30.B()) {
                ArrayList arrayList = e30.n;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((C5239j30) arrayList.get(i4)).k;
                        int length = e30.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (e30.N[i6] && e30.v[i6].A() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    AbstractC0277Dh1.V(arrayList, 0, i4);
                    C5239j30 c5239j30 = (C5239j30) arrayList.get(0);
                    C6666qX c6666qX3 = c5239j30.d;
                    if (c6666qX3.equals(e30.G)) {
                        c6666qX2 = c6666qX3;
                    } else {
                        VY vy = e30.k;
                        Object obj = c5239j30.f;
                        long j = c5239j30.g;
                        int i7 = e30.b;
                        int i8 = c5239j30.e;
                        c6666qX2 = c6666qX3;
                        vy.x(i7, c6666qX3, i8, obj, j);
                    }
                    e30.G = c6666qX2;
                }
                if ((arrayList.isEmpty() || ((C5239j30) arrayList.get(0)).K) && (iB = e30.v[i2].B(n8, zd, i, e30.T)) == -5) {
                    C6666qX c6666qXE = (C6666qX) n8.c;
                    c6666qXE.getClass();
                    if (i2 == e30.B) {
                        int iB2 = AbstractC6955s22.b(e30.v[i2].A());
                        while (i3 < arrayList.size() && ((C5239j30) arrayList.get(i3)).k != iB2) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            c6666qX = ((C5239j30) arrayList.get(i3)).d;
                        } else {
                            c6666qX = e30.F;
                            c6666qX.getClass();
                        }
                        c6666qXE = c6666qXE.e(c6666qX);
                    }
                    n8.c = c6666qXE;
                }
            }
        }
        return iB;
    }
}
