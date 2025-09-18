package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: wI */
/* loaded from: classes2.dex */
public abstract class AbstractC7765wI {
    public static final C7575vI a;
    public static final C7575vI b;
    public static final C7575vI c;
    public static final C7575vI d;
    public static final C7575vI e;
    public static final C7575vI f;
    public static final C7575vI g;
    public static final C7575vI h;
    public static final C7575vI i;
    public static final C7575vI j;
    public static final C0396Ev0 k;
    public static final C0474Fv0 l;
    public static final OL0 m;
    public static final C0932Ls0 n;
    public static final HashMap o;

    static {
        C1770Wl1 c1770Wl1 = C1770Wl1.d;
        C7575vI c7575vI = new C7575vI(c1770Wl1, 0);
        a = c7575vI;
        C1848Xl1 c1848Xl1 = C1848Xl1.d;
        C7575vI c7575vI2 = new C7575vI(c1848Xl1, 1);
        b = c7575vI2;
        C1926Yl1 c1926Yl1 = C1926Yl1.d;
        C7575vI c7575vI3 = new C7575vI(c1926Yl1, 2);
        c = c7575vI3;
        C1536Tl1 c1536Tl1 = C1536Tl1.d;
        C7575vI c7575vI4 = new C7575vI(c1536Tl1, 3);
        d = c7575vI4;
        C2004Zl1 c2004Zl1 = C2004Zl1.d;
        C7575vI c7575vI5 = new C7575vI(c2004Zl1, 4);
        e = c7575vI5;
        C1692Vl1 c1692Vl1 = C1692Vl1.d;
        C7575vI c7575vI6 = new C7575vI(c1692Vl1, 5);
        f = c7575vI6;
        C1458Sl1 c1458Sl1 = C1458Sl1.d;
        C7575vI c7575vI7 = new C7575vI(c1458Sl1, 6);
        g = c7575vI7;
        C1614Ul1 c1614Ul1 = C1614Ul1.d;
        C7575vI c7575vI8 = new C7575vI(c1614Ul1, 7);
        h = c7575vI8;
        C2198am1 c2198am1 = C2198am1.d;
        C7575vI c7575vI9 = new C7575vI(c2198am1, 8);
        i = c7575vI9;
        Collections.unmodifiableSet(J8.F(new C7575vI[]{c7575vI, c7575vI2, c7575vI4, c7575vI6}));
        HashMap map = new HashMap(6);
        map.put(c7575vI2, 0);
        map.put(c7575vI, 0);
        map.put(c7575vI4, 1);
        map.put(c7575vI3, 1);
        map.put(c7575vI5, 2);
        Collections.unmodifiableMap(map);
        j = c7575vI5;
        k = new C0396Ev0(12);
        l = new C0474Fv0(12);
        m = new OL0(12);
        Iterator it = ServiceLoader.load(C0932Ls0.class, C0932Ls0.class.getClassLoader()).iterator();
        n = it.hasNext() ? (C0932Ls0) it.next() : C0932Ls0.a;
        HashMap map2 = new HashMap();
        o = map2;
        map2.put(c1770Wl1, c7575vI);
        map2.put(c1848Xl1, c7575vI2);
        map2.put(c1926Yl1, c7575vI3);
        map2.put(c1536Tl1, c7575vI4);
        map2.put(c2004Zl1, c7575vI5);
        map2.put(c1692Vl1, c7575vI6);
        map2.put(c1458Sl1, c7575vI7);
        map2.put(c1614Ul1, c7575vI8);
        map2.put(c2198am1, c7575vI9);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7765wI.a(int):void");
    }

    public static Integer b(C7575vI c7575vI, C7575vI c7575vI2) {
        if (c7575vI == null) {
            a(12);
            throw null;
        }
        if (c7575vI2 == null) {
            a(13);
            throw null;
        }
        AbstractC6952s2 abstractC6952s2 = c7575vI.a;
        AbstractC6952s2 abstractC6952s22 = c7575vI2.a;
        Integer numA = abstractC6952s2.a(abstractC6952s22);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC6952s22.a(abstractC6952s2);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static HD c(C0474Fv0 c0474Fv0, InterfaceC8042xl interfaceC8042xl, CD cd) {
        HD hdC;
        if (interfaceC8042xl == null) {
            a(8);
            throw null;
        }
        if (cd == null) {
            a(9);
            throw null;
        }
        for (HD hd = (HD) interfaceC8042xl.x1(); hd != null && hd.getVisibility() != f; hd = (HD) AbstractC7002sI.i(hd, HD.class, true)) {
            if (!hd.getVisibility().a(c0474Fv0, hd, cd)) {
                return hd;
            }
        }
        if (!(interfaceC8042xl instanceof InterfaceC0343Ed1) || (hdC = c(c0474Fv0, ((C0421Fd1) ((InterfaceC0343Ed1) interfaceC8042xl)).G, cd)) == null) {
            return null;
        }
        return hdC;
    }

    public static boolean d(HD hd, CD cd) {
        if (cd == null) {
            a(7);
            throw null;
        }
        C0318Dv0 c0318Dv0F = AbstractC7002sI.f(cd);
        if (c0318Dv0F != C0318Dv0.f) {
            return c0318Dv0F.equals(AbstractC7002sI.f(hd));
        }
        return false;
    }

    public static boolean e(C7575vI c7575vI) {
        if (c7575vI != null) {
            return c7575vI == a || c7575vI == b;
        }
        a(14);
        throw null;
    }

    public static C7575vI f(AbstractC6952s2 abstractC6952s2) {
        if (abstractC6952s2 == null) {
            a(15);
            throw null;
        }
        C7575vI c7575vI = (C7575vI) o.get(abstractC6952s2);
        if (c7575vI != null) {
            return c7575vI;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC6952s2);
    }
}
