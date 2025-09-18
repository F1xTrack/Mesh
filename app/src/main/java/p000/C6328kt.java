package p000;

/* renamed from: kt */
/* loaded from: classes.dex */
public final class C6328kt implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final InterfaceC9121dV0 f36740a;

    /* renamed from: b */
    public boolean f36741b;

    /* renamed from: c */
    public final /* synthetic */ C6391lt f36742c;

    public C6328kt(C6391lt c6391lt, InterfaceC9121dV0 interfaceC9121dV0) {
        this.f36742c = c6391lt;
        this.f36740a = interfaceC9121dV0;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() {
        this.f36740a.mo34a();
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        return !this.f36742c.m22570c() && this.f36740a.mo37f();
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        if (this.f36742c.m22570c()) {
            return -3;
        }
        return this.f36740a.mo38j(j);
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        C6391lt c6391lt = this.f36742c;
        if (c6391lt.m22570c()) {
            return -3;
        }
        if (this.f36741b) {
            c1587zd.f3082b = 4;
            return -4;
        }
        long jMo1890s = c6391lt.mo1890s();
        int iMo39k = this.f36740a.mo39k(c0827n8, c1587zd, i);
        if (iMo39k != -5) {
            long j = c6391lt.f37337f;
            if (j == Long.MIN_VALUE || ((iMo39k != -4 || c1587zd.f14800g < j) && !(iMo39k == -3 && jMo1890s == Long.MIN_VALUE && !c1587zd.f14799f))) {
                return iMo39k;
            }
            c1587zd.mo7722t();
            c1587zd.f3082b = 4;
            this.f36741b = true;
            return -4;
        }
        C6686qX c6686qX = (C6686qX) c0827n8.f7524c;
        c6686qX.getClass();
        int i2 = c6686qX.f40955E;
        int i3 = c6686qX.f40954D;
        if (i3 != 0 || i2 != 0) {
            if (c6391lt.f37336e != 0) {
                i3 = 0;
            }
            if (c6391lt.f37337f != Long.MIN_VALUE) {
                i2 = 0;
            }
            C6623pX c6623pXM24020a = c6686qX.m24020a();
            c6623pXM24020a.f40143C = i3;
            c6623pXM24020a.f40144D = i2;
            c0827n8.f7524c = new C6686qX(c6623pXM24020a);
        }
        return -5;
    }
}
