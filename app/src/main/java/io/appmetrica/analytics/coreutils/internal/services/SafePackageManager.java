package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.impl.C4314a;
import io.appmetrica.analytics.coreutils.impl.C4315b;
import io.appmetrica.analytics.coreutils.impl.C4316c;
import io.appmetrica.analytics.coreutils.impl.C4317d;
import io.appmetrica.analytics.coreutils.impl.C4318e;
import io.appmetrica.analytics.coreutils.impl.C4319f;
import io.appmetrica.analytics.coreutils.impl.C4320g;
import io.appmetrica.analytics.coreutils.impl.C4321h;
import io.appmetrica.analytics.coreutils.impl.C4322i;
import io.appmetrica.analytics.coreutils.impl.C4323j;
import kotlin.Metadata;
import p000.C8313Tf1;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-¨\u0006."}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/SafePackageManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "packageName", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;", "", "flags", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", "Landroid/content/ComponentName;", "component", "Landroid/content/pm/ServiceInfo;", "getServiceInfo", "(Landroid/content/Context;Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/pm/ResolveInfo;", "resolveService", "(Landroid/content/Context;Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;", "resolveActivity", "authority", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ProviderInfo;", "Landroid/content/pm/ApplicationInfo;", "getApplicationInfo", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;", "componentName", "Landroid/content/pm/ActivityInfo;", "getActivityInfo", "(Landroid/content/Context;Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;", "newState", "LTf1;", "setComponentEnabledSetting", "(Landroid/content/Context;Landroid/content/ComponentName;II)LTf1;", "name", "", "hasSystemFeature", "(Landroid/content/Context;Ljava/lang/String;)Z", "getInstallerPackageName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class SafePackageManager {
    /* renamed from: a */
    private static Object m19164a(Boolean bool, InterfaceC6434mZ interfaceC6434mZ) {
        try {
            Object objInvoke = interfaceC6434mZ.invoke();
            return objInvoke == null ? bool : objInvoke;
        } catch (Throwable unused) {
            return bool;
        }
    }

    public final ActivityInfo getActivityInfo(Context context, ComponentName componentName, int flags) {
        return (ActivityInfo) m19164a(null, new C4314a(context, componentName, flags));
    }

    public final ApplicationInfo getApplicationInfo(Context context, String packageName, int flags) {
        return (ApplicationInfo) m19164a(null, new C4315b(context, packageName, flags));
    }

    public final String getInstallerPackageName(Context context, String packageName) {
        return (String) m19164a(null, new C4316c(context, packageName));
    }

    public final PackageInfo getPackageInfo(Context context, String packageName) {
        return getPackageInfo(context, packageName, 0);
    }

    public final ServiceInfo getServiceInfo(Context context, ComponentName component, int flags) {
        return (ServiceInfo) m19164a(null, new C4318e(context, component, flags));
    }

    public final boolean hasSystemFeature(Context context, String name) {
        return ((Boolean) m19164a(Boolean.FALSE, new C4319f(context, name))).booleanValue();
    }

    public final ResolveInfo resolveActivity(Context context, Intent intent, int flags) {
        return (ResolveInfo) m19164a(null, new C4320g(context, intent, flags));
    }

    public final ProviderInfo resolveContentProvider(Context context, String authority) {
        return (ProviderInfo) m19164a(null, new C4321h(context, authority));
    }

    public final ResolveInfo resolveService(Context context, Intent intent, int flags) {
        return (ResolveInfo) m19164a(null, new C4322i(context, intent, flags));
    }

    public final C8313Tf1 setComponentEnabledSetting(Context context, ComponentName componentName, int newState, int flags) {
        return (C8313Tf1) m19164a(null, new C4323j(context, componentName, newState, flags));
    }

    public final PackageInfo getPackageInfo(Context context, String packageName, int flags) {
        return (PackageInfo) m19164a(null, new C4317d(context, packageName, flags));
    }
}
