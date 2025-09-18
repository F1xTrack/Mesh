package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2642b2 {
    private static final Wn a = new Wn();
    private static final Fm<Integer, d> b;

    @TargetApi(23)
    private static final Fm<Integer, d> c;
    private static final Fm<d, Integer> d;

    /* renamed from: com.yandex.metrica.impl.ob.b2$a */
    public class a extends Fm<Integer, d> {
        public a(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(7, d.BLUETOOTH);
            a(9, d.ETHERNET);
            a(4, d.MOBILE_DUN);
            a(5, d.MOBILE_HIPRI);
            a(2, d.MOBILE_MMS);
            a(3, d.MOBILE_SUPL);
            a(6, d.WIMAX);
            if (U2.a(21)) {
                a(17, d.VPN);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$b */
    public class b extends Fm<Integer, d> {
        public b(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(3, d.ETHERNET);
            a(2, d.BLUETOOTH);
            a(4, d.VPN);
            if (U2.a(27)) {
                a(6, d.LOWPAN);
            }
            if (U2.a(26)) {
                a(5, d.WIFI_AWARE);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$c */
    public class c extends Fm<d, Integer> {
        public c(Integer num) {
            super(num);
            a(d.CELL, 0);
            a(d.WIFI, 1);
            a(d.BLUETOOTH, 3);
            a(d.ETHERNET, 4);
            a(d.MOBILE_DUN, 5);
            a(d.MOBILE_HIPRI, 6);
            a(d.MOBILE_MMS, 7);
            a(d.MOBILE_SUPL, 8);
            a(d.VPN, 9);
            a(d.WIMAX, 10);
            a(d.LOWPAN, 11);
            a(d.WIFI_AWARE, 12);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$d */
    public enum d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        d dVar = d.UNDEFINED;
        b = new a(dVar);
        c = new b(dVar);
        d = new c(2);
    }

    public static com.yandex.metrica.q a(Context context, Point point) {
        float f;
        try {
            f = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f = 0.0f;
        }
        com.yandex.metrica.q qVar = com.yandex.metrica.q.PHONE;
        if (f == 0.0f) {
            return qVar;
        }
        float f2 = point.x;
        float f3 = point.y;
        float fMin = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        return (dSqrt < 15.0d || a.a(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? com.yandex.metrica.q.TABLET : qVar : com.yandex.metrica.q.TV;
    }

    public static d b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? d.OFFLINE : b.a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    public static int b(Context context) {
        return d.a(a(context)).intValue();
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (U2.a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    public static d a(Context context) {
        d dVarB;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        d dVar = d.UNDEFINED;
        if (connectivityManager != null) {
            try {
                if (U2.a(23)) {
                    dVarB = a(connectivityManager);
                } else {
                    dVarB = b(connectivityManager);
                }
            } catch (Throwable unused) {
            }
        } else {
            dVarB = null;
        }
        return dVarB == null ? dVar : dVarB;
    }

    public static d a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer num : c.a()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return c.a(num);
            }
        }
        return dVar;
    }

    private static boolean a(ConnectivityManager connectivityManager, Network network) {
        NetworkInfo networkInfo;
        return U2.a(29) ? network == null : network == null || !((networkInfo = connectivityManager.getNetworkInfo(network)) == null || networkInfo.isConnected());
    }
}
