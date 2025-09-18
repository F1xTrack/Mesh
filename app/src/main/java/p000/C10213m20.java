package p000;

import java.util.Arrays;

/* renamed from: m20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10213m20 {

    /* renamed from: f */
    public static final byte[] f37419f = {0, 0, 1};

    /* renamed from: a */
    public int f37420a = -1;

    /* renamed from: b */
    public boolean f37421b = false;

    /* renamed from: e */
    public Object f37424e = null;

    /* renamed from: c */
    public int f37422c = -1;

    /* renamed from: d */
    public int f37423d = -1;

    /* renamed from: a */
    public void m22635a(byte[] bArr, int i, int i2) {
        if (this.f37421b) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f37424e;
            int length = bArr2.length;
            int i4 = this.f37422c + i3;
            if (length < i4) {
                this.f37424e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f37424e, this.f37422c, i3);
            this.f37422c += i3;
        }
    }
}
