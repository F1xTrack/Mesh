package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: Xs0 */
/* loaded from: classes.dex */
public final class C8546Xs0 implements InterfaceC1412WR {

    /* renamed from: u */
    public static final C7754Im0 f14009u = new C7754Im0(11);

    /* renamed from: a */
    public final int f14010a;

    /* renamed from: b */
    public final long f14011b;

    /* renamed from: c */
    public final C9591hA0 f14012c;

    /* renamed from: d */
    public final C1004Px f14013d;

    /* renamed from: e */
    public final C9439g00 f14014e;

    /* renamed from: f */
    public final C7391Bm1 f14015f;

    /* renamed from: g */
    public final C1404WJ f14016g;

    /* renamed from: h */
    public InterfaceC1538YR f14017h;

    /* renamed from: i */
    public InterfaceC8357Ub1 f14018i;

    /* renamed from: j */
    public InterfaceC8357Ub1 f14019j;

    /* renamed from: k */
    public int f14020k;

    /* renamed from: l */
    public C7660Gr0 f14021l;

    /* renamed from: m */
    public long f14022m;

    /* renamed from: n */
    public long f14023n;

    /* renamed from: o */
    public long f14024o;

    /* renamed from: p */
    public int f14025p;

    /* renamed from: q */
    public GX0 f14026q;

    /* renamed from: r */
    public boolean f14027r;

    /* renamed from: s */
    public boolean f14028s;

    /* renamed from: t */
    public long f14029t;

    public C8546Xs0() {
        this(-9223372036854775807L);
    }

    /* renamed from: a */
    public static long m9177a(C7660Gr0 c7660Gr0) {
        if (c7660Gr0 == null) {
            return -9223372036854775807L;
        }
        int iM3183c = c7660Gr0.m3183c();
        for (int i = 0; i < iM3183c; i++) {
            InterfaceC7556Er0 interfaceC7556Er0 = c7660Gr0.f3928a[i];
            if (interfaceC7556Er0 instanceof C10742q91) {
                C10742q91 c10742q91 = (C10742q91) interfaceC7556Er0;
                if (c10742q91.f12347a.equals("TLEN")) {
                    return AbstractC7485Dh1.m1802Q(Long.parseLong((String) c10742q91.f40637d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* renamed from: c */
    public final boolean m9178c(C7000vF c7000vF) {
        GX0 gx0 = this.f14026q;
        if (gx0 != null) {
            long jMo928c = gx0.mo928c();
            if (jMo928c != -1 && c7000vF.mo3624j() > jMo928c - 4) {
                return true;
            }
        }
        try {
            return !c7000vF.mo3620f(this.f14012c.f28293a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x051c  */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r51, p000.C1164SV r52) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8546Xs0.mo738d(XR, SV):int");
    }

    /* renamed from: e */
    public final boolean m9179e(C7000vF c7000vF, boolean z) throws C10103lA0, EOFException, InterruptedIOException {
        int iMo3624j;
        int i;
        int iM5281b;
        int i2 = z ? 32768 : 131072;
        c7000vF.f44297f = 0;
        if (c7000vF.f44295d == 0) {
            C7660Gr0 c7660Gr0M879x = this.f14015f.m879x(c7000vF, (this.f14010a & 8) == 0 ? null : f14009u);
            this.f14021l = c7660Gr0M879x;
            if (c7660Gr0M879x != null) {
                this.f14014e.m18376b(c7660Gr0M879x);
            }
            iMo3624j = (int) c7000vF.mo3624j();
            if (!z) {
                c7000vF.mo3627n(iMo3624j);
            }
            i = 0;
        } else {
            iMo3624j = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!m9178c(c7000vF)) {
                C9591hA0 c9591hA0 = this.f14012c;
                c9591hA0.m18741G(0);
                int iM18749g = c9591hA0.m18749g();
                if ((i == 0 || ((-128000) & iM18749g) == (i & (-128000))) && (iM5281b = MA1.m5281b(iM18749g)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f14013d.m6491b(iM18749g);
                        i = iM18749g;
                    }
                    c7000vF.m25375a(iM5281b - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw C10103lA0.m22366a(null, "Searched too many bytes.");
                    }
                    if (z) {
                        c7000vF.f44297f = 0;
                        c7000vF.m25375a(iMo3624j + i5, false);
                    } else {
                        c7000vF.mo3627n(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            c7000vF.mo3627n(iMo3624j + i4);
        } else {
            c7000vF.f44297f = 0;
        }
        this.f14020k = i;
        return true;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        return m9179e((C7000vF) interfaceC1475XR, true);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        this.f14020k = 0;
        this.f14022m = -9223372036854775807L;
        this.f14023n = 0L;
        this.f14025p = 0;
        this.f14029t = j2;
        GX0 gx0 = this.f14026q;
        if (!(gx0 instanceof C9587h80) || ((C9587h80) gx0).m18726b(j2)) {
            return;
        }
        this.f14028s = true;
        this.f14019j = this.f14016g;
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
        this.f14017h = interfaceC1538YR;
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(0, 1);
        this.f14018i = interfaceC8357Ub1Mo2005w;
        this.f14019j = interfaceC8357Ub1Mo2005w;
        this.f14017h.mo2003p();
    }

    public C8546Xs0(long j) {
        this.f14010a = 0;
        this.f14011b = j;
        this.f14012c = new C9591hA0(10);
        this.f14013d = new C1004Px();
        this.f14014e = new C9439g00();
        this.f14022m = -9223372036854775807L;
        this.f14015f = new C7391Bm1(21);
        C1404WJ c1404wj = new C1404WJ();
        this.f14016g = c1404wj;
        this.f14019j = c1404wj;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
