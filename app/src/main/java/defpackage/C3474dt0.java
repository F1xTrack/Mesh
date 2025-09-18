package defpackage;

/* renamed from: dt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3474dt0 implements InterfaceC6254oN {
    public String e;
    public InterfaceC1584Ub1 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final C4103hA0 a = new C4103hA0(new byte[15], 2);
    public final C0848Kq b = new C0848Kq();
    public final C4103hA0 c = new C4103hA0();
    public final C3665et0 p = new C3665et0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0410  */
    @Override // defpackage.InterfaceC6254oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r24) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3474dt0.b(hA0):void");
    }

    @Override // defpackage.InterfaceC6254oN
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.D(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
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
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.InterfaceC6254oN
    public final void e(boolean z) {
    }
}
