package p000;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: A2 */
/* loaded from: classes.dex */
public abstract class AbstractC0003A2 {
    /* renamed from: a */
    public static void m27a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* renamed from: b */
    public static void m28b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: c */
    public static boolean m29c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
