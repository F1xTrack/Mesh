package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: Uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1600Uh {
    public static Context a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static int b(Context context) {
        return context.getDeviceId();
    }

    public static int c(Context context) {
        return context.getDeviceId();
    }

    public static boolean d(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }
}
