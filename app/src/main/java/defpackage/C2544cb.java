package defpackage;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2544cb implements InterfaceC1802Ww0 {
    public static final C2544cb a = new C2544cb();
    public static final C2520cT b = C2520cT.c("sdkVersion");
    public static final C2520cT c = C2520cT.c(CommonUrlParts.MODEL);
    public static final C2520cT d = C2520cT.c("hardware");
    public static final C2520cT e = C2520cT.c("device");
    public static final C2520cT f = C2520cT.c("product");
    public static final C2520cT g = C2520cT.c("osBuild");
    public static final C2520cT h = C2520cT.c("manufacturer");
    public static final C2520cT i = C2520cT.c(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
    public static final C2520cT j = C2520cT.c(CommonUrlParts.LOCALE);
    public static final C2520cT k = C2520cT.c("country");
    public static final C2520cT l = C2520cT.c("mccMnc");
    public static final C2520cT m = C2520cT.c("applicationBuild");

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        C6490pc c6490pc = (C6490pc) ((AbstractC4275i4) obj);
        interfaceC1880Xw0.a(b, c6490pc.a);
        interfaceC1880Xw0.a(c, c6490pc.b);
        interfaceC1880Xw0.a(d, c6490pc.c);
        interfaceC1880Xw0.a(e, c6490pc.d);
        interfaceC1880Xw0.a(f, c6490pc.e);
        interfaceC1880Xw0.a(g, c6490pc.f);
        interfaceC1880Xw0.a(h, c6490pc.g);
        interfaceC1880Xw0.a(i, c6490pc.h);
        interfaceC1880Xw0.a(j, c6490pc.i);
        interfaceC1880Xw0.a(k, c6490pc.j);
        interfaceC1880Xw0.a(l, c6490pc.k);
        interfaceC1880Xw0.a(m, c6490pc.l);
    }
}
