package com.p018my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.s2 */
/* loaded from: classes2.dex */
public abstract class AbstractC2367s2 {
    /* renamed from: a */
    public static boolean m13493a(C2363r2 c2363r2) {
        InterfaceC2315f2 interfaceC2315f2M13471a = c2363r2.m13471a();
        if (interfaceC2315f2M13471a != null && interfaceC2315f2M13471a.mo12954b() > 0) {
            return true;
        }
        InterfaceC2315f2[] interfaceC2315f2ArrM13474d = c2363r2.m13474d();
        if (interfaceC2315f2ArrM13474d != null && interfaceC2315f2ArrM13474d.length > 0) {
            return true;
        }
        InterfaceC2380w[] interfaceC2380wArrM13472b = c2363r2.m13472b();
        return interfaceC2380wArrM13472b != null && interfaceC2380wArrM13472b.length > 0;
    }

    /* renamed from: b */
    private static boolean m13494b(C2363r2 c2363r2) {
        InterfaceC2315f2 interfaceC2315f2M13471a = c2363r2.m13471a();
        if (interfaceC2315f2M13471a == null) {
            return true;
        }
        return !(((interfaceC2315f2M13471a.mo12955c() > 0L ? 1 : (interfaceC2315f2M13471a.mo12955c() == 0L ? 0 : -1)) > 0) && (c2363r2.m13474d() == null || c2363r2.m13474d().length == 0)) && interfaceC2315f2M13471a.mo13090a() == 0;
    }

    /* renamed from: c */
    public static boolean m13495c(C2363r2 c2363r2) {
        if (m13492a(c2363r2.m13473c())) {
            return m13494b(c2363r2);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m13492a(long j) {
        if (j > 0) {
            return true;
        }
        AbstractC2391y2.m13568a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j);
        return false;
    }
}
