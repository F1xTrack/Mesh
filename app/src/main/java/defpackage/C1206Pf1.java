package defpackage;

import kotlin.Pair;

/* renamed from: Pf1 */
/* loaded from: classes2.dex */
public final class C1206Pf1 extends JV0 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1206Pf1(InterfaceC1729Vy interfaceC1729Vy, InterfaceC0173Bz interfaceC0173Bz) {
        C1284Qf1 c1284Qf1 = C1284Qf1.a;
        super(interfaceC1729Vy, interfaceC0173Bz.g(c1284Qf1) == null ? interfaceC0173Bz.f(c1284Qf1) : interfaceC0173Bz);
        this.e = new ThreadLocal();
        if (interfaceC1729Vy.getContext().g(C0240Cv0.c) instanceof AbstractC0485Fz) {
            return;
        }
        Object objD = IJ1.d(interfaceC0173Bz, null);
        IJ1.c(interfaceC0173Bz, objD);
        V(interfaceC0173Bz, objD);
    }

    public final boolean U() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void V(InterfaceC0173Bz interfaceC0173Bz, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair(interfaceC0173Bz, obj));
    }

    @Override // defpackage.JV0, defpackage.C2548cc0
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.e.get();
            if (pair != null) {
                IJ1.c((InterfaceC0173Bz) pair.a, pair.b);
            }
            this.e.remove();
        }
        Object objB = HT1.b(obj);
        InterfaceC1729Vy interfaceC1729Vy = this.d;
        InterfaceC0173Bz context = interfaceC1729Vy.getContext();
        Object objD = IJ1.d(context, null);
        C1206Pf1 c1206Pf1G = objD != IJ1.a ? AbstractC8183yU1.g(interfaceC1729Vy, context, objD) : null;
        try {
            this.d.resumeWith(objB);
        } finally {
            if (c1206Pf1G == null || c1206Pf1G.U()) {
                IJ1.c(context, objD);
            }
        }
    }
}
