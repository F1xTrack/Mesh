package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: Bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0119Bh {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
