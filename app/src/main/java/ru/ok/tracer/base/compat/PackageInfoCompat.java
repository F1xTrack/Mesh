package ru.ok.tracer.base.compat;

import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"longVersionCodeCompat", "", "Landroid/content/pm/PackageInfo;", "getLongVersionCodeCompat", "(Landroid/content/pm/PackageInfo;)J", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PackageInfoCompat {
    public static final long getLongVersionCodeCompat(PackageInfo packageInfo) {
        O90.f(packageInfo, "<this>");
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }
}
