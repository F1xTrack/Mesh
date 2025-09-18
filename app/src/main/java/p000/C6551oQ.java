package p000;

import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: oQ */
/* loaded from: classes.dex */
public final class C6551oQ {

    /* renamed from: c */
    public static final Pattern f38990c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: d */
    public static final Pattern f38991d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: e */
    public static final Pattern f38992e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: f */
    public static final ArrayList f38993f;

    /* renamed from: a */
    public final ArrayList f38994a;

    /* renamed from: b */
    public final ByteOrder f38995b;

    static {
        C6425mQ c6425mQ = new C6425mQ(0);
        c6425mQ.f37675b = 0;
        f38993f = Collections.list(c6425mQ);
    }

    public C6551oQ(ByteOrder byteOrder) {
        C6425mQ c6425mQ = new C6425mQ(1);
        c6425mQ.f37675b = 0;
        this.f38994a = Collections.list(c6425mQ);
        this.f38995b = byteOrder;
    }

    /* renamed from: a */
    public static Pair m23394a(String str) throws NumberFormatException {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairM23394a = m23394a(strArrSplit[0]);
            if (((Integer) pairM23394a.first).intValue() == 2) {
                return pairM23394a;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairM23394a2 = m23394a(strArrSplit[i]);
                int iIntValue = (((Integer) pairM23394a2.first).equals(pairM23394a.first) || ((Integer) pairM23394a2.second).equals(pairM23394a.first)) ? ((Integer) pairM23394a.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM23394a.second).intValue() == -1 || !(((Integer) pairM23394a2.first).equals(pairM23394a.second) || ((Integer) pairM23394a2.second).equals(pairM23394a.second))) ? -1 : ((Integer) pairM23394a.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM23394a = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM23394a = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM23394a;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* renamed from: b */
    public final void m23395b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        m23396c(arrayList, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23396c(java.util.List r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6551oQ.m23396c(java.util.List, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void m23397d(long j) {
        m23396c(this.f38994a, "ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
    }

    /* renamed from: e */
    public final void m23398e(float f) {
        m23396c(this.f38994a, "FocalLength", ((long) (f * 1000.0f)) + "/1000");
    }

    /* renamed from: f */
    public final void m23399f(int i) {
        String strValueOf = String.valueOf(3);
        ArrayList arrayList = this.f38994a;
        m23396c(arrayList, "SensitivityType", strValueOf);
        m23396c(arrayList, "PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
    }

    /* renamed from: g */
    public final void m23400g(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            AbstractC7806Jm0.m4412f("ExifData");
            i2 = 0;
        } else {
            i2 = 8;
        }
        m23396c(this.f38994a, "Orientation", String.valueOf(i2));
    }

    /* renamed from: h */
    public final void m23401h(int i) {
        int iM26247x = AbstractC7222ym.m26247x(i);
        m23396c(this.f38994a, "WhiteBalance", iM26247x != 0 ? iM26247x != 1 ? null : String.valueOf(1) : String.valueOf(0));
    }
}
