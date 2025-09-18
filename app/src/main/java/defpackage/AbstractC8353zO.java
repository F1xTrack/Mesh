package defpackage;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* renamed from: zO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8353zO {
    public static boolean a = true;

    public static SecureRandom a() {
        SecureRandom instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused) {
                return instanceStrong;
            } catch (Throwable th) {
                if (a) {
                    th.getMessage();
                    a = false;
                }
                return instanceStrong;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        instanceStrong.nextBytes(bArr);
        return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    public static byte[] b(int i) {
        SecureRandom secureRandomA = a();
        if (secureRandomA == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        secureRandomA.nextBytes(bArr);
        return bArr;
    }

    public static String c(int i) {
        return L12.a(b(i));
    }
}
