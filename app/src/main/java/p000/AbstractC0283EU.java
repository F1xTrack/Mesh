package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: EU */
/* loaded from: classes.dex */
public abstract class AbstractC0283EU {
    /* renamed from: a */
    public static void m2307a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
    }

    /* renamed from: b */
    public static FingerprintManager.CryptoObject m2308b(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    /* renamed from: c */
    public static FingerprintManager m2309c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    /* renamed from: d */
    public static boolean m2310d(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    /* renamed from: e */
    public static boolean m2311e(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    /* renamed from: f */
    public static C0346FU m2312f(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C0346FU(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C0346FU(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new C0346FU(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: g */
    public static FingerprintManager.CryptoObject m2313g(C0346FU c0346fu) {
        if (c0346fu == null) {
            return null;
        }
        Cipher cipher = c0346fu.f3275b;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        Signature signature = c0346fu.f3274a;
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        Mac mac = c0346fu.f3276c;
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
