package defpackage;

import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;

/* renamed from: Yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894Yb implements InterfaceC1802Ww0 {
    public static final C1894Yb a = new C1894Yb();
    public static final C2520cT b = new C2520cT("projectNumber", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(1))));
    public static final C2520cT c = new C2520cT(RemoteMessageAttributes.MESSAGE_ID, AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(2))));
    public static final C2520cT d = new C2520cT("instanceId", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(3))));
    public static final C2520cT e = new C2520cT(RemoteMessageAttributes.MESSAGE_TYPE, AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(4))));
    public static final C2520cT f = new C2520cT("sdkPlatform", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(5))));
    public static final C2520cT g = new C2520cT("packageName", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(6))));
    public static final C2520cT h = new C2520cT("collapseKey", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(7))));
    public static final C2520cT i = new C2520cT("priority", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(8))));
    public static final C2520cT j = new C2520cT("ttl", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(9))));
    public static final C2520cT k = new C2520cT("topic", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(10))));
    public static final C2520cT l = new C2520cT("bulkId", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(11))));
    public static final C2520cT m = new C2520cT("event", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(12))));
    public static final C2520cT n = new C2520cT("analyticsLabel", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(13))));
    public static final C2520cT o = new C2520cT("campaignId", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(14))));
    public static final C2520cT p = new C2520cT("composerLabel", AbstractC8235ym.s(AbstractC8235ym.r(XF0.class, new C9(15))));

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        C0072Ar0 c0072Ar0 = (C0072Ar0) obj;
        InterfaceC1880Xw0 interfaceC1880Xw0 = (InterfaceC1880Xw0) obj2;
        interfaceC1880Xw0.f(b, c0072Ar0.a);
        interfaceC1880Xw0.a(c, c0072Ar0.b);
        interfaceC1880Xw0.a(d, c0072Ar0.c);
        interfaceC1880Xw0.a(e, c0072Ar0.d);
        interfaceC1880Xw0.a(f, EnumC8441zr0.ANDROID);
        interfaceC1880Xw0.a(g, c0072Ar0.e);
        interfaceC1880Xw0.a(h, c0072Ar0.f);
        interfaceC1880Xw0.d(i, c0072Ar0.g);
        interfaceC1880Xw0.d(j, c0072Ar0.h);
        interfaceC1880Xw0.a(k, c0072Ar0.i);
        interfaceC1880Xw0.f(l, 0L);
        interfaceC1880Xw0.a(m, EnumC8061xr0.MESSAGE_DELIVERED);
        interfaceC1880Xw0.a(n, c0072Ar0.j);
        interfaceC1880Xw0.f(o, 0L);
        interfaceC1880Xw0.a(p, c0072Ar0.k);
    }
}
