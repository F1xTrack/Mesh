package defpackage;

/* loaded from: classes.dex */
public abstract class WZ1 {
    public static String[] a;

    public static final boolean a(int i) {
        return i == 1 || i == 2;
    }

    public static final void b(C0767Jp c0767Jp, InterfaceC1729Vy interfaceC1729Vy, boolean z) {
        Object obj = C0767Jp.g.get(c0767Jp);
        Throwable thF = c0767Jp.f(obj);
        Object objB = thF != null ? RQ1.b(thF) : c0767Jp.g(obj);
        if (!z) {
            interfaceC1729Vy.resumeWith(objB);
            return;
        }
        O90.d(interfaceC1729Vy, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C7961xK c7961xK = (C7961xK) interfaceC1729Vy;
        AbstractC1963Yy abstractC1963Yy = c7961xK.e;
        InterfaceC0173Bz context = abstractC1963Yy.getContext();
        Object objD = IJ1.d(context, c7961xK.g);
        C1206Pf1 c1206Pf1G = objD != IJ1.a ? AbstractC8183yU1.g(abstractC1963Yy, context, objD) : null;
        try {
            abstractC1963Yy.resumeWith(objB);
        } finally {
            if (c1206Pf1G == null || c1206Pf1G.U()) {
                IJ1.c(context, objD);
            }
        }
    }
}
