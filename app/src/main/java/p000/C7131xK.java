package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: xK */
/* loaded from: classes2.dex */
public final class C7131xK extends AbstractC7257zK implements InterfaceC0880Nz, InterfaceC1382Vy {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45546h = AtomicReferenceFieldUpdater.newUpdater(C7131xK.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final AbstractC0377Fz f45547d;

    /* renamed from: e */
    public final AbstractC1571Yy f45548e;

    /* renamed from: f */
    public Object f45549f;

    /* renamed from: g */
    public final Object f45550g;

    public C7131xK(AbstractC0377Fz abstractC0377Fz, AbstractC1571Yy abstractC1571Yy) {
        super(-1);
        this.f45547d = abstractC0377Fz;
        this.f45548e = abstractC1571Yy;
        this.f45549f = EU0.f2719a;
        Object objMo938j = abstractC1571Yy.getContext().mo938j(0, IJ1.f4893b);
        O90.m5965c(objMo938j);
        this.f45550g = objMo938j;
    }

    @Override // p000.InterfaceC0880Nz
    public final InterfaceC0880Nz getCallerFrame() {
        return this.f45548e;
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return this.f45548e.getContext();
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: j */
    public final Object mo4430j() {
        Object obj = this.f45549f;
        this.f45549f = EU0.f2719a;
        return obj;
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        Throwable thM6365a = PS0.m6365a(obj);
        Object c6519nv = thM6365a == null ? obj : new C6519nv(thM6365a, false);
        AbstractC1571Yy abstractC1571Yy = this.f45548e;
        InterfaceC0125Bz context = abstractC1571Yy.getContext();
        AbstractC0377Fz abstractC0377Fz = this.f45547d;
        if (abstractC0377Fz.mo2868n(context)) {
            this.f45549f = c6519nv;
            this.f46791c = 0;
            abstractC0377Fz.mo732l(abstractC1571Yy.getContext(), this);
            return;
        }
        AbstractC0656KP abstractC0656KPM8938a = X91.m8938a();
        if (abstractC0656KPM8938a.f6063c >= 4294967296L) {
            this.f45549f = c6519nv;
            this.f46791c = 0;
            C6470n8 c6470n8 = abstractC0656KPM8938a.f6065e;
            if (c6470n8 == null) {
                c6470n8 = new C6470n8();
                abstractC0656KPM8938a.f6065e = c6470n8;
            }
            c6470n8.m23084i(this);
            return;
        }
        abstractC0656KPM8938a.m4629x(true);
        try {
            InterfaceC0125Bz context2 = abstractC1571Yy.getContext();
            Object objM3817d = IJ1.m3817d(context2, this.f45550g);
            try {
                abstractC1571Yy.resumeWith(obj);
                while (abstractC0656KPM8938a.m4626D()) {
                }
            } finally {
                IJ1.m3816c(context2, objM3817d);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f45547d + ", " + AbstractC7187yD.m26099e(this.f45548e) + ']';
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: d */
    public final InterfaceC1382Vy mo4427d() {
        return this;
    }
}
