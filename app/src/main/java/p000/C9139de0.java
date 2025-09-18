package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: de0 */
/* loaded from: classes2.dex */
public final class C9139de0 extends AbstractC10675pe0 implements InterfaceC8412Vd0, InterfaceC9907je0, InterfaceC11953zf0 {

    /* renamed from: d */
    public static final /* synthetic */ int f26177d = 0;

    /* renamed from: b */
    public final Class f26178b;

    /* renamed from: c */
    public final Object f26179c;

    public C9139de0(Class cls) {
        O90.m5968f(cls, "jClass");
        this.f26178b = cls;
        this.f26179c = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C8516Xd0(this, 7));
    }

    /* renamed from: y */
    public static C7165xs m17720y(C0055As c0055As, C10271mU0 c10271mU0) {
        C7129xI c7129xI = c10271mU0.f37726a;
        C0664KX c0664kxM363g = c0055As.m363g();
        O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
        C7165xs c7165xs = new C7165xs(new C0905ON(c7129xI.f45519b, c0664kxM363g, 0), c0055As.m365i(), EnumC10575os0.f39323b, EnumC0118Bs.f1060a, AbstractC7230yu.m26274e(c7129xI.f45519b.mo897h().m26503j("Any").mo1492m()), c7129xI.f45518a);
        c7165xs.m25952u(new C8878be0(c7129xI.f45518a, c7165xs), C1156SN.f10705a, null);
        return c7165xs;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC9907je0
    /* renamed from: A */
    public final InterfaceC6976us mo17722k() {
        return ((C8620Zd0) this.f26179c.getValue()).m9560b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8412Vd0
    /* renamed from: a */
    public final String mo2806a() {
        C8620Zd0 c8620Zd0 = (C8620Zd0) this.f26179c.getValue();
        c8620Zd0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C8620Zd0.f15049o[3];
        return (String) c8620Zd0.f15053f.invoke();
    }

    @Override // p000.InterfaceC6644ps
    /* renamed from: b */
    public final Class mo2807b() {
        return this.f26178b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9139de0) && P22.m6214c(this).equals(P22.m6214c((InterfaceC8412Vd0) obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8412Vd0
    /* renamed from: f */
    public final String mo2808f() {
        C8620Zd0 c8620Zd0 = (C8620Zd0) this.f26179c.getValue();
        c8620Zd0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C8620Zd0.f15049o[2];
        return (String) c8620Zd0.f15052e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8412Vd0
    /* renamed from: g */
    public final Collection mo2809g() {
        C8620Zd0 c8620Zd0 = (C8620Zd0) this.f26179c.getValue();
        c8620Zd0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C8620Zd0.f15049o[4];
        Object objInvoke = c8620Zd0.f15054g.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        C8620Zd0 c8620Zd0 = (C8620Zd0) this.f26179c.getValue();
        c8620Zd0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C8620Zd0.f15049o[1];
        Object objInvoke = c8620Zd0.f15051d.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return P22.m6214c(this).hashCode();
    }

    @Override // p000.InterfaceC8412Vd0
    /* renamed from: j */
    public final boolean mo2810j(Object obj) {
        List list = VO0.f12536a;
        Class cls = this.f26178b;
        O90.m5968f(cls, "<this>");
        Integer num = (Integer) VO0.f12539d.get(cls);
        if (num != null) {
            return AbstractC10036ke1.m22233h(num.intValue(), obj);
        }
        Class cls2 = (Class) VO0.f12538c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // p000.AbstractC10675pe0
    /* renamed from: n */
    public final Collection mo3831n() {
        InterfaceC6976us interfaceC6976usMo17722k = mo17722k();
        if (interfaceC6976usMo17722k.mo1436l() == EnumC0118Bs.f1061b || interfaceC6976usMo17722k.mo1436l() == EnumC0118Bs.f1065f) {
            return C0779MN.f7117a;
        }
        Collection collectionMo1435g = interfaceC6976usMo17722k.mo1435g();
        O90.m5967e(collectionMo1435g, "getConstructors(...)");
        return collectionMo1435g;
    }

    @Override // p000.AbstractC10675pe0
    /* renamed from: o */
    public final Collection mo3832o(C8340Tt0 c8340Tt0) {
        InterfaceC10059kq0 interfaceC10059kq0Mo3799d0 = mo17722k().mo1492m().mo3799d0();
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47095b;
        Collection collectionMo1769a = interfaceC10059kq0Mo3799d0.mo1769a(c8340Tt0, enumC11985zv0);
        InterfaceC10059kq0 interfaceC10059kq0Mo1433W = mo17722k().mo1433W();
        O90.m5967e(interfaceC10059kq0Mo1433W, "getStaticScope(...)");
        return AbstractC7167xu.m25968N(collectionMo1769a, interfaceC10059kq0Mo1433W.mo1769a(c8340Tt0, enumC11985zv0));
    }

    @Override // p000.AbstractC10675pe0
    /* renamed from: p */
    public final CE0 mo3833p(int i) {
        Class<?> declaringClass;
        Class cls = this.f26178b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C9139de0) P22.m6216e(declaringClass)).mo3833p(i);
        }
        InterfaceC6976us interfaceC6976usMo17722k = mo17722k();
        C0460HI c0460hi = interfaceC6976usMo17722k instanceof C0460HI ? (C0460HI) interfaceC6976usMo17722k : null;
        if (c0460hi == null) {
            return null;
        }
        C11741y00 c11741y00 = AbstractC7736Id0.f5058j;
        O90.m5967e(c11741y00, "classLocalVariable");
        C10753qF0 c10753qF0 = (C10753qF0) XM1.m8994b(c0460hi.f4204e, c11741y00, i);
        if (c10753qF0 == null) {
            return null;
        }
        C1361Vd c1361Vd = c0460hi.f4211l;
        return (CE0) AbstractC7589Fh1.m2754f(this.f26178b, c10753qF0, (InterfaceC8392Ut0) c1361Vd.f12663d, (C10226m71) c1361Vd.f12661b, c0460hi.f4205f, C9006ce0.f17673a);
    }

    @Override // p000.AbstractC10675pe0
    /* renamed from: s */
    public final Collection mo3834s(C8340Tt0 c8340Tt0) {
        InterfaceC10059kq0 interfaceC10059kq0Mo3799d0 = mo17722k().mo1492m().mo3799d0();
        EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47095b;
        Collection collectionMo1771e = interfaceC10059kq0Mo3799d0.mo1771e(c8340Tt0, enumC11985zv0);
        InterfaceC10059kq0 interfaceC10059kq0Mo1433W = mo17722k().mo1433W();
        O90.m5967e(interfaceC10059kq0Mo1433W, "getStaticScope(...)");
        return AbstractC7167xu.m25968N(collectionMo1771e, interfaceC10059kq0Mo1433W.mo1771e(c8340Tt0, enumC11985zv0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        C0055As c0055AsM17723z = m17723z();
        C0664KX c0664kxM363g = c0055AsM17723z.m363g();
        O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
        String strConcat = c0664kxM363g.m4656d() ? "" : c0664kxM363g.m4654b().concat(".");
        sb.append(strConcat + D51.m1553l(c0055AsM17723z.m364h().m4654b(), '.', '$'));
        return sb.toString();
    }

    /* renamed from: z */
    public final C0055As m17723z() {
        EnumC11005sD0 enumC11005sD0M24759d;
        C0055As c0055As = AbstractC10527oU0.f39027a;
        Class cls = this.f26178b;
        O90.m5968f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            O90.m5967e(componentType, "getComponentType(...)");
            enumC11005sD0M24759d = componentType.isPrimitive() ? EnumC11057sd0.m24757b(componentType.getSimpleName()).m24759d() : null;
            return enumC11005sD0M24759d != null ? new C0055As(AbstractC10732q41.f40588l, enumC11005sD0M24759d.f42315b) : C0055As.m358j(AbstractC10604p41.f39809g.m5393g());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC10527oU0.f39027a;
        }
        enumC11005sD0M24759d = cls.isPrimitive() ? EnumC11057sd0.m24757b(cls.getSimpleName()).m24759d() : null;
        if (enumC11005sD0M24759d != null) {
            return new C0055As(AbstractC10732q41.f40588l, enumC11005sD0M24759d.f42314a);
        }
        C0055As c0055AsM8433a = VO0.m8433a(cls);
        if (c0055AsM8433a.f453c) {
            return c0055AsM8433a;
        }
        String str = C11309ub0.f43758a;
        C0055As c0055As2 = (C0055As) C11309ub0.f43765h.get(c0055AsM8433a.m359b().m4661i());
        return c0055As2 != null ? c0055As2 : c0055AsM8433a;
    }
}
