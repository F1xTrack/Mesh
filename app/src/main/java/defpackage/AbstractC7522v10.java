package defpackage;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.Locale;

/* renamed from: v10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7522v10 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = AbstractC0277Dh1.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static Y40 b(String str) throws C0254Da {
        if (Build.VERSION.SDK_INT < 24) {
            C1064Nk0 c1064Nk0 = new C1064Nk0();
            c1064Nk0.a = null;
            c1064Nk0.b = null;
            c1064Nk0.c = false;
            c1064Nk0.b = AbstractC7140t10.d(str);
            c1064Nk0.j();
            return c1064Nk0;
        }
        C1142Ok0 c1142Ok0 = new C1142Ok0();
        c1142Ok0.a = null;
        c1142Ok0.b = null;
        c1142Ok0.c = false;
        ULocale.Builder builderF = AbstractC0909Lk0.f();
        c1142Ok0.b = builderF;
        try {
            builderF.setLanguageTag(str);
            c1142Ok0.c = true;
            return c1142Ok0;
        } catch (RuntimeException e) {
            throw new C0254Da(e.getMessage(), 10);
        }
    }
}
