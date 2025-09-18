package p000;

import java.io.OutputStream;

/* renamed from: si0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11067si0 extends OutputStream {

    /* renamed from: a */
    public final /* synthetic */ int f42554a;

    /* renamed from: b */
    public long f42555b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f42554a) {
            case 0:
                this.f42555b++;
                break;
            case 1:
                this.f42555b++;
                break;
            default:
                this.f42555b++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f42554a) {
            case 0:
                this.f42555b += bArr.length;
                break;
            case 1:
                this.f42555b += bArr.length;
                break;
            default:
                this.f42555b += bArr.length;
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
        switch (this.f42554a) {
            case 0:
                if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
                    this.f42555b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i4 = i + i2) <= length && i4 >= 0) {
                    this.f42555b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i >= 0 && i <= (length2 = bArr.length) && i2 >= 0 && (i5 = i + i2) <= length2 && i5 >= 0) {
                    this.f42555b += i2;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
