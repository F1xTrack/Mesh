package p000;

import java.util.Arrays;

/* renamed from: o01 */
/* loaded from: classes2.dex */
public class C10464o01 extends AbstractC1821c1 implements InterfaceC7768It0, InterfaceC6622pW {

    /* renamed from: d */
    public final int f38669d;

    /* renamed from: e */
    public final int f38670e;

    /* renamed from: f */
    public final EnumC6904tj f38671f;

    /* renamed from: g */
    public Object[] f38672g;

    /* renamed from: h */
    public long f38673h;

    /* renamed from: i */
    public long f38674i;

    /* renamed from: j */
    public int f38675j;

    /* renamed from: k */
    public int f38676k;

    public C10464o01(int i, int i2, EnumC6904tj enumC6904tj) {
        this.f38669d = i;
        this.f38670e = i2;
        this.f38671f = enumC6904tj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:75:0x0031, B:92:0x0079, B:94:0x0081, B:98:0x0094, B:101:0x009b, B:102:0x00a1, B:103:0x00a2, B:82:0x004b), top: B:112:0x0020 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c1] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o01] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [rW] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [d1] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [p01] */
    /* JADX WARN: Type inference failed for: r9v8, types: [p01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x00b0 -> B:76:0x0034). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m23295g(p000.C10464o01 r8, p000.InterfaceC6748rW r9, p000.InterfaceC1382Vy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p000.C10336n01
            if (r0 == 0) goto L13
            r0 = r10
            n01 r0 = (p000.C10336n01) r0
            int r1 = r0.f38034g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38034g = r1
            goto L18
        L13:
            n01 r0 = new n01
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f38032e
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f38034g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            Ob0 r8 = r0.f38031d
            p01 r9 = r0.f38030c
            rW r2 = r0.f38029b
            o01 r5 = r0.f38028a
            p000.RQ1.m7017d(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb6
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            Ob0 r8 = r0.f38031d
            p01 r9 = r0.f38030c
            rW r2 = r0.f38029b
            o01 r5 = r0.f38028a
            p000.RQ1.m7017d(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            p01 r9 = r0.f38030c
            rW r8 = r0.f38029b
            o01 r2 = r0.f38028a
            p000.RQ1.m7017d(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb6
        L5e:
            p000.RQ1.m7017d(r10)
            d1 r10 = r8.m10560a()
            p01 r10 = (p000.C10592p01) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            Bz r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb3
            Ev0 r5 = p000.C7564Ev0.f2962e     // Catch: java.lang.Throwable -> Lb3
            zz r2 = r2.mo937g(r5)     // Catch: java.lang.Throwable -> Lb3
            Ob0 r2 = (p000.InterfaceC8044Ob0) r2     // Catch: java.lang.Throwable -> Lb3
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.m23306p(r9)     // Catch: java.lang.Throwable -> L38
            yG r6 = p000.WB1.f13057a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f38028a = r5     // Catch: java.lang.Throwable -> L38
            r0.f38029b = r2     // Catch: java.lang.Throwable -> L38
            r0.f38030c = r9     // Catch: java.lang.Throwable -> L38
            r0.f38031d = r8     // Catch: java.lang.Throwable -> L38
            r0.f38034g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.m23296e(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return
        L92:
            if (r8 == 0) goto La2
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La2
        L9b:
            cc0 r8 = (p000.C9002cc0) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.m10818u()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La2:
            r0.f38028a = r5     // Catch: java.lang.Throwable -> L38
            r0.f38029b = r2     // Catch: java.lang.Throwable -> L38
            r0.f38030c = r9     // Catch: java.lang.Throwable -> L38
            r0.f38031d = r8     // Catch: java.lang.Throwable -> L38
            r0.f38034g = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb6:
            r5.m10561d(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10464o01.m23295g(o01, rW, Vy):void");
    }

    @Override // p000.AbstractC1821c1
    /* renamed from: b */
    public final AbstractC3902d1 mo487b() {
        C10592p01 c10592p01 = new C10592p01();
        c10592p01.f39429a = -1L;
        return c10592p01;
    }

    @Override // p000.AbstractC1821c1
    /* renamed from: c */
    public final AbstractC3902d1[] mo488c() {
        return new C10592p01[2];
    }

    @Override // p000.InterfaceC6622pW
    public final Object collect(InterfaceC6748rW interfaceC6748rW, InterfaceC1382Vy interfaceC1382Vy) throws Throwable {
        m23295g(this, interfaceC6748rW, interfaceC1382Vy);
        return EnumC0817Mz.f7418a;
    }

    /* renamed from: e */
    public final Object m23296e(C10592p01 c10592p01, C10336n01 c10336n01) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(c10336n01));
        c0619Jp.m4439s();
        synchronized (this) {
            if (m23305o(c10592p01) < 0) {
                c10592p01.f39430b = c0619Jp;
            } else {
                c0619Jp.resumeWith(C8313Tf1.f11463a);
            }
        }
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC7768It0, p000.InterfaceC6748rW
    public final Object emit(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        int i;
        boolean z;
        InterfaceC1382Vy[] interfaceC1382VyArrM23301k = AbstractC7247zA.f46694a;
        synchronized (this) {
            if (m23304n(obj)) {
                interfaceC1382VyArrM23301k = m23301k(interfaceC1382VyArrM23301k);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1382Vy interfaceC1382Vy2 : interfaceC1382VyArrM23301k) {
            if (interfaceC1382Vy2 != null) {
                interfaceC1382Vy2.resumeWith(C8313Tf1.f11463a);
            }
        }
        if (z) {
            return C8313Tf1.f11463a;
        }
        Object objM23299i = m23299i(interfaceC1382Vy, obj);
        return objM23299i == EnumC0817Mz.f7418a ? objM23299i : C8313Tf1.f11463a;
    }

    /* renamed from: f */
    public final void m23297f() {
        if (this.f38670e != 0 || this.f38676k > 1) {
            Object[] objArr = this.f38672g;
            O90.m5965c(objArr);
            while (this.f38676k > 0) {
                long jM23302l = m23302l();
                int i = this.f38675j;
                int i2 = this.f38676k;
                if (objArr[((int) ((jM23302l + (i + i2)) - 1)) & (objArr.length - 1)] != WB1.f13057a) {
                    return;
                }
                this.f38676k = i2 - 1;
                WB1.m8706a(objArr, m23302l() + this.f38675j + this.f38676k, null);
            }
        }
    }

    /* renamed from: h */
    public final void m23298h() {
        AbstractC3902d1[] abstractC3902d1Arr;
        Object[] objArr = this.f38672g;
        O90.m5965c(objArr);
        WB1.m8706a(objArr, m23302l(), null);
        this.f38675j--;
        long jM23302l = m23302l() + 1;
        if (this.f38673h < jM23302l) {
            this.f38673h = jM23302l;
        }
        if (this.f38674i < jM23302l) {
            if (this.f17260b != 0 && (abstractC3902d1Arr = this.f17259a) != null) {
                for (AbstractC3902d1 abstractC3902d1 : abstractC3902d1Arr) {
                    if (abstractC3902d1 != null) {
                        C10592p01 c10592p01 = (C10592p01) abstractC3902d1;
                        long j = c10592p01.f39429a;
                        if (j >= 0 && j < jM23302l) {
                            c10592p01.f39429a = jM23302l;
                        }
                    }
                }
            }
            this.f38674i = jM23302l;
        }
    }

    /* renamed from: i */
    public final Object m23299i(InterfaceC1382Vy interfaceC1382Vy, Object obj) {
        C10208m01 c10208m01;
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        InterfaceC1382Vy[] interfaceC1382VyArrM23301k = AbstractC7247zA.f46694a;
        synchronized (this) {
            try {
                if (m23304n(obj)) {
                    c0619Jp.resumeWith(C8313Tf1.f11463a);
                    interfaceC1382VyArrM23301k = m23301k(interfaceC1382VyArrM23301k);
                    c10208m01 = null;
                } else {
                    C10208m01 c10208m012 = new C10208m01(this, this.f38675j + this.f38676k + m23302l(), obj, c0619Jp);
                    m23300j(c10208m012);
                    this.f38676k++;
                    if (this.f38670e == 0) {
                        interfaceC1382VyArrM23301k = m23301k(interfaceC1382VyArrM23301k);
                    }
                    c10208m01 = c10208m012;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c10208m01 != null) {
            c0619Jp.m4442v(new C0052Ap(2, c10208m01));
        }
        for (InterfaceC1382Vy interfaceC1382Vy2 : interfaceC1382VyArrM23301k) {
            if (interfaceC1382Vy2 != null) {
                interfaceC1382Vy2.resumeWith(C8313Tf1.f11463a);
            }
        }
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }

    /* renamed from: j */
    public final void m23300j(Object obj) {
        int i = this.f38675j + this.f38676k;
        Object[] objArrM23303m = this.f38672g;
        if (objArrM23303m == null) {
            objArrM23303m = m23303m(null, 0, 2);
        } else if (i >= objArrM23303m.length) {
            objArrM23303m = m23303m(objArrM23303m, i, objArrM23303m.length * 2);
        }
        WB1.m8706a(objArrM23303m, m23302l() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: k */
    public final InterfaceC1382Vy[] m23301k(InterfaceC1382Vy[] interfaceC1382VyArr) {
        AbstractC3902d1[] abstractC3902d1Arr;
        C10592p01 c10592p01;
        C0619Jp c0619Jp;
        int length = interfaceC1382VyArr.length;
        if (this.f17260b != 0 && (abstractC3902d1Arr = this.f17259a) != null) {
            int length2 = abstractC3902d1Arr.length;
            int i = 0;
            interfaceC1382VyArr = interfaceC1382VyArr;
            while (i < length2) {
                AbstractC3902d1 abstractC3902d1 = abstractC3902d1Arr[i];
                if (abstractC3902d1 != null && (c0619Jp = (c10592p01 = (C10592p01) abstractC3902d1).f39430b) != null && m23305o(c10592p01) >= 0) {
                    int length3 = interfaceC1382VyArr.length;
                    interfaceC1382VyArr = interfaceC1382VyArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC1382VyArr, Math.max(2, interfaceC1382VyArr.length * 2));
                        O90.m5967e(CopyOf, "copyOf(...)");
                        interfaceC1382VyArr = CopyOf;
                    }
                    interfaceC1382VyArr[length] = c0619Jp;
                    c10592p01.f39430b = null;
                    length++;
                }
                i++;
                interfaceC1382VyArr = interfaceC1382VyArr;
            }
        }
        return interfaceC1382VyArr;
    }

    /* renamed from: l */
    public final long m23302l() {
        return Math.min(this.f38674i, this.f38673h);
    }

    /* renamed from: m */
    public final Object[] m23303m(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f38672g = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM23302l = m23302l();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + jM23302l;
            WB1.m8706a(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    /* renamed from: n */
    public final boolean m23304n(Object obj) {
        int i = this.f17260b;
        int i2 = this.f38669d;
        if (i == 0) {
            if (i2 != 0) {
                m23300j(obj);
                int i3 = this.f38675j + 1;
                this.f38675j = i3;
                if (i3 > i2) {
                    m23298h();
                }
                this.f38674i = m23302l() + this.f38675j;
            }
            return true;
        }
        int i4 = this.f38675j;
        int i5 = this.f38670e;
        if (i4 >= i5 && this.f38674i <= this.f38673h) {
            int iOrdinal = this.f38671f.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                throw new C6838sg();
            }
        }
        m23300j(obj);
        int i6 = this.f38675j + 1;
        this.f38675j = i6;
        if (i6 > i5) {
            m23298h();
        }
        long jM23302l = m23302l() + this.f38675j;
        long j = this.f38673h;
        if (((int) (jM23302l - j)) > i2) {
            m23307q(j + 1, this.f38674i, m23302l() + this.f38675j, m23302l() + this.f38675j + this.f38676k);
        }
        return true;
    }

    /* renamed from: o */
    public final long m23305o(C10592p01 c10592p01) {
        long j = c10592p01.f39429a;
        if (j < m23302l() + this.f38675j) {
            return j;
        }
        if (this.f38670e <= 0 && j <= m23302l() && this.f38676k != 0) {
            return j;
        }
        return -1L;
    }

    /* renamed from: p */
    public final Object m23306p(C10592p01 c10592p01) {
        Object obj;
        InterfaceC1382Vy[] interfaceC1382VyArrM23308r = AbstractC7247zA.f46694a;
        synchronized (this) {
            try {
                long jM23305o = m23305o(c10592p01);
                if (jM23305o < 0) {
                    obj = WB1.f13057a;
                } else {
                    long j = c10592p01.f39429a;
                    Object[] objArr = this.f38672g;
                    O90.m5965c(objArr);
                    Object obj2 = objArr[((int) jM23305o) & (objArr.length - 1)];
                    if (obj2 instanceof C10208m01) {
                        obj2 = ((C10208m01) obj2).f37386c;
                    }
                    c10592p01.f39429a = jM23305o + 1;
                    Object obj3 = obj2;
                    interfaceC1382VyArrM23308r = m23308r(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1382Vy interfaceC1382Vy : interfaceC1382VyArrM23308r) {
            if (interfaceC1382Vy != null) {
                interfaceC1382Vy.resumeWith(C8313Tf1.f11463a);
            }
        }
        return obj;
    }

    /* renamed from: q */
    public final void m23307q(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM23302l = m23302l(); jM23302l < jMin; jM23302l++) {
            Object[] objArr = this.f38672g;
            O90.m5965c(objArr);
            WB1.m8706a(objArr, jM23302l, null);
        }
        this.f38673h = j;
        this.f38674i = j2;
        this.f38675j = (int) (j3 - jMin);
        this.f38676k = (int) (j4 - j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC1382Vy[] m23308r(long r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10464o01.m23308r(long):Vy[]");
    }
}
