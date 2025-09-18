package p000;

import java.util.concurrent.CancellationException;

/* renamed from: zK */
/* loaded from: classes2.dex */
public abstract class AbstractC7257zK extends O81 {

    /* renamed from: c */
    public int f46791c;

    public AbstractC7257zK(int i) {
        super(0L, false);
        this.f46791c = i;
    }

    /* renamed from: d */
    public abstract InterfaceC1382Vy mo4427d();

    /* renamed from: f */
    public Throwable mo4428f(Object obj) {
        C6519nv c6519nv = obj instanceof C6519nv ? (C6519nv) obj : null;
        if (c6519nv != null) {
            return c6519nv.f38606a;
        }
        return null;
    }

    /* renamed from: h */
    public final void m26374h(Throwable th) {
        AbstractC11176tY1.m24942a(mo4427d().getContext(), new C1131Rz("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: j */
    public abstract Object mo4430j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1382Vy interfaceC1382VyMo4427d = mo4427d();
            O90.m5966d(interfaceC1382VyMo4427d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C7131xK c7131xK = (C7131xK) interfaceC1382VyMo4427d;
            AbstractC1571Yy abstractC1571Yy = c7131xK.f45548e;
            Object obj = c7131xK.f45550g;
            InterfaceC0125Bz context = abstractC1571Yy.getContext();
            Object objM3817d = IJ1.m3817d(context, obj);
            InterfaceC8044Ob0 interfaceC8044Ob0 = null;
            C8105Pf1 c8105Pf1M26159g = objM3817d != IJ1.f4892a ? AbstractC11805yU1.m26159g(abstractC1571Yy, context, objM3817d) : null;
            try {
                InterfaceC0125Bz context2 = abstractC1571Yy.getContext();
                Object objMo4430j = mo4430j();
                Throwable thMo4428f = mo4428f(objMo4430j);
                if (thMo4428f == null && WZ1.m8819a(this.f46791c)) {
                    interfaceC8044Ob0 = (InterfaceC8044Ob0) context2.mo937g(C7564Ev0.f2962e);
                }
                if (interfaceC8044Ob0 != null && !interfaceC8044Ob0.isActive()) {
                    CancellationException cancellationExceptionM10818u = ((C9002cc0) interfaceC8044Ob0).m10818u();
                    mo4426c(cancellationExceptionM10818u);
                    abstractC1571Yy.resumeWith(RQ1.m7015b(cancellationExceptionM10818u));
                } else if (thMo4428f != null) {
                    abstractC1571Yy.resumeWith(RQ1.m7015b(thMo4428f));
                } else {
                    abstractC1571Yy.resumeWith(mo4429g(objMo4430j));
                }
                if (c8105Pf1M26159g == null || c8105Pf1M26159g.m6409U()) {
                    IJ1.m3816c(context, objM3817d);
                }
            } catch (Throwable th) {
                if (c8105Pf1M26159g == null || c8105Pf1M26159g.m6409U()) {
                    IJ1.m3816c(context, objM3817d);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m26374h(th2);
        }
    }

    /* renamed from: c */
    public void mo4426c(CancellationException cancellationException) {
    }

    /* renamed from: g */
    public Object mo4429g(Object obj) {
        return obj;
    }
}
