package p000;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* loaded from: classes2.dex */
public class JP0 extends IP0 {
    /* renamed from: k */
    public static AbstractC10675pe0 m4314k(AbstractC7284zl abstractC7284zl) {
        InterfaceC10163le0 owner = abstractC7284zl.getOwner();
        return owner instanceof AbstractC10675pe0 ? (AbstractC10675pe0) owner : C0528IN.f4908b;
    }

    @Override // p000.IP0
    /* renamed from: a */
    public final InterfaceC10931re0 mo3845a(AbstractC0288EZ abstractC0288EZ) {
        AbstractC10675pe0 abstractC10675pe0M4314k = m4314k(abstractC0288EZ);
        String name = abstractC0288EZ.getName();
        String signature = abstractC0288EZ.getSignature();
        Object boundReceiver = abstractC0288EZ.getBoundReceiver();
        O90.m5968f(abstractC10675pe0M4314k, "container");
        O90.m5968f(name, "name");
        O90.m5968f(signature, "signature");
        return new C11187te0(abstractC10675pe0M4314k, name, signature, null, boundReceiver);
    }

    @Override // p000.IP0
    /* renamed from: b */
    public final InterfaceC8412Vd0 mo3846b(Class cls) {
        return AbstractC6572ol.m23539a(cls);
    }

    @Override // p000.IP0
    /* renamed from: c */
    public final InterfaceC10163le0 mo3847c(Class cls, String str) {
        C0827N8 c0827n8 = AbstractC6572ol.f39218a;
        O90.m5968f(cls, "jClass");
        return (InterfaceC10163le0) AbstractC6572ol.f39219b.m5559k(cls);
    }

    @Override // p000.IP0
    /* renamed from: d */
    public final InterfaceC7426Ce0 mo3848d(C7716Ht0 c7716Ht0) {
        return new C7530Ee0(m4314k(c7716Ht0), c7716Ht0.getName(), c7716Ht0.getSignature(), c7716Ht0.getBoundReceiver());
    }

    @Override // p000.IP0
    /* renamed from: e */
    public final InterfaceC8570Ye0 mo3849e(C8634Zk0 c8634Zk0) {
        return new C8880bf0(m4314k(c8634Zk0), c8634Zk0.getName(), c8634Zk0.getSignature(), c8634Zk0.getBoundReceiver());
    }

    @Override // p000.IP0
    /* renamed from: f */
    public final InterfaceC9141df0 mo3850f(GE0 ge0) {
        return new C9525gf0(m4314k(ge0), ge0.getName(), ge0.getSignature(), ge0.getBoundReceiver());
    }

    @Override // p000.IP0
    /* renamed from: g */
    public final InterfaceC9781if0 mo3851g(HE0 he0) {
        return new C10165lf0(m4314k(he0), he0.getName(), he0.getSignature());
    }

    @Override // p000.IP0
    /* renamed from: h */
    public final String mo3852h(InterfaceC6957uZ interfaceC6957uZ) throws Y90 {
        C11187te0 c11187te0M2750b;
        O90.m5968f(interfaceC6957uZ, "<this>");
        Metadata metadata = (Metadata) interfaceC6957uZ.getClass().getAnnotation(Metadata.class);
        C11187te0 c11187te0 = null;
        if (metadata != null) {
            String[] strArrM22266d1 = metadata.m22266d1();
            if (strArrM22266d1.length == 0) {
                strArrM22266d1 = null;
            }
            if (strArrM22266d1 != null) {
                String[] strArrM22267d2 = metadata.m22267d2();
                C0217DR c0217dr = C7788Jd0.f5651a;
                O90.m5968f(strArrM22267d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1239Th.m7726a(strArrM22266d1));
                C0217DR c0217dr2 = C7788Jd0.f5651a;
                C10545od0 c10545od0M4376g = C7788Jd0.m4376g(byteArrayInputStream, strArrM22267d2);
                C11695xd0 c11695xd0 = C9729iF0.f28980v;
                C0217DR c0217dr3 = C7788Jd0.f5651a;
                c11695xd0.getClass();
                C6392lu c6392lu = new C6392lu(byteArrayInputStream);
                AbstractC0631K0 abstractC0631K0 = (AbstractC0631K0) c11695xd0.mo21982a(c6392lu, c0217dr3);
                try {
                    c6392lu.m22573a(0);
                    if (!abstractC0631K0.mo131e()) {
                        Y90 y90 = new Y90(new C6838sg().getMessage());
                        y90.f14178a = abstractC0631K0;
                        throw y90;
                    }
                    C9729iF0 c9729iF0 = (C9729iF0) abstractC0631K0;
                    C10417nd0 c10417nd0 = new C10417nd0(metadata.m22269mv(), (metadata.m22271xi() & 8) != 0);
                    Class<?> cls = interfaceC6957uZ.getClass();
                    GF0 gf0 = c9729iF0.f28995p;
                    O90.m5967e(gf0, "getTypeTable(...)");
                    c11187te0 = new C11187te0(C0528IN.f4908b, (U01) AbstractC7589Fh1.m2754f(cls, c9729iF0, c10545od0M4376g, new C10226m71(gf0), c10417nd0, C11921zP0.f46828a));
                } catch (Y90 e) {
                    e.f14178a = abstractC0631K0;
                    throw e;
                }
            }
        }
        if (c11187te0 == null || (c11187te0M2750b = AbstractC7589Fh1.m2750b(c11187te0)) == null) {
            return super.mo3852h(interfaceC6957uZ);
        }
        C6417mI c6417mI = QP0.f9616a;
        InterfaceC0036AZ interfaceC0036AZMo8094p = c11187te0M2750b.mo8094p();
        StringBuilder sb = new StringBuilder();
        QP0.m6682a(interfaceC0036AZMo8094p, sb);
        List listMo1221f0 = interfaceC0036AZMo8094p.mo1221f0();
        O90.m5967e(listMo1221f0, "getValueParameters(...)");
        AbstractC7167xu.m25961G(listMo1221f0, sb, ", ", "(", ")", C9393fd0.f27279I, 48);
        sb.append(" -> ");
        AbstractC7742Ig0 returnType = interfaceC0036AZMo8094p.getReturnType();
        O90.m5965c(returnType);
        sb.append(QP0.m6685d(returnType));
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    @Override // p000.IP0
    /* renamed from: i */
    public final String mo3853i(AbstractC8418Vg0 abstractC8418Vg0) {
        return mo3852h(abstractC8418Vg0);
    }

    @Override // p000.IP0
    /* renamed from: j */
    public final InterfaceC11317uf0 mo3854j(InterfaceC8412Vd0 interfaceC8412Vd0, List list, boolean z) {
        if (!(interfaceC8412Vd0 instanceof InterfaceC6644ps)) {
            return V22.m8286a(interfaceC8412Vd0, list, z, Collections.emptyList());
        }
        Class clsMo2807b = ((InterfaceC6644ps) interfaceC8412Vd0).mo2807b();
        C0827N8 c0827n8 = AbstractC6572ol.f39218a;
        O90.m5968f(clsMo2807b, "jClass");
        O90.m5968f(list, "arguments");
        if (list.isEmpty()) {
            return z ? (InterfaceC11317uf0) AbstractC6572ol.f39221d.m5559k(clsMo2807b) : (InterfaceC11317uf0) AbstractC6572ol.f39220c.m5559k(clsMo2807b);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC6572ol.f39222e.m5559k(clsMo2807b);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            C11572wf0 c11572wf0M8286a = V22.m8286a(AbstractC6572ol.m23539a(clsMo2807b), list, z, C0779MN.f7117a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, c11572wf0M8286a);
            obj = objPutIfAbsent == null ? c11572wf0M8286a : objPutIfAbsent;
        }
        return (InterfaceC11317uf0) obj;
    }
}
