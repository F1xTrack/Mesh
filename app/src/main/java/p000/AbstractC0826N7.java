package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: N7 */
/* loaded from: classes.dex */
public abstract class AbstractC0826N7 {
    /* renamed from: a */
    public static int m5544a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static String m5545b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m5546c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
