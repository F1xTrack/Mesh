package defpackage;

import android.os.Bundle;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class XQ1 {
    public static final XQ1 c = new XQ1(100);
    public final EnumMap a;
    public final int b;

    public XQ1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(TQ1.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }

    public static char a(EnumC3582eR1 enumC3582eR1) {
        if (enumC3582eR1 == null) {
            return '-';
        }
        int iOrdinal = enumC3582eR1.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static String b(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static XQ1 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new XQ1(i);
        }
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC2326bR1.STORAGE.a) {
            enumMap.put((EnumMap) tq1, (TQ1) g(bundle.getString(tq1.a)));
        }
        return new XQ1(enumMap, i);
    }

    public static XQ1 d(int i, String str) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        if (str == null) {
            str = "";
        }
        EnumC2326bR1 enumC2326bR1 = EnumC2326bR1.STORAGE;
        int i2 = 0;
        while (true) {
            TQ1[] tq1Arr = enumC2326bR1.a;
            if (i2 >= tq1Arr.length) {
                return new XQ1(enumMap, i);
            }
            TQ1 tq1 = tq1Arr[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) tq1, (TQ1) f(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) tq1, (TQ1) EnumC3582eR1.UNINITIALIZED);
            }
            i2++;
        }
    }

    public static EnumC3582eR1 f(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? EnumC3582eR1.UNINITIALIZED : EnumC3582eR1.GRANTED : EnumC3582eR1.DENIED : EnumC3582eR1.POLICY;
    }

    public static EnumC3582eR1 g(String str) {
        EnumC3582eR1 enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
        return str == null ? enumC3582eR1 : str.equals("granted") ? EnumC3582eR1.GRANTED : str.equals("denied") ? EnumC3582eR1.DENIED : enumC3582eR1;
    }

    public static boolean h(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.XQ1 e(defpackage.XQ1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<TQ1> r1 = defpackage.TQ1.class
            r0.<init>(r1)
            bR1 r1 = defpackage.EnumC2326bR1.STORAGE
            TQ1[] r1 = r1.a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            eR1 r5 = (defpackage.EnumC3582eR1) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            eR1 r6 = (defpackage.EnumC3582eR1) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            eR1 r7 = defpackage.EnumC3582eR1.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            eR1 r7 = defpackage.EnumC3582eR1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            eR1 r7 = defpackage.EnumC3582eR1.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            eR1 r5 = defpackage.EnumC3582eR1.GRANTED
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XQ1.e(XQ1):XQ1");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XQ1)) {
            return false;
        }
        XQ1 xq1 = (XQ1) obj;
        for (TQ1 tq1 : EnumC2326bR1.STORAGE.a) {
            if (this.a.get(tq1) != xq1.a.get(tq1)) {
                return false;
            }
        }
        return this.b == xq1.b;
    }

    public final int hashCode() {
        int iHashCode = this.b * 17;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC3582eR1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(TQ1 tq1) {
        return ((EnumC3582eR1) this.a.get(tq1)) != EnumC3582eR1.DENIED;
    }

    public final XQ1 j(XQ1 xq1) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        for (TQ1 tq1 : EnumC2326bR1.STORAGE.a) {
            EnumC3582eR1 enumC3582eR1 = (EnumC3582eR1) this.a.get(tq1);
            if (enumC3582eR1 == EnumC3582eR1.UNINITIALIZED) {
                enumC3582eR1 = (EnumC3582eR1) xq1.a.get(tq1);
            }
            if (enumC3582eR1 != null) {
                enumMap.put((EnumMap) tq1, (TQ1) enumC3582eR1);
            }
        }
        return new XQ1(enumMap, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            bR1 r1 = defpackage.EnumC2326bR1.STORAGE
            TQ1[] r1 = r1.a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.a
            java.lang.Object r4 = r5.get(r4)
            eR1 r4 = (defpackage.EnumC3582eR1) r4
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XQ1.k():java.lang.String");
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("G1");
        for (TQ1 tq1 : EnumC2326bR1.STORAGE.a) {
            sb.append(a((EnumC3582eR1) this.a.get(tq1)));
        }
        return sb.toString();
    }

    public final boolean m() {
        return i(TQ1.ANALYTICS_STORAGE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b(this.b));
        for (TQ1 tq1 : EnumC2326bR1.STORAGE.a) {
            sb.append(StringUtils.COMMA);
            sb.append(tq1.a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            EnumC3582eR1 enumC3582eR1 = (EnumC3582eR1) this.a.get(tq1);
            if (enumC3582eR1 == null) {
                enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
            }
            sb.append(enumC3582eR1);
        }
        return sb.toString();
    }

    public XQ1(int i) {
        EnumMap enumMap = new EnumMap(TQ1.class);
        this.a = enumMap;
        TQ1 tq1 = TQ1.AD_STORAGE;
        EnumC3582eR1 enumC3582eR1 = EnumC3582eR1.UNINITIALIZED;
        enumMap.put((EnumMap) tq1, (TQ1) enumC3582eR1);
        enumMap.put((EnumMap) TQ1.ANALYTICS_STORAGE, (TQ1) enumC3582eR1);
        this.b = i;
    }
}
