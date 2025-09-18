package defpackage;

import java.util.Objects;

/* renamed from: Zo1 */
/* loaded from: classes.dex */
public final class RunnableC2013Zo1 implements Runnable {
    public final C2207ap1 a;
    public final C0376Eo1 b;

    public RunnableC2013Zo1(C2207ap1 c2207ap1, C0376Eo1 c0376Eo1) {
        this.a = c2207ap1;
        this.b = c0376Eo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((RunnableC2013Zo1) this.a.b.remove(this.b)) != null) {
                    InterfaceC1935Yo1 interfaceC1935Yo1 = (InterfaceC1935Yo1) this.a.c.remove(this.b);
                    if (interfaceC1935Yo1 != null) {
                        C0376Eo1 c0376Eo1 = this.b;
                        C7762wH c7762wH = (C7762wH) interfaceC1935Yo1;
                        TE teG = TE.G();
                        Objects.toString(c0376Eo1);
                        teG.getClass();
                        c7762wH.h.execute(new RunnableC7572vH(c7762wH, 0));
                    }
                } else {
                    TE teG2 = TE.G();
                    this.b.toString();
                    teG2.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
