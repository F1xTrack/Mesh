package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5296jM implements InterfaceC6254oN {
    public final C4103hA0 a;
    public final String c;
    public final int d;
    public String e;
    public InterfaceC1584Ub1 f;
    public int h;
    public int i;
    public long j;
    public C6666qX k;
    public int l;
    public int m;
    public int g = 0;
    public long p = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public C5296jM(String str, int i, int i2) {
        this.a = new C4103hA0(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(C4103hA0 c4103hA0, byte[] bArr, int i) {
        int iMin = Math.min(c4103hA0.a(), i - this.h);
        c4103hA0.e(bArr, this.h, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a0  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [Ub1] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r38) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5296jM.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.e = (String) ym0.b;
        ym0.b();
        this.f = yr.w(ym0.e, 1);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.p = j;
    }

    public final void g(C6371p c6371p) {
        int i;
        int i2 = c6371p.c;
        if (i2 == -2147483647 || (i = c6371p.d) == -1) {
            return;
        }
        C6666qX c6666qX = this.k;
        String str = c6371p.b;
        if (c6666qX != null && i == c6666qX.A && i2 == c6666qX.B && str.equals(c6666qX.m)) {
            return;
        }
        C6666qX c6666qX2 = this.k;
        C6475pX c6475pX = c6666qX2 == null ? new C6475pX() : c6666qX2.a();
        c6475pX.a = this.e;
        c6475pX.l = AbstractC1865Xr0.n(str);
        c6475pX.z = i;
        c6475pX.A = i2;
        c6475pX.d = this.c;
        c6475pX.f = this.d;
        C6666qX c6666qX3 = new C6666qX(c6475pX);
        this.k = c6666qX3;
        this.f.f(c6666qX3);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
    }
}
