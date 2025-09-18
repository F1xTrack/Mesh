package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: Wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1735Wa {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
