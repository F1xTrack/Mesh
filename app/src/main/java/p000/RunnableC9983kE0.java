package p000;

/* renamed from: kE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9983kE0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36366a;

    /* renamed from: b */
    public final /* synthetic */ C10623pE0 f36367b;

    public /* synthetic */ RunnableC9983kE0(C10623pE0 c10623pE0, int i) {
        this.f36366a = i;
        this.f36367b = c10623pE0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36366a) {
            case 0:
                this.f36367b.f39923G = true;
                break;
            case 1:
                this.f36367b.m23659y();
                break;
            default:
                C10623pE0 c10623pE0 = this.f36367b;
                if (!c10623pE0.f39929M) {
                    InterfaceC11846yp0 interfaceC11846yp0 = c10623pE0.f39946q;
                    interfaceC11846yp0.getClass();
                    interfaceC11846yp0.mo1885m(c10623pE0);
                    break;
                }
                break;
        }
    }
}
