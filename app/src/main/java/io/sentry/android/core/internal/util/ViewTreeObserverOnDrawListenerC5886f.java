package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.internal.gestures.WindowCallbackC5872b;
import io.sentry.android.core.performance.C5907g;
import java.util.concurrent.atomic.AtomicReference;
import p000.RunnableC6757rf;
import p000.ViewTreeObserverOnGlobalLayoutListenerC0347FV;

/* renamed from: io.sentry.android.core.internal.util.f */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC5886f implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final Handler f33760a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f33761b;

    /* renamed from: c */
    public final Runnable f33762c;

    public ViewTreeObserverOnDrawListenerC5886f(View view, Runnable runnable) {
        this.f33761b = new AtomicReference(view);
        this.f33762c = runnable;
    }

    /* renamed from: a */
    public static void m21584a(Activity activity, Runnable runnable, C5832D c5832d) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                m21585b(viewPeekDecorView, runnable, c5832d);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new C5907g(callback != null ? callback : new WindowCallbackC5872b(), new RunnableC6757rf(window, callback, runnable, c5832d, 19)));
            }
        }
    }

    /* renamed from: b */
    public static void m21585b(View view, Runnable runnable, C5832D c5832d) {
        ViewTreeObserverOnDrawListenerC5886f viewTreeObserverOnDrawListenerC5886f = new ViewTreeObserverOnDrawListenerC5886f(view, runnable);
        c5832d.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC5886f);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5885e(viewTreeObserverOnDrawListenerC5886f));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.f33761b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0347FV(this, view, 2));
        this.f33760a.postAtFrontOfQueue(this.f33762c);
    }
}
