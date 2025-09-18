package p000;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class TU1 {

    /* renamed from: c */
    public static final TU1 f11400c = new TU1();

    /* renamed from: b */
    public final ConcurrentHashMap f11402b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C11803yT1 f11401a = new C11803yT1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [vU1] */
    /* renamed from: a */
    public final InterfaceC9122dV1 m7696a(Class cls) {
        C10528oU1 c10528oU1M23474n;
        Charset charset = BS1.f826a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.f11402b;
        InterfaceC9122dV1 interfaceC9122dV1 = (InterfaceC9122dV1) concurrentHashMap.get(cls);
        if (interfaceC9122dV1 != null) {
            return interfaceC9122dV1;
        }
        C11803yT1 c11803yT1 = this.f11401a;
        c11803yT1.getClass();
        AbstractC10908rS1.class.isAssignableFrom(cls);
        YU1 yu1Mo3059d = c11803yT1.f46272a.mo3059d(cls);
        boolean z = (yu1Mo3059d.f14321d & 2) == 2;
        C9606hH1 c9606hH1 = AbstractC11406vL1.f44343a;
        if (z) {
            c10528oU1M23474n = new C11424vU1(yu1Mo3059d.f14318a);
        } else {
            if (ET1.f2718a[AbstractC7222ym.m26247x(yu1Mo3059d.m9301b())] == 1) {
                c9606hH1 = null;
            }
            c10528oU1M23474n = C10528oU1.m23474n(yu1Mo3059d, c9606hH1);
        }
        InterfaceC9122dV1 interfaceC9122dV12 = (InterfaceC9122dV1) concurrentHashMap.putIfAbsent(cls, c10528oU1M23474n);
        return interfaceC9122dV12 != null ? interfaceC9122dV12 : c10528oU1M23474n;
    }
}
