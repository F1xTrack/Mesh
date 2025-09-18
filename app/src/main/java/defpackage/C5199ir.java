package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: ir */
/* loaded from: classes.dex */
public final class C5199ir extends AbstractC0418Fc1 {
    public static final String[] B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C3658er C = new C3658er("topLeft", 0, PointF.class);
    public static final C3658er D = new C3658er("bottomRight", 1, PointF.class);
    public static final C3658er E = new C3658er("bottomRight", 2, PointF.class);
    public static final C3658er F = new C3658er("topLeft", 3, PointF.class);
    public static final C3658er G = new C3658er("position", 4, PointF.class);

    public static void L(C1197Pc1 c1197Pc1) {
        View view = c1197Pc1.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c1197Pc1.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c1197Pc1.b.getParent());
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void f(C1197Pc1 c1197Pc1) {
        L(c1197Pc1);
    }

    @Override // defpackage.AbstractC0418Fc1
    public final void i(C1197Pc1 c1197Pc1) {
        L(c1197Pc1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0418Fc1
    public final Animator m(ViewGroup viewGroup, C1197Pc1 c1197Pc1, C1197Pc1 c1197Pc12) {
        int i;
        ObjectAnimator objectAnimatorA;
        if (c1197Pc1 == null || c1197Pc12 == null) {
            return null;
        }
        HashMap map = c1197Pc1.a;
        HashMap map2 = c1197Pc12.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = c1197Pc12.b;
        AbstractC8424zl1.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.w.getClass();
                objectAnimatorA = AbstractC1412Rw0.a(view, G, S20.t(i2, i4, i3, i5));
            } else {
                C4231hr c4231hr = new C4231hr(view);
                this.w.getClass();
                ObjectAnimator objectAnimatorA2 = AbstractC1412Rw0.a(c4231hr, C, S20.t(i2, i4, i3, i5));
                this.w.getClass();
                ObjectAnimator objectAnimatorA3 = AbstractC1412Rw0.a(c4231hr, D, S20.t(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new C3849fr(c4231hr));
                objectAnimatorA = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.w.getClass();
            objectAnimatorA = AbstractC1412Rw0.a(view, E, S20.t(i6, i8, i7, i9));
        } else {
            this.w.getClass();
            objectAnimatorA = AbstractC1412Rw0.a(view, F, S20.t(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            H02.b(viewGroup4, true);
            q().a(new C4040gr(viewGroup4));
        }
        return objectAnimatorA;
    }

    @Override // defpackage.AbstractC0418Fc1
    public final String[] s() {
        return B;
    }
}
