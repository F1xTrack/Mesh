package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: aE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8698aE0 {
    /* renamed from: a */
    public static PackageInfo m9683a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
