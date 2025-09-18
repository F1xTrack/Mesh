package p000;

import com.p019vk.push.common.Logger;

/* renamed from: Uq1 */
/* loaded from: classes2.dex */
public final class C8387Uq1 {

    /* renamed from: d */
    public static final C0109Bj f12165d = DS1.m1689a(-2, 4, EnumC6904tj.f43225a);

    /* renamed from: a */
    public final ES1 f12166a;

    /* renamed from: b */
    public final C7765Ir1 f12167b;

    /* renamed from: c */
    public final Logger f12168c;

    public C8387Uq1(ES1 es1, C7765Ir1 c7765Ir1, Logger logger) {
        O90.m5968f(c7765Ir1, "pushStorage");
        O90.m5968f(logger, "logger");
        this.f12166a = es1;
        this.f12167b = c7765Ir1;
        this.f12168c = logger.createLogger("ClientServiceDataDispatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8187a(p000.AbstractC1571Yy r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p000.C8903bq1
            if (r0 == 0) goto L13
            r0 = r10
            bq1 r0 = (p000.C8903bq1) r0
            int r1 = r0.f17186e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17186e = r1
            goto L18
        L13:
            bq1 r0 = new bq1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f17184c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f17186e
            Tf1 r3 = p000.C8313Tf1.f11463a
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L40
            if (r2 == r6) goto L38
            if (r2 != r4) goto L30
            p000.RQ1.m7017d(r10)
            goto L96
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.String r2 = r0.f17183b
            Uq1 r5 = r0.f17182a
            p000.RQ1.m7017d(r10)
            goto L71
        L40:
            Uq1 r2 = r0.f17182a
            p000.RQ1.m7017d(r10)
            r5 = r2
            goto L5f
        L47:
            p000.RQ1.m7017d(r10)
            com.vk.push.common.Logger r10 = r9.f12168c
            java.lang.String r2 = "Checking for undelivered push tokens"
            com.vk.push.common.Logger.DefaultImpls.info$default(r10, r2, r7, r6, r7)
            r0.f17182a = r9
            r0.f17186e = r5
            Ir1 r10 = r9.f12167b
            java.lang.Object r10 = r10.m4050a(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r5 = r9
        L5f:
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            Ir1 r10 = r5.f12167b
            r0.f17182a = r5
            r0.f17183b = r2
            r0.f17186e = r6
            java.lang.Object r10 = r10.m4053d(r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            java.lang.String r10 = (java.lang.String) r10
            if (r2 == 0) goto L96
            boolean r8 = p000.AbstractC11374v51.m25328C(r2)
            if (r8 == 0) goto L7c
            goto L96
        L7c:
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L96
            com.vk.push.common.Logger r10 = r5.f12168c
            java.lang.String r8 = "Found undelivered token, sending it to service"
            com.vk.push.common.Logger.DefaultImpls.info$default(r10, r8, r7, r6, r7)
            r0.f17182a = r7
            r0.f17183b = r7
            r0.f17186e = r4
            java.lang.Object r10 = r5.m8189c(r2, r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8387Uq1.m8187a(Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8188b(com.p019vk.push.common.messaging.RemoteMessage r7, p000.AbstractC1571Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C9804iq1
            if (r0 == 0) goto L13
            r0 = r8
            iq1 r0 = (p000.C9804iq1) r0
            int r1 = r0.f34763d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34763d = r1
            goto L18
        L13:
            iq1 r0 = new iq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f34761b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f34763d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.f34760a
            p000.RQ1.m7017d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p000.RQ1.m7017d(r8)
            pv1 r8 = new pv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.f12168c
            java.lang.String r2 = "Trying to send new push message event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.f34760a = r6
            r0.f34763d = r4
            Bj r7 = p000.C8387Uq1.f12165d
            java.lang.Object r7 = r7.mo820a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.f12168c
            java.lang.String r0 = "Event with new push message has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.f12166a
            r7.m2294m()
            Tf1 r7 = p000.C8313Tf1.f11463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8387Uq1.m8188b(com.vk.push.common.messaging.RemoteMessage, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8189c(java.lang.String r7, p000.AbstractC1571Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C10188lq1
            if (r0 == 0) goto L13
            r0 = r8
            lq1 r0 = (p000.C10188lq1) r0
            int r1 = r0.f37315d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37315d = r1
            goto L18
        L13:
            lq1 r0 = new lq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f37313b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f37315d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.f37312a
            p000.RQ1.m7017d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p000.RQ1.m7017d(r8)
            rv1 r8 = new rv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.f12168c
            java.lang.String r2 = "Trying to send new push token event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.f37312a = r6
            r0.f37315d = r4
            Bj r7 = p000.C8387Uq1.f12165d
            java.lang.Object r7 = r7.mo820a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.f12168c
            java.lang.String r0 = "Event with new push token has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.f12166a
            r7.m2294m()
            Tf1 r7 = p000.C8313Tf1.f11463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8387Uq1.m8189c(java.lang.String, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8190d(java.util.List r7, p000.AbstractC1571Yy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C10956rq1
            if (r0 == 0) goto L13
            r0 = r8
            rq1 r0 = (p000.C10956rq1) r0
            int r1 = r0.f41931d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41931d = r1
            goto L18
        L13:
            rq1 r0 = new rq1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f41929b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f41931d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r7 = r0.f41928a
            p000.RQ1.m7017d(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p000.RQ1.m7017d(r8)
            uv1 r8 = new uv1
            r8.<init>(r7)
            com.vk.push.common.Logger r7 = r6.f12168c
            java.lang.String r2 = "Trying to send error message event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r7, r2, r5, r3, r5)
            r0.f41928a = r6
            r0.f41931d = r4
            Bj r7 = p000.C8387Uq1.f12165d
            java.lang.Object r7 = r7.mo820a(r8, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            com.vk.push.common.Logger r8 = r7.f12168c
            java.lang.String r0 = "Event with error message has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r0, r5, r3, r5)
            ES1 r7 = r7.f12166a
            r7.m2294m()
            Tf1 r7 = p000.C8313Tf1.f11463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8387Uq1.m8190d(java.util.List, Yy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8191e(p000.AbstractC1571Yy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p000.C10572oq1
            if (r0 == 0) goto L13
            r0 = r8
            oq1 r0 = (p000.C10572oq1) r0
            int r1 = r0.f39304d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39304d = r1
            goto L18
        L13:
            oq1 r0 = new oq1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f39302b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f39304d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            Uq1 r0 = r0.f39301a
            p000.RQ1.m7017d(r8)
            goto L4d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            p000.RQ1.m7017d(r8)
            tv1 r8 = p000.C11222tv1.f43416a
            com.vk.push.common.Logger r2 = r7.f12168c
            java.lang.String r6 = "Trying to send on delete messages event to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r2, r6, r5, r3, r5)
            r0.f39301a = r7
            r0.f39304d = r4
            Bj r2 = p000.C8387Uq1.f12165d
            java.lang.Object r8 = r2.mo820a(r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r0 = r7
        L4d:
            com.vk.push.common.Logger r8 = r0.f12168c
            java.lang.String r1 = "Event with on delete messages has been sent to channel"
            com.vk.push.common.Logger.DefaultImpls.info$default(r8, r1, r5, r3, r5)
            ES1 r8 = r0.f12166a
            r8.m2294m()
            Tf1 r8 = p000.C8313Tf1.f11463a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8387Uq1.m8191e(Yy):java.lang.Object");
    }
}
