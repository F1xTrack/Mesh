package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

/* renamed from: Ez0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7572Ez0 {
    /* renamed from: a */
    public static Signature[] m2461a(SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    /* renamed from: b */
    public static long m2462b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: c */
    public static Signature[] m2463c(SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }

    /* renamed from: d */
    public static boolean m2464d(SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    /* renamed from: e */
    public static boolean m2465e(PackageManager packageManager, String str, byte[] bArr, int i) {
        return packageManager.hasSigningCertificate(str, bArr, i);
    }
}
