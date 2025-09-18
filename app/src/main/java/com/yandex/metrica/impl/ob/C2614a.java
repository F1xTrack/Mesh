package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;
import defpackage.AbstractC8235ym;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.a */
/* loaded from: classes2.dex */
public final class C2614a {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = Integer.MAX_VALUE;
    private int h;

    private C2614a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public static C2614a a(byte[] bArr, int i, int i2) {
        return new C2614a(bArr, i, i2);
    }

    private void m() {
        int i = this.c + this.d;
        this.c = i;
        int i2 = this.g;
        if (i <= i2) {
            this.d = 0;
            return;
        }
        int i3 = i - i2;
        this.d = i3;
        this.c = i - i3;
    }

    public void b(int i) {
        this.g = i;
        m();
    }

    public boolean c() throws IOException {
        return h() != 0;
    }

    public byte[] d() throws IOException {
        int iH = h();
        int i = this.c;
        int i2 = this.e;
        if (iH > i - i2 || iH <= 0) {
            return d(iH);
        }
        byte[] bArr = new byte[iH];
        System.arraycopy(this.a, i2, bArr, 0, iH);
        this.e += iH;
        return bArr;
    }

    public void e(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            StringBuilder sbN = AbstractC8235ym.n(i, "Position ", " is beyond current ");
            sbN.append(this.e - this.b);
            throw new IllegalArgumentException(sbN.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Bad position "));
        }
        this.e = i3 + i;
    }

    public boolean f(int i) throws IOException {
        int iL;
        int i2 = i & 7;
        if (i2 == 0) {
            h();
            return true;
        }
        if (i2 == 1) {
            g();
            return true;
        }
        if (i2 == 2) {
            g(h());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new C2689d("Protocol message tag had invalid wire type.");
            }
            f();
            return true;
        }
        do {
            iL = l();
            if (iL == 0) {
                break;
            }
        } while (f(iL));
        a(C2764g.a(i >>> 3, 4));
        return true;
    }

    public long g() throws IOException {
        return ((e() & 255) << 8) | (e() & 255) | ((e() & 255) << 16) | ((e() & 255) << 24) | ((e() & 255) << 32) | ((e() & 255) << 40) | ((e() & 255) << 48) | ((e() & 255) << 56);
    }

    public int h() throws IOException {
        int i;
        byte bE = e();
        if (bE >= 0) {
            return bE;
        }
        int i2 = bE & 127;
        byte bE2 = e();
        if (bE2 >= 0) {
            i = bE2 << 7;
        } else {
            i2 |= (bE2 & 127) << 7;
            byte bE3 = e();
            if (bE3 >= 0) {
                i = bE3 << 14;
            } else {
                i2 |= (bE3 & 127) << 14;
                byte bE4 = e();
                if (bE4 < 0) {
                    int i3 = i2 | ((bE4 & 127) << 21);
                    byte bE5 = e();
                    int i4 = i3 | (bE5 << 28);
                    if (bE5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (e() >= 0) {
                            return i4;
                        }
                    }
                    throw new C2689d("CodedInputStream encountered a malformed varint.");
                }
                i = bE4 << 21;
            }
        }
        return i2 | i;
    }

    public long i() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((e() & 128) == 0) {
                return j;
            }
        }
        throw new C2689d("CodedInputStream encountered a malformed varint.");
    }

    public int j() throws IOException {
        int iH = h();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    public String k() throws IOException {
        int iH = h();
        int i = this.c;
        int i2 = this.e;
        if (iH > i - i2 || iH <= 0) {
            return new String(d(iH), "UTF-8");
        }
        String str = new String(this.a, i2, iH, "UTF-8");
        this.e += iH;
        return str;
    }

    public int l() throws IOException {
        if (this.e == this.c) {
            this.f = 0;
            return 0;
        }
        int iH = h();
        this.f = iH;
        if (iH != 0) {
            return iH;
        }
        throw new C2689d("Protocol message contained an invalid tag (zero).");
    }

    public void a(int i) throws C2689d {
        if (this.f != i) {
            throw new C2689d("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int c(int i) throws C2689d {
        if (i < 0) {
            throw C2689d.a();
        }
        int i2 = i + this.e;
        int i3 = this.g;
        if (i2 > i3) {
            throw C2689d.b();
        }
        this.g = i2;
        m();
        return i3;
    }

    public int b() {
        return this.e - this.b;
    }

    public void a(AbstractC2714e abstractC2714e) throws IOException {
        int iH = h();
        if (this.h < 64) {
            int iC = c(iH);
            this.h++;
            abstractC2714e.a(this);
            a(0);
            this.h--;
            this.g = iC;
            m();
            return;
        }
        throw new C2689d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public byte[] d(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                if (i <= this.c - i2) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.a, i2, bArr, 0, i);
                    this.e += i;
                    return bArr;
                }
                throw C2689d.b();
            }
            g(i4 - i2);
            throw C2689d.b();
        }
        throw C2689d.a();
    }

    public void g(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                if (i <= this.c - i2) {
                    this.e = i3;
                    return;
                }
                throw C2689d.b();
            }
            g(i4 - i2);
            throw C2689d.b();
        }
        throw C2689d.a();
    }

    public int f() throws IOException {
        return (e() & 255) | ((e() & 255) << 8) | ((e() & 255) << 16) | ((e() & 255) << 24);
    }

    public int a() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.e;
    }

    public byte e() throws IOException {
        int i = this.e;
        if (i != this.c) {
            byte[] bArr = this.a;
            this.e = i + 1;
            return bArr[i];
        }
        throw C2689d.b();
    }
}
