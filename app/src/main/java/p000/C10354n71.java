package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: n71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10354n71 extends Animation {

    /* renamed from: a */
    public final /* synthetic */ int f38130a;

    /* renamed from: b */
    public final Object f38131b;

    public /* synthetic */ C10354n71(AbstractC11122t71 abstractC11122t71, int i) {
        this.f38130a = i;
        this.f38131b = abstractC11122t71;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f38130a) {
            case 0:
                ((AbstractC11122t71) this.f38131b).setAnimationProgress(f);
                break;
            case 1:
                ((AbstractC11122t71) this.f38131b).setAnimationProgress(1.0f - f);
                break;
            default:
                O90.m5968f(transformation, "t");
                super.applyTransformation(f, transformation);
                ((C9763iW0) this.f38131b).m19056t(f, !r3.isResumed());
                break;
        }
    }

    public C10354n71(C9763iW0 c9763iW0) {
        this.f38130a = 2;
        O90.m5968f(c9763iW0, "mFragment");
        this.f38131b = c9763iW0;
    }
}
