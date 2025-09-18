package p000;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class I11 implements InterfaceC4039fD {

    /* renamed from: i */
    public static final LinkedHashSet f4649i = new LinkedHashSet();

    /* renamed from: j */
    public static final Object f4650j = new Object();

    /* renamed from: a */
    public final C10801qd0 f4651a;

    /* renamed from: b */
    public final InterfaceC1257Tz f4652b;

    /* renamed from: c */
    public final C8342Tu0 f4653c = new C8342Tu0(28, new C11491w11(this, null));

    /* renamed from: d */
    public final String f4654d = ".tmp";

    /* renamed from: e */
    public final F71 f4655e = AbstractC0705LB.m4915b(new C10801qd0(27, this));

    /* renamed from: f */
    public final B41 f4656f = new B41(C7949Mf1.f7295a);

    /* renamed from: g */
    public List f4657g;

    /* renamed from: h */
    public final C10919rY0 f4658h;

    public I11(C10801qd0 c10801qd0, List list, InterfaceC1257Tz interfaceC1257Tz, InterfaceC0754Lz interfaceC0754Lz) {
        this.f4651a = c10801qd0;
        this.f4652b = interfaceC1257Tz;
        this.f4657g = AbstractC7167xu.m25982b0(list);
        this.f4658h = new C10919rY0(interfaceC0754Lz, new C10115lG0(7, this), new C11107t11(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0016  */
    /* JADX WARN: Type inference failed for: r2v10, types: [i71, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [i71, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3722b(p000.I11 r8, p000.C10851r11 r9, p000.AbstractC1571Yy r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3722b(I11, r11, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC4039fD
    /* renamed from: a */
    public final Object mo2067a(Function2 function2, InterfaceC1382Vy interfaceC1382Vy) throws Throwable {
        C6330kv c6330kv = new C6330kv(true);
        c6330kv.m10797C(null);
        this.f4658h.m24403B(new C10851r11(function2, c6330kv, (AbstractC11880z41) this.f4656f.m489e(), interfaceC1382Vy.getContext()));
        Object objM10809k = c6330kv.m10809k(interfaceC1382Vy);
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM10809k;
    }

    /* renamed from: c */
    public final File m3723c() {
        return (File) this.f4655e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3724d(p000.AbstractC1571Yy r13) throws p000.C1194Sz, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3724d(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3725e(p000.AbstractC1571Yy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.B11
            if (r0 == 0) goto L13
            r0 = r5
            B11 r0 = (p000.B11) r0
            int r1 = r0.f521d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f521d = r1
            goto L18
        L13:
            B11 r0 = new B11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f519b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f521d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            I11 r0 = r0.f518a
            p000.RQ1.m7017d(r5)     // Catch: java.lang.Throwable -> L29
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
            p000.RQ1.m7017d(r5)
            r0.f518a = r4     // Catch: java.lang.Throwable -> L46
            r0.f521d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.m3724d(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L41
            return r1
        L41:
            Tf1 r5 = p000.C8313Tf1.f11463a
            return r5
        L44:
            r0 = r4
            goto L48
        L46:
            r5 = move-exception
            goto L44
        L48:
            B41 r0 = r0.f4656f
            nN0 r1 = new nN0
            r1.<init>(r5)
            r0.m490f(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3725e(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3726f(p000.AbstractC1571Yy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.C11
            if (r0 == 0) goto L13
            r0 = r5
            C11 r0 = (p000.C11) r0
            int r1 = r0.f1146d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1146d = r1
            goto L18
        L13:
            C11 r0 = new C11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1144b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f1146d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            I11 r0 = r0.f1143a
            p000.RQ1.m7017d(r5)     // Catch: java.lang.Throwable -> L29
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
            p000.RQ1.m7017d(r5)
            r0.f1143a = r4     // Catch: java.lang.Throwable -> L43
            r0.f1146d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.m3724d(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L4f
            return r1
        L41:
            r0 = r4
            goto L45
        L43:
            r5 = move-exception
            goto L41
        L45:
            B41 r0 = r0.f4656f
            nN0 r1 = new nN0
            r1.<init>(r5)
            r0.m490f(r1)
        L4f:
            Tf1 r5 = p000.C8313Tf1.f11463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3726f(Yy):java.lang.Object");
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
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3727g(p000.AbstractC1571Yy r5) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.D11
            if (r0 == 0) goto L13
            r0 = r5
            D11 r0 = (p000.D11) r0
            int r1 = r0.f1804e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1804e = r1
            goto L18
        L13:
            D11 r0 = new D11
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1802c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f1804e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f1801b
            I11 r0 = r0.f1800a
            p000.RQ1.m7017d(r5)     // Catch: java.lang.Throwable -> L2b
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
            p000.RQ1.m7017d(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L66
            java.io.File r2 = r4.m3723c()     // Catch: java.io.FileNotFoundException -> L66
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L66
            m12 r2 = p000.C10212m12.f37415e     // Catch: java.lang.Throwable -> L5e
            r0.f1800a = r4     // Catch: java.lang.Throwable -> L5e
            r0.f1801b = r5     // Catch: java.lang.Throwable -> L5e
            r0.f1804e = r3     // Catch: java.lang.Throwable -> L5e
            Gt0 r0 = r2.m22633g(r5)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            p000.AbstractC8729aT1.m9749a(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
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
            p000.AbstractC8729aT1.m9749a(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L66:
            r5 = move-exception
            r0 = r4
        L68:
            java.io.File r0 = r0.m3723c()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L78
            Gt0 r5 = new Gt0
            r5.<init>(r3)
            return r5
        L78:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3727g(Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC4039fD
    public final InterfaceC6622pW getData() {
        return this.f4653c;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0086  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3728h(p000.AbstractC1571Yy r8) throws p000.C1194Sz, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.E11
            if (r0 == 0) goto L13
            r0 = r8
            E11 r0 = (p000.E11) r0
            int r1 = r0.f2353e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2353e = r1
            goto L18
        L13:
            E11 r0 = new E11
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2351c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f2353e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f2350b
            java.lang.Object r0 = r0.f2349a
            Sz r0 = (p000.C1194Sz) r0
            p000.RQ1.m7017d(r8)     // Catch: java.io.IOException -> L33
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
            java.lang.Object r2 = r0.f2350b
            Sz r2 = (p000.C1194Sz) r2
            java.lang.Object r4 = r0.f2349a
            I11 r4 = (p000.I11) r4
            p000.RQ1.m7017d(r8)
            goto L79
        L49:
            java.lang.Object r2 = r0.f2349a
            I11 r2 = (p000.I11) r2
            p000.RQ1.m7017d(r8)     // Catch: p000.C1194Sz -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L66
        L53:
            p000.RQ1.m7017d(r8)
            r0.f2349a = r7     // Catch: p000.C1194Sz -> L64
            r0.f2353e = r5     // Catch: p000.C1194Sz -> L64
            java.lang.Object r8 = r7.m3727g(r0)     // Catch: p000.C1194Sz -> L64
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
            Tz r5 = r2.f4652b
            r0.f2349a = r2
            r0.f2350b = r8
            r0.f2353e = r4
            java.lang.Object r4 = r5.mo7832R(r8)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f2349a = r2     // Catch: java.io.IOException -> L8a
            r0.f2350b = r8     // Catch: java.io.IOException -> L8a
            r0.f2353e = r3     // Catch: java.io.IOException -> L8a
            java.lang.Object r0 = r4.m3730j(r8, r0)     // Catch: java.io.IOException -> L8a
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
            p000.I02.m3687a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3728h(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a6  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3729i(kotlin.jvm.functions.Function2 r10, p000.InterfaceC0125Bz r11, p000.AbstractC1571Yy r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p000.F11
            if (r0 == 0) goto L13
            r0 = r12
            F11 r0 = (p000.F11) r0
            int r1 = r0.f3019f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3019f = r1
            goto L18
        L13:
            F11 r0 = new F11
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f3017d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f3019f
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L47
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            java.lang.Object r10 = r0.f3015b
            I11 r11 = r0.f3014a
            p000.RQ1.m7017d(r12)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.f3016c
            java.lang.Object r11 = r0.f3015b
            AC r11 = (p000.C0013AC) r11
            I11 r2 = r0.f3014a
            p000.RQ1.m7017d(r12)
            goto L7a
        L47:
            p000.RQ1.m7017d(r12)
            B41 r12 = r9.f4656f
            java.lang.Object r12 = r12.m489e()
            AC r12 = (p000.C0013AC) r12
            java.lang.Object r2 = r12.f106a
            if (r2 == 0) goto L5b
            int r2 = r2.hashCode()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            int r8 = r12.f107b
            if (r2 != r8) goto Lb7
            G11 r2 = new G11
            java.lang.Object r8 = r12.f106a
            r2.<init>(r10, r8, r5)
            r0.f3014a = r9
            r0.f3015b = r12
            r0.f3016c = r8
            r0.f3019f = r7
            java.lang.Object r10 = p000.AbstractC9366fP1.m18233e(r11, r2, r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            r2 = r9
            r11 = r12
            r12 = r10
            r10 = r8
        L7a:
            java.lang.Object r7 = r11.f106a
            if (r7 == 0) goto L83
            int r7 = r7.hashCode()
            goto L84
        L83:
            r7 = r4
        L84:
            int r11 = r11.f107b
            if (r7 != r11) goto Lb1
            boolean r11 = p000.O90.m5963a(r10, r12)
            if (r11 == 0) goto L8f
            goto Lb0
        L8f:
            r0.f3014a = r2
            r0.f3015b = r12
            r0.f3016c = r5
            r0.f3019f = r6
            java.lang.Object r10 = r2.m3730j(r12, r0)
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r10 = r12
            r11 = r2
        La0:
            B41 r11 = r11.f4656f
            AC r12 = new AC
            if (r10 == 0) goto Laa
            int r4 = r10.hashCode()
        Laa:
            r12.<init>(r4, r10)
            r11.m490f(r12)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3729i(kotlin.jvm.functions.Function2, Bz, Yy):java.lang.Object");
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3730j(java.lang.Object r9, p000.AbstractC1571Yy r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r10 instanceof p000.H11
            if (r1 == 0) goto L15
            r1 = r10
            H11 r1 = (p000.H11) r1
            int r2 = r1.f3995g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3995g = r2
            goto L1a
        L15:
            H11 r1 = new H11
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f3993e
            Mz r2 = p000.EnumC0817Mz.f7418a
            int r3 = r1.f3995g
            Tf1 r4 = p000.C8313Tf1.f11463a
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 != r5) goto L36
            java.io.FileOutputStream r9 = r1.f3992d
            java.io.FileOutputStream r2 = r1.f3991c
            java.io.File r3 = r1.f3990b
            I11 r1 = r1.f3989a
            p000.RQ1.m7017d(r10)     // Catch: java.lang.Throwable -> L33
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
            p000.RQ1.m7017d(r10)
            java.io.File r10 = r8.m3723c()
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
            java.io.File r10 = r8.m3723c()
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.String r6 = r8.f4654d
            java.lang.String r10 = p000.O90.m5976n(r6, r10)
            r3.<init>(r10)
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb8
            r10.<init>(r3)     // Catch: java.io.IOException -> Lb8
            m12 r6 = p000.C10212m12.f37415e     // Catch: java.lang.Throwable -> Lbc
            mj r7 = new mj     // Catch: java.lang.Throwable -> Lbc
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lbc
            r1.f3989a = r8     // Catch: java.lang.Throwable -> Lbc
            r1.f3990b = r3     // Catch: java.lang.Throwable -> Lbc
            r1.f3991c = r10     // Catch: java.lang.Throwable -> Lbc
            r1.f3992d = r10     // Catch: java.lang.Throwable -> Lbc
            r1.f3995g = r5     // Catch: java.lang.Throwable -> Lbc
            r6.m22634i(r9, r7)     // Catch: java.lang.Throwable -> Lbc
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
            p000.AbstractC8729aT1.m9749a(r2, r9)     // Catch: java.io.IOException -> Lb8
            java.io.File r9 = r1.m3723c()     // Catch: java.io.IOException -> Lb8
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
            p000.AbstractC8729aT1.m9749a(r2, r9)     // Catch: java.io.IOException -> Lb8
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
            java.lang.String r10 = p000.O90.m5976n(r10, r0)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I11.m3730j(java.lang.Object, Yy):java.lang.Object");
    }
}
