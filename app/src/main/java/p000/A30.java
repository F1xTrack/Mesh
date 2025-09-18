package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A30 implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final int f31a;

    /* renamed from: b */
    public final E30 f32b;

    /* renamed from: c */
    public int f33c = -1;

    public A30(E30 e30, int i) {
        this.f32b = e30;
        this.f31a = i;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() throws IOException {
        int i = this.f33c;
        E30 e30 = this.f32b;
        if (i == -2) {
            e30.m1999f();
            throw new C6583ou(AbstractC7222ym.m26234k("Unable to bind a sample queue to TrackGroup with MIME type ", e30.f2401I.m7046a(this.f31a).f9690d[0].f40974m, "."));
        }
        if (i == -1) {
            e30.m1993D();
        } else if (i != -3) {
            e30.m1993D();
            e30.f2438v[i].m10739y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35b() {
        /*
            r6 = this;
            int r0 = r6.f33c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            p000.YN1.m9278c(r0)
            E30 r0 = r6.f32b
            r0.m1999f()
            int[] r3 = r0.f2403K
            r3.getClass()
            int[] r3 = r0.f2403K
            int r4 = r6.f31a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.f2402J
            Rb1 r0 = r0.f2401I
            Qb1 r0 = r0.m7046a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = r0
            goto L3a
        L30:
            boolean[] r0 = r0.f2406N
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = r5
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.f33c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.A30.m35b():void");
    }

    /* renamed from: c */
    public final boolean m36c() {
        int i = this.f33c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        if (this.f33c != -3) {
            if (m36c()) {
                int i = this.f33c;
                E30 e30 = this.f32b;
                if (e30.m1991B() || !e30.f2438v[i].m10737w(e30.f2412T)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        if (!m36c()) {
            return 0;
        }
        int i = this.f33c;
        E30 e30 = this.f32b;
        if (e30.m1991B()) {
            return 0;
        }
        D30 d30 = e30.f2438v[i];
        int iM10734t = d30.m10734t(j, e30.f2412T);
        ArrayList arrayList = e30.f2430n;
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
        C9832j30 c9832j30 = (C9832j30) next;
        if (c9832j30 != null && !c9832j30.f34877K) {
            iM10734t = Math.min(iM10734t, c9832j30.m21973f(i) - d30.m10732r());
        }
        d30.m10721G(iM10734t);
        return iM10734t;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        C6686qX c6686qX;
        C6686qX c6686qX2;
        int iM10716B = -3;
        if (this.f33c == -3) {
            c1587zd.m2498a(4);
            return -4;
        }
        if (m36c()) {
            int i2 = this.f33c;
            E30 e30 = this.f32b;
            if (!e30.m1991B()) {
                ArrayList arrayList = e30.f2430n;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((C9832j30) arrayList.get(i4)).f34878k;
                        int length = e30.f2438v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (e30.f2406N[i6] && e30.f2438v[i6].m10715A() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    AbstractC7485Dh1.m1807V(arrayList, 0, i4);
                    C9832j30 c9832j30 = (C9832j30) arrayList.get(0);
                    C6686qX c6686qX3 = c9832j30.f9814d;
                    if (c6686qX3.equals(e30.f2399G)) {
                        c6686qX2 = c6686qX3;
                    } else {
                        C1356VY c1356vy = e30.f2427k;
                        Object obj = c9832j30.f9816f;
                        long j = c9832j30.f9817g;
                        int i7 = e30.f2418b;
                        int i8 = c9832j30.f9815e;
                        c6686qX2 = c6686qX3;
                        c1356vy.m8504x(i7, c6686qX3, i8, obj, j);
                    }
                    e30.f2399G = c6686qX2;
                }
                if ((arrayList.isEmpty() || ((C9832j30) arrayList.get(0)).f34877K) && (iM10716B = e30.f2438v[i2].m10716B(c0827n8, c1587zd, i, e30.f2412T)) == -5) {
                    C6686qX c6686qXM24023e = (C6686qX) c0827n8.f7524c;
                    c6686qXM24023e.getClass();
                    if (i2 == e30.f2394B) {
                        int iM24580b = AbstractC10983s22.m24580b(e30.f2438v[i2].m10715A());
                        while (i3 < arrayList.size() && ((C9832j30) arrayList.get(i3)).f34878k != iM24580b) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            c6686qX = ((C9832j30) arrayList.get(i3)).f9814d;
                        } else {
                            c6686qX = e30.f2398F;
                            c6686qX.getClass();
                        }
                        c6686qXM24023e = c6686qXM24023e.m24023e(c6686qX);
                    }
                    c0827n8.f7524c = c6686qXM24023e;
                }
            }
        }
        return iM10716B;
    }
}
