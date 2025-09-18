package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: o71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6208o71 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC7162t71 c;

    public C6208o71(AbstractC7162t71 abstractC7162t71, int i, int i2) {
        this.c = abstractC7162t71;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.c.z.setAlpha((int) (((this.b - r0) * f) + this.a));
    }
}
