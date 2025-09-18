package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ix, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0713Ix implements InterfaceC3412dY0 {
    public final AtomicReference a;

    public C0713Ix(InterfaceC3412dY0 interfaceC3412dY0) {
        this.a = new AtomicReference(interfaceC3412dY0);
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        InterfaceC3412dY0 interfaceC3412dY0 = (InterfaceC3412dY0) this.a.getAndSet(null);
        if (interfaceC3412dY0 != null) {
            return interfaceC3412dY0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
