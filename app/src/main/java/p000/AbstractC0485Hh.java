package p000;

import android.hardware.biometrics.BiometricManager;

/* renamed from: Hh */
/* loaded from: classes.dex */
public abstract class AbstractC0485Hh {
    /* renamed from: a */
    public static int m3549a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
