package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1722d;
import androidx.fragment.app.C1724f;
import androidx.fragment.app.C1740v;
import java.util.Objects;

/* renamed from: DG */
/* loaded from: classes.dex */
public final class C0206DG extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1724f f1926a;

    /* renamed from: b */
    public final /* synthetic */ View f1927b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1928c;

    /* renamed from: d */
    public final /* synthetic */ C1740v f1929d;

    /* renamed from: e */
    public final /* synthetic */ C1722d f1930e;

    public C0206DG(C1724f c1724f, View view, boolean z, C1740v c1740v, C1722d c1722d) {
        this.f1926a = c1724f;
        this.f1927b = view;
        this.f1928c = z;
        this.f1929d = c1740v;
        this.f1930e = c1722d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O90.m5968f(animator, "anim");
        ViewGroup viewGroup = this.f1926a.f16183a;
        View view = this.f1927b;
        viewGroup.endViewTransition(view);
        C1740v c1740v = this.f1929d;
        if (this.f1928c) {
            int i = c1740v.f16277a;
            O90.m5967e(view, "viewToAnimate");
            AbstractC11153tN0.m24900l(i, view);
        }
        this.f1930e.m10020a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c1740v);
        }
    }
}
