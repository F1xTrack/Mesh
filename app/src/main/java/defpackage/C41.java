package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class C41 extends AbstractC3309d1 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.AbstractC3309d1
    public final boolean a(AbstractC2433c1 abstractC2433c1) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(JI1.a);
        return true;
    }

    @Override // defpackage.AbstractC3309d1
    public final InterfaceC1729Vy[] b(AbstractC2433c1 abstractC2433c1) {
        this.a.set(null);
        return AbstractC8311zA.a;
    }
}
