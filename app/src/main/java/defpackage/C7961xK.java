package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: xK */
/* loaded from: classes2.dex */
public final class C7961xK extends AbstractC8341zK implements InterfaceC1108Nz, InterfaceC1729Vy {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C7961xK.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC0485Fz d;
    public final AbstractC1963Yy e;
    public Object f;
    public final Object g;

    public C7961xK(AbstractC0485Fz abstractC0485Fz, AbstractC1963Yy abstractC1963Yy) {
        super(-1);
        this.d = abstractC0485Fz;
        this.e = abstractC1963Yy;
        this.f = EU0.a;
        Object objJ = abstractC1963Yy.getContext().j(0, IJ1.b);
        O90.c(objJ);
        this.g = objJ;
    }

    @Override // defpackage.InterfaceC1108Nz
    public final InterfaceC1108Nz getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.AbstractC8341zK
    public final Object j() {
        Object obj = this.f;
        this.f = EU0.a;
        return obj;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        Throwable thA = PS0.a(obj);
        Object c6165nv = thA == null ? obj : new C6165nv(thA, false);
        AbstractC1963Yy abstractC1963Yy = this.e;
        InterfaceC0173Bz context = abstractC1963Yy.getContext();
        AbstractC0485Fz abstractC0485Fz = this.d;
        if (abstractC0485Fz.n(context)) {
            this.f = c6165nv;
            this.c = 0;
            abstractC0485Fz.l(abstractC1963Yy.getContext(), this);
            return;
        }
        KP kpA = X91.a();
        if (kpA.c >= 4294967296L) {
            this.f = c6165nv;
            this.c = 0;
            C6018n8 c6018n8 = kpA.e;
            if (c6018n8 == null) {
                c6018n8 = new C6018n8();
                kpA.e = c6018n8;
            }
            c6018n8.i(this);
            return;
        }
        kpA.x(true);
        try {
            InterfaceC0173Bz context2 = abstractC1963Yy.getContext();
            Object objD = IJ1.d(context2, this.g);
            try {
                abstractC1963Yy.resumeWith(obj);
                while (kpA.D()) {
                }
            } finally {
                IJ1.c(context2, objD);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC8130yD.e(this.e) + ']';
    }

    @Override // defpackage.AbstractC8341zK
    public final InterfaceC1729Vy d() {
        return this;
    }
}
