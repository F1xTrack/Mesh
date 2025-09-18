package defpackage;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class P40 {
    public static final Method a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return O40.c(O40.a(O40.b(locale)));
        }
        try {
            return N40.a((Locale) a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return N40.a(locale);
        }
    }
}
