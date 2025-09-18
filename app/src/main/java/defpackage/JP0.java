package defpackage;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* loaded from: classes2.dex */
public class JP0 extends IP0 {
    public static AbstractC6497pe0 k(AbstractC8422zl abstractC8422zl) {
        InterfaceC5733le0 owner = abstractC8422zl.getOwner();
        return owner instanceof AbstractC6497pe0 ? (AbstractC6497pe0) owner : IN.b;
    }

    @Override // defpackage.IP0
    public final InterfaceC6878re0 a(EZ ez) {
        AbstractC6497pe0 abstractC6497pe0K = k(ez);
        String name = ez.getName();
        String signature = ez.getSignature();
        Object boundReceiver = ez.getBoundReceiver();
        O90.f(abstractC6497pe0K, "container");
        O90.f(name, "name");
        O90.f(signature, "signature");
        return new C7260te0(abstractC6497pe0K, name, signature, null, boundReceiver);
    }

    @Override // defpackage.IP0
    public final InterfaceC1667Vd0 b(Class cls) {
        return AbstractC6326ol.a(cls);
    }

    @Override // defpackage.IP0
    public final InterfaceC5733le0 c(Class cls, String str) {
        N8 n8 = AbstractC6326ol.a;
        O90.f(cls, "jClass");
        return (InterfaceC5733le0) AbstractC6326ol.b.k(cls);
    }

    @Override // defpackage.IP0
    public final InterfaceC0189Ce0 d(C0624Ht0 c0624Ht0) {
        return new C0345Ee0(k(c0624Ht0), c0624Ht0.getName(), c0624Ht0.getSignature(), c0624Ht0.getBoundReceiver());
    }

    @Override // defpackage.IP0
    public final InterfaceC1904Ye0 e(C2000Zk0 c2000Zk0) {
        return new C2367bf0(k(c2000Zk0), c2000Zk0.getName(), c2000Zk0.getSignature(), c2000Zk0.getBoundReceiver());
    }

    @Override // defpackage.IP0
    public final InterfaceC3433df0 f(GE0 ge0) {
        return new C4005gf0(k(ge0), ge0.getName(), ge0.getSignature(), ge0.getBoundReceiver());
    }

    @Override // defpackage.IP0
    public final InterfaceC4386if0 g(HE0 he0) {
        return new C5736lf0(k(he0), he0.getName(), he0.getSignature());
    }

    @Override // defpackage.IP0
    public final String h(InterfaceC7435uZ interfaceC7435uZ) throws Y90 {
        C7260te0 c7260te0B;
        O90.f(interfaceC7435uZ, "<this>");
        Metadata metadata = (Metadata) interfaceC7435uZ.getClass().getAnnotation(Metadata.class);
        C7260te0 c7260te0 = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                DR dr = C0732Jd0.a;
                O90.f(strArrD2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1522Th.a(strArrD1));
                DR dr2 = C0732Jd0.a;
                C6303od0 c6303od0G = C0732Jd0.g(byteArrayInputStream, strArrD2);
                C8019xd0 c8019xd0 = C4309iF0.v;
                DR dr3 = C0732Jd0.a;
                c8019xd0.getClass();
                C5780lu c5780lu = new C5780lu(byteArrayInputStream);
                K0 k0 = (K0) c8019xd0.a(c5780lu, dr3);
                try {
                    c5780lu.a(0);
                    if (!k0.e()) {
                        Y90 y90 = new Y90(new C7074sg().getMessage());
                        y90.a = k0;
                        throw y90;
                    }
                    C4309iF0 c4309iF0 = (C4309iF0) k0;
                    C6112nd0 c6112nd0 = new C6112nd0(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = interfaceC7435uZ.getClass();
                    GF0 gf0 = c4309iF0.p;
                    O90.e(gf0, "getTypeTable(...)");
                    c7260te0 = new C7260te0(IN.b, (U01) AbstractC0433Fh1.f(cls, c4309iF0, c6303od0G, new C5826m71(gf0), c6112nd0, C8357zP0.a));
                } catch (Y90 e) {
                    e.a = k0;
                    throw e;
                }
            }
        }
        if (c7260te0 == null || (c7260te0B = AbstractC0433Fh1.b(c7260te0)) == null) {
            return super.h(interfaceC7435uZ);
        }
        C5857mI c5857mI = QP0.a;
        AZ azP = c7260te0B.p();
        StringBuilder sb = new StringBuilder();
        QP0.a(azP, sb);
        List listF0 = azP.f0();
        O90.e(listF0, "getValueParameters(...)");
        AbstractC8069xu.G(listF0, sb, ", ", "(", ")", C3808fd0.I, 48);
        sb.append(" -> ");
        AbstractC0663Ig0 returnType = azP.getReturnType();
        O90.c(returnType);
        sb.append(QP0.d(returnType));
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    @Override // defpackage.IP0
    public final String i(AbstractC1676Vg0 abstractC1676Vg0) {
        return h(abstractC1676Vg0);
    }

    @Override // defpackage.IP0
    public final InterfaceC7454uf0 j(InterfaceC1667Vd0 interfaceC1667Vd0, List list, boolean z) {
        if (!(interfaceC1667Vd0 instanceof InterfaceC6538ps)) {
            return V22.a(interfaceC1667Vd0, list, z, Collections.emptyList());
        }
        Class clsB = ((InterfaceC6538ps) interfaceC1667Vd0).b();
        N8 n8 = AbstractC6326ol.a;
        O90.f(clsB, "jClass");
        O90.f(list, "arguments");
        if (list.isEmpty()) {
            return z ? (InterfaceC7454uf0) AbstractC6326ol.d.k(clsB) : (InterfaceC7454uf0) AbstractC6326ol.c.k(clsB);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC6326ol.e.k(clsB);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            C7835wf0 c7835wf0A = V22.a(AbstractC6326ol.a(clsB), list, z, MN.a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, c7835wf0A);
            obj = objPutIfAbsent == null ? c7835wf0A : objPutIfAbsent;
        }
        return (InterfaceC7454uf0) obj;
    }
}
