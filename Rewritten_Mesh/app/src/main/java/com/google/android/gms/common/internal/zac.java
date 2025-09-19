package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C1938R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p000.L01;
import p000.MT1;

/* loaded from: classes.dex */
public final class zac {
    private static final L01 zaa = new L01();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_enable_button) : resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_update_button) : resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_install_button);
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i == 1) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_install_text, strZaa);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_wear_update_text) : resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_update_text, strZaa);
        }
        if (i == 3) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i == 9) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(C1938R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zad(Context context, int i) {
        return (i == 6 || i == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i);
    }

    public static String zae(Context context, int i) {
        String strZah = i == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i);
        return strZah == null ? context.getResources().getString(ru.mes.dnevnik.R.string.common_google_play_services_notification_ticker) : strZah;
    }

    public static String zaf(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(ru.mes.dnevnik.R.string.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return zah(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return zah(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return zah(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return zah(context, "common_google_play_services_restricted_profile_title");
    }

    private static String zag(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(C1938R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        L01 l01 = zaa;
        synchronized (l01) {
            try {
                Locale locale = MT1.m5373d(context.getResources().getConfiguration()).f5121a.get(0);
                if (!locale.equals(zab)) {
                    l01.clear();
                    zab = locale;
                }
                String str2 = (String) l01.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                l01.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
