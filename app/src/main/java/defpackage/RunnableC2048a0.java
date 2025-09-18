package defpackage;

/* renamed from: a0 */
/* loaded from: classes.dex */
public final class RunnableC2048a0 implements Runnable {
    public final C8007xZ0 a;
    public final InterfaceFutureC0750Jj0 b;

    public RunnableC2048a0(C8007xZ0 c8007xZ0, InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        this.a = c8007xZ0;
        this.b = interfaceFutureC0750Jj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (AbstractC5799m0.f.b(this.a, this, AbstractC5799m0.f(this.b))) {
            AbstractC5799m0.b(this.a);
        }
    }
}
