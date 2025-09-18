package defpackage;

import java.util.Map;
import kotlin.Pair;

/* renamed from: Zv1 */
/* loaded from: classes2.dex */
public final class C2034Zv1 {
    public final C7887ww1 a;
    public final C0400Ew1 b;
    public final F71 c;

    public C2034Zv1(C7887ww1 c7887ww1, C0400Ew1 c0400Ew1) {
        O90.f(c7887ww1, "remoteConfigAnalyticsRepository");
        O90.f(c0400Ew1, "sdkInfoRepository");
        this.a = c7887ww1;
        this.b = c0400Ew1;
        this.c = LB.b(new S51(13, this));
    }

    public final C4074h11 a(Throwable th) {
        O90.f(th, "error");
        C3294cw1 c3294cw1 = new C3294cw1("remoteConfig.error", AbstractC7096sn0.j((Map) this.c.getValue(), AbstractC7287tn0.c(new Pair("errorName", th.getClass().getSimpleName()))));
        C7887ww1 c7887ww1 = this.a;
        c7887ww1.getClass();
        return new C4074h11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C1719Vu1(c7887ww1, 2, c3294cw1)), new C5661lG0(23, c7887ww1), 1), FK.a()), C1404Rt1.m);
    }
}
