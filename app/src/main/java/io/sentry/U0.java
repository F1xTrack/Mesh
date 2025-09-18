package io.sentry;

/* loaded from: classes2.dex */
public final class U0 implements InterfaceC5112b1 {
    public final InterfaceC5112b1 a;

    public U0() {
        if (io.sentry.util.e.a || !io.sentry.util.e.b) {
            this.a = new C5139k1(1);
        } else {
            this.a = new C5139k1(0);
        }
    }

    @Override // io.sentry.InterfaceC5112b1
    public final AbstractC5083a1 now() {
        return this.a.now();
    }
}
