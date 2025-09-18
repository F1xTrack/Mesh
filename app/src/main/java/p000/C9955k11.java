package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9955k11 implements InterfaceC0651KK {

    /* renamed from: a */
    public final InterfaceC10467o11 f36222a;

    /* renamed from: b */
    public final AtomicBoolean f36223b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicReference f36224c = new AtomicReference(null);

    public C9955k11(InterfaceC10467o11 interfaceC10467o11) {
        this.f36222a = interfaceC10467o11;
    }

    @Override // p000.InterfaceC0651KK
    /* renamed from: a */
    public final void mo4596a() {
        InterfaceC6434mZ interfaceC6434mZ;
        if (!this.f36223b.compareAndSet(false, true) || (interfaceC6434mZ = (InterfaceC6434mZ) this.f36224c.get()) == null) {
            return;
        }
        interfaceC6434mZ.invoke();
    }

    /* renamed from: b */
    public final void m22133b(Throwable th) {
        O90.m5968f(th, "error");
        if (this.f36223b.compareAndSet(false, true)) {
            InterfaceC6434mZ interfaceC6434mZ = (InterfaceC6434mZ) this.f36224c.get();
            if (interfaceC6434mZ != null) {
                interfaceC6434mZ.invoke();
            }
            this.f36222a.onError(th);
        }
    }

    /* renamed from: c */
    public final void m22134c(Object obj) {
        if (this.f36223b.compareAndSet(false, true)) {
            InterfaceC6434mZ interfaceC6434mZ = (InterfaceC6434mZ) this.f36224c.get();
            if (interfaceC6434mZ != null) {
                interfaceC6434mZ.invoke();
            }
            this.f36222a.onSuccess(obj);
        }
    }
}
