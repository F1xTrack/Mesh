package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DG extends AnimatorListenerAdapter {
    public final /* synthetic */ f a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ v d;
    public final /* synthetic */ d e;

    public DG(f fVar, View view, boolean z, v vVar, d dVar) {
        this.a = fVar;
        this.b = view;
        this.c = z;
        this.d = vVar;
        this.e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        O90.f(animator, "anim");
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        v vVar = this.d;
        if (this.c) {
            int i = vVar.a;
            O90.e(view, "viewToAnimate");
            AbstractC7209tN0.l(i, view);
        }
        this.e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(vVar);
        }
    }
}
