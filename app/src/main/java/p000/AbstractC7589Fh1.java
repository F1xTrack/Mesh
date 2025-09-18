package p000;

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
public abstract class AbstractC7589Fh1 {

    /* renamed from: a */
    public static final C0664KX f3397a = new C0664KX("kotlin.jvm.JvmStatic");

    /* renamed from: a */
    public static final AbstractC8360Ud0 m2749a(InterfaceC8152Qd0 interfaceC8152Qd0) {
        AbstractC8360Ud0 abstractC8360Ud0 = interfaceC8152Qd0 instanceof AbstractC8360Ud0 ? (AbstractC8360Ud0) interfaceC8152Qd0 : null;
        if (abstractC8360Ud0 != null) {
            return abstractC8360Ud0;
        }
        C11187te0 c11187te0M2750b = m2750b(interfaceC8152Qd0);
        return c11187te0M2750b != null ? c11187te0M2750b : m2751c(interfaceC8152Qd0);
    }

    /* renamed from: b */
    public static final C11187te0 m2750b(Object obj) {
        C11187te0 c11187te0 = obj instanceof C11187te0 ? (C11187te0) obj : null;
        if (c11187te0 != null) {
            return c11187te0;
        }
        AbstractC0288EZ abstractC0288EZ = obj instanceof AbstractC0288EZ ? (AbstractC0288EZ) obj : null;
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = abstractC0288EZ != null ? abstractC0288EZ.compute() : null;
        if (interfaceC8152Qd0Compute instanceof C11187te0) {
            return (C11187te0) interfaceC8152Qd0Compute;
        }
        return null;
    }

    /* renamed from: c */
    public static final AbstractC11189tf0 m2751c(Object obj) {
        AbstractC11189tf0 abstractC11189tf0 = obj instanceof AbstractC11189tf0 ? (AbstractC11189tf0) obj : null;
        if (abstractC11189tf0 != null) {
            return abstractC11189tf0;
        }
        IE0 ie0 = obj instanceof IE0 ? (IE0) obj : null;
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = ie0 != null ? ie0.compute() : null;
        if (interfaceC8152Qd0Compute instanceof AbstractC11189tf0) {
            return (AbstractC11189tf0) interfaceC8152Qd0Compute;
        }
        return null;
    }

    /* renamed from: d */
    public static final ArrayList m2752d(InterfaceC6595p5 interfaceC6595p5) throws IllegalAccessException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        List listM26274e;
        O90.m5968f(interfaceC6595p5, "<this>");
        InterfaceC0510I5 annotations = interfaceC6595p5.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationM2758j = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC7116x5 interfaceC7116x5 = (InterfaceC7116x5) it.next();
            W21 w21Mo4959e = interfaceC7116x5.mo4959e();
            if (w21Mo4959e instanceof UO0) {
                annotationM2758j = ((UO0) w21Mo4959e).f11770a;
            } else if (w21Mo4959e instanceof C10399nU0) {
                AbstractC10005kP0 abstractC10005kP0 = ((C10399nU0) w21Mo4959e).f38345a;
                WO0 wo0 = abstractC10005kP0 instanceof WO0 ? (WO0) abstractC10005kP0 : null;
                if (wo0 != null) {
                    annotationM2758j = wo0.f13158a;
                }
            } else {
                annotationM2758j = m2758j(interfaceC7116x5);
            }
            if (annotationM2758j != null) {
                arrayList.add(annotationM2758j);
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (P22.m6213b(P22.m6212a((Annotation) it2.next())).getSimpleName().equals("Container")) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Annotation annotation = (Annotation) it3.next();
                    Class clsM6213b = P22.m6213b(P22.m6212a(annotation));
                    if (!clsM6213b.getSimpleName().equals("Container") || clsM6213b.getAnnotation(InterfaceC9369fR0.class) == null) {
                        listM26274e = AbstractC7230yu.m26274e(annotation);
                    } else {
                        Object objInvoke = clsM6213b.getDeclaredMethod("value", null).invoke(annotation, null);
                        O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listM26274e = AbstractC0576J8.m4176c((Annotation[]) objInvoke);
                    }
                    AbstractC0246Du.m1920m(arrayList2, listM26274e);
                }
                return arrayList2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final Object m2753e(Type type) {
        O90.m5968f(type, "type");
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

    /* renamed from: f */
    public static final InterfaceC7032vl m2754f(Class cls, AbstractC11487w00 abstractC11487w00, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, AbstractC6902th abstractC6902th, Function2 function2) {
        List list;
        O90.m5968f(cls, "moduleAnchor");
        O90.m5968f(abstractC11487w00, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(abstractC6902th, "metadataVersion");
        C10271mU0 c10271mU0M26268a = AbstractC11852ys0.m26268a(cls);
        if (abstractC11487w00 instanceof C9729iF0) {
            list = ((C9729iF0) abstractC11487w00).f28988i;
        } else {
            if (!(abstractC11487w00 instanceof C10753qF0)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC11487w00).toString());
            }
            list = ((C10753qF0) abstractC11487w00).f40693i;
        }
        List list2 = list;
        C7129xI c7129xI = c10271mU0M26268a.f37726a;
        C7383Bi1 c7383Bi1 = C7383Bi1.f979b;
        O90.m5965c(list2);
        return (InterfaceC7032vl) function2.invoke(new C9547gq0(new C1361Vd(c7129xI, interfaceC8392Ut0, c7129xI.f45519b, c10226m71, c7383Bi1, abstractC6902th, null, null, list2)), abstractC11487w00);
    }

    /* renamed from: g */
    public static final C10937rh0 m2755g(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "<this>");
        if (interfaceC7158xl.mo119q0() == null) {
            return null;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC7158xl.mo423i();
        O90.m5966d(interfaceC0140CDMo423i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC6976us) interfaceC0140CDMo423i).mo1489a1();
    }

    /* renamed from: h */
    public static final boolean m2756h(C11572wf0 c11572wf0) {
        AbstractC7742Ig0 abstractC7742Ig0 = c11572wf0.f45016a;
        return abstractC7742Ig0 != null && AbstractC11251u80.m25122g(abstractC7742Ig0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: i */
    public static final Class m2757i(ClassLoader classLoader, C0055As c0055As, int i) {
        String str = C11309ub0.f43758a;
        C0789MX c0789mxM4661i = c0055As.m359b().m4661i();
        O90.m5967e(c0789mxM4661i, "toUnsafe(...)");
        C0055As c0055AsM25217f = C11309ub0.m25217f(c0789mxM4661i);
        if (c0055AsM25217f != null) {
            c0055As = c0055AsM25217f;
        }
        String strM4654b = c0055As.m363g().m4654b();
        String strM4654b2 = c0055As.m364h().m4654b();
        if (strM4654b.equals("kotlin")) {
            switch (strM4654b2.hashCode()) {
                case -901856463:
                    if (strM4654b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strM4654b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strM4654b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strM4654b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strM4654b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strM4654b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strM4654b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strM4654b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strM4654b2.equals("LongArray")) {
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
        if (strM4654b.length() > 0) {
            sb.append(strM4654b.concat("."));
        }
        sb.append(D51.m1553l(strM4654b2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return AbstractC10134lP1.m22425b(classLoader, string);
    }

    /* renamed from: j */
    public static final Annotation m2758j(InterfaceC7116x5 interfaceC7116x5) throws NegativeArraySizeException {
        InterfaceC6976us interfaceC6976usM25151d = AbstractC6940uI.m25151d(interfaceC7116x5);
        Class clsM2759k = interfaceC6976usM25151d != null ? m2759k(interfaceC6976usM25151d) : null;
        if (!(clsM2759k instanceof Class)) {
            clsM2759k = null;
        }
        if (clsM2759k == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC7116x5.mo4961g().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C8340Tt0 c8340Tt0 = (C8340Tt0) entry.getKey();
            AbstractC0249Dx abstractC0249Dx = (AbstractC0249Dx) entry.getValue();
            ClassLoader classLoader = clsM2759k.getClassLoader();
            O90.m5967e(classLoader, "getClassLoader(...)");
            Object objM2760l = m2760l(abstractC0249Dx, classLoader);
            Pair pair = objM2760l != null ? new Pair(c8340Tt0.m7801b(), objM2760l) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapM24786n = AbstractC11077sn0.m24786n(arrayList);
        Set setKeySet = mapM24786n.keySet();
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsM2759k.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) AbstractC10130lN1.m22414a(clsM2759k, mapM24786n, arrayList2);
    }

    /* renamed from: k */
    public static final Class m2759k(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "<this>");
        W21 w21Mo422e = interfaceC6976us.mo422e();
        O90.m5967e(w21Mo422e, "getSource(...)");
        if (w21Mo422e instanceof C7534Eg0) {
            return ((C7534Eg0) w21Mo422e).f2836a.f45572a;
        }
        if (w21Mo422e instanceof C10399nU0) {
            AbstractC10005kP0 abstractC10005kP0 = ((C10399nU0) w21Mo422e).f38345a;
            O90.m5966d(abstractC10005kP0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C9493gP0) abstractC10005kP0).f27782a;
        }
        C0055As c0055AsM25153f = AbstractC6940uI.m25153f(interfaceC6976us);
        if (c0055AsM25153f == null) {
            return null;
        }
        return m2757i(VO0.m8436d(interfaceC6976us.getClass()), c0055AsM25153f, 0);
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
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2760l(p000.AbstractC0249Dx r7, java.lang.ClassLoader r8) throws java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7589Fh1.m2760l(Dx, java.lang.ClassLoader):java.lang.Object");
    }
}
