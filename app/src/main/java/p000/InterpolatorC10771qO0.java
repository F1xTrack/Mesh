package p000;

import android.view.animation.Interpolator;

/* renamed from: qO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC10771qO0 implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f40855a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f40855a) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}
