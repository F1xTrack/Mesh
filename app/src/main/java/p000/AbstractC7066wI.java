package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: wI */
/* loaded from: classes2.dex */
public abstract class AbstractC7066wI {

    /* renamed from: a */
    public static final C7003vI f44760a;

    /* renamed from: b */
    public static final C7003vI f44761b;

    /* renamed from: c */
    public static final C7003vI f44762c;

    /* renamed from: d */
    public static final C7003vI f44763d;

    /* renamed from: e */
    public static final C7003vI f44764e;

    /* renamed from: f */
    public static final C7003vI f44765f;

    /* renamed from: g */
    public static final C7003vI f44766g;

    /* renamed from: h */
    public static final C7003vI f44767h;

    /* renamed from: i */
    public static final C7003vI f44768i;

    /* renamed from: j */
    public static final C7003vI f44769j;

    /* renamed from: k */
    public static final C7564Ev0 f44770k;

    /* renamed from: l */
    public static final C7616Fv0 f44771l;

    /* renamed from: m */
    public static final OL0 f44772m;

    /* renamed from: n */
    public static final C7922Ls0 f44773n;

    /* renamed from: o */
    public static final HashMap f44774o;

    static {
        C8481Wl1 c8481Wl1 = C8481Wl1.f13392d;
        C7003vI c7003vI = new C7003vI(c8481Wl1, 0);
        f44760a = c7003vI;
        C8533Xl1 c8533Xl1 = C8533Xl1.f13963d;
        C7003vI c7003vI2 = new C7003vI(c8533Xl1, 1);
        f44761b = c7003vI2;
        C8585Yl1 c8585Yl1 = C8585Yl1.f14505d;
        C7003vI c7003vI3 = new C7003vI(c8585Yl1, 2);
        f44762c = c7003vI3;
        C8325Tl1 c8325Tl1 = C8325Tl1.f11501d;
        C7003vI c7003vI4 = new C7003vI(c8325Tl1, 3);
        f44763d = c7003vI4;
        C8637Zl1 c8637Zl1 = C8637Zl1.f15112d;
        C7003vI c7003vI5 = new C7003vI(c8637Zl1, 4);
        f44764e = c7003vI5;
        C8429Vl1 c8429Vl1 = C8429Vl1.f12714d;
        C7003vI c7003vI6 = new C7003vI(c8429Vl1, 5);
        f44765f = c7003vI6;
        C8273Sl1 c8273Sl1 = C8273Sl1.f10969d;
        C7003vI c7003vI7 = new C7003vI(c8273Sl1, 6);
        f44766g = c7003vI7;
        C8377Ul1 c8377Ul1 = C8377Ul1.f12025d;
        C7003vI c7003vI8 = new C7003vI(c8377Ul1, 7);
        f44767h = c7003vI8;
        C8767am1 c8767am1 = C8767am1.f15691d;
        C7003vI c7003vI9 = new C7003vI(c8767am1, 8);
        f44768i = c7003vI9;
        Collections.unmodifiableSet(AbstractC0576J8.m4175F(new C7003vI[]{c7003vI, c7003vI2, c7003vI4, c7003vI6}));
        HashMap map = new HashMap(6);
        map.put(c7003vI2, 0);
        map.put(c7003vI, 0);
        map.put(c7003vI4, 1);
        map.put(c7003vI3, 1);
        map.put(c7003vI5, 2);
        Collections.unmodifiableMap(map);
        f44769j = c7003vI5;
        f44770k = new C7564Ev0(12);
        f44771l = new C7616Fv0(12);
        f44772m = new OL0(12);
        Iterator it = ServiceLoader.load(C7922Ls0.class, C7922Ls0.class.getClassLoader()).iterator();
        f44773n = it.hasNext() ? (C7922Ls0) it.next() : C7922Ls0.f6912a;
        HashMap map2 = new HashMap();
        f44774o = map2;
        map2.put(c8481Wl1, c7003vI);
        map2.put(c8533Xl1, c7003vI2);
        map2.put(c8585Yl1, c7003vI3);
        map2.put(c8325Tl1, c7003vI4);
        map2.put(c8637Zl1, c7003vI5);
        map2.put(c8429Vl1, c7003vI6);
        map2.put(c8273Sl1, c7003vI7);
        map2.put(c8377Ul1, c7003vI8);
        map2.put(c8767am1, c7003vI9);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m25587a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7066wI.m25587a(int):void");
    }

    /* renamed from: b */
    public static Integer m25588b(C7003vI c7003vI, C7003vI c7003vI2) {
        if (c7003vI == null) {
            m25587a(12);
            throw null;
        }
        if (c7003vI2 == null) {
            m25587a(13);
            throw null;
        }
        AbstractC6798s2 abstractC6798s2 = c7003vI.f44322a;
        AbstractC6798s2 abstractC6798s22 = c7003vI2.f44322a;
        Integer numMo3950a = abstractC6798s2.mo3950a(abstractC6798s22);
        if (numMo3950a != null) {
            return numMo3950a;
        }
        Integer numMo3950a2 = abstractC6798s22.mo3950a(abstractC6798s2);
        if (numMo3950a2 != null) {
            return Integer.valueOf(-numMo3950a2.intValue());
        }
        return null;
    }

    /* renamed from: c */
    public static InterfaceC0455HD m25589c(C7616Fv0 c7616Fv0, InterfaceC7158xl interfaceC7158xl, InterfaceC0140CD interfaceC0140CD) {
        InterfaceC0455HD interfaceC0455HDM25589c;
        if (interfaceC7158xl == null) {
            m25587a(8);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m25587a(9);
            throw null;
        }
        for (InterfaceC0455HD interfaceC0455HD = (InterfaceC0455HD) interfaceC7158xl.mo2089x1(); interfaceC0455HD != null && interfaceC0455HD.getVisibility() != f44765f; interfaceC0455HD = (InterfaceC0455HD) AbstractC6814sI.m24697i(interfaceC0455HD, InterfaceC0455HD.class, true)) {
            if (!interfaceC0455HD.getVisibility().m25381a(c7616Fv0, interfaceC0455HD, interfaceC0140CD)) {
                return interfaceC0455HD;
            }
        }
        if (!(interfaceC7158xl instanceof InterfaceC7529Ed1) || (interfaceC0455HDM25589c = m25589c(c7616Fv0, ((C7581Fd1) ((InterfaceC7529Ed1) interfaceC7158xl)).f3368G, interfaceC0140CD)) == null) {
            return null;
        }
        return interfaceC0455HDM25589c;
    }

    /* renamed from: d */
    public static boolean m25590d(InterfaceC0455HD interfaceC0455HD, InterfaceC0140CD interfaceC0140CD) {
        if (interfaceC0140CD == null) {
            m25587a(7);
            throw null;
        }
        C7512Dv0 c7512Dv0M24694f = AbstractC6814sI.m24694f(interfaceC0140CD);
        if (c7512Dv0M24694f != C7512Dv0.f2303f) {
            return c7512Dv0M24694f.equals(AbstractC6814sI.m24694f(interfaceC0455HD));
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m25591e(C7003vI c7003vI) {
        if (c7003vI != null) {
            return c7003vI == f44760a || c7003vI == f44761b;
        }
        m25587a(14);
        throw null;
    }

    /* renamed from: f */
    public static C7003vI m25592f(AbstractC6798s2 abstractC6798s2) {
        if (abstractC6798s2 == null) {
            m25587a(15);
            throw null;
        }
        C7003vI c7003vI = (C7003vI) f44774o.get(abstractC6798s2);
        if (c7003vI != null) {
            return c7003vI;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC6798s2);
    }
}
