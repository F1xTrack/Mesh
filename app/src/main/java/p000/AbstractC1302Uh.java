package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: Uh */
/* loaded from: classes.dex */
public abstract class AbstractC1302Uh {
    /* renamed from: a */
    public static Context m8115a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    /* renamed from: b */
    public static int m8116b(Context context) {
        return context.getDeviceId();
    }

    /* renamed from: c */
    public static int m8117c(Context context) {
        return context.getDeviceId();
    }

    /* renamed from: d */
    public static boolean m8118d(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }
}
