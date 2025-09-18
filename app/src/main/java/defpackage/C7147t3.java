package defpackage;

import java.util.Arrays;

/* renamed from: t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7147t3 implements InterfaceC6254oN {
    public static final byte[] w = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public String f;
    public InterfaceC1584Ub1 g;
    public InterfaceC1584Ub1 h;
    public boolean l;
    public boolean m;
    public int p;
    public boolean q;
    public int s;
    public InterfaceC1584Ub1 u;
    public long v;
    public final C0848Kq b = new C0848Kq(new byte[7], 7);
    public final C4103hA0 c = new C4103hA0(Arrays.copyOf(w, 10));
    public int i = 0;
    public int j = 0;
    public int k = 256;
    public int n = -1;
    public int o = -1;
    public long r = -9223372036854775807L;
    public long t = -9223372036854775807L;

    public C7147t3(int i, String str, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r24) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7147t3.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.t = -9223372036854775807L;
        this.m = false;
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void d(YR yr, YM0 ym0) {
        ym0.a();
        ym0.b();
        this.f = (String) ym0.b;
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 1);
        this.g = interfaceC1584Ub1W;
        this.u = interfaceC1584Ub1W;
        if (!this.a) {
            this.h = new WJ();
            return;
        }
        ym0.a();
        ym0.b();
        InterfaceC1584Ub1 interfaceC1584Ub1W2 = yr.w(ym0.e, 5);
        this.h = interfaceC1584Ub1W2;
        C6475pX c6475pX = new C6475pX();
        ym0.b();
        c6475pX.a = (String) ym0.b;
        c6475pX.l = AbstractC1865Xr0.n("application/id3");
        F91.B(c6475pX, interfaceC1584Ub1W2);
    }

    @Override // defpackage.InterfaceC6254oN
    public final void f(int i, long j) {
        this.t = j;
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
    }
}
