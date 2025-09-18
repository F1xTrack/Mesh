package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;

/* renamed from: nv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10454nv1 {

    /* renamed from: a */
    public final C7971Mq1 f38607a;

    /* renamed from: b */
    public final C7459Cu1 f38608b;

    /* renamed from: c */
    public final AnalyticsSender f38609c;

    /* renamed from: d */
    public final C1068Qy f38610d;

    /* renamed from: e */
    public final C7765Ir1 f38611e;

    /* renamed from: f */
    public final Logger f38612f;

    public C10454nv1(C7971Mq1 c7971Mq1, C7459Cu1 c7459Cu1, AnalyticsSender analyticsSender, C1068Qy c1068Qy, C7765Ir1 c7765Ir1, Logger logger) {
        O90.m5968f(c7971Mq1, "activityLifecycleRepository");
        O90.m5968f(c7459Cu1, "notificationIdRepository");
        O90.m5968f(analyticsSender, "analyticsSender");
        O90.m5968f(c1068Qy, "coroutineScope");
        O90.m5968f(c7765Ir1, "pushStorage");
        O90.m5968f(logger, "rootLogger");
        this.f38607a = c7971Mq1;
        this.f38608b = c7459Cu1;
        this.f38609c = analyticsSender;
        this.f38610d = c1068Qy;
        this.f38611e = c7765Ir1;
        this.f38612f = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m23280a(p000.C10454nv1 r7, android.os.Bundle r8, java.lang.String r9, p000.AbstractC1571Yy r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof p000.C8785av1
            if (r0 == 0) goto L16
            r0 = r10
            av1 r0 = (p000.C8785av1) r0
            int r1 = r0.f16680f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16680f = r1
            goto L1b
        L16:
            av1 r0 = new av1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f16678d
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f16680f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            com.vk.push.common.messaging.NotificationAnalyticsPayload r7 = r0.f16677c
            java.lang.String r8 = r0.f16676b
            nv1 r9 = r0.f16675a
            p000.RQ1.m7017d(r10)
            goto L76
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.String r9 = r0.f16676b
            nv1 r7 = r0.f16675a
            p000.RQ1.m7017d(r10)
            goto L5e
        L44:
            p000.RQ1.m7017d(r10)
            r0.f16675a = r7
            r0.f16676b = r9
            r0.f16680f = r4
            GK r10 = p000.C0399GK.f3694a
            y20 r10 = p000.AbstractC7702Hm0.f4486a
            Iq1 r2 = new Iq1
            r4 = 0
            r2.<init>(r8, r5, r4)
            java.lang.Object r10 = p000.AbstractC9366fP1.m18233e(r10, r2, r0)
            if (r10 != r1) goto L5e
            goto Lb4
        L5e:
            r8 = r10
            com.vk.push.common.messaging.NotificationAnalyticsPayload r8 = (com.p019vk.push.common.messaging.NotificationAnalyticsPayload) r8
            Ir1 r10 = r7.f38611e
            r0.f16675a = r7
            r0.f16676b = r9
            r0.f16677c = r8
            r0.f16680f = r3
            java.lang.Object r10 = r10.m4050a(r0)
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
            java.lang.String r2 = com.p019vk.push.common.utils.StringExtensionsKt.takeSafe(r10, r2)
            boolean r1 = p000.O90.m5963a(r1, r2)
            if (r1 == 0) goto L9c
            java.lang.String r7 = r7.getMessageId()
            p000.O90.m5968f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r10, r7, r8)
            goto Lad
        L9c:
            p000.O90.m5968f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r5, r5, r8)
            goto Lad
        La5:
            p000.O90.m5968f(r8, r0)
            Eq1 r0 = new Eq1
            r0.<init>(r5, r5, r8)
        Lad:
            com.vk.push.common.analytics.AnalyticsSender r7 = r9.f38609c
            r7.send(r0)
            Tf1 r1 = p000.C8313Tf1.f11463a
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10454nv1.m23280a(nv1, android.os.Bundle, java.lang.String, Yy):java.lang.Object");
    }
}
