package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class H9 implements InterfaceC5790lx0 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public H9(long j, int i) {
        YN1.f(((N3) this.c) == null);
        this.a = j;
        this.b = j + i;
    }

    @Override // defpackage.InterfaceC5790lx0
    public long a(C7566vF c7566vF) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // defpackage.InterfaceC5790lx0
    public CX0 b() {
        YN1.f(this.a != -1);
        return new C4004gf((UV) this.c, this.a, 1);
    }

    public boolean c(long j, boolean z, boolean z2) {
        WW1 ww1 = (WW1) this.d;
        ww1.v1();
        ww1.A1();
        C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
        if (c3386dP1.f()) {
            ww1.t1().r.h(c3386dP1.n.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            ww1.n().o.c(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        ww1.n().o.c(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        C5910mZ1.Y1(ww1.x1().C1(!c3386dP1.g.G1()), bundle, true);
        if (!z2) {
            ww1.w1().X1("auto", "_e", bundle);
        }
        this.a = j;
        C6477pX1 c6477pX1 = (C6477pX1) this.c;
        c6477pX1.a();
        c6477pX1.b(((Long) IB1.l0.a(null)).longValue());
        return true;
    }

    @Override // defpackage.InterfaceC5790lx0
    public void d(long j) {
        long[] jArr = (long[]) ((ES1) this.d).b;
        this.b = jArr[AbstractC0277Dh1.f(jArr, j, true)];
    }

    public H9(long j, String str, long j2, byte[] bArr) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
