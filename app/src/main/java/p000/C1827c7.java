package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: c7 */
/* loaded from: classes.dex */
public final class C1827c7 implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1454X6 f17306a;

    /* renamed from: b */
    public final /* synthetic */ C3908d7 f17307b;

    public C1827c7(C3908d7 c3908d7, ViewTreeObserverOnGlobalLayoutListenerC1454X6 viewTreeObserverOnGlobalLayoutListenerC1454X6) {
        this.f17307b = c3908d7;
        this.f17306a = viewTreeObserverOnGlobalLayoutListenerC1454X6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f17307b.f25822H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f17306a);
        }
    }
}
