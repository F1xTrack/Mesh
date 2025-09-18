package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: t81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7165t81 extends FilterInputStream {
    public final byte[] a;
    public int b;
    public int c;

    public C7165t81(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.a = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.c = this.b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            return i;
        }
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.b = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i5 < i2) {
            int i6 = this.b;
            byte[] bArr2 = this.a;
            if (i6 >= bArr2.length) {
                i3 = -1;
            } else {
                this.b = i6 + 1;
                i3 = bArr2[i6] & 255;
            }
            if (i3 == -1) {
                break;
            }
            bArr[i + i5] = (byte) i3;
            i5++;
        }
        if (i5 > 0) {
            return i5;
        }
        return -1;
    }
}
