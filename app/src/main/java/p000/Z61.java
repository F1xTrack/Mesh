package p000;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Z61 {

    /* renamed from: p */
    public static final Range f14736p = C0419Ge.f3838f;

    /* renamed from: a */
    public final Object f14737a = new Object();

    /* renamed from: b */
    public final Size f14738b;

    /* renamed from: c */
    public final C0149CM f14739c;

    /* renamed from: d */
    public final Range f14740d;

    /* renamed from: e */
    public final InterfaceC6972uo f14741e;

    /* renamed from: f */
    public final boolean f14742f;

    /* renamed from: g */
    public final C0489Hl f14743g;

    /* renamed from: h */
    public final C0300El f14744h;

    /* renamed from: i */
    public final C0489Hl f14745i;

    /* renamed from: j */
    public final C0300El f14746j;

    /* renamed from: k */
    public final C0300El f14747k;

    /* renamed from: l */
    public final G70 f14748l;

    /* renamed from: m */
    public C0922Oe f14749m;

    /* renamed from: n */
    public Y61 f14750n;

    /* renamed from: o */
    public Executor f14751o;

    public Z61(Size size, InterfaceC6972uo interfaceC6972uo, boolean z, C0149CM c0149cm, Range range, L61 l61) {
        this.f14738b = size;
        this.f14741e = interfaceC6972uo;
        this.f14742f = z;
        AbstractC9104dM1.m17545d("SurfaceRequest's DynamicRange must always be fully specified.", c0149cm.m1147b());
        this.f14739c = c0149cm;
        this.f14740d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl() { // from class: V61
            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i) {
                    case 0:
                        atomicReference.set(c0300El);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(c0300El);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(c0300El);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        C0300El c0300El = (C0300El) atomicReference.get();
        c0300El.getClass();
        this.f14747k = c0300El;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        C0489Hl c0489HlM26149b2 = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl() { // from class: V61
            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El2) {
                switch (i2) {
                    case 0:
                        atomicReference2.set(c0300El2);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(c0300El2);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(c0300El2);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f14745i = c0489HlM26149b2;
        AbstractC8301Sz1.m7478a(c0489HlM26149b2, new C7967Mo1(c0300El, c0489HlM26149b), QR1.m6703a());
        C0300El c0300El2 = (C0300El) atomicReference2.get();
        c0300El2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        C0489Hl c0489HlM26149b3 = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl() { // from class: V61
            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El22) {
                switch (i3) {
                    case 0:
                        atomicReference3.set(c0300El22);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(c0300El22);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(c0300El22);
                        return AbstractC1374Vq.m8593l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f14743g = c0489HlM26149b3;
        C0300El c0300El3 = (C0300El) atomicReference3.get();
        c0300El3.getClass();
        this.f14744h = c0300El3;
        G70 g70 = new G70(this, size);
        this.f14748l = g70;
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7489l = AbstractC8301Sz1.m7489l(g70.f29023e);
        AbstractC8301Sz1.m7478a(c0489HlM26149b3, new C10910rT1(interfaceFutureC7800Jj0M7489l, c0300El2, str, 25), QR1.m6703a());
        interfaceFutureC7800Jj0M7489l.mo2494d(new RunnableC0521IG(this, 1), QR1.m6703a());
        ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        AbstractC8301Sz1.m7478a(AbstractC11797yQ1.m26149b(new H30(this, 13, atomicReference4)), new C10339n11(2, l61), executorC1215TJM6703a);
        C0300El c0300El4 = (C0300El) atomicReference4.get();
        c0300El4.getClass();
        this.f14746j = c0300El4;
    }

    /* renamed from: a */
    public final boolean m9490a() {
        return this.f14743g.f4484b.isDone();
    }

    /* renamed from: b */
    public final void m9491b(final Surface surface, Executor executor, final InterfaceC6650py interfaceC6650py) {
        if (!this.f14744h.m2375b(surface)) {
            C0489Hl c0489Hl = this.f14743g;
            if (!c0489Hl.isCancelled()) {
                AbstractC9104dM1.m17550i(c0489Hl.f4484b.isDone(), null);
                try {
                    c0489Hl.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: W61
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    interfaceC6650py.mo3020b(new C0859Ne(3, surface));
                                    break;
                                default:
                                    interfaceC6650py.mo3020b(new C0859Ne(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: W61
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    interfaceC6650py.mo3020b(new C0859Ne(3, surface));
                                    break;
                                default:
                                    interfaceC6650py.mo3020b(new C0859Ne(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        AbstractC8301Sz1.m7478a(this.f14745i, new C4238iN(interfaceC6650py, 28, surface), executor);
    }

    /* renamed from: c */
    public final void m9492c(Executor executor, Y61 y61) {
        C0922Oe c0922Oe;
        synchronized (this.f14737a) {
            this.f14750n = y61;
            this.f14751o = executor;
            c0922Oe = this.f14749m;
        }
        if (c0922Oe != null) {
            executor.execute(new U61(y61, c0922Oe, 1));
        }
    }

    /* renamed from: d */
    public final void m9493d() {
        this.f14744h.m2377d(new C0226Da("Surface request will not complete.", 4));
    }
}
