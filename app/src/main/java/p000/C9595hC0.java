package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: hC0 */
/* loaded from: classes.dex */
public final class C9595hC0 extends InputStream {

    /* renamed from: a */
    public final InputStream f28308a;

    /* renamed from: b */
    public final byte[] f28309b;

    /* renamed from: c */
    public final InterfaceC11673xS0 f28310c;

    /* renamed from: d */
    public int f28311d;

    /* renamed from: e */
    public int f28312e;

    /* renamed from: f */
    public boolean f28313f;

    public C9595hC0(InputStream inputStream, byte[] bArr, InterfaceC11673xS0 interfaceC11673xS0) {
        inputStream.getClass();
        this.f28308a = inputStream;
        bArr.getClass();
        this.f28309b = bArr;
        interfaceC11673xS0.getClass();
        this.f28310c = interfaceC11673xS0;
        this.f28311d = 0;
        this.f28312e = 0;
        this.f28313f = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ML1.m5338e(this.f28312e <= this.f28311d);
        m18784m();
        return this.f28308a.available() + (this.f28311d - this.f28312e);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f28313f) {
            return;
        }
        this.f28313f = true;
        this.f28310c.mo2828d(this.f28309b);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f28313f) {
            AbstractC3929dS.m17672e("PooledByteInputStream");
            close();
        }
        super.finalize();
    }

    /* renamed from: m */
    public final void m18784m() throws IOException {
        if (this.f28313f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ML1.m5338e(this.f28312e <= this.f28311d);
        m18784m();
        int i = this.f28312e;
        int i2 = this.f28311d;
        byte[] bArr = this.f28309b;
        if (i >= i2) {
            int i3 = this.f28308a.read(bArr);
            if (i3 <= 0) {
                return -1;
            }
            this.f28311d = i3;
            this.f28312e = 0;
        }
        int i4 = this.f28312e;
        this.f28312e = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        ML1.m5338e(this.f28312e <= this.f28311d);
        m18784m();
        int i = this.f28311d;
        int i2 = this.f28312e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f28312e = (int) (i2 + j);
            return j;
        }
        this.f28312e = i;
        return this.f28308a.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        ML1.m5338e(this.f28312e <= this.f28311d);
        m18784m();
        int i3 = this.f28312e;
        int i4 = this.f28311d;
        byte[] bArr2 = this.f28309b;
        if (i3 >= i4) {
            int i5 = this.f28308a.read(bArr2);
            if (i5 <= 0) {
                return -1;
            }
            this.f28311d = i5;
            this.f28312e = 0;
        }
        int iMin = Math.min(this.f28311d - this.f28312e, i2);
        System.arraycopy(bArr2, this.f28312e, bArr, i, iMin);
        this.f28312e += iMin;
        return iMin;
    }
}
