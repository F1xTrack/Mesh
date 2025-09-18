package p000;

/* loaded from: classes.dex */
public abstract class WZ1 {

    /* renamed from: a */
    public static String[] f13264a;

    /* renamed from: a */
    public static final boolean m8819a(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: b */
    public static final void m8820b(C0619Jp c0619Jp, InterfaceC1382Vy interfaceC1382Vy, boolean z) {
        Object obj = C0619Jp.f5709g.get(c0619Jp);
        Throwable thMo4428f = c0619Jp.mo4428f(obj);
        Object objM7015b = thMo4428f != null ? RQ1.m7015b(thMo4428f) : c0619Jp.mo4429g(obj);
        if (!z) {
            interfaceC1382Vy.resumeWith(objM7015b);
            return;
        }
        O90.m5966d(interfaceC1382Vy, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C7131xK c7131xK = (C7131xK) interfaceC1382Vy;
        AbstractC1571Yy abstractC1571Yy = c7131xK.f45548e;
        InterfaceC0125Bz context = abstractC1571Yy.getContext();
        Object objM3817d = IJ1.m3817d(context, c7131xK.f45550g);
        C8105Pf1 c8105Pf1M26159g = objM3817d != IJ1.f4892a ? AbstractC11805yU1.m26159g(abstractC1571Yy, context, objM3817d) : null;
        try {
            abstractC1571Yy.resumeWith(objM7015b);
        } finally {
            if (c8105Pf1M26159g == null || c8105Pf1M26159g.m6409U()) {
                IJ1.m3816c(context, objM3817d);
            }
        }
    }
}
