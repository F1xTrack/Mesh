package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: vF */
/* loaded from: classes.dex */
public final class C7000vF implements InterfaceC1475XR {

    /* renamed from: b */
    public final InterfaceC1082RC f44293b;

    /* renamed from: c */
    public final long f44294c;

    /* renamed from: d */
    public long f44295d;

    /* renamed from: f */
    public int f44297f;

    /* renamed from: g */
    public int f44298g;

    /* renamed from: e */
    public byte[] f44296e = new byte[65536];

    /* renamed from: a */
    public final byte[] f44292a = new byte[4096];

    static {
        AbstractC10953rp0.m24489a("media3.extractor");
    }

    public C7000vF(InterfaceC1082RC interfaceC1082RC, long j, long j2) {
        this.f44293b = interfaceC1082RC;
        this.f44295d = j;
        this.f44294c = j2;
    }

    /* renamed from: a */
    public final boolean m25375a(int i, boolean z) throws EOFException, InterruptedIOException {
        m25376e(i);
        int iM25378h = this.f44298g - this.f44297f;
        while (iM25378h < i) {
            iM25378h = m25378h(this.f44296e, this.f44297f, i, iM25378h, z);
            if (iM25378h == -1) {
                return false;
            }
            this.f44298g = this.f44297f + iM25378h;
        }
        this.f44297f += i;
        return true;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: b */
    public final boolean mo3618b(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f44298g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f44296e, 0, bArr, i, iMin);
            m25380p(iMin);
        }
        int iM25378h = iMin;
        while (iM25378h < i2 && iM25378h != -1) {
            iM25378h = m25378h(bArr, i, i2, iM25378h, z);
        }
        if (iM25378h != -1) {
            this.f44295d += iM25378h;
        }
        return iM25378h != -1;
    }

    /* renamed from: e */
    public final void m25376e(int i) {
        int i2 = this.f44297f + i;
        byte[] bArr = this.f44296e;
        if (i2 > bArr.length) {
            this.f44296e = Arrays.copyOf(this.f44296e, AbstractC7485Dh1.m1825j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: f */
    public final boolean mo3620f(byte[] bArr, int i, int i2, boolean z) {
        if (!m25375a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f44296e, this.f44297f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: g */
    public final int m25377g(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        m25376e(i2);
        int i3 = this.f44298g;
        int i4 = this.f44297f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m25378h(this.f44296e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f44298g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f44296e, this.f44297f, bArr, i, iMin);
        this.f44297f += iMin;
        return iMin;
    }

    @Override // p000.InterfaceC1475XR
    public final long getLength() {
        return this.f44294c;
    }

    @Override // p000.InterfaceC1475XR
    public final long getPosition() {
        return this.f44295d;
    }

    /* renamed from: h */
    public final int m25378h(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo2367r = this.f44293b.mo2367r(bArr, i + i3, i2 - i3);
        if (iMo2367r != -1) {
            return i3 + iMo2367r;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: i */
    public final int m25379i(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f44298g, i);
        m25380p(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f44292a;
            iMin = m25378h(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f44295d += iMin;
        }
        return iMin;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: j */
    public final long mo3624j() {
        return this.f44295d + this.f44297f;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: k */
    public final void mo3625k(int i) throws EOFException, InterruptedIOException {
        m25375a(i, false);
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: m */
    public final void mo3626m() {
        this.f44297f = 0;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: n */
    public final void mo3627n(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f44298g, i);
        m25380p(iMin);
        int iM25378h = iMin;
        while (iM25378h < i && iM25378h != -1) {
            byte[] bArr = this.f44292a;
            iM25378h = m25378h(bArr, -iM25378h, Math.min(i, bArr.length + iM25378h), iM25378h, false);
        }
        if (iM25378h != -1) {
            this.f44295d += iM25378h;
        }
    }

    /* renamed from: p */
    public final void m25380p(int i) {
        int i2 = this.f44298g - i;
        this.f44298g = i2;
        this.f44297f = 0;
        byte[] bArr = this.f44296e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f44296e = bArr2;
    }

    @Override // p000.InterfaceC1475XR
    /* renamed from: q */
    public final void mo3628q(byte[] bArr, int i, int i2) {
        mo3620f(bArr, i, i2, false);
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f44298g;
        int iM25378h = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f44296e, 0, bArr, i, iMin);
            m25380p(iMin);
            iM25378h = iMin;
        }
        if (iM25378h == 0) {
            iM25378h = m25378h(bArr, i, i2, 0, true);
        }
        if (iM25378h != -1) {
            this.f44295d += iM25378h;
        }
        return iM25378h;
    }

    @Override // p000.InterfaceC1475XR
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo3618b(bArr, i, i2, false);
    }
}
