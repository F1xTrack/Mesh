package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.core.IPCInteractor;
import com.p019vk.push.core.data.repository.CrashReporterRepository;

/* renamed from: rt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10962rt1 implements IPCInteractor {

    /* renamed from: a */
    public final C8907bs1 f41943a;

    /* renamed from: b */
    public final C8387Uq1 f41944b;

    /* renamed from: c */
    public final C7347Aq1 f41945c;

    /* renamed from: d */
    public final C7765Ir1 f41946d;

    /* renamed from: e */
    public final CrashReporterRepository f41947e;

    /* renamed from: f */
    public final AnalyticsSender f41948f;

    /* renamed from: g */
    public final Logger f41949g;

    /* renamed from: h */
    public final C1068Qy f41950h;

    public C10962rt1(C8907bs1 c8907bs1, C8387Uq1 c8387Uq1, C7347Aq1 c7347Aq1, C7765Ir1 c7765Ir1, CrashReporterRepository crashReporterRepository, AnalyticsSender analyticsSender, Logger logger) {
        O90.m5968f(c8387Uq1, "dispatcher");
        O90.m5968f(c7765Ir1, "pushStorage");
        O90.m5968f(crashReporterRepository, "crashReporterRepository");
        O90.m5968f(analyticsSender, "analyticsSender");
        this.f41943a = c8907bs1;
        this.f41944b = c8387Uq1;
        this.f41945c = c7347Aq1;
        this.f41946d = c7765Ir1;
        this.f41947e = crashReporterRepository;
        this.f41948f = analyticsSender;
        this.f41949g = logger.createLogger("ClientServiceInteractor");
        this.f41950h = AbstractC11432vY1.m25444a(C0399GK.f3695b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum m24491a(p000.C10962rt1 r4, p000.AbstractC1571Yy r5) {
        /*
            boolean r0 = r5 instanceof p000.C7923Ls1
            if (r0 == 0) goto L13
            r0 = r5
            Ls1 r0 = (p000.C7923Ls1) r0
            int r1 = r0.f6915c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6915c = r1
            goto L18
        L13:
            Ls1 r0 = new Ls1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6913a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f6915c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            p000.RQ1.m7017d(r5)
            r0.f6915c = r3
            Uq1 r4 = r4.f41944b
            java.lang.Object r4 = r4.m8191e(r0)
            if (r4 != r1) goto L3d
            goto L3f
        L3d:
            com.vk.push.core.push.OnDeleteMessagesResult r1 = com.p019vk.push.core.push.OnDeleteMessagesResult.f20484OK
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10962rt1.m24491a(rt1, Yy):java.lang.Enum");
    }

    @Override // com.p019vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default(this.f41949g, "Destroying", null, 2, null);
        AbstractC11432vY1.m25445b(this.f41950h, null);
    }
}
