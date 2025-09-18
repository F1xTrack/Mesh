package p000;

import android.util.Pair;

/* renamed from: L9 */
/* loaded from: classes.dex */
public abstract class AbstractC0703L9 {

    /* renamed from: a */
    public static final byte[] f6518a;

    static {
        int i = AbstractC7485Dh1.f2166a;
        f6518a = "OpusHead".getBytes(AbstractC7227yr.f46511c);
    }

    /* renamed from: a */
    public static C0451H9 m4906a(int i, C9591hA0 c9591hA0) {
        c9591hA0.m18741G(i + 12);
        c9591hA0.m18742H(1);
        m4907b(c9591hA0);
        c9591hA0.m18742H(2);
        int iM18763u = c9591hA0.m18763u();
        if ((iM18763u & 128) != 0) {
            c9591hA0.m18742H(2);
        }
        if ((iM18763u & 64) != 0) {
            c9591hA0.m18742H(c9591hA0.m18763u());
        }
        if ((iM18763u & 32) != 0) {
            c9591hA0.m18742H(2);
        }
        c9591hA0.m18742H(1);
        m4907b(c9591hA0);
        String strM9162e = AbstractC8544Xr0.m9162e(c9591hA0.m18763u());
        if ("audio/mpeg".equals(strM9162e) || "audio/vnd.dts".equals(strM9162e) || "audio/vnd.dts.hd".equals(strM9162e)) {
            return new C0451H9(-1L, strM9162e, -1L, null);
        }
        c9591hA0.m18742H(4);
        long jM18765w = c9591hA0.m18765w();
        long jM18765w2 = c9591hA0.m18765w();
        c9591hA0.m18742H(1);
        int iM4907b = m4907b(c9591hA0);
        byte[] bArr = new byte[iM4907b];
        c9591hA0.m18747e(bArr, 0, iM4907b);
        if (jM18765w2 <= 0) {
            jM18765w2 = -1;
        }
        return new C0451H9(jM18765w2, strM9162e, jM18765w > 0 ? jM18765w : -1L, bArr);
    }

    /* renamed from: b */
    public static int m4907b(C9591hA0 c9591hA0) {
        int iM18763u = c9591hA0.m18763u();
        int i = iM18763u & 127;
        while ((iM18763u & 128) == 128) {
            iM18763u = c9591hA0.m18763u();
            i = (i << 7) | (iM18763u & 127);
        }
        return i;
    }

    /* renamed from: c */
    public static C8908bt0 m4908c(C9591hA0 c9591hA0) {
        long jM18757o;
        long jM18757o2;
        c9591hA0.m18741G(8);
        if (AbstractC0325F9.m2497s(c9591hA0.m18749g()) == 0) {
            jM18757o = c9591hA0.m18765w();
            jM18757o2 = c9591hA0.m18765w();
        } else {
            jM18757o = c9591hA0.m18757o();
            jM18757o2 = c9591hA0.m18757o();
        }
        return new C8908bt0(jM18757o, jM18757o2, c9591hA0.m18765w());
    }

    /* renamed from: d */
    public static Pair m4909d(C9591hA0 c9591hA0, int i, int i2) throws C10103lA0 {
        Integer num;
        C8045Ob1 c8045Ob1;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = c9591hA0.f28294b;
        while (i5 - i < i2) {
            c9591hA0.m18741G(i5);
            int iM18749g = c9591hA0.m18749g();
            U02.m7858a("childAtomSize must be positive", iM18749g > 0);
            if (c9591hA0.m18749g() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String strM18761s = null;
                Integer numValueOf = null;
                while (i6 - i5 < iM18749g) {
                    c9591hA0.m18741G(i6);
                    int iM18749g2 = c9591hA0.m18749g();
                    int iM18749g3 = c9591hA0.m18749g();
                    if (iM18749g3 == 1718775137) {
                        numValueOf = Integer.valueOf(c9591hA0.m18749g());
                    } else if (iM18749g3 == 1935894637) {
                        c9591hA0.m18742H(4);
                        strM18761s = c9591hA0.m18761s(4, AbstractC7227yr.f46511c);
                    } else if (iM18749g3 == 1935894633) {
                        i8 = i6;
                        i7 = iM18749g2;
                    }
                    i6 += iM18749g2;
                }
                if ("cenc".equals(strM18761s) || "cbc1".equals(strM18761s) || "cens".equals(strM18761s) || "cbcs".equals(strM18761s)) {
                    U02.m7858a("frma atom is mandatory", numValueOf != null);
                    U02.m7858a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            c8045Ob1 = null;
                            break;
                        }
                        c9591hA0.m18741G(i9);
                        int iM18749g4 = c9591hA0.m18749g();
                        if (c9591hA0.m18749g() == 1952804451) {
                            int iM2497s = AbstractC0325F9.m2497s(c9591hA0.m18749g());
                            c9591hA0.m18742H(1);
                            if (iM2497s == 0) {
                                c9591hA0.m18742H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iM18763u = c9591hA0.m18763u();
                                int i10 = (iM18763u & 240) >> 4;
                                i3 = iM18763u & 15;
                                i4 = i10;
                            }
                            boolean z = c9591hA0.m18763u() == 1;
                            int iM18763u2 = c9591hA0.m18763u();
                            byte[] bArr2 = new byte[16];
                            c9591hA0.m18747e(bArr2, 0, 16);
                            if (z && iM18763u2 == 0) {
                                int iM18763u3 = c9591hA0.m18763u();
                                byte[] bArr3 = new byte[iM18763u3];
                                c9591hA0.m18747e(bArr3, 0, iM18763u3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            c8045Ob1 = new C8045Ob1(z, strM18761s, iM18763u2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iM18749g4;
                        }
                    }
                    U02.m7858a("tenc atom is mandatory", c8045Ob1 != null);
                    int i11 = AbstractC7485Dh1.f2166a;
                    pairCreate = Pair.create(num, c8045Ob1);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM18749g;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0d28  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C0577J9 m4910e(p000.C9591hA0 r62, int r63, int r64, java.lang.String r65, p000.C0589JL r66, boolean r67) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 4112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0703L9.m4910e(hA0, int, int, java.lang.String, JL, boolean):J9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r3 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05c9 A[ADDED_TO_REGION, LOOP:13: B:233:0x05c9->B:237:0x05d4, LOOP_START, PHI: r16
  0x05c9: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:232:0x05c7, B:237:0x05d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05bc A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m4911f(p000.C0199D9 r45, p000.C9439g00 r46, long r47, p000.C0589JL r49, boolean r50, boolean r51, p000.InterfaceC6560oZ r52) {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0703L9.m4911f(D9, g00, long, JL, boolean, boolean, oZ):java.util.ArrayList");
    }
}
