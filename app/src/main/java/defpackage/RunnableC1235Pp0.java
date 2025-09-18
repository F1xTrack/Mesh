package defpackage;

import android.util.Pair;

/* renamed from: Pp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1235Pp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ C4020gk0 d;
    public final /* synthetic */ C7102sp0 e;

    public /* synthetic */ RunnableC1235Pp0(CC0 cc0, Pair pair, C4020gk0 c4020gk0, C7102sp0 c7102sp0, int i) {
        this.a = i;
        this.b = cc0;
        this.c = pair;
        this.d = c4020gk0;
        this.e = c7102sp0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C8323zE c8323zE = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair = this.c;
                c8323zE.v(((Integer) pair.first).intValue(), (C0456Fp0) pair.second, this.d, this.e);
                break;
            case 1:
                C8323zE c8323zE2 = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair2 = this.c;
                c8323zE2.o(((Integer) pair2.first).intValue(), (C0456Fp0) pair2.second, this.d, this.e);
                break;
            default:
                C8323zE c8323zE3 = (C8323zE) ((C1547Tp0) this.b.c).i;
                Pair pair3 = this.c;
                c8323zE3.E(((Integer) pair3.first).intValue(), (C0456Fp0) pair3.second, this.d, this.e);
                break;
        }
    }
}
