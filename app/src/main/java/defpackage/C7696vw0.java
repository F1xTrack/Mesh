package defpackage;

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
public final class C7696vw0 {
    public static String d;
    public static ServiceConnectionC7505uw0 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public C7696vw0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC6551pw0.a(this.b);
        }
        Context context = this.a;
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

    public final void b(int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, i, notification);
            return;
        }
        C6932rw0 c6932rw0 = new C6932rw0(this.a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new ServiceConnectionC7505uw0(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, c6932rw0).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, i);
    }
}
