package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Rd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1355Rd0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC1589Ud0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1355Rd0(AbstractC1589Ud0 abstractC1589Ud0, int i) {
        super(0);
        this.e = i;
        this.f = abstractC1589Ud0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        int iQ;
        int i;
        Type[] lowerBounds;
        Type type = null;
        int i2 = 0;
        z = false;
        boolean z = false;
        AbstractC1589Ud0 abstractC1589Ud0 = this.f;
        switch (this.e) {
            case 0:
                List<InterfaceC1280Qe0> parameters = abstractC1589Ud0.getParameters();
                int size = (abstractC1589Ud0.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) abstractC1589Ud0.f.getValue()).booleanValue()) {
                    iQ = 0;
                    for (InterfaceC1280Qe0 interfaceC1280Qe0 : parameters) {
                        iQ += ((C1514Te0) interfaceC1280Qe0).c == EnumC1202Pe0.c ? abstractC1589Ud0.q(interfaceC1280Qe0) : 0;
                    }
                } else {
                    List list = parameters;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        iQ = 0;
                    } else {
                        Iterator it = list.iterator();
                        iQ = 0;
                        while (it.hasNext()) {
                            if (((C1514Te0) ((InterfaceC1280Qe0) it.next())).c == EnumC1202Pe0.c && (iQ = iQ + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                }
                int i3 = (iQ + 31) / 32;
                Object[] objArr = new Object[size + i3 + 1];
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    C1514Te0 c1514Te0 = (C1514Te0) ((InterfaceC1280Qe0) it2.next());
                    boolean zM = c1514Te0.m();
                    int i4 = c1514Te0.b;
                    if (zM) {
                        C7835wf0 c7835wf0L = c1514Te0.l();
                        KX kx = AbstractC0433Fh1.a;
                        AbstractC0663Ig0 abstractC0663Ig0 = c7835wf0L.a;
                        if (abstractC0663Ig0 != null) {
                            int i5 = AbstractC7355u80.a;
                            InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
                            if (interfaceC1087NsA != null ? AbstractC7355u80.b(interfaceC1087NsA) : false) {
                            }
                        }
                        C7835wf0 c7835wf0L2 = c1514Te0.l();
                        AP0 ap0 = c7835wf0L2.b;
                        Type typeB = ap0 != null ? (Type) ap0.invoke() : null;
                        if (typeB == null) {
                            Type type2 = ap0 != null ? (Type) ap0.invoke() : null;
                            typeB = type2 != null ? type2 : AbstractC1437Se1.b(c7835wf0L2, false);
                        }
                        objArr[i4] = AbstractC0433Fh1.e(typeB);
                    }
                    if (c1514Te0.n()) {
                        objArr[i4] = AbstractC1589Ud0.l(c1514Te0.l());
                    }
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    objArr[size + i6] = 0;
                }
                return objArr;
            case 1:
                return AbstractC0433Fh1.d(abstractC1589Ud0.p());
            case 2:
                InterfaceC8042xl interfaceC8042xlP = abstractC1589Ud0.p();
                ArrayList arrayList = new ArrayList();
                if (abstractC1589Ud0.s()) {
                    i = 0;
                } else {
                    C6887rh0 c6887rh0G = AbstractC0433Fh1.g(interfaceC8042xlP);
                    if (c6887rh0G != null) {
                        arrayList.add(new C1514Te0(abstractC1589Ud0, 0, EnumC1202Pe0.a, new C1433Sd0(c6887rh0G, 0)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C6887rh0 c6887rh0T0 = interfaceC8042xlP.t0();
                    if (c6887rh0T0 != null) {
                        arrayList.add(new C1514Te0(abstractC1589Ud0, i, EnumC1202Pe0.b, new C1433Sd0(c6887rh0T0, 1)));
                        i++;
                    }
                }
                int size2 = interfaceC8042xlP.f0().size();
                while (i2 < size2) {
                    arrayList.add(new C1514Te0(abstractC1589Ud0, i, EnumC1202Pe0.c, new C1511Td0(interfaceC8042xlP, i2)));
                    i2++;
                    i++;
                }
                if (abstractC1589Ud0.r() && (interfaceC8042xlP instanceof InterfaceC1658Va0) && arrayList.size() > 1) {
                    AbstractC0236Cu.l(arrayList, new C2209aq0(14));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (abstractC1589Ud0.isSuspend()) {
                    Object objK = AbstractC8069xu.K(abstractC1589Ud0.m().a());
                    ParameterizedType parameterizedType = objK instanceof ParameterizedType ? (ParameterizedType) objK : null;
                    if (O90.a(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC1729Vy.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        O90.e(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objY = J8.y(actualTypeArguments);
                        WildcardType wildcardType = objY instanceof WildcardType ? (WildcardType) objY : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) J8.n(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC1589Ud0.m().getReturnType() : type;
            case 4:
                AbstractC0663Ig0 returnType = abstractC1589Ud0.p().getReturnType();
                O90.c(returnType);
                return new C7835wf0(returnType, new C1355Rd0(abstractC1589Ud0, 3));
            case 5:
                List typeParameters = abstractC1589Ud0.p().getTypeParameters();
                O90.e(typeParameters, "getTypeParameters(...)");
                List<InterfaceC5925me1> list2 = typeParameters;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
                for (InterfaceC5925me1 interfaceC5925me1 : list2) {
                    O90.c(interfaceC5925me1);
                    arrayList2.add(new C8215yf0(abstractC1589Ud0, interfaceC5925me1));
                }
                return arrayList2;
            default:
                List parameters2 = abstractC1589Ud0.getParameters();
                if (!(parameters2 instanceof Collection) || !parameters2.isEmpty()) {
                    Iterator it3 = parameters2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (AbstractC0433Fh1.h(((C1514Te0) ((InterfaceC1280Qe0) it3.next())).l())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
