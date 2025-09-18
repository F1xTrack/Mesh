package p000;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.List;

/* renamed from: lG */
/* loaded from: classes.dex */
public final class C6352lG implements InterfaceC1412WR {

    /* renamed from: a */
    public final /* synthetic */ int f36989a = 1;

    /* renamed from: b */
    public final Object f36990b;

    public C6352lG(int i) {
        if ((i & 1) != 0) {
            this.f36990b = new K11(65496, 2, ClipboardModule.MIMETYPE_JPEG);
        } else {
            this.f36990b = new C9135dc0();
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        int i = this.f36989a;
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) {
        switch (this.f36989a) {
            case 0:
                return ((C7000vF) interfaceC1475XR).m25379i(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((InterfaceC1412WR) this.f36990b).mo738d(interfaceC1475XR, c1164sv);
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        switch (this.f36989a) {
            case 0:
                return true;
            default:
                return ((InterfaceC1412WR) this.f36990b).mo739f(interfaceC1475XR);
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        switch (this.f36989a) {
            case 0:
                break;
            default:
                ((InterfaceC1412WR) this.f36990b).mo740g(j, j2);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        switch (this.f36989a) {
            case 0:
                N70 n70 = P70.f8867b;
                break;
            default:
                N70 n702 = P70.f8867b;
                break;
        }
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        switch (this.f36989a) {
            case 0:
                InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(0, 3);
                interfaceC1538YR.mo2006x(new C4130gf(-9223372036854775807L));
                interfaceC1538YR.mo2003p();
                C6686qX c6686qX = (C6686qX) this.f36990b;
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n("text/x-unknown");
                c6623pXM24020a.f40158i = c6686qX.f40974m;
                F91.m2512B(c6623pXM24020a, interfaceC8357Ub1Mo2005w);
                break;
            default:
                ((InterfaceC1412WR) this.f36990b).mo742l(interfaceC1538YR);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        switch (this.f36989a) {
            case 0:
                break;
            default:
                ((InterfaceC1412WR) this.f36990b).release();
                break;
        }
    }

    public C6352lG(C6686qX c6686qX) {
        this.f36990b = c6686qX;
    }

    /* renamed from: a */
    private final void m22376a() {
    }

    /* renamed from: c */
    private final void m22377c(long j, long j2) {
    }
}
