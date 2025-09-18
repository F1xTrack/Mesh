package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: uu0 */
/* loaded from: classes2.dex */
public final class C7499uu0 implements InterfaceC7690vu0 {
    public final C8070xu0 a;
    public final C3370dK0 b;
    public float c;
    public float d;
    public final int e;

    public C7499uu0(C8070xu0 c8070xu0, C3370dK0 c3370dK0) {
        O90.f(c8070xu0, "handler");
        O90.f(c3370dK0, "editText");
        this.a = c8070xu0;
        this.b = c3370dK0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c3370dK0.getContext());
        this.e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean a() {
        return true;
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
        this.a.a(false);
        this.b.onTouchEvent(motionEvent);
        this.c = motionEvent.getX();
        this.d = motionEvent.getY();
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean f(R00 r00) {
        O90.f(r00, "handler");
        return Boolean.valueOf(r00.d > 0 && !(r00 instanceof C8070xu0));
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean g(View view, MotionEvent motionEvent) {
        return QB1.e(view, motionEvent);
    }

    @Override // defpackage.InterfaceC7690vu0
    public final void h(MotionEvent motionEvent) {
        if (AbstractC1705Vq.d(motionEvent.getY(), this.d, motionEvent.getY() - this.d, (motionEvent.getX() - this.c) * (motionEvent.getX() - this.c)) < this.e) {
            this.b.h();
        }
    }
}
