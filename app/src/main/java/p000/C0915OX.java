package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: OX */
/* loaded from: classes.dex */
public final class C0915OX extends AbstractC1198T2 {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f8473a;

    public C0915OX(AtomicReference atomicReference) {
        this.f8473a = atomicReference;
    }

    @Override // p000.AbstractC1198T2
    /* renamed from: a */
    public final void mo6082a(Object obj) {
        AbstractC1198T2 abstractC1198T2 = (AbstractC1198T2) this.f8473a.get();
        if (abstractC1198T2 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC1198T2.mo6082a(obj);
    }
}
