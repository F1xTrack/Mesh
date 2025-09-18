package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;

/* renamed from: nv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6167nv1 {
    public final C1005Mq1 a;
    public final C0238Cu1 b;
    public final AnalyticsSender c;
    public final C1339Qy d;
    public final C0697Ir1 e;
    public final Logger f;

    public C6167nv1(C1005Mq1 c1005Mq1, C0238Cu1 c0238Cu1, AnalyticsSender analyticsSender, C1339Qy c1339Qy, C0697Ir1 c0697Ir1, Logger logger) {
        O90.f(c1005Mq1, "activityLifecycleRepository");
        O90.f(c0238Cu1, "notificationIdRepository");
        O90.f(analyticsSender, "analyticsSender");
        O90.f(c1339Qy, "coroutineScope");
        O90.f(c0697Ir1, "pushStorage");
        O90.f(logger, "rootLogger");
        this.a = c1005Mq1;
        this.b = c0238Cu1;
        this.c = analyticsSender;
        this.d = c1339Qy;
        this.e = c0697Ir1;
        this.f = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.C6167nv1 r7, android.os.Bundle r8, java.lang.String r9, defpackage.AbstractC1963Yy r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.C2225av1
            if (r0 == 0) goto L16
            r0 = r10
            av1 r0 = (defpackage.C2225av1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            av1 r0 = new av1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.d
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            com.vk.push.common.messaging.NotificationAnalyticsPayload r7 = r0.c
            java.lang.String r8 = r0.b
            nv1 r9 = r0.a
            defpackage.RQ1.d(r10)
            goto L76
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.String r9 = r0.b
            nv1 r7 = r0.a
            defpackage.RQ1.d(r10)
            goto L5e
        L44:
            defpackage.RQ1.d(r10)
            r0.a = r7
            r0.b = r9
            r0.f = r4
            GK r10 = defpackage.GK.a
            y20 r10 = defpackage.AbstractC0603Hm0.a
            Iq1 r2 = new Iq1
            r4 = 0
            r2.<init>(r8, r5, r4)
            java.lang.Object r10 = defpackage.AbstractC3767fP1.e(r10, r2, r0)
            if (r10 != r1) goto L5e
            goto Lb4
        L5e:
            r8 = r10
            com.vk.push.common.messaging.NotificationAnalyticsPayload r8 = (com.vk.push.common.messaging.NotificationAnalyticsPayload) r8
            Ir1 r10 = r7.e
            r0.a = r7
            r0.b = r9
            r0.c = r8
            r0.f = r3
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L72
            goto Lb4
        L72:
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
        L76:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "action"
            if (r7 == 0) goto La5
            if (r10 != 0) goto L7f
            goto La5
        L7f:
            java.lang.String r1 = r7.getPushTokenPart()
            r2 = 10
            java.lang.String r2 = com.vk.push.common.utils.StringExtensionsKt.takeSafe(r10, r2)
            boolean r1 = defpackage.O90.a(r1, r2)
            if (r1 == 0) goto L9c
            java.lang.String r7 = r7.getMessageId()
            defpackage.O90.f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r10, r7, r8)
            goto Lad
        L9c:
            defpackage.O90.f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r5, r5, r8)
            goto Lad
        La5:
            defpackage.O90.f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r5, r5, r8)
        Lad:
            com.vk.push.common.analytics.AnalyticsSender r7 = r9.c
            r7.send(r0)
            Tf1 r1 = defpackage.C1518Tf1.a
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6167nv1.a(nv1, android.os.Bundle, java.lang.String, Yy):java.lang.Object");
    }
}
