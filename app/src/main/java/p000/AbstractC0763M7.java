package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: M7 */
/* loaded from: classes.dex */
public abstract class AbstractC0763M7 {
    /* renamed from: a */
    public static <T> T m5269a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m5270b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m5271c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m5272d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
