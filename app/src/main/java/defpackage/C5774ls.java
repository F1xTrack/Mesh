package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ls */
/* loaded from: classes.dex */
public final class C5774ls implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C6156ns a;
    public final /* synthetic */ C6347os b;

    public C5774ls(C6347os c6347os, C6156ns c6156ns) {
        this.b = c6347os;
        this.a = c6156ns;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C6347os c6347os = this.b;
        c6347os.getClass();
        C6156ns c6156ns = this.a;
        C6347os.d(fFloatValue, c6156ns);
        c6347os.a(fFloatValue, c6156ns, false);
        c6347os.invalidateSelf();
    }
}
