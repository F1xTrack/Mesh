package defpackage;

import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ZF0 {
    public static final ZF0 c = new ZF0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C1304Qm0 a = new C1304Qm0(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [wr0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [wr0] */
    public final EV0 a(Class cls) {
        C7490ur0 c7490ur0X;
        C7490ur0 c7871wr0;
        Class cls2;
        AbstractC8309z90.a(cls, RemoteMessageAttributes.MESSAGE_TYPE);
        ConcurrentHashMap concurrentHashMap = this.b;
        EV0 ev0 = (EV0) concurrentHashMap.get(cls);
        if (ev0 != null) {
            return ev0;
        }
        C1304Qm0 c1304Qm0 = this.a;
        c1304Qm0.getClass();
        Class cls3 = IV0.a;
        if (!B00.class.isAssignableFrom(cls) && (cls2 = IV0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C5670lJ0 c5670lJ0A = ((C1226Pm0) c1304Qm0.b).a(cls);
        if ((c5670lJ0A.d & 2) == 2) {
            boolean zIsAssignableFrom = B00.class.isAssignableFrom(cls);
            B00 b00 = c5670lJ0A.a;
            if (zIsAssignableFrom) {
                c7871wr0 = new C7871wr0(IV0.d, IR.a, b00);
            } else {
                C5358jg1 c5358jg1 = IV0.b;
                GR gr = IR.b;
                if (gr == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c7871wr0 = new C7871wr0(c5358jg1, gr, b00);
            }
            c7490ur0X = c7871wr0;
        } else if (B00.class.isAssignableFrom(cls)) {
            c7490ur0X = c5670lJ0A.d() == 1 ? C7490ur0.x(c5670lJ0A, AbstractC7311tv0.b, AbstractC8037xj0.b, IV0.d, IR.a, AbstractC5760ln0.b) : C7490ur0.x(c5670lJ0A, AbstractC7311tv0.b, AbstractC8037xj0.b, IV0.d, null, AbstractC5760ln0.b);
        } else if (c5670lJ0A.d() == 1) {
            C6929rv0 c6929rv0 = AbstractC7311tv0.a;
            C7275tj0 c7275tj0 = AbstractC8037xj0.a;
            C5358jg1 c5358jg12 = IV0.b;
            GR gr2 = IR.b;
            if (gr2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            c7490ur0X = C7490ur0.x(c5670lJ0A, c6929rv0, c7275tj0, c5358jg12, gr2, AbstractC5760ln0.a);
        } else {
            c7490ur0X = C7490ur0.x(c5670lJ0A, AbstractC7311tv0.a, AbstractC8037xj0.a, IV0.c, null, AbstractC5760ln0.a);
        }
        EV0 ev02 = (EV0) concurrentHashMap.putIfAbsent(cls, c7490ur0X);
        return ev02 != null ? ev02 : c7490ur0X;
    }
}
