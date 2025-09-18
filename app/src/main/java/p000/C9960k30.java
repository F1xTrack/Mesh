package p000;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9960k30 implements InterfaceC11973zp0, InterfaceC11877z30 {

    /* renamed from: a */
    public final C0142CF f36250a;

    /* renamed from: b */
    public final C0331FF f36251b;

    /* renamed from: c */
    public final C7391Bm1 f36252c;

    /* renamed from: d */
    public final InterfaceC9648hc1 f36253d;

    /* renamed from: e */
    public final C22 f36254e;

    /* renamed from: f */
    public final InterfaceC1091RL f36255f;

    /* renamed from: g */
    public final C0903OL f36256g;

    /* renamed from: h */
    public final C3979eG f36257h;

    /* renamed from: i */
    public final C1356VY f36258i;

    /* renamed from: j */
    public final C6224jE f36259j;

    /* renamed from: k */
    public final IdentityHashMap f36260k;

    /* renamed from: l */
    public final C10339n11 f36261l;

    /* renamed from: m */
    public final C6914tt f36262m;

    /* renamed from: n */
    public final boolean f36263n;

    /* renamed from: o */
    public final int f36264o;

    /* renamed from: p */
    public final NB0 f36265p;

    /* renamed from: q */
    public final C8170Qm0 f36266q = new C8170Qm0(20, this);

    /* renamed from: r */
    public InterfaceC11846yp0 f36267r;

    /* renamed from: s */
    public int f36268s;

    /* renamed from: t */
    public C8201Rb1 f36269t;

    /* renamed from: u */
    public E30[] f36270u;

    /* renamed from: v */
    public E30[] f36271v;

    /* renamed from: w */
    public int f36272w;

    /* renamed from: x */
    public C1568Yv f36273x;

    public C9960k30(C0142CF c0142cf, C0331FF c0331ff, C7391Bm1 c7391Bm1, InterfaceC9648hc1 interfaceC9648hc1, C22 c22, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy, C6224jE c6224jE, C6914tt c6914tt, boolean z, int i, NB0 nb0) {
        this.f36250a = c0142cf;
        this.f36251b = c0331ff;
        this.f36252c = c7391Bm1;
        this.f36253d = interfaceC9648hc1;
        this.f36254e = c22;
        this.f36255f = interfaceC1091RL;
        this.f36256g = c0903ol;
        this.f36257h = c3979eG;
        this.f36258i = c1356vy;
        this.f36259j = c6224jE;
        this.f36262m = c6914tt;
        this.f36263n = z;
        this.f36264o = i;
        this.f36265p = nb0;
        c6914tt.getClass();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        this.f36273x = new C1568Yv(c9367fQ0, c9367fQ0);
        this.f36260k = new IdentityHashMap();
        this.f36261l = new C10339n11(3);
        this.f36270u = new E30[0];
        this.f36271v = new E30[0];
    }

    /* renamed from: j */
    public static C6686qX m22142j(C6686qX c6686qX, C6686qX c6686qX2, boolean z) {
        C7660Gr0 c7660Gr0;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        P70 p70;
        N70 n70 = P70.f8867b;
        P70 p702 = C9367fQ0.f27184e;
        if (c6686qX2 != null) {
            str3 = c6686qX2.f40971j;
            c7660Gr0 = c6686qX2.f40972k;
            i2 = c6686qX2.f40951A;
            i = c6686qX2.f40966e;
            i3 = c6686qX2.f40967f;
            str = c6686qX2.f40965d;
            str2 = c6686qX2.f40963b;
            p70 = c6686qX2.f40964c;
        } else {
            String strM1835t = AbstractC7485Dh1.m1835t(1, c6686qX.f40971j);
            c7660Gr0 = c6686qX.f40972k;
            if (z) {
                i2 = c6686qX.f40951A;
                i = c6686qX.f40966e;
                i3 = c6686qX.f40967f;
                str = c6686qX.f40965d;
                str2 = c6686qX.f40963b;
                p702 = c6686qX.f40964c;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            P70 p703 = p702;
            str3 = strM1835t;
            p70 = p703;
        }
        String strM9161d = AbstractC8544Xr0.m9161d(str3);
        int i4 = z ? c6686qX.f40968g : -1;
        int i5 = z ? c6686qX.f40969h : -1;
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40150a = c6686qX.f40962a;
        c6623pX.f40151b = str2;
        c6623pX.f40152c = P70.m6234u(p70);
        c6623pX.f40160k = AbstractC8544Xr0.m9171n(c6686qX.f40973l);
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(strM9161d);
        c6623pX.f40158i = str3;
        c6623pX.f40159j = c7660Gr0;
        c6623pX.f40156g = i4;
        c6623pX.f40157h = i5;
        c6623pX.f40175z = i2;
        c6623pX.f40154e = i;
        c6623pX.f40155f = i3;
        c6623pX.f40153d = str;
        return new C6686qX(c6623pX);
    }

    @Override // p000.InterfaceC11877z30
    /* renamed from: a */
    public final void mo1601a() {
        for (E30 e30 : this.f36270u) {
            ArrayList arrayList = e30.f2430n;
            if (!arrayList.isEmpty()) {
                C9832j30 c9832j30 = (C9832j30) AbstractC11239u22.m25079b(arrayList);
                int iM18708b = e30.f2420d.m18708b(c9832j30);
                if (iM18708b == 1) {
                    c9832j30.f34877K = true;
                } else if (iM18708b == 0) {
                    e30.f2434r.post(new RunnableC1096RQ(e30, 7, c9832j30));
                } else if (iM18708b == 2 && !e30.f2412T) {
                    C8539Xo1 c8539Xo1 = e30.f2426j;
                    if (c8539Xo1.m9127I()) {
                        c8539Xo1.m9147p();
                    }
                }
            }
        }
        this.f36267r.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        E30[] e30Arr = this.f36271v;
        int length = e30Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            E30 e30 = e30Arr[i];
            if (e30.f2393A == 2) {
                C9576h30 c9576h30 = e30.f2420d;
                int iMo6374e = c9576h30.f28201r.mo6374e();
                Uri[] uriArr = c9576h30.f28188e;
                int length2 = uriArr.length;
                C0331FF c0331ff = c9576h30.f28190g;
                C10728q30 c10728q30M2560a = (iMo6374e >= length2 || iMo6374e == -1) ? null : c0331ff.m2560a(true, uriArr[c9576h30.f28201r.mo2731l()]);
                if (c10728q30M2560a != null) {
                    P70 p70 = c10728q30M2560a.f40554r;
                    if (!p70.isEmpty() && c10728q30M2560a.f44121c) {
                        long j2 = c10728q30M2560a.f40544h - c0331ff.f3110n;
                        long j3 = j - j2;
                        int iM1818d = AbstractC7485Dh1.m1818d(p70, Long.valueOf(j3), true);
                        long j4 = ((C10344n30) p70.get(iM1818d)).f38739e;
                        return dx0.m1724a(j3, j4, iM1818d != p70.size() - 1 ? ((C10344n30) p70.get(iM1818d + 1)).f38739e : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[SYNTHETIC] */
    @Override // p000.InterfaceC11877z30
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1602c(android.net.Uri r17, p000.C0986Pf r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            E30[] r2 = r0.f36270u
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            h30 r9 = r8.f2420d
            android.net.Uri[] r10 = r9.f28188e
            boolean r11 = p000.AbstractC7485Dh1.m1827l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            jR r13 = r9.f28201r
            ek0 r13 = p000.RY1.m7033a(r13)
            eG r8 = r8.f2425i
            r8.getClass()
            r8 = r18
            fk0 r13 = p000.C3979eG.m17890c(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.f27363a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.f27364b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = r4
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            jR r5 = r9.f28201r
            int r5 = r5.mo2737t(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.f28203t
            android.net.Uri r10 = r9.f28199p
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.f28203t = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            jR r4 = r9.f28201r
            boolean r4 = r4.mo2733o(r5, r13)
            if (r4 == 0) goto L91
            FF r4 = r9.f28190g
            java.util.HashMap r4 = r4.f3100d
            java.lang.Object r4 = r4.get(r1)
            EF r4 = (p000.C0268EF) r4
            if (r4 == 0) goto L8c
            boolean r4 = p000.C0268EF.m2100a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = r5
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = r5
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            yp0 r1 = r0.f36267r
            r1.mo1885m(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9960k30.mo1602c(android.net.Uri, Pf, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1879d(p000.InterfaceC6237jR[] r37, boolean[] r38, p000.InterfaceC9121dV0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9960k30.mo1879d(jR[], boolean[], dV0[], boolean[], long):long");
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return this.f36273x.mo1880e();
    }

    /* renamed from: f */
    public final E30 m22143f(String str, int i, Uri[] uriArr, C6686qX[] c6686qXArr, C6686qX c6686qX, List list, Map map, long j) {
        C9576h30 c9576h30 = new C9576h30(this.f36250a, this.f36251b, uriArr, c6686qXArr, this.f36252c, this.f36253d, this.f36261l, list, this.f36265p, this.f36254e);
        C1356VY c1356vy = this.f36258i;
        return new E30(str, i, this.f36266q, c9576h30, map, this.f36259j, j, c6686qX, this.f36255f, this.f36256g, this.f36257h, c1356vy, this.f36264o);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() throws IOException {
        for (E30 e30 : this.f36270u) {
            e30.m1993D();
            if (e30.f2412T && !e30.f2396D) {
                throw C10103lA0.m22366a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        E30[] e30Arr = this.f36271v;
        if (e30Arr.length > 0) {
            boolean zM1996G = e30Arr[0].m1996G(j, false);
            int i = 1;
            while (true) {
                E30[] e30Arr2 = this.f36271v;
                if (i >= e30Arr2.length) {
                    break;
                }
                e30Arr2[i].m1996G(j, zM1996G);
                i++;
            }
            if (zM1996G) {
                ((SparseArray) this.f36261l.f38046b).clear();
            }
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        for (E30 e30 : this.f36271v) {
            if (e30.f2395C && !e30.m1991B()) {
                int length = e30.f2438v.length;
                for (int i = 0; i < length; i++) {
                    e30.f2438v[i].m10724i(j, e30.f2406N[i]);
                }
            }
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f36273x.mo1884l();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1887o(p000.InterfaceC11846yp0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9960k30.mo1887o(yp0, long):void");
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        C8201Rb1 c8201Rb1 = this.f36269t;
        c8201Rb1.getClass();
        return c8201Rb1;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        if (this.f36269t != null) {
            return this.f36273x.mo1889r(c11455vk0);
        }
        for (E30 e30 : this.f36270u) {
            if (!e30.f2396D) {
                C11327uk0 c11327uk0 = new C11327uk0();
                c11327uk0.f43840a = e30.f2408P;
                e30.mo1889r(new C11455vk0(c11327uk0));
            }
        }
        return false;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        return this.f36273x.mo1890s();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f36273x.mo1891t(j);
    }
}
