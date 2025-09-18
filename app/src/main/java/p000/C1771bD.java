package p000;

import java.io.InputStream;

/* renamed from: bD */
/* loaded from: classes.dex */
public final class C1771bD extends InputStream {

    /* renamed from: a */
    public final InterfaceC1586ZC f16862a;

    /* renamed from: b */
    public final C3976eD f16863b;

    /* renamed from: d */
    public boolean f16865d = false;

    /* renamed from: e */
    public boolean f16866e = false;

    /* renamed from: c */
    public final byte[] f16864c = new byte[1];

    public C1771bD(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD) {
        this.f16862a = interfaceC1586ZC;
        this.f16863b = c3976eD;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16866e) {
            return;
        }
        this.f16862a.close();
        this.f16866e = true;
    }

    /* renamed from: m */
    public final void m10434m() {
        if (this.f16865d) {
            return;
        }
        this.f16862a.mo2365c(this.f16863b);
        this.f16865d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f16864c;
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
        YN1.m9281f(!this.f16866e);
        m10434m();
        int iMo2367r = this.f16862a.mo2367r(bArr, i, i2);
        if (iMo2367r == -1) {
            return -1;
        }
        return iMo2367r;
    }
}
