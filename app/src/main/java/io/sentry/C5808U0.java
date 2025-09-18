package io.sentry;

import io.sentry.util.AbstractC6172e;

/* renamed from: io.sentry.U0 */
/* loaded from: classes2.dex */
public final class C5808U0 implements InterfaceC5981b1 {

    /* renamed from: a */
    public final InterfaceC5981b1 f33410a;

    public C5808U0() {
        if (AbstractC6172e.f34662a || !AbstractC6172e.f34663b) {
            this.f33410a = new C6056k1(1);
        } else {
            this.f33410a = new C6056k1(0);
        }
    }

    @Override // io.sentry.InterfaceC5981b1
    public final AbstractC5827a1 now() {
        return this.f33410a.now();
    }
}
