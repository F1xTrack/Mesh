package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class RI extends AbstractC5769lq0 {
    public static final /* synthetic */ InterfaceC5927mf0[] f;
    public final C1666Vd b;
    public final PI c;
    public final C1688Vk0 d;
    public final C1610Uk0 e;

    static {
        IP0 ip0 = BP0.a;
        f = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(RI.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), ip0.f(new GE0(ip0.b(RI.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public RI(C1666Vd c1666Vd, List list, List list2, List list3, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(c1666Vd, "c");
        O90.f(list, "functionList");
        O90.f(list2, "propertyList");
        O90.f(list3, "typeAliasList");
        this.b = c1666Vd;
        C7955xI c7955xI = (C7955xI) c1666Vd.c;
        c7955xI.c.getClass();
        this.c = new PI(this, list, list2, list3);
        QI qi = new QI(0, interfaceC5908mZ);
        Z41 z41 = c7955xI.a;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        this.d = new C1688Vk0(c1922Yk0, qi);
        C3881g1 c3881g1 = new C3881g1(13, this);
        C1922Yk0 c1922Yk02 = (C1922Yk0) z41;
        c1922Yk02.getClass();
        this.e = new C1610Uk0(c1922Yk02, c3881g1);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return this.c.a(c1559Tt0, interfaceC0600Hl0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set b() {
        return (Set) WS1.b(this.c.g, PI.j[0]);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        if (q(c1559Tt0)) {
            return ((C7955xI) this.b.c).b(l(c1559Tt0));
        }
        PI pi = this.c;
        if (!pi.c.keySet().contains(c1559Tt0)) {
            return null;
        }
        pi.getClass();
        return (InterfaceC0499Gd1) pi.f.invoke(c1559Tt0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set d() {
        C1610Uk0 c1610Uk0 = this.e;
        InterfaceC5927mf0 interfaceC5927mf0 = f[1];
        O90.f(c1610Uk0, "<this>");
        O90.f(interfaceC5927mf0, "p");
        return (Set) c1610Uk0.invoke();
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return this.c.b(c1559Tt0, enumC8453zv0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set f() {
        return (Set) WS1.b(this.c.h, PI.j[1]);
    }

    public abstract void h(ArrayList arrayList, InterfaceC6099nZ interfaceC6099nZ);

    public final Collection i(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.d;
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        if (c4317iI.a(C4317iI.f)) {
            h(arrayList, interfaceC6099nZ);
        }
        PI pi = this.c;
        pi.getClass();
        boolean zA = c4317iI.a(C4317iI.j);
        C2209aq0 c2209aq0 = C2209aq0.b;
        if (zA) {
            Set<C1559Tt0> set = (Set) WS1.b(pi.h, PI.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C1559Tt0 c1559Tt0 : set) {
                if (((Boolean) interfaceC6099nZ.invoke(c1559Tt0)).booleanValue()) {
                    arrayList2.addAll(pi.b(c1559Tt0, enumC8453zv0));
                }
            }
            AbstractC0236Cu.l(arrayList2, c2209aq0);
            arrayList.addAll(arrayList2);
        }
        if (c4317iI.a(C4317iI.i)) {
            Set<C1559Tt0> set2 = (Set) WS1.b(pi.g, PI.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C1559Tt0 c1559Tt02 : set2) {
                if (((Boolean) interfaceC6099nZ.invoke(c1559Tt02)).booleanValue()) {
                    arrayList3.addAll(pi.a(c1559Tt02, enumC8453zv0));
                }
            }
            AbstractC0236Cu.l(arrayList3, c2209aq0);
            arrayList.addAll(arrayList3);
        }
        if (c4317iI.a(C4317iI.l)) {
            for (C1559Tt0 c1559Tt03 : m()) {
                if (((Boolean) interfaceC6099nZ.invoke(c1559Tt03)).booleanValue()) {
                    AbstractC3970gT1.a(arrayList, ((C7955xI) this.b.c).b(l(c1559Tt03)));
                }
            }
        }
        if (c4317iI.a(C4317iI.g)) {
            for (Object obj : pi.c.keySet()) {
                if (((Boolean) interfaceC6099nZ.invoke(obj)).booleanValue()) {
                    pi.getClass();
                    O90.f(obj, "name");
                    AbstractC3970gT1.a(arrayList, (InterfaceC0499Gd1) pi.f.invoke(obj));
                }
            }
        }
        return AbstractC3970gT1.b(arrayList);
    }

    public void j(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
    }

    public void k(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
    }

    public abstract C0074As l(C1559Tt0 c1559Tt0);

    public final Set m() {
        return (Set) WS1.b(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return m().contains(c1559Tt0);
    }

    public boolean r(UI ui) {
        return true;
    }
}
