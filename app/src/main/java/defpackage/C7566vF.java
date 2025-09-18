package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: vF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7566vF implements XR {
    public final RC b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        AbstractC6911rp0.a("media3.extractor");
    }

    public C7566vF(RC rc, long j, long j2) {
        this.b = rc;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(int i, boolean z) throws EOFException, InterruptedIOException {
        e(i);
        int iH = this.g - this.f;
        while (iH < i) {
            iH = h(this.e, this.f, i, iH, z);
            if (iH == -1) {
                return false;
            }
            this.g = this.f + iH;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.XR
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            p(iMin);
        }
        int iH = iMin;
        while (iH < i2 && iH != -1) {
            iH = h(bArr, i, i2, iH, z);
        }
        if (iH != -1) {
            this.d += iH;
        }
        return iH != -1;
    }

    public final void e(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, AbstractC0277Dh1.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.XR
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final int g(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        e(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = h(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // defpackage.XR
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.XR
    public final long getPosition() {
        return this.d;
    }

    public final int h(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iR = this.b.r(bArr, i + i3, i2 - i3);
        if (iR != -1) {
            return i3 + iR;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int i(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            iMin = h(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.d += iMin;
        }
        return iMin;
    }

    @Override // defpackage.XR
    public final long j() {
        return this.d + this.f;
    }

    @Override // defpackage.XR
    public final void k(int i) throws EOFException, InterruptedIOException {
        a(i, false);
    }

    @Override // defpackage.XR
    public final void m() {
        this.f = 0;
    }

    @Override // defpackage.XR
    public final void n(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        p(iMin);
        int iH = iMin;
        while (iH < i && iH != -1) {
            byte[] bArr = this.a;
            iH = h(bArr, -iH, Math.min(i, bArr.length + iH), iH, false);
        }
        if (iH != -1) {
            this.d += iH;
        }
    }

    public final void p(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.XR
    public final void q(byte[] bArr, int i, int i2) {
        f(bArr, i, i2, false);
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.g;
        int iH = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            p(iMin);
            iH = iMin;
        }
        if (iH == 0) {
            iH = h(bArr, i, i2, 0, true);
        }
        if (iH != -1) {
            this.d += iH;
        }
        return iH;
    }

    @Override // defpackage.XR
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        b(bArr, i, i2, false);
    }
}
