package p000;

import android.util.Pair;

/* renamed from: Np0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8020Np0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8019a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f8020b;

    /* renamed from: c */
    public final /* synthetic */ Pair f8021c;

    /* renamed from: d */
    public final /* synthetic */ C11081sp0 f8022d;

    public /* synthetic */ RunnableC8020Np0(CC0 cc0, Pair pair, C11081sp0 c11081sp0, int i) {
        this.f8019a = i;
        this.f8020b = cc0;
        this.f8021c = pair;
        this.f8022d = c11081sp0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8019a) {
            case 0:
                C7251zE c7251zE = (C7251zE) ((C8332Tp0) this.f8020b.f1251c).f11544i;
                Pair pair = this.f8021c;
                int iIntValue = ((Integer) pair.first).intValue();
                C7604Fp0 c7604Fp0 = (C7604Fp0) pair.second;
                c7604Fp0.getClass();
                c7251zE.mo1068f(iIntValue, c7604Fp0, this.f8022d);
                break;
            default:
                C7251zE c7251zE2 = (C7251zE) ((C8332Tp0) this.f8020b.f1251c).f11544i;
                Pair pair2 = this.f8021c;
                c7251zE2.mo1062d(((Integer) pair2.first).intValue(), (C7604Fp0) pair2.second, this.f8022d);
                break;
        }
    }
}
