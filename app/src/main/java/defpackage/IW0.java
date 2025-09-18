package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class IW0 extends U0 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable w1(int i, C4103hA0 c4103hA0) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c4103hA0.o()));
        }
        if (i == 1) {
            return Boolean.valueOf(c4103hA0.u() == 1);
        }
        if (i == 2) {
            return y1(c4103hA0);
        }
        if (i != 3) {
            if (i == 8) {
                return x1(c4103hA0);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c4103hA0.o()));
                c4103hA0.H(2);
                return date;
            }
            int iY = c4103hA0.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i2 = 0; i2 < iY; i2++) {
                Serializable serializableW1 = w1(c4103hA0.u(), c4103hA0);
                if (serializableW1 != null) {
                    arrayList.add(serializableW1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strY1 = y1(c4103hA0);
            int iU = c4103hA0.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableW12 = w1(iU, c4103hA0);
            if (serializableW12 != null) {
                map.put(strY1, serializableW12);
            }
        }
    }

    public static HashMap x1(C4103hA0 c4103hA0) {
        int iY = c4103hA0.y();
        HashMap map = new HashMap(iY);
        for (int i = 0; i < iY; i++) {
            String strY1 = y1(c4103hA0);
            Serializable serializableW1 = w1(c4103hA0.u(), c4103hA0);
            if (serializableW1 != null) {
                map.put(strY1, serializableW1);
            }
        }
        return map;
    }

    public static String y1(C4103hA0 c4103hA0) {
        int iA = c4103hA0.A();
        int i = c4103hA0.b;
        c4103hA0.H(iA);
        return new String(c4103hA0.a, i, iA);
    }
}
