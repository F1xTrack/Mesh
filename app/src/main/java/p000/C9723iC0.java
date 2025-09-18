package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: iC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9723iC0 extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f28891a = 0;

    /* renamed from: b */
    public int f28892b;

    /* renamed from: c */
    public int f28893c;

    /* renamed from: d */
    public final Closeable f28894d;

    public C9723iC0(C11339uq0 c11339uq0) {
        if (c11339uq0.isClosed()) {
            throw new IllegalArgumentException();
        }
        this.f28894d = c11339uq0;
        this.f28892b = 0;
        this.f28893c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.f28891a) {
            case 0:
                return ((C11339uq0) this.f28894d).m25253p() - this.f28892b;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        switch (this.f28891a) {
            case 0:
                this.f28893c = this.f28892b;
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f28891a) {
            case 0:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.f28891a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        switch (this.f28891a) {
            case 0:
                this.f28892b = this.f28893c;
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f28891a) {
            case 0:
                ML1.m5334a(Boolean.valueOf(j >= 0));
                int iMin = Math.min((int) j, available());
                this.f28892b += iMin;
                return iMin;
            default:
                return super.skip(j);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f28891a) {
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
                ((C11339uq0) this.f28894d).m25252o(this.f28892b, bArr, i, iMin);
                this.f28892b += iMin;
                return iMin;
            default:
                if (bArr == null) {
                    throw new NullPointerException("buffer");
                }
                if ((i | i2) < 0 || i2 > bArr.length - i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = this.f28893c;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                int i4 = this.f28892b;
                C11903zG0 c11903zG0 = (C11903zG0) this.f28894d;
                c11903zG0.m26357D(i4, bArr, i, i2);
                this.f28892b = c11903zG0.m26360U(this.f28892b + i2);
                this.f28893c -= i2;
                return i2;
        }
    }

    public C9723iC0(C11903zG0 c11903zG0, C11649xG0 c11649xG0) {
        this.f28894d = c11903zG0;
        this.f28892b = c11903zG0.m26360U(c11649xG0.f45508b + 4);
        this.f28893c = c11649xG0.f45509c;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f28891a) {
            case 0:
                if (available() <= 0) {
                    return -1;
                }
                int i = this.f28892b;
                this.f28892b = i + 1;
                return ((C11339uq0) this.f28894d).m25251n(i) & 255;
            default:
                if (this.f28893c == 0) {
                    return -1;
                }
                C11903zG0 c11903zG0 = (C11903zG0) this.f28894d;
                c11903zG0.f46767a.seek(this.f28892b);
                int i2 = c11903zG0.f46767a.read();
                this.f28892b = c11903zG0.m26360U(this.f28892b + 1);
                this.f28893c--;
                return i2;
        }
    }
}
