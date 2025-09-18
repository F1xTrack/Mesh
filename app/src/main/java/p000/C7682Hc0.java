package p000;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: Hc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7682Hc0 extends AbstractC11947zc0 {

    /* renamed from: l */
    public static final C0551Ik f4365l;

    /* renamed from: m */
    public static final C0551Ik f4366m;

    /* renamed from: n */
    public static final C0551Ik f4367n;

    /* renamed from: f */
    public final C11917zN0 f4368f;

    /* renamed from: g */
    public final C6507nj f4369g;

    /* renamed from: h */
    public int f4370h;

    /* renamed from: i */
    public long f4371i;

    /* renamed from: j */
    public int f4372j;

    /* renamed from: k */
    public String f4373k;

    static {
        C0551Ik c0551Ik = C0551Ik.f5116d;
        f4365l = C1210TE.m7631D("'\\");
        f4366m = C1210TE.m7631D("\"\\");
        f4367n = C1210TE.m7631D("{}[]:, \n\t\r\f/\\;#=");
        C1210TE.m7631D("\n\r");
        C1210TE.m7631D("*/");
    }

    public C7682Hc0(C11917zN0 c11917zN0) {
        this.f46893b = new int[32];
        this.f46894c = new String[32];
        this.f46895d = new int[32];
        this.f4370h = 0;
        this.f4368f = c11917zN0;
        this.f4369g = c11917zN0.f46810b;
        m26479W(6);
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: A */
    public final boolean mo3513A() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 5) {
            this.f4370h = 0;
            int[] iArr = this.f46895d;
            int i = this.f46892a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM3522i0 == 6) {
            this.f4370h = 0;
            int[] iArr2 = this.f46895d;
            int i2 = this.f46892a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new C6838sg("Expected a boolean but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: D */
    public final double mo3514D() throws C6583ou, NumberFormatException, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 16) {
            this.f4370h = 0;
            int[] iArr = this.f46895d;
            int i = this.f46892a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f4371i;
        }
        if (iM3522i0 == 17) {
            long j = this.f4372j;
            C6507nj c6507nj = this.f4369g;
            c6507nj.getClass();
            this.f4373k = c6507nj.m23182d0(j, AbstractC7038vr.f44561a);
        } else if (iM3522i0 == 9) {
            this.f4373k = m3531q0(f4366m);
        } else if (iM3522i0 == 8) {
            this.f4373k = m3531q0(f4365l);
        } else if (iM3522i0 == 10) {
            this.f4373k = m3532r0();
        } else if (iM3522i0 != 11) {
            throw new C6838sg("Expected a double but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
        this.f4370h = 11;
        try {
            double d = Double.parseDouble(this.f4373k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C6583ou("JSON forbids NaN and infinities: " + d + " at path " + m26481w());
            }
            this.f4373k = null;
            this.f4370h = 0;
            int[] iArr2 = this.f46895d;
            int i2 = this.f46892a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new C6838sg("Expected a double but was " + this.f4373k + " at path " + m26481w());
        }
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: J */
    public final int mo3515J() throws C6583ou, NumberFormatException, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 16) {
            long j = this.f4371i;
            int i = (int) j;
            if (j == i) {
                this.f4370h = 0;
                int[] iArr = this.f46895d;
                int i2 = this.f46892a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C6838sg("Expected an int but was " + this.f4371i + " at path " + m26481w());
        }
        if (iM3522i0 == 17) {
            long j2 = this.f4372j;
            C6507nj c6507nj = this.f4369g;
            c6507nj.getClass();
            this.f4373k = c6507nj.m23182d0(j2, AbstractC7038vr.f44561a);
        } else if (iM3522i0 == 9 || iM3522i0 == 8) {
            String strM3531q0 = iM3522i0 == 9 ? m3531q0(f4366m) : m3531q0(f4365l);
            this.f4373k = strM3531q0;
            try {
                int i3 = Integer.parseInt(strM3531q0);
                this.f4370h = 0;
                int[] iArr2 = this.f46895d;
                int i4 = this.f46892a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM3522i0 != 11) {
            throw new C6838sg("Expected an int but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
        this.f4370h = 11;
        try {
            double d = Double.parseDouble(this.f4373k);
            int i5 = (int) d;
            if (i5 != d) {
                throw new C6838sg("Expected an int but was " + this.f4373k + " at path " + m26481w());
            }
            this.f4373k = null;
            this.f4370h = 0;
            int[] iArr3 = this.f46895d;
            int i6 = this.f46892a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C6838sg("Expected an int but was " + this.f4373k + " at path " + m26481w());
        }
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: S */
    public final String mo3516S() throws C6583ou, EOFException {
        String strM23182d0;
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 10) {
            strM23182d0 = m3532r0();
        } else if (iM3522i0 == 9) {
            strM23182d0 = m3531q0(f4366m);
        } else if (iM3522i0 == 8) {
            strM23182d0 = m3531q0(f4365l);
        } else if (iM3522i0 == 11) {
            strM23182d0 = this.f4373k;
            this.f4373k = null;
        } else if (iM3522i0 == 16) {
            strM23182d0 = Long.toString(this.f4371i);
        } else {
            if (iM3522i0 != 17) {
                throw new C6838sg("Expected a string but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
            }
            long j = this.f4372j;
            C6507nj c6507nj = this.f4369g;
            c6507nj.getClass();
            strM23182d0 = c6507nj.m23182d0(j, AbstractC7038vr.f44561a);
        }
        this.f4370h = 0;
        int[] iArr = this.f46895d;
        int i = this.f46892a - 1;
        iArr[i] = iArr[i] + 1;
        return strM23182d0;
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: U */
    public final int mo3517U() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        switch (iM3522i0) {
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

    @Override // p000.AbstractC11947zc0
    /* renamed from: X */
    public final int mo3518X(C1339VH c1339vh) throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 < 12 || iM3522i0 > 15) {
            return -1;
        }
        if (iM3522i0 == 15) {
            return m3524m0(this.f4373k, c1339vh);
        }
        int iMo4702B = this.f4368f.mo4702B((C7778Iy0) c1339vh.f12487c);
        if (iMo4702B != -1) {
            this.f4370h = 0;
            this.f46894c[this.f46892a - 1] = ((String[]) c1339vh.f12486b)[iMo4702B];
            return iMo4702B;
        }
        String str = this.f46894c[this.f46892a - 1];
        String strM3528o0 = m3528o0();
        int iM3524m0 = m3524m0(strM3528o0, c1339vh);
        if (iM3524m0 == -1) {
            this.f4370h = 15;
            this.f4373k = strM3528o0;
            this.f46894c[this.f46892a - 1] = str;
        }
        return iM3524m0;
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: b0 */
    public final void mo3519b0() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 14) {
            long jM26389o = this.f4368f.m26389o(f4367n);
            C6507nj c6507nj = this.f4369g;
            if (jM26389o == -1) {
                jM26389o = c6507nj.f38488b;
            }
            c6507nj.m23185i0(jM26389o);
        } else if (iM3522i0 == 13) {
            m3534t0(f4366m);
        } else if (iM3522i0 == 12) {
            m3534t0(f4365l);
        } else if (iM3522i0 != 15) {
            throw new C6838sg("Expected a name but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
        this.f4370h = 0;
        this.f46894c[this.f46892a - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4370h = 0;
        this.f46893b[0] = 8;
        this.f46892a = 1;
        this.f4369g.m23186m();
        this.f4368f.close();
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: d0 */
    public final void mo3520d0() throws C6583ou, EOFException {
        int i = 0;
        do {
            int iM3522i0 = this.f4370h;
            if (iM3522i0 == 0) {
                iM3522i0 = m3522i0();
            }
            if (iM3522i0 == 3) {
                m26479W(1);
            } else if (iM3522i0 == 1) {
                m26479W(3);
            } else {
                if (iM3522i0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C6838sg("Expected a value but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
                    }
                    this.f46892a--;
                } else if (iM3522i0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C6838sg("Expected a value but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
                    }
                    this.f46892a--;
                } else {
                    C6507nj c6507nj = this.f4369g;
                    if (iM3522i0 == 14 || iM3522i0 == 10) {
                        long jM26389o = this.f4368f.m26389o(f4367n);
                        if (jM26389o == -1) {
                            jM26389o = c6507nj.f38488b;
                        }
                        c6507nj.m23185i0(jM26389o);
                    } else if (iM3522i0 == 9 || iM3522i0 == 13) {
                        m3534t0(f4366m);
                    } else if (iM3522i0 == 8 || iM3522i0 == 12) {
                        m3534t0(f4365l);
                    } else if (iM3522i0 == 17) {
                        c6507nj.m23185i0(this.f4372j);
                    } else if (iM3522i0 == 18) {
                        throw new C6838sg("Expected a value but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
                    }
                }
                this.f4370h = 0;
            }
            i++;
            this.f4370h = 0;
        } while (i != 0);
        int[] iArr = this.f46895d;
        int i2 = this.f46892a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f46894c[i2] = "null";
    }

    /* renamed from: h0 */
    public final void m3521h0() throws C6583ou {
        m26480e0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0198, code lost:
    
        if (m3526n0(r1) != false) goto L114;
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
    
        r21.f4371i = r11;
        r9.m23185i0(r5);
        r1 = 16;
        r21.f4370h = 16;
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
    
        r21.f4372j = r5;
        r1 = 17;
        r21.f4370h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3522i0() throws p000.C6583ou, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7682Hc0.m3522i0():int");
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: m */
    public final void mo3523m() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 3) {
            m26479W(1);
            this.f46895d[this.f46892a - 1] = 0;
            this.f4370h = 0;
        } else {
            throw new C6838sg("Expected BEGIN_ARRAY but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
    }

    /* renamed from: m0 */
    public final int m3524m0(String str, C1339VH c1339vh) {
        int length = ((String[]) c1339vh.f12486b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c1339vh.f12486b)[i])) {
                this.f4370h = 0;
                this.f46894c[this.f46892a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: n */
    public final void mo3525n() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 1) {
            m26479W(3);
            this.f4370h = 0;
        } else {
            throw new C6838sg("Expected BEGIN_OBJECT but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
    }

    /* renamed from: n0 */
    public final boolean m3526n0(int i) throws C6583ou {
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
        m3521h0();
        throw null;
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: o */
    public final void mo3527o() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 != 4) {
            throw new C6838sg("Expected END_ARRAY but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
        int i = this.f46892a;
        this.f46892a = i - 1;
        int[] iArr = this.f46895d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f4370h = 0;
    }

    /* renamed from: o0 */
    public final String m3528o0() throws C6583ou, EOFException {
        String strM3531q0;
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 == 14) {
            strM3531q0 = m3532r0();
        } else if (iM3522i0 == 13) {
            strM3531q0 = m3531q0(f4366m);
        } else if (iM3522i0 == 12) {
            strM3531q0 = m3531q0(f4365l);
        } else {
            if (iM3522i0 != 15) {
                throw new C6838sg("Expected a name but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
            }
            strM3531q0 = this.f4373k;
        }
        this.f4370h = 0;
        this.f46894c[this.f46892a - 1] = strM3531q0;
        return strM3531q0;
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: p */
    public final void mo3529p() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        if (iM3522i0 != 2) {
            throw new C6838sg("Expected END_OBJECT but was " + AbstractC0852NX.m5770s(mo3517U()) + " at path " + m26481w());
        }
        int i = this.f46892a;
        int i2 = i - 1;
        this.f46892a = i2;
        this.f46894c[i2] = null;
        int[] iArr = this.f46895d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f4370h = 0;
    }

    /* renamed from: p0 */
    public final int m3530p0(boolean z) throws C6583ou, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C11917zN0 c11917zN0 = this.f4368f;
            if (!c11917zN0.mo4705R(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C6507nj c6507nj = this.f4369g;
            byte bM23202x = c6507nj.m23202x(j);
            if (bM23202x != 10 && bM23202x != 32 && bM23202x != 13 && bM23202x != 9) {
                c6507nj.m23185i0(j);
                if (bM23202x == 47) {
                    if (!c11917zN0.mo4705R(2L)) {
                        return bM23202x;
                    }
                    m3521h0();
                    throw null;
                }
                if (bM23202x != 35) {
                    return bM23202x;
                }
                m3521h0();
                throw null;
            }
            i = i2;
        }
    }

    /* renamed from: q0 */
    public final String m3531q0(C0551Ik c0551Ik) throws C6583ou, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jM26389o = this.f4368f.m26389o(c0551Ik);
            if (jM26389o == -1) {
                m26480e0("Unterminated string");
                throw null;
            }
            C6507nj c6507nj = this.f4369g;
            if (c6507nj.m23202x(jM26389o) != 92) {
                if (sb == null) {
                    String strM23182d0 = c6507nj.m23182d0(jM26389o, AbstractC7038vr.f44561a);
                    c6507nj.m23176J();
                    return strM23182d0;
                }
                sb.append(c6507nj.m23182d0(jM26389o, AbstractC7038vr.f44561a));
                c6507nj.m23176J();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c6507nj.m23182d0(jM26389o, AbstractC7038vr.f44561a));
            c6507nj.m23176J();
            sb.append(m3533s0());
        }
    }

    /* renamed from: r0 */
    public final String m3532r0() {
        long jM26389o = this.f4368f.m26389o(f4367n);
        C6507nj c6507nj = this.f4369g;
        if (jM26389o == -1) {
            return c6507nj.m23183e0();
        }
        c6507nj.getClass();
        return c6507nj.m23182d0(jM26389o, AbstractC7038vr.f44561a);
    }

    /* renamed from: s0 */
    public final char m3533s0() throws C6583ou, EOFException {
        int i;
        C11917zN0 c11917zN0 = this.f4368f;
        if (!c11917zN0.mo4705R(1L)) {
            m26480e0("Unterminated escape sequence");
            throw null;
        }
        C6507nj c6507nj = this.f4369g;
        byte bM23176J = c6507nj.m23176J();
        if (bM23176J == 10 || bM23176J == 34 || bM23176J == 39 || bM23176J == 47 || bM23176J == 92) {
            return (char) bM23176J;
        }
        if (bM23176J == 98) {
            return '\b';
        }
        if (bM23176J == 102) {
            return '\f';
        }
        if (bM23176J == 110) {
            return '\n';
        }
        if (bM23176J == 114) {
            return '\r';
        }
        if (bM23176J == 116) {
            return '\t';
        }
        if (bM23176J != 117) {
            m26480e0("Invalid escape sequence: \\" + ((char) bM23176J));
            throw null;
        }
        if (!c11917zN0.mo4705R(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m26481w());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bM23202x = c6507nj.m23202x(i2);
            char c2 = (char) (c << 4);
            if (bM23202x >= 48 && bM23202x <= 57) {
                i = bM23202x - 48;
            } else if (bM23202x >= 97 && bM23202x <= 102) {
                i = bM23202x - 87;
            } else {
                if (bM23202x < 65 || bM23202x > 70) {
                    m26480e0("\\u".concat(c6507nj.m23182d0(4L, AbstractC7038vr.f44561a)));
                    throw null;
                }
                i = bM23202x - 55;
            }
            c = (char) (i + c2);
        }
        c6507nj.m23185i0(4L);
        return c;
    }

    /* renamed from: t0 */
    public final void m3534t0(C0551Ik c0551Ik) throws C6583ou, EOFException {
        while (true) {
            long jM26389o = this.f4368f.m26389o(c0551Ik);
            if (jM26389o == -1) {
                m26480e0("Unterminated string");
                throw null;
            }
            C6507nj c6507nj = this.f4369g;
            if (c6507nj.m23202x(jM26389o) != 92) {
                c6507nj.m23185i0(jM26389o + 1);
                return;
            } else {
                c6507nj.m23185i0(jM26389o + 1);
                m3533s0();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f4368f + ")";
    }

    @Override // p000.AbstractC11947zc0
    /* renamed from: x */
    public final boolean mo3535x() throws C6583ou, EOFException {
        int iM3522i0 = this.f4370h;
        if (iM3522i0 == 0) {
            iM3522i0 = m3522i0();
        }
        return (iM3522i0 == 2 || iM3522i0 == 4 || iM3522i0 == 18) ? false : true;
    }
}
