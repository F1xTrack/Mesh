package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class I0 extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public int b;

    public I0(UP up) {
        super(up);
        this.b = Integer.MIN_VALUE;
    }

    private final synchronized void c(int i) {
        super.mark(i);
        this.b = i;
    }

    private final synchronized void m() {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    public long a(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return Math.min(super.available(), this.b);
            default:
                int i = this.b;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 1:
                c(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    public void n(long j) {
        int i = this.b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.b = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i < 0) {
                    return i;
                }
                this.b--;
                return i;
            default:
                if (a(1L) == -1) {
                    return -1;
                }
                int i2 = super.read();
                n(1L);
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.a) {
            case 1:
                m();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.a) {
            case 0:
                long jSkip = super.skip(Math.min(j, this.b));
                if (jSkip >= 0) {
                    this.b = (int) (this.b - jSkip);
                }
                return jSkip;
            default:
                long jA = a(j);
                if (jA == -1) {
                    return 0L;
                }
                long jSkip2 = super.skip(jA);
                n(jSkip2);
                return jSkip2;
        }
    }

    public I0(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 < 0) {
                    return i4;
                }
                this.b -= i4;
                return i4;
            default:
                int iA = (int) a(i2);
                if (iA == -1) {
                    return -1;
                }
                int i5 = super.read(bArr, i, iA);
                n(i5);
                return i5;
        }
    }
}
