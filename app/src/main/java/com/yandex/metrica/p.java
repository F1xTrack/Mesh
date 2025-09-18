package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2743f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p {
    public static final List a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url");

    public interface Ucc {
        void onError(String str);

        void onResult(JSONObject jSONObject);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C2743f3.a(context, iIdentifierCallback, new ArrayList(list));
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C2743f3.a(yandexMetricaConfig, str);
    }

    public static String gcni(Context context) {
        return C2743f3.a(context);
    }

    public static String gdid(Context context) {
        return C2743f3.b(context);
    }

    public static String gmsvn(int i) {
        return C2743f3.a(i);
    }

    public static void guc(Ucc ucc, boolean z) {
        C2743f3.a(ucc, z);
    }

    public static String guid(Context context) {
        return C2743f3.d(context);
    }

    public static boolean iifa() {
        return C2743f3.a();
    }

    public static String mpn(Context context) {
        return C2743f3.c(context);
    }

    public static String pgai() {
        try {
            return (String) ((FutureTask) C2743f3.b()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean plat() {
        try {
            return (Boolean) ((FutureTask) C2743f3.c()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rce(int i, String str, String str2, Map<String, String> map) {
        C2743f3.a(i, str, str2, map);
    }

    public static void rlse(Context context, Map<String, Object> map) {
        C2743f3.a(context, map);
    }

    public static void seb() {
        C2743f3.d();
    }

    public static void slte(Context context, boolean z) {
        C2743f3.a(context, z);
    }

    public static String u(String str) {
        return C2743f3.a(str);
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    public static void a(Context context, IIdentifierCallback iIdentifierCallback) {
        a(context, iIdentifierCallback, (List<String>) a);
    }
}
