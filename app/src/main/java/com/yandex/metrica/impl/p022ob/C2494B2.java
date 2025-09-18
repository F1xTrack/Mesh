package com.yandex.metrica.impl.p022ob;

import android.os.Build;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;
import p000.AbstractC0852NX;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.B2 */
/* loaded from: classes2.dex */
public class C2494B2 {

    /* renamed from: a */
    private static final Pattern f20915a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b */
    private static final Pattern f20916b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: com.yandex.metrica.impl.ob.B2$a */
    public static class a {

        /* renamed from: a */
        static final String f20917a;

        static {
            f20917a = C2494B2.m13908a("com.unity3d.player.UnityPlayer") ? "unity" : C2494B2.m13908a("mono.MonoPackageManager") ? "xamarin" : C2494B2.m13908a("org.apache.cordova.CordovaPlugin") ? "cordova" : C2494B2.m13908a("com.facebook.react.ReactRootView") ? "react" : C2494B2.m13908a("io.flutter.embedding.engine.FlutterEngine") ? "flutter" : "native";
        }
    }

    /* renamed from: a */
    public static void m13906a(String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: b */
    public static void m13911b() {
        C2819O2.m14685a("release");
        YandexMetrica.getLibraryApiLevel();
    }

    /* renamed from: c */
    public static String m13914c(String str) {
        String strM14685a;
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, "/5.0.0.45001354 (");
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        if (str2.startsWith(str3)) {
            strM14685a = C2819O2.m14685a(str2);
        } else {
            strM14685a = C2819O2.m14685a(str3) + " " + str2;
        }
        sbM5762k.append(strM14685a);
        sbM5762k.append("; Android ");
        return AbstractC1374Vq.m8593l(sbM5762k, Build.VERSION.RELEASE, ")");
    }

    /* renamed from: a */
    public static void m13907a(Throwable th, String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: a */
    public static String m13905a() {
        return a.f20917a;
    }

    /* renamed from: a */
    public static boolean m13909a(Throwable th) {
        String string;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f20916b.matcher(string).find();
    }

    /* renamed from: b */
    public static void m13912b(String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: b */
    public static boolean m13913b(Throwable th) {
        String string;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f20915a.matcher(string).find();
    }

    /* renamed from: a */
    public static boolean m13908a(String str) {
        return m13910b(str) != null;
    }

    /* renamed from: b */
    public static Class m13910b(String str) {
        try {
            return Class.forName(str, false, C2494B2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
