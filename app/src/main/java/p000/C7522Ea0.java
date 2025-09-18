package p000;

import android.view.ViewParent;

/* renamed from: Ea0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7522Ea0 implements InterfaceC8400Ux0 {

    /* renamed from: a */
    public volatile int f2787a = -1;

    /* renamed from: b */
    public ViewParent f2788b;

    /* renamed from: a */
    public final void m2355a(int i, ViewParent viewParent) {
        this.f2787a = i;
        ViewParent viewParent2 = this.f2788b;
        if (viewParent2 != null) {
            viewParent2.requestDisallowInterceptTouchEvent(false);
        }
        this.f2788b = null;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f2788b = viewParent;
        }
    }
}
