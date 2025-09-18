package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class I11 implements InterfaceC3729fD {
    public static final LinkedHashSet i = new LinkedHashSet();
    public static final Object j = new Object();
    public final C6685qd0 a;
    public final InterfaceC1576Tz b;
    public final C1562Tu0 c = new C1562Tu0(28, new C7714w11(this, null));
    public final String d = ".tmp";
    public final F71 e = LB.b(new C6685qd0(27, this));
    public final B41 f = new B41(C0972Mf1.a);
    public List g;
    public final C6860rY0 h;

    public I11(C6685qd0 c6685qd0, List list, InterfaceC1576Tz interfaceC1576Tz, InterfaceC0952Lz interfaceC0952Lz) {
        this.a = c6685qd0;
        this.b = interfaceC1576Tz;
        this.g = AbstractC8069xu.b0(list);
        this.h = new C6860rY0(interfaceC0952Lz, new C5661lG0(7, this), new C7141t11(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0016  */
    /* JADX WARN: Type inference failed for: r2v10, types: [i71, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [i71, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.I11 r8, defpackage.C6759r11 r9, defpackage.AbstractC1963Yy r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.b(I11, r11, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3729fD
    public final Object a(Function2 function2, InterfaceC1729Vy interfaceC1729Vy) throws Throwable {
        C5592kv c5592kv = new C5592kv(true);
        c5592kv.C(null);
        this.h.B(new C6759r11(function2, c5592kv, (AbstractC8295z41) this.f.e(), interfaceC1729Vy.getContext()));
        Object objK = c5592kv.k(interfaceC1729Vy);
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objK;
    }

    public final File c() {
        return (File) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.AbstractC1963Yy r13) throws defpackage.C1498Sz, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.d(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.AbstractC1963Yy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.B11
            if (r0 == 0) goto L13
            r0 = r5
            B11 r0 = (defpackage.B11) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            B11 r0 = new B11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            I11 r0 = r0.a
            defpackage.RQ1.d(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.RQ1.d(r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L46
            r0.d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L41
            return r1
        L41:
            Tf1 r5 = defpackage.C1518Tf1.a
            return r5
        L44:
            r0 = r4
            goto L48
        L46:
            r5 = move-exception
            goto L44
        L48:
            B41 r0 = r0.f
            nN0 r1 = new nN0
            r1.<init>(r5)
            r0.f(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.e(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.AbstractC1963Yy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C11
            if (r0 == 0) goto L13
            r0 = r5
            C11 r0 = (defpackage.C11) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            C11 r0 = new C11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            I11 r0 = r0.a
            defpackage.RQ1.d(r5)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.RQ1.d(r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L43
            r0.d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L4f
            return r1
        L41:
            r0 = r4
            goto L45
        L43:
            r5 = move-exception
            goto L41
        L45:
            B41 r0 = r0.f
            nN0 r1 = new nN0
            r1.<init>(r5)
            r0.f(r1)
        L4f:
            Tf1 r5 = defpackage.C1518Tf1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.f(Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [I11] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [D11] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [I11] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.AbstractC1963Yy r5) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.D11
            if (r0 == 0) goto L13
            r0 = r5
            D11 r0 = (defpackage.D11) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            D11 r0 = new D11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.b
            I11 r0 = r0.a
            defpackage.RQ1.d(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.RQ1.d(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            m12 r2 = defpackage.C5806m12.e     // Catch: java.lang.Throwable -> L5e
            r0.a = r4     // Catch: java.lang.Throwable -> L5e
            r0.b = r5     // Catch: java.lang.Throwable -> L5e
            r0.e = r3     // Catch: java.lang.Throwable -> L5e
            Gt0 r0 = r2.g(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            defpackage.AbstractC2141aT1.a(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L68
        L5a:
            r1 = r5
            r5 = r0
            r0 = r4
            goto L60
        L5e:
            r0 = move-exception
            goto L5a
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = move-exception
            defpackage.AbstractC2141aT1.a(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r0 = r0.c()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L78
            Gt0 r5 = new Gt0
            r5.<init>(r3)
            return r5
        L78:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.g(Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3729fD
    public final InterfaceC6472pW getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.AbstractC1963Yy r8) throws defpackage.C1498Sz, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.E11
            if (r0 == 0) goto L13
            r0 = r8
            E11 r0 = (defpackage.E11) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            E11 r0 = new E11
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.b
            java.lang.Object r0 = r0.a
            Sz r0 = (defpackage.C1498Sz) r0
            defpackage.RQ1.d(r8)     // Catch: java.io.IOException -> L33
            goto L87
        L33:
            r8 = move-exception
            goto L8c
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.b
            Sz r2 = (defpackage.C1498Sz) r2
            java.lang.Object r4 = r0.a
            I11 r4 = (defpackage.I11) r4
            defpackage.RQ1.d(r8)
            goto L79
        L49:
            java.lang.Object r2 = r0.a
            I11 r2 = (defpackage.I11) r2
            defpackage.RQ1.d(r8)     // Catch: defpackage.C1498Sz -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L66
        L53:
            defpackage.RQ1.d(r8)
            r0.a = r7     // Catch: defpackage.C1498Sz -> L64
            r0.e = r5     // Catch: defpackage.C1498Sz -> L64
            java.lang.Object r8 = r7.g(r0)     // Catch: defpackage.C1498Sz -> L64
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r2 = r7
            goto L66
        L64:
            r8 = move-exception
            goto L62
        L66:
            Tz r5 = r2.b
            r0.a = r2
            r0.b = r8
            r0.e = r4
            java.lang.Object r4 = r5.R(r8)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.a = r2     // Catch: java.io.IOException -> L8a
            r0.b = r8     // Catch: java.io.IOException -> L8a
            r0.e = r3     // Catch: java.io.IOException -> L8a
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L8a
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r0 = r2
            goto L8c
        L8a:
            r8 = move-exception
            goto L88
        L8c:
            defpackage.I02.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.h(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.jvm.functions.Function2 r10, defpackage.InterfaceC0173Bz r11, defpackage.AbstractC1963Yy r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.F11
            if (r0 == 0) goto L13
            r0 = r12
            F11 r0 = (defpackage.F11) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            F11 r0 = new F11
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L47
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            java.lang.Object r10 = r0.b
            I11 r11 = r0.a
            defpackage.RQ1.d(r12)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.c
            java.lang.Object r11 = r0.b
            AC r11 = (defpackage.AC) r11
            I11 r2 = r0.a
            defpackage.RQ1.d(r12)
            goto L7a
        L47:
            defpackage.RQ1.d(r12)
            B41 r12 = r9.f
            java.lang.Object r12 = r12.e()
            AC r12 = (defpackage.AC) r12
            java.lang.Object r2 = r12.a
            if (r2 == 0) goto L5b
            int r2 = r2.hashCode()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            int r8 = r12.b
            if (r2 != r8) goto Lb7
            G11 r2 = new G11
            java.lang.Object r8 = r12.a
            r2.<init>(r10, r8, r5)
            r0.a = r9
            r0.b = r12
            r0.c = r8
            r0.f = r7
            java.lang.Object r10 = defpackage.AbstractC3767fP1.e(r11, r2, r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            r2 = r9
            r11 = r12
            r12 = r10
            r10 = r8
        L7a:
            java.lang.Object r7 = r11.a
            if (r7 == 0) goto L83
            int r7 = r7.hashCode()
            goto L84
        L83:
            r7 = r4
        L84:
            int r11 = r11.b
            if (r7 != r11) goto Lb1
            boolean r11 = defpackage.O90.a(r10, r12)
            if (r11 == 0) goto L8f
            goto Lb0
        L8f:
            r0.a = r2
            r0.b = r12
            r0.c = r5
            r0.f = r6
            java.lang.Object r10 = r2.j(r12, r0)
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r10 = r12
            r11 = r2
        La0:
            B41 r11 = r11.f
            AC r12 = new AC
            if (r10 == 0) goto Laa
            int r4 = r10.hashCode()
        Laa:
            r12.<init>(r4, r10)
            r11.f(r12)
        Lb0:
            return r10
        Lb1:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        Lb7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.i(kotlin.jvm.functions.Function2, Bz, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r9, defpackage.AbstractC1963Yy r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof defpackage.H11
            if (r1 == 0) goto L15
            r1 = r10
            H11 r1 = (defpackage.H11) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            H11 r1 = new H11
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.e
            Mz r2 = defpackage.EnumC1030Mz.a
            int r3 = r1.g
            Tf1 r4 = defpackage.C1518Tf1.a
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 != r5) goto L36
            java.io.FileOutputStream r9 = r1.d
            java.io.FileOutputStream r2 = r1.c
            java.io.File r3 = r1.b
            I11 r1 = r1.a
            defpackage.RQ1.d(r10)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r9 = move-exception
            goto Lbe
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            defpackage.RQ1.d(r10)
            java.io.File r10 = r8.c()
            java.io.File r3 = r10.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L50
            goto L59
        L50:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lce
        L59:
            java.io.File r3 = new java.io.File
            java.io.File r10 = r8.c()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.d
            java.lang.String r10 = defpackage.O90.n(r6, r10)
            r3.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb8
            r10.<init>(r3)     // Catch: java.io.IOException -> Lb8
            m12 r6 = defpackage.C5806m12.e     // Catch: java.lang.Throwable -> Lbc
            mj r7 = new mj     // Catch: java.lang.Throwable -> Lbc
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lbc
            r1.a = r8     // Catch: java.lang.Throwable -> Lbc
            r1.b = r3     // Catch: java.lang.Throwable -> Lbc
            r1.c = r10     // Catch: java.lang.Throwable -> Lbc
            r1.d = r10     // Catch: java.lang.Throwable -> Lbc
            r1.g = r5     // Catch: java.lang.Throwable -> Lbc
            r6.i(r9, r7)     // Catch: java.lang.Throwable -> Lbc
            if (r4 != r2) goto L88
            return r2
        L88:
            r1 = r8
            r9 = r10
            r2 = r9
        L8b:
            java.io.FileDescriptor r9 = r9.getFD()     // Catch: java.lang.Throwable -> L33
            r9.sync()     // Catch: java.lang.Throwable -> L33
            r9 = 0
            defpackage.AbstractC2141aT1.a(r2, r9)     // Catch: java.io.IOException -> Lb8
            java.io.File r9 = r1.c()     // Catch: java.io.IOException -> Lb8
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lb8
            if (r9 == 0) goto La1
            return r4
        La1:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.io.IOException -> Lb8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb8
            r10.<init>(r0)     // Catch: java.io.IOException -> Lb8
            r10.append(r3)     // Catch: java.io.IOException -> Lb8
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r10.append(r0)     // Catch: java.io.IOException -> Lb8
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lb8
            r9.<init>(r10)     // Catch: java.io.IOException -> Lb8
            throw r9     // Catch: java.io.IOException -> Lb8
        Lb8:
            r9 = move-exception
            goto Lc4
        Lba:
            r2 = r10
            goto Lbe
        Lbc:
            r9 = move-exception
            goto Lba
        Lbe:
            throw r9     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r10 = move-exception
            defpackage.AbstractC2141aT1.a(r2, r9)     // Catch: java.io.IOException -> Lb8
            throw r10     // Catch: java.io.IOException -> Lb8
        Lc4:
            boolean r10 = r3.exists()
            if (r10 == 0) goto Lcd
            r3.delete()
        Lcd:
            throw r9
        Lce:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r10 = defpackage.O90.n(r10, r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I11.j(java.lang.Object, Yy):java.lang.Object");
    }
}
