package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: c7 */
/* loaded from: classes.dex */
public final class C2454c7 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ X6 a;
    public final /* synthetic */ C3330d7 b;

    public C2454c7(C3330d7 c3330d7, X6 x6) {
        this.b = c3330d7;
        this.a = x6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
