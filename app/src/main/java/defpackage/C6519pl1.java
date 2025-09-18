package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: pl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6519pl1 {
    public final WeakReference a;

    public C6519pl1(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC6900rl1 interfaceC6900rl1) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC6900rl1 != null) {
                view.animate().setListener(new C0184Cc1(interfaceC6900rl1, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
