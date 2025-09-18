package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

/* renamed from: lN1 */
/* loaded from: classes.dex */
public abstract class AbstractC5683lN1 {
    public static final Object a(Class cls, Map map, List list) throws IllegalArgumentException {
        O90.f(cls, "annotationClass");
        O90.f(list, "methods");
        F71 f71B = LB.b(new C3881g1(2, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7536v5(cls, map, LB.b(new C7726w5(cls, 0, map)), f71B, list));
        O90.d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static void b(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC6447pN1.b(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (PlatformVersion.isAtLeastQ()) {
            new AG(context, z, new S81(), 4).run();
        } else {
            AbstractC3782fU1.e(null);
        }
    }
}
