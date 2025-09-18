package defpackage;

import java.io.OutputStream;

/* renamed from: si0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7081si0 extends OutputStream {
    public final /* synthetic */ int a;
    public long b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.a) {
            case 0:
                this.b++;
                break;
            case 1:
                this.b++;
                break;
            default:
                this.b++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.b += bArr.length;
                break;
            case 1:
                this.b += bArr.length;
                break;
            default:
                this.b += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        int length2;
        int i5;
        switch (this.a) {
            case 0:
                if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
                    this.b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i4 = i + i2) <= length && i4 >= 0) {
                    this.b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i >= 0 && i <= (length2 = bArr.length) && i2 >= 0 && (i5 = i + i2) <= length2 && i5 >= 0) {
                    this.b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
