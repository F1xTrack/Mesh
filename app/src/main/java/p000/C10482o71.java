package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: o71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10482o71 extends Animation {

    /* renamed from: a */
    public final /* synthetic */ int f38822a;

    /* renamed from: b */
    public final /* synthetic */ int f38823b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC11122t71 f38824c;

    public C10482o71(AbstractC11122t71 abstractC11122t71, int i, int i2) {
        this.f38824c = abstractC11122t71;
        this.f38822a = i;
        this.f38823b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f38824c.f42879z.setAlpha((int) (((this.f38823b - r0) * f) + this.f38822a));
    }
}
