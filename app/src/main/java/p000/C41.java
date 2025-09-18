package p000;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class C41 extends AbstractC3902d1 {

    /* renamed from: a */
    public final AtomicReference f1177a = new AtomicReference(null);

    @Override // p000.AbstractC3902d1
    /* renamed from: a */
    public final boolean mo977a(AbstractC1821c1 abstractC1821c1) {
        AtomicReference atomicReference = this.f1177a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(JI1.f5445a);
        return true;
    }

    @Override // p000.AbstractC3902d1
    /* renamed from: b */
    public final InterfaceC1382Vy[] mo978b(AbstractC1821c1 abstractC1821c1) {
        this.f1177a.set(null);
        return AbstractC7247zA.f46694a;
    }
}
