package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class HR0 implements A81 {
    public final C2469cC a;
    public final View b;

    public HR0(View view) {
        IL1.d(view, "Argument must not be null");
        this.b = view;
        this.a = new C2469cC(view);
    }

    @Override // defpackage.A81
    public final void a(J11 j11) {
        this.a.b.remove(j11);
    }

    @Override // defpackage.A81
    public final void b(J11 j11) throws Throwable {
        C2469cC c2469cC = this.a;
        View view = c2469cC.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = c2469cC.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = c2469cC.a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = c2469cC.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            j11.n(iA, iA2);
            return;
        }
        ArrayList arrayList = c2469cC.b;
        if (!arrayList.contains(j11)) {
            arrayList.add(j11);
        }
        if (c2469cC.c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2279bC viewTreeObserverOnPreDrawListenerC2279bC = new ViewTreeObserverOnPreDrawListenerC2279bC(c2469cC);
            c2469cC.c = viewTreeObserverOnPreDrawListenerC2279bC;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2279bC);
        }
    }

    @Override // defpackage.A81
    public final void c(InterfaceC6839rR0 interfaceC6839rR0) {
        this.b.setTag(R.id.glide_custom_view_target_tag, interfaceC6839rR0);
    }

    @Override // defpackage.A81
    public final InterfaceC6839rR0 h() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6839rR0) {
            return (InterfaceC6839rR0) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.A81
    public final void i(Drawable drawable) {
        C2469cC c2469cC = this.a;
        ViewTreeObserver viewTreeObserver = c2469cC.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2469cC.c);
        }
        c2469cC.c = null;
        c2469cC.b.clear();
    }

    public final String toString() {
        return "Target for: " + this.b;
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStart() {
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onStop() {
    }

    @Override // defpackage.A81
    public final void e(Object obj) {
    }

    @Override // defpackage.A81
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.A81
    public final void g(Drawable drawable) {
    }
}
