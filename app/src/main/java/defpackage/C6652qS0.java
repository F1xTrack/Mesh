package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: qS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6652qS0 {
    public static final C6652qS0 b = new C6652qS0();
    public final HashMap a = new HashMap();

    public final Drawable a(Context context, String str) {
        O90.f(context, "context");
        int iB = b(context, str);
        if (iB <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = ES0.a;
        return AbstractC8366zS0.a(resources, iB, null);
    }

    public final int b(Context context, String str) {
        O90.f(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        O90.e(lowerCase, "toLowerCase(...)");
        String strM = D51.m(lowerCase, "-", "_");
        try {
            return Integer.parseInt(strM);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    Integer num = (Integer) this.a.get(strM);
                    if (num != null) {
                        return num.intValue();
                    }
                    int identifier = context.getResources().getIdentifier(strM, "drawable", context.getPackageName());
                    this.a.put(strM, Integer.valueOf(identifier));
                    return identifier;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Uri c(Context context, String str) {
        O90.f(context, "context");
        int iB = b(context, str);
        if (iB > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iB)).build();
            O90.c(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        O90.c(uri);
        return uri;
    }
}
