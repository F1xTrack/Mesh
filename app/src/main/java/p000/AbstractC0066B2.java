package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: B2 */
/* loaded from: classes.dex */
public abstract class AbstractC0066B2 {
    /* renamed from: a */
    public static boolean m466a(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    public static boolean m467b(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
