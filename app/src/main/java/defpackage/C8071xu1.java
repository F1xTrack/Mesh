package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.IPCInteractor;
import com.vk.push.core.data.repository.CrashReporterRepository;
import java.util.ArrayDeque;

/* renamed from: xu1 */
/* loaded from: classes2.dex */
public final class C8071xu1 implements IPCInteractor {
    public final C1629Uq1 a;
    public final C2407bs1 b;
    public final U41 c;
    public final C0697Ir1 d;
    public final AnalyticsSender e;
    public final C1164Or1 f;
    public final CrashReporterRepository g;
    public final C1339Qy h;
    public final C1091Nt0 i;
    public final F71 j;
    public final ArrayDeque k;

    public C8071xu1(C1629Uq1 c1629Uq1, C2407bs1 c2407bs1, U41 u41, C0697Ir1 c0697Ir1, AnalyticsSender analyticsSender, C1164Or1 c1164Or1, CrashReporterRepository crashReporterRepository, Logger logger) {
        O90.f(c1629Uq1, "dispatcher");
        O90.f(c0697Ir1, "storage");
        O90.f(analyticsSender, "analyticsSender");
        O90.f(c1164Or1, "pushInterceptor");
        O90.f(crashReporterRepository, "crashReporterRepository");
        O90.f(logger, "logger");
        this.a = c1629Uq1;
        this.b = c2407bs1;
        this.c = u41;
        this.d = c0697Ir1;
        this.e = analyticsSender;
        this.f = c1164Or1;
        this.g = crashReporterRepository;
        GK gk = GK.a;
        this.h = AbstractC7625vY1.a(QF.c);
        this.i = SA1.a();
        this.j = LB.b(new A40(logger, 1));
        this.k = new ArrayDeque(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00cb A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #2 {all -> 0x00ef, blocks: (B:133:0x00ba, B:134:0x00c5, B:136:0x00cb, B:138:0x00de, B:140:0x00ea, B:144:0x00f4, B:146:0x00fe, B:148:0x0104, B:150:0x0110, B:154:0x0119, B:157:0x0120, B:159:0x012e, B:167:0x0151, B:170:0x0161, B:160:0x0133, B:161:0x013c, B:163:0x0142, B:165:0x014c), top: B:187:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x012e A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:133:0x00ba, B:134:0x00c5, B:136:0x00cb, B:138:0x00de, B:140:0x00ea, B:144:0x00f4, B:146:0x00fe, B:148:0x0104, B:150:0x0110, B:154:0x0119, B:157:0x0120, B:159:0x012e, B:167:0x0151, B:170:0x0161, B:160:0x0133, B:161:0x013c, B:163:0x0142, B:165:0x014c), top: B:187:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0133 A[Catch: all -> 0x00ef, TryCatch #2 {all -> 0x00ef, blocks: (B:133:0x00ba, B:134:0x00c5, B:136:0x00cb, B:138:0x00de, B:140:0x00ea, B:144:0x00f4, B:146:0x00fe, B:148:0x0104, B:150:0x0110, B:154:0x0119, B:157:0x0120, B:159:0x012e, B:167:0x0151, B:170:0x0161, B:160:0x0133, B:161:0x013c, B:163:0x0142, B:165:0x014c), top: B:187:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0157 A[Catch: all -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x011d, blocks: (B:116:0x003e, B:172:0x016a, B:174:0x0170, B:177:0x0188, B:137:0x00d6, B:169:0x0157, B:129:0x0087), top: B:185:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0170 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:116:0x003e, B:172:0x016a, B:174:0x0170, B:177:0x0188, B:137:0x00d6, B:169:0x0157, B:129:0x0087), top: B:185:0x002a }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum a(defpackage.C8071xu1 r17, java.util.List r18, defpackage.AbstractC1963Yy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8071xu1.a(xu1, java.util.List, Yy):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.vk.push.common.messaging.RemoteMessage r24, defpackage.AbstractC1963Yy r25) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8071xu1.b(com.vk.push.common.messaging.RemoteMessage, Yy):java.lang.Object");
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default((Logger) this.j.getValue(), "onDestroy", null, 2, null);
        AbstractC7625vY1.b(this.h, null);
    }
}
