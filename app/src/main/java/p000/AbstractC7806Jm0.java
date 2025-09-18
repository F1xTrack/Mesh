package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: Jm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7806Jm0 {

    /* renamed from: a */
    public static volatile Handler f5687a = null;

    /* renamed from: b */
    public static final String[] f5688b = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"};

    /* renamed from: c */
    public static final String[] f5689c = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};

    /* renamed from: d */
    public static final String[] f5690d = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache", "/data", "/dev"};

    /* renamed from: e */
    public static final String[] f5691e = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* renamed from: f */
    public static int f5692f = 3;

    /* renamed from: a */
    public static void m4407a(String str) {
        m4412f(str);
    }

    /* renamed from: b */
    public static void m4408b(String str) {
        m4412f(str);
    }

    /* renamed from: c */
    public static void m4409c(String str) {
        m4412f(str);
    }

    /* renamed from: d */
    public static Handler m4410d() {
        if (f5687a != null) {
            return f5687a;
        }
        synchronized (AbstractC7806Jm0.class) {
            try {
                if (f5687a == null) {
                    f5687a = H12.m3240a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5687a;
    }

    /* renamed from: e */
    public static boolean m4411e(String str) {
        return f5692f <= 3 || Log.isLoggable(m4412f(str), 3);
    }

    /* renamed from: f */
    public static String m4412f(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }
}
