package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: km1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5567km1 extends AbstractC4089h51 {
    public C2359bc1 n;
    public int o;
    public boolean p;
    public C1258Px q;
    public C7409uQ0 r;

    @Override // defpackage.AbstractC4089h51
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        C1258Px c1258Px = this.q;
        this.o = c1258Px != null ? c1258Px.e : 0;
    }

    @Override // defpackage.AbstractC4089h51
    public final long b(C4103hA0 c4103hA0) {
        byte b = c4103hA0.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C2359bc1 c2359bc1 = this.n;
        YN1.h(c2359bc1);
        boolean z = ((FC[]) c2359bc1.e)[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - c2359bc1.a))].a;
        C1258Px c1258Px = (C1258Px) c2359bc1.b;
        int i = !z ? c1258Px.e : c1258Px.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = c4103hA0.a;
        int length = bArr.length;
        int i2 = c4103hA0.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            c4103hA0.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            c4103hA0.F(i2);
        }
        byte[] bArr2 = c4103hA0.a;
        int i3 = c4103hA0.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.AbstractC4089h51
    public final boolean c(C4103hA0 c4103hA0, long j, CC0 cc0) throws C5643lA0 {
        C2359bc1 c2359bc1;
        C1258Px c1258Px;
        C1258Px c1258Px2;
        byte[] bArr;
        long jFloor;
        if (this.n != null) {
            ((C6666qX) cc0.b).getClass();
            return false;
        }
        C1258Px c1258Px3 = this.q;
        int i = 4;
        if (c1258Px3 == null) {
            U02.e(1, c4103hA0, false);
            c4103hA0.m();
            int iU = c4103hA0.u();
            int iM = c4103hA0.m();
            int i2 = c4103hA0.i();
            if (i2 <= 0) {
                i2 = -1;
            }
            int i3 = c4103hA0.i();
            int i4 = i3 <= 0 ? -1 : i3;
            c4103hA0.i();
            int iU2 = c4103hA0.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            c4103hA0.u();
            byte[] bArrCopyOf = Arrays.copyOf(c4103hA0.a, c4103hA0.c);
            C1258Px c1258Px4 = new C1258Px();
            c1258Px4.a = iU;
            c1258Px4.b = iM;
            c1258Px4.c = i2;
            c1258Px4.d = i4;
            c1258Px4.e = iPow;
            c1258Px4.f = iPow2;
            c1258Px4.g = bArrCopyOf;
            this.q = c1258Px4;
        } else {
            C7409uQ0 c7409uQ0 = this.r;
            if (c7409uQ0 == null) {
                this.r = U02.d(c4103hA0, true, true);
            } else {
                int i5 = c4103hA0.c;
                byte[] bArr2 = new byte[i5];
                System.arraycopy(c4103hA0.a, 0, bArr2, 0, i5);
                int i6 = 5;
                U02.e(5, c4103hA0, false);
                int iU3 = c4103hA0.u() + 1;
                C0848Kq c0848Kq = new C0848Kq(c4103hA0.a);
                c0848Kq.w(c4103hA0.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iU3) {
                        C1258Px c1258Px5 = c1258Px3;
                        byte[] bArr3 = bArr2;
                        int i10 = 6;
                        int iL = c0848Kq.l(6) + 1;
                        for (int i11 = 0; i11 < iL; i11++) {
                            if (c0848Kq.l(16) != 0) {
                                throw C5643lA0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iL2 = c0848Kq.l(6) + 1;
                        int i12 = 0;
                        while (true) {
                            int i13 = 3;
                            if (i12 < iL2) {
                                int iL3 = c0848Kq.l(i9);
                                if (iL3 == 0) {
                                    int i14 = 8;
                                    c0848Kq.w(8);
                                    c0848Kq.w(16);
                                    c0848Kq.w(16);
                                    c0848Kq.w(6);
                                    c0848Kq.w(8);
                                    int iL4 = c0848Kq.l(4) + 1;
                                    int i15 = 0;
                                    while (i15 < iL4) {
                                        c0848Kq.w(i14);
                                        i15++;
                                        i14 = 8;
                                    }
                                } else {
                                    if (iL3 != 1) {
                                        throw C5643lA0.a(null, "floor type greater than 1 not decodable: " + iL3);
                                    }
                                    int iL5 = c0848Kq.l(5);
                                    int[] iArr = new int[iL5];
                                    int i16 = -1;
                                    for (int i17 = 0; i17 < iL5; i17++) {
                                        int iL6 = c0848Kq.l(4);
                                        iArr[i17] = iL6;
                                        if (iL6 > i16) {
                                            i16 = iL6;
                                        }
                                    }
                                    int i18 = i16 + 1;
                                    int[] iArr2 = new int[i18];
                                    int i19 = 0;
                                    while (i19 < i18) {
                                        iArr2[i19] = c0848Kq.l(i13) + 1;
                                        int iL7 = c0848Kq.l(i8);
                                        int i20 = 8;
                                        if (iL7 > 0) {
                                            c0848Kq.w(8);
                                        }
                                        int i21 = 0;
                                        while (i21 < (1 << iL7)) {
                                            c0848Kq.w(i20);
                                            i21++;
                                            i20 = 8;
                                        }
                                        i19++;
                                        i13 = 3;
                                        i8 = 2;
                                    }
                                    c0848Kq.w(i8);
                                    int iL8 = c0848Kq.l(4);
                                    int i22 = 0;
                                    int i23 = 0;
                                    for (int i24 = 0; i24 < iL5; i24++) {
                                        i22 += iArr2[iArr[i24]];
                                        while (i23 < i22) {
                                            c0848Kq.w(iL8);
                                            i23++;
                                        }
                                    }
                                }
                                i12++;
                                i10 = 6;
                                i9 = 16;
                                i8 = 2;
                            } else {
                                int iL9 = c0848Kq.l(i10) + 1;
                                int i25 = 0;
                                while (i25 < iL9) {
                                    if (c0848Kq.l(16) > 2) {
                                        throw C5643lA0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0848Kq.w(24);
                                    c0848Kq.w(24);
                                    c0848Kq.w(24);
                                    int iL10 = c0848Kq.l(i10) + 1;
                                    int i26 = 8;
                                    c0848Kq.w(8);
                                    int[] iArr3 = new int[iL10];
                                    for (int i27 = 0; i27 < iL10; i27++) {
                                        iArr3[i27] = ((c0848Kq.k() ? c0848Kq.l(5) : 0) * 8) + c0848Kq.l(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < iL10) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr3[i28] & (1 << i29)) != 0) {
                                                c0848Kq.w(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i25++;
                                    i10 = 6;
                                }
                                int iL11 = c0848Kq.l(i10) + 1;
                                int i30 = 0;
                                while (i30 < iL11) {
                                    int iL12 = c0848Kq.l(16);
                                    if (iL12 != 0) {
                                        AbstractC6789rA1.d("mapping type other than 0 not supported: " + iL12);
                                        c1258Px = c1258Px5;
                                    } else {
                                        int iL13 = c0848Kq.k() ? c0848Kq.l(4) + 1 : 1;
                                        boolean zK = c0848Kq.k();
                                        c1258Px = c1258Px5;
                                        int i31 = c1258Px.a;
                                        if (zK) {
                                            int iL14 = c0848Kq.l(8) + 1;
                                            for (int i32 = 0; i32 < iL14; i32++) {
                                                int i33 = i31 - 1;
                                                c0848Kq.w(U02.b(i33));
                                                c0848Kq.w(U02.b(i33));
                                            }
                                        }
                                        if (c0848Kq.l(2) != 0) {
                                            throw C5643lA0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iL13 > 1) {
                                            for (int i34 = 0; i34 < i31; i34++) {
                                                c0848Kq.w(4);
                                            }
                                        }
                                        for (int i35 = 0; i35 < iL13; i35++) {
                                            c0848Kq.w(8);
                                            c0848Kq.w(8);
                                            c0848Kq.w(8);
                                        }
                                    }
                                    i30++;
                                    c1258Px5 = c1258Px;
                                }
                                C1258Px c1258Px6 = c1258Px5;
                                int iL15 = c0848Kq.l(6);
                                int i36 = iL15 + 1;
                                FC[] fcArr = new FC[i36];
                                for (int i37 = 0; i37 < i36; i37++) {
                                    boolean zK2 = c0848Kq.k();
                                    c0848Kq.l(16);
                                    c0848Kq.l(16);
                                    c0848Kq.l(8);
                                    fcArr[i37] = new FC(zK2, false);
                                }
                                if (!c0848Kq.k()) {
                                    throw C5643lA0.a(null, "framing bit after modes not set as expected");
                                }
                                c2359bc1 = new C2359bc1(c1258Px6, c7409uQ0, bArr3, fcArr, U02.b(iL15));
                            }
                        }
                    } else {
                        if (c0848Kq.l(24) != 5653314) {
                            throw C5643lA0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0848Kq.d * 8) + c0848Kq.e));
                        }
                        int iL16 = c0848Kq.l(16);
                        int iL17 = c0848Kq.l(24);
                        if (c0848Kq.k()) {
                            c0848Kq.w(i6);
                            for (int iL18 = 0; iL18 < iL17; iL18 += c0848Kq.l(U02.b(iL17 - iL18))) {
                            }
                        } else {
                            boolean zK3 = c0848Kq.k();
                            for (int i38 = 0; i38 < iL17; i38++) {
                                if (!zK3) {
                                    c0848Kq.w(i6);
                                } else if (c0848Kq.k()) {
                                    c0848Kq.w(i6);
                                }
                            }
                        }
                        int iL19 = c0848Kq.l(i);
                        if (iL19 > 2) {
                            throw C5643lA0.a(null, "lookup type greater than 2 not decodable: " + iL19);
                        }
                        if (iL19 == 1 || iL19 == 2) {
                            c0848Kq.w(32);
                            c0848Kq.w(32);
                            int iL20 = c0848Kq.l(i) + 1;
                            c0848Kq.w(1);
                            if (iL19 != 1) {
                                c1258Px2 = c1258Px3;
                                bArr = bArr2;
                                jFloor = iL17 * iL16;
                            } else if (iL16 != 0) {
                                c1258Px2 = c1258Px3;
                                bArr = bArr2;
                                jFloor = (long) Math.floor(Math.pow(iL17, 1.0d / iL16));
                            } else {
                                c1258Px2 = c1258Px3;
                                bArr = bArr2;
                                jFloor = 0;
                            }
                            c0848Kq.w((int) (jFloor * iL20));
                        } else {
                            c1258Px2 = c1258Px3;
                            bArr = bArr2;
                        }
                        i7++;
                        c1258Px3 = c1258Px2;
                        bArr2 = bArr;
                        i = 4;
                        i6 = 5;
                    }
                }
            }
        }
        c2359bc1 = null;
        this.n = c2359bc1;
        if (c2359bc1 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C1258Px c1258Px7 = (C1258Px) c2359bc1.b;
        arrayList.add((byte[]) c1258Px7.g);
        arrayList.add((byte[]) c2359bc1.d);
        C0540Gr0 c0540Gr0C = U02.c(P70.v((String[]) ((C7409uQ0) c2359bc1.c).a));
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("audio/vorbis");
        c6475pX.g = c1258Px7.d;
        c6475pX.h = c1258Px7.c;
        c6475pX.z = c1258Px7.a;
        c6475pX.A = c1258Px7.b;
        c6475pX.o = arrayList;
        c6475pX.j = c0540Gr0C;
        cc0.b = new C6666qX(c6475pX);
        return true;
    }

    @Override // defpackage.AbstractC4089h51
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
