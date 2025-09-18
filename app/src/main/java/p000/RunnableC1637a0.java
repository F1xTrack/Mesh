package p000;

/* renamed from: a0 */
/* loaded from: classes.dex */
public final class RunnableC1637a0 implements Runnable {

    /* renamed from: a */
    public final C11687xZ0 f15273a;

    /* renamed from: b */
    public final InterfaceFutureC7800Jj0 f15274b;

    public RunnableC1637a0(C11687xZ0 c11687xZ0, InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        this.f15273a = c11687xZ0;
        this.f15274b = interfaceFutureC7800Jj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15273a.f37381a != this) {
            return;
        }
        if (AbstractC6399m0.f37379f.mo9445b(this.f15273a, this, AbstractC6399m0.m22609f(this.f15274b))) {
            AbstractC6399m0.m22606b(this.f15273a);
        }
    }
}
