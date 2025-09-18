package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: iC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4300iC0 extends InputStream {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final Closeable d;

    public C4300iC0(C7487uq0 c7487uq0) {
        if (c7487uq0.isClosed()) {
            throw new IllegalArgumentException();
        }
        this.d = c7487uq0;
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.a) {
            case 0:
                return ((C7487uq0) this.d).p() - this.b;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        switch (this.a) {
            case 0:
                this.c = this.b;
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        switch (this.a) {
            case 0:
                this.b = this.c;
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 0:
                ML1.a(Boolean.valueOf(j >= 0));
                int iMin = Math.min((int) j, available());
                this.b += iMin;
                return iMin;
            default:
                return super.skip(j);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                    throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
                }
                int iAvailable = available();
                if (iAvailable <= 0) {
                    return -1;
                }
                if (i2 <= 0) {
                    return 0;
                }
                int iMin = Math.min(iAvailable, i2);
                ((C7487uq0) this.d).o(this.b, bArr, i, iMin);
                this.b += iMin;
                return iMin;
            default:
                if (bArr == null) {
                    throw new NullPointerException("buffer");
                }
                if ((i | i2) < 0 || i2 > bArr.length - i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = this.c;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                int i4 = this.b;
                C8330zG0 c8330zG0 = (C8330zG0) this.d;
                c8330zG0.D(i4, bArr, i, i2);
                this.b = c8330zG0.U(this.b + i2);
                this.c -= i2;
                return i2;
        }
    }

    public C4300iC0(C8330zG0 c8330zG0, C7950xG0 c7950xG0) {
        this.d = c8330zG0;
        this.b = c8330zG0.U(c7950xG0.b + 4);
        this.c = c7950xG0.c;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                if (available() <= 0) {
                    return -1;
                }
                int i = this.b;
                this.b = i + 1;
                return ((C7487uq0) this.d).n(i) & 255;
            default:
                if (this.c == 0) {
                    return -1;
                }
                C8330zG0 c8330zG0 = (C8330zG0) this.d;
                c8330zG0.a.seek(this.b);
                int i2 = c8330zG0.a.read();
                this.b = c8330zG0.U(this.b + 1);
                this.c--;
                return i2;
        }
    }
}
