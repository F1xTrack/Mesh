package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: v02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7520v02 {
    public static final ArrayList a(Object obj, C7 c7, List list, List list2) {
        AbstractC8198yZ1 c1128Of1;
        Object objA;
        List<Pair> list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list3));
        boolean z = false;
        for (Pair pair : list3) {
            ExpectedType expectedType = (ExpectedType) pair.a;
            AbstractC1512Td1 abstractC1512Td1 = (AbstractC1512Td1) pair.b;
            SingleType[] a = expectedType.getA();
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c1128Of1 = Z70.a;
                    break;
                }
                if (a[i].a.a.j(obj)) {
                    if (z) {
                        c1128Of1 = new C1128Of1(obj, abstractC1512Td1, c7);
                        break;
                    }
                    try {
                        objA = abstractC1512Td1.c() ? obj : abstractC1512Td1.a(obj, c7);
                    } catch (Throwable unused) {
                        objA = null;
                    }
                    if (objA != null) {
                        c1128Of1 = new C3873fz(objA);
                        break;
                    }
                }
                i++;
            }
            if (c1128Of1 instanceof C3873fz) {
                z = true;
            }
            arrayList.add(c1128Of1);
        }
        if (z) {
            return arrayList;
        }
        throw new C0811Kd1("Cannot cast '" + obj + "' to 'Either<" + AbstractC8069xu.H(list2, ", ", null, null, C5284jI.t, 30) + ">'");
    }

    public static final Object b(Object obj, InterfaceC8042xl interfaceC8042xl) {
        AbstractC0663Ig0 abstractC0663Ig0D;
        Class clsI;
        return (((interfaceC8042xl instanceof CE0) && AbstractC7355u80.d((InterfaceC3633ei1) interfaceC8042xl)) || (abstractC0663Ig0D = d(interfaceC8042xl)) == null || (clsI = i(abstractC0663Ig0D)) == null) ? obj : e(clsI, interfaceC8042xl).invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.InterfaceC0755Jl c(defpackage.InterfaceC0755Jl r3, defpackage.AZ r4, boolean r5) {
        /*
            java.lang.String r0 = "descriptor"
            defpackage.O90.f(r4, r0)
            boolean r0 = defpackage.AbstractC7355u80.a(r4)
            if (r0 != 0) goto La0
            java.util.List r0 = r4.x0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            defpackage.O90.e(r0, r1)
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
            rh0 r1 = (defpackage.C6887rh0) r1
            Ig0 r1 = r1.getType()
            boolean r1 = defpackage.AbstractC7355u80.f(r1)
            if (r1 == 0) goto L28
            goto La0
        L3f:
            java.util.List r0 = r4.f0()
            java.lang.String r1 = "getValueParameters(...)"
            defpackage.O90.e(r0, r1)
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
            Wh1 r1 = (defpackage.C1758Wh1) r1
            fi1 r1 = (defpackage.AbstractC3824fi1) r1
            Ig0 r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            defpackage.O90.e(r1, r2)
            boolean r1 = defpackage.AbstractC7355u80.f(r1)
            if (r1 == 0) goto L5c
            goto La0
        L7a:
            Ig0 r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L94
            Pd1 r0 = r0.E()
            Ns r0 = r0.a()
            if (r0 == 0) goto L90
            boolean r0 = defpackage.AbstractC7355u80.b(r0)
            goto L91
        L90:
            r0 = 0
        L91:
            if (r0 != r1) goto L94
            goto La0
        L94:
            Ig0 r0 = d(r4)
            if (r0 == 0) goto La6
            boolean r0 = defpackage.AbstractC7355u80.f(r0)
            if (r0 != r1) goto La6
        La0:
            Nh1 r0 = new Nh1
            r0.<init>(r3, r4, r5)
            r3 = r0
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7520v02.c(Jl, AZ, boolean):Jl");
    }

    public static final AbstractC0663Ig0 d(InterfaceC8042xl interfaceC8042xl) {
        C6887rh0 c6887rh0T0 = interfaceC8042xl.t0();
        C6887rh0 c6887rh0Q0 = interfaceC8042xl.q0();
        if (c6887rh0T0 != null) {
            return c6887rh0T0.getType();
        }
        if (c6887rh0Q0 != null) {
            if (interfaceC8042xl instanceof InterfaceC6174ny) {
                return c6887rh0Q0.getType();
            }
            CD cdI = interfaceC8042xl.i();
            InterfaceC7492us interfaceC7492us = cdI instanceof InterfaceC7492us ? (InterfaceC7492us) cdI : null;
            if (interfaceC7492us != null) {
                return interfaceC7492us.m();
            }
        }
        return null;
    }

    public static final Method e(Class cls, InterfaceC8042xl interfaceC8042xl) throws NoSuchMethodException, SecurityException {
        O90.f(interfaceC8042xl, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            O90.c(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C1420Rz("No unbox method found in inline class: " + cls + " (calling " + interfaceC8042xl + ')', 1);
        }
    }

    public static final ArrayList f(X01 x01) {
        ArrayList arrayListG = g(AbstractC8198yZ1.a(x01));
        if (arrayListG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayListG));
        Iterator it = arrayListG.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC1087Ns interfaceC1087NsA = x01.E().a();
        O90.d(interfaceC1087NsA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsK = AbstractC0433Fh1.k((InterfaceC7492us) interfaceC1087NsA);
        O90.c(clsK);
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList g(X01 x01) {
        ?? E;
        ArrayList arrayList = null;
        if (AbstractC7355u80.g(x01)) {
            InterfaceC1087Ns interfaceC1087NsA = x01.E().a();
            O90.d(interfaceC1087NsA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            int i = AbstractC7384uI.a;
            AbstractC1134Oh1 abstractC1134Oh1J0 = ((InterfaceC7492us) interfaceC1087NsA).J0();
            C4238ht0 c4238ht0 = abstractC1134Oh1J0 instanceof C4238ht0 ? (C4238ht0) abstractC1134Oh1J0 : null;
            O90.c(c4238ht0);
            ArrayList<Pair> arrayList2 = c4238ht0.a;
            arrayList = new ArrayList();
            for (Pair pair : arrayList2) {
                C1559Tt0 c1559Tt0 = (C1559Tt0) pair.a;
                ArrayList arrayListG = g((X01) pair.b);
                if (arrayListG != null) {
                    E = new ArrayList(AbstractC8449zu.k(arrayListG));
                    Iterator it = arrayListG.iterator();
                    while (it.hasNext()) {
                        E.add(c1559Tt0.c() + '-' + ((String) it.next()));
                    }
                } else {
                    E = AbstractC8259yu.e(c1559Tt0.c());
                }
                AbstractC0314Du.m(arrayList, (Iterable) E);
            }
        }
        return arrayList;
    }

    public static final Class h(CD cd) {
        if (!(cd instanceof InterfaceC7492us) || !AbstractC7355u80.b(cd)) {
            return null;
        }
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) cd;
        Class clsK = AbstractC0433Fh1.k(interfaceC7492us);
        if (clsK != null) {
            return clsK;
        }
        throw new C1420Rz("Class object for the class " + interfaceC7492us.getName() + " cannot be found (classId=" + AbstractC7384uI.f((InterfaceC1087Ns) cd) + ')', 1);
    }

    public static final Class i(AbstractC0663Ig0 abstractC0663Ig0) {
        Class clsH = h(abstractC0663Ig0.E().a());
        if (clsH == null) {
            return null;
        }
        if (!AbstractC0112Be1.e(abstractC0663Ig0)) {
            return clsH;
        }
        X01 x01H = AbstractC7355u80.h(abstractC0663Ig0);
        if (x01H == null || AbstractC0112Be1.e(x01H) || AbstractC8408zg0.F(x01H)) {
            return null;
        }
        return clsH;
    }
}
