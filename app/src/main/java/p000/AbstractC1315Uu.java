package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

/* renamed from: Uu */
/* loaded from: classes.dex */
public abstract class AbstractC1315Uu {

    /* renamed from: a */
    public static final GmsLogger f12197a = new GmsLogger("CommonUtils", "");

    /* renamed from: a */
    public static String m8199a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f12197a.m11111e("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    /* renamed from: b */
    public static String m8200b(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
