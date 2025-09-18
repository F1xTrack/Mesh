package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class OX extends T2 {
    public final /* synthetic */ AtomicReference a;

    public OX(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.T2
    public final void a(Object obj) {
        T2 t2 = (T2) this.a.get();
        if (t2 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        t2.a(obj);
    }
}
