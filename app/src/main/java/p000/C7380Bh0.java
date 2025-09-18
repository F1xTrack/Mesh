package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: Bh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7380Bh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f973e = 0;

    /* renamed from: f */
    public final /* synthetic */ C6479nH f974f;

    /* renamed from: g */
    public final /* synthetic */ C7484Dh0 f975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7380Bh0(C6479nH c6479nH, C7484Dh0 c7484Dh0) {
        super(0);
        this.f974f = c6479nH;
        this.f975g = c7484Dh0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1, types: [CZ, Wa0, qs] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Dh0, Qh0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C6479nH c6479nH;
        C8368Uh0 c8368Uh0;
        C6479nH c6479nH2;
        Collection collectionM26276g;
        String str;
        String str2;
        ?? EmptyList;
        C8539Xo1 c8539Xo1;
        Pair pair;
        C8368Uh0 c8368Uh02;
        List listM23389d;
        switch (this.f973e) {
            case 0:
                ?? r1 = this.f975g;
                Constructor<?>[] declaredConstructors = r1.f2159o.f27782a.getDeclaredConstructors();
                O90.m5967e(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z = false;
                List listM18835n = AbstractC9639hY0.m18835n(AbstractC9639hY0.m18833l(new C7141xU(AbstractC0576J8.m4177d(declaredConstructors), false, C8848bP0.f17005a), C8976cP0.f17467a));
                ArrayList arrayList = new ArrayList(listM18835n.size());
                Iterator it = listM18835n.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C6479nH c6479nH3 = r1.f9739b;
                    InterfaceC6976us interfaceC6976us = r1.f2158n;
                    if (!zHasNext) {
                        C9493gP0 c9493gP0 = r1.f2159o;
                        boolean zM18517g = c9493gP0.m18517g();
                        C0447H5 c0447h5 = S20.f10539b;
                        C8368Uh0 c8368Uh03 = null;
                        C6479nH c6479nH4 = this.f974f;
                        if (zM18517g) {
                            C8458Wa0 c8458Wa0M8822P1 = C8458Wa0.m8822P1(interfaceC6976us, c0447h5, true, ((C10689pl0) ((C9773ib0) c6479nH3.f38228b).f29347j).m23868n(c9493gP0));
                            ArrayList arrayListM18516f = c9493gP0.m18516f();
                            ArrayList arrayList2 = new ArrayList(arrayListM18516f.size());
                            C11818yb0 c11818yb0M4530a = K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 6);
                            Iterator it2 = arrayListM18516f.iterator();
                            int i = 0;
                            while (it2.hasNext()) {
                                C11029sP0 c11029sP0 = (C11029sP0) it2.next();
                                arrayList2.add(new C8473Wh1(c8458Wa0M8822P1, null, i, c0447h5, c11029sP0.m23388c(), ((C8539Xo1) c6479nH3.f38231e).m9139V(c11029sP0.m24737f(), c11818yb0M4530a), false, false, false, null, ((C10689pl0) ((C9773ib0) c6479nH3.f38228b).f29347j).m23868n(c11029sP0)));
                                c6479nH4 = c6479nH4;
                                c8368Uh03 = null;
                                i++;
                                it2 = it2;
                                c11818yb0M4530a = c11818yb0M4530a;
                                z = false;
                            }
                            c6479nH = c6479nH4;
                            c8368Uh0 = c8368Uh03;
                            c8458Wa0M8822P1.mo1219H1(z);
                            C7003vI visibility = interfaceC6976us.getVisibility();
                            O90.m5967e(visibility, "getVisibility(...)");
                            if (visibility.equals(AbstractC8744ab0.f15576b)) {
                                visibility = AbstractC8744ab0.f15577c;
                                O90.m5967e(visibility, "PROTECTED_AND_PACKAGE");
                            }
                            c8458Wa0M8822P1.m24075M1(arrayList2, visibility);
                            c8458Wa0M8822P1.mo1218G1(false);
                            c8458Wa0M8822P1.m1220I1(interfaceC6976us.mo1492m());
                            String strM17874a = AbstractC9210eB1.m17874a(c8458Wa0M8822P1, 2);
                            if (arrayList.isEmpty()) {
                                arrayList.add(c8458Wa0M8822P1);
                                ((C7408Bv0) ((C9773ib0) c6479nH.f38228b).f29344g).getClass();
                            } else {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    if (AbstractC9210eB1.m17874a((C6707qs) it3.next(), 2).equals(strM17874a)) {
                                    }
                                }
                                arrayList.add(c8458Wa0M8822P1);
                                ((C7408Bv0) ((C9773ib0) c6479nH.f38228b).f29344g).getClass();
                            }
                        } else {
                            c6479nH = c6479nH4;
                            c8368Uh0 = null;
                        }
                        ((C1631Zv) ((H71) ((C9773ib0) c6479nH.f38228b).f29361x)).m9637a(c6479nH, interfaceC6976us, arrayList);
                        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
                        if (arrayList.isEmpty()) {
                            Class cls = c9493gP0.f27782a;
                            boolean zIsAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            if (zIsAnnotation) {
                                ?? M8822P1 = C8458Wa0.m8822P1(interfaceC6976us, c0447h5, true, ((C10689pl0) ((C9773ib0) c6479nH3.f38228b).f29347j).m23868n(c9493gP0));
                                if (zIsAnnotation) {
                                    Collection collectionM18514d = c9493gP0.m18514d();
                                    EmptyList = new ArrayList(collectionM18514d.size());
                                    C11818yb0 c11818yb0M4530a2 = K22.m4530a(EnumC11952ze1.f46923b, true, false, c8368Uh0, 6);
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : collectionM18514d) {
                                        if (O90.m5963a(((C10645pP0) obj).m23388c(), AbstractC8046Oc0.f8520b)) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    arrayList3.size();
                                    C10645pP0 c10645pP0 = (C10645pP0) AbstractC7167xu.m25957C(arrayList3);
                                    C8539Xo1 c8539Xo12 = (C8539Xo1) c6479nH3.f38231e;
                                    if (c10645pP0 != null) {
                                        AbstractC11157tP0 abstractC11157tP0M23772f = c10645pP0.m23772f();
                                        if (abstractC11157tP0M23772f instanceof C8720aP0) {
                                            C8720aP0 c8720aP0 = (C8720aP0) abstractC11157tP0M23772f;
                                            pair = new Pair(c8539Xo12.m9138U(c8720aP0, c11818yb0M4530a2, true), c8539Xo12.m9139V(c8720aP0.f15492b, c11818yb0M4530a2));
                                        } else {
                                            pair = new Pair(c8539Xo12.m9139V(abstractC11157tP0M23772f, c11818yb0M4530a2), null);
                                        }
                                        c8539Xo1 = c8539Xo12;
                                        str = "getVisibility(...)";
                                        c6479nH2 = c6479nH;
                                        str2 = "PROTECTED_AND_PACKAGE";
                                        r1.m1783x(EmptyList, M8822P1, 0, c10645pP0, (AbstractC7742Ig0) pair.f36702a, (AbstractC7742Ig0) pair.f36703b);
                                    } else {
                                        c6479nH2 = c6479nH;
                                        c8539Xo1 = c8539Xo12;
                                        str = "getVisibility(...)";
                                        str2 = "PROTECTED_AND_PACKAGE";
                                    }
                                    int i2 = c10645pP0 != null ? 1 : 0;
                                    Iterator it4 = arrayList4.iterator();
                                    int i3 = 0;
                                    while (it4.hasNext()) {
                                        C10645pP0 c10645pP02 = (C10645pP0) it4.next();
                                        C8539Xo1 c8539Xo13 = c8539Xo1;
                                        r1.m1783x(EmptyList, M8822P1, i3 + i2, c10645pP02, c8539Xo13.m9139V(c10645pP02.m23772f(), c11818yb0M4530a2), null);
                                        i3++;
                                        c8539Xo1 = c8539Xo13;
                                    }
                                } else {
                                    c6479nH2 = c6479nH;
                                    str = "getVisibility(...)";
                                    str2 = "PROTECTED_AND_PACKAGE";
                                    EmptyList = Collections.emptyList();
                                }
                                M8822P1.mo1219H1(false);
                                C7003vI visibility2 = interfaceC6976us.getVisibility();
                                O90.m5967e(visibility2, str);
                                if (visibility2.equals(AbstractC8744ab0.f15576b)) {
                                    visibility2 = AbstractC8744ab0.f15577c;
                                    O90.m5967e(visibility2, str2);
                                }
                                M8822P1.m24075M1(EmptyList, visibility2);
                                M8822P1.mo1218G1(true);
                                M8822P1.m1220I1(interfaceC6976us.mo1492m());
                                ((C7408Bv0) ((C9773ib0) c6479nH3.f38228b).f29344g).getClass();
                                c8368Uh02 = M8822P1;
                            } else {
                                c6479nH2 = c6479nH;
                                c8368Uh02 = c8368Uh0;
                            }
                            collectionM26276g = AbstractC7230yu.m26276g(c8368Uh02);
                        } else {
                            c6479nH2 = c6479nH;
                            collectionM26276g = arrayList;
                        }
                        return AbstractC7167xu.m25982b0(((S20) c9773ib0.f29355r).m7165q(c6479nH2, collectionM26276g));
                    }
                    C9877jP0 c9877jP0 = (C9877jP0) it.next();
                    C11703xh0 c11703xh0M9582e = AbstractC1618Zi.m9582e(c6479nH3, c9877jP0);
                    C9773ib0 c9773ib02 = (C9773ib0) c6479nH3.f38228b;
                    C8458Wa0 c8458Wa0M8822P12 = C8458Wa0.m8822P1(interfaceC6976us, c11703xh0M9582e, false, ((C10689pl0) c9773ib02.f29347j).m23868n(c9877jP0));
                    C6479nH c6479nH5 = new C6479nH(c9773ib02, new C8875bc1(c6479nH3, c8458Wa0M8822P12, c9877jP0, interfaceC6976us.mo1438o().size()), c6479nH3.f38227a);
                    Constructor constructor = c9877jP0.f35144a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    O90.m5965c(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listM23389d = C0779MN.f7117a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC0576J8.m4183j(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC0576J8.m4183j(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listM23389d = c9877jP0.m23389d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C8004Nh0 c8004Nh0M6745u = AbstractC8160Qh0.m6745u(c6479nH5, c8458Wa0M8822P12, listM23389d);
                    List listMo1438o = interfaceC6976us.mo1438o();
                    O90.m5967e(listMo1438o, "getDeclaredTypeParameters(...)");
                    List list = listMo1438o;
                    ArrayList typeParameters = c9877jP0.getTypeParameters();
                    ArrayList arrayList5 = new ArrayList(AbstractC7293zu.m26586k(typeParameters));
                    Iterator it5 = typeParameters.iterator();
                    while (it5.hasNext()) {
                        InterfaceC10292me1 interfaceC10292me1Mo10472l = ((InterfaceC10548oe1) c6479nH5.f38229c).mo10472l((C11285uP0) it5.next());
                        O90.m5965c(interfaceC10292me1Mo10472l);
                        arrayList5.add(interfaceC10292me1Mo10472l);
                    }
                    c8458Wa0M8822P12.m24076N1(c8004Nh0M6745u.f7959b, AbstractC10977s02.m24575a(c9877jP0.m23390e()), AbstractC7167xu.m25968N(list, arrayList5));
                    c8458Wa0M8822P12.mo1218G1(false);
                    c8458Wa0M8822P12.mo1219H1(c8004Nh0M6745u.f7958a);
                    c8458Wa0M8822P12.m1220I1(interfaceC6976us.mo1492m());
                    ((C7408Bv0) ((C9773ib0) c6479nH5.f38228b).f29344g).getClass();
                    arrayList.add(c8458Wa0M8822P12);
                }
                break;
            default:
                C6479nH c6479nH6 = this.f974f;
                return AbstractC7167xu.m25987g0(((C1631Zv) ((H71) ((C9773ib0) c6479nH6.f38228b).f29361x)).m9642f(c6479nH6, this.f975g.f2158n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7380Bh0(C7484Dh0 c7484Dh0, C6479nH c6479nH) {
        super(0);
        this.f975g = c7484Dh0;
        this.f974f = c6479nH;
    }
}
