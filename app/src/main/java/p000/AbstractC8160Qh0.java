package p000;

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
public abstract class AbstractC8160Qh0 extends AbstractC10187lq0 {

    /* renamed from: m */
    public static final /* synthetic */ InterfaceC10293mf0[] f9738m;

    /* renamed from: b */
    public final C6479nH f9739b;

    /* renamed from: c */
    public final AbstractC8160Qh0 f9740c;

    /* renamed from: d */
    public final C8166Qk0 f9741d;

    /* renamed from: e */
    public final C8426Vk0 f9742e;

    /* renamed from: f */
    public final C8270Sk0 f9743f;

    /* renamed from: g */
    public final C8478Wk0 f9744g;

    /* renamed from: h */
    public final C8270Sk0 f9745h;

    /* renamed from: i */
    public final C8426Vk0 f9746i;

    /* renamed from: j */
    public final C8426Vk0 f9747j;

    /* renamed from: k */
    public final C8426Vk0 f9748k;

    /* renamed from: l */
    public final C8270Sk0 f9749l;

    static {
        IP0 ip0 = BP0.f799a;
        f9738m = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC8160Qh0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC8160Qh0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC8160Qh0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public AbstractC8160Qh0(C6479nH c6479nH, AbstractC8160Qh0 abstractC8160Qh0) {
        O90.m5968f(c6479nH, "c");
        this.f9739b = c6479nH;
        this.f9740c = abstractC8160Qh0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C8056Oh0 c8056Oh0 = new C8056Oh0(this, 0);
        c8582Yk0.getClass();
        this.f9741d = new C8166Qk0(c8582Yk0, c8056Oh0);
        C8056Oh0 c8056Oh02 = new C8056Oh0(this, 2);
        c8582Yk0.getClass();
        this.f9742e = new C8426Vk0(c8582Yk0, c8056Oh02);
        this.f9743f = c8582Yk0.m9350b(new C8108Ph0(this, 1));
        this.f9744g = c8582Yk0.m9351c(new C8108Ph0(this, 0));
        this.f9745h = c8582Yk0.m9350b(new C8108Ph0(this, 2));
        C8056Oh0 c8056Oh03 = new C8056Oh0(this, 3);
        c8582Yk0.getClass();
        this.f9746i = new C8426Vk0(c8582Yk0, c8056Oh03);
        C8056Oh0 c8056Oh04 = new C8056Oh0(this, 4);
        c8582Yk0.getClass();
        this.f9747j = new C8426Vk0(c8582Yk0, c8056Oh04);
        C8056Oh0 c8056Oh05 = new C8056Oh0(this, 1);
        c8582Yk0.getClass();
        this.f9748k = new C8426Vk0(c8582Yk0, c8056Oh05);
        this.f9749l = c8582Yk0.m9350b(new C8108Ph0(this, 3));
    }

    /* renamed from: l */
    public static AbstractC7742Ig0 m6744l(C10645pP0 c10645pP0, C6479nH c6479nH) {
        O90.m5968f(c10645pP0, "method");
        Class<?> declaringClass = ((Method) c10645pP0.mo22030b()).getDeclaringClass();
        O90.m5967e(declaringClass, "getDeclaringClass(...)");
        C11818yb0 c11818yb0M4530a = K22.m4530a(EnumC11952ze1.f46923b, declaringClass.isAnnotation(), false, null, 6);
        return ((C8539Xo1) c6479nH.f38231e).m9139V(c10645pP0.m23772f(), c11818yb0M4530a);
    }

    /* renamed from: u */
    public static C8004Nh0 m6745u(C6479nH c6479nH, AbstractC0162CZ abstractC0162CZ, List list) {
        Pair pair;
        C8340Tt0 c8340Tt0;
        C8340Tt0 c8340Tt0M7798e;
        C0702L8 c0702l8M25988h0 = AbstractC7167xu.m25988h0(list);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c0702l8M25988h0));
        Iterator it = c0702l8M25988h0.iterator();
        boolean z = false;
        while (true) {
            C1780bM c1780bM = (C1780bM) it;
            if (!c1780bM.f16986b.hasNext()) {
                return new C8004Nh0(AbstractC7167xu.m25982b0(arrayList), z);
            }
            C9843j80 c9843j80 = (C9843j80) c1780bM.next();
            int i = c9843j80.f34932a;
            C11413vP0 c11413vP0 = (C11413vP0) c9843j80.f34933b;
            C11703xh0 c11703xh0M9582e = AbstractC1618Zi.m9582e(c6479nH, c11413vP0);
            C11818yb0 c11818yb0M4530a = K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 7);
            C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
            AbstractC11157tP0 abstractC11157tP0 = c11413vP0.f44364a;
            boolean z2 = c11413vP0.f44367d;
            C8539Xo1 c8539Xo1 = (C8539Xo1) c6479nH.f38231e;
            C7454Cs0 c7454Cs0 = (C7454Cs0) c9773ib0.f29352o;
            if (z2) {
                C8720aP0 c8720aP0 = abstractC11157tP0 instanceof C8720aP0 ? (C8720aP0) abstractC11157tP0 : null;
                if (c8720aP0 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c11413vP0);
                }
                AbstractC8315Tg1 abstractC8315Tg1M9138U = c8539Xo1.m9138U(c8720aP0, c11818yb0M4530a, true);
                pair = new Pair(abstractC8315Tg1M9138U, c7454Cs0.f1735e.m26499f(abstractC8315Tg1M9138U));
            } else {
                pair = new Pair(c8539Xo1.m9139V(abstractC11157tP0, c11818yb0M4530a), null);
            }
            AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) pair.f36702a;
            AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) pair.f36703b;
            if (O90.m5963a(abstractC0162CZ.getName().m7801b(), "equals") && list.size() == 1 && c7454Cs0.f1735e.m26507o().equals(abstractC7742Ig0)) {
                c8340Tt0M7798e = C8340Tt0.m7798e("other");
            } else {
                String str = c11413vP0.f44366c;
                C8340Tt0 c8340Tt0M7797d = str != null ? C8340Tt0.m7797d(str) : null;
                if (c8340Tt0M7797d == null) {
                    z = true;
                }
                if (c8340Tt0M7797d == null) {
                    c8340Tt0M7798e = C8340Tt0.m7798e("p" + i);
                } else {
                    c8340Tt0 = c8340Tt0M7797d;
                    arrayList.add(new C8473Wh1(abstractC0162CZ, null, i, c11703xh0M9582e, c8340Tt0, abstractC7742Ig0, false, false, false, abstractC7742Ig02, ((C10689pl0) c9773ib0.f29347j).m23868n(c11413vP0)));
                }
            }
            c8340Tt0 = c8340Tt0M7798e;
            arrayList.add(new C8473Wh1(abstractC0162CZ, null, i, c11703xh0M9582e, c8340Tt0, abstractC7742Ig0, false, false, false, abstractC7742Ig02, ((C10689pl0) c9773ib0.f29347j).m23868n(c11413vP0)));
        }
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return !mo6677b().contains(c8340Tt0) ? C0779MN.f7117a : (Collection) this.f9745h.invoke(c8340Tt0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        return (Set) WS1.m8763b(this.f9746i, f9738m[0]);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        return (Set) WS1.m8763b(this.f9748k, f9738m[2]);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return !mo6678f().contains(c8340Tt0) ? C0779MN.f7117a : (Collection) this.f9749l.invoke(c8340Tt0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        return (Set) WS1.m8763b(this.f9747j, f9738m[1]);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return (Collection) this.f9741d.invoke();
    }

    /* renamed from: h */
    public abstract Set mo1772h(C4233iI c4233iI, C9393fd0 c9393fd0);

    /* renamed from: i */
    public abstract Set mo1773i(C4233iI c4233iI, C9393fd0 c9393fd0);

    /* renamed from: j */
    public void mo1774j(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
    }

    /* renamed from: k */
    public abstract InterfaceC0581JD mo1775k();

    /* renamed from: m */
    public abstract void mo1776m(LinkedHashSet linkedHashSet, C8340Tt0 c8340Tt0);

    /* renamed from: n */
    public abstract void mo1777n(C8340Tt0 c8340Tt0, ArrayList arrayList);

    /* renamed from: o */
    public abstract Set mo1778o(C4233iI c4233iI);

    /* renamed from: p */
    public abstract C10937rh0 mo1779p();

    /* renamed from: q */
    public abstract InterfaceC0140CD mo1780q();

    /* renamed from: r */
    public boolean mo1781r(C9261eb0 c9261eb0) {
        return true;
    }

    /* renamed from: s */
    public abstract C7952Mh0 mo1782s(C10645pP0 c10645pP0, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig0, List list);

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: t */
    public final C9261eb0 m6746t(C10645pP0 c10645pP0) {
        O90.m5968f(c10645pP0, "method");
        C6479nH c6479nH = this.f9739b;
        C9261eb0 c9261eb0M18010N1 = C9261eb0.m18010N1(mo1780q(), AbstractC1618Zi.m9582e(c6479nH, c10645pP0), c10645pP0.m23388c(), ((C10689pl0) ((C9773ib0) c6479nH.f38228b).f29347j).m23868n(c10645pP0), ((InterfaceC0581JD) this.f9742e.invoke()).mo3782b(c10645pP0.m23388c()) != null && ((ArrayList) c10645pP0.m23773g()).isEmpty());
        O90.m5968f(c6479nH, "<this>");
        C6479nH c6479nH2 = new C6479nH((C9773ib0) c6479nH.f38228b, new C8875bc1(c6479nH, c9261eb0M18010N1, c10645pP0, 0), c6479nH.f38227a);
        ArrayList typeParameters = c10645pP0.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(typeParameters));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC10292me1 interfaceC10292me1Mo10472l = ((InterfaceC10548oe1) c6479nH2.f38229c).mo10472l((C11285uP0) it.next());
            O90.m5965c(interfaceC10292me1Mo10472l);
            arrayList.add(interfaceC10292me1Mo10472l);
        }
        C8004Nh0 c8004Nh0M6745u = m6745u(c6479nH2, c9261eb0M18010N1, c10645pP0.m23773g());
        C7952Mh0 c7952Mh0Mo1782s = mo1782s(c10645pP0, arrayList, m6744l(c10645pP0, c6479nH2), c8004Nh0M6745u.f7959b);
        C10937rh0 c10937rh0Mo1779p = mo1779p();
        C0779MN c0779mn = C0779MN.f7117a;
        C7512Dv0 c7512Dv0 = EnumC10575os0.f39322a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) c10645pP0.mo22030b()).getModifiers());
        boolean zIsFinal = true ^ Modifier.isFinal(((Method) c10645pP0.mo22030b()).getModifiers());
        c7512Dv0.getClass();
        c9261eb0M18010N1.mo7857M1(null, c10937rh0Mo1779p, c0779mn, c7952Mh0Mo1782s.f7300c, c7952Mh0Mo1782s.f7299b, c7952Mh0Mo1782s.f7298a, C7512Dv0.m1930o(false, zIsAbstract, zIsFinal), AbstractC10977s02.m24575a(c10645pP0.m23390e()), C0842NN.f7735a);
        c9261eb0M18010N1.m18012O1(false, c8004Nh0M6745u.f7958a);
        if (c7952Mh0Mo1782s.f7301d.isEmpty()) {
            return c9261eb0M18010N1;
        }
        ((C7408Bv0) ((C9773ib0) c6479nH2.f38228b).f29342e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + mo1780q();
    }
}
