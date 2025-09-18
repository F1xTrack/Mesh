package p000;

import java.math.RoundingMode;

/* renamed from: vm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11460vm1 implements InterfaceC11587wm1 {

    /* renamed from: m */
    public static final int[] f44525m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    public static final int[] f44526n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    public final InterfaceC1538YR f44527a;

    /* renamed from: b */
    public final InterfaceC8357Ub1 f44528b;

    /* renamed from: c */
    public final C0640K9 f44529c;

    /* renamed from: d */
    public final int f44530d;

    /* renamed from: e */
    public final byte[] f44531e;

    /* renamed from: f */
    public final C9591hA0 f44532f;

    /* renamed from: g */
    public final int f44533g;

    /* renamed from: h */
    public final C6686qX f44534h;

    /* renamed from: i */
    public int f44535i;

    /* renamed from: j */
    public long f44536j;

    /* renamed from: k */
    public int f44537k;

    /* renamed from: l */
    public long f44538l;

    public C11460vm1(InterfaceC1538YR interfaceC1538YR, InterfaceC8357Ub1 interfaceC8357Ub1, C0640K9 c0640k9) throws C10103lA0 {
        this.f44527a = interfaceC1538YR;
        this.f44528b = interfaceC8357Ub1;
        this.f44529c = c0640k9;
        int i = c0640k9.f5921c;
        int iMax = Math.max(1, i / 10);
        this.f44533g = iMax;
        C9591hA0 c9591hA0 = new C9591hA0((byte[]) c0640k9.f5924f);
        c9591hA0.m18756n();
        int iM18756n = c9591hA0.m18756n();
        this.f44530d = iM18756n;
        int i2 = c0640k9.f5920b;
        int i3 = c0640k9.f5922d;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c0640k9.f5923e * i2)) + 1;
        if (iM18756n != i4) {
            throw C10103lA0.m22366a(null, "Expected frames per block: " + i4 + "; got: " + iM18756n);
        }
        int iM1822g = AbstractC7485Dh1.m1822g(iMax, iM18756n);
        this.f44531e = new byte[iM1822g * i3];
        this.f44532f = new C9591hA0(iM18756n * 2 * i2 * iM1822g);
        int i5 = ((i3 * i) * 8) / iM18756n;
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("audio/raw");
        c6623pX.f40156g = i5;
        c6623pX.f40157h = i5;
        c6623pX.f40162m = iMax * 2 * i2;
        c6623pX.f40175z = i2;
        c6623pX.f40141A = i;
        c6623pX.f40142B = 2;
        this.f44534h = new C6686qX(c6623pX);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p000.InterfaceC11587wm1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo25484a(p000.C7000vF r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11460vm1.mo25484a(vF, long):boolean");
    }

    @Override // p000.InterfaceC11587wm1
    /* renamed from: b */
    public final void mo25485b(long j) {
        this.f44535i = 0;
        this.f44536j = j;
        this.f44537k = 0;
        this.f44538l = 0L;
    }

    @Override // p000.InterfaceC11587wm1
    /* renamed from: c */
    public final void mo25486c(int i, long j) {
        this.f44527a.mo2006x(new C11968zm1(this.f44529c, this.f44530d, i, j));
        this.f44528b.mo965f(this.f44534h);
    }

    /* renamed from: d */
    public final void m25487d(int i) {
        long j = this.f44536j;
        long j2 = this.f44538l;
        C0640K9 c0640k9 = this.f44529c;
        long j3 = c0640k9.f5921c;
        int i2 = AbstractC7485Dh1.f2166a;
        long jM1810Y = j + AbstractC7485Dh1.m1810Y(j2, 1000000L, j3, RoundingMode.FLOOR);
        int i3 = i * 2 * c0640k9.f5920b;
        this.f44528b.mo960a(jM1810Y, 1, i3, this.f44537k - i3, null);
        this.f44538l += i;
        this.f44537k -= i3;
    }
}
