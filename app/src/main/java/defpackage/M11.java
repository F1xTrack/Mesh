package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class M11 implements InterfaceC3403dV0 {
    public int a;
    public boolean b;
    public final /* synthetic */ O11 c;

    public M11(O11 o11) {
        this.c = o11;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() throws IOException {
        O11 o11 = this.c;
        if (o11.k) {
            return;
        }
        o11.i.a();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        O11 o11 = this.c;
        o11.e.x(AbstractC1865Xr0.h(o11.j.m), o11.j, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        return this.c.l;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        b();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        b();
        O11 o11 = this.c;
        boolean z = o11.l;
        if (z && o11.m == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            zd.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            n8.c = o11.j;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        o11.m.getClass();
        zd.a(1);
        zd.g = 0L;
        if ((i & 4) == 0) {
            zd.v(o11.n);
            zd.e.put(o11.m, 0, o11.n);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
