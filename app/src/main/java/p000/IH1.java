package p000;

import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class IH1 {

    /* renamed from: c */
    public static final IH1 f4877c = new IH1();

    /* renamed from: b */
    public final ConcurrentHashMap f4879b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C7978Mu0 f4878a = new C7978Mu0(2);

    /* renamed from: a */
    public final PH1 m3806a(Class cls) {
        C11014sH1 c11014sH1;
        Class cls2;
        Charset charset = AbstractC9090dF1.f25904a;
        if (cls == null) {
            throw new NullPointerException(RemoteMessageAttributes.MESSAGE_TYPE);
        }
        ConcurrentHashMap concurrentHashMap = this.f4879b;
        PH1 ph1M23701t = (PH1) concurrentHashMap.get(cls);
        if (ph1M23701t == null) {
            C7978Mu0 c7978Mu0 = this.f4878a;
            c7978Mu0.getClass();
            Class cls3 = UH1.f11716a;
            if (!EE1.class.isAssignableFrom(cls) && (cls2 = UH1.f11716a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            NH1 nh1Mo8738b = ((C11012sG1) c7978Mu0.f7393b).mo8738b(cls);
            if ((nh1Mo8738b.f7718d & 2) == 2) {
                boolean zIsAssignableFrom = EE1.class.isAssignableFrom(cls);
                DB1 db1 = nh1Mo8738b.f7715a;
                if (zIsAssignableFrom) {
                    c11014sH1 = new C11014sH1(UH1.f11718c, ND1.f7583a, db1);
                } else {
                    PI1 pi1 = UH1.f11717b;
                    ID1 id1 = ND1.f7584b;
                    if (id1 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    c11014sH1 = new C11014sH1(pi1, id1, db1);
                }
                ph1M23701t = c11014sH1;
            } else if (EE1.class.isAssignableFrom(cls)) {
                if (nh1Mo8738b.m5616b() - 1 != 1) {
                    int i = BH1.f703a;
                    QF1 qf1 = XF1.f13647b;
                    PI1 pi12 = UH1.f11718c;
                    ID1 id12 = ND1.f7583a;
                    int i2 = NG1.f7713a;
                    ph1M23701t = C10630pH1.m23701t(nh1Mo8738b, qf1, pi12, id12);
                } else {
                    int i3 = BH1.f703a;
                    QF1 qf12 = XF1.f13647b;
                    PI1 pi13 = UH1.f11718c;
                    int i4 = NG1.f7713a;
                    ph1M23701t = C10630pH1.m23701t(nh1Mo8738b, qf12, pi13, null);
                }
            } else if (nh1Mo8738b.m5616b() - 1 != 1) {
                int i5 = BH1.f703a;
                LF1 lf1 = XF1.f13646a;
                PI1 pi14 = UH1.f11717b;
                ID1 id13 = ND1.f7584b;
                if (id13 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                int i6 = NG1.f7713a;
                ph1M23701t = C10630pH1.m23701t(nh1Mo8738b, lf1, pi14, id13);
            } else {
                int i7 = BH1.f703a;
                LF1 lf12 = XF1.f13646a;
                PI1 pi15 = UH1.f11717b;
                int i8 = NG1.f7713a;
                ph1M23701t = C10630pH1.m23701t(nh1Mo8738b, lf12, pi15, null);
            }
            PH1 ph1 = (PH1) concurrentHashMap.putIfAbsent(cls, ph1M23701t);
            if (ph1 != null) {
                return ph1;
            }
        }
        return ph1M23701t;
    }
}
