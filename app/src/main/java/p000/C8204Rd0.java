package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Rd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8204Rd0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f10343e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC8360Ud0 f10344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8204Rd0(AbstractC8360Ud0 abstractC8360Ud0, int i) {
        super(0);
        this.f10343e = i;
        this.f10344f = abstractC8360Ud0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        int iM8095q;
        int i;
        Type[] lowerBounds;
        Type type = null;
        int i2 = 0;
        z = false;
        boolean z = false;
        AbstractC8360Ud0 abstractC8360Ud0 = this.f10344f;
        switch (this.f10343e) {
            case 0:
                List<InterfaceC8154Qe0> parameters = abstractC8360Ud0.getParameters();
                int size = (abstractC8360Ud0.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) abstractC8360Ud0.f11941f.getValue()).booleanValue()) {
                    iM8095q = 0;
                    for (InterfaceC8154Qe0 interfaceC8154Qe0 : parameters) {
                        iM8095q += ((C8310Te0) interfaceC8154Qe0).f11456c == EnumC8102Pe0.f9213c ? abstractC8360Ud0.m8095q(interfaceC8154Qe0) : 0;
                    }
                } else {
                    List list = parameters;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        iM8095q = 0;
                    } else {
                        Iterator it = list.iterator();
                        iM8095q = 0;
                        while (it.hasNext()) {
                            if (((C8310Te0) ((InterfaceC8154Qe0) it.next())).f11456c == EnumC8102Pe0.f9213c && (iM8095q = iM8095q + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                }
                int i3 = (iM8095q + 31) / 32;
                Object[] objArr = new Object[size + i3 + 1];
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    C8310Te0 c8310Te0 = (C8310Te0) ((InterfaceC8154Qe0) it2.next());
                    boolean zM7712m = c8310Te0.m7712m();
                    int i4 = c8310Te0.f11455b;
                    if (zM7712m) {
                        C11572wf0 c11572wf0M7711l = c8310Te0.m7711l();
                        C0664KX c0664kx = AbstractC7589Fh1.f3397a;
                        AbstractC7742Ig0 abstractC7742Ig0 = c11572wf0M7711l.f45016a;
                        if (abstractC7742Ig0 != null) {
                            int i5 = AbstractC11251u80.f43535a;
                            InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
                            if (interfaceC0873NsMo1962a != null ? AbstractC11251u80.m25117b(interfaceC0873NsMo1962a) : false) {
                            }
                        }
                        C11572wf0 c11572wf0M7711l2 = c8310Te0.m7711l();
                        AP0 ap0 = c11572wf0M7711l2.f45017b;
                        Type typeM7403b = ap0 != null ? (Type) ap0.invoke() : null;
                        if (typeM7403b == null) {
                            Type type2 = ap0 != null ? (Type) ap0.invoke() : null;
                            typeM7403b = type2 != null ? type2 : AbstractC8259Se1.m7403b(c11572wf0M7711l2, false);
                        }
                        objArr[i4] = AbstractC7589Fh1.m2753e(typeM7403b);
                    }
                    if (c8310Te0.m7713n()) {
                        objArr[i4] = AbstractC8360Ud0.m8090l(c8310Te0.m7711l());
                    }
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    objArr[size + i6] = 0;
                }
                return objArr;
            case 1:
                return AbstractC7589Fh1.m2752d(abstractC8360Ud0.mo8094p());
            case 2:
                InterfaceC7158xl interfaceC7158xlMo8094p = abstractC8360Ud0.mo8094p();
                ArrayList arrayList = new ArrayList();
                if (abstractC8360Ud0.mo8097s()) {
                    i = 0;
                } else {
                    C10937rh0 c10937rh0M2755g = AbstractC7589Fh1.m2755g(interfaceC7158xlMo8094p);
                    if (c10937rh0M2755g != null) {
                        arrayList.add(new C8310Te0(abstractC8360Ud0, 0, EnumC8102Pe0.f9211a, new C8256Sd0(c10937rh0M2755g, 0)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C10937rh0 c10937rh0Mo121t0 = interfaceC7158xlMo8094p.mo121t0();
                    if (c10937rh0Mo121t0 != null) {
                        arrayList.add(new C8310Te0(abstractC8360Ud0, i, EnumC8102Pe0.f9212b, new C8256Sd0(c10937rh0Mo121t0, 1)));
                        i++;
                    }
                }
                int size2 = interfaceC7158xlMo8094p.mo1221f0().size();
                while (i2 < size2) {
                    arrayList.add(new C8310Te0(abstractC8360Ud0, i, EnumC8102Pe0.f9213c, new C8308Td0(interfaceC7158xlMo8094p, i2)));
                    i2++;
                    i++;
                }
                if (abstractC8360Ud0.m8096r() && (interfaceC7158xlMo8094p instanceof InterfaceC8406Va0) && arrayList.size() > 1) {
                    AbstractC0183Cu.m1455l(arrayList, new C8774aq0(14));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (abstractC8360Ud0.isSuspend()) {
                    Object objM25965K = AbstractC7167xu.m25965K(abstractC8360Ud0.mo8091m().mo3319a());
                    ParameterizedType parameterizedType = objM25965K instanceof ParameterizedType ? (ParameterizedType) objM25965K : null;
                    if (O90.m5963a(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC1382Vy.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        O90.m5967e(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objM4198y = AbstractC0576J8.m4198y(actualTypeArguments);
                        WildcardType wildcardType = objM4198y instanceof WildcardType ? (WildcardType) objM4198y : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) AbstractC0576J8.m4187n(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC8360Ud0.mo8091m().getReturnType() : type;
            case 4:
                AbstractC7742Ig0 returnType = abstractC8360Ud0.mo8094p().getReturnType();
                O90.m5965c(returnType);
                return new C11572wf0(returnType, new C8204Rd0(abstractC8360Ud0, 3));
            case 5:
                List typeParameters = abstractC8360Ud0.mo8094p().getTypeParameters();
                O90.m5967e(typeParameters, "getTypeParameters(...)");
                List<InterfaceC10292me1> list2 = typeParameters;
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
                for (InterfaceC10292me1 interfaceC10292me1 : list2) {
                    O90.m5965c(interfaceC10292me1);
                    arrayList2.add(new C11826yf0(abstractC8360Ud0, interfaceC10292me1));
                }
                return arrayList2;
            default:
                List parameters2 = abstractC8360Ud0.getParameters();
                if (!(parameters2 instanceof Collection) || !parameters2.isEmpty()) {
                    Iterator it3 = parameters2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (AbstractC7589Fh1.m2756h(((C8310Te0) ((InterfaceC8154Qe0) it3.next())).m7711l())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
