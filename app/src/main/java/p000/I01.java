package p000;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class I01 extends AbstractC1111Rf {

    /* renamed from: n */
    public int f4640n;

    /* renamed from: o */
    public boolean f4641o;

    /* renamed from: p */
    public int f4642p;

    /* renamed from: q */
    public long f4643q;

    /* renamed from: s */
    public byte[] f4645s;

    /* renamed from: v */
    public byte[] f4648v;

    /* renamed from: r */
    public int f4644r = 0;

    /* renamed from: t */
    public int f4646t = 0;

    /* renamed from: u */
    public int f4647u = 0;

    /* renamed from: l */
    public final long f4638l = 100000;

    /* renamed from: i */
    public final float f4635i = 0.2f;

    /* renamed from: m */
    public final long f4639m = 2000000;

    /* renamed from: k */
    public final int f4637k = 10;

    /* renamed from: j */
    public final short f4636j = 1024;

    public I01() {
        byte[] bArr = AbstractC7485Dh1.f2171f;
        this.f4645s = bArr;
        this.f4648v = bArr;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: a */
    public final C6689qa mo3679a(C6689qa c6689qa) throws C6752ra {
        if (c6689qa.f41028c == 2) {
            return c6689qa.f41026a == -1 ? C6689qa.f41025e : c6689qa;
        }
        throw new C6752ra(c6689qa);
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: b */
    public final void mo3680b() {
        if (isActive()) {
            int i = this.f10362b.f41027b * 2;
            this.f4640n = i;
            int i2 = ((((int) ((this.f4638l * r0.f41026a) / 1000000)) / 2) / i) * i * 2;
            if (this.f4645s.length != i2) {
                this.f4645s = new byte[i2];
                this.f4648v = new byte[i2];
            }
        }
        this.f4642p = 0;
        this.f4643q = 0L;
        this.f4644r = 0;
        this.f4646t = 0;
        this.f4647u = 0;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: c */
    public final void mo3681c() {
        if (this.f4647u > 0) {
            m3685m(true);
            this.f4644r = 0;
        }
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: f */
    public final void mo3682f(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f10367g.hasRemaining()) {
            int i = this.f4642p;
            short s = this.f4636j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f4645s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f4640n;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f4642p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m7059k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                YN1.m9281f(this.f4646t < this.f4645s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f4640n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f4646t;
                int i4 = this.f4647u;
                int length2 = length + i4;
                byte[] bArr = this.f4645s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f4645s, length2, iMin);
                int i6 = this.f4647u + iMin;
                this.f4647u = i6;
                YN1.m9281f(i6 <= this.f4645s.length);
                boolean z2 = z && iPosition3 < i5;
                m3685m(z2);
                if (z2) {
                    this.f4642p = 0;
                    this.f4644r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p000.AbstractC1111Rf, p000.InterfaceC6832sa
    public final boolean isActive() {
        return super.isActive() && this.f4641o;
    }

    @Override // p000.AbstractC1111Rf
    /* renamed from: j */
    public final void mo3683j() {
        this.f4641o = false;
        byte[] bArr = AbstractC7485Dh1.f2171f;
        this.f4645s = bArr;
        this.f4648v = bArr;
    }

    /* renamed from: l */
    public final int m3684l(int i) {
        int length = ((((int) ((this.f4639m * this.f10362b.f41026a) / 1000000)) - this.f4644r) * this.f4640n) - (this.f4645s.length / 2);
        YN1.m9281f(length >= 0);
        int iMin = (int) Math.min((i * this.f4635i) + 0.5f, length);
        int i2 = this.f4640n;
        return (iMin / i2) * i2;
    }

    /* renamed from: m */
    public final void m3685m(boolean z) {
        int length;
        int iM3684l;
        int i = this.f4647u;
        byte[] bArr = this.f4645s;
        if (i == bArr.length || z) {
            if (this.f4644r == 0) {
                if (z) {
                    m3686n(i, 3);
                    length = i;
                } else {
                    YN1.m9281f(i >= bArr.length / 2);
                    length = this.f4645s.length / 2;
                    m3686n(length, 0);
                }
                iM3684l = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM3684l2 = m3684l(length2) + (this.f4645s.length / 2);
                m3686n(iM3684l2, 2);
                iM3684l = iM3684l2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM3684l = m3684l(length);
                m3686n(iM3684l, 1);
            }
            YN1.m9282g(length % this.f4640n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            YN1.m9281f(i >= iM3684l);
            this.f4647u -= length;
            int i2 = this.f4646t + length;
            this.f4646t = i2;
            this.f4646t = i2 % this.f4645s.length;
            this.f4644r = (iM3684l / this.f4640n) + this.f4644r;
            this.f4643q += (length - iM3684l) / r2;
        }
    }

    /* renamed from: n */
    public final void m3686n(int i, int i2) {
        if (i == 0) {
            return;
        }
        YN1.m9278c(this.f4647u >= i);
        if (i2 == 2) {
            int i3 = this.f4646t;
            int i4 = this.f4647u;
            int i5 = i3 + i4;
            byte[] bArr = this.f4645s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f4648v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f4648v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f4648v, 0, i6);
                    System.arraycopy(this.f4645s, 0, this.f4648v, i6, length);
                }
            }
        } else {
            int i7 = this.f4646t;
            int i8 = i7 + i;
            byte[] bArr2 = this.f4645s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f4648v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f4648v, 0, length2);
                System.arraycopy(this.f4645s, 0, this.f4648v, length2, i - length2);
            }
        }
        YN1.m9277b("sizeToOutput is not aligned to frame size: " + i, i % this.f4640n == 0);
        YN1.m9281f(this.f4646t < this.f4645s.length);
        byte[] bArr3 = this.f4648v;
        YN1.m9277b("byteOutput size is not aligned to frame size " + i, i % this.f4640n == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f4637k;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = 127;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = -128;
                } else {
                    bArr3[i9] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        m7059k(i).put(bArr3, 0, i).flip();
    }
}
