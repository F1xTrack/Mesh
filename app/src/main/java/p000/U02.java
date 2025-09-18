package p000;

import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class U02 {
    /* renamed from: a */
    public static void m7858a(String str, boolean z) throws C10103lA0 {
        if (!z) {
            throw C10103lA0.m22366a(null, str);
        }
    }

    /* renamed from: b */
    public static int m7859b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: c */
    public static C7660Gr0 m7860c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = AbstractC7485Dh1.f2166a;
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (strArrSplit.length != 2) {
                AbstractC10872rA1.m24175h("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C8948cB0.m10617a(new C9591hA0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC10872rA1.m24176i("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C9796im1(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7660Gr0(arrayList);
    }

    /* renamed from: d */
    public static C11287uQ0 m7861d(C9591hA0 c9591hA0, boolean z, boolean z2) throws C10103lA0 {
        if (z) {
            m7862e(3, c9591hA0, false);
        }
        c9591hA0.m18761s((int) c9591hA0.m18754l(), AbstractC7227yr.f46511c);
        long jM18754l = c9591hA0.m18754l();
        String[] strArr = new String[(int) jM18754l];
        for (int i = 0; i < jM18754l; i++) {
            strArr[i] = c9591hA0.m18761s((int) c9591hA0.m18754l(), AbstractC7227yr.f46511c);
        }
        if (z2 && (c9591hA0.m18763u() & 1) == 0) {
            throw C10103lA0.m22366a(null, "framing bit expected to be set");
        }
        return new C11287uQ0(strArr);
    }

    /* renamed from: e */
    public static boolean m7862e(int i, C9591hA0 c9591hA0, boolean z) throws C10103lA0 {
        if (c9591hA0.m18743a() < 7) {
            if (z) {
                return false;
            }
            throw C10103lA0.m22366a(null, "too short header: " + c9591hA0.m18743a());
        }
        if (c9591hA0.m18763u() != i) {
            if (z) {
                return false;
            }
            throw C10103lA0.m22366a(null, "expected header type " + Integer.toHexString(i));
        }
        if (c9591hA0.m18763u() == 118 && c9591hA0.m18763u() == 111 && c9591hA0.m18763u() == 114 && c9591hA0.m18763u() == 98 && c9591hA0.m18763u() == 105 && c9591hA0.m18763u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C10103lA0.m22366a(null, "expected characters 'vorbis'");
    }
}
