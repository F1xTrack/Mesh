package p000;

import android.animation.ValueAnimator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class YV0 implements InterfaceC11119t60 {

    /* renamed from: a */
    public float f14324a;

    /* renamed from: b */
    public ValueAnimator f14325b;

    /* renamed from: c */
    public final /* synthetic */ ZV0 f14326c;

    public YV0(ZV0 zv0) {
        this.f14326c = zv0;
    }

    @Override // p000.InterfaceC11119t60
    /* renamed from: a */
    public final void mo9306a(long j, C1370Vm c1370Vm) {
        AbstractC7806Jm0.m4412f("ScreenFlashView");
        ZV0 zv0 = this.f14326c;
        this.f14324a = zv0.getBrightness();
        zv0.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f14325b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(c1370Vm);
        RunnableC8352Tz0 runnableC8352Tz0 = new RunnableC8352Tz0(21, c1370Vm);
        AbstractC7806Jm0.m4412f("ScreenFlashView");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(zv0.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new C0772MG(4, zv0));
        valueAnimatorOfFloat.addListener(new C8220Rl0(2, runnableC8352Tz0));
        valueAnimatorOfFloat.start();
        this.f14325b = valueAnimatorOfFloat;
    }

    @Override // p000.InterfaceC11119t60
    public final void clear() {
        AbstractC7806Jm0.m4412f("ScreenFlashView");
        ValueAnimator valueAnimator = this.f14325b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14325b = null;
        }
        ZV0 zv0 = this.f14326c;
        zv0.setAlpha(0.0f);
        zv0.setBrightness(this.f14324a);
    }
}
