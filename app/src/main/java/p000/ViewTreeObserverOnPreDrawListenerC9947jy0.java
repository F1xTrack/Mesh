package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: jy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC9947jy0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f35465a;

    /* renamed from: b */
    public ViewTreeObserver f35466b;

    /* renamed from: c */
    public final Runnable f35467c;

    public ViewTreeObserverOnPreDrawListenerC9947jy0(View view, Runnable runnable) {
        this.f35465a = view;
        this.f35466b = view.getViewTreeObserver();
        this.f35467c = runnable;
    }

    /* renamed from: a */
    public static void m22130a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC9947jy0 viewTreeObserverOnPreDrawListenerC9947jy0 = new ViewTreeObserverOnPreDrawListenerC9947jy0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC9947jy0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC9947jy0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f35466b.isAlive();
        View view = this.f35465a;
        if (zIsAlive) {
            this.f35466b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f35467c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f35466b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f35466b.isAlive();
        View view2 = this.f35465a;
        if (zIsAlive) {
            this.f35466b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
