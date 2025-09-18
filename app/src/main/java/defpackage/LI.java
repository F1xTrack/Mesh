package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class LI {
    public static final Set b = AbstractC7627vZ0.e(EnumC0039Ag0.e);
    public static final Set c = J8.F(new EnumC0039Ag0[]{EnumC0039Ag0.f, EnumC0039Ag0.i});
    public static final C6112nd0 d;
    public static final C6112nd0 e;
    public C7955xI a;

    static {
        new C6112nd0(new int[]{1, 1, 2}, false);
        d = new C6112nd0(new int[]{1, 1, 11}, false);
        e = new C6112nd0(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.SI a(defpackage.AbstractC0096Az0 r12, defpackage.C7977xP0 r13) {
        /*
            r11 = this;
            java.lang.String r3 = "Could not read data from "
            java.lang.String r0 = "descriptor"
            defpackage.O90.f(r12, r0)
            java.lang.String r0 = "kotlinClass"
            defpackage.O90.f(r13, r0)
            je r0 = r13.b
            java.lang.Object r4 = r0.f
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 != 0) goto L18
            java.lang.Object r4 = r0.g
            java.lang.String[] r4 = (java.lang.String[]) r4
        L18:
            r5 = 0
            if (r4 == 0) goto L28
            java.lang.Object r6 = r0.d
            Ag0 r6 = (defpackage.EnumC0039Ag0) r6
            java.util.Set r7 = defpackage.LI.c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L28
            goto L29
        L28:
            r4 = r5
        L29:
            if (r4 != 0) goto L2c
            return r5
        L2c:
            java.lang.Object r6 = r0.e
            nd0 r6 = (defpackage.C6112nd0) r6
            java.lang.Object r0 = r0.h
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L37
            return r5
        L37:
            kotlin.Pair r0 = defpackage.C0732Jd0.h(r4, r0)     // Catch: java.lang.Throwable -> L3c defpackage.Y90 -> L3e
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
            java.lang.String r3 = r13.a()     // Catch: java.lang.Throwable -> L3c
            r7.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L56:
            xI r3 = r11.c()
            NV1 r3 = r3.c
            r3.getClass()
            xI r3 = r11.c()
            java.lang.String r4 = "<this>"
            NV1 r3 = r3.c
            defpackage.O90.f(r3, r4)
            nd0 r3 = defpackage.C6112nd0.g
            boolean r3 = r6.b(r3)
            if (r3 != 0) goto Lb5
            r0 = r5
        L73:
            if (r0 != 0) goto L76
            return r5
        L76:
            java.lang.Object r3 = r0.a
            r4 = r3
            od0 r4 = (defpackage.C6303od0) r4
            java.lang.Object r0 = r0.b
            r3 = r0
            mF0 r3 = (defpackage.C5849mF0) r3
            pd0 r0 = new pd0
            r11.d(r13)
            r11.e(r13)
            II r5 = r11.b(r13)
            r0.<init>(r13, r3, r4, r5)
            SI r10 = new SI
            xI r7 = r11.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "scope for "
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r5 = " in "
            r1.append(r5)
            r1.append(r12)
            java.lang.String r8 = r1.toString()
            X2 r9 = defpackage.X2.t
            r1 = r10
            r2 = r12
            r5 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        Lb5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LI.a(Az0, xP0):SI");
    }

    public final II b(C7977xP0 c7977xP0) {
        c().c.getClass();
        int i = c7977xP0.b.b;
        return (((i & 64) != 0) && (i & 32) == 0) ? II.b : ((i & 16) == 0 || (i & 32) != 0) ? II.a : II.c;
    }

    public final C7955xI c() {
        C7955xI c7955xI = this.a;
        if (c7955xI != null) {
            return c7955xI;
        }
        O90.o("components");
        throw null;
    }

    public final C2077a80 d(C7977xP0 c7977xP0) {
        c().c.getClass();
        C6112nd0 c6112nd0 = (C6112nd0) c7977xP0.b.e;
        O90.f(c().c, "<this>");
        C6112nd0 c6112nd02 = C6112nd0.g;
        if (c6112nd0.b(c6112nd02)) {
            return null;
        }
        C6112nd0 c6112nd03 = (C6112nd0) c7977xP0.b.e;
        O90.f(c().c, "<this>");
        O90.f(c().c, "<this>");
        c6112nd02.getClass();
        C6112nd0 c6112nd04 = c6112nd03.f ? c6112nd02 : C6112nd0.h;
        c6112nd04.getClass();
        int i = c6112nd02.b;
        int i2 = c6112nd04.b;
        return new C2077a80(c6112nd03, c6112nd02, c6112nd02, (i2 <= i && (i2 < i || c6112nd04.c <= c6112nd02.c)) ? c6112nd02 : c6112nd04, c7977xP0.a(), VO0.a(c7977xP0.a));
    }

    public final boolean e(C7977xP0 c7977xP0) {
        c().c.getClass();
        c().c.getClass();
        C5350je c5350je = c7977xP0.b;
        return (c5350je.b & 2) != 0 && ((C6112nd0) c5350je.e).equals(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6919rs f(defpackage.C7977xP0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            je r1 = r7.b
            java.lang.Object r2 = r1.f
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.lang.Object r2 = r1.g
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.d
            Ag0 r4 = (defpackage.EnumC0039Ag0) r4
            java.util.Set r5 = defpackage.LI.b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            return r3
        L22:
            java.lang.Object r4 = r1.e
            nd0 r4 = (defpackage.C6112nd0) r4
            java.lang.Object r1 = r1.h
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            return r3
        L2d:
            kotlin.Pair r0 = defpackage.C0732Jd0.f(r2, r1)     // Catch: java.lang.Throwable -> L32 defpackage.Y90 -> L34
            goto L68
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            xI r1 = r6.c()
            NV1 r1 = r1.c
            r1.getClass()
            xI r1 = r6.c()
            java.lang.String r2 = "<this>"
            NV1 r1 = r1.c
            defpackage.O90.f(r1, r2)
            nd0 r1 = defpackage.C6112nd0.g
            boolean r1 = r4.b(r1)
            if (r1 != 0) goto L88
            r0 = r3
        L68:
            if (r0 != 0) goto L6b
            return r3
        L6b:
            java.lang.Object r1 = r0.a
            od0 r1 = (defpackage.C6303od0) r1
            java.lang.Object r0 = r0.b
            TE0 r0 = (defpackage.TE0) r0
            Eg0 r2 = new Eg0
            r6.d(r7)
            r6.e(r7)
            II r3 = r6.b(r7)
            r2.<init>(r7, r3)
            rs r7 = new rs
            r7.<init>(r1, r0, r4, r2)
            return r7
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LI.f(xP0):rs");
    }
}
