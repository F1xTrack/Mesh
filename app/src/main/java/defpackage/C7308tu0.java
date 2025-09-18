package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: tu0 */
/* loaded from: classes2.dex */
public final class C7308tu0 implements InterfaceC7690vu0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C7308tu0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean b(MotionEvent motionEvent) {
        switch (this.a) {
        }
        return true;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final boolean d(View view) {
        switch (this.a) {
            case 0:
                return QB1.a(view);
            case 1:
                return QB1.a(view);
            case 2:
                return QB1.a(view);
            default:
                O90.f(view, "view");
                return view instanceof C3379dN0;
        }
    }

    @Override // defpackage.InterfaceC7690vu0
    public final void e(MotionEvent motionEvent) {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean f(R00 r00) {
        switch (this.a) {
            case 0:
                O90.f(r00, "handler");
                return null;
            case 1:
                O90.f(r00, "handler");
                return null;
            case 2:
                O90.f(r00, "handler");
                return null;
            default:
                O90.f(r00, "handler");
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.InterfaceC7690vu0
    public final Boolean g(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (view != null) {
                    break;
                }
                break;
        }
        return QB1.e(view, motionEvent);
    }

    @Override // defpackage.InterfaceC7690vu0
    public final void h(MotionEvent motionEvent) {
        int i = this.a;
    }

    private final void i(MotionEvent motionEvent) {
    }

    private final void j(MotionEvent motionEvent) {
    }

    private final void k(MotionEvent motionEvent) {
    }

    private final void l(MotionEvent motionEvent) {
    }

    private final void m(MotionEvent motionEvent) {
    }

    private final void n(MotionEvent motionEvent) {
    }

    private final void o(MotionEvent motionEvent) {
    }

    private final void p(MotionEvent motionEvent) {
    }
}
