package defpackage;

import java.io.InputStream;

/* renamed from: bD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2282bD extends InputStream {
    public final ZC a;
    public final C3538eD b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public C2282bD(ZC zc, C3538eD c3538eD) {
        this.a = zc;
        this.b = c3538eD;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    public final void m() {
        if (this.d) {
            return;
        }
        this.a.c(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        YN1.f(!this.e);
        m();
        int iR = this.a.r(bArr, i, i2);
        if (iR == -1) {
            return -1;
        }
        return iR;
    }
}
