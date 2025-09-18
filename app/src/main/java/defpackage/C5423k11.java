package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5423k11 implements KK {
    public final InterfaceC6187o11 a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(null);

    public C5423k11(InterfaceC6187o11 interfaceC6187o11) {
        this.a = interfaceC6187o11;
    }

    @Override // defpackage.KK
    public final void a() {
        InterfaceC5908mZ interfaceC5908mZ;
        if (!this.b.compareAndSet(false, true) || (interfaceC5908mZ = (InterfaceC5908mZ) this.c.get()) == null) {
            return;
        }
        interfaceC5908mZ.invoke();
    }

    public final void b(Throwable th) {
        O90.f(th, "error");
        if (this.b.compareAndSet(false, true)) {
            InterfaceC5908mZ interfaceC5908mZ = (InterfaceC5908mZ) this.c.get();
            if (interfaceC5908mZ != null) {
                interfaceC5908mZ.invoke();
            }
            this.a.onError(th);
        }
    }

    public final void c(Object obj) {
        if (this.b.compareAndSet(false, true)) {
            InterfaceC5908mZ interfaceC5908mZ = (InterfaceC5908mZ) this.c.get();
            if (interfaceC5908mZ != null) {
                interfaceC5908mZ.invoke();
            }
            this.a.onSuccess(obj);
        }
    }
}
