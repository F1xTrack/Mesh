package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.Xb;

/* loaded from: classes2.dex */
public final class Xb {
    public int a = 5;
    public final C4513e b;

    public Xb(Ra ra) {
        this.b = new C4513e(new C4979xb(ra));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C4513e c4513e = this.b;
        c4513e.a.add(new InterfaceC4463c() { // from class: np1
            @Override // io.appmetrica.analytics.impl.InterfaceC4463c
            public final void onAppNotResponding() {
                Xb.b(anrListener);
            }
        });
    }
}
