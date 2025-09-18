package defpackage;

import com.vk.push.common.Logger;

/* renamed from: Ou1 */
/* loaded from: classes2.dex */
public final class C1173Ou1 {
    public final InterfaceC1317Qq1 a;
    public final C1398Rr1 b;
    public final C1398Rr1 c;
    public final C1339Qy d;
    public final Logger e;
    public volatile C5663lH f;
    public final C1091Nt0 g;

    public C1173Ou1(InterfaceC1317Qq1 interfaceC1317Qq1, C1398Rr1 c1398Rr1, C1398Rr1 c1398Rr12, Logger logger) {
        GK gk = GK.a;
        C1339Qy c1339QyA = AbstractC7625vY1.a(QF.c);
        O90.f(logger, "logger");
        this.a = interfaceC1317Qq1;
        this.b = c1398Rr1;
        this.c = c1398Rr12;
        this.d = c1339QyA;
        this.e = logger.createLogger("IPCClientsDataSource");
        this.g = SA1.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.C1173Ou1 r4, defpackage.AbstractC1963Yy r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C1875Xu1
            if (r0 == 0) goto L13
            r0 = r5
            Xu1 r0 = (defpackage.C1875Xu1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Xu1 r0 = new Xu1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ou1 r4 = r0.a
            defpackage.RQ1.d(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.RQ1.d(r5)
            r0.a = r4
            r0.d = r3
            Rr1 r5 = r4.b
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L41
            goto L69
        L41:
            com.vk.push.common.AppInfo r5 = (com.vk.push.common.AppInfo) r5
            com.vk.push.common.Logger r0 = r4.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Client works with host: "
            r1.<init>(r2)
            java.lang.String r2 = r5.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            r3 = 0
            com.vk.push.common.Logger.DefaultImpls.info$default(r0, r1, r3, r2, r3)
            S51 r0 = new S51
            r1 = 12
            r0.<init>(r1, r4)
            Qq1 r4 = r4.a
            Pq1 r1 = r4.d(r5, r0)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1173Ou1.b(Ou1, Yy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Lt0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C0550Gu1
            if (r0 == 0) goto L13
            r0 = r7
            Gu1 r0 = (defpackage.C0550Gu1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Gu1 r0 = new Gu1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            Lt0 r1 = r0.b
            Ou1 r0 = r0.a
            defpackage.RQ1.d(r7)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r7 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            Lt0 r2 = r0.b
            Ou1 r4 = r0.a
            defpackage.RQ1.d(r7)
            r7 = r2
            goto L55
        L42:
            defpackage.RQ1.d(r7)
            Nt0 r7 = r6.g
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r7.d(r0)
            if (r2 != r1) goto L54
            return r1
        L54:
            r4 = r6
        L55:
            Rr1 r2 = r4.c     // Catch: java.lang.Throwable -> L73
            r0.a = r4     // Catch: java.lang.Throwable -> L73
            r0.b = r7     // Catch: java.lang.Throwable -> L73
            r0.e = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L64
            return r1
        L64:
            r1 = r7
            r0 = r4
        L66:
            r0.f = r5     // Catch: java.lang.Throwable -> L2f
            Tf1 r7 = defpackage.C1518Tf1.a     // Catch: java.lang.Throwable -> L2f
            Nt0 r1 = (defpackage.C1091Nt0) r1
            r1.e(r5)
            return r7
        L70:
            r1 = r7
            r7 = r0
            goto L75
        L73:
            r0 = move-exception
            goto L70
        L75:
            Nt0 r1 = (defpackage.C1091Nt0) r1
            r1.e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1173Ou1.a(Yy):java.lang.Object");
    }
}
