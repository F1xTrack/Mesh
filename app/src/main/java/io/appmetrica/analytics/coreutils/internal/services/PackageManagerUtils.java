package io.appmetrica.analytics.coreutils.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtils;", "", "Landroid/content/Context;", "context", "", "getAppVersionCodeString", "", "getAppVersionCodeInt", "getAppVersionName", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "authority", "", "hasContentProvider", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class PackageManagerUtils {
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* renamed from: a */
    private static final SafePackageManager f29739a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    public static final int getAppVersionCodeInt(Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static final String getAppVersionCodeString(Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    public static final String getAppVersionName(Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? "0.0" : str;
    }

    public static final PackageInfo getPackageInfo(Context context) {
        return f29739a.getPackageInfo(context, context.getPackageName());
    }

    public static final boolean hasContentProvider(Context context, String authority) {
        return resolveContentProvider(context, authority) != null;
    }

    public static final ProviderInfo resolveContentProvider(Context context, String authority) {
        return f29739a.resolveContentProvider(context, authority);
    }
}
