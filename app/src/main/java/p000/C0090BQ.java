package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: BQ */
/* loaded from: classes.dex */
public final class C0090BQ extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f801c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d */
    public static final int f802d = 31;

    /* renamed from: a */
    public final byte f803a;

    /* renamed from: b */
    public int f804b;

    public C0090BQ(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Cannot add invalid orientation: "));
        }
        this.f803a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i2 = this.f804b;
        int i3 = (i2 < 2 || i2 > (i = f802d)) ? super.read() : i2 == i ? this.f803a : f801c[i2 - 2] & 255;
        if (i3 != -1) {
            this.f804b++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f804b = (int) (this.f804b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f804b;
        int i5 = f802d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f803a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f801c, this.f804b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f804b += i3;
        }
        return i3;
    }
}
