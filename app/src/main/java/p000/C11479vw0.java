package p000;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* renamed from: vw0 */
/* loaded from: classes.dex */
public final class C11479vw0 {

    /* renamed from: d */
    public static String f44608d;

    /* renamed from: g */
    public static ServiceConnectionC11351uw0 f44611g;

    /* renamed from: a */
    public final Context f44612a;

    /* renamed from: b */
    public final NotificationManager f44613b;

    /* renamed from: c */
    public static final Object f44607c = new Object();

    /* renamed from: e */
    public static HashSet f44609e = new HashSet();

    /* renamed from: f */
    public static final Object f44610f = new Object();

    public C11479vw0(Context context) {
        this.f44612a = context;
        this.f44613b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public final boolean m25529a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC10711pw0.m23888a(this.f44613b);
        }
        Context context = this.f44612a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final void m25530b(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f44613b.notify(null, i, notification);
            return;
        }
        C10967rw0 c10967rw0 = new C10967rw0(this.f44612a.getPackageName(), i, notification);
        synchronized (f44610f) {
            try {
                if (f44611g == null) {
                    f44611g = new ServiceConnectionC11351uw0(this.f44612a.getApplicationContext());
                }
                f44611g.f44027b.obtainMessage(0, c10967rw0).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44613b.cancel(null, i);
    }
}
