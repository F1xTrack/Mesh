package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: wh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7841wh0 implements InterfaceC7916x5, InterfaceC6413pC0 {
    public static final /* synthetic */ InterfaceC5927mf0[] h;
    public final C6045nH a;
    public final WO0 b;
    public final C1610Uk0 c;
    public final C1688Vk0 d;
    public final C6085nU0 e;
    public final C1688Vk0 f;
    public final boolean g;

    static {
        IP0 ip0 = BP0.a;
        h = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C7841wh0.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), ip0.f(new GE0(ip0.b(C7841wh0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), ip0.f(new GE0(ip0.b(C7841wh0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C7841wh0(C6045nH c6045nH, WO0 wo0, boolean z) {
        O90.f(c6045nH, "c");
        O90.f(wo0, "javaAnnotation");
        this.a = c6045nH;
        this.b = wo0;
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        C1922Yk0 c1922Yk0 = (C1922Yk0) c4375ib0.a;
        C7651vh0 c7651vh0 = new C7651vh0(this, 1);
        c1922Yk0.getClass();
        this.c = new C1610Uk0(c1922Yk0, c7651vh0);
        C7651vh0 c7651vh02 = new C7651vh0(this, 2);
        c1922Yk0.getClass();
        this.d = new C1688Vk0(c1922Yk0, c7651vh02);
        this.e = ((C6518pl0) c4375ib0.j).n(wo0);
        C7651vh0 c7651vh03 = new C7651vh0(this, 0);
        c1922Yk0.getClass();
        this.f = new C1688Vk0(c1922Yk0, c7651vh03);
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0323Dx a(InterfaceC1268Qa0 interfaceC1268Qa0) {
        AbstractC0663Ig0 abstractC0663Ig0G;
        if (interfaceC1268Qa0 instanceof C6070nP0) {
            return C0162Bv0.c.j(((C6070nP0) interfaceC1268Qa0).b, null);
        }
        if (interfaceC1268Qa0 instanceof C5688lP0) {
            C5688lP0 c5688lP0 = (C5688lP0) interfaceC1268Qa0;
            Class<?> enclosingClass = c5688lP0.b.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            O90.c(enclosingClass);
            return new TO(VO0.a(enclosingClass), C1559Tt0.e(c5688lP0.b.name()));
        }
        boolean z = interfaceC1268Qa0 instanceof ZO0;
        C6045nH c6045nH = this.a;
        if (!z) {
            if (interfaceC1268Qa0 instanceof YO0) {
                return new G5((Object) new C7841wh0(c6045nH, new WO0(((YO0) interfaceC1268Qa0).b), false));
            }
            if (!(interfaceC1268Qa0 instanceof C4148hP0)) {
                return null;
            }
            Class cls = ((C4148hP0) interfaceC1268Qa0).b;
            AbstractC0663Ig0 abstractC0663Ig0V = ((C1857Xo1) c6045nH.e).V(cls.isPrimitive() ? new C6833rP0(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new C2128aP0(cls) : cls instanceof WildcardType ? new C7787wP0((WildcardType) cls) : new C4339iP0(cls), K22.a(EnumC8403ze1.b, false, false, null, 7));
            if (S8.b(abstractC0663Ig0V)) {
                return null;
            }
            AbstractC0663Ig0 abstractC0663Ig0B = abstractC0663Ig0V;
            int i = 0;
            while (AbstractC8408zg0.y(abstractC0663Ig0B)) {
                abstractC0663Ig0B = ((AbstractC6689qe1) AbstractC8069xu.R(abstractC0663Ig0B.u())).b();
                O90.e(abstractC0663Ig0B, "getType(...)");
                i++;
            }
            InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0B.E().a();
            if (interfaceC1087NsA instanceof InterfaceC7492us) {
                C0074As c0074AsF = AbstractC7384uI.f(interfaceC1087NsA);
                return c0074AsF == null ? new C4193he0(new C3620ee0(abstractC0663Ig0V)) : new C4193he0(c0074AsF, i);
            }
            if (interfaceC1087NsA instanceof InterfaceC5925me1) {
                return new C4193he0(C0074As.j(AbstractC6390p41.a.g()), 0);
            }
            return null;
        }
        ZO0 zo0 = (ZO0) interfaceC1268Qa0;
        C1559Tt0 c1559Tt0 = zo0.a;
        if (c1559Tt0 == null) {
            c1559Tt0 = AbstractC1118Oc0.b;
        }
        O90.c(c1559Tt0);
        ArrayList arrayListA = zo0.a();
        X01 x01 = (X01) WS1.b(this.d, h[1]);
        O90.e(x01, "<get-type>(...)");
        if (S8.b(x01)) {
            return null;
        }
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d(this);
        O90.c(interfaceC7492usD);
        C1758Wh1 c1758Wh1G = GZ1.g(c1559Tt0, interfaceC7492usD);
        if (c1758Wh1G == null || (abstractC0663Ig0G = c1758Wh1G.getType()) == null) {
            AbstractC8408zg0 abstractC8408zg0 = ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e;
            EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
            abstractC0663Ig0G = abstractC8408zg0.g(C5496kP.c(EnumC5305jP.D, new String[0]));
        }
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayListA));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            AbstractC0323Dx abstractC0323DxA = a((InterfaceC1268Qa0) it.next());
            if (abstractC0323DxA == null) {
                abstractC0323DxA = new C0087Aw0(null);
            }
            arrayList.add(abstractC0323DxA);
        }
        return new C0736Je1(arrayList, abstractC0663Ig0G);
    }

    @Override // defpackage.InterfaceC7916x5
    public final W21 e() {
        return this.e;
    }

    @Override // defpackage.InterfaceC7916x5
    public final KX f() {
        C1610Uk0 c1610Uk0 = this.c;
        InterfaceC5927mf0 interfaceC5927mf0 = h[0];
        O90.f(c1610Uk0, "<this>");
        O90.f(interfaceC5927mf0, "p");
        return (KX) c1610Uk0.invoke();
    }

    @Override // defpackage.InterfaceC7916x5
    public final Map g() {
        return (Map) WS1.b(this.f, h[2]);
    }

    @Override // defpackage.InterfaceC7916x5
    public final AbstractC0663Ig0 getType() {
        return (X01) WS1.b(this.d, h[1]);
    }

    public final String toString() {
        return C5857mI.c.x(this, null);
    }
}
