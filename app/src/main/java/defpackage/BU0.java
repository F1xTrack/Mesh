package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.a;

/* loaded from: classes2.dex */
public final class BU0 extends a implements ViewTreeObserver.OnPreDrawListener {
    public InterfaceC6481pZ a;
    public WM b;
    public C5494kO0 c;

    public final void l() {
        WM wmC;
        InterfaceC6481pZ interfaceC6481pZ = this.a;
        if (interfaceC6481pZ == null || (wmC = AbstractC4346iR1.c(this)) == null) {
            return;
        }
        View rootView = getRootView();
        O90.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        C5494kO0 c5494kO0A = AbstractC4346iR1.a((ViewGroup) rootView, this);
        if (c5494kO0A == null) {
            return;
        }
        if (O90.a(this.b, wmC) && O90.a(this.c, c5494kO0A)) {
            return;
        }
        interfaceC6481pZ.b(this, wmC, c5494kO0A);
        this.b = wmC;
        this.c = c5494kO0A;
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        l();
        return true;
    }

    public final void setOnInsetsChangeHandler(InterfaceC6481pZ interfaceC6481pZ) {
        this.a = interfaceC6481pZ;
        l();
    }
}
