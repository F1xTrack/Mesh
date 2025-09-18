package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: lu */
/* loaded from: classes2.dex */
public final class C6392lu {

    /* renamed from: c */
    public int f37344c;

    /* renamed from: e */
    public final InputStream f37346e;

    /* renamed from: f */
    public int f37347f;

    /* renamed from: i */
    public int f37350i;

    /* renamed from: h */
    public int f37349h = Integer.MAX_VALUE;

    /* renamed from: a */
    public final byte[] f37342a = new byte[4096];

    /* renamed from: b */
    public int f37343b = 0;

    /* renamed from: d */
    public int f37345d = 0;

    /* renamed from: g */
    public int f37348g = 0;

    public C6392lu(InputStream inputStream) {
        this.f37346e = inputStream;
    }

    /* renamed from: a */
    public final void m22573a(int i) {
        if (this.f37347f != i) {
            throw new Y90("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final int m22574b() {
        int i = this.f37349h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f37348g + this.f37345d);
    }

    /* renamed from: c */
    public final void m22575c(int i) {
        this.f37349h = i;
        m22587o();
    }

    /* renamed from: d */
    public final int m22576d(int i) {
        if (i < 0) {
            throw new Y90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f37348g + this.f37345d + i;
        int i3 = this.f37349h;
        if (i2 > i3) {
            throw Y90.m9227a();
        }
        this.f37349h = i2;
        m22587o();
        return i3;
    }

    /* renamed from: e */
    public final C8580Yj0 m22577e() {
        int iM22583k = m22583k();
        int i = this.f37343b;
        int i2 = this.f37345d;
        if (iM22583k > i - i2 || iM22583k <= 0) {
            return iM22583k == 0 ? AbstractC0488Hk.f4481a : new C8580Yj0(m22580h(iM22583k));
        }
        byte[] bArr = new byte[iM22583k];
        System.arraycopy(this.f37342a, i2, bArr, 0, iM22583k);
        C8580Yj0 c8580Yj0 = new C8580Yj0(bArr);
        this.f37345d += iM22583k;
        return c8580Yj0;
    }

    /* renamed from: f */
    public final int m22578f() {
        return m22583k();
    }

    /* renamed from: g */
    public final AbstractC0631K0 m22579g(InterfaceC9847jA0 interfaceC9847jA0, C0217DR c0217dr) throws Y90 {
        int iM22583k = m22583k();
        if (this.f37350i >= 64) {
            throw new Y90("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM22576d = m22576d(iM22583k);
        this.f37350i++;
        AbstractC0631K0 abstractC0631K0 = (AbstractC0631K0) interfaceC9847jA0.mo21982a(this, c0217dr);
        m22573a(0);
        this.f37350i--;
        m22575c(iM22576d);
        return abstractC0631K0;
    }

    /* renamed from: h */
    public final byte[] m22580h(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return AbstractC11762y90.f46105a;
            }
            throw new Y90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f37348g;
        int i3 = this.f37345d;
        int i4 = i2 + i3 + i;
        int i5 = this.f37349h;
        if (i4 > i5) {
            m22590r((i5 - i2) - i3);
            throw Y90.m9227a();
        }
        byte[] bArr = this.f37342a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f37343b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f37345d = this.f37343b;
            int i7 = i - i6;
            if (i7 > 0) {
                m22588p(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f37345d = i7;
            return bArr2;
        }
        int i8 = this.f37343b;
        this.f37348g = i2 + i8;
        this.f37345d = 0;
        this.f37343b = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f37346e.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw Y90.m9227a();
                }
                this.f37348g += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* renamed from: i */
    public final int m22581i() throws Y90 {
        int i = this.f37345d;
        if (this.f37343b - i < 4) {
            m22588p(4);
            i = this.f37345d;
        }
        this.f37345d = i + 4;
        byte[] bArr = this.f37342a;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: j */
    public final long m22582j() throws Y90 {
        int i = this.f37345d;
        if (this.f37343b - i < 8) {
            m22588p(8);
            i = this.f37345d;
        }
        this.f37345d = i + 8;
        byte[] bArr = this.f37342a;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public final int m22583k() {
        int i;
        int i2 = this.f37345d;
        int i3 = this.f37343b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f37342a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f37345d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << 21);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i9] < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i11 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i11;
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f37345d = i5;
                return i;
            }
        }
        return (int) m22585m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m22584l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6392lu.m22584l():long");
    }

    /* renamed from: m */
    public final long m22585m() throws Y90 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f37345d == this.f37343b) {
                m22588p(1);
            }
            int i2 = this.f37345d;
            this.f37345d = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f37342a[i2] & 128) == 0) {
                return j;
            }
        }
        throw new Y90("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: n */
    public final int m22586n() throws Y90 {
        if (this.f37345d == this.f37343b && !m22591s(1)) {
            this.f37347f = 0;
            return 0;
        }
        int iM22583k = m22583k();
        this.f37347f = iM22583k;
        if ((iM22583k >>> 3) != 0) {
            return iM22583k;
        }
        throw new Y90("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: o */
    public final void m22587o() {
        int i = this.f37343b + this.f37344c;
        this.f37343b = i;
        int i2 = this.f37348g + i;
        int i3 = this.f37349h;
        if (i2 <= i3) {
            this.f37344c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f37344c = i4;
        this.f37343b = i - i4;
    }

    /* renamed from: p */
    public final void m22588p(int i) throws Y90 {
        if (!m22591s(i)) {
            throw Y90.m9227a();
        }
    }

    /* renamed from: q */
    public final boolean m22589q(int i, C0577J9 c0577j9) throws IOException {
        int iM22586n;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM22584l = m22584l();
            c0577j9.m4218F(i);
            c0577j9.m4219G(jM22584l);
            return true;
        }
        if (i2 == 1) {
            long jM22582j = m22582j();
            c0577j9.m4218F(i);
            c0577j9.m4217E(jM22582j);
            return true;
        }
        if (i2 == 2) {
            C8580Yj0 c8580Yj0M22577e = m22577e();
            c0577j9.m4218F(i);
            c0577j9.m4218F(c8580Yj0M22577e.size());
            c0577j9.m4214B(c8580Yj0M22577e);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new Y90("Protocol message tag had invalid wire type.");
            }
            int iM22581i = m22581i();
            c0577j9.m4218F(i);
            c0577j9.m4216D(iM22581i);
            return true;
        }
        c0577j9.m4218F(i);
        do {
            iM22586n = m22586n();
            if (iM22586n == 0) {
                break;
            }
        } while (m22589q(iM22586n, c0577j9));
        int i3 = ((i >>> 3) << 3) | 4;
        m22573a(i3);
        c0577j9.m4218F(i3);
        return true;
    }

    /* renamed from: r */
    public final void m22590r(int i) throws Y90 {
        int i2 = this.f37343b;
        int i3 = this.f37345d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f37345d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new Y90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f37348g;
        int i6 = i5 + i3 + i;
        int i7 = this.f37349h;
        if (i6 > i7) {
            m22590r((i7 - i5) - i3);
            throw Y90.m9227a();
        }
        this.f37345d = i2;
        m22588p(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.f37343b;
            if (i8 <= i9) {
                this.f37345d = i8;
                return;
            } else {
                i4 += i9;
                this.f37345d = i9;
                m22588p(1);
            }
        }
    }

    /* renamed from: s */
    public final boolean m22591s(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f37345d;
        int i3 = i2 + i;
        int i4 = this.f37343b;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f37348g + i2 + i <= this.f37349h && (inputStream = this.f37346e) != null) {
            byte[] bArr = this.f37342a;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f37348g += i2;
                this.f37343b -= i2;
                this.f37345d = 0;
            }
            int i5 = this.f37343b;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f37343b += i6;
                if ((this.f37348g + i) - 67108864 > 0) {
                    throw new Y90("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m22587o();
                if (this.f37343b >= i) {
                    return true;
                }
                return m22591s(i);
            }
        }
        return false;
    }
}
