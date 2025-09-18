package defpackage;

/* renamed from: a30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2061a30 {
    public static final char[] a;

    static {
        int i = AbstractC7870wr.a;
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static char[] a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }
}
