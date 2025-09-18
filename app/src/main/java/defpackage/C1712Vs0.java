package defpackage;

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
public final class C1712Vs0 {
    public final L01 a = new L01();
    public final L01 b = new L01();

    public static C1712Vs0 a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static C1712Vs0 b(ArrayList arrayList) {
        C1712Vs0 c1712Vs0 = new C1712Vs0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1712Vs0.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC6009n5.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC6009n5.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC6009n5.d;
            }
            C1790Ws0 c1790Ws0 = new C1790Ws0();
            c1790Ws0.d = 0;
            c1790Ws0.e = 1;
            c1790Ws0.a = startDelay;
            c1790Ws0.b = duration;
            c1790Ws0.c = interpolator;
            c1790Ws0.d = objectAnimator.getRepeatCount();
            c1790Ws0.e = objectAnimator.getRepeatMode();
            c1712Vs0.a.put(propertyName, c1790Ws0);
        }
        return c1712Vs0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1712Vs0) {
            return this.a.equals(((C1712Vs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + C1712Vs0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
