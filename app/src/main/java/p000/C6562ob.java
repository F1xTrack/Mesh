package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;

/* renamed from: ob */
/* loaded from: classes.dex */
public final class C6562ob implements InterfaceC8502Ww0 {

    /* renamed from: a */
    public static final C6562ob f39100a = new C6562ob();

    /* renamed from: b */
    public static final C1849cT f39101b = C1849cT.m10701c("pid");

    /* renamed from: c */
    public static final C1849cT f39102c = C1849cT.m10701c("processName");

    /* renamed from: d */
    public static final C1849cT f39103d = C1849cT.m10701c("reasonCode");

    /* renamed from: e */
    public static final C1849cT f39104e = C1849cT.m10701c(NotificationConstants.IMPORTANCE);

    /* renamed from: f */
    public static final C1849cT f39105f = C1849cT.m10701c("pss");

    /* renamed from: g */
    public static final C1849cT f39106g = C1849cT.m10701c("rss");

    /* renamed from: h */
    public static final C1849cT f39107h = C1849cT.m10701c("timestamp");

    /* renamed from: i */
    public static final C1849cT f39108i = C1849cT.m10701c("traceFile");

    /* renamed from: j */
    public static final C1849cT f39109j = C1849cT.m10701c("buildIdMappingForArch");

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        InterfaceC8554Xw0 interfaceC8554Xw0 = (InterfaceC8554Xw0) obj2;
        C0794Mc c0794Mc = (C0794Mc) ((AbstractC6995vA) obj);
        interfaceC8554Xw0.mo4362d(f39101b, c0794Mc.f7256a);
        interfaceC8554Xw0.mo4359a(f39102c, c0794Mc.f7257b);
        interfaceC8554Xw0.mo4362d(f39103d, c0794Mc.f7258c);
        interfaceC8554Xw0.mo4362d(f39104e, c0794Mc.f7259d);
        interfaceC8554Xw0.mo4364f(f39105f, c0794Mc.f7260e);
        interfaceC8554Xw0.mo4364f(f39106g, c0794Mc.f7261f);
        interfaceC8554Xw0.mo4364f(f39107h, c0794Mc.f7262g);
        interfaceC8554Xw0.mo4359a(f39108i, c0794Mc.f7263h);
        interfaceC8554Xw0.mo4359a(f39109j, c0794Mc.f7264i);
    }
}
