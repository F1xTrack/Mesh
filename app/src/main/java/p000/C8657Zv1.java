package p000;

import java.util.Map;
import kotlin.Pair;

/* renamed from: Zv1 */
/* loaded from: classes2.dex */
public final class C8657Zv1 {

    /* renamed from: a */
    public final C11607ww1 f15229a;

    /* renamed from: b */
    public final C7567Ew1 f15230b;

    /* renamed from: c */
    public final F71 f15231c;

    public C8657Zv1(C11607ww1 c11607ww1, C7567Ew1 c7567Ew1) {
        O90.m5968f(c11607ww1, "remoteConfigAnalyticsRepository");
        O90.m5968f(c7567Ew1, "sdkInfoRepository");
        this.f15229a = c11607ww1;
        this.f15230b = c7567Ew1;
        this.f15231c = AbstractC0705LB.m4915b(new S51(13, this));
    }

    /* renamed from: a */
    public final C9571h11 m9645a(Throwable th) {
        O90.m5968f(th, "error");
        C9048cw1 c9048cw1 = new C9048cw1("remoteConfig.error", AbstractC11077sn0.m24782j((Map) this.f15231c.getValue(), AbstractC11205tn0.m24984c(new Pair("errorName", th.getClass().getSimpleName()))));
        C11607ww1 c11607ww1 = this.f15229a;
        c11607ww1.getClass();
        return new C9571h11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C8447Vu1(c11607ww1, 2, c9048cw1)), new C10115lG0(23, c11607ww1), 1), AbstractC0336FK.m2578a()), C8237Rt1.f10477m);
    }
}
