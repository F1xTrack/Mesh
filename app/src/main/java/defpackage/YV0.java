package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class YV0 implements InterfaceC7158t60 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ ZV0 c;

    public YV0(ZV0 zv0) {
        this.c = zv0;
    }

    @Override // defpackage.InterfaceC7158t60
    public final void a(long j, C1693Vm c1693Vm) {
        AbstractC0759Jm0.f("ScreenFlashView");
        ZV0 zv0 = this.c;
        this.a = zv0.getBrightness();
        zv0.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(c1693Vm);
        RunnableC1577Tz0 runnableC1577Tz0 = new RunnableC1577Tz0(21, c1693Vm);
        AbstractC0759Jm0.f("ScreenFlashView");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(zv0.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new MG(4, zv0));
        valueAnimatorOfFloat.addListener(new C1379Rl0(2, runnableC1577Tz0));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // defpackage.InterfaceC7158t60
    public final void clear() {
        AbstractC0759Jm0.f("ScreenFlashView");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        ZV0 zv0 = this.c;
        zv0.setAlpha(0.0f);
        zv0.setBrightness(this.a);
    }
}
