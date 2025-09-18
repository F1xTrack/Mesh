package com.p018my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.RunnableC6659q6;

/* renamed from: com.my.tracker.obfuscated.c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2301c1 {

    /* renamed from: a */
    private static final Integer f19782a = 1;

    /* renamed from: b */
    private static final AtomicBoolean f19783b = new AtomicBoolean();

    /* renamed from: a */
    public static boolean m12806a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            AbstractC2391y2.m13572b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            AbstractC2391y2.m13572b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            AbstractC2391y2.m13572b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m12807b(Context context) {
        if (String.valueOf(f19782a).equals(AbstractC2307d2.m12869a(context.getPackageName() + "_mytracker_debug"))) {
            AbstractC2391y2.m13568a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        AbstractC2391y2.m13568a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    /* renamed from: c */
    public static void m12808c(Context context) {
        if (!f19783b.compareAndSet(false, true)) {
            AbstractC2391y2.m13568a("LoggingHandler: instance has already been initialized");
        } else if (AbstractC2391y2.m13571a()) {
            AbstractC2391y2.m13568a("LoggingHandler: tracing has already been enabled");
        } else {
            AbstractC2340m.m13290a(new RunnableC6659q6(context, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m12809d(Context context) {
        String str;
        if (m12806a(context)) {
            AbstractC2391y2.m13570a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (!f19782a.equals((Integer) AbstractC2307d2.m12868a(context, "com.my.tracker.debugMode", Integer.class))) {
                if (m12807b(context)) {
                    AbstractC2391y2.m13570a(true);
                    AbstractC2391y2.m13568a("LoggingHandler: debug mode is enabled by system properties");
                    return;
                }
                return;
            }
            AbstractC2391y2.m13570a(true);
            str = "LoggingHandler: debug mode is enabled by manifest metadata";
        }
        AbstractC2391y2.m13568a(str);
    }
}
