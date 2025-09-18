package p000;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: km1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10052km1 extends AbstractC9582h51 {

    /* renamed from: n */
    public C8875bc1 f36687n;

    /* renamed from: o */
    public int f36688o;

    /* renamed from: p */
    public boolean f36689p;

    /* renamed from: q */
    public C1004Px f36690q;

    /* renamed from: r */
    public C11287uQ0 f36691r;

    @Override // p000.AbstractC9582h51
    /* renamed from: a */
    public final void mo18722a(long j) {
        this.f28252g = j;
        this.f36689p = j != 0;
        C1004Px c1004Px = this.f36690q;
        this.f36688o = c1004Px != null ? c1004Px.f9369e : 0;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: b */
    public final long mo5171b(C9591hA0 c9591hA0) {
        byte b = c9591hA0.f28293a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C8875bc1 c8875bc1 = this.f36687n;
        YN1.m9283h(c8875bc1);
        boolean z = ((C0328FC[]) c8875bc1.f17092e)[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - c8875bc1.f17088a))].f3086a;
        C1004Px c1004Px = (C1004Px) c8875bc1.f17089b;
        int i = !z ? c1004Px.f9369e : c1004Px.f9370f;
        long j = this.f36689p ? (this.f36688o + i) / 4 : 0;
        byte[] bArr = c9591hA0.f28293a;
        int length = bArr.length;
        int i2 = c9591hA0.f28295c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            c9591hA0.m18739E(bArrCopyOf.length, bArrCopyOf);
        } else {
            c9591hA0.m18740F(i2);
        }
        byte[] bArr2 = c9591hA0.f28293a;
        int i3 = c9591hA0.f28295c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f36689p = true;
        this.f36688o = i;
        return j;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: c */
    public final boolean mo5172c(C9591hA0 c9591hA0, long j, CC0 cc0) throws C10103lA0 {
        C8875bc1 c8875bc1;
        C1004Px c1004Px;
        C1004Px c1004Px2;
        byte[] bArr;
        long jFloor;
        if (this.f36687n != null) {
            ((C6686qX) cc0.f1250b).getClass();
            return false;
        }
        C1004Px c1004Px3 = this.f36690q;
        int i = 4;
        if (c1004Px3 == null) {
            U02.m7862e(1, c9591hA0, false);
            c9591hA0.m18755m();
            int iM18763u = c9591hA0.m18763u();
            int iM18755m = c9591hA0.m18755m();
            int iM18751i = c9591hA0.m18751i();
            if (iM18751i <= 0) {
                iM18751i = -1;
            }
            int iM18751i2 = c9591hA0.m18751i();
            int i2 = iM18751i2 <= 0 ? -1 : iM18751i2;
            c9591hA0.m18751i();
            int iM18763u2 = c9591hA0.m18763u();
            int iPow = (int) Math.pow(2.0d, iM18763u2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM18763u2 & 240) >> 4);
            c9591hA0.m18763u();
            byte[] bArrCopyOf = Arrays.copyOf(c9591hA0.f28293a, c9591hA0.f28295c);
            C1004Px c1004Px4 = new C1004Px();
            c1004Px4.f9365a = iM18763u;
            c1004Px4.f9366b = iM18755m;
            c1004Px4.f9367c = iM18751i;
            c1004Px4.f9368d = i2;
            c1004Px4.f9369e = iPow;
            c1004Px4.f9370f = iPow2;
            c1004Px4.f9371g = bArrCopyOf;
            this.f36690q = c1004Px4;
        } else {
            C11287uQ0 c11287uQ0 = this.f36691r;
            if (c11287uQ0 == null) {
                this.f36691r = U02.m7861d(c9591hA0, true, true);
            } else {
                int i3 = c9591hA0.f28295c;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(c9591hA0.f28293a, 0, bArr2, 0, i3);
                int i4 = 5;
                U02.m7862e(5, c9591hA0, false);
                int iM18763u3 = c9591hA0.m18763u() + 1;
                C0683Kq c0683Kq = new C0683Kq(c9591hA0.f28293a);
                c0683Kq.m4763w(c9591hA0.f28294b * 8);
                int i5 = 0;
                while (true) {
                    int i6 = 2;
                    int i7 = 16;
                    if (i5 >= iM18763u3) {
                        C1004Px c1004Px5 = c1004Px3;
                        byte[] bArr3 = bArr2;
                        int i8 = 6;
                        int iM4752l = c0683Kq.m4752l(6) + 1;
                        for (int i9 = 0; i9 < iM4752l; i9++) {
                            if (c0683Kq.m4752l(16) != 0) {
                                throw C10103lA0.m22366a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iM4752l2 = c0683Kq.m4752l(6) + 1;
                        int i10 = 0;
                        while (true) {
                            int i11 = 3;
                            if (i10 < iM4752l2) {
                                int iM4752l3 = c0683Kq.m4752l(i7);
                                if (iM4752l3 == 0) {
                                    int i12 = 8;
                                    c0683Kq.m4763w(8);
                                    c0683Kq.m4763w(16);
                                    c0683Kq.m4763w(16);
                                    c0683Kq.m4763w(6);
                                    c0683Kq.m4763w(8);
                                    int iM4752l4 = c0683Kq.m4752l(4) + 1;
                                    int i13 = 0;
                                    while (i13 < iM4752l4) {
                                        c0683Kq.m4763w(i12);
                                        i13++;
                                        i12 = 8;
                                    }
                                } else {
                                    if (iM4752l3 != 1) {
                                        throw C10103lA0.m22366a(null, "floor type greater than 1 not decodable: " + iM4752l3);
                                    }
                                    int iM4752l5 = c0683Kq.m4752l(5);
                                    int[] iArr = new int[iM4752l5];
                                    int i14 = -1;
                                    for (int i15 = 0; i15 < iM4752l5; i15++) {
                                        int iM4752l6 = c0683Kq.m4752l(4);
                                        iArr[i15] = iM4752l6;
                                        if (iM4752l6 > i14) {
                                            i14 = iM4752l6;
                                        }
                                    }
                                    int i16 = i14 + 1;
                                    int[] iArr2 = new int[i16];
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        iArr2[i17] = c0683Kq.m4752l(i11) + 1;
                                        int iM4752l7 = c0683Kq.m4752l(i6);
                                        int i18 = 8;
                                        if (iM4752l7 > 0) {
                                            c0683Kq.m4763w(8);
                                        }
                                        int i19 = 0;
                                        while (i19 < (1 << iM4752l7)) {
                                            c0683Kq.m4763w(i18);
                                            i19++;
                                            i18 = 8;
                                        }
                                        i17++;
                                        i11 = 3;
                                        i6 = 2;
                                    }
                                    c0683Kq.m4763w(i6);
                                    int iM4752l8 = c0683Kq.m4752l(4);
                                    int i20 = 0;
                                    int i21 = 0;
                                    for (int i22 = 0; i22 < iM4752l5; i22++) {
                                        i20 += iArr2[iArr[i22]];
                                        while (i21 < i20) {
                                            c0683Kq.m4763w(iM4752l8);
                                            i21++;
                                        }
                                    }
                                }
                                i10++;
                                i8 = 6;
                                i7 = 16;
                                i6 = 2;
                            } else {
                                int iM4752l9 = c0683Kq.m4752l(i8) + 1;
                                int i23 = 0;
                                while (i23 < iM4752l9) {
                                    if (c0683Kq.m4752l(16) > 2) {
                                        throw C10103lA0.m22366a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0683Kq.m4763w(24);
                                    c0683Kq.m4763w(24);
                                    c0683Kq.m4763w(24);
                                    int iM4752l10 = c0683Kq.m4752l(i8) + 1;
                                    int i24 = 8;
                                    c0683Kq.m4763w(8);
                                    int[] iArr3 = new int[iM4752l10];
                                    for (int i25 = 0; i25 < iM4752l10; i25++) {
                                        iArr3[i25] = ((c0683Kq.m4751k() ? c0683Kq.m4752l(5) : 0) * 8) + c0683Kq.m4752l(3);
                                    }
                                    int i26 = 0;
                                    while (i26 < iM4752l10) {
                                        int i27 = 0;
                                        while (i27 < i24) {
                                            if ((iArr3[i26] & (1 << i27)) != 0) {
                                                c0683Kq.m4763w(i24);
                                            }
                                            i27++;
                                            i24 = 8;
                                        }
                                        i26++;
                                        i24 = 8;
                                    }
                                    i23++;
                                    i8 = 6;
                                }
                                int iM4752l11 = c0683Kq.m4752l(i8) + 1;
                                int i28 = 0;
                                while (i28 < iM4752l11) {
                                    int iM4752l12 = c0683Kq.m4752l(16);
                                    if (iM4752l12 != 0) {
                                        AbstractC10872rA1.m24171d("mapping type other than 0 not supported: " + iM4752l12);
                                        c1004Px = c1004Px5;
                                    } else {
                                        int iM4752l13 = c0683Kq.m4751k() ? c0683Kq.m4752l(4) + 1 : 1;
                                        boolean zM4751k = c0683Kq.m4751k();
                                        c1004Px = c1004Px5;
                                        int i29 = c1004Px.f9365a;
                                        if (zM4751k) {
                                            int iM4752l14 = c0683Kq.m4752l(8) + 1;
                                            for (int i30 = 0; i30 < iM4752l14; i30++) {
                                                int i31 = i29 - 1;
                                                c0683Kq.m4763w(U02.m7859b(i31));
                                                c0683Kq.m4763w(U02.m7859b(i31));
                                            }
                                        }
                                        if (c0683Kq.m4752l(2) != 0) {
                                            throw C10103lA0.m22366a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM4752l13 > 1) {
                                            for (int i32 = 0; i32 < i29; i32++) {
                                                c0683Kq.m4763w(4);
                                            }
                                        }
                                        for (int i33 = 0; i33 < iM4752l13; i33++) {
                                            c0683Kq.m4763w(8);
                                            c0683Kq.m4763w(8);
                                            c0683Kq.m4763w(8);
                                        }
                                    }
                                    i28++;
                                    c1004Px5 = c1004Px;
                                }
                                C1004Px c1004Px6 = c1004Px5;
                                int iM4752l15 = c0683Kq.m4752l(6);
                                int i34 = iM4752l15 + 1;
                                C0328FC[] c0328fcArr = new C0328FC[i34];
                                for (int i35 = 0; i35 < i34; i35++) {
                                    boolean zM4751k2 = c0683Kq.m4751k();
                                    c0683Kq.m4752l(16);
                                    c0683Kq.m4752l(16);
                                    c0683Kq.m4752l(8);
                                    c0328fcArr[i35] = new C0328FC(zM4751k2, false);
                                }
                                if (!c0683Kq.m4751k()) {
                                    throw C10103lA0.m22366a(null, "framing bit after modes not set as expected");
                                }
                                c8875bc1 = new C8875bc1(c1004Px6, c11287uQ0, bArr3, c0328fcArr, U02.m7859b(iM4752l15));
                            }
                        }
                    } else {
                        if (c0683Kq.m4752l(24) != 5653314) {
                            throw C10103lA0.m22366a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0683Kq.f6327d * 8) + c0683Kq.f6328e));
                        }
                        int iM4752l16 = c0683Kq.m4752l(16);
                        int iM4752l17 = c0683Kq.m4752l(24);
                        if (c0683Kq.m4751k()) {
                            c0683Kq.m4763w(i4);
                            for (int iM4752l18 = 0; iM4752l18 < iM4752l17; iM4752l18 += c0683Kq.m4752l(U02.m7859b(iM4752l17 - iM4752l18))) {
                            }
                        } else {
                            boolean zM4751k3 = c0683Kq.m4751k();
                            for (int i36 = 0; i36 < iM4752l17; i36++) {
                                if (!zM4751k3) {
                                    c0683Kq.m4763w(i4);
                                } else if (c0683Kq.m4751k()) {
                                    c0683Kq.m4763w(i4);
                                }
                            }
                        }
                        int iM4752l19 = c0683Kq.m4752l(i);
                        if (iM4752l19 > 2) {
                            throw C10103lA0.m22366a(null, "lookup type greater than 2 not decodable: " + iM4752l19);
                        }
                        if (iM4752l19 == 1 || iM4752l19 == 2) {
                            c0683Kq.m4763w(32);
                            c0683Kq.m4763w(32);
                            int iM4752l20 = c0683Kq.m4752l(i) + 1;
                            c0683Kq.m4763w(1);
                            if (iM4752l19 != 1) {
                                c1004Px2 = c1004Px3;
                                bArr = bArr2;
                                jFloor = iM4752l17 * iM4752l16;
                            } else if (iM4752l16 != 0) {
                                c1004Px2 = c1004Px3;
                                bArr = bArr2;
                                jFloor = (long) Math.floor(Math.pow(iM4752l17, 1.0d / iM4752l16));
                            } else {
                                c1004Px2 = c1004Px3;
                                bArr = bArr2;
                                jFloor = 0;
                            }
                            c0683Kq.m4763w((int) (jFloor * iM4752l20));
                        } else {
                            c1004Px2 = c1004Px3;
                            bArr = bArr2;
                        }
                        i5++;
                        c1004Px3 = c1004Px2;
                        bArr2 = bArr;
                        i = 4;
                        i4 = 5;
                    }
                }
            }
        }
        c8875bc1 = null;
        this.f36687n = c8875bc1;
        if (c8875bc1 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C1004Px c1004Px7 = (C1004Px) c8875bc1.f17089b;
        arrayList.add((byte[]) c1004Px7.f9371g);
        arrayList.add((byte[]) c8875bc1.f17091d);
        C7660Gr0 c7660Gr0M7860c = U02.m7860c(P70.m6235v((String[]) ((C11287uQ0) c8875bc1.f17090c).f43693a));
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/vorbis");
        c6623pX.f40156g = c1004Px7.f9368d;
        c6623pX.f40157h = c1004Px7.f9367c;
        c6623pX.f40175z = c1004Px7.f9365a;
        c6623pX.f40141A = c1004Px7.f9366b;
        c6623pX.f40164o = arrayList;
        c6623pX.f40159j = c7660Gr0M7860c;
        cc0.f1250b = new C6686qX(c6623pX);
        return true;
    }

    @Override // p000.AbstractC9582h51
    /* renamed from: d */
    public final void mo5173d(boolean z) {
        super.mo5173d(z);
        if (z) {
            this.f36687n = null;
            this.f36690q = null;
            this.f36691r = null;
        }
        this.f36688o = 0;
        this.f36689p = false;
    }
}
