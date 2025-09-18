package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.core.IPCInteractor;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import java.util.ArrayDeque;

/* renamed from: xu1 */
/* loaded from: classes2.dex */
public final class C11730xu1 implements IPCInteractor {

    /* renamed from: a */
    public final C8387Uq1 f45883a;

    /* renamed from: b */
    public final C8907bs1 f45884b;

    /* renamed from: c */
    public final U41 f45885c;

    /* renamed from: d */
    public final C7765Ir1 f45886d;

    /* renamed from: e */
    public final AnalyticsSender f45887e;

    /* renamed from: f */
    public final C8077Or1 f45888f;

    /* renamed from: g */
    public final CrashReporterRepository f45889g;

    /* renamed from: h */
    public final C1068Qy f45890h;

    /* renamed from: i */
    public final C8028Nt0 f45891i;

    /* renamed from: j */
    public final F71 f45892j;

    /* renamed from: k */
    public final ArrayDeque f45893k;

    public C11730xu1(C8387Uq1 c8387Uq1, C8907bs1 c8907bs1, U41 u41, C7765Ir1 c7765Ir1, AnalyticsSender analyticsSender, C8077Or1 c8077Or1, CrashReporterRepository crashReporterRepository, Logger logger) {
        O90.m5968f(c8387Uq1, "dispatcher");
        O90.m5968f(c7765Ir1, "storage");
        O90.m5968f(analyticsSender, "analyticsSender");
        O90.m5968f(c8077Or1, "pushInterceptor");
        O90.m5968f(crashReporterRepository, "crashReporterRepository");
        O90.m5968f(logger, "logger");
        this.f45883a = c8387Uq1;
        this.f45884b = c8907bs1;
        this.f45885c = u41;
        this.f45886d = c7765Ir1;
        this.f45887e = analyticsSender;
        this.f45888f = c8077Or1;
        this.f45889g = crashReporterRepository;
        C0399GK c0399gk = C0399GK.f3694a;
        this.f45890h = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        this.f45891i = SA1.m7187a();
        this.f45892j = AbstractC0705LB.m4915b(new A40(logger, 1));
        this.f45893k = new ArrayDeque(10);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum m25999a(p000.C11730xu1 r17, java.util.List r18, p000.AbstractC1571Yy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11730xu1.m25999a(xu1, java.util.List, Yy):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0217  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26000b(com.p019vk.push.common.messaging.RemoteMessage r24, p000.AbstractC1571Yy r25) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11730xu1.m26000b(com.vk.push.common.messaging.RemoteMessage, Yy):java.lang.Object");
    }

    @Override // com.p019vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default((Logger) this.f45892j.getValue(), "onDestroy", null, 2, null);
        AbstractC11432vY1.m25445b(this.f45890h, null);
    }
}
