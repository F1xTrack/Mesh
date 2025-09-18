package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.IPCInteractor;
import com.vk.push.core.data.repository.CrashReporterRepository;

/* renamed from: rt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6924rt1 implements IPCInteractor {
    public final C2407bs1 a;
    public final C1629Uq1 b;
    public final C0070Aq1 c;
    public final C0697Ir1 d;
    public final CrashReporterRepository e;
    public final AnalyticsSender f;
    public final Logger g;
    public final C1339Qy h;

    public C6924rt1(C2407bs1 c2407bs1, C1629Uq1 c1629Uq1, C0070Aq1 c0070Aq1, C0697Ir1 c0697Ir1, CrashReporterRepository crashReporterRepository, AnalyticsSender analyticsSender, Logger logger) {
        O90.f(c1629Uq1, "dispatcher");
        O90.f(c0697Ir1, "pushStorage");
        O90.f(crashReporterRepository, "crashReporterRepository");
        O90.f(analyticsSender, "analyticsSender");
        this.a = c2407bs1;
        this.b = c1629Uq1;
        this.c = c0070Aq1;
        this.d = c0697Ir1;
        this.e = crashReporterRepository;
        this.f = analyticsSender;
        this.g = logger.createLogger("ClientServiceInteractor");
        this.h = AbstractC7625vY1.a(GK.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum a(defpackage.C6924rt1 r4, defpackage.AbstractC1963Yy r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C0933Ls1
            if (r0 == 0) goto L13
            r0 = r5
            Ls1 r0 = (defpackage.C0933Ls1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Ls1 r0 = new Ls1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.RQ1.d(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.RQ1.d(r5)
            r0.c = r3
            Uq1 r4 = r4.b
            java.lang.Object r4 = r4.e(r0)
            if (r4 != r1) goto L3d
            goto L3f
        L3d:
            com.vk.push.core.push.OnDeleteMessagesResult r1 = com.vk.push.core.push.OnDeleteMessagesResult.OK
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6924rt1.a(rt1, Yy):java.lang.Enum");
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default(this.g, "Destroying", null, 2, null);
        AbstractC7625vY1.b(this.h, null);
    }
}
