package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: pl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10690pl1 {

    /* renamed from: a */
    public final WeakReference f40376a;

    public C10690pl1(View view) {
        this.f40376a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m23870a(float f) {
        View view = (View) this.f40376a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void m23871b() {
        View view = (View) this.f40376a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m23872c(long j) {
        View view = (View) this.f40376a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: d */
    public final void m23873d(InterfaceC10946rl1 interfaceC10946rl1) {
        View view = (View) this.f40376a.get();
        if (view != null) {
            if (interfaceC10946rl1 != null) {
                view.animate().setListener(new C7423Cc1(interfaceC10946rl1, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m23874e(float f) {
        View view = (View) this.f40376a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
