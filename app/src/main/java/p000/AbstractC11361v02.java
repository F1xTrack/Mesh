package p000;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: v02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11361v02 {
    /* renamed from: a */
    public static final ArrayList m25293a(Object obj, C0134C7 c0134c7, List list, List list2) {
        AbstractC11815yZ1 c8053Of1;
        Object objMo7706a;
        List<Pair> list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list3));
        boolean z = false;
        for (Pair pair : list3) {
            ExpectedType expectedType = (ExpectedType) pair.f36702a;
            AbstractC8309Td1 abstractC8309Td1 = (AbstractC8309Td1) pair.f36703b;
            SingleType[] f26953a = expectedType.getF26953a();
            int length = f26953a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c8053Of1 = Z70.f14752a;
                    break;
                }
                if (f26953a[i].f26962a.f15265a.mo2810j(obj)) {
                    if (z) {
                        c8053Of1 = new C8053Of1(obj, abstractC8309Td1, c0134c7);
                        break;
                    }
                    try {
                        objMo7706a = abstractC8309Td1.mo3314c() ? obj : abstractC8309Td1.mo7706a(obj, c0134c7);
                    } catch (Throwable unused) {
                        objMo7706a = null;
                    }
                    if (objMo7706a != null) {
                        c8053Of1 = new C4087fz(objMo7706a);
                        break;
                    }
                }
                i++;
            }
            if (c8053Of1 instanceof C4087fz) {
                z = true;
            }
            arrayList.add(c8053Of1);
        }
        if (z) {
            return arrayList;
        }
        throw new C7841Kd1("Cannot cast '" + obj + "' to 'Either<" + AbstractC7167xu.m25962H(list2, ", ", null, null, C6228jI.f35042t, 30) + ">'");
    }

    /* renamed from: b */
    public static final Object m25294b(Object obj, InterfaceC7158xl interfaceC7158xl) {
        AbstractC7742Ig0 abstractC7742Ig0M25296d;
        Class clsM25301i;
        return (((interfaceC7158xl instanceof CE0) && AbstractC11251u80.m25119d((InterfaceC9276ei1) interfaceC7158xl)) || (abstractC7742Ig0M25296d = m25296d(interfaceC7158xl)) == null || (clsM25301i = m25301i(abstractC7742Ig0M25296d)) == null) ? obj : m25297e(clsM25301i, interfaceC7158xl).invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.InterfaceC0615Jl m25295c(p000.InterfaceC0615Jl r3, p000.InterfaceC0036AZ r4, boolean r5) {
        /*
            java.lang.String r0 = "descriptor"
            p000.O90.m5968f(r4, r0)
            boolean r0 = p000.AbstractC11251u80.m25116a(r4)
            if (r0 != 0) goto La0
            java.util.List r0 = r4.mo122x0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            p000.O90.m5967e(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L24
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L24
            goto L3f
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            rh0 r1 = (p000.C10937rh0) r1
            Ig0 r1 = r1.getType()
            boolean r1 = p000.AbstractC11251u80.m25121f(r1)
            if (r1 == 0) goto L28
            goto La0
        L3f:
            java.util.List r0 = r4.mo1221f0()
            java.lang.String r1 = "getValueParameters(...)"
            p000.O90.m5967e(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L58
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L58
            goto L7a
        L58:
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            Wh1 r1 = (p000.C8473Wh1) r1
            fi1 r1 = (p000.AbstractC9404fi1) r1
            Ig0 r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            p000.O90.m5967e(r1, r2)
            boolean r1 = p000.AbstractC11251u80.m25121f(r1)
            if (r1 == 0) goto L5c
            goto La0
        L7a:
            Ig0 r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L94
            Pd1 r0 = r0.mo3797E()
            Ns r0 = r0.mo1962a()
            if (r0 == 0) goto L90
            boolean r0 = p000.AbstractC11251u80.m25117b(r0)
            goto L91
        L90:
            r0 = 0
        L91:
            if (r0 != r1) goto L94
            goto La0
        L94:
            Ig0 r0 = m25296d(r4)
            if (r0 == 0) goto La6
            boolean r0 = p000.AbstractC11251u80.m25121f(r0)
            if (r0 != r1) goto La6
        La0:
            Nh1 r0 = new Nh1
            r0.<init>(r3, r4, r5)
            r3 = r0
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11361v02.m25295c(Jl, AZ, boolean):Jl");
    }

    /* renamed from: d */
    public static final AbstractC7742Ig0 m25296d(InterfaceC7158xl interfaceC7158xl) {
        C10937rh0 c10937rh0Mo121t0 = interfaceC7158xl.mo121t0();
        C10937rh0 c10937rh0Mo119q0 = interfaceC7158xl.mo119q0();
        if (c10937rh0Mo121t0 != null) {
            return c10937rh0Mo121t0.getType();
        }
        if (c10937rh0Mo119q0 != null) {
            if (interfaceC7158xl instanceof InterfaceC6522ny) {
                return c10937rh0Mo119q0.getType();
            }
            InterfaceC0140CD interfaceC0140CDMo423i = interfaceC7158xl.mo423i();
            InterfaceC6976us interfaceC6976us = interfaceC0140CDMo423i instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CDMo423i : null;
            if (interfaceC6976us != null) {
                return interfaceC6976us.mo1492m();
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final Method m25297e(Class cls, InterfaceC7158xl interfaceC7158xl) throws NoSuchMethodException, SecurityException {
        O90.m5968f(interfaceC7158xl, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            O90.m5965c(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C1131Rz("No unbox method found in inline class: " + cls + " (calling " + interfaceC7158xl + ')', 1);
        }
    }

    /* renamed from: f */
    public static final ArrayList m25298f(X01 x01) {
        ArrayList arrayListM25299g = m25299g(AbstractC11815yZ1.m26170a(x01));
        if (arrayListM25299g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayListM25299g));
        Iterator it = arrayListM25299g.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = x01.mo3797E().mo1962a();
        O90.m5966d(interfaceC0873NsMo1962a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsM2759k = AbstractC7589Fh1.m2759k((InterfaceC6976us) interfaceC0873NsMo1962a);
        O90.m5965c(clsM2759k);
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsM2759k.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* renamed from: g */
    public static final ArrayList m25299g(X01 x01) {
        ?? M26274e;
        ArrayList arrayList = null;
        if (AbstractC11251u80.m25122g(x01)) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = x01.mo3797E().mo1962a();
            O90.m5966d(interfaceC0873NsMo1962a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            int i = AbstractC6940uI.f43634a;
            AbstractC8057Oh1 abstractC8057Oh1Mo1429J0 = ((InterfaceC6976us) interfaceC0873NsMo1962a).mo1429J0();
            C9681ht0 c9681ht0 = abstractC8057Oh1Mo1429J0 instanceof C9681ht0 ? (C9681ht0) abstractC8057Oh1Mo1429J0 : null;
            O90.m5965c(c9681ht0);
            ArrayList<Pair> arrayList2 = c9681ht0.f28648a;
            arrayList = new ArrayList();
            for (Pair pair : arrayList2) {
                C8340Tt0 c8340Tt0 = (C8340Tt0) pair.f36702a;
                ArrayList arrayListM25299g = m25299g((X01) pair.f36703b);
                if (arrayListM25299g != null) {
                    M26274e = new ArrayList(AbstractC7293zu.m26586k(arrayListM25299g));
                    Iterator it = arrayListM25299g.iterator();
                    while (it.hasNext()) {
                        M26274e.add(c8340Tt0.m7802c() + '-' + ((String) it.next()));
                    }
                } else {
                    M26274e = AbstractC7230yu.m26274e(c8340Tt0.m7802c());
                }
                AbstractC0246Du.m1920m(arrayList, (Iterable) M26274e);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final Class m25300h(InterfaceC0140CD interfaceC0140CD) {
        if (!(interfaceC0140CD instanceof InterfaceC6976us) || !AbstractC11251u80.m25117b(interfaceC0140CD)) {
            return null;
        }
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) interfaceC0140CD;
        Class clsM2759k = AbstractC7589Fh1.m2759k(interfaceC6976us);
        if (clsM2759k != null) {
            return clsM2759k;
        }
        throw new C1131Rz("Class object for the class " + interfaceC6976us.getName() + " cannot be found (classId=" + AbstractC6940uI.m25153f((InterfaceC0873Ns) interfaceC0140CD) + ')', 1);
    }

    /* renamed from: i */
    public static final Class m25301i(AbstractC7742Ig0 abstractC7742Ig0) {
        Class clsM25300h = m25300h(abstractC7742Ig0.mo3797E().mo1962a());
        if (clsM25300h == null) {
            return null;
        }
        if (!AbstractC7375Be1.m787e(abstractC7742Ig0)) {
            return clsM25300h;
        }
        X01 x01M25123h = AbstractC11251u80.m25123h(abstractC7742Ig0);
        if (x01M25123h == null || AbstractC7375Be1.m787e(x01M25123h) || AbstractC11955zg0.m26487F(x01M25123h)) {
            return null;
        }
        return clsM25300h;
    }
}
