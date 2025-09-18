package io.sentry.android.core.performance;

import android.view.Window;
import defpackage.RunnableC6880rf;

/* loaded from: classes2.dex */
public final class g extends io.sentry.android.core.internal.gestures.g {
    public final RunnableC6880rf b;

    public g(Window.Callback callback, RunnableC6880rf runnableC6880rf) {
        super(callback);
        this.b = runnableC6880rf;
    }

    @Override // io.sentry.android.core.internal.gestures.g, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.b.run();
    }
}
