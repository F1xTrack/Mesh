package p000;

import java.io.IOException;

/* renamed from: nE0 */
/* loaded from: classes.dex */
public final class C10367nE0 implements InterfaceC9121dV0 {

    /* renamed from: a */
    public final int f38189a;

    /* renamed from: b */
    public final /* synthetic */ C10623pE0 f38190b;

    public C10367nE0(C10623pE0 c10623pE0, int i) {
        this.f38190b = c10623pE0;
        this.f38189a = i;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: a */
    public final void mo34a() throws IOException {
        C10623pE0 c10623pE0 = this.f38190b;
        c10623pE0.f39948s[this.f38189a].m10739y();
        int iMo17891d = c10623pE0.f39933d.mo17891d(c10623pE0.f39919C);
        C8539Xo1 c8539Xo1 = c10623pE0.f39940k;
        IOException iOException = (IOException) c8539Xo1.f13983d;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) c8539Xo1.f13982c;
        if (handlerC10047kk0 != null) {
            if (iMo17891d == Integer.MIN_VALUE) {
                iMo17891d = handlerC10047kk0.f36647a;
            }
            IOException iOException2 = handlerC10047kk0.f36651e;
            if (iOException2 != null && handlerC10047kk0.f36652f > iMo17891d) {
                throw iOException2;
            }
        }
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: f */
    public final boolean mo37f() {
        C10623pE0 c10623pE0 = this.f38190b;
        return !c10623pE0.m23654D() && c10623pE0.f39948s[this.f38189a].m10737w(c10623pE0.f39928L);
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: j */
    public final int mo38j(long j) {
        C10623pE0 c10623pE0 = this.f38190b;
        if (c10623pE0.m23654D()) {
            return 0;
        }
        int i = this.f38189a;
        c10623pE0.m23660z(i);
        C8988cV0 c8988cV0 = c10623pE0.f39948s[i];
        int iM10734t = c8988cV0.m10734t(j, c10623pE0.f39928L);
        c8988cV0.m10721G(iM10734t);
        if (iM10734t != 0) {
            return iM10734t;
        }
        c10623pE0.m23651A(i);
        return iM10734t;
    }

    @Override // p000.InterfaceC9121dV0
    /* renamed from: k */
    public final int mo39k(C0827N8 c0827n8, C1587ZD c1587zd, int i) {
        C10623pE0 c10623pE0 = this.f38190b;
        if (c10623pE0.m23654D()) {
            return -3;
        }
        int i2 = this.f38189a;
        c10623pE0.m23660z(i2);
        int iM10716B = c10623pE0.f39948s[i2].m10716B(c0827n8, c1587zd, i, c10623pE0.f39928L);
        if (iM10716B == -3) {
            c10623pE0.m23651A(i2);
        }
        return iM10716B;
    }
}
