package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class EU0 {
    public static final C8139yG a = new C8139yG("UNDEFINED");
    public static final C8139yG b = new C8139yG("REUSABLE_CLAIMED");

    public static int a(int i) {
        if (i < 3) {
            AbstractC3588eT1.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0099 A[Catch: all -> 0x0078, DONT_GENERATE, TryCatch #2 {all -> 0x0078, blocks: (B:80:0x0056, B:82:0x0064, B:84:0x006a, B:97:0x009c, B:87:0x007a, B:89:0x0088, B:94:0x0093, B:96:0x0099, B:102:0x00a9, B:105:0x00b2, B:104:0x00af, B:92:0x008e), top: B:117:0x0056, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.InterfaceC1729Vy r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.C7961xK
            if (r0 == 0) goto Lbc
            xK r9 = (defpackage.C7961xK) r9
            java.lang.Throwable r0 = defpackage.PS0.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            nv r1 = new nv
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            Fz r0 = r9.d
            Yy r2 = r9.e
            Bz r3 = r2.getContext()
            boolean r3 = r0.n(r3)
            r4 = 1
            if (r3 == 0) goto L30
            r9.f = r1
            r9.c = r4
            Bz r10 = r2.getContext()
            r0.l(r10, r9)
            goto Lbf
        L30:
            KP r0 = defpackage.X91.a()
            long r5 = r0.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L53
            r9.f = r1
            r9.c = r4
            n8 r10 = r0.e
            if (r10 != 0) goto L4e
            n8 r10 = new n8
            r10.<init>()
            r0.e = r10
        L4e:
            r10.i(r9)
            goto Lbf
        L53:
            r0.x(r4)
            Bz r1 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            Ev0 r3 = defpackage.C0396Ev0.e     // Catch: java.lang.Throwable -> L78
            zz r1 = r1.g(r3)     // Catch: java.lang.Throwable -> L78
            Ob0 r1 = (defpackage.InterfaceC1115Ob0) r1     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7a
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L7a
            cc0 r1 = (defpackage.C2548cc0) r1     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.CancellationException r10 = r1.u()     // Catch: java.lang.Throwable -> L78
            OS0 r10 = defpackage.RQ1.b(r10)     // Catch: java.lang.Throwable -> L78
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L78
            goto L9c
        L78:
            r10 = move-exception
            goto Lb3
        L7a:
            java.lang.Object r1 = r9.g     // Catch: java.lang.Throwable -> L78
            Bz r3 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = defpackage.IJ1.d(r3, r1)     // Catch: java.lang.Throwable -> L78
            yG r5 = defpackage.IJ1.a     // Catch: java.lang.Throwable -> L78
            if (r1 == r5) goto L8d
            Pf1 r5 = defpackage.AbstractC8183yU1.g(r2, r3, r1)     // Catch: java.lang.Throwable -> L78
            goto L8e
        L8d:
            r5 = 0
        L8e:
            r2.resumeWith(r10)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L99
            boolean r10 = r5.U()     // Catch: java.lang.Throwable -> L78
            if (r10 == 0) goto L9c
        L99:
            defpackage.IJ1.c(r3, r1)     // Catch: java.lang.Throwable -> L78
        L9c:
            boolean r10 = r0.D()     // Catch: java.lang.Throwable -> L78
            if (r10 != 0) goto L9c
        La2:
            r0.p(r4)
            goto Lbf
        La6:
            r10 = move-exception
            if (r5 == 0) goto Laf
            boolean r2 = r5.U()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto Lb2
        Laf:
            defpackage.IJ1.c(r3, r1)     // Catch: java.lang.Throwable -> L78
        Lb2:
            throw r10     // Catch: java.lang.Throwable -> L78
        Lb3:
            r9.h(r10)     // Catch: java.lang.Throwable -> Lb7
            goto La2
        Lb7:
            r9 = move-exception
            r0.p(r4)
            throw r9
        Lbc:
            r9.resumeWith(r10)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EU0.c(Vy, java.lang.Object):void");
    }
}
