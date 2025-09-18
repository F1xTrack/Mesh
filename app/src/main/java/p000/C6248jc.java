package p000;

/* renamed from: jc */
/* loaded from: classes.dex */
public final class C6248jc implements InterfaceC8502Ww0 {

    /* renamed from: a */
    public static final C6248jc f35276a = new C6248jc();

    /* renamed from: b */
    public static final C1849cT f35277b = C1849cT.m10701c("appId");

    /* renamed from: c */
    public static final C1849cT f35278c = C1849cT.m10701c("deviceModel");

    /* renamed from: d */
    public static final C1849cT f35279d = C1849cT.m10701c("sessionSdkVersion");

    /* renamed from: e */
    public static final C1849cT f35280e = C1849cT.m10701c("osVersion");

    /* renamed from: f */
    public static final C1849cT f35281f = C1849cT.m10701c("logEnvironment");

    /* renamed from: g */
    public static final C1849cT f35282g = C1849cT.m10701c("androidAppInfo");

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        C1766b8 c1766b8 = (C1766b8) obj;
        InterfaceC8554Xw0 interfaceC8554Xw0 = (InterfaceC8554Xw0) obj2;
        interfaceC8554Xw0.mo4359a(f35277b, c1766b8.f16817a);
        interfaceC8554Xw0.mo4359a(f35278c, c1766b8.f16818b);
        interfaceC8554Xw0.mo4359a(f35279d, "2.0.8");
        interfaceC8554Xw0.mo4359a(f35280e, c1766b8.f16819c);
        interfaceC8554Xw0.mo4359a(f35281f, EnumC9665hl0.LOG_ENVIRONMENT_PROD);
        interfaceC8554Xw0.mo4359a(f35282g, c1766b8.f16820d);
    }
}
