package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: Jm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0759Jm0 {
    public static volatile Handler a = null;
    public static final String[] b = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"};
    public static final String[] c = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};
    public static final String[] d = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache", "/data", "/dev"};
    public static final String[] e = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static int f = 3;

    public static void a(String str) {
        f(str);
    }

    public static void b(String str) {
        f(str);
    }

    public static void c(String str) {
        f(str);
    }

    public static Handler d() {
        if (a != null) {
            return a;
        }
        synchronized (AbstractC0759Jm0.class) {
            try {
                if (a == null) {
                    a = H12.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static boolean e(String str) {
        return f <= 3 || Log.isLoggable(f(str), 3);
    }

    public static String f(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }
}
