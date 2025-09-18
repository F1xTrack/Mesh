package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: rm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6903rm1 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static C6713qm1 c;

    public static void a(Context context) {
        if (c == null) {
            C6713qm1 c6713qm1 = new C6713qm1(context);
            c = c6713qm1;
            synchronized (c6713qm1.a) {
                c6713qm1.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, ServiceConnectionC7673vo1 serviceConnectionC7673vo1, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    c.a(a);
                }
                serviceConnectionC7673vo1.b(intent).b(new C1724Vw0(27, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.a(a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
