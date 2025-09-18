package p000;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ZF0 {

    /* renamed from: c */
    public static final ZF0 f14820c = new ZF0();

    /* renamed from: b */
    public final ConcurrentHashMap f14822b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C8170Qm0 f14821a = new C8170Qm0(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [wr0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [wr0] */
    /* renamed from: a */
    public final EV0 m9517a(Class cls) {
        C11341ur0 c11341ur0M25260x;
        C11341ur0 c11596wr0;
        Class cls2;
        AbstractC11889z90.m26313a(cls, RemoteMessageAttributes.MESSAGE_TYPE);
        ConcurrentHashMap concurrentHashMap = this.f14822b;
        EV0 ev0 = (EV0) concurrentHashMap.get(cls);
        if (ev0 != null) {
            return ev0;
        }
        C8170Qm0 c8170Qm0 = this.f14821a;
        c8170Qm0.getClass();
        Class cls3 = IV0.f4959a;
        if (!B00.class.isAssignableFrom(cls) && (cls2 = IV0.f4959a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C10121lJ0 c10121lJ0Mo6424a = ((C8118Pm0) c8170Qm0.f9780b).mo6424a(cls);
        if ((c10121lJ0Mo6424a.f37006d & 2) == 2) {
            boolean zIsAssignableFrom = B00.class.isAssignableFrom(cls);
            B00 b00 = c10121lJ0Mo6424a.f37003a;
            if (zIsAssignableFrom) {
                c11596wr0 = new C11596wr0(IV0.f4962d, AbstractC0532IR.f4933a, b00);
            } else {
                C9912jg1 c9912jg1 = IV0.f4960b;
                C0406GR c0406gr = AbstractC0532IR.f4934b;
                if (c0406gr == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c11596wr0 = new C11596wr0(c9912jg1, c0406gr, b00);
            }
            c11341ur0M25260x = c11596wr0;
        } else if (B00.class.isAssignableFrom(cls)) {
            c11341ur0M25260x = c10121lJ0Mo6424a.m22385d() == 1 ? C11341ur0.m25260x(c10121lJ0Mo6424a, AbstractC11221tv0.f43415b, AbstractC11707xj0.f45759b, IV0.f4962d, AbstractC0532IR.f4933a, AbstractC10181ln0.f37289b) : C11341ur0.m25260x(c10121lJ0Mo6424a, AbstractC11221tv0.f43415b, AbstractC11707xj0.f45759b, IV0.f4962d, null, AbstractC10181ln0.f37289b);
        } else if (c10121lJ0Mo6424a.m22385d() == 1) {
            C10965rv0 c10965rv0 = AbstractC11221tv0.f43414a;
            C11197tj0 c11197tj0 = AbstractC11707xj0.f45758a;
            C9912jg1 c9912jg12 = IV0.f4960b;
            C0406GR c0406gr2 = AbstractC0532IR.f4934b;
            if (c0406gr2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c11341ur0M25260x = C11341ur0.m25260x(c10121lJ0Mo6424a, c10965rv0, c11197tj0, c9912jg12, c0406gr2, AbstractC10181ln0.f37288a);
        } else {
            c11341ur0M25260x = C11341ur0.m25260x(c10121lJ0Mo6424a, AbstractC11221tv0.f43414a, AbstractC11707xj0.f45758a, IV0.f4961c, null, AbstractC10181ln0.f37288a);
        }
        EV0 ev02 = (EV0) concurrentHashMap.putIfAbsent(cls, c11341ur0M25260x);
        return ev02 != null ? ev02 : c11341ur0M25260x;
    }
}
