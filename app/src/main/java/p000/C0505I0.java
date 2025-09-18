package p000;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: I0 */
/* loaded from: classes2.dex */
public final class C0505I0 extends FilterInputStream {

    /* renamed from: a */
    public final /* synthetic */ int f4633a = 1;

    /* renamed from: b */
    public int f4634b;

    public C0505I0(C1284UP c1284up) {
        super(c1284up);
        this.f4634b = Integer.MIN_VALUE;
    }

    /* renamed from: c */
    private final synchronized void m3675c(int i) {
        super.mark(i);
        this.f4634b = i;
    }

    /* renamed from: m */
    private final synchronized void m3676m() {
        super.reset();
        this.f4634b = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public long m3677a(long j) {
        int i = this.f4634b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f4633a) {
            case 0:
                return Math.min(super.available(), this.f4634b);
            default:
                int i = this.f4634b;
                return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f4633a) {
            case 1:
                m3675c(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    /* renamed from: n */
    public void m3678n(long j) {
        int i = this.f4634b;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f4634b = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f4633a) {
            case 0:
                if (this.f4634b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i < 0) {
                    return i;
                }
                this.f4634b--;
                return i;
            default:
                if (m3677a(1L) == -1) {
                    return -1;
                }
                int i2 = super.read();
                m3678n(1L);
                return i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f4633a) {
            case 1:
                m3676m();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.f4633a) {
            case 0:
                long jSkip = super.skip(Math.min(j, this.f4634b));
                if (jSkip >= 0) {
                    this.f4634b = (int) (this.f4634b - jSkip);
                }
                return jSkip;
            default:
                long jM3677a = m3677a(j);
                if (jM3677a == -1) {
                    return 0L;
                }
                long jSkip2 = super.skip(jM3677a);
                m3678n(jSkip2);
                return jSkip2;
        }
    }

    public C0505I0(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.f4634b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f4633a) {
            case 0:
                int i3 = this.f4634b;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 < 0) {
                    return i4;
                }
                this.f4634b -= i4;
                return i4;
            default:
                int iM3677a = (int) m3677a(i2);
                if (iM3677a == -1) {
                    return -1;
                }
                int i5 = super.read(bArr, i, iM3677a);
                m3678n(i5);
                return i5;
        }
    }
}
