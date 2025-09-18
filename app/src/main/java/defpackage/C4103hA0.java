package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: hA0 */
/* loaded from: classes.dex */
public final class C4103hA0 {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final V70 f = V70.t(5, AbstractC8250yr.a, AbstractC8250yr.c, AbstractC8250yr.f, AbstractC8250yr.d, AbstractC8250yr.e);
    public byte[] a;
    public int b;
    public int c;

    public C4103hA0() {
        this.a = AbstractC0277Dh1.f;
    }

    public final int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long B() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(NX.g(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException(NX.g(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return AbstractC8250yr.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return AbstractC8250yr.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return AbstractC8250yr.e;
    }

    public final void D(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        E(i, bArr);
    }

    public final void E(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void F(int i) {
        YN1.c(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void G(int i) {
        YN1.c(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void H(int i) {
        G(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char c(Charset charset) {
        YN1.b("Unsupported charset: " + charset, f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b;
        int i;
        byte b2;
        byte b3;
        if ((charset.equals(AbstractC8250yr.c) || charset.equals(AbstractC8250yr.a)) && a() >= 1) {
            long j = this.a[this.b] & 255;
            char c = (char) j;
            QL1.b(((long) c) == j, "Out of range: %s", j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(AbstractC8250yr.f) || charset.equals(AbstractC8250yr.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else {
                if (!charset.equals(AbstractC8250yr.e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        QL1.b(((long) c2) == j2, "Out of range: %s", j2);
        return (c2 << 16) + i;
    }

    public final void e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c = (char) (iD >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.b += iD & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            V70 r0 = defpackage.C4103hA0.f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.YN1.b(r1, r0)
            int r0 = r4.a()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = defpackage.AbstractC8250yr.a
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.C()
        L2a:
            java.nio.charset.Charset r1 = defpackage.AbstractC8250yr.c
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = defpackage.AbstractC8250yr.f
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = defpackage.AbstractC8250yr.e
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = defpackage.AbstractC8250yr.d
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L64:
            r0 = 2
            goto L67
        L66:
            r0 = 1
        L67:
            int r1 = r4.b
        L69:
            int r2 = r4.c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = defpackage.AbstractC8250yr.c
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = defpackage.AbstractC8250yr.a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.a
            r2 = r2[r1]
            boolean r2 = defpackage.AbstractC0277Dh1.O(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = defpackage.AbstractC8250yr.f
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = defpackage.AbstractC8250yr.d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = defpackage.AbstractC0277Dh1.O(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = defpackage.AbstractC8250yr.e
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = defpackage.AbstractC0277Dh1.O(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.b
            int r1 = r1 - r0
            java.lang.String r0 = r4.s(r1, r5)
            int r1 = r4.b
            int r2 = r4.c
            if (r1 != r2) goto Ld7
            return r0
        Ld7:
            char[] r1 = defpackage.C4103hA0.d
            char r1 = r4.f(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = defpackage.C4103hA0.e
            r4.f(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4103hA0.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final long j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public final short k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(AbstractC7209tN0.u(i, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = AbstractC0277Dh1.a;
        String str = new String(bArr, i2, i - i2, AbstractC8250yr.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = AbstractC0277Dh1.a;
        String str = new String(bArr, i2, i4, AbstractC8250yr.c);
        this.b += i;
        return str;
    }

    public final short r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public final long w() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final int y() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(AbstractC7209tN0.u(iG, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(NX.g(jO, "Top bit not zero: "));
    }

    public C4103hA0(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public C4103hA0(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public C4103hA0(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
