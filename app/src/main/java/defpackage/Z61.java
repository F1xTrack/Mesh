package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Z61 {
    public static final Range p = C0500Ge.f;
    public final Object a = new Object();
    public final Size b;
    public final CM c;
    public final Range d;
    public final InterfaceC7480uo e;
    public final boolean f;
    public final C0599Hl g;
    public final C0365El h;
    public final C0599Hl i;
    public final C0365El j;
    public final C0365El k;
    public final G70 l;
    public C1123Oe m;
    public Y61 n;
    public Executor o;

    public Z61(Size size, InterfaceC7480uo interfaceC7480uo, boolean z, CM cm, Range range, L61 l61) {
        this.b = size;
        this.e = interfaceC7480uo;
        this.f = z;
        AbstractC3377dM1.d("SurfaceRequest's DynamicRange must always be fully specified.", cm.b());
        this.c = cm;
        this.d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new InterfaceC0443Fl() { // from class: V61
            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i) {
                    case 0:
                        atomicReference.set(c0365El);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(c0365El);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(c0365El);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        C0365El c0365El = (C0365El) atomicReference.get();
        c0365El.getClass();
        this.k = c0365El;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        C0599Hl c0599HlB2 = AbstractC8171yQ1.b(new InterfaceC0443Fl() { // from class: V61
            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El2) {
                switch (i2) {
                    case 0:
                        atomicReference2.set(c0365El2);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(c0365El2);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(c0365El2);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.i = c0599HlB2;
        AbstractC1500Sz1.a(c0599HlB2, new C0999Mo1(c0365El, c0599HlB), QR1.a());
        C0365El c0365El2 = (C0365El) atomicReference2.get();
        c0365El2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        C0599Hl c0599HlB3 = AbstractC8171yQ1.b(new InterfaceC0443Fl() { // from class: V61
            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El22) {
                switch (i3) {
                    case 0:
                        atomicReference3.set(c0365El22);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(c0365El22);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(c0365El22);
                        return AbstractC1705Vq.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.g = c0599HlB3;
        C0365El c0365El3 = (C0365El) atomicReference3.get();
        c0365El3.getClass();
        this.h = c0365El3;
        G70 g70 = new G70(this, size);
        this.l = g70;
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L = AbstractC1500Sz1.l(g70.e);
        AbstractC1500Sz1.a(c0599HlB3, new C6846rT1(interfaceFutureC0750Jj0L, c0365El2, str, 25), QR1.a());
        interfaceFutureC0750Jj0L.d(new IG(this, 1), QR1.a());
        TJ tjA = QR1.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        AbstractC1500Sz1.a(AbstractC8171yQ1.b(new H30(this, 13, atomicReference4)), new C5996n11(2, l61), tjA);
        C0365El c0365El4 = (C0365El) atomicReference4.get();
        c0365El4.getClass();
        this.j = c0365El4;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final InterfaceC6556py interfaceC6556py) {
        if (!this.h.b(surface)) {
            C0599Hl c0599Hl = this.g;
            if (!c0599Hl.isCancelled()) {
                AbstractC3377dM1.i(c0599Hl.b.isDone(), null);
                try {
                    c0599Hl.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: W61
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    interfaceC6556py.b(new C1045Ne(3, surface));
                                    break;
                                default:
                                    interfaceC6556py.b(new C1045Ne(4, surface));
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
                                    interfaceC6556py.b(new C1045Ne(3, surface));
                                    break;
                                default:
                                    interfaceC6556py.b(new C1045Ne(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        AbstractC1500Sz1.a(this.i, new C4332iN(interfaceC6556py, 28, surface), executor);
    }

    public final void c(Executor executor, Y61 y61) {
        C1123Oe c1123Oe;
        synchronized (this.a) {
            this.n = y61;
            this.o = executor;
            c1123Oe = this.m;
        }
        if (c1123Oe != null) {
            executor.execute(new U61(y61, c1123Oe, 1));
        }
    }

    public final void d() {
        this.h.d(new C0254Da("Surface request will not complete.", 4));
    }
}
