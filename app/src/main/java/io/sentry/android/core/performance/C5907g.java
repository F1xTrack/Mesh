package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.AbstractWindowCallbackC5877g;
import p000.RunnableC6757rf;

/* renamed from: io.sentry.android.core.performance.g */
/* loaded from: classes2.dex */
public final class C5907g extends AbstractWindowCallbackC5877g {

    /* renamed from: b */
    public final RunnableC6757rf f33836b;

    public C5907g(Window.Callback callback, RunnableC6757rf runnableC6757rf) {
        super(callback);
        this.f33836b = runnableC6757rf;
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC5877g, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f33836b.run();
    }
}
