package p000;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.Locale;

/* renamed from: v10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11362v10 {

    /* renamed from: a */
    public static final byte[] f44086a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f44087b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m25304a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {f44087b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = AbstractC7485Dh1.f2166a;
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

    /* renamed from: b */
    public static Y40 m25305b(String str) throws C0226Da {
        if (Build.VERSION.SDK_INT < 24) {
            C8010Nk0 c8010Nk0 = new C8010Nk0();
            c8010Nk0.f7982a = null;
            c8010Nk0.f7983b = null;
            c8010Nk0.f7984c = false;
            c8010Nk0.f7983b = AbstractC11106t10.m24829d(str);
            c8010Nk0.m5829j();
            return c8010Nk0;
        }
        C8062Ok0 c8062Ok0 = new C8062Ok0();
        c8062Ok0.f8591a = null;
        c8062Ok0.f8592b = null;
        c8062Ok0.f8593c = false;
        ULocale.Builder builderM5076f = AbstractC7906Lk0.m5076f();
        c8062Ok0.f8592b = builderM5076f;
        try {
            builderM5076f.setLanguageTag(str);
            c8062Ok0.f8593c = true;
            return c8062Ok0;
        } catch (RuntimeException e) {
            throw new C0226Da(e.getMessage(), 10);
        }
    }
}
