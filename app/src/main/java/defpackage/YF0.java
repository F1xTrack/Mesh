package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class YF0 {
    public static final YF0 c = new YF0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C1562Tu0 a = new C1562Tu0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [vr0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [vr0] */
    public final DV0 a(Class cls) {
        C7299tr0 c7299tr0Q;
        C7299tr0 c7681vr0;
        Class cls2;
        Charset charset = AbstractC7929x90.a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        DV0 dv0 = (DV0) concurrentHashMap.get(cls);
        if (dv0 != null) {
            return dv0;
        }
        C1562Tu0 c1562Tu0 = this.a;
        c1562Tu0.getClass();
        Class cls3 = HV0.a;
        if (!AbstractC8279z00.class.isAssignableFrom(cls) && (cls2 = HV0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C5479kJ0 c5479kJ0A = ((C1148Om0) c1562Tu0.b).a(cls);
        if ((c5479kJ0A.d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC8279z00.class.isAssignableFrom(cls);
            J0 j0 = c5479kJ0A.a;
            if (zIsAssignableFrom) {
                c7681vr0 = new C7681vr0(HV0.c, HR.a, j0);
            } else {
                C4390ig1 c4390ig1 = HV0.b;
                FR fr = HR.b;
                if (fr == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c7681vr0 = new C7681vr0(c4390ig1, fr, j0);
            }
            c7299tr0Q = c7681vr0;
        } else if (AbstractC8279z00.class.isAssignableFrom(cls)) {
            c7299tr0Q = AbstractC8235ym.x(c5479kJ0A.d()) != 1 ? C7299tr0.q(c5479kJ0A, AbstractC7120sv0.b, AbstractC7847wj0.b, HV0.c, HR.a, AbstractC5569kn0.b) : C7299tr0.q(c5479kJ0A, AbstractC7120sv0.b, AbstractC7847wj0.b, HV0.c, null, AbstractC5569kn0.b);
        } else if (AbstractC8235ym.x(c5479kJ0A.d()) != 1) {
            C6739qv0 c6739qv0 = AbstractC7120sv0.a;
            C7084sj0 c7084sj0 = AbstractC7847wj0.a;
            C4390ig1 c4390ig12 = HV0.b;
            FR fr2 = HR.b;
            if (fr2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c7299tr0Q = C7299tr0.q(c5479kJ0A, c6739qv0, c7084sj0, c4390ig12, fr2, AbstractC5569kn0.a);
        } else {
            c7299tr0Q = C7299tr0.q(c5479kJ0A, AbstractC7120sv0.a, AbstractC7847wj0.a, HV0.b, null, AbstractC5569kn0.a);
        }
        DV0 dv02 = (DV0) concurrentHashMap.putIfAbsent(cls, c7299tr0Q);
        return dv02 != null ? dv02 : c7299tr0Q;
    }
}
