package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.a */
/* loaded from: classes2.dex */
public final class C3115a {

    /* renamed from: a */
    private final byte[] f23015a;

    /* renamed from: b */
    private int f23016b;

    /* renamed from: c */
    private int f23017c;

    /* renamed from: d */
    private int f23018d;

    /* renamed from: e */
    private int f23019e;

    /* renamed from: f */
    private int f23020f;

    /* renamed from: g */
    private int f23021g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f23022h;

    private C3115a(byte[] bArr, int i, int i2) {
        this.f23015a = bArr;
        this.f23016b = i;
        this.f23017c = i2 + i;
        this.f23019e = i;
    }

    /* renamed from: a */
    public static C3115a m15573a(byte[] bArr, int i, int i2) {
        return new C3115a(bArr, i, i2);
    }

    /* renamed from: m */
    private void m15574m() {
        int i = this.f23017c + this.f23018d;
        this.f23017c = i;
        int i2 = this.f23021g;
        if (i <= i2) {
            this.f23018d = 0;
            return;
        }
        int i3 = i - i2;
        this.f23018d = i3;
        this.f23017c = i - i3;
    }

    /* renamed from: b */
    public void m15579b(int i) {
        this.f23021g = i;
        m15574m();
    }

    /* renamed from: c */
    public boolean m15581c() throws IOException {
        return m15590h() != 0;
    }

    /* renamed from: d */
    public byte[] m15582d() throws IOException {
        int iM15590h = m15590h();
        int i = this.f23017c;
        int i2 = this.f23019e;
        if (iM15590h > i - i2 || iM15590h <= 0) {
            return m15583d(iM15590h);
        }
        byte[] bArr = new byte[iM15590h];
        System.arraycopy(this.f23015a, i2, bArr, 0, iM15590h);
        this.f23019e += iM15590h;
        return bArr;
    }

    /* renamed from: e */
    public void m15585e(int i) {
        int i2 = this.f23019e;
        int i3 = this.f23016b;
        if (i > i2 - i3) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Position ", " is beyond current ");
            sbM26237n.append(this.f23019e - this.f23016b);
            throw new IllegalArgumentException(sbM26237n.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Bad position "));
        }
        this.f23019e = i3 + i;
    }

    /* renamed from: f */
    public boolean m15587f(int i) throws IOException {
        int iM15594l;
        int i2 = i & 7;
        if (i2 == 0) {
            m15590h();
            return true;
        }
        if (i2 == 1) {
            m15588g();
            return true;
        }
        if (i2 == 2) {
            m15589g(m15590h());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new C3193d("Protocol message tag had invalid wire type.");
            }
            m15586f();
            return true;
        }
        do {
            iM15594l = m15594l();
            if (iM15594l == 0) {
                break;
            }
        } while (m15587f(iM15594l));
        m15576a(C3271g.m15951a(i >>> 3, 4));
        return true;
    }

    /* renamed from: g */
    public long m15588g() throws IOException {
        return ((m15584e() & 255) << 8) | (m15584e() & 255) | ((m15584e() & 255) << 16) | ((m15584e() & 255) << 24) | ((m15584e() & 255) << 32) | ((m15584e() & 255) << 40) | ((m15584e() & 255) << 48) | ((m15584e() & 255) << 56);
    }

    /* renamed from: h */
    public int m15590h() throws IOException {
        int i;
        byte bM15584e = m15584e();
        if (bM15584e >= 0) {
            return bM15584e;
        }
        int i2 = bM15584e & 127;
        byte bM15584e2 = m15584e();
        if (bM15584e2 >= 0) {
            i = bM15584e2 << 7;
        } else {
            i2 |= (bM15584e2 & 127) << 7;
            byte bM15584e3 = m15584e();
            if (bM15584e3 >= 0) {
                i = bM15584e3 << 14;
            } else {
                i2 |= (bM15584e3 & 127) << 14;
                byte bM15584e4 = m15584e();
                if (bM15584e4 < 0) {
                    int i3 = i2 | ((bM15584e4 & 127) << 21);
                    byte bM15584e5 = m15584e();
                    int i4 = i3 | (bM15584e5 << 28);
                    if (bM15584e5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (m15584e() >= 0) {
                            return i4;
                        }
                    }
                    throw new C3193d("CodedInputStream encountered a malformed varint.");
                }
                i = bM15584e4 << 21;
            }
        }
        return i2 | i;
    }

    /* renamed from: i */
    public long m15591i() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((m15584e() & 128) == 0) {
                return j;
            }
        }
        throw new C3193d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: j */
    public int m15592j() throws IOException {
        int iM15590h = m15590h();
        return (-(iM15590h & 1)) ^ (iM15590h >>> 1);
    }

    /* renamed from: k */
    public String m15593k() throws IOException {
        int iM15590h = m15590h();
        int i = this.f23017c;
        int i2 = this.f23019e;
        if (iM15590h > i - i2 || iM15590h <= 0) {
            return new String(m15583d(iM15590h), "UTF-8");
        }
        String str = new String(this.f23015a, i2, iM15590h, "UTF-8");
        this.f23019e += iM15590h;
        return str;
    }

    /* renamed from: l */
    public int m15594l() throws IOException {
        if (this.f23019e == this.f23017c) {
            this.f23020f = 0;
            return 0;
        }
        int iM15590h = m15590h();
        this.f23020f = iM15590h;
        if (iM15590h != 0) {
            return iM15590h;
        }
        throw new C3193d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public void m15576a(int i) throws C3193d {
        if (this.f23020f != i) {
            throw new C3193d("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: c */
    public int m15580c(int i) throws C3193d {
        if (i < 0) {
            throw C3193d.m15720a();
        }
        int i2 = i + this.f23019e;
        int i3 = this.f23021g;
        if (i2 > i3) {
            throw C3193d.m15721b();
        }
        this.f23021g = i2;
        m15574m();
        return i3;
    }

    /* renamed from: b */
    public int m15578b() {
        return this.f23019e - this.f23016b;
    }

    /* renamed from: a */
    public void m15577a(AbstractC3219e abstractC3219e) throws IOException {
        int iM15590h = m15590h();
        if (this.f23022h < 64) {
            int iM15580c = m15580c(iM15590h);
            this.f23022h++;
            abstractC3219e.mo14342a(this);
            m15576a(0);
            this.f23022h--;
            this.f23021g = iM15580c;
            m15574m();
            return;
        }
        throw new C3193d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    public byte[] m15583d(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f23019e;
            int i3 = i2 + i;
            int i4 = this.f23021g;
            if (i3 <= i4) {
                if (i <= this.f23017c - i2) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f23015a, i2, bArr, 0, i);
                    this.f23019e += i;
                    return bArr;
                }
                throw C3193d.m15721b();
            }
            m15589g(i4 - i2);
            throw C3193d.m15721b();
        }
        throw C3193d.m15720a();
    }

    /* renamed from: g */
    public void m15589g(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f23019e;
            int i3 = i2 + i;
            int i4 = this.f23021g;
            if (i3 <= i4) {
                if (i <= this.f23017c - i2) {
                    this.f23019e = i3;
                    return;
                }
                throw C3193d.m15721b();
            }
            m15589g(i4 - i2);
            throw C3193d.m15721b();
        }
        throw C3193d.m15720a();
    }

    /* renamed from: f */
    public int m15586f() throws IOException {
        return (m15584e() & 255) | ((m15584e() & 255) << 8) | ((m15584e() & 255) << 16) | ((m15584e() & 255) << 24);
    }

    /* renamed from: a */
    public int m15575a() {
        int i = this.f23021g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f23019e;
    }

    /* renamed from: e */
    public byte m15584e() throws IOException {
        int i = this.f23019e;
        if (i != this.f23017c) {
            byte[] bArr = this.f23015a;
            this.f23019e = i + 1;
            return bArr[i];
        }
        throw C3193d.m15721b();
    }
}
