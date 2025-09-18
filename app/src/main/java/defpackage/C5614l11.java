package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5614l11 implements KK {
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b = new AtomicReference(null);

    public C5614l11(C4265i11 c4265i11) {
    }

    @Override // defpackage.KK
    public final void a() {
        KK kk;
        if (!this.a.compareAndSet(false, true) || (kk = (KK) this.b.getAndSet(null)) == null) {
            return;
        }
        kk.a();
    }
}
