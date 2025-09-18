package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.FV;
import defpackage.RunnableC6880rf;
import io.sentry.android.core.D;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f implements ViewTreeObserver.OnDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Runnable c;

    public f(View view, Runnable runnable) {
        this.b = new AtomicReference(view);
        this.c = runnable;
    }

    public static void a(Activity activity, Runnable runnable, D d) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, d);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.g(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new RunnableC6880rf(window, callback, runnable, d, 19)));
            }
        }
    }

    public static void b(View view, Runnable runnable, D d) {
        f fVar = new f(view, runnable);
        d.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(fVar);
        } else {
            view.addOnAttachStateChangeListener(new e(fVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new FV(this, view, 2));
        this.a.postAtFrontOfQueue(this.c);
    }
}
