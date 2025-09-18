package p000;

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
public abstract class AbstractC10130lN1 {
    /* renamed from: a */
    public static final Object m22414a(Class cls, Map map, List list) throws IllegalArgumentException {
        O90.m5968f(cls, "annotationClass");
        O90.m5968f(list, "methods");
        F71 f71M4915b = AbstractC0705LB.m4915b(new C4090g1(2, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6990v5(cls, map, AbstractC0705LB.m4915b(new C7053w5(cls, 0, map)), f71M4915b, list));
        O90.m5966d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    /* renamed from: b */
    public static void m22415b(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC10642pN1.m23769b(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (PlatformVersion.isAtLeastQ()) {
            new RunnableC0017AG(context, z, new S81(), 4).run();
        } else {
            AbstractC9376fU1.m18244e(null);
        }
    }
}
