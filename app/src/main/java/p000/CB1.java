package p000;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class CB1 {

    /* renamed from: a */
    public static final String[] f1242a = {"SHA-256", "SHA-384", "SHA-512"};

    /* renamed from: a */
    public static final C0055As m1001a(InterfaceC8392Ut0 interfaceC8392Ut0, int i) {
        O90.m5968f(interfaceC8392Ut0, "<this>");
        return C0055As.m357e(interfaceC8392Ut0.mo5440c(i), interfaceC8392Ut0.mo5446k(i));
    }

    /* renamed from: b */
    public static final C8340Tt0 m1002b(InterfaceC8392Ut0 interfaceC8392Ut0, int i) {
        O90.m5968f(interfaceC8392Ut0, "<this>");
        return C8340Tt0.m7797d(interfaceC8392Ut0.getString(i));
    }

    /* renamed from: c */
    public static String m1003c(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            return "";
        }
        String[] strArr = f1242a;
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
                return L12.m4863a(bArrDigest);
            }
        }
        return "";
    }
}
