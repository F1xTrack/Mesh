package defpackage;

import android.util.Pair;

/* renamed from: Np0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1079Np0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ C7102sp0 d;

    public /* synthetic */ RunnableC1079Np0(CC0 cc0, Pair pair, C7102sp0 c7102sp0, int i) {
        this.a = i;
        this.b = cc0;
        this.c = pair;
        this.d = c7102sp0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C8323zE c8323zE = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair = this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                C0456Fp0 c0456Fp0 = (C0456Fp0) pair.second;
                c0456Fp0.getClass();
                c8323zE.f(iIntValue, c0456Fp0, this.d);
                break;
            default:
                C8323zE c8323zE2 = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair2 = this.c;
                c8323zE2.d(((Integer) pair2.first).intValue(), (C0456Fp0) pair2.second, this.d);
                break;
        }
    }
}
