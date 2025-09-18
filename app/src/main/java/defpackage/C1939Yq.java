package defpackage;

import com.yandex.metrica.impl.ob.C2938n;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import com.yandex.metrica.impl.ob.InterfaceC3062s;
import io.sentry.E1;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.j;
import io.sentry.android.replay.u;
import io.sentry.config.a;
import io.sentry.protocol.t;
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
public final class C1939Yq extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1939Yq(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                AbstractC7225tS1 abstractC7225tS1 = ((C2017Zq) this.f).b;
                List listA = (List) this.g;
                if (abstractC7225tS1 != null) {
                    listA = abstractC7225tS1.a((String) this.h, listA);
                }
                List<Certificate> list = listA;
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
                for (Certificate certificate : list) {
                    O90.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                return ((C8019xd0) this.f).b((ByteArrayInputStream) this.g, ((C7955xI) ((RI) this.h).b.c).p);
            case 2:
                InterfaceC1087Ns interfaceC1087NsA = ((AbstractC0663Ig0) this.f).E().a();
                if (!(interfaceC1087NsA instanceof InterfaceC7492us)) {
                    throw new C1420Rz("Supertype not a class: " + interfaceC1087NsA, 1);
                }
                Class clsK = AbstractC0433Fh1.k((InterfaceC7492us) interfaceC1087NsA);
                C1979Zd0 c1979Zd0 = (C1979Zd0) this.g;
                if (clsK == null) {
                    throw new C1420Rz("Unsupported superclass of " + c1979Zd0 + ": " + interfaceC1087NsA, 1);
                }
                C3430de0 c3430de0 = (C3430de0) this.h;
                boolean zA = O90.a(c3430de0.b.getSuperclass(), clsK);
                Class cls = c3430de0.b;
                if (zA) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    O90.c(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                O90.e(interfaces, "getInterfaces(...)");
                int iS = J8.s(interfaces, clsK);
                if (iS >= 0) {
                    Type type = cls.getGenericInterfaces()[iS];
                    O90.c(type);
                    return type;
                }
                throw new C1420Rz("No superclass of " + c1979Zd0 + " in Java reflection for " + interfaceC1087NsA, 1);
            case 3:
                AbstractC1289Qh0 abstractC1289Qh0 = (AbstractC1289Qh0) this.f;
                C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) abstractC1289Qh0.b.b).a;
                C7726w5 c7726w5 = new C7726w5(abstractC1289Qh0, (C5879mP0) this.g, (TO0) this.h);
                c1922Yk0.getClass();
                return new C1610Uk0(c1922Yk0, c7726w5);
            case 4:
                C2938n c2938n = C2938n.a;
                C6045nH c6045nH = (C6045nH) this.f;
                String str = (String) c6045nH.d;
                InterfaceC3062s interfaceC3062sE = ((InterfaceC3013q) c6045nH.c).e();
                O90.e(interfaceC3062sE, "utilsProvider.billingInfoManager");
                C2938n.a(c2938n, (LinkedHashMap) this.g, (Map) this.h, str, interfaceC3062sE, null, 16);
                return C1518Tf1.a;
            case 5:
                AbstractC7225tS1 abstractC7225tS12 = ((C2017Zq) this.f).b;
                O90.c(abstractC7225tS12);
                return abstractC7225tS12.a(((C6575q3) this.h).i.d, ((E20) this.g).a());
            case 6:
                u uVar = (u) this.g;
                if (uVar != null) {
                    c cVar = (c) this.h;
                    j jVar = cVar.i;
                    if (jVar != null) {
                        jVar.n("config.height", String.valueOf(uVar.b));
                    }
                    j jVar2 = cVar.i;
                    if (jVar2 != null) {
                        jVar2.n("config.width", String.valueOf(uVar.a));
                    }
                    j jVar3 = cVar.i;
                    if (jVar3 != null) {
                        jVar3.n("config.frame-rate", String.valueOf(uVar.e));
                    }
                    j jVar4 = cVar.i;
                    if (jVar4 != null) {
                        jVar4.n("config.bit-rate", String.valueOf(uVar.f));
                    }
                }
                return C1518Tf1.a;
            case 7:
                j jVar5 = ((c) this.h).i;
                if (jVar5 != null) {
                    jVar5.n("replay.id", String.valueOf((t) this.g));
                }
                return C1518Tf1.a;
            case 8:
                j jVar6 = ((c) this.h).i;
                if (jVar6 != null) {
                    jVar6.n("segment.id", String.valueOf((Integer) this.g));
                }
                return C1518Tf1.a;
            case 9:
                j jVar7 = ((c) this.h).i;
                if (jVar7 != null) {
                    jVar7.n("replay.type", String.valueOf((E1) this.g));
                }
                return C1518Tf1.a;
            case 10:
                j jVar8 = ((c) this.h).i;
                if (jVar8 != null) {
                    Date date = (Date) this.g;
                    jVar8.n("segment.timestamp", date == null ? null : a.s(date));
                }
                return C1518Tf1.a;
            default:
                j jVar9 = ((c) this.g).i;
                if (jVar9 != null) {
                    jVar9.n("replay.screen-at-start", String.valueOf((String) this.h));
                }
                return C1518Tf1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939Yq(Object obj, String str, c cVar) {
        super(0);
        this.e = 11;
        this.f = obj;
        this.h = str;
        this.g = cVar;
    }
}
