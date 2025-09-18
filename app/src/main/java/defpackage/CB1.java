package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class CB1 {
    public static final String[] a = {"SHA-256", "SHA-384", "SHA-512"};

    public static final C0074As a(InterfaceC1637Ut0 interfaceC1637Ut0, int i) {
        O90.f(interfaceC1637Ut0, "<this>");
        return C0074As.e(interfaceC1637Ut0.c(i), interfaceC1637Ut0.k(i));
    }

    public static final C1559Tt0 b(InterfaceC1637Ut0 interfaceC1637Ut0, int i) {
        O90.f(interfaceC1637Ut0, "<this>");
        return C1559Tt0.d(interfaceC1637Ut0.getString(i));
    }

    public static String c(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            return "";
        }
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals("SHA-256")) {
                try {
                    bytes = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    bytes = new byte[0];
                }
                if (bytes == null || TextUtils.isEmpty("SHA-256")) {
                    bArrDigest = new byte[0];
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 3) {
                            bArrDigest = new byte[0];
                            break;
                        }
                        if (strArr[i2].equals("SHA-256")) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(bytes);
                                bArrDigest = messageDigest.digest();
                                break;
                            } catch (NoSuchAlgorithmException unused2) {
                                bArrDigest = new byte[0];
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                return L12.a(bArrDigest);
            }
        }
        return "";
    }
}
