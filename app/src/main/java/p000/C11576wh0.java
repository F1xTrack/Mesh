package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: wh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11576wh0 implements InterfaceC7116x5, InterfaceC10619pC0 {

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC10293mf0[] f45028h;

    /* renamed from: a */
    public final C6479nH f45029a;

    /* renamed from: b */
    public final WO0 f45030b;

    /* renamed from: c */
    public final C8374Uk0 f45031c;

    /* renamed from: d */
    public final C8426Vk0 f45032d;

    /* renamed from: e */
    public final C10399nU0 f45033e;

    /* renamed from: f */
    public final C8426Vk0 f45034f;

    /* renamed from: g */
    public final boolean f45035g;

    static {
        IP0 ip0 = BP0.f799a;
        f45028h = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C11576wh0.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), ip0.mo3850f(new GE0(ip0.mo3846b(C11576wh0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), ip0.mo3850f(new GE0(ip0.mo3846b(C11576wh0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C11576wh0(C6479nH c6479nH, WO0 wo0, boolean z) {
        O90.m5968f(c6479nH, "c");
        O90.m5968f(wo0, "javaAnnotation");
        this.f45029a = c6479nH;
        this.f45030b = wo0;
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        C8582Yk0 c8582Yk0 = (C8582Yk0) c9773ib0.f29338a;
        C11449vh0 c11449vh0 = new C11449vh0(this, 1);
        c8582Yk0.getClass();
        this.f45031c = new C8374Uk0(c8582Yk0, c11449vh0);
        C11449vh0 c11449vh02 = new C11449vh0(this, 2);
        c8582Yk0.getClass();
        this.f45032d = new C8426Vk0(c8582Yk0, c11449vh02);
        this.f45033e = ((C10689pl0) c9773ib0.f29347j).m23868n(wo0);
        C11449vh0 c11449vh03 = new C11449vh0(this, 0);
        c8582Yk0.getClass();
        this.f45034f = new C8426Vk0(c8582Yk0, c11449vh03);
        this.f45035g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC0249Dx m25671a(InterfaceC8146Qa0 interfaceC8146Qa0) {
        AbstractC7742Ig0 abstractC7742Ig0M26500g;
        if (interfaceC8146Qa0 instanceof C10389nP0) {
            return C7408Bv0.f1078c.m920j(((C10389nP0) interfaceC8146Qa0).f38305b, null);
        }
        if (interfaceC8146Qa0 instanceof C10133lP0) {
            C10133lP0 c10133lP0 = (C10133lP0) interfaceC8146Qa0;
            Class<?> enclosingClass = c10133lP0.f37043b.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            O90.m5965c(enclosingClass);
            return new C1220TO(VO0.m8433a(enclosingClass), C8340Tt0.m7798e(c10133lP0.f37043b.name()));
        }
        boolean z = interfaceC8146Qa0 instanceof ZO0;
        C6479nH c6479nH = this.f45029a;
        if (!z) {
            if (interfaceC8146Qa0 instanceof YO0) {
                return new C0384G5((Object) new C11576wh0(c6479nH, new WO0(((YO0) interfaceC8146Qa0).f14282b), false));
            }
            if (!(interfaceC8146Qa0 instanceof C9621hP0)) {
                return null;
            }
            Class cls = ((C9621hP0) interfaceC8146Qa0).f28413b;
            AbstractC7742Ig0 abstractC7742Ig0M9139V = ((C8539Xo1) c6479nH.f38231e).m9139V(cls.isPrimitive() ? new C10901rP0(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C8720aP0(cls) : cls instanceof WildcardType ? new C11540wP0((WildcardType) cls) : new C9749iP0(cls), K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 7));
            if (AbstractC1141S8.m7182b(abstractC7742Ig0M9139V)) {
                return null;
            }
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC7742Ig0M9139V;
            int i = 0;
            while (AbstractC11955zg0.m26495y(abstractC7742Ig0Mo24038b)) {
                abstractC7742Ig0Mo24038b = ((AbstractC10804qe1) AbstractC7167xu.m25972R(abstractC7742Ig0Mo24038b.mo3800u())).mo24038b();
                O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
                i++;
            }
            InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0Mo24038b.mo3797E().mo1962a();
            if (interfaceC0873NsMo1962a instanceof InterfaceC6976us) {
                C0055As c0055AsM25153f = AbstractC6940uI.m25153f(interfaceC0873NsMo1962a);
                return c0055AsM25153f == null ? new C9651he0(new C9267ee0(abstractC7742Ig0M9139V)) : new C9651he0(c0055AsM25153f, i);
            }
            if (interfaceC0873NsMo1962a instanceof InterfaceC10292me1) {
                return new C9651he0(C0055As.m358j(AbstractC10604p41.f39800a.m5393g()), 0);
            }
            return null;
        }
        ZO0 zo0 = (ZO0) interfaceC8146Qa0;
        C8340Tt0 c8340Tt0 = zo0.f13687a;
        if (c8340Tt0 == null) {
            c8340Tt0 = AbstractC8046Oc0.f8520b;
        }
        O90.m5965c(c8340Tt0);
        ArrayList arrayListM9527a = zo0.m9527a();
        X01 x01 = (X01) WS1.m8763b(this.f45032d, f45028h[1]);
        O90.m5967e(x01, "<get-type>(...)");
        if (AbstractC1141S8.m7182b(x01)) {
            return null;
        }
        InterfaceC6976us interfaceC6976usM25151d = AbstractC6940uI.m25151d(this);
        O90.m5965c(interfaceC6976usM25151d);
        C8473Wh1 c8473Wh1M3085g = GZ1.m3085g(c8340Tt0, interfaceC6976usM25151d);
        if (c8473Wh1M3085g == null || (abstractC7742Ig0M26500g = c8473Wh1M3085g.getType()) == null) {
            AbstractC11955zg0 abstractC11955zg0 = ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e;
            EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
            abstractC7742Ig0M26500g = abstractC11955zg0.m26500g(C6298kP.m22197c(EnumC6235jP.f35115D, new String[0]));
        }
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayListM9527a));
        Iterator it = arrayListM9527a.iterator();
        while (it.hasNext()) {
            AbstractC0249Dx abstractC0249DxM25671a = m25671a((InterfaceC8146Qa0) it.next());
            if (abstractC0249DxM25671a == null) {
                abstractC0249DxM25671a = new C7358Aw0(null);
            }
            arrayList.add(abstractC0249DxM25671a);
        }
        return new C7791Je1(arrayList, abstractC7742Ig0M26500g);
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: e */
    public final W21 mo4959e() {
        return this.f45033e;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: f */
    public final C0664KX mo4960f() {
        C8374Uk0 c8374Uk0 = this.f45031c;
        InterfaceC10293mf0 interfaceC10293mf0 = f45028h[0];
        O90.m5968f(c8374Uk0, "<this>");
        O90.m5968f(interfaceC10293mf0, "p");
        return (C0664KX) c8374Uk0.invoke();
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: g */
    public final Map mo4961g() {
        return (Map) WS1.m8763b(this.f45034f, f45028h[2]);
    }

    @Override // p000.InterfaceC7116x5
    public final AbstractC7742Ig0 getType() {
        return (X01) WS1.m8763b(this.f45032d, f45028h[1]);
    }

    public final String toString() {
        return C6417mI.f37617c.m22768x(this, null);
    }
}
