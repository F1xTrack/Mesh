package ru.p031ok.tracer.base.compat;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000e"}, m22267d2 = {"getApplicationInfoCompat", "Landroid/content/pm/ApplicationInfo;", "Landroid/content/pm/PackageManager;", "packageName", "", "flags", "", "getInstallerPackageNameCompat", "getPackageInfoCompat", "Landroid/content/pm/PackageInfo;", "getProviderInfoCompat", "Landroid/content/pm/ProviderInfo;", "component", "Landroid/content/ComponentName;", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PackageManagerCompat {
    public static final ApplicationInfo getApplicationInfoCompat(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(i));
            O90.m5967e(applicationInfo, "getApplicationInfo(packa…pplicationInfoFlags::of))");
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(str, i);
        O90.m5967e(applicationInfo2, "getApplicationInfo(packageName, flags)");
        return applicationInfo2;
    }

    public static final String getInstallerPackageNameCompat(PackageManager packageManager, String str) {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i) throws PackageManager.NameNotFoundException {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(str, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
            O90.m5967e(packageInfo, "getPackageInfo(packageNa…er.PackageInfoFlags::of))");
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, i);
        O90.m5967e(packageInfo2, "getPackageInfo(packageName, flags)");
        return packageInfo2;
    }

    public static final ProviderInfo getProviderInfoCompat(PackageManager packageManager, ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        O90.m5968f(packageManager, "<this>");
        O90.m5968f(componentName, "component");
        if (Build.VERSION.SDK_INT >= 33) {
            ProviderInfo providerInfo = packageManager.getProviderInfo(componentName, PackageManager.ComponentInfoFlags.of(i));
            O90.m5967e(providerInfo, "getProviderInfo(componen….ComponentInfoFlags::of))");
            return providerInfo;
        }
        ProviderInfo providerInfo2 = packageManager.getProviderInfo(componentName, i);
        O90.m5967e(providerInfo2, "getProviderInfo(component, flags)");
        return providerInfo2;
    }
}
