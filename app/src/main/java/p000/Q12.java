package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Q12 {
    /* renamed from: a */
    public static boolean m6547a(Context context) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    /* renamed from: b */
    public static boolean m6548b(Context context) {
        O90.m5968f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
        }
        return false;
    }

    /* renamed from: c */
    public static void m6549c(int i, int i2) {
        String strM6880b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM6880b = R12.m6880b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM6880b = R12.m6880b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM6880b);
        }
    }

    /* renamed from: d */
    public static void m6550d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m6552f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m6552f(i2, i3, "end index") : R12.m6880b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: e */
    public static void m6551e(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m6552f(int i, int i2, String str) {
        if (i < 0) {
            return R12.m6880b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return R12.m6880b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }
}
