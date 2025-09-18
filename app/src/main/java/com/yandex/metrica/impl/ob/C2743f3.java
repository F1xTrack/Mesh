package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.p;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2743f3 {
    static C3079sg a = new C3079sg(Y.g().c(), new C3104tg());

    public static void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        a.a(context, iIdentifierCallback, list);
    }

    public static Future<String> b() {
        return a.b();
    }

    public static String c(Context context) {
        return a.c(context);
    }

    public static String d(Context context) {
        return a.d(context);
    }

    public static boolean a() {
        return a.a();
    }

    public static String b(Context context) {
        return a.b(context);
    }

    public static Future<Boolean> c() {
        return a.c();
    }

    public static void d() {
        a.d();
    }

    public static String a(Context context) {
        return a.a(context);
    }

    public static void a(int i, String str, String str2, Map<String, String> map) {
        a.a(i, str, str2, map);
    }

    public static String a(String str) {
        a.getClass();
        return B2.c(str);
    }

    public static String a(int i) {
        a.getClass();
        return C2840j1.a(i);
    }

    public static YandexMetricaConfig a(YandexMetricaConfig yandexMetricaConfig, String str) {
        a.getClass();
        com.yandex.metrica.x xVarA = com.yandex.metrica.y.a(yandexMetricaConfig);
        xVarA.b = Collections.singletonList(str);
        return new com.yandex.metrica.y(xVarA);
    }

    public static YandexMetricaConfig a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        a.getClass();
        com.yandex.metrica.x xVarA = com.yandex.metrica.y.a(yandexMetricaConfig);
        xVarA.b = list;
        return new com.yandex.metrica.y(xVarA);
    }

    public static void a(Context context, boolean z) {
        a.a(context, z);
    }

    public static void a(p.Ucc ucc, boolean z) {
        a.a(ucc, z);
    }

    public static void a(Context context, Map<String, Object> map) {
        a.a(context, map);
    }
}
