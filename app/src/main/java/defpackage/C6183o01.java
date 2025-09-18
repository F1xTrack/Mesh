package defpackage;

import java.util.Arrays;

/* renamed from: o01 */
/* loaded from: classes2.dex */
public class C6183o01 extends AbstractC2433c1 implements InterfaceC0702It0, InterfaceC6472pW {
    public final int d;
    public final int e;
    public final EnumC7274tj f;
    public Object[] g;
    public long h;
    public long i;
    public int j;
    public int k;

    public C6183o01(int i, int i2, EnumC7274tj enumC7274tj) {
        this.d = i;
        this.e = i2;
        this.f = enumC7274tj;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(defpackage.C6183o01 r8, defpackage.InterfaceC6853rW r9, defpackage.InterfaceC1729Vy r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.C5992n01
            if (r0 == 0) goto L13
            r0 = r10
            n01 r0 = (defpackage.C5992n01) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            n01 r0 = new n01
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            Ob0 r8 = r0.d
            p01 r9 = r0.c
            rW r2 = r0.b
            o01 r5 = r0.a
            defpackage.RQ1.d(r10)     // Catch: java.lang.Throwable -> L38
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
            Ob0 r8 = r0.d
            p01 r9 = r0.c
            rW r2 = r0.b
            o01 r5 = r0.a
            defpackage.RQ1.d(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            p01 r9 = r0.c
            rW r8 = r0.b
            o01 r2 = r0.a
            defpackage.RQ1.d(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb6
        L5e:
            defpackage.RQ1.d(r10)
            d1 r10 = r8.a()
            p01 r10 = (defpackage.C6374p01) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            Bz r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb3
            Ev0 r5 = defpackage.C0396Ev0.e     // Catch: java.lang.Throwable -> Lb3
            zz r2 = r2.g(r5)     // Catch: java.lang.Throwable -> Lb3
            Ob0 r2 = (defpackage.InterfaceC1115Ob0) r2     // Catch: java.lang.Throwable -> Lb3
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.p(r9)     // Catch: java.lang.Throwable -> L38
            yG r6 = defpackage.WB1.a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.a = r5     // Catch: java.lang.Throwable -> L38
            r0.b = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r9     // Catch: java.lang.Throwable -> L38
            r0.d = r8     // Catch: java.lang.Throwable -> L38
            r0.g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.e(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return
        L92:
            if (r8 == 0) goto La2
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La2
        L9b:
            cc0 r8 = (defpackage.C2548cc0) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.u()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La2:
            r0.a = r5     // Catch: java.lang.Throwable -> L38
            r0.b = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r9     // Catch: java.lang.Throwable -> L38
            r0.d = r8     // Catch: java.lang.Throwable -> L38
            r0.g = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb6:
            r5.d(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6183o01.g(o01, rW, Vy):void");
    }

    @Override // defpackage.AbstractC2433c1
    public final AbstractC3309d1 b() {
        C6374p01 c6374p01 = new C6374p01();
        c6374p01.a = -1L;
        return c6374p01;
    }

    @Override // defpackage.AbstractC2433c1
    public final AbstractC3309d1[] c() {
        return new C6374p01[2];
    }

    @Override // defpackage.InterfaceC6472pW
    public final Object collect(InterfaceC6853rW interfaceC6853rW, InterfaceC1729Vy interfaceC1729Vy) throws Throwable {
        g(this, interfaceC6853rW, interfaceC1729Vy);
        return EnumC1030Mz.a;
    }

    public final Object e(C6374p01 c6374p01, C5992n01 c5992n01) {
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(c5992n01));
        c0767Jp.s();
        synchronized (this) {
            if (o(c6374p01) < 0) {
                c6374p01.b = c0767Jp;
            } else {
                c0767Jp.resumeWith(C1518Tf1.a);
            }
        }
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC0702It0, defpackage.InterfaceC6853rW
    public final Object emit(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        int i;
        boolean z;
        InterfaceC1729Vy[] interfaceC1729VyArrK = AbstractC8311zA.a;
        synchronized (this) {
            if (n(obj)) {
                interfaceC1729VyArrK = k(interfaceC1729VyArrK);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1729Vy interfaceC1729Vy2 : interfaceC1729VyArrK) {
            if (interfaceC1729Vy2 != null) {
                interfaceC1729Vy2.resumeWith(C1518Tf1.a);
            }
        }
        if (z) {
            return C1518Tf1.a;
        }
        Object objI = i(interfaceC1729Vy, obj);
        return objI == EnumC1030Mz.a ? objI : C1518Tf1.a;
    }

    public final void f() {
        if (this.e != 0 || this.k > 1) {
            Object[] objArr = this.g;
            O90.c(objArr);
            while (this.k > 0) {
                long jL = l();
                int i = this.j;
                int i2 = this.k;
                if (objArr[((int) ((jL + (i + i2)) - 1)) & (objArr.length - 1)] != WB1.a) {
                    return;
                }
                this.k = i2 - 1;
                WB1.a(objArr, l() + this.j + this.k, null);
            }
        }
    }

    public final void h() {
        AbstractC3309d1[] abstractC3309d1Arr;
        Object[] objArr = this.g;
        O90.c(objArr);
        WB1.a(objArr, l(), null);
        this.j--;
        long jL = l() + 1;
        if (this.h < jL) {
            this.h = jL;
        }
        if (this.i < jL) {
            if (this.b != 0 && (abstractC3309d1Arr = this.a) != null) {
                for (AbstractC3309d1 abstractC3309d1 : abstractC3309d1Arr) {
                    if (abstractC3309d1 != null) {
                        C6374p01 c6374p01 = (C6374p01) abstractC3309d1;
                        long j = c6374p01.a;
                        if (j >= 0 && j < jL) {
                            c6374p01.a = jL;
                        }
                    }
                }
            }
            this.i = jL;
        }
    }

    public final Object i(InterfaceC1729Vy interfaceC1729Vy, Object obj) {
        C5801m01 c5801m01;
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy));
        c0767Jp.s();
        InterfaceC1729Vy[] interfaceC1729VyArrK = AbstractC8311zA.a;
        synchronized (this) {
            try {
                if (n(obj)) {
                    c0767Jp.resumeWith(C1518Tf1.a);
                    interfaceC1729VyArrK = k(interfaceC1729VyArrK);
                    c5801m01 = null;
                } else {
                    C5801m01 c5801m012 = new C5801m01(this, this.j + this.k + l(), obj, c0767Jp);
                    j(c5801m012);
                    this.k++;
                    if (this.e == 0) {
                        interfaceC1729VyArrK = k(interfaceC1729VyArrK);
                    }
                    c5801m01 = c5801m012;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5801m01 != null) {
            c0767Jp.v(new C0065Ap(2, c5801m01));
        }
        for (InterfaceC1729Vy interfaceC1729Vy2 : interfaceC1729VyArrK) {
            if (interfaceC1729Vy2 != null) {
                interfaceC1729Vy2.resumeWith(C1518Tf1.a);
            }
        }
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }

    public final void j(Object obj) {
        int i = this.j + this.k;
        Object[] objArrM = this.g;
        if (objArrM == null) {
            objArrM = m(null, 0, 2);
        } else if (i >= objArrM.length) {
            objArrM = m(objArrM, i, objArrM.length * 2);
        }
        WB1.a(objArrM, l() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC1729Vy[] k(InterfaceC1729Vy[] interfaceC1729VyArr) {
        AbstractC3309d1[] abstractC3309d1Arr;
        C6374p01 c6374p01;
        C0767Jp c0767Jp;
        int length = interfaceC1729VyArr.length;
        if (this.b != 0 && (abstractC3309d1Arr = this.a) != null) {
            int length2 = abstractC3309d1Arr.length;
            int i = 0;
            interfaceC1729VyArr = interfaceC1729VyArr;
            while (i < length2) {
                AbstractC3309d1 abstractC3309d1 = abstractC3309d1Arr[i];
                if (abstractC3309d1 != null && (c0767Jp = (c6374p01 = (C6374p01) abstractC3309d1).b) != null && o(c6374p01) >= 0) {
                    int length3 = interfaceC1729VyArr.length;
                    interfaceC1729VyArr = interfaceC1729VyArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC1729VyArr, Math.max(2, interfaceC1729VyArr.length * 2));
                        O90.e(CopyOf, "copyOf(...)");
                        interfaceC1729VyArr = CopyOf;
                    }
                    interfaceC1729VyArr[length] = c0767Jp;
                    c6374p01.b = null;
                    length++;
                }
                i++;
                interfaceC1729VyArr = interfaceC1729VyArr;
            }
        }
        return interfaceC1729VyArr;
    }

    public final long l() {
        return Math.min(this.i, this.h);
    }

    public final Object[] m(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.g = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jL = l();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + jL;
            WB1.a(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean n(Object obj) {
        int i = this.b;
        int i2 = this.d;
        if (i == 0) {
            if (i2 != 0) {
                j(obj);
                int i3 = this.j + 1;
                this.j = i3;
                if (i3 > i2) {
                    h();
                }
                this.i = l() + this.j;
            }
            return true;
        }
        int i4 = this.j;
        int i5 = this.e;
        if (i4 >= i5 && this.i <= this.h) {
            int iOrdinal = this.f.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                throw new C7074sg();
            }
        }
        j(obj);
        int i6 = this.j + 1;
        this.j = i6;
        if (i6 > i5) {
            h();
        }
        long jL = l() + this.j;
        long j = this.h;
        if (((int) (jL - j)) > i2) {
            q(j + 1, this.i, l() + this.j, l() + this.j + this.k);
        }
        return true;
    }

    public final long o(C6374p01 c6374p01) {
        long j = c6374p01.a;
        if (j < l() + this.j) {
            return j;
        }
        if (this.e <= 0 && j <= l() && this.k != 0) {
            return j;
        }
        return -1L;
    }

    public final Object p(C6374p01 c6374p01) {
        Object obj;
        InterfaceC1729Vy[] interfaceC1729VyArrR = AbstractC8311zA.a;
        synchronized (this) {
            try {
                long jO = o(c6374p01);
                if (jO < 0) {
                    obj = WB1.a;
                } else {
                    long j = c6374p01.a;
                    Object[] objArr = this.g;
                    O90.c(objArr);
                    Object obj2 = objArr[((int) jO) & (objArr.length - 1)];
                    if (obj2 instanceof C5801m01) {
                        obj2 = ((C5801m01) obj2).c;
                    }
                    c6374p01.a = jO + 1;
                    Object obj3 = obj2;
                    interfaceC1729VyArrR = r(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1729Vy interfaceC1729Vy : interfaceC1729VyArrR) {
            if (interfaceC1729Vy != null) {
                interfaceC1729Vy.resumeWith(C1518Tf1.a);
            }
        }
        return obj;
    }

    public final void q(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jL = l(); jL < jMin; jL++) {
            Object[] objArr = this.g;
            O90.c(objArr);
            WB1.a(objArr, jL, null);
        }
        this.h = j;
        this.i = j2;
        this.j = (int) (j3 - jMin);
        this.k = (int) (j4 - j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC1729Vy[] r(long r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6183o01.r(long):Vy[]");
    }
}
