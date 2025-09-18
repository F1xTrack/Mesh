package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: qS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10779qS0 {

    /* renamed from: b */
    public static final C10779qS0 f40878b = new C10779qS0();

    /* renamed from: a */
    public final HashMap f40879a = new HashMap();

    /* renamed from: a */
    public final Drawable m23999a(Context context, String str) {
        O90.m5968f(context, "context");
        int iM24000b = m24000b(context, str);
        if (iM24000b <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = ES0.f2702a;
        return AbstractC11927zS0.m26438a(resources, iM24000b, null);
    }

    /* renamed from: b */
    public final int m24000b(Context context, String str) {
        O90.m5968f(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        O90.m5967e(lowerCase, "toLowerCase(...)");
        String strM1554m = D51.m1554m(lowerCase, "-", "_");
        try {
            return Integer.parseInt(strM1554m);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    Integer num = (Integer) this.f40879a.get(strM1554m);
                    if (num != null) {
                        return num.intValue();
                    }
                    int identifier = context.getResources().getIdentifier(strM1554m, "drawable", context.getPackageName());
                    this.f40879a.put(strM1554m, Integer.valueOf(identifier));
                    return identifier;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final Uri m24001c(Context context, String str) {
        O90.m5968f(context, "context");
        int iM24000b = m24000b(context, str);
        if (iM24000b > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iM24000b)).build();
            O90.m5965c(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        O90.m5965c(uri);
        return uri;
    }
}
