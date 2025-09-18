package p000;

import android.util.Pair;

/* renamed from: Op0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8072Op0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8631a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f8632b;

    /* renamed from: c */
    public final /* synthetic */ Pair f8633c;

    public /* synthetic */ RunnableC8072Op0(CC0 cc0, Pair pair, int i) {
        this.f8631a = i;
        this.f8632b = cc0;
        this.f8633c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8631a) {
            case 0:
                C7251zE c7251zE = (C7251zE) ((C8332Tp0) this.f8632b.f1251c).f11544i;
                Pair pair = this.f8633c;
                c7251zE.mo1058b0(((Integer) pair.first).intValue(), (C7604Fp0) pair.second);
                break;
            case 1:
                C7251zE c7251zE2 = (C7251zE) ((C8332Tp0) this.f8632b.f1251c).f11544i;
                Pair pair2 = this.f8633c;
                c7251zE2.mo1084k0(((Integer) pair2.first).intValue(), (C7604Fp0) pair2.second);
                break;
            default:
                C7251zE c7251zE3 = (C7251zE) ((C8332Tp0) this.f8632b.f1251c).f11544i;
                Pair pair3 = this.f8633c;
                c7251zE3.mo1030N(((Integer) pair3.first).intValue(), (C7604Fp0) pair3.second);
                break;
        }
    }
}
