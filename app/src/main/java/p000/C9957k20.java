package p000;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: k20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9957k20 {

    /* renamed from: e */
    public static final byte[] f36226e = {0, 0, 1};

    /* renamed from: a */
    public int f36227a;

    /* renamed from: b */
    public int f36228b;

    /* renamed from: c */
    public boolean f36229c;

    /* renamed from: d */
    public Serializable f36230d;

    /* renamed from: a */
    public Size m22135a(Y60 y60) {
        int iMo7429n0 = y60.mo7429n0(0);
        Size sizeMo7424S = y60.mo7424S();
        if (sizeMo7424S == null) {
            return sizeMo7424S;
        }
        int iM19038b = AbstractC9754iR1.m19038b(AbstractC9754iR1.m19040d(iMo7429n0), this.f36227a, 1 == this.f36228b);
        return (iM19038b == 90 || iM19038b == 270) ? new Size(sizeMo7424S.getHeight(), sizeMo7424S.getWidth()) : sizeMo7424S;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    /* renamed from: b */
    public void m22136b(byte[] bArr, int i, int i2) {
        if (this.f36229c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f36230d;
            int length = bArr2.length;
            int i4 = this.f36227a + i3;
            if (length < i4) {
                this.f36230d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f36230d, this.f36227a, i3);
            this.f36227a += i3;
        }
    }
}
