package p000;

import java.nio.ByteBuffer;

/* renamed from: ed1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9266ed1 extends AbstractC1111Rf {

    /* renamed from: i */
    public int f26784i;

    /* renamed from: j */
    public int f26785j;

    /* renamed from: k */
    public boolean f26786k;

    /* renamed from: l */
    public int f26787l;

    /* renamed from: m */
    public byte[] f26788m;

    /* renamed from: n */
    public int f26789n;

    /* renamed from: o */
    public long f26790o;

    @Override // p000.AbstractC1111Rf
    /* renamed from: a */
    public final C6689qa mo3679a(C6689qa c6689qa) throws C6752ra {
        if (c6689qa.f41028c != 2) {
            throw new C6752ra(c6689qa);
        }
        this.f26786k = true;
        return (this.f26784i == 0 && this.f26785j == 0) ? C6689qa.f41025e : c6689qa;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: b */
    public final void mo3680b() {
        if (this.f26786k) {
            this.f26786k = false;
            int i = this.f26785j;
            int i2 = this.f10362b.f41029d;
            this.f26788m = new byte[i * i2];
            this.f26787l = this.f26784i * i2;
        }
        this.f26789n = 0;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: c */
    public final void mo3681c() {
        if (this.f26786k) {
            if (this.f26789n > 0) {
                this.f26790o += r0 / this.f10362b.f41029d;
            }
            this.f26789n = 0;
        }
    }

    @Override // p000.AbstractC1111Rf, p000.InterfaceC6832sa
    /* renamed from: e */
    public final ByteBuffer mo7055e() {
        int i;
        if (super.mo7058i() && (i = this.f26789n) > 0) {
            m7059k(i).put(this.f26788m, 0, this.f26789n).flip();
            this.f26789n = 0;
        }
        return super.mo7055e();
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: f */
    public final void mo3682f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f26787l);
        this.f26790o += iMin / this.f10362b.f41029d;
        this.f26787l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f26787l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f26789n + i2) - this.f26788m.length;
        ByteBuffer byteBufferM7059k = m7059k(length);
        int iM1825j = AbstractC7485Dh1.m1825j(length, 0, this.f26789n);
        byteBufferM7059k.put(this.f26788m, 0, iM1825j);
        int iM1825j2 = AbstractC7485Dh1.m1825j(length - iM1825j, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM1825j2);
        byteBufferM7059k.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM1825j2;
        int i4 = this.f26789n - iM1825j;
        this.f26789n = i4;
        byte[] bArr = this.f26788m;
        System.arraycopy(bArr, iM1825j, bArr, 0, i4);
        byteBuffer.get(this.f26788m, this.f26789n, i3);
        this.f26789n += i3;
        byteBufferM7059k.flip();
    }

    @Override // p000.AbstractC1111Rf, p000.InterfaceC6832sa
    /* renamed from: i */
    public final boolean mo7058i() {
        return super.mo7058i() && this.f26789n == 0;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: j */
    public final void mo3683j() {
        this.f26788m = AbstractC7485Dh1.f2171f;
    }
}
