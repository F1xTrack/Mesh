package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import defpackage.AbstractC0314Du;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.f;
import io.sentry.android.replay.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements f {
    public final D1 a;
    public final ReplayIntegration b;
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();

    public b(D1 d1, ReplayIntegration replayIntegration) {
        this.a = d1;
        this.b = replayIntegration;
    }

    @Override // io.sentry.android.replay.f
    public final void a(View view, boolean z) {
        O90.f(view, "root");
        synchronized (this.d) {
            try {
                if (z) {
                    this.c.add(new WeakReference(view));
                    Window windowO = io.sentry.config.a.o(view);
                    D1 d1 = this.a;
                    if (windowO == null) {
                        d1.getLogger().k(EnumC5148n1.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                    } else {
                        Window.Callback callback = windowO.getCallback();
                        if (!(callback instanceof a)) {
                            windowO.setCallback(new a(d1, this.b, callback));
                        }
                    }
                } else {
                    b(view);
                    AbstractC0314Du.q(this.c, new y(1, view));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(View view) throws IllegalAccessException, IllegalArgumentException {
        Window windowO = io.sentry.config.a.o(view);
        if (windowO == null) {
            this.a.getLogger().k(EnumC5148n1.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowO.getCallback();
        if (callback instanceof a) {
            windowO.setCallback(((a) callback).a);
        }
    }
}
