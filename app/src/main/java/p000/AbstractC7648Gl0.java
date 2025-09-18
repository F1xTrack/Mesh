package p000;

import java.util.Arrays;

/* renamed from: Gl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7648Gl0 {

    /* renamed from: a */
    public static final byte[] f3873a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f3873a = bArr;
    }
}
