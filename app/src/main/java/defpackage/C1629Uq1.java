package defpackage;

import com.vk.push.common.Logger;

/* renamed from: Uq1 */
/* loaded from: classes2.dex */
public final class C1629Uq1 {
    public static final C0125Bj d = DS1.a(-2, 4, EnumC7274tj.a);
    public final ES1 a;
    public final C0697Ir1 b;
    public final Logger c;

    public C1629Uq1(ES1 es1, C0697Ir1 c0697Ir1, Logger logger) {
        O90.f(c0697Ir1, "pushStorage");
        O90.f(logger, "logger");
        this.a = es1;
        this.b = c0697Ir1;
        this.c = logger.createLogger("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.AbstractC1963Yy r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.C2401bq1
            if (r0 == 0) goto L13
            r0 = r10
            bq1 r0 = (defpackage.C2401bq1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bq1 r0 = new bq1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.e
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L40
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            defpackage.RQ1.d(r10)
            goto L96
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.String r2 = r0.b
            Uq1 r5 = r0.a
            defpackage.RQ1.d(r10)
            goto L71
        L40:
            Uq1 r2 = r0.a
            defpackage.RQ1.d(r10)
            r5 = r2
            goto L5f
        L47:
            defpackage.RQ1.d(r10)
            com.vk.push.common.Logger r10 = r9.c
            java.lang.String r2 = "Checking for undelivered push tokens"
            com.vk.push.common.Logger.DefaultImpls.info$default(r10, r2, r7, r6, r7)
            r0.a = r9
            r0.e = r5
            Ir1 r10 = r9.b
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r5 = r9
        L5f:
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            Ir1 r10 = r5.b
            r0.a = r5
            r0.b = r2
            r0.e = r6
            java.lang.Object r10 = r10.d(r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            java.lang.String r10 = (java.lang.String) r10
            if (r2 == 0) goto L96
            boolean r8 = defpackage.AbstractC7538v51.C(r2)
            if (r8 == 0) goto L7c
            goto L96
        L7c:
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L96
            com.vk.push.common.Logger r10 = r5.c
            java.lang.String r8 = "Found undelivered token, sending it to service"
            com.vk.push.common.Logger.DefaultImpls.info$default(r10, r8, r7, r6, r7)
            r0.a = r7
            r0.b = r7
            r0.e = r4
            java.lang.Object r10 = r5.c(r2, r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1629Uq1.a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.vk.push.common.messaging.RemoteMessage r7, defpackage.AbstractC1963Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C5198iq1
            if (r0 == 0) goto L13
            r0 = r8
            iq1 r0 = (defpackage.C5198iq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iq1 r0 = new iq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.a
            defpackage.RQ1.d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.RQ1.d(r8)
            pv1 r8 = new pv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.c
            java.lang.String r2 = "Trying to send new push message event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.a = r6
            r0.d = r4
            Bj r7 = defpackage.C1629Uq1.d
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.c
            java.lang.String r0 = "Event with new push message has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.a
            r7.m()
            Tf1 r7 = defpackage.C1518Tf1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1629Uq1.b(com.vk.push.common.messaging.RemoteMessage, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.AbstractC1963Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C5770lq1
            if (r0 == 0) goto L13
            r0 = r8
            lq1 r0 = (defpackage.C5770lq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lq1 r0 = new lq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.a
            defpackage.RQ1.d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.RQ1.d(r8)
            rv1 r8 = new rv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.c
            java.lang.String r2 = "Trying to send new push token event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.a = r6
            r0.d = r4
            Bj r7 = defpackage.C1629Uq1.d
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.c
            java.lang.String r0 = "Event with new push token has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.a
            r7.m()
            Tf1 r7 = defpackage.C1518Tf1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1629Uq1.c(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r7, defpackage.AbstractC1963Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C6915rq1
            if (r0 == 0) goto L13
            r0 = r8
            rq1 r0 = (defpackage.C6915rq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rq1 r0 = new rq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.a
            defpackage.RQ1.d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.RQ1.d(r8)
            uv1 r8 = new uv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.c
            java.lang.String r2 = "Trying to send error message event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.a = r6
            r0.d = r4
            Bj r7 = defpackage.C1629Uq1.d
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.c
            java.lang.String r0 = "Event with error message has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.a
            r7.m()
            Tf1 r7 = defpackage.C1518Tf1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1629Uq1.d(java.util.List, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.AbstractC1963Yy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C6343oq1
            if (r0 == 0) goto L13
            r0 = r8
            oq1 r0 = (defpackage.C6343oq1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oq1 r0 = new oq1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r0 = r0.a
            defpackage.RQ1.d(r8)
            goto L4d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.RQ1.d(r8)
            tv1 r8 = defpackage.C7312tv1.a
            com.vk.push.common.Logger r2 = r7.c
            java.lang.String r6 = "Trying to send on delete messages event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r2, r6, r5, r3, r5)
            r0.a = r7
            r0.d = r4
            Bj r2 = defpackage.C1629Uq1.d
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r0 = r7
        L4d:
            com.vk.push.common.Logger r8 = r0.c
            java.lang.String r1 = "Event with on delete messages has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r1, r5, r3, r5)
            ES1 r8 = r0.a
            r8.m()
            Tf1 r8 = defpackage.C1518Tf1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1629Uq1.e(Yy):java.lang.Object");
    }
}
