package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.C5977y;
import io.sentry.android.replay.InterfaceC5944f;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.config.AbstractC6003a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.AbstractC0246Du;
import p000.O90;

/* renamed from: io.sentry.android.replay.gestures.b */
/* loaded from: classes2.dex */
public final class C5947b implements InterfaceC5944f {

    /* renamed from: a */
    public final C5759D1 f33978a;

    /* renamed from: b */
    public final ReplayIntegration f33979b;

    /* renamed from: c */
    public final ArrayList f33980c = new ArrayList();

    /* renamed from: d */
    public final Object f33981d = new Object();

    public C5947b(C5759D1 c5759d1, ReplayIntegration replayIntegration) {
        this.f33978a = c5759d1;
        this.f33979b = replayIntegration;
    }

    @Override // io.sentry.android.replay.InterfaceC5944f
    /* renamed from: a */
    public final void mo21668a(View view, boolean z) {
        O90.m5968f(view, "root");
        synchronized (this.f33981d) {
            try {
                if (z) {
                    this.f33980c.add(new WeakReference(view));
                    Window windowM21756o = AbstractC6003a.m21756o(view);
                    C5759D1 c5759d1 = this.f33978a;
                    if (windowM21756o == null) {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                    } else {
                        Window.Callback callback = windowM21756o.getCallback();
                        if (!(callback instanceof WindowCallbackC5946a)) {
                            windowM21756o.setCallback(new WindowCallbackC5946a(c5759d1, this.f33979b, callback));
                        }
                    }
                } else {
                    m21670b(view);
                    AbstractC0246Du.m1924q(this.f33980c, new C5977y(1, view));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m21670b(View view) throws IllegalAccessException, IllegalArgumentException {
        Window windowM21756o = AbstractC6003a.m21756o(view);
        if (windowM21756o == null) {
            this.f33978a.getLogger().mo21407k(EnumC6069n1.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowM21756o.getCallback();
        if (callback instanceof WindowCallbackC5946a) {
            windowM21756o.setCallback(((WindowCallbackC5946a) callback).f33975a);
        }
    }
}
