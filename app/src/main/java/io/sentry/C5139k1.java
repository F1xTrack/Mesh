package io.sentry;

/* renamed from: io.sentry.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5139k1 implements InterfaceC5112b1 {
    public final /* synthetic */ int a;

    @Override // io.sentry.InterfaceC5112b1
    public final AbstractC5083a1 now() {
        switch (this.a) {
            case 0:
                return new C5136j1();
            default:
                return new C5164q1();
        }
    }
}
