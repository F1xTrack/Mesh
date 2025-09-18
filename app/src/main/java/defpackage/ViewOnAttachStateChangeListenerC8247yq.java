package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* renamed from: yq */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8247yq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC8247yq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                BO bo = (BO) obj;
                if (bo.u != null && (accessibilityManager = bo.t) != null) {
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    if (bo.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new G1(bo.u));
                        break;
                    }
                }
                break;
            case 2:
                view.getViewTreeObserver().addOnDrawListener((GV) obj);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                AbstractC3639ek1.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.a) {
            case 0:
                ViewOnKeyListenerC0068Aq viewOnKeyListenerC0068Aq = (ViewOnKeyListenerC0068Aq) this.b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0068Aq.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0068Aq.x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0068Aq.x.removeGlobalOnLayoutListener(viewOnKeyListenerC0068Aq.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                BO bo = (BO) this.b;
                EE ee = bo.u;
                if (ee != null && (accessibilityManager = bo.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new G1(ee));
                    break;
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                break;
            default:
                ViewOnKeyListenerC6199o41 viewOnKeyListenerC6199o41 = (ViewOnKeyListenerC6199o41) this.b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC6199o41.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC6199o41.o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC6199o41.o.removeGlobalOnLayoutListener(viewOnKeyListenerC6199o41.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
