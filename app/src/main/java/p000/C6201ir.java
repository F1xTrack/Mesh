package p000;

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
public final class C6201ir extends AbstractC7579Fc1 {

    /* renamed from: B */
    public static final String[] f34764B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: C */
    public static final C4016er f34765C = new C4016er("topLeft", 0, PointF.class);

    /* renamed from: D */
    public static final C4016er f34766D = new C4016er("bottomRight", 1, PointF.class);

    /* renamed from: E */
    public static final C4016er f34767E = new C4016er("bottomRight", 2, PointF.class);

    /* renamed from: F */
    public static final C4016er f34768F = new C4016er("topLeft", 3, PointF.class);

    /* renamed from: G */
    public static final C4016er f34769G = new C4016er("position", 4, PointF.class);

    /* renamed from: L */
    public static void m21934L(C8099Pc1 c8099Pc1) {
        View view = c8099Pc1.f9198b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c8099Pc1.f9197a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c8099Pc1.f9198b.getParent());
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: f */
    public final void mo2697f(C8099Pc1 c8099Pc1) {
        m21934L(c8099Pc1);
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: i */
    public final void mo2700i(C8099Pc1 c8099Pc1) {
        m21934L(c8099Pc1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC7579Fc1
    /* renamed from: m */
    public final Animator mo2704m(ViewGroup viewGroup, C8099Pc1 c8099Pc1, C8099Pc1 c8099Pc12) {
        int i;
        ObjectAnimator objectAnimatorM7129a;
        if (c8099Pc1 == null || c8099Pc12 == null) {
            return null;
        }
        HashMap map = c8099Pc1.f9197a;
        HashMap map2 = c8099Pc12.f9197a;
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
        View view = c8099Pc12.f9198b;
        AbstractC11966zl1.m26532a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f3358w.getClass();
                objectAnimatorM7129a = AbstractC8242Rw0.m7129a(view, f34769G, S20.m7156t(i2, i4, i3, i5));
            } else {
                C4205hr c4205hr = new C4205hr(view);
                this.f3358w.getClass();
                ObjectAnimator objectAnimatorM7129a2 = AbstractC8242Rw0.m7129a(c4205hr, f34765C, S20.m7156t(i2, i4, i3, i5));
                this.f3358w.getClass();
                ObjectAnimator objectAnimatorM7129a3 = AbstractC8242Rw0.m7129a(c4205hr, f34766D, S20.m7156t(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM7129a2, objectAnimatorM7129a3);
                animatorSet.addListener(new C4079fr(c4205hr));
                objectAnimatorM7129a = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f3358w.getClass();
            objectAnimatorM7129a = AbstractC8242Rw0.m7129a(view, f34767E, S20.m7156t(i6, i8, i7, i9));
        } else {
            this.f3358w.getClass();
            objectAnimatorM7129a = AbstractC8242Rw0.m7129a(view, f34768F, S20.m7156t(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            H02.m3209b(viewGroup4, true);
            m2708q().m2694a(new C4142gr(viewGroup4));
        }
        return objectAnimatorM7129a;
    }

    @Override // p000.AbstractC7579Fc1
    /* renamed from: s */
    public final String[] mo2709s() {
        return f34764B;
    }
}
