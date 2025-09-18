package p000;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X4 */
/* loaded from: classes.dex */
public final class C1452X4 extends AbstractC8717aN1 {

    /* renamed from: a */
    public final ObjectAnimator f13551a;

    /* renamed from: b */
    public final boolean f13552b;

    public C1452X4(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C1515Y4 c1515y4 = new C1515Y4();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c1515y4.f14138b = numberOfFrames2;
        int[] iArr = c1515y4.f14137a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c1515y4.f14137a = new int[numberOfFrames2];
        }
        int[] iArr2 = c1515y4.f14137a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        c1515y4.f14139c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c1515y4.f14139c);
        objectAnimatorOfInt.setInterpolator(c1515y4);
        this.f13552b = z2;
        this.f13551a = objectAnimatorOfInt;
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: a */
    public final boolean mo8926a() {
        return this.f13552b;
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: f */
    public final void mo8927f() {
        this.f13551a.reverse();
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: g */
    public final void mo8290g() {
        this.f13551a.start();
    }

    @Override // p000.AbstractC8717aN1
    /* renamed from: h */
    public final void mo8291h() {
        this.f13551a.cancel();
    }
}
