package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class D5 {
    public static final LinkedHashMap c;
    public final C0024Ab0 a;
    public final ConcurrentHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (B5 b5 : B5.values()) {
            String str = b5.a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, b5);
            }
        }
        c = linkedHashMap;
    }

    public D5(C0024Ab0 c0024Ab0) {
        O90.f(c0024Ab0, "javaTypeEnhancementState");
        this.a = c0024Ab0;
        this.b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z) {
        InterfaceC7916x5 interfaceC7916x5 = (InterfaceC7916x5) obj;
        O90.f(interfaceC7916x5, "<this>");
        Map mapG = interfaceC7916x5.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapG.entrySet()) {
            AbstractC0314Du.m(arrayList, (!z || O90.a((C1559Tt0) entry.getKey(), AbstractC1118Oc0.b)) ? j((AbstractC0323Dx) entry.getValue()) : MN.a);
        }
        return arrayList;
    }

    public static Object c(Object obj, KX kx) {
        for (Object obj2 : e(obj)) {
            if (O90.a(d(obj2), kx)) {
                return obj2;
            }
        }
        return null;
    }

    public static KX d(Object obj) {
        InterfaceC7916x5 interfaceC7916x5 = (InterfaceC7916x5) obj;
        O90.f(interfaceC7916x5, "<this>");
        return interfaceC7916x5.f();
    }

    public static Iterable e(Object obj) {
        I5 annotations;
        InterfaceC7916x5 interfaceC7916x5 = (InterfaceC7916x5) obj;
        O90.f(interfaceC7916x5, "<this>");
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d(interfaceC7916x5);
        return (interfaceC7492usD == null || (annotations = interfaceC7492usD.getAnnotations()) == null) ? MN.a : annotations;
    }

    public static boolean f(Object obj, KX kx) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (O90.a(d(it.next()), kx)) {
                return true;
            }
        }
        return false;
    }

    public static List j(AbstractC0323Dx abstractC0323Dx) {
        if (!(abstractC0323Dx instanceof I8)) {
            return abstractC0323Dx instanceof TO ? AbstractC8259yu.e(((TO) abstractC0323Dx).c.c()) : MN.a;
        }
        Iterable iterable = (Iterable) ((I8) abstractC0323Dx).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(arrayList, j((AbstractC0323Dx) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x015e  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0336Eb0 b(defpackage.C0336Eb0 r18, defpackage.I5 r19) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D5.b(Eb0, I5):Eb0");
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
    
        r7 = defpackage.EnumC0321Dw0.b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0399Ew0 g(java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D5.g(java.lang.Object, boolean):Ew0");
    }

    public final EnumC5694lR0 h(Object obj) {
        String str;
        C0024Ab0 c0024Ab0 = this.a;
        EnumC5694lR0 enumC5694lR0 = (EnumC5694lR0) c0024Ab0.a.c.get(d(obj));
        if (enumC5694lR0 != null) {
            return enumC5694lR0;
        }
        Object objC = c(obj, C5.d);
        if (objC == null || (str = (String) AbstractC8069xu.B(a(objC, false))) == null) {
            return null;
        }
        EnumC5694lR0 enumC5694lR02 = c0024Ab0.a.b;
        if (enumC5694lR02 != null) {
            return enumC5694lR02;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC5694lR0.b;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC5694lR0.d;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC5694lR0.c;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        O90.f(obj, "annotation");
        if (this.a.a.d) {
            return null;
        }
        if (AbstractC8069xu.v(C5.h, d(obj)) || f(obj, C5.b)) {
            return obj;
        }
        if (!f(obj, C5.a)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d((InterfaceC7916x5) obj);
        O90.c(interfaceC7492usD);
        Object obj2 = concurrentHashMap.get(interfaceC7492usD);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = e(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objI = null;
                break;
            }
            objI = i(it.next());
            if (objI != null) {
                break;
            }
        }
        if (objI == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC7492usD, objI);
        return objPutIfAbsent == null ? objI : objPutIfAbsent;
    }
}
