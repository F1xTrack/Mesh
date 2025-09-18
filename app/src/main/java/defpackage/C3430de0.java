package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: de0 */
/* loaded from: classes2.dex */
public final class C3430de0 extends AbstractC6497pe0 implements InterfaceC1667Vd0, InterfaceC5351je0, InterfaceC8405zf0 {
    public static final /* synthetic */ int d = 0;
    public final Class b;
    public final Object c;

    public C3430de0(Class cls) {
        O90.f(cls, "jClass");
        this.b = cls;
        this.c = LB.c(EnumC4205hi0.b, new C1823Xd0(this, 7));
    }

    public static C8063xs y(C0074As c0074As, C5894mU0 c5894mU0) {
        C7955xI c7955xI = c5894mU0.a;
        KX kxG = c0074As.g();
        O90.e(kxG, "getPackageFqName(...)");
        C8063xs c8063xs = new C8063xs(new ON(c7955xI.b, kxG, 0), c0074As.i(), EnumC6348os0.b, EnumC0152Bs.a, AbstractC8259yu.e(c7955xI.b.h().j("Any").m()), c7955xI.a);
        c8063xs.u(new C2364be0(c7955xI.a, c8063xs), SN.a, null);
        return c8063xs;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5351je0
    /* renamed from: A */
    public final InterfaceC7492us k() {
        return ((C1979Zd0) this.c.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1667Vd0
    public final String a() {
        C1979Zd0 c1979Zd0 = (C1979Zd0) this.c.getValue();
        c1979Zd0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C1979Zd0.o[3];
        return (String) c1979Zd0.f.invoke();
    }

    @Override // defpackage.InterfaceC6538ps
    public final Class b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3430de0) && P22.c(this).equals(P22.c((InterfaceC1667Vd0) obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1667Vd0
    public final String f() {
        C1979Zd0 c1979Zd0 = (C1979Zd0) this.c.getValue();
        c1979Zd0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C1979Zd0.o[2];
        return (String) c1979Zd0.e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1667Vd0
    public final Collection g() {
        C1979Zd0 c1979Zd0 = (C1979Zd0) this.c.getValue();
        c1979Zd0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C1979Zd0.o[4];
        Object objInvoke = c1979Zd0.g.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        C1979Zd0 c1979Zd0 = (C1979Zd0) this.c.getValue();
        c1979Zd0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C1979Zd0.o[1];
        Object objInvoke = c1979Zd0.d.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return P22.c(this).hashCode();
    }

    @Override // defpackage.InterfaceC1667Vd0
    public final boolean j(Object obj) {
        List list = VO0.a;
        Class cls = this.b;
        O90.f(cls, "<this>");
        Integer num = (Integer) VO0.d.get(cls);
        if (num != null) {
            return AbstractC5543ke1.h(num.intValue(), obj);
        }
        Class cls2 = (Class) VO0.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.AbstractC6497pe0
    public final Collection n() {
        InterfaceC7492us interfaceC7492usK = k();
        if (interfaceC7492usK.l() == EnumC0152Bs.b || interfaceC7492usK.l() == EnumC0152Bs.f) {
            return MN.a;
        }
        Collection collectionG = interfaceC7492usK.g();
        O90.e(collectionG, "getConstructors(...)");
        return collectionG;
    }

    @Override // defpackage.AbstractC6497pe0
    public final Collection o(C1559Tt0 c1559Tt0) {
        InterfaceC5578kq0 interfaceC5578kq0D0 = k().m().d0();
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.b;
        Collection collectionA = interfaceC5578kq0D0.a(c1559Tt0, enumC8453zv0);
        InterfaceC5578kq0 interfaceC5578kq0W = k().W();
        O90.e(interfaceC5578kq0W, "getStaticScope(...)");
        return AbstractC8069xu.N(collectionA, interfaceC5578kq0W.a(c1559Tt0, enumC8453zv0));
    }

    @Override // defpackage.AbstractC6497pe0
    public final CE0 p(int i) {
        Class<?> declaringClass;
        Class cls = this.b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C3430de0) P22.e(declaringClass)).p(i);
        }
        InterfaceC7492us interfaceC7492usK = k();
        HI hi = interfaceC7492usK instanceof HI ? (HI) interfaceC7492usK : null;
        if (hi == null) {
            return null;
        }
        C8089y00 c8089y00 = AbstractC0654Id0.j;
        O90.e(c8089y00, "classLocalVariable");
        C6613qF0 c6613qF0 = (C6613qF0) XM1.b(hi.e, c8089y00, i);
        if (c6613qF0 == null) {
            return null;
        }
        C1666Vd c1666Vd = hi.l;
        return (CE0) AbstractC0433Fh1.f(this.b, c6613qF0, (InterfaceC1637Ut0) c1666Vd.d, (C5826m71) c1666Vd.b, hi.f, C2554ce0.a);
    }

    @Override // defpackage.AbstractC6497pe0
    public final Collection s(C1559Tt0 c1559Tt0) {
        InterfaceC5578kq0 interfaceC5578kq0D0 = k().m().d0();
        EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.b;
        Collection collectionE = interfaceC5578kq0D0.e(c1559Tt0, enumC8453zv0);
        InterfaceC5578kq0 interfaceC5578kq0W = k().W();
        O90.e(interfaceC5578kq0W, "getStaticScope(...)");
        return AbstractC8069xu.N(collectionE, interfaceC5578kq0W.e(c1559Tt0, enumC8453zv0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        C0074As c0074AsZ = z();
        KX kxG = c0074AsZ.g();
        O90.e(kxG, "getPackageFqName(...)");
        String strConcat = kxG.d() ? "" : kxG.b().concat(".");
        sb.append(strConcat + D51.l(c0074AsZ.h().b(), '.', '$'));
        return sb.toString();
    }

    public final C0074As z() {
        EnumC6988sD0 enumC6988sD0D;
        C0074As c0074As = AbstractC6276oU0.a;
        Class cls = this.b;
        O90.f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            O90.e(componentType, "getComponentType(...)");
            enumC6988sD0D = componentType.isPrimitive() ? EnumC7066sd0.b(componentType.getSimpleName()).d() : null;
            return enumC6988sD0D != null ? new C0074As(AbstractC6581q41.l, enumC6988sD0D.b) : C0074As.j(AbstractC6390p41.g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC6276oU0.a;
        }
        enumC6988sD0D = cls.isPrimitive() ? EnumC7066sd0.b(cls.getSimpleName()).d() : null;
        if (enumC6988sD0D != null) {
            return new C0074As(AbstractC6581q41.l, enumC6988sD0D.a);
        }
        C0074As c0074AsA = VO0.a(cls);
        if (c0074AsA.c) {
            return c0074AsA;
        }
        String str = C7442ub0.a;
        C0074As c0074As2 = (C0074As) C7442ub0.h.get(c0074AsA.b().i());
        return c0074As2 != null ? c0074As2 : c0074AsA;
    }
}
