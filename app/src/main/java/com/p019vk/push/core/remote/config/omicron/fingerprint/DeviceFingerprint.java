package com.p019vk.push.core.remote.config.omicron.fingerprint;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.p019vk.push.core.remote.config.omicron.AnalyticsHandler;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class DeviceFingerprint implements OmicronFingerprint {

    /* renamed from: a */
    public final Context f20545a;

    /* renamed from: b */
    public final AnalyticsHandler f20546b;

    public DeviceFingerprint(Context context, AnalyticsHandler analyticsHandler) {
        this.f20545a = context.getApplicationContext();
        this.f20546b = analyticsHandler;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        String string;
        Context context = this.f20545a;
        Resources resources = context.getResources();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        map.put("connection_type", (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? LocalNotification.Importance.NONE : activeNetworkInfo.getType() == 1 ? "wifi" : "mobile");
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            this.f20546b.onHandledException(th);
            string = "";
        }
        map.put(AnalyticsBaseParamsConstantsKt.DEVICE_ID, string);
        map.put("device_width", Integer.valueOf(resources.getDisplayMetrics().widthPixels));
        map.put("device_height", Integer.valueOf(resources.getDisplayMetrics().heightPixels));
        Locale locale = context.getResources().getConfiguration().locale;
        map.put("lang", locale.getLanguage() + "_" + locale.getCountry());
        map.put("os_version", Build.VERSION.RELEASE);
        map.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, new SimpleDateFormat("ZZZZ").format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime()));
        map.put(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, Build.MANUFACTURER + " " + Build.MODEL);
        map.put("sim_mcc", Integer.valueOf(resources.getConfiguration().mcc));
        map.put("sim_mnc", Integer.valueOf(resources.getConfiguration().mnc));
    }
}
