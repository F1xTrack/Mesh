package defpackage;

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
public final class C0120Bh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ C6045nH f;
    public final /* synthetic */ C0276Dh0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120Bh0(C6045nH c6045nH, C0276Dh0 c0276Dh0) {
        super(0);
        this.f = c6045nH;
        this.g = c0276Dh0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1, types: [CZ, Wa0, qs] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Dh0, Qh0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C6045nH c6045nH;
        C1601Uh0 c1601Uh0;
        C6045nH c6045nH2;
        Collection collectionG;
        String str;
        String str2;
        ?? EmptyList;
        C1857Xo1 c1857Xo1;
        Pair pair;
        C1601Uh0 c1601Uh02;
        List listD;
        switch (this.e) {
            case 0:
                ?? r1 = this.g;
                Constructor<?>[] declaredConstructors = r1.o.a.getDeclaredConstructors();
                O90.e(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z = false;
                List listN = AbstractC4175hY0.n(AbstractC4175hY0.l(new C7991xU(J8.d(declaredConstructors), false, C2319bP0.a), C2509cP0.a));
                ArrayList arrayList = new ArrayList(listN.size());
                Iterator it = listN.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C6045nH c6045nH3 = r1.b;
                    InterfaceC7492us interfaceC7492us = r1.n;
                    if (!zHasNext) {
                        C3957gP0 c3957gP0 = r1.o;
                        boolean zG = c3957gP0.g();
                        H5 h5 = S20.b;
                        C1601Uh0 c1601Uh03 = null;
                        C6045nH c6045nH4 = this.f;
                        if (zG) {
                            C1736Wa0 c1736Wa0P1 = C1736Wa0.P1(interfaceC7492us, h5, true, ((C6518pl0) ((C4375ib0) c6045nH3.b).j).n(c3957gP0));
                            ArrayList arrayListF = c3957gP0.f();
                            ArrayList arrayList2 = new ArrayList(arrayListF.size());
                            C8203yb0 c8203yb0A = K22.a(EnumC8403ze1.b, false, false, null, 6);
                            Iterator it2 = arrayListF.iterator();
                            int i = 0;
                            while (it2.hasNext()) {
                                C7024sP0 c7024sP0 = (C7024sP0) it2.next();
                                arrayList2.add(new C1758Wh1(c1736Wa0P1, null, i, h5, c7024sP0.c(), ((C1857Xo1) c6045nH3.e).V(c7024sP0.f(), c8203yb0A), false, false, false, null, ((C6518pl0) ((C4375ib0) c6045nH3.b).j).n(c7024sP0)));
                                c6045nH4 = c6045nH4;
                                c1601Uh03 = null;
                                i++;
                                it2 = it2;
                                c8203yb0A = c8203yb0A;
                                z = false;
                            }
                            c6045nH = c6045nH4;
                            c1601Uh0 = c1601Uh03;
                            c1736Wa0P1.H1(z);
                            C7575vI visibility = interfaceC7492us.getVisibility();
                            O90.e(visibility, "getVisibility(...)");
                            if (visibility.equals(AbstractC2164ab0.b)) {
                                visibility = AbstractC2164ab0.c;
                                O90.e(visibility, "PROTECTED_AND_PACKAGE");
                            }
                            c1736Wa0P1.M1(arrayList2, visibility);
                            c1736Wa0P1.G1(false);
                            c1736Wa0P1.I1(interfaceC7492us.m());
                            String strA = AbstractC3534eB1.a(c1736Wa0P1, 2);
                            if (arrayList.isEmpty()) {
                                arrayList.add(c1736Wa0P1);
                                ((C0162Bv0) ((C4375ib0) c6045nH.b).g).getClass();
                            } else {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    if (AbstractC3534eB1.a((C6729qs) it3.next(), 2).equals(strA)) {
                                    }
                                }
                                arrayList.add(c1736Wa0P1);
                                ((C0162Bv0) ((C4375ib0) c6045nH.b).g).getClass();
                            }
                        } else {
                            c6045nH = c6045nH4;
                            c1601Uh0 = null;
                        }
                        ((C2032Zv) ((H71) ((C4375ib0) c6045nH.b).x)).a(c6045nH, interfaceC7492us, arrayList);
                        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
                        if (arrayList.isEmpty()) {
                            Class cls = c3957gP0.a;
                            boolean zIsAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            if (zIsAnnotation) {
                                ?? P1 = C1736Wa0.P1(interfaceC7492us, h5, true, ((C6518pl0) ((C4375ib0) c6045nH3.b).j).n(c3957gP0));
                                if (zIsAnnotation) {
                                    Collection collectionD = c3957gP0.d();
                                    EmptyList = new ArrayList(collectionD.size());
                                    C8203yb0 c8203yb0A2 = K22.a(EnumC8403ze1.b, true, false, c1601Uh0, 6);
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : collectionD) {
                                        if (O90.a(((C6452pP0) obj).c(), AbstractC1118Oc0.b)) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    arrayList3.size();
                                    C6452pP0 c6452pP0 = (C6452pP0) AbstractC8069xu.C(arrayList3);
                                    C1857Xo1 c1857Xo12 = (C1857Xo1) c6045nH3.e;
                                    if (c6452pP0 != null) {
                                        AbstractC7215tP0 abstractC7215tP0F = c6452pP0.f();
                                        if (abstractC7215tP0F instanceof C2128aP0) {
                                            C2128aP0 c2128aP0 = (C2128aP0) abstractC7215tP0F;
                                            pair = new Pair(c1857Xo12.U(c2128aP0, c8203yb0A2, true), c1857Xo12.V(c2128aP0.b, c8203yb0A2));
                                        } else {
                                            pair = new Pair(c1857Xo12.V(abstractC7215tP0F, c8203yb0A2), null);
                                        }
                                        c1857Xo1 = c1857Xo12;
                                        str = "getVisibility(...)";
                                        c6045nH2 = c6045nH;
                                        str2 = "PROTECTED_AND_PACKAGE";
                                        r1.x(EmptyList, P1, 0, c6452pP0, (AbstractC0663Ig0) pair.a, (AbstractC0663Ig0) pair.b);
                                    } else {
                                        c6045nH2 = c6045nH;
                                        c1857Xo1 = c1857Xo12;
                                        str = "getVisibility(...)";
                                        str2 = "PROTECTED_AND_PACKAGE";
                                    }
                                    int i2 = c6452pP0 != null ? 1 : 0;
                                    Iterator it4 = arrayList4.iterator();
                                    int i3 = 0;
                                    while (it4.hasNext()) {
                                        C6452pP0 c6452pP02 = (C6452pP0) it4.next();
                                        C1857Xo1 c1857Xo13 = c1857Xo1;
                                        r1.x(EmptyList, P1, i3 + i2, c6452pP02, c1857Xo13.V(c6452pP02.f(), c8203yb0A2), null);
                                        i3++;
                                        c1857Xo1 = c1857Xo13;
                                    }
                                } else {
                                    c6045nH2 = c6045nH;
                                    str = "getVisibility(...)";
                                    str2 = "PROTECTED_AND_PACKAGE";
                                    EmptyList = Collections.emptyList();
                                }
                                P1.H1(false);
                                C7575vI visibility2 = interfaceC7492us.getVisibility();
                                O90.e(visibility2, str);
                                if (visibility2.equals(AbstractC2164ab0.b)) {
                                    visibility2 = AbstractC2164ab0.c;
                                    O90.e(visibility2, str2);
                                }
                                P1.M1(EmptyList, visibility2);
                                P1.G1(true);
                                P1.I1(interfaceC7492us.m());
                                ((C0162Bv0) ((C4375ib0) c6045nH3.b).g).getClass();
                                c1601Uh02 = P1;
                            } else {
                                c6045nH2 = c6045nH;
                                c1601Uh02 = c1601Uh0;
                            }
                            collectionG = AbstractC8259yu.g(c1601Uh02);
                        } else {
                            c6045nH2 = c6045nH;
                            collectionG = arrayList;
                        }
                        return AbstractC8069xu.b0(((S20) c4375ib0.r).q(c6045nH2, collectionG));
                    }
                    C5306jP0 c5306jP0 = (C5306jP0) it.next();
                    C8031xh0 c8031xh0E = AbstractC1993Zi.e(c6045nH3, c5306jP0);
                    C4375ib0 c4375ib02 = (C4375ib0) c6045nH3.b;
                    C1736Wa0 c1736Wa0P12 = C1736Wa0.P1(interfaceC7492us, c8031xh0E, false, ((C6518pl0) c4375ib02.j).n(c5306jP0));
                    C6045nH c6045nH5 = new C6045nH(c4375ib02, new C2359bc1(c6045nH3, c1736Wa0P12, c5306jP0, interfaceC7492us.o().size()), c6045nH3.a);
                    Constructor constructor = c5306jP0.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    O90.c(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = MN.a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) J8.j(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) J8.j(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = c5306jP0.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C1055Nh0 c1055Nh0U = AbstractC1289Qh0.u(c6045nH5, c1736Wa0P12, listD);
                    List listO = interfaceC7492us.o();
                    O90.e(listO, "getDeclaredTypeParameters(...)");
                    List list = listO;
                    ArrayList typeParameters = c5306jP0.getTypeParameters();
                    ArrayList arrayList5 = new ArrayList(AbstractC8449zu.k(typeParameters));
                    Iterator it5 = typeParameters.iterator();
                    while (it5.hasNext()) {
                        InterfaceC5925me1 interfaceC5925me1L = ((InterfaceC6307oe1) c6045nH5.c).l((C7406uP0) it5.next());
                        O90.c(interfaceC5925me1L);
                        arrayList5.add(interfaceC5925me1L);
                    }
                    c1736Wa0P12.N1(c1055Nh0U.b, AbstractC6947s02.a(c5306jP0.e()), AbstractC8069xu.N(list, arrayList5));
                    c1736Wa0P12.G1(false);
                    c1736Wa0P12.H1(c1055Nh0U.a);
                    c1736Wa0P12.I1(interfaceC7492us.m());
                    ((C0162Bv0) ((C4375ib0) c6045nH5.b).g).getClass();
                    arrayList.add(c1736Wa0P12);
                }
                break;
            default:
                C6045nH c6045nH6 = this.f;
                return AbstractC8069xu.g0(((C2032Zv) ((H71) ((C4375ib0) c6045nH6.b).x)).f(c6045nH6, this.g.n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120Bh0(C0276Dh0 c0276Dh0, C6045nH c6045nH) {
        super(0);
        this.g = c0276Dh0;
        this.f = c6045nH;
    }
}
