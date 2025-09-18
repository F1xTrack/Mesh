package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: oO0 */
/* loaded from: classes.dex */
public final class C10515oO0 extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f38984a;

    /* renamed from: b */
    public int f38985b;

    /* renamed from: c */
    public int f38986c;

    /* renamed from: d */
    public int f38987d;

    /* renamed from: e */
    public int f38988e;

    /* renamed from: f */
    public final C11967zm0 f38989f;

    public C10515oO0(InputStream inputStream, C11967zm0 c11967zm0) {
        super(inputStream);
        this.f38987d = -1;
        this.f38989f = c11967zm0;
        this.f38984a = (byte[]) c11967zm0.m26542d(65536, byte[].class);
    }

    /* renamed from: m */
    public static void m23374m() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m23375a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f38987d;
        if (i != -1) {
            int i2 = this.f38988e - i;
            int i3 = this.f38986c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f38985b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f38989f.m26542d(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f38984a = bArr2;
                    this.f38989f.m26546h(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f38988e - this.f38987d;
                this.f38988e = i4;
                this.f38987d = 0;
                this.f38985b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f38988e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f38985b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f38987d = -1;
            this.f38988e = 0;
            this.f38985b = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f38984a == null || inputStream == null) {
            m23374m();
            throw null;
        }
        return (this.f38985b - this.f38988e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38984a != null) {
            this.f38989f.m26546h(this.f38984a);
            this.f38984a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f38986c = Math.max(this.f38986c, i);
        this.f38987d = this.f38988e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f38984a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m23374m();
            throw null;
        }
        if (this.f38988e >= this.f38985b && m23375a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f38984a && (bArr = this.f38984a) == null) {
            m23374m();
            throw null;
        }
        int i = this.f38985b;
        int i2 = this.f38988e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f38988e = i2 + 1;
        return bArr[i2] & 255;
    }

    public final synchronized void release() {
        if (this.f38984a != null) {
            this.f38989f.m26546h(this.f38984a);
            this.f38984a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f38984a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f38987d;
        if (-1 == i) {
            throw new C6583ou("Mark has been invalidated, pos: " + this.f38988e + " markLimit: " + this.f38986c);
        }
        this.f38988e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f38984a;
        if (bArr == null) {
            m23374m();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m23374m();
            throw null;
        }
        int i = this.f38985b;
        int i2 = this.f38988e;
        if (i - i2 >= j) {
            this.f38988e = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f38988e = i;
        if (this.f38987d == -1 || j > this.f38986c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f38987d = -1;
            }
            return j2 + jSkip;
        }
        if (m23375a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f38985b;
        int i4 = this.f38988e;
        if (i3 - i4 >= j - j2) {
            this.f38988e = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.f38988e = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f38984a;
        if (bArr2 == null) {
            m23374m();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f38988e;
            int i6 = this.f38985b;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f38988e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f38987d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m23375a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f38984a && (bArr2 = this.f38984a) == null) {
                        m23374m();
                        throw null;
                    }
                    int i8 = this.f38985b;
                    int i9 = this.f38988e;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f38988e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            m23374m();
            throw null;
        }
    }
}
