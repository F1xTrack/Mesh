package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import androidx.media3.p002ui.DefaultTimeBar;

/* renamed from: MG */
/* loaded from: classes.dex */
public final /* synthetic */ class C0772MG implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f7074a;

    /* renamed from: b */
    public final /* synthetic */ Object f7075b;

    public /* synthetic */ C0772MG(int i, Object obj) {
        this.f7074a = i;
        this.f7075b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f7075b;
        switch (this.f7074a) {
            case 0:
                int i = DefaultTimeBar.f16365N;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                defaultTimeBar.getClass();
                defaultTimeBar.f16370E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f16379a);
                break;
            case 1:
                C0901OJ c0901oj = (C0901OJ) obj;
                O90.m5968f(c0901oj, "this$0");
                O90.m5968f(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                O90.m5966d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c0901oj.f8351b.setAlpha(((Float) animatedValue).floatValue());
                break;
            case 2:
                C4237iM c4237iM = (C4237iM) obj;
                c4237iM.getClass();
                c4237iM.f1353d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                C10307mm0 c10307mm0 = (C10307mm0) obj;
                EnumC7057w9 enumC7057w9 = c10307mm0.f37880L;
                if (enumC7057w9 == null) {
                    enumC7057w9 = EnumC7057w9.f44698a;
                }
                if (enumC7057w9 != EnumC7057w9.f44699b) {
                    C4210hw c4210hw = c10307mm0.f37903q;
                    if (c4210hw != null) {
                        c4210hw.mo18918s(c10307mm0.f37888b.m25694a());
                        break;
                    }
                } else {
                    c10307mm0.invalidateSelf();
                    break;
                }
                break;
            case 4:
                ZV0 zv0 = (ZV0) obj;
                zv0.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC7806Jm0.m4412f("ScreenFlashView");
                zv0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                O90.m5968f(valueAnimator, "animator");
                Window window = ((Activity) obj).getWindow();
                if (window != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    O90.m5966d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    window.setStatusBarColor(((Integer) animatedValue2).intValue());
                    break;
                }
                break;
        }
    }
}
