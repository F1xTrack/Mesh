package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* renamed from: wu0 */
/* loaded from: classes2.dex */
public final class C7880wu0 implements InterfaceC7690vu0 {
    public final C8070xu0 a;
    public final PM0 b;

    public C7880wu0(C8070xu0 c8070xu0, PM0 pm0) {
        O90.f(c8070xu0, "handler");
        O90.f(pm0, "swipeRefreshLayout");
        this.a = c8070xu0;
        this.b = pm0;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean b(MotionEvent motionEvent) {
        return true;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean d(View view) {
        return QB1.a(view);
    }

    @Override // defpackage.InterfaceC7690vu0
    public final void e(MotionEvent motionEvent) {
        ArrayList<R00> arrayListF;
        View childAt = this.b.getChildAt(0);
        R00 r00 = null;
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        if (scrollView == null) {
            return;
        }
        C8070xu0 c8070xu0 = this.a;
        T00 t00 = c8070xu0.A;
        if (t00 != null && (arrayListF = t00.b.f(scrollView)) != null) {
            for (R00 r002 : arrayListF) {
                if (r002 instanceof C8070xu0) {
                    r00 = r002;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (r00 == null || r00.f != 4 || scrollView.getScrollY() <= 0) {
            return;
        }
        c8070xu0.m();
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean f(R00 r00) {
        O90.f(r00, "handler");
        return null;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean g(View view, MotionEvent motionEvent) {
        return QB1.e(view, motionEvent);
    }

    @Override // defpackage.InterfaceC7690vu0
    public final void h(MotionEvent motionEvent) {
    }
}
