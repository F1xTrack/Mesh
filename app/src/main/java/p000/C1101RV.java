package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: RV */
/* loaded from: classes.dex */
public final class C1101RV implements InterfaceC1412WR {

    /* renamed from: e */
    public InterfaceC1538YR f10206e;

    /* renamed from: f */
    public InterfaceC8357Ub1 f10207f;

    /* renamed from: h */
    public C7660Gr0 f10209h;

    /* renamed from: i */
    public C1290UV f10210i;

    /* renamed from: j */
    public int f10211j;

    /* renamed from: k */
    public int f10212k;

    /* renamed from: l */
    public C1039QV f10213l;

    /* renamed from: m */
    public int f10214m;

    /* renamed from: n */
    public long f10215n;

    /* renamed from: a */
    public final byte[] f10202a = new byte[42];

    /* renamed from: b */
    public final C9591hA0 f10203b = new C9591hA0(new byte[32768], 0);

    /* renamed from: c */
    public final boolean f10204c = false;

    /* renamed from: d */
    public final C1164SV f10205d = new C1164SV();

    /* renamed from: g */
    public int f10208g = 0;

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws C10103lA0, EOFException, InterruptedIOException {
        C1290UV c1290uv;
        CX0 c4130gf;
        long j;
        boolean z;
        long j2;
        boolean zM17817a;
        boolean z2 = true;
        int i = this.f10208g;
        C7660Gr0 c7660Gr0 = null;
        if (i == 0) {
            ((C7000vF) interfaceC1475XR).f44297f = 0;
            C7000vF c7000vF = (C7000vF) interfaceC1475XR;
            long jMo3624j = c7000vF.mo3624j();
            C7660Gr0 c7660Gr0M879x = new C7391Bm1(21).m879x(c7000vF, !this.f10204c ? null : U50.f11650b);
            if (c7660Gr0M879x != null && c7660Gr0M879x.f3928a.length != 0) {
                c7660Gr0 = c7660Gr0M879x;
            }
            c7000vF.mo3627n((int) (c7000vF.mo3624j() - jMo3624j));
            this.f10209h = c7660Gr0;
            this.f10208g = 1;
            return 0;
        }
        byte[] bArr = this.f10202a;
        if (i == 1) {
            ((C7000vF) interfaceC1475XR).mo3620f(bArr, 0, bArr.length, false);
            ((C7000vF) interfaceC1475XR).f44297f = 0;
            this.f10208g = 2;
            return 0;
        }
        int i2 = 3;
        if (i == 2) {
            C9591hA0 c9591hA0 = new C9591hA0(4);
            ((C7000vF) interfaceC1475XR).mo3618b(c9591hA0.f28293a, 0, 4, false);
            if (c9591hA0.m18765w() != 1716281667) {
                throw C10103lA0.m22366a(null, "Failed to read FLAC stream marker.");
            }
            this.f10208g = 3;
            return 0;
        }
        if (i == 3) {
            ?? r1 = 0;
            C1290UV c1290uv2 = this.f10210i;
            boolean z3 = false;
            while (!z3) {
                ((C7000vF) interfaceC1475XR).f44297f = r1;
                byte[] bArr2 = new byte[4];
                C0683Kq c0683Kq = new C0683Kq(bArr2, 4);
                C7000vF c7000vF2 = (C7000vF) interfaceC1475XR;
                c7000vF2.mo3620f(bArr2, r1, 4, r1);
                boolean zM4751k = c0683Kq.m4751k();
                int iM4752l = c0683Kq.m4752l(i);
                int iM4752l2 = c0683Kq.m4752l(24) + 4;
                if (iM4752l == 0) {
                    byte[] bArr3 = new byte[38];
                    c7000vF2.mo3618b(bArr3, r1, 38, r1);
                    c1290uv = new C1290UV(bArr3, 4);
                } else {
                    if (c1290uv2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM4752l == i2) {
                        C9591hA0 c9591hA02 = new C9591hA0(iM4752l2);
                        c7000vF2.mo3618b(c9591hA02.f28293a, 0, iM4752l2, false);
                        c1290uv = new C1290UV(c1290uv2.f11818a, c1290uv2.f11819b, c1290uv2.f11820c, c1290uv2.f11821d, c1290uv2.f11822e, c1290uv2.f11824g, c1290uv2.f11825h, c1290uv2.f11827j, AbstractC9316f12.m18156b(c9591hA02), c1290uv2.f11829l);
                    } else {
                        C7660Gr0 c7660Gr02 = c1290uv2.f11829l;
                        if (iM4752l == 4) {
                            C9591hA0 c9591hA03 = new C9591hA0(iM4752l2);
                            c7000vF2.mo3618b(c9591hA03.f28293a, 0, iM4752l2, false);
                            c9591hA03.m18742H(4);
                            C7660Gr0 c7660Gr0M7860c = U02.m7860c(Arrays.asList((String[]) U02.m7861d(c9591hA03, false, false).f43693a));
                            if (c7660Gr02 != null) {
                                c7660Gr0M7860c = c7660Gr02.m3182b(c7660Gr0M7860c);
                            }
                            c1290uv = new C1290UV(c1290uv2.f11818a, c1290uv2.f11819b, c1290uv2.f11820c, c1290uv2.f11821d, c1290uv2.f11822e, c1290uv2.f11824g, c1290uv2.f11825h, c1290uv2.f11827j, c1290uv2.f11828k, c7660Gr0M7860c);
                        } else if (iM4752l == 6) {
                            C9591hA0 c9591hA04 = new C9591hA0(iM4752l2);
                            c7000vF2.mo3618b(c9591hA04.f28293a, 0, iM4752l2, false);
                            c9591hA04.m18742H(4);
                            C7660Gr0 c7660Gr03 = new C7660Gr0(P70.m6229B(C8948cB0.m10617a(c9591hA04)));
                            if (c7660Gr02 != null) {
                                c7660Gr03 = c7660Gr02.m3182b(c7660Gr03);
                            }
                            c1290uv = new C1290UV(c1290uv2.f11818a, c1290uv2.f11819b, c1290uv2.f11820c, c1290uv2.f11821d, c1290uv2.f11822e, c1290uv2.f11824g, c1290uv2.f11825h, c1290uv2.f11827j, c1290uv2.f11828k, c7660Gr03);
                        } else {
                            c7000vF2.mo3627n(iM4752l2);
                            int i3 = AbstractC7485Dh1.f2166a;
                            this.f10210i = c1290uv2;
                            z3 = zM4751k;
                            r1 = 0;
                            i2 = 3;
                            i = 7;
                        }
                    }
                }
                c1290uv2 = c1290uv;
                int i32 = AbstractC7485Dh1.f2166a;
                this.f10210i = c1290uv2;
                z3 = zM4751k;
                r1 = 0;
                i2 = 3;
                i = 7;
            }
            this.f10210i.getClass();
            this.f10211j = Math.max(this.f10210i.f11820c, 6);
            InterfaceC8357Ub1 interfaceC8357Ub1 = this.f10207f;
            int i4 = AbstractC7485Dh1.f2166a;
            interfaceC8357Ub1.mo965f(this.f10210i.m8079c(bArr, this.f10209h));
            this.f10208g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            ((C7000vF) interfaceC1475XR).f44297f = 0;
            C9591hA0 c9591hA05 = new C9591hA0(2);
            C7000vF c7000vF3 = (C7000vF) interfaceC1475XR;
            c7000vF3.mo3620f(c9591hA05.f28293a, 0, 2, false);
            int iM18735A = c9591hA05.m18735A();
            if ((iM18735A >> 2) != 16382) {
                c7000vF3.f44297f = 0;
                throw C10103lA0.m22366a(null, "First frame does not start with sync code.");
            }
            c7000vF3.f44297f = 0;
            this.f10212k = iM18735A;
            InterfaceC1538YR interfaceC1538YR = this.f10206e;
            int i5 = AbstractC7485Dh1.f2166a;
            long j4 = c7000vF3.f44295d;
            this.f10210i.getClass();
            C1290UV c1290uv3 = this.f10210i;
            if (c1290uv3.f11828k != null) {
                c4130gf = new C4130gf(c1290uv3, j4, 1);
            } else {
                long j5 = c7000vF3.f44294c;
                if (j5 == -1 || c1290uv3.f11827j <= 0) {
                    c4130gf = new C4130gf(c1290uv3.m8078b());
                } else {
                    int i6 = this.f10212k;
                    C0267EE c0267ee = new C0267EE(13, c1290uv3);
                    C1356VY c1356vy = new C1356VY(c1290uv3, i6);
                    long jM8078b = c1290uv3.m8078b();
                    int i7 = c1290uv3.f11820c;
                    int i8 = c1290uv3.f11821d;
                    if (i8 > 0) {
                        j = ((i8 + i7) / 2) + 1;
                    } else {
                        int i9 = c1290uv3.f11819b;
                        int i10 = c1290uv3.f11818a;
                        j = (((((i10 != i9 || i10 <= 0) ? 4096L : i10) * c1290uv3.f11824g) * c1290uv3.f11825h) / 8) + 64;
                    }
                    C1039QV c1039qv = new C1039QV(c0267ee, c1356vy, jM8078b, c1290uv3.f11827j, j4, j5, j, Math.max(6, i7));
                    this.f10213l = c1039qv;
                    c4130gf = c1039qv.f9646a;
                }
            }
            interfaceC1538YR.mo2006x(c4130gf);
            this.f10208g = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f10207f.getClass();
        this.f10210i.getClass();
        C1039QV c1039qv2 = this.f10213l;
        if (c1039qv2 != null && c1039qv2.f9648c != null) {
            return c1039qv2.m6725b((C7000vF) interfaceC1475XR, c1164sv);
        }
        if (this.f10215n == -1) {
            C1290UV c1290uv4 = this.f10210i;
            ((C7000vF) interfaceC1475XR).f44297f = 0;
            C7000vF c7000vF4 = (C7000vF) interfaceC1475XR;
            c7000vF4.m25375a(1, false);
            byte[] bArr4 = new byte[1];
            c7000vF4.mo3620f(bArr4, 0, 1, false);
            boolean z4 = (bArr4[0] & 1) == 1;
            c7000vF4.m25375a(2, false);
            i = z4 ? 7 : 6;
            C9591hA0 c9591hA06 = new C9591hA0(i);
            byte[] bArr5 = c9591hA06.f28293a;
            int i11 = 0;
            while (i11 < i) {
                int iM25377g = c7000vF4.m25377g(bArr5, i11, i - i11);
                if (iM25377g == -1) {
                    break;
                }
                i11 += iM25377g;
            }
            c9591hA06.m18740F(i11);
            c7000vF4.f44297f = 0;
            try {
                long jM18736B = c9591hA06.m18736B();
                if (!z4) {
                    jM18736B *= c1290uv4.f11819b;
                }
                j3 = jM18736B;
            } catch (NumberFormatException unused) {
                z2 = false;
            }
            if (!z2) {
                throw C10103lA0.m22366a(null, null);
            }
            this.f10215n = j3;
            return 0;
        }
        C9591hA0 c9591hA07 = this.f10203b;
        int i12 = c9591hA07.f28295c;
        if (i12 < 32768) {
            int iMo2367r = ((C7000vF) interfaceC1475XR).mo2367r(c9591hA07.f28293a, i12, 32768 - i12);
            z = iMo2367r == -1;
            if (!z) {
                c9591hA07.m18740F(i12 + iMo2367r);
            } else if (c9591hA07.m18743a() == 0) {
                long j6 = this.f10215n * 1000000;
                C1290UV c1290uv5 = this.f10210i;
                int i13 = AbstractC7485Dh1.f2166a;
                this.f10207f.mo960a(j6 / c1290uv5.f11822e, 1, this.f10214m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i14 = c9591hA07.f28294b;
        int i15 = this.f10214m;
        int i16 = this.f10211j;
        if (i15 < i16) {
            c9591hA07.m18742H(Math.min(i16 - i15, c9591hA07.m18743a()));
        }
        this.f10210i.getClass();
        int i17 = c9591hA07.f28294b;
        while (true) {
            int i18 = c9591hA07.f28295c - 16;
            C1164SV c1164sv2 = this.f10205d;
            if (i17 <= i18) {
                c9591hA07.m18741G(i17);
                if (AbstractC9188e12.m17817a(c9591hA07, this.f10210i, this.f10212k, c1164sv2)) {
                    c9591hA07.m18741G(i17);
                    j2 = c1164sv2.f10814a;
                    break;
                }
                i17++;
            } else {
                if (z) {
                    while (true) {
                        int i19 = c9591hA07.f28295c;
                        if (i17 > i19 - this.f10211j) {
                            c9591hA07.m18741G(i19);
                            break;
                        }
                        c9591hA07.m18741G(i17);
                        try {
                            zM17817a = AbstractC9188e12.m17817a(c9591hA07, this.f10210i, this.f10212k, c1164sv2);
                        } catch (IndexOutOfBoundsException unused2) {
                            zM17817a = false;
                        }
                        if (c9591hA07.f28294b > c9591hA07.f28295c) {
                            zM17817a = false;
                        }
                        if (zM17817a) {
                            c9591hA07.m18741G(i17);
                            j2 = c1164sv2.f10814a;
                            break;
                        }
                        i17++;
                    }
                } else {
                    c9591hA07.m18741G(i17);
                }
                j2 = -1;
            }
        }
        int i20 = c9591hA07.f28294b - i14;
        c9591hA07.m18741G(i14);
        this.f10207f.mo963d(i20, c9591hA07);
        int i21 = i20 + this.f10214m;
        this.f10214m = i21;
        if (j2 != -1) {
            long j7 = this.f10215n * 1000000;
            C1290UV c1290uv6 = this.f10210i;
            int i22 = AbstractC7485Dh1.f2166a;
            this.f10207f.mo960a(j7 / c1290uv6.f11822e, 1, i21, 0, null);
            this.f10214m = 0;
            this.f10215n = j2;
        }
        if (c9591hA07.m18743a() >= 16) {
            return 0;
        }
        int iM18743a = c9591hA07.m18743a();
        byte[] bArr6 = c9591hA07.f28293a;
        System.arraycopy(bArr6, c9591hA07.f28294b, bArr6, 0, iM18743a);
        c9591hA07.m18741G(0);
        c9591hA07.m18740F(iM18743a);
        return 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        C7660Gr0 c7660Gr0M879x = new C7391Bm1(21).m879x(c7000vF, U50.f11650b);
        if (c7660Gr0M879x != null) {
            int length = c7660Gr0M879x.f3928a.length;
        }
        C9591hA0 c9591hA0 = new C9591hA0(4);
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
        return c9591hA0.m18765w() == 1716281667;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        if (j == 0) {
            this.f10208g = 0;
        } else {
            C1039QV c1039qv = this.f10213l;
            if (c1039qv != null) {
                c1039qv.m6726d(j2);
            }
        }
        this.f10215n = j2 != 0 ? -1L : 0L;
        this.f10214m = 0;
        this.f10203b.m18738D(0);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f10206e = interfaceC1538YR;
        this.f10207f = interfaceC1538YR.mo2005w(0, 1);
        interfaceC1538YR.mo2003p();
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
