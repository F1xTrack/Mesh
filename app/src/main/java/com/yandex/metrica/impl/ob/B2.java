package com.yandex.metrica.impl.ob;

import android.os.Build;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import defpackage.AbstractC1705Vq;
import defpackage.NX;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class B2 {
    private static final Pattern a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");
    private static final Pattern b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    public static class a {
        static final String a;

        static {
            a = B2.a("com.unity3d.player.UnityPlayer") ? "unity" : B2.a("mono.MonoPackageManager") ? "xamarin" : B2.a("org.apache.cordova.CordovaPlugin") ? "cordova" : B2.a("com.facebook.react.ReactRootView") ? "react" : B2.a("io.flutter.embedding.engine.FlutterEngine") ? "flutter" : "native";
        }
    }

    public static void a(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static void b() {
        O2.a("release");
        YandexMetrica.getLibraryApiLevel();
    }

    public static String c(String str) {
        String strA;
        StringBuilder sbK = NX.k(str, "/5.0.0.45001354 (");
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        if (str2.startsWith(str3)) {
            strA = O2.a(str2);
        } else {
            strA = O2.a(str3) + " " + str2;
        }
        sbK.append(strA);
        sbK.append("; Android ");
        return AbstractC1705Vq.l(sbK, Build.VERSION.RELEASE, ")");
    }

    public static void a(Throwable th, String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static String a() {
        return a.a;
    }

    public static boolean a(Throwable th) {
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
        return !TextUtils.isEmpty(string) && b.matcher(string).find();
    }

    public static void b(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static boolean b(Throwable th) {
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
        return !TextUtils.isEmpty(string) && a.matcher(string).find();
    }

    public static boolean a(String str) {
        return b(str) != null;
    }

    public static Class b(String str) {
        try {
            return Class.forName(str, false, B2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
