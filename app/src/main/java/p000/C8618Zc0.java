package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Zc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8618Zc0 implements InterfaceC6593p3, InterfaceC11257uB0 {

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC10293mf0[] f15019h;

    /* renamed from: a */
    public final C7454Cs0 f15020a;

    /* renamed from: b */
    public final C8426Vk0 f15021b;

    /* renamed from: c */
    public final X01 f15022c;

    /* renamed from: d */
    public final C8426Vk0 f15023d;

    /* renamed from: e */
    public final C8270Sk0 f15024e;

    /* renamed from: f */
    public final C8426Vk0 f15025f;

    /* renamed from: g */
    public final C8270Sk0 f15026g;

    static {
        IP0 ip0 = BP0.f799a;
        f15019h = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8618Zc0.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), ip0.mo3850f(new GE0(ip0.mo3846b(C8618Zc0.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), ip0.mo3850f(new GE0(ip0.mo3846b(C8618Zc0.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C8618Zc0(C7454Cs0 c7454Cs0, C8582Yk0 c8582Yk0, C4090g1 c4090g1) {
        this.f15020a = c7454Cs0;
        this.f15021b = new C8426Vk0(c8582Yk0, c4090g1);
        C7165xs c7165xs = new C7165xs(new C0905ON(c7454Cs0, new C0664KX("java.io"), 1), C8340Tt0.m7798e("Serializable"), EnumC10575os0.f39326e, EnumC0118Bs.f1061b, AbstractC7230yu.m26274e(new C9787ii0(c8582Yk0, new C8462Wc0(this, 0))), c8582Yk0);
        c7165xs.m25952u(C9931jq0.f35419b, C1156SN.f10705a, null);
        this.f15022c = c7165xs.mo1492m();
        this.f15023d = new C8426Vk0(c8582Yk0, new C7053w5(this, 11, c8582Yk0));
        this.f15024e = new C8270Sk0(c8582Yk0, new ConcurrentHashMap(3, 1.0f, 2), new C0726LX(1), 0);
        this.f15025f = new C8426Vk0(c8582Yk0, new C8462Wc0(this, 1));
        this.f15026g = c8582Yk0.m9350b(new C8514Xc0(this, 0));
    }

    /* renamed from: a */
    public final C11957zh0 m9553a(InterfaceC6976us interfaceC6976us) {
        if (interfaceC6976us == null) {
            AbstractC11955zg0.m26490a(109);
            throw null;
        }
        C8340Tt0 c8340Tt0 = AbstractC11955zg0.f46926e;
        if (AbstractC11955zg0.m26491b(interfaceC6976us, AbstractC10604p41.f39800a) || !AbstractC11955zg0.m26489H(interfaceC6976us)) {
            return null;
        }
        C0789MX c0789mxM25155h = AbstractC6940uI.m25155h(interfaceC6976us);
        if (!c0789mxM25155h.m5390d()) {
            return null;
        }
        String str = C11309ub0.f43758a;
        C0055As c0055AsM25217f = C11309ub0.m25217f(c0789mxM25155h);
        if (c0055AsM25217f == null) {
            return null;
        }
        C0664KX c0664kxM359b = c0055AsM25217f.m359b();
        C7454Cs0 c7454Cs0 = m9554c().f10877a;
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47094a;
        InterfaceC6976us interfaceC6976usM3937c = IZ1.m3937c(c7454Cs0, c0664kxM359b);
        if (interfaceC6976usM3937c instanceof C11957zh0) {
            return (C11957zh0) interfaceC6976usM3937c;
        }
        return null;
    }

    @Override // p000.InterfaceC11257uB0
    /* renamed from: b */
    public final boolean mo6014b(InterfaceC6976us interfaceC6976us, C1277UI c1277ui) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        C11957zh0 c11957zh0M9553a = m9553a(interfaceC6976us);
        if (c11957zh0M9553a == null || !c1277ui.getAnnotations().mo3261g(AbstractC11385vB0.f44237a)) {
            return true;
        }
        m9554c().getClass();
        String strM17874a = AbstractC9210eB1.m17874a(c1277ui, 3);
        C7484Dh0 c7484Dh0M26514u = c11957zh0M9553a.m26514u();
        C8340Tt0 name = c1277ui.getName();
        O90.m5967e(name, "getName(...)");
        Collection collectionMo1769a = c7484Dh0M26514u.mo1769a(name, EnumC11985zv0.f47094a);
        if (!(collectionMo1769a instanceof Collection) || !collectionMo1769a.isEmpty()) {
            Iterator it = collectionMo1769a.iterator();
            while (it.hasNext()) {
                if (AbstractC9210eB1.m17874a((U01) it.next(), 3).equals(strM17874a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C8254Sc0 m9554c() {
        return (C8254Sc0) WS1.m8763b(this.f15021b, f15019h[0]);
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: d */
    public final Collection mo7644d(InterfaceC6976us interfaceC6976us) {
        boolean zIsAssignableFrom = true;
        O90.m5968f(interfaceC6976us, "classDescriptor");
        C0789MX c0789mxM25155h = AbstractC6940uI.m25155h(interfaceC6976us);
        LinkedHashSet linkedHashSet = C9004cd0.f17659a;
        C0789MX c0789mx = AbstractC10604p41.f39809g;
        boolean z = c0789mxM25155h.equals(c0789mx) || AbstractC10604p41.f39805c0.get(c0789mxM25155h) != null;
        X01 x01 = this.f15022c;
        if (z) {
            X01 x012 = (X01) WS1.m8763b(this.f15023d, f15019h[1]);
            O90.m5967e(x012, "<get-cloneableType>(...)");
            return AbstractC7230yu.m26275f(x012, x01);
        }
        if (!c0789mxM25155h.equals(c0789mx) && AbstractC10604p41.f39805c0.get(c0789mxM25155h) == null) {
            String str = C11309ub0.f43758a;
            C0055As c0055AsM25217f = C11309ub0.m25217f(c0789mxM25155h);
            if (c0055AsM25217f == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c0055AsM25217f.m359b().m4654b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? AbstractC7230yu.m26274e(x01) : C0779MN.f7117a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4 A[EDGE_INSN: B:134:0x01c4->B:61:0x01c4 BREAK  A[LOOP:3: B:74:0x01f1->B:135:?]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    @Override // p000.InterfaceC6593p3
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection mo7645f(p000.C8340Tt0 r17, p000.InterfaceC6976us r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8618Zc0.mo7645f(Tt0, us):java.util.Collection");
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: i */
    public final Collection mo7646i(InterfaceC6976us interfaceC6976us) {
        Set setMo6677b;
        O90.m5968f(interfaceC6976us, "classDescriptor");
        m9554c().getClass();
        C1156SN c1156sn = C1156SN.f10705a;
        C11957zh0 c11957zh0M9553a = m9553a(interfaceC6976us);
        return (c11957zh0M9553a == null || (setMo6677b = c11957zh0M9553a.m26514u().mo6677b()) == null) ? c1156sn : setMo6677b;
    }

    @Override // p000.InterfaceC6593p3
    /* renamed from: j */
    public final Collection mo7647j(InterfaceC6976us interfaceC6976us) {
        InterfaceC6976us interfaceC6976usM1933u;
        O90.m5968f(interfaceC6976us, "classDescriptor");
        EnumC0118Bs enumC0118BsMo1436l = interfaceC6976us.mo1436l();
        EnumC0118Bs enumC0118Bs = EnumC0118Bs.f1060a;
        C0779MN c0779mn = C0779MN.f7117a;
        if (enumC0118BsMo1436l != enumC0118Bs) {
            return c0779mn;
        }
        m9554c().getClass();
        C11957zh0 c11957zh0M9553a = m9553a(interfaceC6976us);
        if (c11957zh0M9553a == null || (interfaceC6976usM1933u = C7512Dv0.m1933u(AbstractC6940uI.m25154g(c11957zh0M9553a), C6681qS.f40877f)) == null) {
            return c0779mn;
        }
        C11571we1 c11571we1 = new C11571we1(AbstractC10639pM0.m23745a(interfaceC6976usM1933u, c11957zh0M9553a));
        List list = (List) c11957zh0M9553a.f46941q.f2161q.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C6707qs c6707qs = (C6707qs) next;
            C6707qs c6707qs2 = c6707qs;
            if (c6707qs2.getVisibility().f44322a.f42205b) {
                Collection collectionMo1435g = interfaceC6976usM1933u.mo1435g();
                O90.m5967e(collectionMo1435g, "getConstructors(...)");
                Collection<C6707qs> collection = collectionMo1435g;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (C6707qs c6707qs3 : collection) {
                        O90.m5965c(c6707qs3);
                        if (C11229tz0.m25053j(c6707qs3, c6707qs.mo114b(c11571we1)) == 1) {
                            break;
                        }
                    }
                }
                if (c6707qs2.mo1221f0().size() == 1) {
                    List listMo1221f0 = c6707qs2.mo1221f0();
                    O90.m5967e(listMo1221f0, "getValueParameters(...)");
                    InterfaceC0873Ns interfaceC0873NsMo1962a = ((C8473Wh1) AbstractC7167xu.m25972R(listMo1221f0)).getType().mo3797E().mo1962a();
                    if (O90.m5963a(interfaceC0873NsMo1962a != null ? AbstractC6940uI.m25155h(interfaceC0873NsMo1962a) : null, AbstractC6940uI.m25155h(interfaceC6976us))) {
                    }
                }
                if (!AbstractC11955zg0.m26484C(c6707qs) && !C9004cd0.f17664f.contains(AbstractC8821bB1.m10433a(c11957zh0M9553a, AbstractC9210eB1.m17874a(c6707qs, 3)))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6707qs c6707qs4 = (C6707qs) it2.next();
            C6707qs c6707qs5 = c6707qs4;
            c6707qs5.getClass();
            C0099BZ c0099bzM1216E1 = c6707qs5.m1216E1(C11571we1.f45010b);
            c0099bzM1216E1.f881b = interfaceC6976us;
            c0099bzM1216E1.mo755A(interfaceC6976us.mo1492m());
            c0099bzM1216E1.f894o = true;
            AbstractC11316ue1 abstractC11316ue1M25665f = c11571we1.m25665f();
            if (abstractC11316ue1M25665f == null) {
                C0099BZ.m754b(37);
                throw null;
            }
            c0099bzM1216E1.f880a = abstractC11316ue1M25665f;
            if (!C9004cd0.f17665g.contains(AbstractC8821bB1.m10433a(c11957zh0M9553a, AbstractC9210eB1.m17874a(c6707qs4, 3)))) {
                c0099bzM1216E1.mo767u((InterfaceC0510I5) WS1.m8763b(this.f15025f, f15019h[2]));
            }
            AbstractC0162CZ abstractC0162CZMo1214B1 = c0099bzM1216E1.f903x.mo1214B1(c0099bzM1216E1);
            O90.m5966d(abstractC0162CZMo1214B1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C6707qs) abstractC0162CZMo1214B1);
        }
        return arrayList2;
    }
}
