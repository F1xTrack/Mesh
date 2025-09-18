package defpackage;

import java.math.RoundingMode;

/* renamed from: vm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7667vm1 implements InterfaceC7857wm1 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final YR a;
    public final InterfaceC1584Ub1 b;
    public final K9 c;
    public final int d;
    public final byte[] e;
    public final C4103hA0 f;
    public final int g;
    public final C6666qX h;
    public int i;
    public long j;
    public int k;
    public long l;

    public C7667vm1(YR yr, InterfaceC1584Ub1 interfaceC1584Ub1, K9 k9) throws C5643lA0 {
        this.a = yr;
        this.b = interfaceC1584Ub1;
        this.c = k9;
        int i = k9.c;
        int iMax = Math.max(1, i / 10);
        this.g = iMax;
        C4103hA0 c4103hA0 = new C4103hA0((byte[]) k9.f);
        c4103hA0.n();
        int iN = c4103hA0.n();
        this.d = iN;
        int i2 = k9.b;
        int i3 = k9.d;
        int i4 = (((i3 - (i2 * 4)) * 8) / (k9.e * i2)) + 1;
        if (iN != i4) {
            throw C5643lA0.a(null, "Expected frames per block: " + i4 + "; got: " + iN);
        }
        int iG = AbstractC0277Dh1.g(iMax, iN);
        this.e = new byte[iG * i3];
        this.f = new C4103hA0(iN * 2 * i2 * iG);
        int i5 = ((i3 * i) * 8) / iN;
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("audio/raw");
        c6475pX.g = i5;
        c6475pX.h = i5;
        c6475pX.m = iMax * 2 * i2;
        c6475pX.z = i2;
        c6475pX.A = i;
        c6475pX.B = 2;
        this.h = new C6666qX(c6475pX);
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
    @Override // defpackage.InterfaceC7857wm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.C7566vF r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7667vm1.a(vF, long):boolean");
    }

    @Override // defpackage.InterfaceC7857wm1
    public final void b(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // defpackage.InterfaceC7857wm1
    public final void c(int i, long j) {
        this.a.x(new C8427zm1(this.c, this.d, i, j));
        this.b.f(this.h);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        K9 k9 = this.c;
        long j3 = k9.c;
        int i2 = AbstractC0277Dh1.a;
        long jY = j + AbstractC0277Dh1.Y(j2, 1000000L, j3, RoundingMode.FLOOR);
        int i3 = i * 2 * k9.b;
        this.b.a(jY, 1, i3, this.k - i3, null);
        this.l += i;
        this.k -= i3;
    }
}
