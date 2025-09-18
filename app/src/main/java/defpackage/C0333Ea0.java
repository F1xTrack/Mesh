package defpackage;

import android.view.ViewParent;

/* renamed from: Ea0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333Ea0 implements InterfaceC1649Ux0 {
    public volatile int a = -1;
    public ViewParent b;

    public final void a(int i, ViewParent viewParent) {
        this.a = i;
        ViewParent viewParent2 = this.b;
        if (viewParent2 != null) {
            viewParent2.requestDisallowInterceptTouchEvent(false);
        }
        this.b = null;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.b = viewParent;
        }
    }
}
