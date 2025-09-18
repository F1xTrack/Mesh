package p000;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: sg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11063sg0 {
    /* renamed from: a */
    public static KeyguardManager m24763a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* renamed from: b */
    public static boolean m24764b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
