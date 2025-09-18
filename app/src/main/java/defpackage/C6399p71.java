package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: p71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6399p71 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ PM0 b;

    public /* synthetic */ C6399p71(PM0 pm0, int i) {
        this.a = i;
        this.b = pm0;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.a) {
            case 0:
                PM0 pm0 = this.b;
                int iAbs = !pm0.G ? pm0.x - Math.abs(pm0.w) : pm0.x;
                pm0.setTargetOffsetTopAndBottom((pm0.v + ((int) ((iAbs - r1) * f))) - pm0.t.getTop());
                C6347os c6347os = pm0.z;
                float f2 = 1.0f - f;
                C6156ns c6156ns = c6347os.a;
                if (f2 != c6156ns.p) {
                    c6156ns.p = f2;
                }
                c6347os.invalidateSelf();
                break;
            default:
                this.b.k(f);
                break;
        }
    }
}
