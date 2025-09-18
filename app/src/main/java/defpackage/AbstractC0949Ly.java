package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: Ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0949Ly {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
