package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import defpackage.RunnableC6585q6;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class c1 {
    private static final Integer a = 1;
    private static final AtomicBoolean b = new AtomicBoolean();

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            y2.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            y2.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            y2.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    public static boolean b(Context context) {
        if (String.valueOf(a).equals(d2.a(context.getPackageName() + "_mytracker_debug"))) {
            y2.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        y2.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(Context context) {
        if (!b.compareAndSet(false, true)) {
            y2.a("LoggingHandler: instance has already been initialized");
        } else if (y2.a()) {
            y2.a("LoggingHandler: tracing has already been enabled");
        } else {
            m.a(new RunnableC6585q6(context, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String str;
        if (a(context)) {
            y2.a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (!a.equals((Integer) d2.a(context, "com.my.tracker.debugMode", Integer.class))) {
                if (b(context)) {
                    y2.a(true);
                    y2.a("LoggingHandler: debug mode is enabled by system properties");
                    return;
                }
                return;
            }
            y2.a(true);
            str = "LoggingHandler: debug mode is enabled by manifest metadata";
        }
        y2.a(str);
    }
}
