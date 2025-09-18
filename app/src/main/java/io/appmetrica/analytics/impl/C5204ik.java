package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ik */
/* loaded from: classes2.dex */
public final class C5204ik implements InterfaceC5357on {

    /* renamed from: a */
    public final C5334o0 f31945a;

    public C5204ik(C5334o0 c5334o0) {
        this.f31945a = c5334o0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(Void r3) {
        boolean z;
        this.f31945a.getClass();
        synchronized (C5309n0.class) {
            z = C5309n0.f32235f;
        }
        return z ? new C5307mn(this, true, "") : new C5307mn(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public final C5307mn m20576a() {
        return mo19211a((Void) null);
    }
}
