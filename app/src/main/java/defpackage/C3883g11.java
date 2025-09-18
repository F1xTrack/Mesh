package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g11 */
/* loaded from: classes2.dex */
public final class C3883g11 implements InterfaceC6187o11, KK {
    public final /* synthetic */ int a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final Object d;
    public final Object e;

    public C3883g11(InterfaceC6187o11 interfaceC6187o11, C4074h11 c4074h11) {
        this.a = 0;
        this.d = interfaceC6187o11;
        this.e = c4074h11;
        this.b = new AtomicBoolean();
        this.c = new AtomicReference(null);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Vg0, mZ] */
    @Override // defpackage.KK
    public final void a() {
        Object objB;
        KK kk;
        KK kk2;
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    try {
                        ((AbstractC1676Vg0) ((C4074h11) this.e).c).invoke();
                        objB = C1518Tf1.a;
                    } catch (Throwable th) {
                        objB = RQ1.b(th);
                    }
                    Throwable thA = PS0.a(objB);
                    AtomicReference atomicReference = this.c;
                    if (thA != null) {
                        KK kk3 = (KK) atomicReference.getAndSet(null);
                        if (kk3 != null) {
                            kk3.a();
                        }
                        ((InterfaceC6187o11) this.d).onError(thA);
                    }
                    if (!(objB instanceof OS0)) {
                        KK kk4 = (KK) atomicReference.getAndSet(null);
                        if (kk4 != null) {
                            kk4.a();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (this.b.compareAndSet(false, true) && (kk = (KK) this.c.getAndSet(null)) != null) {
                    kk.a();
                    break;
                }
                break;
            default:
                if (this.b.compareAndSet(false, true) && (kk2 = (KK) this.c.getAndSet(null)) != null) {
                    kk2.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC6187o11
    public final void e0(KK kk) {
        KK kk2;
        KK kk3;
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.c;
                while (!atomicReference.compareAndSet(null, kk) && atomicReference.get() == null) {
                }
                if (this.b.get() && (kk2 = (KK) atomicReference.getAndSet(null)) != null) {
                    kk2.a();
                }
                ((InterfaceC6187o11) this.d).e0(this);
                break;
            case 1:
                ((InterfaceC6187o11) this.d).e0(kk);
                break;
            default:
                AtomicReference atomicReference2 = this.c;
                while (!atomicReference2.compareAndSet(null, kk) && atomicReference2.get() == null) {
                }
                if (this.b.get() && (kk3 = (KK) atomicReference2.getAndSet(null)) != null) {
                    kk3.a();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC6187o11
    public final void onError(Throwable th) {
        Object objB;
        switch (this.a) {
            case 0:
                O90.f(th, "e");
                if (this.b.compareAndSet(false, true)) {
                    ((InterfaceC6187o11) this.d).onError(th);
                    break;
                }
                break;
            case 1:
                O90.f(th, "e");
                if (this.b.compareAndSet(false, true)) {
                    try {
                        objB = ((AbstractC1676Vg0) ((C4074h11) this.e).c).invoke(th);
                    } catch (Throwable th2) {
                        objB = RQ1.b(th2);
                    }
                    boolean z = objB instanceof OS0;
                    InterfaceC6187o11 interfaceC6187o11 = (InterfaceC6187o11) this.d;
                    if (!z) {
                        interfaceC6187o11.onSuccess(objB);
                    }
                    Throwable thA = PS0.a(objB);
                    if (thA != null) {
                        interfaceC6187o11.onError(thA);
                        break;
                    }
                }
                break;
            default:
                O90.f(th, "e");
                if (this.b.compareAndSet(false, true)) {
                    ((InterfaceC6099nZ) this.d).invoke(th);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC6187o11
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    ((InterfaceC6187o11) this.d).onSuccess(obj);
                    break;
                }
                break;
            case 1:
                if (this.b.compareAndSet(false, true)) {
                    ((InterfaceC6187o11) this.d).onSuccess(obj);
                    break;
                }
                break;
            default:
                if (this.b.compareAndSet(false, true)) {
                    ((AbstractC1676Vg0) this.e).invoke(obj);
                    break;
                }
                break;
        }
    }

    public C3883g11(InterfaceC6187o11 interfaceC6187o11, C4074h11 c4074h11, byte b) {
        this.a = 1;
        this.d = interfaceC6187o11;
        this.e = c4074h11;
        this.b = new AtomicBoolean();
        this.c = new AtomicReference(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3883g11(InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2) {
        this.a = 2;
        O90.f(interfaceC6099nZ, "onErrorCallback");
        this.d = interfaceC6099nZ;
        this.e = (AbstractC1676Vg0) interfaceC6099nZ2;
        this.b = new AtomicBoolean();
        this.c = new AtomicReference(null);
    }
}
