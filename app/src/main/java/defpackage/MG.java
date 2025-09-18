package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import androidx.media3.ui.DefaultTimeBar;

/* loaded from: classes.dex */
public final /* synthetic */ class MG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ MG(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = DefaultTimeBar.N;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                defaultTimeBar.getClass();
                defaultTimeBar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.a);
                break;
            case 1:
                OJ oj = (OJ) obj;
                O90.f(oj, "this$0");
                O90.f(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                O90.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                oj.b.setAlpha(((Float) animatedValue).floatValue());
                break;
            case 2:
                C4329iM c4329iM = (C4329iM) obj;
                c4329iM.getClass();
                c4329iM.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                C5948mm0 c5948mm0 = (C5948mm0) obj;
                EnumC7738w9 enumC7738w9 = c5948mm0.L;
                if (enumC7738w9 == null) {
                    enumC7738w9 = EnumC7738w9.a;
                }
                if (enumC7738w9 != EnumC7738w9.b) {
                    C4246hw c4246hw = c5948mm0.q;
                    if (c4246hw != null) {
                        c4246hw.s(c5948mm0.b.a());
                        break;
                    }
                } else {
                    c5948mm0.invalidateSelf();
                    break;
                }
                break;
            case 4:
                ZV0 zv0 = (ZV0) obj;
                zv0.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC0759Jm0.f("ScreenFlashView");
                zv0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                O90.f(valueAnimator, "animator");
                Window window = ((Activity) obj).getWindow();
                if (window != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    O90.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    window.setStatusBarColor(((Integer) animatedValue2).intValue());
                    break;
                }
                break;
        }
    }
}
