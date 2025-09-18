package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ed1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3618ed1 extends AbstractC1360Rf {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.AbstractC1360Rf
    public final C6675qa a(C6675qa c6675qa) throws C6865ra {
        if (c6675qa.c != 2) {
            throw new C6865ra(c6675qa);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? C6675qa.e : c6675qa;
    }

    @Override // defpackage.AbstractC1360Rf
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.AbstractC1360Rf
    public final void c() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.AbstractC1360Rf, defpackage.InterfaceC7056sa
    public final ByteBuffer e() {
        int i;
        if (super.i() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.e();
    }

    @Override // defpackage.InterfaceC7056sa
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferK = k(length);
        int iJ = AbstractC0277Dh1.j(length, 0, this.n);
        byteBufferK.put(this.m, 0, iJ);
        int iJ2 = AbstractC0277Dh1.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferK.flip();
    }

    @Override // defpackage.AbstractC1360Rf, defpackage.InterfaceC7056sa
    public final boolean i() {
        return super.i() && this.n == 0;
    }

    @Override // defpackage.AbstractC1360Rf
    public final void j() {
        this.m = AbstractC0277Dh1.f;
    }
}
