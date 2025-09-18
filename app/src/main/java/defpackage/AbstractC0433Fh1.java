package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* renamed from: Fh1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0433Fh1 {
    public static final KX a = new KX("kotlin.jvm.JvmStatic");

    public static final AbstractC1589Ud0 a(InterfaceC1277Qd0 interfaceC1277Qd0) {
        AbstractC1589Ud0 abstractC1589Ud0 = interfaceC1277Qd0 instanceof AbstractC1589Ud0 ? (AbstractC1589Ud0) interfaceC1277Qd0 : null;
        if (abstractC1589Ud0 != null) {
            return abstractC1589Ud0;
        }
        C7260te0 c7260te0B = b(interfaceC1277Qd0);
        return c7260te0B != null ? c7260te0B : c(interfaceC1277Qd0);
    }

    public static final C7260te0 b(Object obj) {
        C7260te0 c7260te0 = obj instanceof C7260te0 ? (C7260te0) obj : null;
        if (c7260te0 != null) {
            return c7260te0;
        }
        EZ ez = obj instanceof EZ ? (EZ) obj : null;
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = ez != null ? ez.compute() : null;
        if (interfaceC1277Qd0Compute instanceof C7260te0) {
            return (C7260te0) interfaceC1277Qd0Compute;
        }
        return null;
    }

    public static final AbstractC7263tf0 c(Object obj) {
        AbstractC7263tf0 abstractC7263tf0 = obj instanceof AbstractC7263tf0 ? (AbstractC7263tf0) obj : null;
        if (abstractC7263tf0 != null) {
            return abstractC7263tf0;
        }
        IE0 ie0 = obj instanceof IE0 ? (IE0) obj : null;
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = ie0 != null ? ie0.compute() : null;
        if (interfaceC1277Qd0Compute instanceof AbstractC7263tf0) {
            return (AbstractC7263tf0) interfaceC1277Qd0Compute;
        }
        return null;
    }

    public static final ArrayList d(InterfaceC6391p5 interfaceC6391p5) throws IllegalAccessException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        List listE;
        O90.f(interfaceC6391p5, "<this>");
        I5 annotations = interfaceC6391p5.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationJ = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC7916x5 interfaceC7916x5 = (InterfaceC7916x5) it.next();
            W21 w21E = interfaceC7916x5.e();
            if (w21E instanceof UO0) {
                annotationJ = ((UO0) w21E).a;
            } else if (w21E instanceof C6085nU0) {
                AbstractC5497kP0 abstractC5497kP0 = ((C6085nU0) w21E).a;
                WO0 wo0 = abstractC5497kP0 instanceof WO0 ? (WO0) abstractC5497kP0 : null;
                if (wo0 != null) {
                    annotationJ = wo0.a;
                }
            } else {
                annotationJ = j(interfaceC7916x5);
            }
            if (annotationJ != null) {
                arrayList.add(annotationJ);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (P22.b(P22.a((Annotation) it2.next())).getSimpleName().equals("Container")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Annotation annotation = (Annotation) it3.next();
                    Class clsB = P22.b(P22.a(annotation));
                    if (!clsB.getSimpleName().equals("Container") || clsB.getAnnotation(InterfaceC3772fR0.class) == null) {
                        listE = AbstractC8259yu.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        O90.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = J8.c((Annotation[]) objInvoke);
                    }
                    AbstractC0314Du.m(arrayList2, listE);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        O90.f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC7662vl f(Class cls, AbstractC7709w00 abstractC7709w00, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, AbstractC7268th abstractC7268th, Function2 function2) {
        List list;
        O90.f(cls, "moduleAnchor");
        O90.f(abstractC7709w00, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(abstractC7268th, "metadataVersion");
        C5894mU0 c5894mU0A = AbstractC8254ys0.a(cls);
        if (abstractC7709w00 instanceof C4309iF0) {
            list = ((C4309iF0) abstractC7709w00).i;
        } else {
            if (!(abstractC7709w00 instanceof C6613qF0)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC7709w00).toString());
            }
            list = ((C6613qF0) abstractC7709w00).i;
        }
        List list2 = list;
        C7955xI c7955xI = c5894mU0A.a;
        C0124Bi1 c0124Bi1 = C0124Bi1.b;
        O90.c(list2);
        return (InterfaceC7662vl) function2.invoke(new C4038gq0(new C1666Vd(c7955xI, interfaceC1637Ut0, c7955xI.b, c5826m71, c0124Bi1, abstractC7268th, null, null, list2)), abstractC7709w00);
    }

    public static final C6887rh0 g(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "<this>");
        if (interfaceC8042xl.q0() == null) {
            return null;
        }
        CD cdI = interfaceC8042xl.i();
        O90.d(cdI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC7492us) cdI).a1();
    }

    public static final boolean h(C7835wf0 c7835wf0) {
        AbstractC0663Ig0 abstractC0663Ig0 = c7835wf0.a;
        return abstractC0663Ig0 != null && AbstractC7355u80.g(abstractC0663Ig0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(ClassLoader classLoader, C0074As c0074As, int i) {
        String str = C7442ub0.a;
        MX mxI = c0074As.b().i();
        O90.e(mxI, "toUnsafe(...)");
        C0074As c0074AsF = C7442ub0.f(mxI);
        if (c0074AsF != null) {
            c0074As = c0074AsF;
        }
        String strB = c0074As.g().b();
        String strB2 = c0074As.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat("."));
        }
        sb.append(D51.l(strB2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return AbstractC5689lP1.b(classLoader, string);
    }

    public static final Annotation j(InterfaceC7916x5 interfaceC7916x5) throws NegativeArraySizeException {
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d(interfaceC7916x5);
        Class clsK = interfaceC7492usD != null ? k(interfaceC7492usD) : null;
        if (!(clsK instanceof Class)) {
            clsK = null;
        }
        if (clsK == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC7916x5.g().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C1559Tt0 c1559Tt0 = (C1559Tt0) entry.getKey();
            AbstractC0323Dx abstractC0323Dx = (AbstractC0323Dx) entry.getValue();
            ClassLoader classLoader = clsK.getClassLoader();
            O90.e(classLoader, "getClassLoader(...)");
            Object objL = l(abstractC0323Dx, classLoader);
            Pair pair = objL != null ? new Pair(c1559Tt0.b(), objL) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapN = AbstractC7096sn0.n(arrayList);
        Set setKeySet = mapN.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) AbstractC5683lN1.a(clsK, mapN, arrayList2);
    }

    public static final Class k(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "<this>");
        W21 w21E = interfaceC7492us.e();
        O90.e(w21E, "getSource(...)");
        if (w21E instanceof C0351Eg0) {
            return ((C0351Eg0) w21E).a.a;
        }
        if (w21E instanceof C6085nU0) {
            AbstractC5497kP0 abstractC5497kP0 = ((C6085nU0) w21E).a;
            O90.d(abstractC5497kP0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C3957gP0) abstractC5497kP0).a;
        }
        C0074As c0074AsF = AbstractC7384uI.f(interfaceC7492us);
        if (c0074AsF == null) {
            return null;
        }
        return i(VO0.d(interfaceC7492us.getClass()), c0074AsF, 0);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r8v16, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r8v18, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v21, types: [float[]] */
    /* JADX WARN: Type inference failed for: r8v22, types: [long[]] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(defpackage.AbstractC0323Dx r7, java.lang.ClassLoader r8) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0433Fh1.l(Dx, java.lang.ClassLoader):java.lang.Object");
    }
}
