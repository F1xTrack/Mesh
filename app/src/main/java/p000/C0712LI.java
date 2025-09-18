package p000;

import java.util.Set;

/* renamed from: LI */
/* loaded from: classes2.dex */
public final class C0712LI {

    /* renamed from: b */
    public static final Set f6598b = AbstractC11433vZ0.m25454e(EnumC7326Ag0.f326e);

    /* renamed from: c */
    public static final Set f6599c = AbstractC0576J8.m4175F(new EnumC7326Ag0[]{EnumC7326Ag0.f327f, EnumC7326Ag0.f330i});

    /* renamed from: d */
    public static final C10417nd0 f6600d;

    /* renamed from: e */
    public static final C10417nd0 f6601e;

    /* renamed from: a */
    public C7129xI f6602a;

    static {
        new C10417nd0(new int[]{1, 1, 2}, false);
        f6600d = new C10417nd0(new int[]{1, 1, 11}, false);
        f6601e = new C10417nd0(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C1151SI m4942a(p000.AbstractC7364Az0 r12, p000.C11667xP0 r13) {
        /*
            r11 = this;
            java.lang.String r3 = "Could not read data from "
            java.lang.String r0 = "descriptor"
            p000.O90.m5968f(r12, r0)
            java.lang.String r0 = "kotlinClass"
            p000.O90.m5968f(r13, r0)
            je r0 = r13.f45573b
            java.lang.Object r4 = r0.f35301f
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 != 0) goto L18
            java.lang.Object r4 = r0.f35302g
            java.lang.String[] r4 = (java.lang.String[]) r4
        L18:
            r5 = 0
            if (r4 == 0) goto L28
            java.lang.Object r6 = r0.f35299d
            Ag0 r6 = (p000.EnumC7326Ag0) r6
            java.util.Set r7 = p000.C0712LI.f6599c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L28
            goto L29
        L28:
            r4 = r5
        L29:
            if (r4 != 0) goto L2c
            return r5
        L2c:
            java.lang.Object r6 = r0.f35300e
            nd0 r6 = (p000.C10417nd0) r6
            java.lang.Object r0 = r0.f35303h
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L37
            return r5
        L37:
            kotlin.Pair r0 = p000.C7788Jd0.m4377h(r4, r0)     // Catch: java.lang.Throwable -> L3c p000.Y90 -> L3e
            goto L73
        L3c:
            r0 = move-exception
            goto L56
        L3e:
            r0 = move-exception
            r4 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r13.m25849a()     // Catch: java.lang.Throwable -> L3c
            r7.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L56:
            xI r3 = r11.m4944c()
            NV1 r3 = r3.f45520c
            r3.getClass()
            xI r3 = r11.m4944c()
            java.lang.String r4 = "<this>"
            NV1 r3 = r3.f45520c
            p000.O90.m5968f(r3, r4)
            nd0 r3 = p000.C10417nd0.f38414g
            boolean r3 = r6.m23155b(r3)
            if (r3 != 0) goto Lb5
            r0 = r5
        L73:
            if (r0 != 0) goto L76
            return r5
        L76:
            java.lang.Object r3 = r0.f36702a
            r4 = r3
            od0 r4 = (p000.C10545od0) r4
            java.lang.Object r0 = r0.f36703b
            r3 = r0
            mF0 r3 = (p000.C10241mF0) r3
            pd0 r0 = new pd0
            r11.m4945d(r13)
            r11.m4946e(r13)
            II r5 = r11.m4943b(r13)
            r0.<init>(r13, r3, r4, r5)
            SI r10 = new SI
            xI r7 = r11.m4944c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "scope for "
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r5 = " in "
            r1.append(r5)
            r1.append(r12)
            java.lang.String r8 = r1.toString()
            X2 r9 = p000.C1450X2.f13516t
            r1 = r10
            r2 = r12
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        Lb5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0712LI.m4942a(Az0, xP0):SI");
    }

    /* renamed from: b */
    public final EnumC0523II m4943b(C11667xP0 c11667xP0) {
        m4944c().f45520c.getClass();
        int i = c11667xP0.f45573b.f35297b;
        return (((i & 64) != 0) && (i & 32) == 0) ? EnumC0523II.f4881b : ((i & 16) == 0 || (i & 32) != 0) ? EnumC0523II.f4880a : EnumC0523II.f4882c;
    }

    /* renamed from: c */
    public final C7129xI m4944c() {
        C7129xI c7129xI = this.f6602a;
        if (c7129xI != null) {
            return c7129xI;
        }
        O90.m5977o("components");
        throw null;
    }

    /* renamed from: d */
    public final C8686a80 m4945d(C11667xP0 c11667xP0) {
        m4944c().f45520c.getClass();
        C10417nd0 c10417nd0 = (C10417nd0) c11667xP0.f45573b.f35300e;
        O90.m5968f(m4944c().f45520c, "<this>");
        C10417nd0 c10417nd02 = C10417nd0.f38414g;
        if (c10417nd0.m23155b(c10417nd02)) {
            return null;
        }
        C10417nd0 c10417nd03 = (C10417nd0) c11667xP0.f45573b.f35300e;
        O90.m5968f(m4944c().f45520c, "<this>");
        O90.m5968f(m4944c().f45520c, "<this>");
        c10417nd02.getClass();
        C10417nd0 c10417nd04 = c10417nd03.f38416f ? c10417nd02 : C10417nd0.f38415h;
        c10417nd04.getClass();
        int i = c10417nd02.f43217b;
        int i2 = c10417nd04.f43217b;
        return new C8686a80(c10417nd03, c10417nd02, c10417nd02, (i2 <= i && (i2 < i || c10417nd04.f43218c <= c10417nd02.f43218c)) ? c10417nd02 : c10417nd04, c11667xP0.m25849a(), VO0.m8433a(c11667xP0.f45572a));
    }

    /* renamed from: e */
    public final boolean m4946e(C11667xP0 c11667xP0) {
        m4944c().f45520c.getClass();
        m4944c().f45520c.getClass();
        C6250je c6250je = c11667xP0.f45573b;
        return (c6250je.f35297b & 2) != 0 && ((C10417nd0) c6250je.f35300e).equals(f6600d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C6770rs m4947f(p000.C11667xP0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            je r1 = r7.f45573b
            java.lang.Object r2 = r1.f35301f
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.lang.Object r2 = r1.f35302g
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.f35299d
            Ag0 r4 = (p000.EnumC7326Ag0) r4
            java.util.Set r5 = p000.C0712LI.f6598b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            return r3
        L22:
            java.lang.Object r4 = r1.f35300e
            nd0 r4 = (p000.C10417nd0) r4
            java.lang.Object r1 = r1.f35303h
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            return r3
        L2d:
            kotlin.Pair r0 = p000.C7788Jd0.m4375f(r2, r1)     // Catch: java.lang.Throwable -> L32 p000.Y90 -> L34
            goto L68
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.m25849a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            xI r1 = r6.m4944c()
            NV1 r1 = r1.f45520c
            r1.getClass()
            xI r1 = r6.m4944c()
            java.lang.String r2 = "<this>"
            NV1 r1 = r1.f45520c
            p000.O90.m5968f(r1, r2)
            nd0 r1 = p000.C10417nd0.f38414g
            boolean r1 = r4.m23155b(r1)
            if (r1 != 0) goto L88
            r0 = r3
        L68:
            if (r0 != 0) goto L6b
            return r3
        L6b:
            java.lang.Object r1 = r0.f36702a
            od0 r1 = (p000.C10545od0) r1
            java.lang.Object r0 = r0.f36703b
            TE0 r0 = (p000.TE0) r0
            Eg0 r2 = new Eg0
            r6.m4945d(r7)
            r6.m4946e(r7)
            II r3 = r6.m4943b(r7)
            r2.<init>(r7, r3)
            rs r7 = new rs
            r7.<init>(r1, r0, r4, r2)
            return r7
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0712LI.m4947f(xP0):rs");
    }
}
