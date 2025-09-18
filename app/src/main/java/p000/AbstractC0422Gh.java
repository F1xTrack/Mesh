package p000;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: Gh */
/* loaded from: classes.dex */
public abstract class AbstractC0422Gh {
    /* renamed from: a */
    public static int m3121a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* renamed from: b */
    public static BiometricManager m3122b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    /* renamed from: c */
    public static Method m3123c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
