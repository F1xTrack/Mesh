package p000;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class XQ1 {

    /* renamed from: c */
    public static final XQ1 f13755c = new XQ1(100);

    /* renamed from: a */
    public final EnumMap f13756a;

    /* renamed from: b */
    public final int f13757b;

    public XQ1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.f13756a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f13757b = i;
    }

    /* renamed from: a */
    public static char m9040a(EnumC9242eR1 enumC9242eR1) {
        if (enumC9242eR1 == null) {
            return '-';
        }
        int iOrdinal = enumC9242eR1.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* renamed from: b */
    public static String m9041b(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    /* renamed from: c */
    public static XQ1 m9042c(int i, Bundle bundle) {
        if (bundle == null) {
            return new XQ1(i);
        }
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC8853bR1.STORAGE.f17026a) {
            enumMap.put((EnumMap) tq1, (TQ1) m9045g(bundle.getString(tq1.f11353a)));
        }
        return new XQ1(enumMap, i);
    }

    /* renamed from: d */
    public static XQ1 m9043d(int i, String str) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        if (str == null) {
            str = "";
        }
        EnumC8853bR1 enumC8853bR1 = EnumC8853bR1.STORAGE;
        int i2 = 0;
        while (true) {
            TQ1[] tq1Arr = enumC8853bR1.f17026a;
            if (i2 >= tq1Arr.length) {
                return new XQ1(enumMap, i);
            }
            TQ1 tq1 = tq1Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) tq1, (TQ1) m9044f(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) tq1, (TQ1) EnumC9242eR1.UNINITIALIZED);
            }
            i2++;
        }
    }

    /* renamed from: f */
    public static EnumC9242eR1 m9044f(char c) {
        return c != '+' ? c != '0' ? c != '1' ? EnumC9242eR1.UNINITIALIZED : EnumC9242eR1.GRANTED : EnumC9242eR1.DENIED : EnumC9242eR1.POLICY;
    }

    /* renamed from: g */
    public static EnumC9242eR1 m9045g(String str) {
        EnumC9242eR1 enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
        return str == null ? enumC9242eR1 : str.equals("granted") ? EnumC9242eR1.GRANTED : str.equals("denied") ? EnumC9242eR1.DENIED : enumC9242eR1;
    }

    /* renamed from: h */
    public static boolean m9046h(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.XQ1 m9047e(p000.XQ1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<TQ1> r1 = p000.TQ1.class
            r0.<init>(r1)
            bR1 r1 = p000.EnumC8853bR1.STORAGE
            TQ1[] r1 = r1.f17026a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f13756a
            java.lang.Object r5 = r5.get(r4)
            eR1 r5 = (p000.EnumC9242eR1) r5
            java.util.EnumMap r6 = r9.f13756a
            java.lang.Object r6 = r6.get(r4)
            eR1 r6 = (p000.EnumC9242eR1) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            eR1 r7 = p000.EnumC9242eR1.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            eR1 r7 = p000.EnumC9242eR1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            eR1 r7 = p000.EnumC9242eR1.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            eR1 r5 = p000.EnumC9242eR1.GRANTED
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            XQ1 r9 = new XQ1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.XQ1.m9047e(XQ1):XQ1");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XQ1)) {
            return false;
        }
        XQ1 xq1 = (XQ1) obj;
        for (TQ1 tq1 : EnumC8853bR1.STORAGE.f17026a) {
            if (this.f13756a.get(tq1) != xq1.f13756a.get(tq1)) {
                return false;
            }
        }
        return this.f13757b == xq1.f13757b;
    }

    public final int hashCode() {
        int iHashCode = this.f13757b * 17;
        Iterator it = this.f13756a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC9242eR1) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final boolean m9048i(TQ1 tq1) {
        return ((EnumC9242eR1) this.f13756a.get(tq1)) != EnumC9242eR1.DENIED;
    }

    /* renamed from: j */
    public final XQ1 m9049j(XQ1 xq1) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC8853bR1.STORAGE.f17026a) {
            EnumC9242eR1 enumC9242eR1 = (EnumC9242eR1) this.f13756a.get(tq1);
            if (enumC9242eR1 == EnumC9242eR1.UNINITIALIZED) {
                enumC9242eR1 = (EnumC9242eR1) xq1.f13756a.get(tq1);
            }
            if (enumC9242eR1 != null) {
                enumMap.put((EnumMap) tq1, (TQ1) enumC9242eR1);
            }
        }
        return new XQ1(enumMap, this.f13757b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m9050k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            bR1 r1 = p000.EnumC8853bR1.STORAGE
            TQ1[] r1 = r1.f17026a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f13756a
            java.lang.Object r4 = r5.get(r4)
            eR1 r4 = (p000.EnumC9242eR1) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.XQ1.m9050k():java.lang.String");
    }

    /* renamed from: l */
    public final String m9051l() {
        StringBuilder sb = new StringBuilder("G1");
        for (TQ1 tq1 : EnumC8853bR1.STORAGE.f17026a) {
            sb.append(m9040a((EnumC9242eR1) this.f13756a.get(tq1)));
        }
        return sb.toString();
    }

    /* renamed from: m */
    public final boolean m9052m() {
        return m9048i(TQ1.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m9041b(this.f13757b));
        for (TQ1 tq1 : EnumC8853bR1.STORAGE.f17026a) {
            sb.append(StringUtils.COMMA);
            sb.append(tq1.f11353a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            EnumC9242eR1 enumC9242eR1 = (EnumC9242eR1) this.f13756a.get(tq1);
            if (enumC9242eR1 == null) {
                enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
            }
            sb.append(enumC9242eR1);
        }
        return sb.toString();
    }

    public XQ1(int i) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        this.f13756a = enumMap;
        TQ1 tq1 = TQ1.AD_STORAGE;
        EnumC9242eR1 enumC9242eR1 = EnumC9242eR1.UNINITIALIZED;
        enumMap.put((EnumMap) tq1, (TQ1) enumC9242eR1);
        enumMap.put((EnumMap) TQ1.ANALYTICS_STORAGE, (TQ1) enumC9242eR1);
        this.f13757b = i;
    }
}
