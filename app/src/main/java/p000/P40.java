package p000;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class P40 {

    /* renamed from: a */
    public static final Method f8842a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f8842a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public static String m6224a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return O40.m5952c(O40.m5950a(O40.m5951b(locale)));
        }
        try {
            return N40.m5537a((Locale) f8842a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return N40.m5537a(locale);
        }
    }
}
