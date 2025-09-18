package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10083l11 implements InterfaceC0651KK {

    /* renamed from: a */
    public final AtomicBoolean f36821a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference f36822b = new AtomicReference(null);

    public C10083l11(C9699i11 c9699i11) {
    }

    @Override // p000.InterfaceC0651KK
    /* renamed from: a */
    public final void mo4596a() {
        InterfaceC0651KK interfaceC0651KK;
        if (!this.f36821a.compareAndSet(false, true) || (interfaceC0651KK = (InterfaceC0651KK) this.f36822b.getAndSet(null)) == null) {
            return;
        }
        interfaceC0651KK.mo4596a();
    }
}
