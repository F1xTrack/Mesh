package io.sentry.android.core.internal.util;

import android.view.View;

/* renamed from: io.sentry.android.core.internal.util.e */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC5885e implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC5886f f33759a;

    public ViewOnAttachStateChangeListenerC5885e(ViewTreeObserverOnDrawListenerC5886f viewTreeObserverOnDrawListenerC5886f) {
        this.f33759a = viewTreeObserverOnDrawListenerC5886f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.f33759a);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
