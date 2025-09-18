package defpackage;

import android.util.Pair;

/* renamed from: Op0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1157Op0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ RunnableC1157Op0(CC0 cc0, Pair pair, int i) {
        this.a = i;
        this.b = cc0;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C8323zE c8323zE = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair = this.c;
                c8323zE.b0(((Integer) pair.first).intValue(), (C0456Fp0) pair.second);
                break;
            case 1:
                C8323zE c8323zE2 = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair2 = this.c;
                c8323zE2.k0(((Integer) pair2.first).intValue(), (C0456Fp0) pair2.second);
                break;
            default:
                C8323zE c8323zE3 = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair3 = this.c;
                c8323zE3.N(((Integer) pair3.first).intValue(), (C0456Fp0) pair3.second);
                break;
        }
    }
}
