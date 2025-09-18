package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: D5 */
/* loaded from: classes2.dex */
public final class C0195D5 {

    /* renamed from: c */
    public static final LinkedHashMap f1837c;

    /* renamed from: a */
    public final C7316Ab0 f1838a;

    /* renamed from: b */
    public final ConcurrentHashMap f1839b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC0069B5 enumC0069B5 : EnumC0069B5.values()) {
            String str = enumC0069B5.f559a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC0069B5);
            }
        }
        f1837c = linkedHashMap;
    }

    public C0195D5(C7316Ab0 c7316Ab0) {
        O90.m5968f(c7316Ab0, "javaTypeEnhancementState");
        this.f1838a = c7316Ab0;
        this.f1839b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static ArrayList m1539a(Object obj, boolean z) {
        InterfaceC7116x5 interfaceC7116x5 = (InterfaceC7116x5) obj;
        O90.m5968f(interfaceC7116x5, "<this>");
        Map mapMo4961g = interfaceC7116x5.mo4961g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapMo4961g.entrySet()) {
            AbstractC0246Du.m1920m(arrayList, (!z || O90.m5963a((C8340Tt0) entry.getKey(), AbstractC8046Oc0.f8520b)) ? m1544j((AbstractC0249Dx) entry.getValue()) : C0779MN.f7117a);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Object m1540c(Object obj, C0664KX c0664kx) {
        for (Object obj2 : m1542e(obj)) {
            if (O90.m5963a(m1541d(obj2), c0664kx)) {
                return obj2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C0664KX m1541d(Object obj) {
        InterfaceC7116x5 interfaceC7116x5 = (InterfaceC7116x5) obj;
        O90.m5968f(interfaceC7116x5, "<this>");
        return interfaceC7116x5.mo4960f();
    }

    /* renamed from: e */
    public static Iterable m1542e(Object obj) {
        InterfaceC0510I5 annotations;
        InterfaceC7116x5 interfaceC7116x5 = (InterfaceC7116x5) obj;
        O90.m5968f(interfaceC7116x5, "<this>");
        InterfaceC6976us interfaceC6976usM25151d = AbstractC6940uI.m25151d(interfaceC7116x5);
        return (interfaceC6976usM25151d == null || (annotations = interfaceC6976usM25151d.getAnnotations()) == null) ? C0779MN.f7117a : annotations;
    }

    /* renamed from: f */
    public static boolean m1543f(Object obj, C0664KX c0664kx) {
        Iterable iterableM1542e = m1542e(obj);
        if ((iterableM1542e instanceof Collection) && ((Collection) iterableM1542e).isEmpty()) {
            return false;
        }
        Iterator it = iterableM1542e.iterator();
        while (it.hasNext()) {
            if (O90.m5963a(m1541d(it.next()), c0664kx)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static List m1544j(AbstractC0249Dx abstractC0249Dx) {
        if (!(abstractC0249Dx instanceof C0513I8)) {
            return abstractC0249Dx instanceof C1220TO ? AbstractC7230yu.m26274e(((C1220TO) abstractC0249Dx).f11336c.m7802c()) : C0779MN.f7117a;
        }
        Iterable iterable = (Iterable) ((C0513I8) abstractC0249Dx).f2329a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(arrayList, m1544j((AbstractC0249Dx) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x015e  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7524Eb0 m1545b(p000.C7524Eb0 r18, p000.InterfaceC0510I5 r19) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195D5.m1545b(Eb0, I5):Eb0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0085, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009a, code lost:
    
        if (r7.equals("NEVER") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00a3, code lost:
    
        if (r7.equals("MAYBE") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00a6, code lost:
    
        r7 = p000.EnumC7514Dw0.f2323b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7566Ew0 m1546g(java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195D5.m1546g(java.lang.Object, boolean):Ew0");
    }

    /* renamed from: h */
    public final EnumC10137lR0 m1547h(Object obj) {
        String str;
        C7316Ab0 c7316Ab0 = this.f1838a;
        EnumC10137lR0 enumC10137lR0 = (EnumC10137lR0) c7316Ab0.f270a.f7267c.get(m1541d(obj));
        if (enumC10137lR0 != null) {
            return enumC10137lR0;
        }
        Object objM1540c = m1540c(obj, AbstractC0132C5.f1181d);
        if (objM1540c == null || (str = (String) AbstractC7167xu.m25956B(m1539a(objM1540c, false))) == null) {
            return null;
        }
        EnumC10137lR0 enumC10137lR02 = c7316Ab0.f270a.f7266b;
        if (enumC10137lR02 != null) {
            return enumC10137lR02;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC10137lR0.f37058b;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC10137lR0.f37060d;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC10137lR0.f37059c;
        }
        return null;
    }

    /* renamed from: i */
    public final Object m1548i(Object obj) {
        Object objM1548i;
        O90.m5968f(obj, "annotation");
        if (this.f1838a.f270a.f7268d) {
            return null;
        }
        if (AbstractC7167xu.m25994v(AbstractC0132C5.f1185h, m1541d(obj)) || m1543f(obj, AbstractC0132C5.f1179b)) {
            return obj;
        }
        if (!m1543f(obj, AbstractC0132C5.f1178a)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f1839b;
        InterfaceC6976us interfaceC6976usM25151d = AbstractC6940uI.m25151d((InterfaceC7116x5) obj);
        O90.m5965c(interfaceC6976usM25151d);
        Object obj2 = concurrentHashMap.get(interfaceC6976usM25151d);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = m1542e(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objM1548i = null;
                break;
            }
            objM1548i = m1548i(it.next());
            if (objM1548i != null) {
                break;
            }
        }
        if (objM1548i == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC6976usM25151d, objM1548i);
        return objPutIfAbsent == null ? objM1548i : objPutIfAbsent;
    }
}
