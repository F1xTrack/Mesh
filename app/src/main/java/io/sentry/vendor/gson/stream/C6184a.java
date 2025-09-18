package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;
import p000.C6583ou;

/* renamed from: io.sentry.vendor.gson.stream.a */
/* loaded from: classes2.dex */
public final class C6184a implements Closeable {

    /* renamed from: a */
    public final Reader f34681a;

    /* renamed from: i */
    public long f34689i;

    /* renamed from: j */
    public int f34690j;

    /* renamed from: k */
    public String f34691k;

    /* renamed from: l */
    public int[] f34692l;

    /* renamed from: n */
    public String[] f34694n;

    /* renamed from: o */
    public int[] f34695o;

    /* renamed from: b */
    public boolean f34682b = false;

    /* renamed from: c */
    public final char[] f34683c = new char[1024];

    /* renamed from: d */
    public int f34684d = 0;

    /* renamed from: e */
    public int f34685e = 0;

    /* renamed from: f */
    public int f34686f = 0;

    /* renamed from: g */
    public int f34687g = 0;

    /* renamed from: h */
    public int f34688h = 0;

    /* renamed from: m */
    public int f34693m = 1;

    public C6184a(Reader reader) {
        int[] iArr = new int[32];
        this.f34692l = iArr;
        iArr[0] = 6;
        this.f34694n = new String[32];
        this.f34695o = new int[32];
        this.f34681a = reader;
    }

    /* renamed from: A */
    public final boolean m21893A(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f34687g;
        int i5 = this.f34684d;
        this.f34687g = i4 - i5;
        int i6 = this.f34685e;
        char[] cArr = this.f34683c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f34685e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f34685e = 0;
        }
        this.f34684d = 0;
        do {
            int i8 = this.f34685e;
            int i9 = this.f34681a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f34685e + i9;
            this.f34685e = i2;
            if (this.f34686f == 0 && (i3 = this.f34687g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f34684d++;
                this.f34687g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: D */
    public final boolean m21894D() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        return (iM21911p == 2 || iM21911p == 4) ? false : true;
    }

    /* renamed from: J */
    public final boolean m21895J(char c) {
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
        m21909o();
        return false;
    }

    /* renamed from: S */
    public final String m21896S() {
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m(" at line ", " column ", this.f34686f + 1, (this.f34684d - this.f34687g) + 1, " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.f34693m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f34692l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f34695o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f34694n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbM8594m.append(sb.toString());
        return sbM8594m.toString();
    }

    /* renamed from: U */
    public final boolean m21897U() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 5) {
            this.f34688h = 0;
            int[] iArr = this.f34695o;
            int i = this.f34693m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM21911p != 6) {
            throw new IllegalStateException("Expected a boolean but was " + m21910o0() + m21896S());
        }
        this.f34688h = 0;
        int[] iArr2 = this.f34695o;
        int i2 = this.f34693m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* renamed from: W */
    public final double m21898W() throws C6583ou, NumberFormatException {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 15) {
            this.f34688h = 0;
            int[] iArr = this.f34695o;
            int i = this.f34693m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f34689i;
        }
        if (iM21911p == 16) {
            this.f34691k = new String(this.f34683c, this.f34684d, this.f34690j);
            this.f34684d += this.f34690j;
        } else if (iM21911p == 8 || iM21911p == 9) {
            this.f34691k = m21904i0(iM21911p == 8 ? '\'' : '\"');
        } else if (iM21911p == 10) {
            this.f34691k = m21908n0();
        } else if (iM21911p != 11) {
            throw new IllegalStateException("Expected a double but was " + m21910o0() + m21896S());
        }
        this.f34688h = 11;
        double d = Double.parseDouble(this.f34691k);
        if (!this.f34682b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C6583ou("JSON forbids NaN and infinities: " + d + m21896S());
        }
        this.f34691k = null;
        this.f34688h = 0;
        int[] iArr2 = this.f34695o;
        int i2 = this.f34693m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* renamed from: X */
    public final int m21899X() throws NumberFormatException {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 15) {
            long j = this.f34689i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f34689i + m21896S());
            }
            this.f34688h = 0;
            int[] iArr = this.f34695o;
            int i2 = this.f34693m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM21911p == 16) {
            this.f34691k = new String(this.f34683c, this.f34684d, this.f34690j);
            this.f34684d += this.f34690j;
        } else {
            if (iM21911p != 8 && iM21911p != 9 && iM21911p != 10) {
                throw new IllegalStateException("Expected an int but was " + m21910o0() + m21896S());
            }
            if (iM21911p == 10) {
                this.f34691k = m21908n0();
            } else {
                this.f34691k = m21904i0(iM21911p == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f34691k);
                this.f34688h = 0;
                int[] iArr2 = this.f34695o;
                int i4 = this.f34693m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f34688h = 11;
        double d = Double.parseDouble(this.f34691k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f34691k + m21896S());
        }
        this.f34691k = null;
        this.f34688h = 0;
        int[] iArr3 = this.f34695o;
        int i6 = this.f34693m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* renamed from: b0 */
    public final long m21900b0() throws NumberFormatException {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 15) {
            this.f34688h = 0;
            int[] iArr = this.f34695o;
            int i = this.f34693m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f34689i;
        }
        if (iM21911p == 16) {
            this.f34691k = new String(this.f34683c, this.f34684d, this.f34690j);
            this.f34684d += this.f34690j;
        } else {
            if (iM21911p != 8 && iM21911p != 9 && iM21911p != 10) {
                throw new IllegalStateException("Expected a long but was " + m21910o0() + m21896S());
            }
            if (iM21911p == 10) {
                this.f34691k = m21908n0();
            } else {
                this.f34691k = m21904i0(iM21911p == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f34691k);
                this.f34688h = 0;
                int[] iArr2 = this.f34695o;
                int i2 = this.f34693m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f34688h = 11;
        double d = Double.parseDouble(this.f34691k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f34691k + m21896S());
        }
        this.f34691k = null;
        this.f34688h = 0;
        int[] iArr3 = this.f34695o;
        int i3 = this.f34693m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34688h = 0;
        this.f34692l[0] = 8;
        this.f34693m = 1;
        this.f34681a.close();
    }

    /* renamed from: d0 */
    public final String m21901d0() {
        String strM21904i0;
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 14) {
            strM21904i0 = m21908n0();
        } else if (iM21911p == 12) {
            strM21904i0 = m21904i0('\'');
        } else {
            if (iM21911p != 13) {
                throw new IllegalStateException("Expected a name but was " + m21910o0() + m21896S());
            }
            strM21904i0 = m21904i0('\"');
        }
        this.f34688h = 0;
        this.f34694n[this.f34693m - 1] = strM21904i0;
        return strM21904i0;
    }

    /* renamed from: e0 */
    public final int m21902e0(boolean z) throws IOException {
        int i = this.f34684d;
        int i2 = this.f34685e;
        while (true) {
            if (i == i2) {
                this.f34684d = i;
                if (!m21893A(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m21896S());
                }
                i = this.f34684d;
                i2 = this.f34685e;
            }
            int i3 = i + 1;
            char[] cArr = this.f34683c;
            char c = cArr[i];
            if (c == '\n') {
                this.f34686f++;
                this.f34687g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f34684d = i3;
                    if (i3 == i2) {
                        this.f34684d = i;
                        boolean zM21893A = m21893A(2);
                        this.f34684d++;
                        if (!zM21893A) {
                            return c;
                        }
                    }
                    m21909o();
                    int i4 = this.f34684d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f34684d = i4 + 1;
                        while (true) {
                            if (this.f34684d + 2 > this.f34685e && !m21893A(2)) {
                                m21916t0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f34684d;
                            if (cArr[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (cArr[this.f34684d + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                i = this.f34684d + 2;
                                i2 = this.f34685e;
                                break;
                            }
                            this.f34686f++;
                            this.f34687g = i5 + 1;
                            this.f34684d++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f34684d = i4 + 1;
                        m21915s0();
                        i = this.f34684d;
                        i2 = this.f34685e;
                    }
                } else {
                    if (c != '#') {
                        this.f34684d = i3;
                        return c;
                    }
                    this.f34684d = i3;
                    m21909o();
                    m21915s0();
                    i = this.f34684d;
                    i2 = this.f34685e;
                }
            }
            i = i3;
        }
    }

    /* renamed from: h0 */
    public final void m21903h0() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p != 7) {
            throw new IllegalStateException("Expected null but was " + m21910o0() + m21896S());
        }
        this.f34688h = 0;
        int[] iArr = this.f34695o;
        int i = this.f34693m - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f34684d = r8;
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
        r10.f34684d = r2;
     */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m21904i0(char r11) throws p000.C6583ou {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f34684d
            int r3 = r10.f34685e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f34683c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f34684d = r8
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
            r10.f34684d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.m21913q0()
            r1.append(r2)
            int r2 = r10.f34684d
            int r3 = r10.f34685e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f34686f
            int r2 = r2 + r6
            r10.f34686f = r2
            r10.f34687g = r8
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
            r10.f34684d = r2
            boolean r2 = r10.m21893A(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.m21916t0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C6184a.m21904i0(char):java.lang.String");
    }

    /* renamed from: m */
    public final void m21905m() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 3) {
            m21912p0(1);
            this.f34695o[this.f34693m - 1] = 0;
            this.f34688h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m21910o0() + m21896S());
        }
    }

    /* renamed from: m0 */
    public final String m21906m0() {
        String str;
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 10) {
            str = m21908n0();
        } else if (iM21911p == 8) {
            str = m21904i0('\'');
        } else if (iM21911p == 9) {
            str = m21904i0('\"');
        } else if (iM21911p == 11) {
            str = this.f34691k;
            this.f34691k = null;
        } else if (iM21911p == 15) {
            str = Long.toString(this.f34689i);
        } else {
            if (iM21911p != 16) {
                throw new IllegalStateException("Expected a string but was " + m21910o0() + m21896S());
            }
            str = new String(this.f34683c, this.f34684d, this.f34690j);
            this.f34684d += this.f34690j;
        }
        this.f34688h = 0;
        int[] iArr = this.f34695o;
        int i = this.f34693m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* renamed from: n */
    public final void m21907n() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p == 1) {
            m21912p0(3);
            this.f34688h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m21910o0() + m21896S());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m21909o();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m21908n0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f34684d
            int r4 = r3 + r2
            int r5 = r7.f34685e
            char[] r6 = r7.f34683c
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
            r7.m21909o()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m21893A(r3)
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
            int r3 = r7.f34684d
            r0.append(r6, r3, r2)
            int r3 = r7.f34684d
            int r3 = r3 + r2
            r7.f34684d = r3
            r2 = 1
            boolean r2 = r7.m21893A(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f34684d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f34684d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f34684d
            int r2 = r2 + r1
            r7.f34684d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C6184a.m21908n0():java.lang.String");
    }

    /* renamed from: o */
    public final void m21909o() {
        if (this.f34682b) {
            return;
        }
        m21916t0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: o0 */
    public final EnumC6185b m21910o0() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        switch (iM21911p) {
            case 1:
                return EnumC6185b.BEGIN_OBJECT;
            case 2:
                return EnumC6185b.END_OBJECT;
            case 3:
                return EnumC6185b.BEGIN_ARRAY;
            case 4:
                return EnumC6185b.END_ARRAY;
            case 5:
            case 6:
                return EnumC6185b.BOOLEAN;
            case 7:
                return EnumC6185b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC6185b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC6185b.NAME;
            case 15:
            case 16:
                return EnumC6185b.NUMBER;
            case 17:
                return EnumC6185b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0211, code lost:
    
        if (m21895J(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m21911p() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C6184a.m21911p():int");
    }

    /* renamed from: p0 */
    public final void m21912p0(int i) {
        int i2 = this.f34693m;
        int[] iArr = this.f34692l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f34692l = Arrays.copyOf(iArr, i3);
            this.f34695o = Arrays.copyOf(this.f34695o, i3);
            this.f34694n = (String[]) Arrays.copyOf(this.f34694n, i3);
        }
        int[] iArr2 = this.f34692l;
        int i4 = this.f34693m;
        this.f34693m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: q0 */
    public final char m21913q0() throws C6583ou {
        int i;
        if (this.f34684d == this.f34685e && !m21893A(1)) {
            m21916t0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f34684d;
        int i3 = i2 + 1;
        this.f34684d = i3;
        char[] cArr = this.f34683c;
        char c = cArr[i2];
        if (c == '\n') {
            this.f34686f++;
            this.f34687g = i3;
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
                m21916t0("Invalid escape sequence");
                throw null;
            }
            if (i2 + 5 > this.f34685e && !m21893A(4)) {
                m21916t0("Unterminated escape sequence");
                throw null;
            }
            int i4 = this.f34684d;
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
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f34684d, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.f34684d += 4;
            return c2;
        }
        return c;
    }

    /* renamed from: r0 */
    public final void m21914r0(char c) {
        do {
            int i = this.f34684d;
            int i2 = this.f34685e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f34683c[i];
                if (c2 == c) {
                    this.f34684d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f34684d = i3;
                    m21913q0();
                    i = this.f34684d;
                    i2 = this.f34685e;
                } else {
                    if (c2 == '\n') {
                        this.f34686f++;
                        this.f34687g = i3;
                    }
                    i = i3;
                }
            }
            this.f34684d = i;
        } while (m21893A(1));
        m21916t0("Unterminated string");
        throw null;
    }

    /* renamed from: s0 */
    public final void m21915s0() {
        char c;
        do {
            if (this.f34684d >= this.f34685e && !m21893A(1)) {
                return;
            }
            int i = this.f34684d;
            int i2 = i + 1;
            this.f34684d = i2;
            c = this.f34683c[i];
            if (c == '\n') {
                this.f34686f++;
                this.f34687g = i2;
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: t0 */
    public final void m21916t0(String str) throws C6583ou {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o(str);
        sbM26238o.append(m21896S());
        throw new C6583ou(sbM26238o.toString());
    }

    public final String toString() {
        return C6184a.class.getSimpleName() + m21896S();
    }

    /* renamed from: w */
    public final void m21917w() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + m21910o0() + m21896S());
        }
        int i = this.f34693m;
        this.f34693m = i - 1;
        int[] iArr = this.f34695o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f34688h = 0;
    }

    /* renamed from: x */
    public final void m21918x() {
        int iM21911p = this.f34688h;
        if (iM21911p == 0) {
            iM21911p = m21911p();
        }
        if (iM21911p != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + m21910o0() + m21896S());
        }
        int i = this.f34693m;
        int i2 = i - 1;
        this.f34693m = i2;
        this.f34694n[i2] = null;
        int[] iArr = this.f34695o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f34688h = 0;
    }
}
