package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4629ik implements on {
    public final C4753o0 a;

    public C4629ik(C4753o0 c4753o0) {
        this.a = c4753o0;
    }

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Void r3) {
        boolean z;
        this.a.getClass();
        synchronized (C4729n0.class) {
            z = C4729n0.f;
        }
        return z ? new mn(this, true, "") : new mn(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final mn a() {
        return a((Void) null);
    }
}
