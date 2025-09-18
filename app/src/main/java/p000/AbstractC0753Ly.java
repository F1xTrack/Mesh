package p000;

import android.content.Context;
import java.io.File;

/* renamed from: Ly */
/* loaded from: classes.dex */
public abstract class AbstractC0753Ly {
    /* renamed from: a */
    public static Context m5167a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: b */
    public static File m5168b(Context context) {
        return context.getDataDir();
    }

    /* renamed from: c */
    public static boolean m5169c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
