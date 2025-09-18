package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: hA0 */
/* loaded from: classes.dex */
public final class C9591hA0 {

    /* renamed from: d */
    public static final char[] f28290d = {'\r', '\n'};

    /* renamed from: e */
    public static final char[] f28291e = {'\n'};

    /* renamed from: f */
    public static final V70 f28292f = V70.m8307t(5, AbstractC7227yr.f46509a, AbstractC7227yr.f46511c, AbstractC7227yr.f46514f, AbstractC7227yr.f46512d, AbstractC7227yr.f46513e);

    /* renamed from: a */
    public byte[] f28293a;

    /* renamed from: b */
    public int f28294b;

    /* renamed from: c */
    public int f28295c;

    public C9591hA0() {
        this.f28293a = AbstractC7485Dh1.f2171f;
    }

    /* renamed from: A */
    public final int m18735A() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f28294b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* renamed from: B */
    public final long m18736B() {
        int i;
        int i2;
        long j = this.f28293a[this.f28294b];
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
            throw new NumberFormatException(AbstractC0852NX.m5758g(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            if ((this.f28293a[this.f28294b + i] & 192) != 128) {
                throw new NumberFormatException(AbstractC0852NX.m5758g(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f28294b += i2;
        return j;
    }

    /* renamed from: C */
    public final Charset m18737C() {
        if (m18743a() >= 3) {
            byte[] bArr = this.f28293a;
            int i = this.f28294b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f28294b = i + 3;
                return AbstractC7227yr.f46511c;
            }
        }
        if (m18743a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f28293a;
        int i2 = this.f28294b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f28294b = i2 + 2;
            return AbstractC7227yr.f46512d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f28294b = i2 + 2;
        return AbstractC7227yr.f46513e;
    }

    /* renamed from: D */
    public final void m18738D(int i) {
        byte[] bArr = this.f28293a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m18739E(i, bArr);
    }

    /* renamed from: E */
    public final void m18739E(int i, byte[] bArr) {
        this.f28293a = bArr;
        this.f28295c = i;
        this.f28294b = 0;
    }

    /* renamed from: F */
    public final void m18740F(int i) {
        YN1.m9278c(i >= 0 && i <= this.f28293a.length);
        this.f28295c = i;
    }

    /* renamed from: G */
    public final void m18741G(int i) {
        YN1.m9278c(i >= 0 && i <= this.f28295c);
        this.f28294b = i;
    }

    /* renamed from: H */
    public final void m18742H(int i) {
        m18741G(this.f28294b + i);
    }

    /* renamed from: a */
    public final int m18743a() {
        return this.f28295c - this.f28294b;
    }

    /* renamed from: b */
    public final void m18744b(int i) {
        byte[] bArr = this.f28293a;
        if (i > bArr.length) {
            this.f28293a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: c */
    public final char m18745c(Charset charset) {
        YN1.m9277b("Unsupported charset: " + charset, f28292f.contains(charset));
        return (char) (m18746d(charset) >> 16);
    }

    /* renamed from: d */
    public final int m18746d(Charset charset) {
        byte b;
        int i;
        byte b2;
        byte b3;
        if ((charset.equals(AbstractC7227yr.f46511c) || charset.equals(AbstractC7227yr.f46509a)) && m18743a() >= 1) {
            long j = this.f28293a[this.f28294b] & 255;
            char c = (char) j;
            QL1.m6666b(((long) c) == j, "Out of range: %s", j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(AbstractC7227yr.f46514f) || charset.equals(AbstractC7227yr.f46512d)) && m18743a() >= 2) {
                byte[] bArr = this.f28293a;
                int i2 = this.f28294b;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else {
                if (!charset.equals(AbstractC7227yr.f46513e) || m18743a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f28293a;
                int i3 = this.f28294b;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        QL1.m6666b(((long) c2) == j2, "Out of range: %s", j2);
        return (c2 << 16) + i;
    }

    /* renamed from: e */
    public final void m18747e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f28293a, this.f28294b, bArr, i, i2);
        this.f28294b += i2;
    }

    /* renamed from: f */
    public final char m18748f(Charset charset, char[] cArr) {
        int iM18746d = m18746d(charset);
        if (iM18746d != 0) {
            char c = (char) (iM18746d >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.f28294b += iM18746d & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    /* renamed from: g */
    public final int m18749g() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f28294b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f28294b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f28294b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00ad  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m18750h(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            V70 r0 = p000.C9591hA0.f28292f
            boolean r0 = r0.contains(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported charset: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            p000.YN1.m9277b(r1, r0)
            int r0 = r4.m18743a()
            if (r0 != 0) goto L1f
            r5 = 0
            return r5
        L1f:
            java.nio.charset.Charset r0 = p000.AbstractC7227yr.f46509a
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L2a
            r4.m18737C()
        L2a:
            java.nio.charset.Charset r1 = p000.AbstractC7227yr.f46511c
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L66
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L39
            goto L66
        L39:
            java.nio.charset.Charset r0 = p000.AbstractC7227yr.f46514f
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = p000.AbstractC7227yr.f46513e
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            java.nio.charset.Charset r0 = p000.AbstractC7227yr.f46512d
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
            int r1 = r4.f28294b
        L69:
            int r2 = r4.f28295c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto Lc8
            java.nio.charset.Charset r2 = p000.AbstractC7227yr.f46511c
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L81
            java.nio.charset.Charset r2 = p000.AbstractC7227yr.f46509a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8c
        L81:
            byte[] r2 = r4.f28293a
            r2 = r2[r1]
            boolean r2 = p000.AbstractC7485Dh1.m1800O(r2)
            if (r2 == 0) goto L8c
            goto Lc9
        L8c:
            java.nio.charset.Charset r2 = p000.AbstractC7227yr.f46514f
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L9c
            java.nio.charset.Charset r2 = p000.AbstractC7227yr.f46512d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lad
        L9c:
            byte[] r2 = r4.f28293a
            r3 = r2[r1]
            if (r3 != 0) goto Lad
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = p000.AbstractC7485Dh1.m1800O(r2)
            if (r2 == 0) goto Lad
            goto Lc9
        Lad:
            java.nio.charset.Charset r2 = p000.AbstractC7227yr.f46513e
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lc6
            byte[] r2 = r4.f28293a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto Lc6
            r2 = r2[r1]
            boolean r2 = p000.AbstractC7485Dh1.m1800O(r2)
            if (r2 == 0) goto Lc6
            goto Lc9
        Lc6:
            int r1 = r1 + r0
            goto L69
        Lc8:
            r1 = r2
        Lc9:
            int r0 = r4.f28294b
            int r1 = r1 - r0
            java.lang.String r0 = r4.m18761s(r1, r5)
            int r1 = r4.f28294b
            int r2 = r4.f28295c
            if (r1 != r2) goto Ld7
            return r0
        Ld7:
            char[] r1 = p000.C9591hA0.f28290d
            char r1 = r4.m18748f(r5, r1)
            r2 = 13
            if (r1 != r2) goto Le6
            char[] r1 = p000.C9591hA0.f28291e
            r4.m18748f(r5, r1)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9591hA0.m18750h(java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: i */
    public final int m18751i() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f28294b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f28294b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f28294b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* renamed from: j */
    public final long m18752j() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        this.f28294b = i + 1;
        this.f28294b = i + 2;
        this.f28294b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f28294b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.f28294b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.f28294b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.f28294b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.f28294b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    /* renamed from: k */
    public final short m18753k() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = bArr[i] & 255;
        this.f28294b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* renamed from: l */
    public final long m18754l() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        this.f28294b = i + 1;
        this.f28294b = i + 2;
        this.f28294b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f28294b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    /* renamed from: m */
    public final int m18755m() {
        int iM18751i = m18751i();
        if (iM18751i >= 0) {
            return iM18751i;
        }
        throw new IllegalStateException(AbstractC11153tN0.m24909u(iM18751i, "Top bit not zero: "));
    }

    /* renamed from: n */
    public final int m18756n() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = bArr[i] & 255;
        this.f28294b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* renamed from: o */
    public final long m18757o() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        this.f28294b = i + 1;
        this.f28294b = i + 2;
        this.f28294b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f28294b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.f28294b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.f28294b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.f28294b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.f28294b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    /* renamed from: p */
    public final String m18758p() {
        if (m18743a() == 0) {
            return null;
        }
        int i = this.f28294b;
        while (i < this.f28295c && this.f28293a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f28293a;
        int i2 = this.f28294b;
        int i3 = AbstractC7485Dh1.f2166a;
        String str = new String(bArr, i2, i - i2, AbstractC7227yr.f46511c);
        this.f28294b = i;
        if (i < this.f28295c) {
            this.f28294b = i + 1;
        }
        return str;
    }

    /* renamed from: q */
    public final String m18759q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f28294b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f28295c || this.f28293a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f28293a;
        int i5 = AbstractC7485Dh1.f2166a;
        String str = new String(bArr, i2, i4, AbstractC7227yr.f46511c);
        this.f28294b += i;
        return str;
    }

    /* renamed from: r */
    public final short m18760r() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f28294b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* renamed from: s */
    public final String m18761s(int i, Charset charset) {
        String str = new String(this.f28293a, this.f28294b, i, charset);
        this.f28294b += i;
        return str;
    }

    /* renamed from: t */
    public final int m18762t() {
        return (m18763u() << 21) | (m18763u() << 14) | (m18763u() << 7) | m18763u();
    }

    /* renamed from: u */
    public final int m18763u() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        this.f28294b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: v */
    public final int m18764v() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f28294b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f28294b = i + 4;
        return i4;
    }

    /* renamed from: w */
    public final long m18765w() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        this.f28294b = i + 1;
        this.f28294b = i + 2;
        this.f28294b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f28294b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    /* renamed from: x */
    public final int m18766x() {
        byte[] bArr = this.f28293a;
        int i = this.f28294b;
        int i2 = i + 1;
        this.f28294b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f28294b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f28294b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* renamed from: y */
    public final int m18767y() {
        int iM18749g = m18749g();
        if (iM18749g >= 0) {
            return iM18749g;
        }
        throw new IllegalStateException(AbstractC11153tN0.m24909u(iM18749g, "Top bit not zero: "));
    }

    /* renamed from: z */
    public final long m18768z() {
        long jM18757o = m18757o();
        if (jM18757o >= 0) {
            return jM18757o;
        }
        throw new IllegalStateException(AbstractC0852NX.m5758g(jM18757o, "Top bit not zero: "));
    }

    public C9591hA0(int i) {
        this.f28293a = new byte[i];
        this.f28295c = i;
    }

    public C9591hA0(byte[] bArr) {
        this.f28293a = bArr;
        this.f28295c = bArr.length;
    }

    public C9591hA0(byte[] bArr, int i) {
        this.f28293a = bArr;
        this.f28295c = i;
    }
}
