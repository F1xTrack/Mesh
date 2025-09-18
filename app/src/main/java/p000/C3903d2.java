package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* renamed from: d2 */
/* loaded from: classes.dex */
public final class C3903d2 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f25766a;

    /* renamed from: b */
    public final /* synthetic */ Object f25767b;

    public /* synthetic */ C3903d2(int i, Object obj) {
        this.f25766a = i;
        this.f25767b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f25766a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f25767b;
                actionBarOverlayLayout.f15837w = null;
                actionBarOverlayLayout.f15824j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25766a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f25767b;
                actionBarOverlayLayout.f15837w = null;
                actionBarOverlayLayout.f15824j = false;
                break;
            case 1:
                C3906d5 c3906d5 = (C3906d5) this.f25767b;
                ArrayList arrayList = new ArrayList(c3906d5.f25806e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C9026co0) arrayList.get(i)).f17766b.f26879o;
                    if (colorStateList != null) {
                        AbstractC4173hL.m18806h(c3906d5, colorStateList);
                    }
                }
                break;
            case 2:
                C4237iM c4237iM = (C4237iM) this.f25767b;
                c4237iM.m1176q();
                c4237iM.f29109r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f25767b).f18082h = null;
                break;
            default:
                ((AbstractC7579Fc1) this.f25767b).m2706o();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f25766a) {
            case 1:
                C3906d5 c3906d5 = (C3906d5) this.f25767b;
                ArrayList arrayList = new ArrayList(c3906d5.f25806e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C9287eo0 c9287eo0 = ((C9026co0) arrayList.get(i)).f17766b;
                    ColorStateList colorStateList = c9287eo0.f26879o;
                    if (colorStateList != null) {
                        AbstractC4173hL.m18805g(c3906d5, colorStateList.getColorForState(c9287eo0.f26883s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
