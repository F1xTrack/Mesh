package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* renamed from: yq */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC7226yq implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f46505a;

    /* renamed from: b */
    public final /* synthetic */ Object f46506b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC7226yq(int i, Object obj) {
        this.f46505a = i;
        this.f46506b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f46506b;
        switch (this.f46505a) {
            case 1:
                C0088BO c0088bo = (C0088BO) obj;
                if (c0088bo.f796u != null && (accessibilityManager = c0088bo.f795t) != null) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    if (c0088bo.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0380G1(c0088bo.f796u));
                        break;
                    }
                }
                break;
            case 2:
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserverOnDrawListenerC0410GV) obj);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                AbstractC9280ek1.m18029c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f46505a) {
            case 0:
                ViewOnKeyListenerC0053Aq viewOnKeyListenerC0053Aq = (ViewOnKeyListenerC0053Aq) this.f46506b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0053Aq.f420x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0053Aq.f420x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0053Aq.f420x.removeGlobalOnLayoutListener(viewOnKeyListenerC0053Aq.f405i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C0088BO c0088bo = (C0088BO) this.f46506b;
                C0267EE c0267ee = c0088bo.f796u;
                if (c0267ee != null && (accessibilityManager = c0088bo.f795t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0380G1(c0267ee));
                    break;
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                break;
            default:
                ViewOnKeyListenerC10476o41 viewOnKeyListenerC10476o41 = (ViewOnKeyListenerC10476o41) this.f46506b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC10476o41.f38783o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC10476o41.f38783o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC10476o41.f38783o.removeGlobalOnLayoutListener(viewOnKeyListenerC10476o41.f38777i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* renamed from: a */
    private final void m26265a(View view) {
    }

    /* renamed from: b */
    private final void m26266b(View view) {
    }

    /* renamed from: c */
    private final void m26267c(View view) {
    }
}
