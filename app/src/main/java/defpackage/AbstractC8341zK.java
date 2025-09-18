package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: zK */
/* loaded from: classes2.dex */
public abstract class AbstractC8341zK extends O81 {
    public int c;

    public AbstractC8341zK(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract InterfaceC1729Vy d();

    public Throwable f(Object obj) {
        C6165nv c6165nv = obj instanceof C6165nv ? (C6165nv) obj : null;
        if (c6165nv != null) {
            return c6165nv.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        AbstractC7243tY1.a(d().getContext(), new C1420Rz("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1729Vy interfaceC1729VyD = d();
            O90.d(interfaceC1729VyD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C7961xK c7961xK = (C7961xK) interfaceC1729VyD;
            AbstractC1963Yy abstractC1963Yy = c7961xK.e;
            Object obj = c7961xK.g;
            InterfaceC0173Bz context = abstractC1963Yy.getContext();
            Object objD = IJ1.d(context, obj);
            InterfaceC1115Ob0 interfaceC1115Ob0 = null;
            C1206Pf1 c1206Pf1G = objD != IJ1.a ? AbstractC8183yU1.g(abstractC1963Yy, context, objD) : null;
            try {
                InterfaceC0173Bz context2 = abstractC1963Yy.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null && WZ1.a(this.c)) {
                    interfaceC1115Ob0 = (InterfaceC1115Ob0) context2.g(C0396Ev0.e);
                }
                if (interfaceC1115Ob0 != null && !interfaceC1115Ob0.isActive()) {
                    CancellationException cancellationExceptionU = ((C2548cc0) interfaceC1115Ob0).u();
                    c(cancellationExceptionU);
                    abstractC1963Yy.resumeWith(RQ1.b(cancellationExceptionU));
                } else if (thF != null) {
                    abstractC1963Yy.resumeWith(RQ1.b(thF));
                } else {
                    abstractC1963Yy.resumeWith(g(objJ));
                }
                if (c1206Pf1G == null || c1206Pf1G.U()) {
                    IJ1.c(context, objD);
                }
            } catch (Throwable th) {
                if (c1206Pf1G == null || c1206Pf1G.U()) {
                    IJ1.c(context, objD);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
