package defpackage;

/* loaded from: classes.dex */
public final class X41 implements Runnable {
    public final C0844Ko1 a;
    public final C7725w41 b;
    public final boolean c;

    static {
        TE.M("StopWorkRunnable");
    }

    public X41(C0844Ko1 c0844Ko1, C7725w41 c7725w41, boolean z) {
        this.a = c0844Ko1;
        this.b = c7725w41;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC3654ep1 runnableC3654ep1;
        if (this.c) {
            PD0 pd0 = this.a.f;
            C7725w41 c7725w41 = this.b;
            pd0.getClass();
            String str = c7725w41.a.a;
            synchronized (pd0.l) {
                try {
                    TE.G().getClass();
                    runnableC3654ep1 = (RunnableC3654ep1) pd0.f.remove(str);
                    if (runnableC3654ep1 != null) {
                        pd0.h.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            PD0.d(runnableC3654ep1);
        } else {
            this.a.f.m(this.b);
        }
        TE teG = TE.G();
        C0376Eo1 c0376Eo1 = this.b.a;
        teG.getClass();
    }
}
