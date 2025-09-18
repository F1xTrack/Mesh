package defpackage;

import android.widget.PopupWindow;

/* renamed from: Qq0 */
/* loaded from: classes.dex */
public final class C1316Qq0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C1394Rq0 a;

    public C1316Qq0(C1394Rq0 c1394Rq0) {
        this.a = c1394Rq0;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
