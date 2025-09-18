package defpackage;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.List;

/* renamed from: lG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5660lG implements WR {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public C5660lG(int i) {
        if ((i & 1) != 0) {
            this.b = new K11(65496, 2, ClipboardModule.MIMETYPE_JPEG);
        } else {
            this.b = new C3424dc0();
        }
    }

    @Override // defpackage.WR
    public final WR b() {
        int i = this.a;
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) {
        switch (this.a) {
            case 0:
                return ((C7566vF) xr).i(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((WR) this.b).d(xr, sv);
        }
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((WR) this.b).f(xr);
        }
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((WR) this.b).g(j, j2);
                break;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        switch (this.a) {
            case 0:
                N70 n70 = P70.b;
                break;
            default:
                N70 n702 = P70.b;
                break;
        }
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        switch (this.a) {
            case 0:
                InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(0, 3);
                yr.x(new C4004gf(-9223372036854775807L));
                yr.p();
                C6666qX c6666qX = (C6666qX) this.b;
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.l = AbstractC1865Xr0.n("text/x-unknown");
                c6475pXA.i = c6666qX.m;
                F91.B(c6475pXA, interfaceC1584Ub1W);
                break;
            default:
                ((WR) this.b).l(yr);
                break;
        }
    }

    @Override // defpackage.WR
    public final void release() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((WR) this.b).release();
                break;
        }
    }

    public C5660lG(C6666qX c6666qX) {
        this.b = c6666qX;
    }

    private final void a() {
    }

    private final void c(long j, long j2) {
    }
}
