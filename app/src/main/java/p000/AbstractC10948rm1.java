package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* renamed from: rm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10948rm1 {

    /* renamed from: a */
    public static final long f41895a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f41896b = new Object();

    /* renamed from: c */
    public static C10820qm1 f41897c;

    /* renamed from: a */
    public static void m24485a(Context context) {
        if (f41897c == null) {
            C10820qm1 c10820qm1 = new C10820qm1(context);
            f41897c = c10820qm1;
            synchronized (c10820qm1.f41140a) {
                c10820qm1.f41146g = true;
            }
        }
    }

    /* renamed from: b */
    public static void m24486b(Intent intent) {
        synchronized (f41896b) {
            try {
                if (f41897c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f41897c.m24061c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static void m24487c(Context context, ServiceConnectionC11464vo1 serviceConnectionC11464vo1, Intent intent) {
        synchronized (f41896b) {
            try {
                m24485a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f41897c.m24059a(f41895a);
                }
                serviceConnectionC11464vo1.m25491b(intent).mo11135b(new C8450Vw0(27, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static ComponentName m24488d(Context context, Intent intent) {
        synchronized (f41896b) {
            try {
                m24485a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f41897c.m24059a(f41895a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
