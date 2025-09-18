package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.yandex.metrica.EnumC3798q;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.b2 */
/* loaded from: classes2.dex */
public final class C3144b2 {

    /* renamed from: a */
    private static final C3039Wn f23078a = new C3039Wn();

    /* renamed from: b */
    private static final C2614Fm<Integer, d> f23079b;

    /* renamed from: c */
    @TargetApi(23)
    private static final C2614Fm<Integer, d> f23080c;

    /* renamed from: d */
    private static final C2614Fm<d, Integer> f23081d;

    /* renamed from: com.yandex.metrica.impl.ob.b2$a */
    public class a extends C2614Fm<Integer, d> {
        public a(d dVar) {
            super(dVar);
            m14146a(1, d.WIFI);
            m14146a(0, d.CELL);
            m14146a(7, d.BLUETOOTH);
            m14146a(9, d.ETHERNET);
            m14146a(4, d.MOBILE_DUN);
            m14146a(5, d.MOBILE_HIPRI);
            m14146a(2, d.MOBILE_MMS);
            m14146a(3, d.MOBILE_SUPL);
            m14146a(6, d.WIMAX);
            if (C2968U2.m15243a(21)) {
                m14146a(17, d.VPN);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$b */
    public class b extends C2614Fm<Integer, d> {
        public b(d dVar) {
            super(dVar);
            m14146a(1, d.WIFI);
            m14146a(0, d.CELL);
            m14146a(3, d.ETHERNET);
            m14146a(2, d.BLUETOOTH);
            m14146a(4, d.VPN);
            if (C2968U2.m15243a(27)) {
                m14146a(6, d.LOWPAN);
            }
            if (C2968U2.m15243a(26)) {
                m14146a(5, d.WIFI_AWARE);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$c */
    public class c extends C2614Fm<d, Integer> {
        public c(Integer num) {
            super(num);
            m14146a(d.CELL, 0);
            m14146a(d.WIFI, 1);
            m14146a(d.BLUETOOTH, 3);
            m14146a(d.ETHERNET, 4);
            m14146a(d.MOBILE_DUN, 5);
            m14146a(d.MOBILE_HIPRI, 6);
            m14146a(d.MOBILE_MMS, 7);
            m14146a(d.MOBILE_SUPL, 8);
            m14146a(d.VPN, 9);
            m14146a(d.WIMAX, 10);
            m14146a(d.LOWPAN, 11);
            m14146a(d.WIFI_AWARE, 12);
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
        f23079b = new a(dVar);
        f23080c = new b(dVar);
        f23081d = new c(2);
    }

    /* renamed from: a */
    public static EnumC3798q m15663a(Context context, Point point) {
        float f;
        try {
            f = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f = 0.0f;
        }
        EnumC3798q enumC3798q = EnumC3798q.PHONE;
        if (f == 0.0f) {
            return enumC3798q;
        }
        float f2 = point.x;
        float f3 = point.y;
        float fMin = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        return (dSqrt < 15.0d || f23078a.m15404a(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? EnumC3798q.TABLET : enumC3798q : EnumC3798q.TV;
    }

    /* renamed from: b */
    public static d m15667b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? d.OFFLINE : f23079b.m14144a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    /* renamed from: b */
    public static int m15666b(Context context) {
        return f23081d.m14144a(m15661a(context)).intValue();
    }

    /* renamed from: a */
    public static String m15664a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (C2968U2.m15243a(21)) {
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

    /* renamed from: a */
    public static d m15661a(Context context) {
        d dVarM15667b;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        d dVar = d.UNDEFINED;
        if (connectivityManager != null) {
            try {
                if (C2968U2.m15243a(23)) {
                    dVarM15667b = m15662a(connectivityManager);
                } else {
                    dVarM15667b = m15667b(connectivityManager);
                }
            } catch (Throwable unused) {
            }
        } else {
            dVarM15667b = null;
        }
        return dVarM15667b == null ? dVar : dVarM15667b;
    }

    /* renamed from: a */
    public static d m15662a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (m15665a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer num : f23080c.m14145a()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return f23080c.m14144a(num);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static boolean m15665a(ConnectivityManager connectivityManager, Network network) {
        NetworkInfo networkInfo;
        return C2968U2.m15243a(29) ? network == null : network == null || !((networkInfo = connectivityManager.getNetworkInfo(network)) == null || networkInfo.isConnected());
    }
}
