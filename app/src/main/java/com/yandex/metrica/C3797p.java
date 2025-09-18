package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3249f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.p */
/* loaded from: classes2.dex */
public final class C3797p {

    /* renamed from: a */
    public static final List f25481a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url");

    /* renamed from: com.yandex.metrica.p$Ucc */
    public interface Ucc {
        void onError(String str);

        void onResult(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m17374a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C3249f3.m15881a(context, iIdentifierCallback, new ArrayList(list));
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C3249f3.m15875a(yandexMetricaConfig, str);
    }

    public static String gcni(Context context) {
        return C3249f3.m15878a(context);
    }

    public static String gdid(Context context) {
        return C3249f3.m15886b(context);
    }

    public static String gmsvn(int i) {
        return C3249f3.m15877a(i);
    }

    public static void guc(Ucc ucc, boolean z) {
        C3249f3.m15884a(ucc, z);
    }

    public static String guid(Context context) {
        return C3249f3.m15890d(context);
    }

    public static boolean iifa() {
        return C3249f3.m15885a();
    }

    public static String mpn(Context context) {
        return C3249f3.m15888c(context);
    }

    public static String pgai() {
        try {
            return (String) ((FutureTask) C3249f3.m15887b()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean plat() {
        try {
            return (Boolean) ((FutureTask) C3249f3.m15889c()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rce(int i, String str, String str2, Map<String, String> map) {
        C3249f3.m15880a(i, str, str2, map);
    }

    public static void rlse(Context context, Map<String, Object> map) {
        C3249f3.m15882a(context, map);
    }

    public static void seb() {
        C3249f3.m15891d();
    }

    public static void slte(Context context, boolean z) {
        C3249f3.m15883a(context, z);
    }

    /* renamed from: u */
    public static String m17376u(String str) {
        return C3249f3.m15879a(str);
    }

    /* renamed from: a */
    public static void m17375a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        m17374a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static void m17373a(Context context, IIdentifierCallback iIdentifierCallback) {
        m17374a(context, iIdentifierCallback, (List<String>) f25481a);
    }
}
