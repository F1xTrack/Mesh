package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* renamed from: d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3313d2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3313d2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                C3324d5 c3324d5 = (C3324d5) this.b;
                ArrayList arrayList = new ArrayList(c3324d5.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C2584co0) arrayList.get(i)).b.o;
                    if (colorStateList != null) {
                        AbstractC4135hL.h(c3324d5, colorStateList);
                    }
                }
                break;
            case 2:
                C4329iM c4329iM = (C4329iM) this.b;
                c4329iM.q();
                c4329iM.r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                break;
            default:
                ((AbstractC0418Fc1) this.b).o();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                C3324d5 c3324d5 = (C3324d5) this.b;
                ArrayList arrayList = new ArrayList(c3324d5.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C3650eo0 c3650eo0 = ((C2584co0) arrayList.get(i)).b;
                    ColorStateList colorStateList = c3650eo0.o;
                    if (colorStateList != null) {
                        AbstractC4135hL.g(c3324d5, colorStateList.getColorForState(c3650eo0.s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
