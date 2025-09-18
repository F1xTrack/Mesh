package p000;

/* loaded from: classes.dex */
public abstract class WB1 {

    /* renamed from: a */
    public static final C7190yG f13057a = new C7190yG("NO_VALUE");

    /* renamed from: a */
    public static final void m8706a(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* renamed from: b */
    public static void m8707b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
