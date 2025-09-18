package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: Hc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573Hc0 extends AbstractC8396zc0 {
    public static final C0674Ik l;
    public static final C0674Ik m;
    public static final C0674Ik n;
    public final C8351zN0 f;
    public final C6129nj g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        C0674Ik c0674Ik = C0674Ik.d;
        l = TE.D("'\\");
        m = TE.D("\"\\");
        n = TE.D("{}[]:, \n\t\r\f/\\;#=");
        TE.D("\n\r");
        TE.D("*/");
    }

    public C0573Hc0(C8351zN0 c8351zN0) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = c8351zN0;
        this.g = c8351zN0.b;
        W(6);
    }

    @Override // defpackage.AbstractC8396zc0
    public final boolean A() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iI0 == 6) {
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new C7074sg("Expected a boolean but was " + NX.s(U()) + " at path " + w());
    }

    @Override // defpackage.AbstractC8396zc0
    public final double D() throws C6353ou, NumberFormatException, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iI0 == 17) {
            long j = this.j;
            C6129nj c6129nj = this.g;
            c6129nj.getClass();
            this.k = c6129nj.d0(j, AbstractC7680vr.a);
        } else if (iI0 == 9) {
            this.k = q0(m);
        } else if (iI0 == 8) {
            this.k = q0(l);
        } else if (iI0 == 10) {
            this.k = r0();
        } else if (iI0 != 11) {
            throw new C7074sg("Expected a double but was " + NX.s(U()) + " at path " + w());
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C6353ou("JSON forbids NaN and infinities: " + d + " at path " + w());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new C7074sg("Expected a double but was " + this.k + " at path " + w());
        }
    }

    @Override // defpackage.AbstractC8396zc0
    public final int J() throws C6353ou, NumberFormatException, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C7074sg("Expected an int but was " + this.i + " at path " + w());
        }
        if (iI0 == 17) {
            long j2 = this.j;
            C6129nj c6129nj = this.g;
            c6129nj.getClass();
            this.k = c6129nj.d0(j2, AbstractC7680vr.a);
        } else if (iI0 == 9 || iI0 == 8) {
            String strQ0 = iI0 == 9 ? q0(m) : q0(l);
            this.k = strQ0;
            try {
                int i3 = Integer.parseInt(strQ0);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iI0 != 11) {
            throw new C7074sg("Expected an int but was " + NX.s(U()) + " at path " + w());
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            int i5 = (int) d;
            if (i5 != d) {
                throw new C7074sg("Expected an int but was " + this.k + " at path " + w());
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C7074sg("Expected an int but was " + this.k + " at path " + w());
        }
    }

    @Override // defpackage.AbstractC8396zc0
    public final String S() throws C6353ou, EOFException {
        String strD0;
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 10) {
            strD0 = r0();
        } else if (iI0 == 9) {
            strD0 = q0(m);
        } else if (iI0 == 8) {
            strD0 = q0(l);
        } else if (iI0 == 11) {
            strD0 = this.k;
            this.k = null;
        } else if (iI0 == 16) {
            strD0 = Long.toString(this.i);
        } else {
            if (iI0 != 17) {
                throw new C7074sg("Expected a string but was " + NX.s(U()) + " at path " + w());
            }
            long j = this.j;
            C6129nj c6129nj = this.g;
            c6129nj.getClass();
            strD0 = c6129nj.d0(j, AbstractC7680vr.a);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strD0;
    }

    @Override // defpackage.AbstractC8396zc0
    public final int U() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        switch (iI0) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.AbstractC8396zc0
    public final int X(VH vh) throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 < 12 || iI0 > 15) {
            return -1;
        }
        if (iI0 == 15) {
            return m0(this.k, vh);
        }
        int iB = this.f.B((C0717Iy0) vh.c);
        if (iB != -1) {
            this.h = 0;
            this.c[this.a - 1] = ((String[]) vh.b)[iB];
            return iB;
        }
        String str = this.c[this.a - 1];
        String strO0 = o0();
        int iM0 = m0(strO0, vh);
        if (iM0 == -1) {
            this.h = 15;
            this.k = strO0;
            this.c[this.a - 1] = str;
        }
        return iM0;
    }

    @Override // defpackage.AbstractC8396zc0
    public final void b0() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 14) {
            long jO = this.f.o(n);
            C6129nj c6129nj = this.g;
            if (jO == -1) {
                jO = c6129nj.b;
            }
            c6129nj.i0(jO);
        } else if (iI0 == 13) {
            t0(m);
        } else if (iI0 == 12) {
            t0(l);
        } else if (iI0 != 15) {
            throw new C7074sg("Expected a name but was " + NX.s(U()) + " at path " + w());
        }
        this.h = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.m();
        this.f.close();
    }

    @Override // defpackage.AbstractC8396zc0
    public final void d0() throws C6353ou, EOFException {
        int i = 0;
        do {
            int iI0 = this.h;
            if (iI0 == 0) {
                iI0 = i0();
            }
            if (iI0 == 3) {
                W(1);
            } else if (iI0 == 1) {
                W(3);
            } else {
                if (iI0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C7074sg("Expected a value but was " + NX.s(U()) + " at path " + w());
                    }
                    this.a--;
                } else if (iI0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C7074sg("Expected a value but was " + NX.s(U()) + " at path " + w());
                    }
                    this.a--;
                } else {
                    C6129nj c6129nj = this.g;
                    if (iI0 == 14 || iI0 == 10) {
                        long jO = this.f.o(n);
                        if (jO == -1) {
                            jO = c6129nj.b;
                        }
                        c6129nj.i0(jO);
                    } else if (iI0 == 9 || iI0 == 13) {
                        t0(m);
                    } else if (iI0 == 8 || iI0 == 12) {
                        t0(l);
                    } else if (iI0 == 17) {
                        c6129nj.i0(this.j);
                    } else if (iI0 == 18) {
                        throw new C7074sg("Expected a value but was " + NX.s(U()) + " at path " + w());
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void h0() throws C6353ou {
        e0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0198, code lost:
    
        if (n0(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019a, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x019c, code lost:
    
        if (r10 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a2, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a4, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01aa, code lost:
    
        if (r11 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ac, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ae, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b1, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b2, code lost:
    
        r21.i = r11;
        r9.i0(r5);
        r1 = 16;
        r21.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01bc, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01bf, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c2, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c5, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c7, code lost:
    
        r21.j = r5;
        r1 = 17;
        r21.h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i0() throws defpackage.C6353ou, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0573Hc0.i0():int");
    }

    @Override // defpackage.AbstractC8396zc0
    public final void m() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 3) {
            W(1);
            this.d[this.a - 1] = 0;
            this.h = 0;
        } else {
            throw new C7074sg("Expected BEGIN_ARRAY but was " + NX.s(U()) + " at path " + w());
        }
    }

    public final int m0(String str, VH vh) {
        int length = ((String[]) vh.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) vh.b)[i])) {
                this.h = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC8396zc0
    public final void n() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 1) {
            W(3);
            this.h = 0;
        } else {
            throw new C7074sg("Expected BEGIN_OBJECT but was " + NX.s(U()) + " at path " + w());
        }
    }

    public final boolean n0(int i) throws C6353ou {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h0();
        throw null;
    }

    @Override // defpackage.AbstractC8396zc0
    public final void o() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 != 4) {
            throw new C7074sg("Expected END_ARRAY but was " + NX.s(U()) + " at path " + w());
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    public final String o0() throws C6353ou, EOFException {
        String strQ0;
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 == 14) {
            strQ0 = r0();
        } else if (iI0 == 13) {
            strQ0 = q0(m);
        } else if (iI0 == 12) {
            strQ0 = q0(l);
        } else {
            if (iI0 != 15) {
                throw new C7074sg("Expected a name but was " + NX.s(U()) + " at path " + w());
            }
            strQ0 = this.k;
        }
        this.h = 0;
        this.c[this.a - 1] = strQ0;
        return strQ0;
    }

    @Override // defpackage.AbstractC8396zc0
    public final void p() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        if (iI0 != 2) {
            throw new C7074sg("Expected END_OBJECT but was " + NX.s(U()) + " at path " + w());
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public final int p0(boolean z) throws C6353ou, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C8351zN0 c8351zN0 = this.f;
            if (!c8351zN0.R(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C6129nj c6129nj = this.g;
            byte bX = c6129nj.x(j);
            if (bX != 10 && bX != 32 && bX != 13 && bX != 9) {
                c6129nj.i0(j);
                if (bX == 47) {
                    if (!c8351zN0.R(2L)) {
                        return bX;
                    }
                    h0();
                    throw null;
                }
                if (bX != 35) {
                    return bX;
                }
                h0();
                throw null;
            }
            i = i2;
        }
    }

    public final String q0(C0674Ik c0674Ik) throws C6353ou, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jO = this.f.o(c0674Ik);
            if (jO == -1) {
                e0("Unterminated string");
                throw null;
            }
            C6129nj c6129nj = this.g;
            if (c6129nj.x(jO) != 92) {
                if (sb == null) {
                    String strD0 = c6129nj.d0(jO, AbstractC7680vr.a);
                    c6129nj.J();
                    return strD0;
                }
                sb.append(c6129nj.d0(jO, AbstractC7680vr.a));
                c6129nj.J();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c6129nj.d0(jO, AbstractC7680vr.a));
            c6129nj.J();
            sb.append(s0());
        }
    }

    public final String r0() {
        long jO = this.f.o(n);
        C6129nj c6129nj = this.g;
        if (jO == -1) {
            return c6129nj.e0();
        }
        c6129nj.getClass();
        return c6129nj.d0(jO, AbstractC7680vr.a);
    }

    public final char s0() throws C6353ou, EOFException {
        int i;
        C8351zN0 c8351zN0 = this.f;
        if (!c8351zN0.R(1L)) {
            e0("Unterminated escape sequence");
            throw null;
        }
        C6129nj c6129nj = this.g;
        byte bJ = c6129nj.J();
        if (bJ == 10 || bJ == 34 || bJ == 39 || bJ == 47 || bJ == 92) {
            return (char) bJ;
        }
        if (bJ == 98) {
            return '\b';
        }
        if (bJ == 102) {
            return '\f';
        }
        if (bJ == 110) {
            return '\n';
        }
        if (bJ == 114) {
            return '\r';
        }
        if (bJ == 116) {
            return '\t';
        }
        if (bJ != 117) {
            e0("Invalid escape sequence: \\" + ((char) bJ));
            throw null;
        }
        if (!c8351zN0.R(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + w());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bX = c6129nj.x(i2);
            char c2 = (char) (c << 4);
            if (bX >= 48 && bX <= 57) {
                i = bX - 48;
            } else if (bX >= 97 && bX <= 102) {
                i = bX - 87;
            } else {
                if (bX < 65 || bX > 70) {
                    e0("\\u".concat(c6129nj.d0(4L, AbstractC7680vr.a)));
                    throw null;
                }
                i = bX - 55;
            }
            c = (char) (i + c2);
        }
        c6129nj.i0(4L);
        return c;
    }

    public final void t0(C0674Ik c0674Ik) throws C6353ou, EOFException {
        while (true) {
            long jO = this.f.o(c0674Ik);
            if (jO == -1) {
                e0("Unterminated string");
                throw null;
            }
            C6129nj c6129nj = this.g;
            if (c6129nj.x(jO) != 92) {
                c6129nj.i0(jO + 1);
                return;
            } else {
                c6129nj.i0(jO + 1);
                s0();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // defpackage.AbstractC8396zc0
    public final boolean x() throws C6353ou, EOFException {
        int iI0 = this.h;
        if (iI0 == 0) {
            iI0 = i0();
        }
        return (iI0 == 2 || iI0 == 4 || iI0 == 18) ? false : true;
    }
}
