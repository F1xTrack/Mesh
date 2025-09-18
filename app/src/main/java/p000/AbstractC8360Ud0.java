package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: Ud0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8360Ud0 implements InterfaceC8152Qd0, InterfaceC11953zf0 {

    /* renamed from: a */
    public final AP0 f11936a = AbstractC11668xP1.m25850a(null, new C8204Rd0(this, 1));

    /* renamed from: b */
    public final AP0 f11937b = AbstractC11668xP1.m25850a(null, new C8204Rd0(this, 2));

    /* renamed from: c */
    public final AP0 f11938c = AbstractC11668xP1.m25850a(null, new C8204Rd0(this, 4));

    /* renamed from: d */
    public final AP0 f11939d = AbstractC11668xP1.m25850a(null, new C8204Rd0(this, 5));

    /* renamed from: e */
    public final AP0 f11940e = AbstractC11668xP1.m25850a(null, new C8204Rd0(this, 0));

    /* renamed from: f */
    public final Object f11941f = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C8204Rd0(this, 6));

    /* renamed from: l */
    public static Object m8090l(C11572wf0 c11572wf0) throws NegativeArraySizeException {
        Class clsM6213b = P22.m6213b(AbstractC9578h32.m18712b(c11572wf0));
        if (clsM6213b.isArray()) {
            Object objNewInstance = Array.newInstance(clsM6213b.getComponentType(), 0);
            O90.m5967e(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new C1131Rz("Cannot instantiate the default empty array of type " + clsM6213b.getSimpleName() + ", because it is not an array type", 1);
    }

    @Override // p000.InterfaceC8152Qd0
    public final Object call(Object... objArr) throws C0226Da {
        O90.m5968f(objArr, "args");
        try {
            return mo8091m().call(objArr);
        } catch (IllegalAccessException e) {
            throw new C0226Da(e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8152Qd0
    public final Object callBy(Map map) throws C0226Da, NegativeArraySizeException {
        Object objM8090l;
        int i = 1;
        O90.m5968f(map, "args");
        boolean z = false;
        if (m8096r()) {
            List<InterfaceC8154Qe0> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(parameters));
            for (InterfaceC8154Qe0 interfaceC8154Qe0 : parameters) {
                if (map.containsKey(interfaceC8154Qe0)) {
                    objM8090l = map.get(interfaceC8154Qe0);
                    if (objM8090l == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC8154Qe0 + ')');
                    }
                } else {
                    C8310Te0 c8310Te0 = (C8310Te0) interfaceC8154Qe0;
                    if (c8310Te0.m7712m()) {
                        objM8090l = null;
                    } else {
                        if (!c8310Te0.m7713n()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + c8310Te0);
                        }
                        objM8090l = m8090l(c8310Te0.m7711l());
                    }
                }
                arrayList.add(objM8090l);
            }
            InterfaceC0615Jl interfaceC0615JlMo8093o = mo8093o();
            if (interfaceC0615JlMo8093o != null) {
                try {
                    return interfaceC0615JlMo8093o.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new C0226Da(e);
                }
            }
            throw new C1131Rz("This callable does not support a default call: " + mo8094p(), 1);
        }
        List<InterfaceC8154Qe0> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return mo8091m().call(isSuspend() ? new InterfaceC1382Vy[]{null} : new InterfaceC1382Vy[0]);
            } catch (IllegalAccessException e2) {
                throw new C0226Da(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f11940e.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f11941f.getValue()).booleanValue();
        int i2 = 0;
        for (InterfaceC8154Qe0 interfaceC8154Qe02 : parameters2) {
            int iM8095q = zBooleanValue ? m8095q(interfaceC8154Qe02) : i;
            if (map.containsKey(interfaceC8154Qe02)) {
                objArr[((C8310Te0) interfaceC8154Qe02).f11455b] = map.get(interfaceC8154Qe02);
            } else {
                C8310Te0 c8310Te02 = (C8310Te0) interfaceC8154Qe02;
                if (c8310Te02.m7712m()) {
                    if (zBooleanValue) {
                        int i3 = i2 + iM8095q;
                        for (int i4 = i2; i4 < i3; i4++) {
                            int i5 = (i4 / 32) + size;
                            Object obj = objArr[i5];
                            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i5] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i4 % 32)));
                        }
                    } else {
                        int i6 = i;
                        int i7 = (i2 / 32) + size;
                        Object obj2 = objArr[i7];
                        O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i7] = Integer.valueOf(((Integer) obj2).intValue() | (i6 << (i2 % 32)));
                    }
                    z = true;
                } else if (!c8310Te02.m7713n()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + c8310Te02);
                }
            }
            if (((C8310Te0) interfaceC8154Qe02).f11456c == EnumC8102Pe0.f9213c) {
                i2 += iM8095q;
            }
            i = 1;
        }
        if (!z) {
            try {
                InterfaceC0615Jl interfaceC0615JlMo8091m = mo8091m();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                O90.m5967e(objArrCopyOf, "copyOf(...)");
                return interfaceC0615JlMo8091m.call(objArrCopyOf);
            } catch (IllegalAccessException e3) {
                throw new C0226Da(e3);
            }
        }
        InterfaceC0615Jl interfaceC0615JlMo8093o2 = mo8093o();
        if (interfaceC0615JlMo8093o2 != null) {
            try {
                return interfaceC0615JlMo8093o2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new C0226Da(e4);
            }
        }
        throw new C1131Rz("This callable does not support a default call: " + mo8094p(), 1);
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        Object objInvoke = this.f11936a.invoke();
        O90.m5967e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p000.InterfaceC8152Qd0
    public final List getParameters() {
        Object objInvoke = this.f11937b.invoke();
        O90.m5967e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p000.InterfaceC8152Qd0
    public final InterfaceC11317uf0 getReturnType() {
        Object objInvoke = this.f11938c.invoke();
        O90.m5967e(objInvoke, "invoke(...)");
        return (InterfaceC11317uf0) objInvoke;
    }

    @Override // p000.InterfaceC8152Qd0
    public final List getTypeParameters() {
        Object objInvoke = this.f11939d.invoke();
        O90.m5967e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // p000.InterfaceC8152Qd0
    public final EnumC7480Df0 getVisibility() {
        C7003vI visibility = mo8094p().getVisibility();
        O90.m5967e(visibility, "getVisibility(...)");
        C0664KX c0664kx = AbstractC7589Fh1.f3397a;
        if (visibility.equals(AbstractC7066wI.f44764e)) {
            return EnumC7480Df0.f2133a;
        }
        if (visibility.equals(AbstractC7066wI.f44762c)) {
            return EnumC7480Df0.f2134b;
        }
        if (visibility.equals(AbstractC7066wI.f44763d)) {
            return EnumC7480Df0.f2135c;
        }
        if (visibility.equals(AbstractC7066wI.f44760a) ? true : visibility.equals(AbstractC7066wI.f44761b)) {
            return EnumC7480Df0.f2136d;
        }
        return null;
    }

    @Override // p000.InterfaceC8152Qd0
    public final boolean isAbstract() {
        return mo8094p().mo115f() == EnumC10575os0.f39326e;
    }

    @Override // p000.InterfaceC8152Qd0
    public final boolean isFinal() {
        return mo8094p().mo115f() == EnumC10575os0.f39323b;
    }

    @Override // p000.InterfaceC8152Qd0
    public final boolean isOpen() {
        return mo8094p().mo115f() == EnumC10575os0.f39325d;
    }

    /* renamed from: m */
    public abstract InterfaceC0615Jl mo8091m();

    /* renamed from: n */
    public abstract AbstractC10675pe0 mo8092n();

    /* renamed from: o */
    public abstract InterfaceC0615Jl mo8093o();

    /* renamed from: p */
    public abstract InterfaceC7158xl mo8094p();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: q */
    public final int m8095q(InterfaceC8154Qe0 interfaceC8154Qe0) {
        if (!((Boolean) this.f11941f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        C8310Te0 c8310Te0 = (C8310Te0) interfaceC8154Qe0;
        if (!AbstractC7589Fh1.m2756h(c8310Te0.m7711l())) {
            return 1;
        }
        ArrayList arrayListM25298f = AbstractC11361v02.m25298f(AbstractC11815yZ1.m26170a(c8310Te0.m7711l().f45016a));
        O90.m5965c(arrayListM25298f);
        return arrayListM25298f.size();
    }

    /* renamed from: r */
    public final boolean m8096r() {
        return O90.m5963a(getName(), "<init>") && mo8092n().mo2807b().isAnnotation();
    }

    /* renamed from: s */
    public abstract boolean mo8097s();
}
