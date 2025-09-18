package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: uu0 */
/* loaded from: classes2.dex */
public final class C11347uu0 implements InterfaceC11475vu0 {

    /* renamed from: a */
    public final C11729xu0 f44008a;

    /* renamed from: b */
    public final C9099dK0 f44009b;

    /* renamed from: c */
    public float f44010c;

    /* renamed from: d */
    public float f44011d;

    /* renamed from: e */
    public final int f44012e;

    public C11347uu0(C11729xu0 c11729xu0, C9099dK0 c9099dK0) {
        O90.m5968f(c11729xu0, "handler");
        O90.m5968f(c9099dK0, "editText");
        this.f44008a = c11729xu0;
        this.f44009b = c9099dK0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c9099dK0.getContext());
        this.f44012e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: a */
    public final boolean mo1609a() {
        return true;
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
        this.f44008a.mo721a(false);
        this.f44009b.onTouchEvent(motionEvent);
        this.f44010c = motionEvent.getX();
        this.f44011d = motionEvent.getY();
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: f */
    public final Boolean mo1614f(R00 r00) {
        O90.m5968f(r00, "handler");
        return Boolean.valueOf(r00.f9903d > 0 && !(r00 instanceof C11729xu0));
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: g */
    public final Boolean mo1615g(View view, MotionEvent motionEvent) {
        return QB1.m6602e(view, motionEvent);
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: h */
    public final void mo1616h(MotionEvent motionEvent) {
        if (AbstractC1374Vq.m8585d(motionEvent.getY(), this.f44011d, motionEvent.getY() - this.f44011d, (motionEvent.getX() - this.f44010c) * (motionEvent.getX() - this.f44010c)) < this.f44012e) {
            this.f44009b.m17539h();
        }
    }
}
