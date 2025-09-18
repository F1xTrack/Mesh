package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Q12 {
    public static boolean a(Context context) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public static boolean b(Context context) {
        O90.f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
        }
        return false;
    }

    public static void c(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = R12.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
                }
                strB = R12.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? f(i2, i3, "end index") : R12.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static String f(int i, int i2, String str) {
        if (i < 0) {
            return R12.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return R12.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
    }
}
