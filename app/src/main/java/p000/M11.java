package p000;

import java.io.IOException;

/* loaded from: classes.dex */
public final class M11 implements InterfaceC9121dV0 {

    /* renamed from: a */
    public int f6968a;

    /* renamed from: b */
    public boolean f6969b;

    /* renamed from: c */
    public final /* synthetic */ O11 f6970c;

    public M11(O11 o11) {
        this.f6970c = o11;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() throws IOException {
        O11 o11 = this.f6970c;
        if (o11.f8185k) {
            return;
        }
        o11.f8183i.mo858a();
    }

    /* renamed from: b */
    public final void m5212b() {
        if (this.f6969b) {
            return;
        }
        O11 o11 = this.f6970c;
        o11.f8179e.m8504x(AbstractC8544Xr0.m9165h(o11.f8184j.f40974m), o11.f8184j, 0, null, 0L);
        this.f6969b = true;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        return this.f6970c.f8186l;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        m5212b();
        if (j <= 0 || this.f6968a == 2) {
            return 0;
        }
        this.f6968a = 2;
        return 1;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        m5212b();
        O11 o11 = this.f6970c;
        boolean z = o11.f8186l;
        if (z && o11.f8187m == null) {
            this.f6968a = 2;
        }
        int i2 = this.f6968a;
        if (i2 == 2) {
            c1587zd.m2498a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c0827n8.f7524c = o11.f8184j;
            this.f6968a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        o11.f8187m.getClass();
        c1587zd.m2498a(1);
        c1587zd.f14800g = 0L;
        if ((i & 4) == 0) {
            c1587zd.m9506v(o11.f8188n);
            c1587zd.f14798e.put(o11.f8187m, 0, o11.f8188n);
        }
        if ((i & 1) == 0) {
            this.f6968a = 2;
        }
        return -4;
    }
}
