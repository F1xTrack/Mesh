package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yg */
/* loaded from: classes2.dex */
public final class C5008yg extends AbstractC4625ig {
    public C5008yg(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4567g5 c4567g5 = this.a;
        synchronized (c4567g5) {
            c4567g5.e.b();
        }
        return false;
    }
}
