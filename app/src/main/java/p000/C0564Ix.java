package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ix */
/* loaded from: classes2.dex */
public final class C0564Ix implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final AtomicReference f5229a;

    public C0564Ix(InterfaceC9127dY0 interfaceC9127dY0) {
        this.f5229a = new AtomicReference(interfaceC9127dY0);
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        InterfaceC9127dY0 interfaceC9127dY0 = (InterfaceC9127dY0) this.f5229a.getAndSet(null);
        if (interfaceC9127dY0 != null) {
            return interfaceC9127dY0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
