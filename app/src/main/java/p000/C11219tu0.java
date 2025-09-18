package p000;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: tu0 */
/* loaded from: classes2.dex */
public final class C11219tu0 implements InterfaceC11475vu0 {

    /* renamed from: a */
    public final /* synthetic */ int f43406a;

    public /* synthetic */ C11219tu0(int i) {
        this.f43406a = i;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: a */
    public final boolean mo1609a() {
        switch (this.f43406a) {
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

    @Override // p000.InterfaceC11475vu0
    /* renamed from: b */
    public final boolean mo1610b(MotionEvent motionEvent) {
        switch (this.f43406a) {
        }
        return true;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: c */
    public final boolean mo1611c() {
        switch (this.f43406a) {
        }
        return false;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: d */
    public final boolean mo1612d(View view) {
        switch (this.f43406a) {
            case 0:
                return QB1.m6598a(view);
            case 1:
                return QB1.m6598a(view);
            case 2:
                return QB1.m6598a(view);
            default:
                O90.m5968f(view, "view");
                return view instanceof C9105dN0;
        }
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: e */
    public final void mo1613e(MotionEvent motionEvent) {
        int i = this.f43406a;
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: f */
    public final Boolean mo1614f(R00 r00) {
        switch (this.f43406a) {
            case 0:
                O90.m5968f(r00, "handler");
                return null;
            case 1:
                O90.m5968f(r00, "handler");
                return null;
            case 2:
                O90.m5968f(r00, "handler");
                return null;
            default:
                O90.m5968f(r00, "handler");
                return Boolean.FALSE;
        }
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: g */
    public final Boolean mo1615g(View view, MotionEvent motionEvent) {
        switch (this.f43406a) {
            case 1:
                if (view != null) {
                    break;
                }
                break;
        }
        return QB1.m6602e(view, motionEvent);
    }

    @Override // p000.InterfaceC11475vu0
    /* renamed from: h */
    public final void mo1616h(MotionEvent motionEvent) {
        int i = this.f43406a;
    }

    /* renamed from: i */
    private final void m25029i(MotionEvent motionEvent) {
    }

    /* renamed from: j */
    private final void m25030j(MotionEvent motionEvent) {
    }

    /* renamed from: k */
    private final void m25031k(MotionEvent motionEvent) {
    }

    /* renamed from: l */
    private final void m25032l(MotionEvent motionEvent) {
    }

    /* renamed from: m */
    private final void m25033m(MotionEvent motionEvent) {
    }

    /* renamed from: n */
    private final void m25034n(MotionEvent motionEvent) {
    }

    /* renamed from: o */
    private final void m25035o(MotionEvent motionEvent) {
    }

    /* renamed from: p */
    private final void m25036p(MotionEvent motionEvent) {
    }
}
