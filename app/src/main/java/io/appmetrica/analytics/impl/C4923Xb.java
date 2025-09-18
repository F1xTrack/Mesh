package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.C4923Xb;

/* renamed from: io.appmetrica.analytics.impl.Xb */
/* loaded from: classes2.dex */
public final class C4923Xb {

    /* renamed from: a */
    public int f31029a = 5;

    /* renamed from: b */
    public final C5083e f31030b;

    public C4923Xb(InterfaceC4778Ra interfaceC4778Ra) {
        this.f31030b = new C5083e(new C5570xb(interfaceC4778Ra));
    }

    /* renamed from: b */
    public static final void m19974b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    /* renamed from: a */
    public final void m19975a(final AnrListener anrListener) {
        C5083e c5083e = this.f31030b;
        c5083e.f31507a.add(new InterfaceC5033c() { // from class: np1
            @Override // io.appmetrica.analytics.impl.InterfaceC5033c
            public final void onAppNotResponding() {
                C4923Xb.m19974b(anrListener);
            }
        });
    }
}
