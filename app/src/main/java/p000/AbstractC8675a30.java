package p000;

/* renamed from: a30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8675a30 {

    /* renamed from: a */
    public static final char[] f15297a;

    static {
        int i = AbstractC7101wr.f45141a;
        f15297a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* renamed from: a */
    public static char[] m9668a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f15297a;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }
}
