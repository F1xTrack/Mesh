package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* renamed from: Vs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8442Vs0 {

    /* renamed from: a */
    public final L01 f12841a = new L01();

    /* renamed from: b */
    public final L01 f12842b = new L01();

    /* renamed from: a */
    public static C8442Vs0 m8612a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m8613b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m8613b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: b */
    public static C8442Vs0 m8613b(ArrayList arrayList) {
        C8442Vs0 c8442Vs0 = new C8442Vs0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c8442Vs0.f12842b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC6467n5.f38091b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC6467n5.f38092c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC6467n5.f38093d;
            }
            C8494Ws0 c8494Ws0 = new C8494Ws0();
            c8494Ws0.f13430d = 0;
            c8494Ws0.f13431e = 1;
            c8494Ws0.f13427a = startDelay;
            c8494Ws0.f13428b = duration;
            c8494Ws0.f13429c = interpolator;
            c8494Ws0.f13430d = objectAnimator.getRepeatCount();
            c8494Ws0.f13431e = objectAnimator.getRepeatMode();
            c8442Vs0.f12841a.put(propertyName, c8494Ws0);
        }
        return c8442Vs0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8442Vs0) {
            return this.f12841a.equals(((C8442Vs0) obj).f12841a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12841a.hashCode();
    }

    public final String toString() {
        return "\n" + C8442Vs0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f12841a + "}\n";
    }
}
