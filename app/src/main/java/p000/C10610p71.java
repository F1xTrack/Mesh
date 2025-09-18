package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: p71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10610p71 extends Animation {

    /* renamed from: a */
    public final /* synthetic */ int f39846a;

    /* renamed from: b */
    public final /* synthetic */ PM0 f39847b;

    public /* synthetic */ C10610p71(PM0 pm0, int i) {
        this.f39846a = i;
        this.f39847b = pm0;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f39846a) {
            case 0:
                PM0 pm0 = this.f39847b;
                int iAbs = !pm0.f42850G ? pm0.f42877x - Math.abs(pm0.f42876w) : pm0.f42877x;
                pm0.setTargetOffsetTopAndBottom((pm0.f42875v + ((int) ((iAbs - r1) * f))) - pm0.f42873t.getTop());
                C6581os c6581os = pm0.f42879z;
                float f2 = 1.0f - f;
                C6516ns c6516ns = c6581os.f39316a;
                if (f2 != c6516ns.f38580p) {
                    c6516ns.f38580p = f2;
                }
                c6581os.invalidateSelf();
                break;
            default:
                this.f39847b.m24845k(f);
                break;
        }
    }
}
