package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class YY1 {
    public static C3538eD a(AbstractC6458pR0 abstractC6458pR0, String str, C3939gJ0 c3939gJ0, int i) {
        C3348dD c3348dD = new C3348dD();
        c3348dD.c = 1;
        c3348dD.e = Collections.emptyMap();
        c3348dD.g = -1L;
        c3348dD.a = AbstractC2051a02.i(str, c3939gJ0.c);
        c3348dD.f = c3939gJ0.a;
        c3348dD.g = c3939gJ0.b;
        String strB = abstractC6458pR0.b();
        if (strB == null) {
            strB = AbstractC2051a02.i(((C0896Lg) abstractC6458pR0.b.get(0)).a, c3939gJ0.c).toString();
        }
        c3348dD.h = strB;
        c3348dD.i = i;
        c3348dD.e = C5500kQ0.g;
        return c3348dD.a();
    }

    public static C6412pC b(ZC zc, Uri uri) throws IOException {
        C6793rC c6793rC = new C6793rC();
        Map mapEmptyMap = Collections.emptyMap();
        YN1.i(uri, "The uri must be set.");
        C3538eD c3538eD = new C3538eD(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1);
        M41 m41 = new M41(zc);
        C4020gk0.b.getAndIncrement();
        m41.b = 0L;
        C2282bD c2282bD = new C2282bD(m41, c3538eD);
        try {
            c2282bD.m();
            Uri uriO = zc.o();
            uriO.getClass();
            Object objI = c6793rC.i(uriO, c2282bD);
            AbstractC0277Dh1.h(c2282bD);
            return (C6412pC) objI;
        } catch (Throwable th) {
            AbstractC0277Dh1.h(c2282bD);
            throw th;
        }
    }

    public static C6304od1 c(C6304od1 c6304od1, String[] strArr, Map map) {
        int i = 0;
        if (c6304od1 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C6304od1) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C6304od1 c6304od12 = new C6304od1();
                int length = strArr.length;
                while (i < length) {
                    c6304od12.a((C6304od1) map.get(strArr[i]));
                    i++;
                }
                return c6304od12;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c6304od1.a((C6304od1) map.get(strArr[0]));
                return c6304od1;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c6304od1.a((C6304od1) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c6304od1;
    }
}
