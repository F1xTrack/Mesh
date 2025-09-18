package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class X4 extends AbstractC2123aN1 {
    public final ObjectAnimator a;
    public final boolean b;

    public X4(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        Y4 y4 = new Y4();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        y4.b = numberOfFrames2;
        int[] iArr = y4.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            y4.a = new int[numberOfFrames2];
        }
        int[] iArr2 = y4.a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        y4.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(y4.c);
        objectAnimatorOfInt.setInterpolator(y4);
        this.b = z2;
        this.a = objectAnimatorOfInt;
    }

    @Override // defpackage.AbstractC2123aN1
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.AbstractC2123aN1
    public final void f() {
        this.a.reverse();
    }

    @Override // defpackage.AbstractC2123aN1
    public final void g() {
        this.a.start();
    }

    @Override // defpackage.AbstractC2123aN1
    public final void h() {
        this.a.cancel();
    }
}
