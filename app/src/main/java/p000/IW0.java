package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class IW0 extends AbstractC1259U0 {

    /* renamed from: c */
    public long f4968c;

    /* renamed from: d */
    public long[] f4969d;

    /* renamed from: e */
    public long[] f4970e;

    /* renamed from: w1 */
    public static Serializable m3929w1(int i, C9591hA0 c9591hA0) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c9591hA0.m18757o()));
        }
        if (i == 1) {
            return Boolean.valueOf(c9591hA0.m18763u() == 1);
        }
        if (i == 2) {
            return m3931y1(c9591hA0);
        }
        if (i != 3) {
            if (i == 8) {
                return m3930x1(c9591hA0);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c9591hA0.m18757o()));
                c9591hA0.m18742H(2);
                return date;
            }
            int iM18767y = c9591hA0.m18767y();
            ArrayList arrayList = new ArrayList(iM18767y);
            for (int i2 = 0; i2 < iM18767y; i2++) {
                Serializable serializableM3929w1 = m3929w1(c9591hA0.m18763u(), c9591hA0);
                if (serializableM3929w1 != null) {
                    arrayList.add(serializableM3929w1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM3931y1 = m3931y1(c9591hA0);
            int iM18763u = c9591hA0.m18763u();
            if (iM18763u == 9) {
                return map;
            }
            Serializable serializableM3929w12 = m3929w1(iM18763u, c9591hA0);
            if (serializableM3929w12 != null) {
                map.put(strM3931y1, serializableM3929w12);
            }
        }
    }

    /* renamed from: x1 */
    public static HashMap m3930x1(C9591hA0 c9591hA0) {
        int iM18767y = c9591hA0.m18767y();
        HashMap map = new HashMap(iM18767y);
        for (int i = 0; i < iM18767y; i++) {
            String strM3931y1 = m3931y1(c9591hA0);
            Serializable serializableM3929w1 = m3929w1(c9591hA0.m18763u(), c9591hA0);
            if (serializableM3929w1 != null) {
                map.put(strM3931y1, serializableM3929w1);
            }
        }
        return map;
    }

    /* renamed from: y1 */
    public static String m3931y1(C9591hA0 c9591hA0) {
        int iM18735A = c9591hA0.m18735A();
        int i = c9591hA0.f28294b;
        c9591hA0.m18742H(iM18735A);
        return new String(c9591hA0.f28293a, i, iM18735A);
    }
}
