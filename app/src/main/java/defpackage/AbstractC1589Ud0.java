package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: Ud0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1589Ud0 implements InterfaceC1277Qd0, InterfaceC8405zf0 {
    public final AP0 a = AbstractC7978xP1.a(null, new C1355Rd0(this, 1));
    public final AP0 b = AbstractC7978xP1.a(null, new C1355Rd0(this, 2));
    public final AP0 c = AbstractC7978xP1.a(null, new C1355Rd0(this, 4));
    public final AP0 d = AbstractC7978xP1.a(null, new C1355Rd0(this, 5));
    public final AP0 e = AbstractC7978xP1.a(null, new C1355Rd0(this, 0));
    public final Object f = LB.c(EnumC4205hi0.b, new C1355Rd0(this, 6));

    public static Object l(C7835wf0 c7835wf0) throws NegativeArraySizeException {
        Class clsB = P22.b(AbstractC4083h32.b(c7835wf0));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            O90.e(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new C1420Rz("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type", 1);
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final Object call(Object... objArr) throws C0254Da {
        O90.f(objArr, "args");
        try {
            return m().call(objArr);
        } catch (IllegalAccessException e) {
            throw new C0254Da(e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1277Qd0
    public final Object callBy(Map map) throws C0254Da, NegativeArraySizeException {
        Object objL;
        int i = 1;
        O90.f(map, "args");
        boolean z = false;
        if (r()) {
            List<InterfaceC1280Qe0> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(parameters));
            for (InterfaceC1280Qe0 interfaceC1280Qe0 : parameters) {
                if (map.containsKey(interfaceC1280Qe0)) {
                    objL = map.get(interfaceC1280Qe0);
                    if (objL == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC1280Qe0 + ')');
                    }
                } else {
                    C1514Te0 c1514Te0 = (C1514Te0) interfaceC1280Qe0;
                    if (c1514Te0.m()) {
                        objL = null;
                    } else {
                        if (!c1514Te0.n()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + c1514Te0);
                        }
                        objL = l(c1514Te0.l());
                    }
                }
                arrayList.add(objL);
            }
            InterfaceC0755Jl interfaceC0755JlO = o();
            if (interfaceC0755JlO != null) {
                try {
                    return interfaceC0755JlO.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new C0254Da(e);
                }
            }
            throw new C1420Rz("This callable does not support a default call: " + p(), 1);
        }
        List<InterfaceC1280Qe0> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return m().call(isSuspend() ? new InterfaceC1729Vy[]{null} : new InterfaceC1729Vy[0]);
            } catch (IllegalAccessException e2) {
                throw new C0254Da(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.e.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f.getValue()).booleanValue();
        int i2 = 0;
        for (InterfaceC1280Qe0 interfaceC1280Qe02 : parameters2) {
            int iQ = zBooleanValue ? q(interfaceC1280Qe02) : i;
            if (map.containsKey(interfaceC1280Qe02)) {
                objArr[((C1514Te0) interfaceC1280Qe02).b] = map.get(interfaceC1280Qe02);
            } else {
                C1514Te0 c1514Te02 = (C1514Te0) interfaceC1280Qe02;
                if (c1514Te02.m()) {
                    if (zBooleanValue) {
                        int i3 = i2 + iQ;
                        for (int i4 = i2; i4 < i3; i4++) {
                            int i5 = (i4 / 32) + size;
                            Object obj = objArr[i5];
                            O90.d(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i5] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i4 % 32)));
                        }
                    } else {
                        int i6 = i;
                        int i7 = (i2 / 32) + size;
                        Object obj2 = objArr[i7];
                        O90.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i7] = Integer.valueOf(((Integer) obj2).intValue() | (i6 << (i2 % 32)));
                    }
                    z = true;
                } else if (!c1514Te02.n()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + c1514Te02);
                }
            }
            if (((C1514Te0) interfaceC1280Qe02).c == EnumC1202Pe0.c) {
                i2 += iQ;
            }
            i = 1;
        }
        if (!z) {
            try {
                InterfaceC0755Jl interfaceC0755JlM = m();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                O90.e(objArrCopyOf, "copyOf(...)");
                return interfaceC0755JlM.call(objArrCopyOf);
            } catch (IllegalAccessException e3) {
                throw new C0254Da(e3);
            }
        }
        InterfaceC0755Jl interfaceC0755JlO2 = o();
        if (interfaceC0755JlO2 != null) {
            try {
                return interfaceC0755JlO2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new C0254Da(e4);
            }
        }
        throw new C1420Rz("This callable does not support a default call: " + p(), 1);
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        Object objInvoke = this.a.invoke();
        O90.e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final List getParameters() {
        Object objInvoke = this.b.invoke();
        O90.e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final InterfaceC7454uf0 getReturnType() {
        Object objInvoke = this.c.invoke();
        O90.e(objInvoke, "invoke(...)");
        return (InterfaceC7454uf0) objInvoke;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final List getTypeParameters() {
        Object objInvoke = this.d.invoke();
        O90.e(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final EnumC0270Df0 getVisibility() {
        C7575vI visibility = p().getVisibility();
        O90.e(visibility, "getVisibility(...)");
        KX kx = AbstractC0433Fh1.a;
        if (visibility.equals(AbstractC7765wI.e)) {
            return EnumC0270Df0.a;
        }
        if (visibility.equals(AbstractC7765wI.c)) {
            return EnumC0270Df0.b;
        }
        if (visibility.equals(AbstractC7765wI.d)) {
            return EnumC0270Df0.c;
        }
        if (visibility.equals(AbstractC7765wI.a) ? true : visibility.equals(AbstractC7765wI.b)) {
            return EnumC0270Df0.d;
        }
        return null;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final boolean isAbstract() {
        return p().f() == EnumC6348os0.e;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final boolean isFinal() {
        return p().f() == EnumC6348os0.b;
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final boolean isOpen() {
        return p().f() == EnumC6348os0.d;
    }

    public abstract InterfaceC0755Jl m();

    public abstract AbstractC6497pe0 n();

    public abstract InterfaceC0755Jl o();

    public abstract InterfaceC8042xl p();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int q(InterfaceC1280Qe0 interfaceC1280Qe0) {
        if (!((Boolean) this.f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        C1514Te0 c1514Te0 = (C1514Te0) interfaceC1280Qe0;
        if (!AbstractC0433Fh1.h(c1514Te0.l())) {
            return 1;
        }
        ArrayList arrayListF = AbstractC7520v02.f(AbstractC8198yZ1.a(c1514Te0.l().a));
        O90.c(arrayListF);
        return arrayListF.size();
    }

    public final boolean r() {
        return O90.a(getName(), "<init>") && n().b().isAnnotation();
    }

    public abstract boolean s();
}
