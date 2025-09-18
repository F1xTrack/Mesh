package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g11 */
/* loaded from: classes2.dex */
public final class C9443g11 implements InterfaceC10467o11, InterfaceC0651KK {

    /* renamed from: a */
    public final /* synthetic */ int f27527a;

    /* renamed from: b */
    public final AtomicBoolean f27528b;

    /* renamed from: c */
    public final AtomicReference f27529c;

    /* renamed from: d */
    public final Object f27530d;

    /* renamed from: e */
    public final Object f27531e;

    public C9443g11(InterfaceC10467o11 interfaceC10467o11, C9571h11 c9571h11) {
        this.f27527a = 0;
        this.f27530d = interfaceC10467o11;
        this.f27531e = c9571h11;
        this.f27528b = new AtomicBoolean();
        this.f27529c = new AtomicReference(null);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Vg0, mZ] */
    @Override // p000.InterfaceC0651KK
    /* renamed from: a */
    public final void mo4596a() {
        Object objM7015b;
        InterfaceC0651KK interfaceC0651KK;
        InterfaceC0651KK interfaceC0651KK2;
        switch (this.f27527a) {
            case 0:
                if (this.f27528b.compareAndSet(false, true)) {
                    try {
                        ((AbstractC8418Vg0) ((C9571h11) this.f27531e).f28167c).invoke();
                        objM7015b = C8313Tf1.f11463a;
                    } catch (Throwable th) {
                        objM7015b = RQ1.m7015b(th);
                    }
                    Throwable thM6365a = PS0.m6365a(objM7015b);
                    AtomicReference atomicReference = this.f27529c;
                    if (thM6365a != null) {
                        InterfaceC0651KK interfaceC0651KK3 = (InterfaceC0651KK) atomicReference.getAndSet(null);
                        if (interfaceC0651KK3 != null) {
                            interfaceC0651KK3.mo4596a();
                        }
                        ((InterfaceC10467o11) this.f27530d).onError(thM6365a);
                    }
                    if (!(objM7015b instanceof OS0)) {
                        InterfaceC0651KK interfaceC0651KK4 = (InterfaceC0651KK) atomicReference.getAndSet(null);
                        if (interfaceC0651KK4 != null) {
                            interfaceC0651KK4.mo4596a();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (this.f27528b.compareAndSet(false, true) && (interfaceC0651KK = (InterfaceC0651KK) this.f27529c.getAndSet(null)) != null) {
                    interfaceC0651KK.mo4596a();
                    break;
                }
                break;
            default:
                if (this.f27528b.compareAndSet(false, true) && (interfaceC0651KK2 = (InterfaceC0651KK) this.f27529c.getAndSet(null)) != null) {
                    interfaceC0651KK2.mo4596a();
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public final void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        InterfaceC0651KK interfaceC0651KK2;
        InterfaceC0651KK interfaceC0651KK3;
        switch (this.f27527a) {
            case 0:
                AtomicReference atomicReference = this.f27529c;
                while (!atomicReference.compareAndSet(null, interfaceC0651KK) && atomicReference.get() == null) {
                }
                if (this.f27528b.get() && (interfaceC0651KK2 = (InterfaceC0651KK) atomicReference.getAndSet(null)) != null) {
                    interfaceC0651KK2.mo4596a();
                }
                ((InterfaceC10467o11) this.f27530d).mo1066e0(this);
                break;
            case 1:
                ((InterfaceC10467o11) this.f27530d).mo1066e0(interfaceC0651KK);
                break;
            default:
                AtomicReference atomicReference2 = this.f27529c;
                while (!atomicReference2.compareAndSet(null, interfaceC0651KK) && atomicReference2.get() == null) {
                }
                if (this.f27528b.get() && (interfaceC0651KK3 = (InterfaceC0651KK) atomicReference2.getAndSet(null)) != null) {
                    interfaceC0651KK3.mo4596a();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Vg0, nZ] */
    @Override // p000.InterfaceC10467o11
    public final void onError(Throwable th) {
        Object objM7015b;
        switch (this.f27527a) {
            case 0:
                O90.m5968f(th, "e");
                if (this.f27528b.compareAndSet(false, true)) {
                    ((InterfaceC10467o11) this.f27530d).onError(th);
                    break;
                }
                break;
            case 1:
                O90.m5968f(th, "e");
                if (this.f27528b.compareAndSet(false, true)) {
                    try {
                        objM7015b = ((AbstractC8418Vg0) ((C9571h11) this.f27531e).f28167c).invoke(th);
                    } catch (Throwable th2) {
                        objM7015b = RQ1.m7015b(th2);
                    }
                    boolean z = objM7015b instanceof OS0;
                    InterfaceC10467o11 interfaceC10467o11 = (InterfaceC10467o11) this.f27530d;
                    if (!z) {
                        interfaceC10467o11.onSuccess(objM7015b);
                    }
                    Throwable thM6365a = PS0.m6365a(objM7015b);
                    if (thM6365a != null) {
                        interfaceC10467o11.onError(thM6365a);
                        break;
                    }
                }
                break;
            default:
                O90.m5968f(th, "e");
                if (this.f27528b.compareAndSet(false, true)) {
                    ((InterfaceC6497nZ) this.f27530d).invoke(th);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Vg0, nZ] */
    @Override // p000.InterfaceC10467o11
    public final void onSuccess(Object obj) {
        switch (this.f27527a) {
            case 0:
                if (this.f27528b.compareAndSet(false, true)) {
                    ((InterfaceC10467o11) this.f27530d).onSuccess(obj);
                    break;
                }
                break;
            case 1:
                if (this.f27528b.compareAndSet(false, true)) {
                    ((InterfaceC10467o11) this.f27530d).onSuccess(obj);
                    break;
                }
                break;
            default:
                if (this.f27528b.compareAndSet(false, true)) {
                    ((AbstractC8418Vg0) this.f27531e).invoke(obj);
                    break;
                }
                break;
        }
    }

    public C9443g11(InterfaceC10467o11 interfaceC10467o11, C9571h11 c9571h11, byte b) {
        this.f27527a = 1;
        this.f27530d = interfaceC10467o11;
        this.f27531e = c9571h11;
        this.f27528b = new AtomicBoolean();
        this.f27529c = new AtomicReference(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9443g11(InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2) {
        this.f27527a = 2;
        O90.m5968f(interfaceC6497nZ, "onErrorCallback");
        this.f27530d = interfaceC6497nZ;
        this.f27531e = (AbstractC8418Vg0) interfaceC6497nZ2;
        this.f27528b = new AtomicBoolean();
        this.f27529c = new AtomicReference(null);
    }
}
