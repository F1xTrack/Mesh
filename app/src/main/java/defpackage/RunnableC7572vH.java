package defpackage;

import android.os.Handler;
import java.util.Objects;

/* renamed from: vH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7572vH implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7762wH b;

    public /* synthetic */ RunnableC7572vH(C7762wH c7762wH, int i) {
        this.a = i;
        this.b = c7762wH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C7762wH.a(this.b);
                return;
            default:
                C7762wH c7762wH = this.b;
                if (c7762wH.g != 0) {
                    TE teG = TE.G();
                    Objects.toString(c7762wH.c);
                    teG.getClass();
                    return;
                }
                c7762wH.g = 1;
                TE teG2 = TE.G();
                Objects.toString(c7762wH.c);
                teG2.getClass();
                if (!c7762wH.d.d.j(c7762wH.l, null)) {
                    c7762wH.b();
                    return;
                }
                C2207ap1 c2207ap1 = c7762wH.d.c;
                C0376Eo1 c0376Eo1 = c7762wH.c;
                synchronized (c2207ap1.d) {
                    TE teG3 = TE.G();
                    Objects.toString(c0376Eo1);
                    teG3.getClass();
                    c2207ap1.a(c0376Eo1);
                    RunnableC2013Zo1 runnableC2013Zo1 = new RunnableC2013Zo1(c2207ap1, c0376Eo1);
                    c2207ap1.b.put(c0376Eo1, runnableC2013Zo1);
                    c2207ap1.c.put(c0376Eo1, c7762wH);
                    ((Handler) c2207ap1.a.b).postDelayed(runnableC2013Zo1, 600000L);
                }
                return;
        }
    }
}
