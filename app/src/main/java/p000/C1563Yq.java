package p000;

import com.yandex.metrica.impl.p022ob.C3453n;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.metrica.impl.p022ob.InterfaceC3583s;
import io.sentry.EnumC5762E1;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5961u;
import io.sentry.android.replay.capture.AbstractC5929c;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Yq */
/* loaded from: classes2.dex */
public final class C1563Yq extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f14553e;

    /* renamed from: f */
    public final /* synthetic */ Object f14554f;

    /* renamed from: g */
    public final /* synthetic */ Object f14555g;

    /* renamed from: h */
    public final /* synthetic */ Object f14556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1563Yq(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f14553e = i;
        this.f14554f = obj;
        this.f14555g = obj2;
        this.f14556h = obj3;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f14553e) {
            case 0:
                AbstractC11164tS1 abstractC11164tS1 = ((C1626Zq) this.f14554f).f15148b;
                List listMo6097a = (List) this.f14555g;
                if (abstractC11164tS1 != null) {
                    listMo6097a = abstractC11164tS1.mo6097a((String) this.f14556h, listMo6097a);
                }
                List<Certificate> list = listMo6097a;
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
                for (Certificate certificate : list) {
                    O90.m5966d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                return ((C11695xd0) this.f14554f).m25925b((ByteArrayInputStream) this.f14555g, ((C7129xI) ((AbstractC1088RI) this.f14556h).f10113b.f12662c).f45533p);
            case 2:
                InterfaceC0873Ns interfaceC0873NsMo1962a = ((AbstractC7742Ig0) this.f14554f).mo3797E().mo1962a();
                if (!(interfaceC0873NsMo1962a instanceof InterfaceC6976us)) {
                    throw new C1131Rz("Supertype not a class: " + interfaceC0873NsMo1962a, 1);
                }
                Class clsM2759k = AbstractC7589Fh1.m2759k((InterfaceC6976us) interfaceC0873NsMo1962a);
                C8620Zd0 c8620Zd0 = (C8620Zd0) this.f14555g;
                if (clsM2759k == null) {
                    throw new C1131Rz("Unsupported superclass of " + c8620Zd0 + ": " + interfaceC0873NsMo1962a, 1);
                }
                C9139de0 c9139de0 = (C9139de0) this.f14556h;
                boolean zM5963a = O90.m5963a(c9139de0.f26178b.getSuperclass(), clsM2759k);
                Class cls = c9139de0.f26178b;
                if (zM5963a) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    O90.m5965c(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                O90.m5967e(interfaces, "getInterfaces(...)");
                int iM4192s = AbstractC0576J8.m4192s(interfaces, clsM2759k);
                if (iM4192s >= 0) {
                    Type type = cls.getGenericInterfaces()[iM4192s];
                    O90.m5965c(type);
                    return type;
                }
                throw new C1131Rz("No superclass of " + c8620Zd0 + " in Java reflection for " + interfaceC0873NsMo1962a, 1);
            case 3:
                AbstractC8160Qh0 abstractC8160Qh0 = (AbstractC8160Qh0) this.f14554f;
                C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) abstractC8160Qh0.f9739b.f38228b).f29338a;
                C7053w5 c7053w5 = new C7053w5(abstractC8160Qh0, (C10261mP0) this.f14555g, (TO0) this.f14556h);
                c8582Yk0.getClass();
                return new C8374Uk0(c8582Yk0, c7053w5);
            case 4:
                C3453n c3453n = C3453n.f24271a;
                C6479nH c6479nH = (C6479nH) this.f14554f;
                String str = (String) c6479nH.f38230d;
                InterfaceC3583s interfaceC3583sMo3445e = ((InterfaceC3531q) c6479nH.f38229c).mo3445e();
                O90.m5967e(interfaceC3583sMo3445e, "utilsProvider.billingInfoManager");
                C3453n.m16437a(c3453n, (LinkedHashMap) this.f14555g, (Map) this.f14556h, str, interfaceC3583sMo3445e, null, 16);
                return C8313Tf1.f11463a;
            case 5:
                AbstractC11164tS1 abstractC11164tS12 = ((C1626Zq) this.f14554f).f15148b;
                O90.m5965c(abstractC11164tS12);
                return abstractC11164tS12.mo6097a(((C6656q3) this.f14556h).f40537i.f1831d, ((E20) this.f14555g).m1987a());
            case 6:
                C5961u c5961u = (C5961u) this.f14555g;
                if (c5961u != null) {
                    AbstractC5929c abstractC5929c = (AbstractC5929c) this.f14556h;
                    C5950j c5950j = abstractC5929c.f33925i;
                    if (c5950j != null) {
                        c5950j.m21674n("config.height", String.valueOf(c5961u.f34032b));
                    }
                    C5950j c5950j2 = abstractC5929c.f33925i;
                    if (c5950j2 != null) {
                        c5950j2.m21674n("config.width", String.valueOf(c5961u.f34031a));
                    }
                    C5950j c5950j3 = abstractC5929c.f33925i;
                    if (c5950j3 != null) {
                        c5950j3.m21674n("config.frame-rate", String.valueOf(c5961u.f34035e));
                    }
                    C5950j c5950j4 = abstractC5929c.f33925i;
                    if (c5950j4 != null) {
                        c5950j4.m21674n("config.bit-rate", String.valueOf(c5961u.f34036f));
                    }
                }
                return C8313Tf1.f11463a;
            case 7:
                C5950j c5950j5 = ((AbstractC5929c) this.f14556h).f33925i;
                if (c5950j5 != null) {
                    c5950j5.m21674n("replay.id", String.valueOf((C6104t) this.f14555g));
                }
                return C8313Tf1.f11463a;
            case 8:
                C5950j c5950j6 = ((AbstractC5929c) this.f14556h).f33925i;
                if (c5950j6 != null) {
                    c5950j6.m21674n("segment.id", String.valueOf((Integer) this.f14555g));
                }
                return C8313Tf1.f11463a;
            case 9:
                C5950j c5950j7 = ((AbstractC5929c) this.f14556h).f33925i;
                if (c5950j7 != null) {
                    c5950j7.m21674n("replay.type", String.valueOf((EnumC5762E1) this.f14555g));
                }
                return C8313Tf1.f11463a;
            case 10:
                C5950j c5950j8 = ((AbstractC5929c) this.f14556h).f33925i;
                if (c5950j8 != null) {
                    Date date = (Date) this.f14555g;
                    c5950j8.m21674n("segment.timestamp", date == null ? null : AbstractC6003a.m21759s(date));
                }
                return C8313Tf1.f11463a;
            default:
                C5950j c5950j9 = ((AbstractC5929c) this.f14555g).f33925i;
                if (c5950j9 != null) {
                    c5950j9.m21674n("replay.screen-at-start", String.valueOf((String) this.f14556h));
                }
                return C8313Tf1.f11463a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563Yq(Object obj, String str, AbstractC5929c abstractC5929c) {
        super(0);
        this.f14553e = 11;
        this.f14554f = obj;
        this.f14556h = str;
        this.f14555g = abstractC5929c;
    }
}
