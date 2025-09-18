package defpackage;

import android.hardware.biometrics.BiometricManager;

/* renamed from: Hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0587Hh {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
