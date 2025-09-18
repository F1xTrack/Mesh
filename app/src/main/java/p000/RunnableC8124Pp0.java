package p000;

import android.util.Pair;

/* renamed from: Pp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8124Pp0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9288a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f9289b;

    /* renamed from: c */
    public final /* synthetic */ Pair f9290c;

    /* renamed from: d */
    public final /* synthetic */ C9535gk0 f9291d;

    /* renamed from: e */
    public final /* synthetic */ C11081sp0 f9292e;

    public /* synthetic */ RunnableC8124Pp0(CC0 cc0, Pair pair, C9535gk0 c9535gk0, C11081sp0 c11081sp0, int i) {
        this.f9288a = i;
        this.f9289b = cc0;
        this.f9290c = pair;
        this.f9291d = c9535gk0;
        this.f9292e = c11081sp0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9288a) {
            case 0:
                C7251zE c7251zE = (C7251zE) ((C8332Tp0) this.f9289b.f1251c).f11544i;
                Pair pair = this.f9290c;
                c7251zE.mo1109v(((Integer) pair.first).intValue(), (C7604Fp0) pair.second, this.f9291d, this.f9292e);
                break;
            case 1:
                C7251zE c7251zE2 = (C7251zE) ((C8332Tp0) this.f9289b.f1251c).f11544i;
                Pair pair2 = this.f9290c;
                c7251zE2.mo1095o(((Integer) pair2.first).intValue(), (C7604Fp0) pair2.second, this.f9291d, this.f9292e);
                break;
            default:
                C7251zE c7251zE3 = (C7251zE) ((C8332Tp0) this.f9289b.f1251c).f11544i;
                Pair pair3 = this.f9290c;
                c7251zE3.mo1016E(((Integer) pair3.first).intValue(), (C7604Fp0) pair3.second, this.f9291d, this.f9292e);
                break;
        }
    }
}
