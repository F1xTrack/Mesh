package defpackage;

import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class IH1 {
    public static final IH1 c = new IH1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C1016Mu0 a = new C1016Mu0(2);

    public final PH1 a(Class cls) {
        C7001sH1 c7001sH1;
        Class cls2;
        Charset charset = AbstractC3356dF1.a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        PH1 ph1T = (PH1) concurrentHashMap.get(cls);
        if (ph1T == null) {
            C1016Mu0 c1016Mu0 = this.a;
            c1016Mu0.getClass();
            Class cls3 = UH1.a;
            if (!EE1.class.isAssignableFrom(cls) && (cls2 = UH1.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            NH1 nh1B = ((C6998sG1) c1016Mu0.b).b(cls);
            if ((nh1B.d & 2) == 2) {
                boolean zIsAssignableFrom = EE1.class.isAssignableFrom(cls);
                DB1 db1 = nh1B.a;
                if (zIsAssignableFrom) {
                    c7001sH1 = new C7001sH1(UH1.c, ND1.a, db1);
                } else {
                    PI1 pi1 = UH1.b;
                    ID1 id1 = ND1.b;
                    if (id1 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c7001sH1 = new C7001sH1(pi1, id1, db1);
                }
                ph1T = c7001sH1;
            } else if (EE1.class.isAssignableFrom(cls)) {
                if (nh1B.b() - 1 != 1) {
                    int i = BH1.a;
                    QF1 qf1 = XF1.b;
                    PI1 pi12 = UH1.c;
                    ID1 id12 = ND1.a;
                    int i2 = NG1.a;
                    ph1T = C6429pH1.t(nh1B, qf1, pi12, id12);
                } else {
                    int i3 = BH1.a;
                    QF1 qf12 = XF1.b;
                    PI1 pi13 = UH1.c;
                    int i4 = NG1.a;
                    ph1T = C6429pH1.t(nh1B, qf12, pi13, null);
                }
            } else if (nh1B.b() - 1 != 1) {
                int i5 = BH1.a;
                LF1 lf1 = XF1.a;
                PI1 pi14 = UH1.b;
                ID1 id13 = ND1.b;
                if (id13 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                int i6 = NG1.a;
                ph1T = C6429pH1.t(nh1B, lf1, pi14, id13);
            } else {
                int i7 = BH1.a;
                LF1 lf12 = XF1.a;
                PI1 pi15 = UH1.b;
                int i8 = NG1.a;
                ph1T = C6429pH1.t(nh1B, lf12, pi15, null);
            }
            PH1 ph1 = (PH1) concurrentHashMap.putIfAbsent(cls, ph1T);
            if (ph1 != null) {
                return ph1;
            }
        }
        return ph1T;
    }
}
