package defpackage;

import android.util.Pair;
import java.io.IOException;

/* renamed from: Ip0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0690Ip0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4020gk0 b;
    public final /* synthetic */ C7102sp0 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC0690Ip0(Object obj, Object obj2, C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z, int i) {
        this.a = i;
        this.f = obj;
        this.g = obj2;
        this.b = c4020gk0;
        this.c = c7102sp0;
        this.d = iOException;
        this.e = z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VY vy = (VY) this.f;
                int i = vy.b;
                this.g.K(i, (C0456Fp0) vy.c, this.b, this.c, this.d, this.e);
                break;
            default:
                C8323zE c8323zE = (C8323zE) ((C1547Tp0) ((CC0) this.f).c).i;
                Pair pair = (Pair) this.g;
                c8323zE.K(((Integer) pair.first).intValue(), (C0456Fp0) pair.second, this.b, this.c, this.d, this.e);
                break;
        }
    }
}
