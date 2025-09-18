package p000;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: Bh */
/* loaded from: classes.dex */
public abstract class AbstractC0107Bh {
    /* renamed from: a */
    public static void m800a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    /* renamed from: b */
    public static void m801b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
