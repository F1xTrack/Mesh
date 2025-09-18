package p000;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class YF0 {

    /* renamed from: c */
    public static final YF0 f14212c = new YF0();

    /* renamed from: b */
    public final ConcurrentHashMap f14214b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C8342Tu0 f14213a = new C8342Tu0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [vr0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [vr0] */
    /* renamed from: a */
    public final DV0 m9251a(Class cls) {
        C11213tr0 c11213tr0M25000q;
        C11213tr0 c11469vr0;
        Class cls2;
        Charset charset = AbstractC11635x90.f45425a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.f14214b;
        DV0 dv0 = (DV0) concurrentHashMap.get(cls);
        if (dv0 != null) {
            return dv0;
        }
        C8342Tu0 c8342Tu0 = this.f14213a;
        c8342Tu0.getClass();
        Class cls3 = HV0.f4324a;
        if (!AbstractC11868z00.class.isAssignableFrom(cls) && (cls2 = HV0.f4324a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C9993kJ0 c9993kJ0Mo6137a = ((C8066Om0) c8342Tu0.f11590b).mo6137a(cls);
        if ((c9993kJ0Mo6137a.f36424d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC11868z00.class.isAssignableFrom(cls);
            AbstractC0568J0 abstractC0568J0 = c9993kJ0Mo6137a.f36421a;
            if (zIsAssignableFrom) {
                c11469vr0 = new C11469vr0(HV0.f4326c, AbstractC0469HR.f4288a, abstractC0568J0);
            } else {
                C9784ig1 c9784ig1 = HV0.f4325b;
                C0343FR c0343fr = AbstractC0469HR.f4289b;
                if (c0343fr == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c11469vr0 = new C11469vr0(c9784ig1, c0343fr, abstractC0568J0);
            }
            c11213tr0M25000q = c11469vr0;
        } else if (AbstractC11868z00.class.isAssignableFrom(cls)) {
            c11213tr0M25000q = AbstractC7222ym.m26247x(c9993kJ0Mo6137a.m22189d()) != 1 ? C11213tr0.m25000q(c9993kJ0Mo6137a, AbstractC11093sv0.f42727b, AbstractC11580wj0.f45047b, HV0.f4326c, AbstractC0469HR.f4288a, AbstractC10053kn0.f36694b) : C11213tr0.m25000q(c9993kJ0Mo6137a, AbstractC11093sv0.f42727b, AbstractC11580wj0.f45047b, HV0.f4326c, null, AbstractC10053kn0.f36694b);
        } else if (AbstractC7222ym.m26247x(c9993kJ0Mo6137a.m22189d()) != 1) {
            C10837qv0 c10837qv0 = AbstractC11093sv0.f42726a;
            C11069sj0 c11069sj0 = AbstractC11580wj0.f45046a;
            C9784ig1 c9784ig12 = HV0.f4325b;
            C0343FR c0343fr2 = AbstractC0469HR.f4289b;
            if (c0343fr2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c11213tr0M25000q = C11213tr0.m25000q(c9993kJ0Mo6137a, c10837qv0, c11069sj0, c9784ig12, c0343fr2, AbstractC10053kn0.f36693a);
        } else {
            c11213tr0M25000q = C11213tr0.m25000q(c9993kJ0Mo6137a, AbstractC11093sv0.f42726a, AbstractC11580wj0.f45046a, HV0.f4325b, null, AbstractC10053kn0.f36693a);
        }
        DV0 dv02 = (DV0) concurrentHashMap.putIfAbsent(cls, c11213tr0M25000q);
        return dv02 != null ? dv02 : c11213tr0M25000q;
    }
}
