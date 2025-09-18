package p000;

import kotlin.Pair;

/* renamed from: Pf1 */
/* loaded from: classes2.dex */
public final class C8105Pf1 extends JV0 {

    /* renamed from: e */
    public final ThreadLocal f9218e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8105Pf1(InterfaceC1382Vy interfaceC1382Vy, InterfaceC0125Bz interfaceC0125Bz) {
        C8157Qf1 c8157Qf1 = C8157Qf1.f9714a;
        super(interfaceC1382Vy, interfaceC0125Bz.mo937g(c8157Qf1) == null ? interfaceC0125Bz.mo936f(c8157Qf1) : interfaceC0125Bz);
        this.f9218e = new ThreadLocal();
        if (interfaceC1382Vy.getContext().mo937g(C7460Cv0.f1753c) instanceof AbstractC0377Fz) {
            return;
        }
        Object objM3817d = IJ1.m3817d(interfaceC0125Bz, null);
        IJ1.m3816c(interfaceC0125Bz, objM3817d);
        m6410V(interfaceC0125Bz, objM3817d);
    }

    /* renamed from: U */
    public final boolean m6409U() {
        boolean z = this.threadLocalIsSet && this.f9218e.get() == null;
        this.f9218e.remove();
        return !z;
    }

    /* renamed from: V */
    public final void m6410V(InterfaceC0125Bz interfaceC0125Bz, Object obj) {
        this.threadLocalIsSet = true;
        this.f9218e.set(new Pair(interfaceC0125Bz, obj));
    }

    @Override // p000.JV0, p000.C9002cc0
    /* renamed from: h */
    public final void mo4337h(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f9218e.get();
            if (pair != null) {
                IJ1.m3816c((InterfaceC0125Bz) pair.f36702a, pair.f36703b);
            }
            this.f9218e.remove();
        }
        Object objM3452b = HT1.m3452b(obj);
        InterfaceC1382Vy interfaceC1382Vy = this.f5561d;
        InterfaceC0125Bz context = interfaceC1382Vy.getContext();
        Object objM3817d = IJ1.m3817d(context, null);
        C8105Pf1 c8105Pf1M26159g = objM3817d != IJ1.f4892a ? AbstractC11805yU1.m26159g(interfaceC1382Vy, context, objM3817d) : null;
        try {
            this.f5561d.resumeWith(objM3452b);
        } finally {
            if (c8105Pf1M26159g == null || c8105Pf1M26159g.m6409U()) {
                IJ1.m3816c(context, objM3817d);
            }
        }
    }
}
