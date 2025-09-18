package p000;

/* renamed from: p80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10611p80 extends AbstractC1061Qr {

    /* renamed from: j */
    public final C4135gk f39858j;

    /* renamed from: k */
    public C1339VH f39859k;

    /* renamed from: l */
    public long f39860l;

    /* renamed from: m */
    public volatile boolean f39861m;

    public C10611p80(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, C6686qX c6686qX, int i, Object obj, C4135gk c4135gk) {
        super(interfaceC1586ZC, c3976eD, 2, c6686qX, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f39858j = c4135gk;
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        if (this.f39860l == 0) {
            this.f39858j.m18605a(this.f39859k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C3976eD c3976eDM17881d = this.f9812b.m17881d(this.f39860l);
            M41 m41 = this.f9819i;
            C7000vF c7000vF = new C7000vF(m41, c3976eDM17881d.f26600f, m41.mo2365c(c3976eDM17881d));
            while (!this.f39861m) {
                try {
                    int iMo738d = this.f39858j.f27966a.mo738d(c7000vF, C4135gk.f27965k);
                    boolean z = false;
                    YN1.m9281f(iMo738d != 1);
                    if (iMo738d == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.f39860l = c7000vF.f44295d - this.f9812b.f26600f;
                }
            }
        } finally {
            AbstractC9770iZ1.m19065b(this.f9819i);
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
        this.f39861m = true;
    }
}
