package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* renamed from: Qh0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1289Qh0 extends AbstractC5769lq0 {
    public static final /* synthetic */ InterfaceC5927mf0[] m;
    public final C6045nH b;
    public final AbstractC1289Qh0 c;
    public final C1298Qk0 d;
    public final C1688Vk0 e;
    public final C1454Sk0 f;
    public final C1766Wk0 g;
    public final C1454Sk0 h;
    public final C1688Vk0 i;
    public final C1688Vk0 j;
    public final C1688Vk0 k;
    public final C1454Sk0 l;

    static {
        IP0 ip0 = BP0.a;
        m = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(AbstractC1289Qh0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), ip0.f(new GE0(ip0.b(AbstractC1289Qh0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), ip0.f(new GE0(ip0.b(AbstractC1289Qh0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public AbstractC1289Qh0(C6045nH c6045nH, AbstractC1289Qh0 abstractC1289Qh0) {
        O90.f(c6045nH, "c");
        this.b = c6045nH;
        this.c = abstractC1289Qh0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c6045nH.b).a;
        C1133Oh0 c1133Oh0 = new C1133Oh0(this, 0);
        c1922Yk0.getClass();
        this.d = new C1298Qk0(c1922Yk0, c1133Oh0);
        C1133Oh0 c1133Oh02 = new C1133Oh0(this, 2);
        c1922Yk0.getClass();
        this.e = new C1688Vk0(c1922Yk0, c1133Oh02);
        this.f = c1922Yk0.b(new C1211Ph0(this, 1));
        this.g = c1922Yk0.c(new C1211Ph0(this, 0));
        this.h = c1922Yk0.b(new C1211Ph0(this, 2));
        C1133Oh0 c1133Oh03 = new C1133Oh0(this, 3);
        c1922Yk0.getClass();
        this.i = new C1688Vk0(c1922Yk0, c1133Oh03);
        C1133Oh0 c1133Oh04 = new C1133Oh0(this, 4);
        c1922Yk0.getClass();
        this.j = new C1688Vk0(c1922Yk0, c1133Oh04);
        C1133Oh0 c1133Oh05 = new C1133Oh0(this, 1);
        c1922Yk0.getClass();
        this.k = new C1688Vk0(c1922Yk0, c1133Oh05);
        this.l = c1922Yk0.b(new C1211Ph0(this, 3));
    }

    public static AbstractC0663Ig0 l(C6452pP0 c6452pP0, C6045nH c6045nH) {
        O90.f(c6452pP0, "method");
        Class<?> declaringClass = ((Method) c6452pP0.b()).getDeclaringClass();
        O90.e(declaringClass, "getDeclaringClass(...)");
        C8203yb0 c8203yb0A = K22.a(EnumC8403ze1.b, declaringClass.isAnnotation(), false, null, 6);
        return ((C1857Xo1) c6045nH.e).V(c6452pP0.f(), c8203yb0A);
    }

    public static C1055Nh0 u(C6045nH c6045nH, CZ cz, List list) {
        Pair pair;
        C1559Tt0 c1559Tt0;
        C1559Tt0 c1559Tt0E;
        L8 l8H0 = AbstractC8069xu.h0(list);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(l8H0));
        Iterator it = l8H0.iterator();
        boolean z = false;
        while (true) {
            C2309bM c2309bM = (C2309bM) it;
            if (!c2309bM.b.hasNext()) {
                return new C1055Nh0(AbstractC8069xu.b0(arrayList), z);
            }
            C5255j80 c5255j80 = (C5255j80) c2309bM.next();
            int i = c5255j80.a;
            C7597vP0 c7597vP0 = (C7597vP0) c5255j80.b;
            C8031xh0 c8031xh0E = AbstractC1993Zi.e(c6045nH, c7597vP0);
            C8203yb0 c8203yb0A = K22.a(EnumC8403ze1.b, false, false, null, 7);
            C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
            AbstractC7215tP0 abstractC7215tP0 = c7597vP0.a;
            boolean z2 = c7597vP0.d;
            C1857Xo1 c1857Xo1 = (C1857Xo1) c6045nH.e;
            C0231Cs0 c0231Cs0 = (C0231Cs0) c4375ib0.o;
            if (z2) {
                C2128aP0 c2128aP0 = abstractC7215tP0 instanceof C2128aP0 ? (C2128aP0) abstractC7215tP0 : null;
                if (c2128aP0 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c7597vP0);
                }
                AbstractC1521Tg1 abstractC1521Tg1U = c1857Xo1.U(c2128aP0, c8203yb0A, true);
                pair = new Pair(abstractC1521Tg1U, c0231Cs0.e.f(abstractC1521Tg1U));
            } else {
                pair = new Pair(c1857Xo1.V(abstractC7215tP0, c8203yb0A), null);
            }
            AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) pair.a;
            AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) pair.b;
            if (O90.a(cz.getName().b(), "equals") && list.size() == 1 && c0231Cs0.e.o().equals(abstractC0663Ig0)) {
                c1559Tt0E = C1559Tt0.e("other");
            } else {
                String str = c7597vP0.c;
                C1559Tt0 c1559Tt0D = str != null ? C1559Tt0.d(str) : null;
                if (c1559Tt0D == null) {
                    z = true;
                }
                if (c1559Tt0D == null) {
                    c1559Tt0E = C1559Tt0.e("p" + i);
                } else {
                    c1559Tt0 = c1559Tt0D;
                    arrayList.add(new C1758Wh1(cz, null, i, c8031xh0E, c1559Tt0, abstractC0663Ig0, false, false, false, abstractC0663Ig02, ((C6518pl0) c4375ib0.j).n(c7597vP0)));
                }
            }
            c1559Tt0 = c1559Tt0E;
            arrayList.add(new C1758Wh1(cz, null, i, c8031xh0E, c1559Tt0, abstractC0663Ig0, false, false, false, abstractC0663Ig02, ((C6518pl0) c4375ib0.j).n(c7597vP0)));
        }
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return !b().contains(c1559Tt0) ? MN.a : (Collection) this.h.invoke(c1559Tt0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set b() {
        return (Set) WS1.b(this.i, m[0]);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set d() {
        return (Set) WS1.b(this.k, m[2]);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return !f().contains(c1559Tt0) ? MN.a : (Collection) this.l.invoke(c1559Tt0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set f() {
        return (Set) WS1.b(this.j, m[1]);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return (Collection) this.d.invoke();
    }

    public abstract Set h(C4317iI c4317iI, C3808fd0 c3808fd0);

    public abstract Set i(C4317iI c4317iI, C3808fd0 c3808fd0);

    public void j(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
    }

    public abstract JD k();

    public abstract void m(LinkedHashSet linkedHashSet, C1559Tt0 c1559Tt0);

    public abstract void n(C1559Tt0 c1559Tt0, ArrayList arrayList);

    public abstract Set o(C4317iI c4317iI);

    public abstract C6887rh0 p();

    public abstract CD q();

    public boolean r(C3611eb0 c3611eb0) {
        return true;
    }

    public abstract C0977Mh0 s(C6452pP0 c6452pP0, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig0, List list);

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final C3611eb0 t(C6452pP0 c6452pP0) {
        O90.f(c6452pP0, "method");
        C6045nH c6045nH = this.b;
        C3611eb0 c3611eb0N1 = C3611eb0.N1(q(), AbstractC1993Zi.e(c6045nH, c6452pP0), c6452pP0.c(), ((C6518pl0) ((C4375ib0) c6045nH.b).j).n(c6452pP0), ((JD) this.e.invoke()).b(c6452pP0.c()) != null && ((ArrayList) c6452pP0.g()).isEmpty());
        O90.f(c6045nH, "<this>");
        C6045nH c6045nH2 = new C6045nH((C4375ib0) c6045nH.b, new C2359bc1(c6045nH, c3611eb0N1, c6452pP0, 0), c6045nH.a);
        ArrayList typeParameters = c6452pP0.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(typeParameters));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC5925me1 interfaceC5925me1L = ((InterfaceC6307oe1) c6045nH2.c).l((C7406uP0) it.next());
            O90.c(interfaceC5925me1L);
            arrayList.add(interfaceC5925me1L);
        }
        C1055Nh0 c1055Nh0U = u(c6045nH2, c3611eb0N1, c6452pP0.g());
        C0977Mh0 c0977Mh0S = s(c6452pP0, arrayList, l(c6452pP0, c6045nH2), c1055Nh0U.b);
        C6887rh0 c6887rh0P = p();
        MN mn = MN.a;
        C0318Dv0 c0318Dv0 = EnumC6348os0.a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) c6452pP0.b()).getModifiers());
        boolean zIsFinal = true ^ Modifier.isFinal(((Method) c6452pP0.b()).getModifiers());
        c0318Dv0.getClass();
        c3611eb0N1.M1(null, c6887rh0P, mn, c0977Mh0S.c, c0977Mh0S.b, c0977Mh0S.a, C0318Dv0.o(false, zIsAbstract, zIsFinal), AbstractC6947s02.a(c6452pP0.e()), NN.a);
        c3611eb0N1.O1(false, c1055Nh0U.a);
        if (c0977Mh0S.d.isEmpty()) {
            return c3611eb0N1;
        }
        ((C0162Bv0) ((C4375ib0) c6045nH2.b).e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
