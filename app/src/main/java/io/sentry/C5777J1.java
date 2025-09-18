package io.sentry;

/* renamed from: io.sentry.J1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5777J1 implements InterfaceC5785M0, InterfaceC5800R1 {

    /* renamed from: a */
    public final /* synthetic */ C5786M1 f33302a;

    public /* synthetic */ C5777J1(C5786M1 c5786m1) {
        this.f33302a = c5786m1;
    }

    @Override // io.sentry.InterfaceC5800R1
    /* renamed from: a */
    public void mo21409a(C5795P1 c5795p1) {
        C5786M1 c5786m1 = this.f33302a;
        InterfaceC5982b2 interfaceC5982b2 = c5786m1.f33342q;
        if (interfaceC5982b2 != null) {
            interfaceC5982b2.mo21694b(c5795p1);
        }
        C5783L1 c5783l1 = c5786m1.f33331f;
        C5828a2 c5828a2 = c5786m1.f33343r;
        if (c5828a2.f33475e == null) {
            if (c5783l1.f33324a) {
                c5786m1.mo21434p(c5783l1.f33325b, null);
            }
        } else if (!c5828a2.f33474d || c5786m1.m21439u()) {
            c5786m1.mo21430l();
        }
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        C5786M1 c5786m1 = this.f33302a;
        c5786m1.getClass();
        synchronized (c5782l0.f33317m) {
            if (c5782l0.f33305a == c5786m1) {
                c5782l0.m21412c();
            }
        }
    }
}
