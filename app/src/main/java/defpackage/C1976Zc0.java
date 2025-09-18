package defpackage;

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
public final class C1976Zc0 implements InterfaceC6384p3, InterfaceC7364uB0 {
    public static final /* synthetic */ InterfaceC5927mf0[] h;
    public final C0231Cs0 a;
    public final C1688Vk0 b;
    public final X01 c;
    public final C1688Vk0 d;
    public final C1454Sk0 e;
    public final C1688Vk0 f;
    public final C1454Sk0 g;

    static {
        IP0 ip0 = BP0.a;
        h = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1976Zc0.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), ip0.f(new GE0(ip0.b(C1976Zc0.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), ip0.f(new GE0(ip0.b(C1976Zc0.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C1976Zc0(C0231Cs0 c0231Cs0, C1922Yk0 c1922Yk0, C3881g1 c3881g1) {
        this.a = c0231Cs0;
        this.b = new C1688Vk0(c1922Yk0, c3881g1);
        C8063xs c8063xs = new C8063xs(new ON(c0231Cs0, new KX("java.io"), 1), C1559Tt0.e("Serializable"), EnumC6348os0.e, EnumC0152Bs.b, AbstractC8259yu.e(new C4395ii0(c1922Yk0, new C1742Wc0(this, 0))), c1922Yk0);
        c8063xs.u(C5387jq0.b, SN.a, null);
        this.c = c8063xs.m();
        this.d = new C1688Vk0(c1922Yk0, new C7726w5(this, 11, c1922Yk0));
        this.e = new C1454Sk0(c1922Yk0, new ConcurrentHashMap(3, 1.0f, 2), new LX(1), 0);
        this.f = new C1688Vk0(c1922Yk0, new C1742Wc0(this, 1));
        this.g = c1922Yk0.b(new C1820Xc0(this, 0));
    }

    public final C8411zh0 a(InterfaceC7492us interfaceC7492us) {
        if (interfaceC7492us == null) {
            AbstractC8408zg0.a(109);
            throw null;
        }
        C1559Tt0 c1559Tt0 = AbstractC8408zg0.e;
        if (AbstractC8408zg0.b(interfaceC7492us, AbstractC6390p41.a) || !AbstractC8408zg0.H(interfaceC7492us)) {
            return null;
        }
        MX mxH = AbstractC7384uI.h(interfaceC7492us);
        if (!mxH.d()) {
            return null;
        }
        String str = C7442ub0.a;
        C0074As c0074AsF = C7442ub0.f(mxH);
        if (c0074AsF == null) {
            return null;
        }
        KX kxB = c0074AsF.b();
        C0231Cs0 c0231Cs0 = c().a;
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.a;
        InterfaceC7492us interfaceC7492usC = IZ1.c(c0231Cs0, kxB);
        if (interfaceC7492usC instanceof C8411zh0) {
            return (C8411zh0) interfaceC7492usC;
        }
        return null;
    }

    @Override // defpackage.InterfaceC7364uB0
    public final boolean b(InterfaceC7492us interfaceC7492us, UI ui) {
        O90.f(interfaceC7492us, "classDescriptor");
        C8411zh0 c8411zh0A = a(interfaceC7492us);
        if (c8411zh0A == null || !ui.getAnnotations().g(AbstractC7555vB0.a)) {
            return true;
        }
        c().getClass();
        String strA = AbstractC3534eB1.a(ui, 3);
        C0276Dh0 c0276Dh0U = c8411zh0A.u();
        C1559Tt0 name = ui.getName();
        O90.e(name, "getName(...)");
        Collection collectionA = c0276Dh0U.a(name, EnumC8453zv0.a);
        if (!(collectionA instanceof Collection) || !collectionA.isEmpty()) {
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                if (AbstractC3534eB1.a((U01) it.next(), 3).equals(strA)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C1430Sc0 c() {
        return (C1430Sc0) WS1.b(this.b, h[0]);
    }

    @Override // defpackage.InterfaceC6384p3
    public final Collection d(InterfaceC7492us interfaceC7492us) {
        boolean zIsAssignableFrom = true;
        O90.f(interfaceC7492us, "classDescriptor");
        MX mxH = AbstractC7384uI.h(interfaceC7492us);
        LinkedHashSet linkedHashSet = C2551cd0.a;
        MX mx = AbstractC6390p41.g;
        boolean z = mxH.equals(mx) || AbstractC6390p41.c0.get(mxH) != null;
        X01 x01 = this.c;
        if (z) {
            X01 x012 = (X01) WS1.b(this.d, h[1]);
            O90.e(x012, "<get-cloneableType>(...)");
            return AbstractC8259yu.f(x012, x01);
        }
        if (!mxH.equals(mx) && AbstractC6390p41.c0.get(mxH) == null) {
            String str = C7442ub0.a;
            C0074As c0074AsF = C7442ub0.f(mxH);
            if (c0074AsF == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c0074AsF.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? AbstractC8259yu.e(x01) : MN.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4 A[EDGE_INSN: B:134:0x01c4->B:61:0x01c4 BREAK  A[LOOP:3: B:74:0x01f1->B:135:?]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    @Override // defpackage.InterfaceC6384p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection f(defpackage.C1559Tt0 r17, defpackage.InterfaceC7492us r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1976Zc0.f(Tt0, us):java.util.Collection");
    }

    @Override // defpackage.InterfaceC6384p3
    public final Collection i(InterfaceC7492us interfaceC7492us) {
        Set setB;
        O90.f(interfaceC7492us, "classDescriptor");
        c().getClass();
        SN sn = SN.a;
        C8411zh0 c8411zh0A = a(interfaceC7492us);
        return (c8411zh0A == null || (setB = c8411zh0A.u().b()) == null) ? sn : setB;
    }

    @Override // defpackage.InterfaceC6384p3
    public final Collection j(InterfaceC7492us interfaceC7492us) {
        InterfaceC7492us interfaceC7492usU;
        O90.f(interfaceC7492us, "classDescriptor");
        EnumC0152Bs enumC0152BsL = interfaceC7492us.l();
        EnumC0152Bs enumC0152Bs = EnumC0152Bs.a;
        MN mn = MN.a;
        if (enumC0152BsL != enumC0152Bs) {
            return mn;
        }
        c().getClass();
        C8411zh0 c8411zh0A = a(interfaceC7492us);
        if (c8411zh0A == null || (interfaceC7492usU = C0318Dv0.u(AbstractC7384uI.g(c8411zh0A), C6651qS.f)) == null) {
            return mn;
        }
        C7833we1 c7833we1 = new C7833we1(AbstractC6443pM0.a(interfaceC7492usU, c8411zh0A));
        List list = (List) c8411zh0A.q.q.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C6729qs c6729qs = (C6729qs) next;
            C6729qs c6729qs2 = c6729qs;
            if (c6729qs2.getVisibility().a.b) {
                Collection collectionG = interfaceC7492usU.g();
                O90.e(collectionG, "getConstructors(...)");
                Collection<C6729qs> collection = collectionG;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (C6729qs c6729qs3 : collection) {
                        O90.c(c6729qs3);
                        if (C7323tz0.j(c6729qs3, c6729qs.b(c7833we1)) == 1) {
                            break;
                        }
                    }
                }
                if (c6729qs2.f0().size() == 1) {
                    List listF0 = c6729qs2.f0();
                    O90.e(listF0, "getValueParameters(...)");
                    InterfaceC1087Ns interfaceC1087NsA = ((C1758Wh1) AbstractC8069xu.R(listF0)).getType().E().a();
                    if (O90.a(interfaceC1087NsA != null ? AbstractC7384uI.h(interfaceC1087NsA) : null, AbstractC7384uI.h(interfaceC7492us))) {
                    }
                }
                if (!AbstractC8408zg0.C(c6729qs) && !C2551cd0.f.contains(AbstractC2278bB1.a(c8411zh0A, AbstractC3534eB1.a(c6729qs, 3)))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6729qs c6729qs4 = (C6729qs) it2.next();
            C6729qs c6729qs5 = c6729qs4;
            c6729qs5.getClass();
            BZ bzE1 = c6729qs5.E1(C7833we1.b);
            bzE1.b = interfaceC7492us;
            bzE1.A(interfaceC7492us.m());
            bzE1.o = true;
            AbstractC7452ue1 abstractC7452ue1F = c7833we1.f();
            if (abstractC7452ue1F == null) {
                BZ.b(37);
                throw null;
            }
            bzE1.a = abstractC7452ue1F;
            if (!C2551cd0.g.contains(AbstractC2278bB1.a(c8411zh0A, AbstractC3534eB1.a(c6729qs4, 3)))) {
                bzE1.u((I5) WS1.b(this.f, h[2]));
            }
            CZ czB1 = bzE1.x.B1(bzE1);
            O90.d(czB1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C6729qs) czB1);
        }
        return arrayList2;
    }
}
