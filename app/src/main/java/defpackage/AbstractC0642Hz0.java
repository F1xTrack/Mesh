package defpackage;

import android.content.pm.PackageManager;

/* renamed from: Hz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0642Hz0 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
