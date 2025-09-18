package defpackage;

/* loaded from: classes.dex */
public abstract class WB1 {
    public static final C8139yG a = new C8139yG("NO_VALUE");

    public static final void a(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static void b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
