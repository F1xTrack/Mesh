package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3797p;
import com.yandex.metrica.C3805x;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.f3 */
/* loaded from: classes2.dex */
public final class C3249f3 {

    /* renamed from: a */
    static C3600sg f23396a = new C3600sg(C3065Y.m15442g().m15445c(), new C3626tg());

    /* renamed from: a */
    public static void m15881a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        f23396a.m16737a(context, iIdentifierCallback, list);
    }

    /* renamed from: b */
    public static Future<String> m15887b() {
        return f23396a.m16743b();
    }

    /* renamed from: c */
    public static String m15888c(Context context) {
        return f23396a.m16744c(context);
    }

    /* renamed from: d */
    public static String m15890d(Context context) {
        return f23396a.m16746d(context);
    }

    /* renamed from: a */
    public static boolean m15885a() {
        return f23396a.m16741a();
    }

    /* renamed from: b */
    public static String m15886b(Context context) {
        return f23396a.m16742b(context);
    }

    /* renamed from: c */
    public static Future<Boolean> m15889c() {
        return f23396a.m16745c();
    }

    /* renamed from: d */
    public static void m15891d() {
        f23396a.m16747d();
    }

    /* renamed from: a */
    public static String m15878a(Context context) {
        return f23396a.m16735a(context);
    }

    /* renamed from: a */
    public static void m15880a(int i, String str, String str2, Map<String, String> map) {
        f23396a.m16736a(i, str, str2, map);
    }

    /* renamed from: a */
    public static String m15879a(String str) {
        f23396a.getClass();
        return C2494B2.m13914c(str);
    }

    /* renamed from: a */
    public static String m15877a(int i) {
        f23396a.getClass();
        return C3351j1.m16108a(i);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m15875a(YandexMetricaConfig yandexMetricaConfig, String str) {
        f23396a.getClass();
        C3805x c3805xM17378a = C3806y.m17378a(yandexMetricaConfig);
        c3805xM17378a.f25533b = Collections.singletonList(str);
        return new C3806y(c3805xM17378a);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m15876a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        f23396a.getClass();
        C3805x c3805xM17378a = C3806y.m17378a(yandexMetricaConfig);
        c3805xM17378a.f25533b = list;
        return new C3806y(c3805xM17378a);
    }

    /* renamed from: a */
    public static void m15883a(Context context, boolean z) {
        f23396a.m16739a(context, z);
    }

    /* renamed from: a */
    public static void m15884a(C3797p.Ucc ucc, boolean z) {
        f23396a.m16740a(ucc, z);
    }

    /* renamed from: a */
    public static void m15882a(Context context, Map<String, Object> map) {
        f23396a.m16738a(context, map);
    }
}
