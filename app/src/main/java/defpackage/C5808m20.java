package defpackage;

import java.util.Arrays;

/* renamed from: m20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5808m20 {
    public static final byte[] f = {0, 0, 1};
    public int a = -1;
    public boolean b = false;
    public Object e = null;
    public int c = -1;
    public int d = -1;

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.c, i3);
            this.c += i3;
        }
    }
}
