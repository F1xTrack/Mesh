package p000;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* renamed from: zO */
/* loaded from: classes2.dex */
public abstract class AbstractC7261zO {

    /* renamed from: a */
    public static boolean f46812a = true;

    /* renamed from: a */
    public static SecureRandom m26396a() {
        SecureRandom instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused) {
                return instanceStrong;
            } catch (Throwable th) {
                if (f46812a) {
                    th.getMessage();
                    f46812a = false;
                }
                return instanceStrong;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        instanceStrong.nextBytes(bArr);
        return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    /* renamed from: b */
    public static byte[] m26397b(int i) {
        SecureRandom secureRandomM26396a = m26396a();
        if (secureRandomM26396a == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        secureRandomM26396a.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: c */
    public static String m26398c(int i) {
        return L12.m4863a(m26397b(i));
    }
}
