package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* renamed from: wu0 */
/* loaded from: classes2.dex */
public final class C11602wu0 implements InterfaceC11475vu0 {

    /* renamed from: a */
    public final C11729xu0 f45160a;

    /* renamed from: b */
    public final PM0 f45161b;

    public C11602wu0(C11729xu0 c11729xu0, PM0 pm0) {
        O90.m5968f(c11729xu0, "handler");
        O90.m5968f(pm0, "swipeRefreshLayout");
        this.f45160a = c11729xu0;
        this.f45161b = pm0;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: a */
    public final boolean mo1609a() {
        return false;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: b */
    public final boolean mo1610b(MotionEvent motionEvent) {
        return true;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: c */
    public final boolean mo1611c() {
        return true;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: d */
    public final boolean mo1612d(View view) {
        return QB1.m6598a(view);
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: e */
    public final void mo1613e(MotionEvent motionEvent) {
        ArrayList<R00> arrayListM5293f;
        View childAt = this.f45161b.getChildAt(0);
        R00 r00 = null;
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        if (scrollView == null) {
            return;
        }
        C11729xu0 c11729xu0 = this.f45160a;
        T00 t00 = c11729xu0.f9891A;
        if (t00 != null && (arrayListM5293f = t00.f11093b.m5293f(scrollView)) != null) {
            for (R00 r002 : arrayListM5293f) {
                if (r002 instanceof C11729xu0) {
                    r00 = r002;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (r00 == null || r00.f9905f != 4 || scrollView.getScrollY() <= 0) {
            return;
        }
        c11729xu0.m6864m();
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: f */
    public final Boolean mo1614f(R00 r00) {
        O90.m5968f(r00, "handler");
        return null;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: g */
    public final Boolean mo1615g(View view, MotionEvent motionEvent) {
        return QB1.m6602e(view, motionEvent);
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: h */
    public final void mo1616h(MotionEvent motionEvent) {
    }
}
