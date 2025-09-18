package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: n71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6017n71 extends Animation {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C6017n71(AbstractC7162t71 abstractC7162t71, int i) {
        this.a = i;
        this.b = abstractC7162t71;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.a) {
            case 0:
                ((AbstractC7162t71) this.b).setAnimationProgress(f);
                break;
            case 1:
                ((AbstractC7162t71) this.b).setAnimationProgress(1.0f - f);
                break;
            default:
                O90.f(transformation, "t");
                super.applyTransformation(f, transformation);
                ((C4360iW0) this.b).t(f, !r3.isResumed());
                break;
        }
    }

    public C6017n71(C4360iW0 c4360iW0) {
        this.a = 2;
        O90.f(c4360iW0, "mFragment");
        this.b = c4360iW0;
    }
}
