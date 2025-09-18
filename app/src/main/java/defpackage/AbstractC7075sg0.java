package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: sg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7075sg0 {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
