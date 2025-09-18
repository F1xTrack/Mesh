package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Yd */
/* loaded from: classes2.dex */
public abstract class AbstractC4949Yd {

    /* renamed from: a */
    public static final SafePackageManager f31112a = new SafePackageManager();

    /* renamed from: b */
    public static final C4829Td f31113b = new C4829Td();

    /* renamed from: c */
    public static final C4853Ud f31114c = new C4853Ud();

    /* renamed from: d */
    public static final C4877Vd f31115d = new C4877Vd(2);

    /* renamed from: a */
    public static String m20036a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static EnumC4925Xd m20035a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        EnumC4925Xd enumC4925Xd = EnumC4925Xd.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return EnumC4925Xd.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return enumC4925Xd;
        }
        for (Integer num : f31114c.f32341a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (EnumC4925Xd) f31114c.m20862a(num);
            }
        }
        return enumC4925Xd;
    }
}
