package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* renamed from: yc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11820yc0 implements Closeable {

    /* renamed from: a */
    public final StringReader f46341a;

    /* renamed from: i */
    public long f46349i;

    /* renamed from: j */
    public int f46350j;

    /* renamed from: k */
    public String f46351k;

    /* renamed from: l */
    public int[] f46352l;

    /* renamed from: n */
    public String[] f46354n;

    /* renamed from: o */
    public int[] f46355o;

    /* renamed from: b */
    public boolean f46342b = false;

    /* renamed from: c */
    public final char[] f46343c = new char[1024];

    /* renamed from: d */
    public int f46344d = 0;

    /* renamed from: e */
    public int f46345e = 0;

    /* renamed from: f */
    public int f46346f = 0;

    /* renamed from: g */
    public int f46347g = 0;

    /* renamed from: h */
    public int f46348h = 0;

    /* renamed from: m */
    public int f46353m = 1;

    static {
        C9937jt0.f35443h = new C9937jt0(16);
    }

    public C11820yc0(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f46352l = iArr;
        iArr[0] = 6;
        this.f46354n = new String[32];
        this.f46355o = new int[32];
        this.f46341a = stringReader;
    }

    /* renamed from: A */
    public final boolean m26175A(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f46347g;
        int i5 = this.f46344d;
        this.f46347g = i4 - i5;
        int i6 = this.f46345e;
        char[] cArr = this.f46343c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f46345e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f46345e = 0;
        }
        this.f46344d = 0;
        do {
            int i8 = this.f46345e;
            int i9 = this.f46341a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f46345e + i9;
            this.f46345e = i2;
            if (this.f46346f == 0 && (i3 = this.f46347g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f46344d++;
                this.f46347g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: D */
    public final String m26176D(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f46353m;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f46352l[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f46355o[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f46354n[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    /* renamed from: J */
    public final boolean m26177J() throws IOException {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        return (iM26193p == 2 || iM26193p == 4 || iM26193p == 17) ? false : true;
    }

    /* renamed from: S */
    public final boolean m26178S(char c) throws C8014Nm0 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m26191o();
        return false;
    }

    /* renamed from: U */
    public final String m26179U() {
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m(" at line ", " column ", this.f46346f + 1, (this.f46344d - this.f46347g) + 1, " path ");
        sbM8594m.append(m26176D(false));
        return sbM8594m.toString();
    }

    /* renamed from: W */
    public final boolean m26180W() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 5) {
            this.f46348h = 0;
            int[] iArr = this.f46355o;
            int i = this.f46353m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM26193p != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
        this.f46348h = 0;
        int[] iArr2 = this.f46355o;
        int i2 = this.f46353m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* renamed from: X */
    public final double m26181X() throws IOException, NumberFormatException {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 15) {
            this.f46348h = 0;
            int[] iArr = this.f46355o;
            int i = this.f46353m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f46349i;
        }
        if (iM26193p == 16) {
            this.f46351k = new String(this.f46343c, this.f46344d, this.f46350j);
            this.f46344d += this.f46350j;
        } else if (iM26193p == 8 || iM26193p == 9) {
            this.f46351k = m26188m0(iM26193p == 8 ? '\'' : '\"');
        } else if (iM26193p == 10) {
            this.f46351k = m26192o0();
        } else if (iM26193p != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
        this.f46348h = 11;
        double d = Double.parseDouble(this.f46351k);
        if (!this.f46342b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C8014Nm0("JSON forbids NaN and infinities: " + d + m26179U());
        }
        this.f46351k = null;
        this.f46348h = 0;
        int[] iArr2 = this.f46355o;
        int i2 = this.f46353m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* renamed from: b0 */
    public final int m26182b0() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 15) {
            long j = this.f46349i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f46349i + m26179U());
            }
            this.f46348h = 0;
            int[] iArr = this.f46355o;
            int i2 = this.f46353m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM26193p == 16) {
            this.f46351k = new String(this.f46343c, this.f46344d, this.f46350j);
            this.f46344d += this.f46350j;
        } else {
            if (iM26193p != 8 && iM26193p != 9 && iM26193p != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
            }
            if (iM26193p == 10) {
                this.f46351k = m26192o0();
            } else {
                this.f46351k = m26188m0(iM26193p == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f46351k);
                this.f46348h = 0;
                int[] iArr2 = this.f46355o;
                int i4 = this.f46353m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46348h = 11;
        double d = Double.parseDouble(this.f46351k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f46351k + m26179U());
        }
        this.f46351k = null;
        this.f46348h = 0;
        int[] iArr3 = this.f46355o;
        int i6 = this.f46353m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46348h = 0;
        this.f46352l[0] = 8;
        this.f46353m = 1;
        this.f46341a.close();
    }

    /* renamed from: d0 */
    public final long m26183d0() throws IOException, NumberFormatException {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 15) {
            this.f46348h = 0;
            int[] iArr = this.f46355o;
            int i = this.f46353m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f46349i;
        }
        if (iM26193p == 16) {
            this.f46351k = new String(this.f46343c, this.f46344d, this.f46350j);
            this.f46344d += this.f46350j;
        } else {
            if (iM26193p != 8 && iM26193p != 9 && iM26193p != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
            }
            if (iM26193p == 10) {
                this.f46351k = m26192o0();
            } else {
                this.f46351k = m26188m0(iM26193p == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f46351k);
                this.f46348h = 0;
                int[] iArr2 = this.f46355o;
                int i2 = this.f46353m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46348h = 11;
        double d = Double.parseDouble(this.f46351k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f46351k + m26179U());
        }
        this.f46351k = null;
        this.f46348h = 0;
        int[] iArr3 = this.f46355o;
        int i3 = this.f46353m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* renamed from: e0 */
    public final String m26184e0() {
        String strM26188m0;
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 14) {
            strM26188m0 = m26192o0();
        } else if (iM26193p == 12) {
            strM26188m0 = m26188m0('\'');
        } else {
            if (iM26193p != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
            }
            strM26188m0 = m26188m0('\"');
        }
        this.f46348h = 0;
        this.f46354n[this.f46353m - 1] = strM26188m0;
        return strM26188m0;
    }

    /* renamed from: h0 */
    public final int m26185h0(boolean z) throws IOException {
        int i = this.f46344d;
        int i2 = this.f46345e;
        while (true) {
            if (i == i2) {
                this.f46344d = i;
                if (!m26175A(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m26179U());
                }
                i = this.f46344d;
                i2 = this.f46345e;
            }
            int i3 = i + 1;
            char[] cArr = this.f46343c;
            char c = cArr[i];
            if (c == '\n') {
                this.f46346f++;
                this.f46347g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f46344d = i3;
                    if (i3 == i2) {
                        this.f46344d = i;
                        boolean zM26175A = m26175A(2);
                        this.f46344d++;
                        if (!zM26175A) {
                            return c;
                        }
                    }
                    m26191o();
                    int i4 = this.f46344d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f46344d = i4 + 1;
                        while (true) {
                            if (this.f46344d + 2 > this.f46345e && !m26175A(2)) {
                                m26202w0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f46344d;
                            if (cArr[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (cArr[this.f46344d + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                i = this.f46344d + 2;
                                i2 = this.f46345e;
                                break;
                            }
                            this.f46346f++;
                            this.f46347g = i5 + 1;
                            this.f46344d++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f46344d = i4 + 1;
                        m26198t0();
                        i = this.f46344d;
                        i2 = this.f46345e;
                    }
                } else {
                    if (c != '#') {
                        this.f46344d = i3;
                        return c;
                    }
                    this.f46344d = i3;
                    m26191o();
                    m26198t0();
                    i = this.f46344d;
                    i2 = this.f46345e;
                }
            }
            i = i3;
        }
    }

    /* renamed from: i0 */
    public final void m26186i0() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
        this.f46348h = 0;
        int[] iArr = this.f46355o;
        int i = this.f46353m - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: m */
    public final void m26187m() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 3) {
            m26195q0(1);
            this.f46355o[this.f46353m - 1] = 0;
            this.f46348h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f46344d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f46344d = r2;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m26188m0(char r11) throws p000.C8014Nm0 {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f46344d
            int r3 = r10.f46345e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f46343c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f46344d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f46344d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.m26196r0()
            r1.append(r2)
            int r2 = r10.f46344d
            int r3 = r10.f46345e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f46346f
            int r2 = r2 + r6
            r10.f46346f = r2
            r10.f46347g = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f46344d = r2
            boolean r2 = r10.m26175A(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.m26202w0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11820yc0.m26188m0(char):java.lang.String");
    }

    /* renamed from: n */
    public final void m26189n() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 1) {
            m26195q0(3);
            this.f46348h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
    }

    /* renamed from: n0 */
    public final String m26190n0() {
        String str;
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p == 10) {
            str = m26192o0();
        } else if (iM26193p == 8) {
            str = m26188m0('\'');
        } else if (iM26193p == 9) {
            str = m26188m0('\"');
        } else if (iM26193p == 11) {
            str = this.f46351k;
            this.f46351k = null;
        } else if (iM26193p == 15) {
            str = Long.toString(this.f46349i);
        } else {
            if (iM26193p != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
            }
            str = new String(this.f46343c, this.f46344d, this.f46350j);
            this.f46344d += this.f46350j;
        }
        this.f46348h = 0;
        int[] iArr = this.f46355o;
        int i = this.f46353m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* renamed from: o */
    public final void m26191o() throws C8014Nm0 {
        if (this.f46342b) {
            return;
        }
        m26202w0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m26191o();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m26192o0() throws p000.C8014Nm0 {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f46344d
            int r4 = r3 + r2
            int r5 = r7.f46345e
            char[] r6 = r7.f46343c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m26191o()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m26175A(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f46344d
            r0.append(r6, r3, r2)
            int r3 = r7.f46344d
            int r3 = r3 + r2
            r7.f46344d = r3
            r2 = 1
            boolean r2 = r7.m26175A(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f46344d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f46344d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f46344d
            int r2 = r2 + r1
            r7.f46344d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11820yc0.m26192o0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0210, code lost:
    
        if (m26178S(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m26193p() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11820yc0.m26193p():int");
    }

    /* renamed from: p0 */
    public final int m26194p0() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        switch (iM26193p) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q0 */
    public final void m26195q0(int i) {
        int i2 = this.f46353m;
        int[] iArr = this.f46352l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f46352l = Arrays.copyOf(iArr, i3);
            this.f46355o = Arrays.copyOf(this.f46355o, i3);
            this.f46354n = (String[]) Arrays.copyOf(this.f46354n, i3);
        }
        int[] iArr2 = this.f46352l;
        int i4 = this.f46353m;
        this.f46353m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: r0 */
    public final char m26196r0() throws C8014Nm0 {
        int i;
        if (this.f46344d == this.f46345e && !m26175A(1)) {
            m26202w0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f46344d;
        int i3 = i2 + 1;
        this.f46344d = i3;
        char[] cArr = this.f46343c;
        char c = cArr[i2];
        if (c == '\n') {
            this.f46346f++;
            this.f46347g = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                m26202w0("Invalid escape sequence");
                throw null;
            }
            if (i2 + 5 > this.f46345e && !m26175A(4)) {
                m26202w0("Unterminated escape sequence");
                throw null;
            }
            int i4 = this.f46344d;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = cArr[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f46344d, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.f46344d += 4;
            return c2;
        }
        return c;
    }

    /* renamed from: s0 */
    public final void m26197s0(char c) throws C8014Nm0 {
        do {
            int i = this.f46344d;
            int i2 = this.f46345e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f46343c[i];
                if (c2 == c) {
                    this.f46344d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f46344d = i3;
                    m26196r0();
                    i = this.f46344d;
                    i2 = this.f46345e;
                } else {
                    if (c2 == '\n') {
                        this.f46346f++;
                        this.f46347g = i3;
                    }
                    i = i3;
                }
            }
            this.f46344d = i;
        } while (m26175A(1));
        m26202w0("Unterminated string");
        throw null;
    }

    /* renamed from: t0 */
    public final void m26198t0() {
        char c;
        do {
            if (this.f46344d >= this.f46345e && !m26175A(1)) {
                return;
            }
            int i = this.f46344d;
            int i2 = i + 1;
            this.f46344d = i2;
            c = this.f46343c[i];
            if (c == '\n') {
                this.f46346f++;
                this.f46347g = i2;
                return;
            }
        } while (c != '\r');
    }

    public final String toString() {
        return C11820yc0.class.getSimpleName() + m26179U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m26191o();
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26199u0() throws p000.C8014Nm0 {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f46344d
            int r2 = r1 + r0
            int r3 = r4.f46345e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f46343c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m26191o()
        L4b:
            int r1 = r4.f46344d
            int r1 = r1 + r0
            r4.f46344d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f46344d = r1
            r0 = 1
            boolean r0 = r4.m26175A(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11820yc0.m26199u0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v0 */
    public final void m26200v0() throws IOException {
        int i = 0;
        do {
            int iM26193p = this.f46348h;
            if (iM26193p == 0) {
                iM26193p = m26193p();
            }
            switch (iM26193p) {
                case 1:
                    m26195q0(3);
                    i++;
                    this.f46348h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f46354n[this.f46353m - 1] = null;
                    }
                    this.f46353m--;
                    i--;
                    this.f46348h = 0;
                    break;
                case 3:
                    m26195q0(1);
                    i++;
                    this.f46348h = 0;
                    break;
                case 4:
                    this.f46353m--;
                    i--;
                    this.f46348h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f46348h = 0;
                    break;
                case 8:
                    m26197s0('\'');
                    this.f46348h = 0;
                    break;
                case 9:
                    m26197s0('\"');
                    this.f46348h = 0;
                    break;
                case 10:
                    m26199u0();
                    this.f46348h = 0;
                    break;
                case 12:
                    m26197s0('\'');
                    if (i == 0) {
                        this.f46354n[this.f46353m - 1] = "<skipped>";
                    }
                    this.f46348h = 0;
                    break;
                case 13:
                    m26197s0('\"');
                    if (i == 0) {
                        this.f46354n[this.f46353m - 1] = "<skipped>";
                    }
                    this.f46348h = 0;
                    break;
                case 14:
                    m26199u0();
                    if (i == 0) {
                        this.f46354n[this.f46353m - 1] = "<skipped>";
                    }
                    this.f46348h = 0;
                    break;
                case 16:
                    this.f46344d += this.f46350j;
                    this.f46348h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f46355o;
        int i2 = this.f46353m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* renamed from: w */
    public final void m26201w() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
        int i = this.f46353m;
        this.f46353m = i - 1;
        int[] iArr = this.f46355o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f46348h = 0;
    }

    /* renamed from: w0 */
    public final void m26202w0(String str) throws C8014Nm0 {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o(str);
        sbM26238o.append(m26179U());
        throw new C8014Nm0(sbM26238o.toString());
    }

    /* renamed from: x */
    public final void m26203x() {
        int iM26193p = this.f46348h;
        if (iM26193p == 0) {
            iM26193p = m26193p();
        }
        if (iM26193p != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0852NX.m5771t(m26194p0()) + m26179U());
        }
        int i = this.f46353m;
        int i2 = i - 1;
        this.f46353m = i2;
        this.f46354n[i2] = null;
        int[] iArr = this.f46355o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f46348h = 0;
    }
}
