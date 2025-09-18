package defpackage;

import java.io.IOException;

/* renamed from: nE0 */
/* loaded from: classes.dex */
public final class C6037nE0 implements InterfaceC3403dV0 {
    public final int a;
    public final /* synthetic */ C6419pE0 b;

    public C6037nE0(C6419pE0 c6419pE0, int i) {
        this.b = c6419pE0;
        this.a = i;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() throws IOException {
        C6419pE0 c6419pE0 = this.b;
        c6419pE0.s[this.a].y();
        int iD = c6419pE0.d.d(c6419pE0.C);
        C1857Xo1 c1857Xo1 = c6419pE0.k;
        IOException iOException = (IOException) c1857Xo1.d;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) c1857Xo1.c;
        if (handlerC5560kk0 != null) {
            if (iD == Integer.MIN_VALUE) {
                iD = handlerC5560kk0.a;
            }
            IOException iOException2 = handlerC5560kk0.e;
            if (iOException2 != null && handlerC5560kk0.f > iD) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        C6419pE0 c6419pE0 = this.b;
        return !c6419pE0.D() && c6419pE0.s[this.a].w(c6419pE0.L);
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        C6419pE0 c6419pE0 = this.b;
        if (c6419pE0.D()) {
            return 0;
        }
        int i = this.a;
        c6419pE0.z(i);
        C2527cV0 c2527cV0 = c6419pE0.s[i];
        int iT = c2527cV0.t(j, c6419pE0.L);
        c2527cV0.G(iT);
        if (iT != 0) {
            return iT;
        }
        c6419pE0.A(i);
        return iT;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        C6419pE0 c6419pE0 = this.b;
        if (c6419pE0.D()) {
            return -3;
        }
        int i2 = this.a;
        c6419pE0.z(i2);
        int iB = c6419pE0.s[i2].B(n8, zd, i, c6419pE0.L);
        if (iB == -3) {
            c6419pE0.A(i2);
        }
        return iB;
    }
}
