package defpackage;

import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class U02 {
    public static void a(String str, boolean z) throws C5643lA0 {
        if (!z) {
            throw C5643lA0.a(null, str);
        }
    }

    public static int b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static C0540Gr0 c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = AbstractC0277Dh1.a;
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (strArrSplit.length != 2) {
                AbstractC6789rA1.h("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2467cB0.a(new C4103hA0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC6789rA1.i("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C4408im1(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0540Gr0(arrayList);
    }

    public static C7409uQ0 d(C4103hA0 c4103hA0, boolean z, boolean z2) throws C5643lA0 {
        if (z) {
            e(3, c4103hA0, false);
        }
        c4103hA0.s((int) c4103hA0.l(), AbstractC8250yr.c);
        long jL = c4103hA0.l();
        String[] strArr = new String[(int) jL];
        for (int i = 0; i < jL; i++) {
            strArr[i] = c4103hA0.s((int) c4103hA0.l(), AbstractC8250yr.c);
        }
        if (z2 && (c4103hA0.u() & 1) == 0) {
            throw C5643lA0.a(null, "framing bit expected to be set");
        }
        return new C7409uQ0(strArr);
    }

    public static boolean e(int i, C4103hA0 c4103hA0, boolean z) throws C5643lA0 {
        if (c4103hA0.a() < 7) {
            if (z) {
                return false;
            }
            throw C5643lA0.a(null, "too short header: " + c4103hA0.a());
        }
        if (c4103hA0.u() != i) {
            if (z) {
                return false;
            }
            throw C5643lA0.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (c4103hA0.u() == 118 && c4103hA0.u() == 111 && c4103hA0.u() == 114 && c4103hA0.u() == 98 && c4103hA0.u() == 105 && c4103hA0.u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C5643lA0.a(null, "expected characters 'vorbis'");
    }
}
