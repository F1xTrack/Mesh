package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: RI */
/* loaded from: classes2.dex */
public abstract class AbstractC1088RI extends AbstractC10187lq0 {

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC10293mf0[] f10112f;

    /* renamed from: b */
    public final C1361Vd f10113b;

    /* renamed from: c */
    public final C0963PI f10114c;

    /* renamed from: d */
    public final C8426Vk0 f10115d;

    /* renamed from: e */
    public final C8374Uk0 f10116e;

    static {
        IP0 ip0 = BP0.f799a;
        f10112f = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC1088RI.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC1088RI.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public AbstractC1088RI(C1361Vd c1361Vd, List list, List list2, List list3, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(c1361Vd, "c");
        O90.m5968f(list, "functionList");
        O90.m5968f(list2, "propertyList");
        O90.m5968f(list3, "typeAliasList");
        this.f10113b = c1361Vd;
        C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
        c7129xI.f45520c.getClass();
        this.f10114c = new C0963PI(this, list, list2, list3);
        C1026QI c1026qi = new C1026QI(0, interfaceC6434mZ);
        Z41 z41 = c7129xI.f45518a;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        this.f10115d = new C8426Vk0(c8582Yk0, c1026qi);
        C4090g1 c4090g1 = new C4090g1(13, this);
        C8582Yk0 c8582Yk02 = (C8582Yk0) z41;
        c8582Yk02.getClass();
        this.f10116e = new C8374Uk0(c8582Yk02, c4090g1);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return this.f10114c.m6295a(c8340Tt0, interfaceC7700Hl0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        return (Set) WS1.m8763b(this.f10114c.f8989g, C0963PI.f8982j[0]);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        if (mo6933q(c8340Tt0)) {
            return ((C7129xI) this.f10113b.f12662c).m25826b(mo2112l(c8340Tt0));
        }
        C0963PI c0963pi = this.f10114c;
        if (!c0963pi.f8985c.keySet().contains(c8340Tt0)) {
            return null;
        }
        c0963pi.getClass();
        return (InterfaceC7633Gd1) c0963pi.f8988f.invoke(c8340Tt0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        C8374Uk0 c8374Uk0 = this.f10116e;
        InterfaceC10293mf0 interfaceC10293mf0 = f10112f[1];
        O90.m5968f(c8374Uk0, "<this>");
        O90.m5968f(interfaceC10293mf0, "p");
        return (Set) c8374Uk0.invoke();
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return this.f10114c.m6296b(c8340Tt0, enumC11985zv0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        return (Set) WS1.m8763b(this.f10114c.f8990h, C0963PI.f8982j[1]);
    }

    /* renamed from: h */
    public abstract void mo2109h(ArrayList arrayList, InterfaceC6497nZ interfaceC6497nZ);

    /* renamed from: i */
    public final Collection m6931i(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47097d;
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        if (c4233iI.m18998a(C4233iI.f29051f)) {
            mo2109h(arrayList, interfaceC6497nZ);
        }
        C0963PI c0963pi = this.f10114c;
        c0963pi.getClass();
        boolean zM18998a = c4233iI.m18998a(C4233iI.f29055j);
        C8774aq0 c8774aq0 = C8774aq0.f16613b;
        if (zM18998a) {
            Set<C8340Tt0> set = (Set) WS1.m8763b(c0963pi.f8990h, C0963PI.f8982j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C8340Tt0 c8340Tt0 : set) {
                if (((Boolean) interfaceC6497nZ.invoke(c8340Tt0)).booleanValue()) {
                    arrayList2.addAll(c0963pi.m6296b(c8340Tt0, enumC11985zv0));
                }
            }
            AbstractC0183Cu.m1455l(arrayList2, c8774aq0);
            arrayList.addAll(arrayList2);
        }
        if (c4233iI.m18998a(C4233iI.f29054i)) {
            Set<C8340Tt0> set2 = (Set) WS1.m8763b(c0963pi.f8989g, C0963PI.f8982j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C8340Tt0 c8340Tt02 : set2) {
                if (((Boolean) interfaceC6497nZ.invoke(c8340Tt02)).booleanValue()) {
                    arrayList3.addAll(c0963pi.m6295a(c8340Tt02, enumC11985zv0));
                }
            }
            AbstractC0183Cu.m1455l(arrayList3, c8774aq0);
            arrayList.addAll(arrayList3);
        }
        if (c4233iI.m18998a(C4233iI.f29057l)) {
            for (C8340Tt0 c8340Tt03 : m6932m()) {
                if (((Boolean) interfaceC6497nZ.invoke(c8340Tt03)).booleanValue()) {
                    AbstractC9502gT1.m18571a(arrayList, ((C7129xI) this.f10113b.f12662c).m25826b(mo2112l(c8340Tt03)));
                }
            }
        }
        if (c4233iI.m18998a(C4233iI.f29052g)) {
            for (Object obj : c0963pi.f8985c.keySet()) {
                if (((Boolean) interfaceC6497nZ.invoke(obj)).booleanValue()) {
                    c0963pi.getClass();
                    O90.m5968f(obj, "name");
                    AbstractC9502gT1.m18571a(arrayList, (InterfaceC7633Gd1) c0963pi.f8988f.invoke(obj));
                }
            }
        }
        return AbstractC9502gT1.m18572b(arrayList);
    }

    /* renamed from: j */
    public void mo2110j(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
    }

    /* renamed from: k */
    public void mo2111k(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
    }

    /* renamed from: l */
    public abstract C0055As mo2112l(C8340Tt0 c8340Tt0);

    /* renamed from: m */
    public final Set m6932m() {
        return (Set) WS1.m8763b(this.f10115d, f10112f[0]);
    }

    /* renamed from: n */
    public abstract Set mo2113n();

    /* renamed from: o */
    public abstract Set mo2114o();

    /* renamed from: p */
    public abstract Set mo2115p();

    /* renamed from: q */
    public boolean mo6933q(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return m6932m().contains(c8340Tt0);
    }

    /* renamed from: r */
    public boolean mo2116r(C1277UI c1277ui) {
        return true;
    }
}
