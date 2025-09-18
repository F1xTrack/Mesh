package defpackage;

import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: oQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6263oQ {
    public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        C5881mQ c5881mQ = new C5881mQ(0);
        c5881mQ.b = 0;
        f = Collections.list(c5881mQ);
    }

    public C6263oQ(ByteOrder byteOrder) {
        C5881mQ c5881mQ = new C5881mQ(1);
        c5881mQ.b = 0;
        this.a = Collections.list(c5881mQ);
        this.b = byteOrder;
    }

    public static Pair a(String str) throws NumberFormatException {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
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

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(arrayList, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6263oQ.c(java.util.List, java.lang.String, java.lang.String):void");
    }

    public final void d(long j) {
        c(this.a, "ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
    }

    public final void e(float f2) {
        c(this.a, "FocalLength", ((long) (f2 * 1000.0f)) + "/1000");
    }

    public final void f(int i) {
        String strValueOf = String.valueOf(3);
        ArrayList arrayList = this.a;
        c(arrayList, "SensitivityType", strValueOf);
        c(arrayList, "PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
    }

    public final void g(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            AbstractC0759Jm0.f("ExifData");
            i2 = 0;
        } else {
            i2 = 8;
        }
        c(this.a, "Orientation", String.valueOf(i2));
    }

    public final void h(int i) {
        int iX = AbstractC8235ym.x(i);
        c(this.a, "WhiteBalance", iX != 0 ? iX != 1 ? null : String.valueOf(1) : String.valueOf(0));
    }
}
