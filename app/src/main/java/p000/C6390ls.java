package p000;

import android.animation.ValueAnimator;

/* renamed from: ls */
/* loaded from: classes.dex */
public final class C6390ls implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C6516ns f37327a;

    /* renamed from: b */
    public final /* synthetic */ C6581os f37328b;

    public C6390ls(C6581os c6581os, C6516ns c6516ns) {
        this.f37328b = c6581os;
        this.f37327a = c6516ns;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C6581os c6581os = this.f37328b;
        c6581os.getClass();
        C6516ns c6516ns = this.f37327a;
        C6581os.m23571d(fFloatValue, c6516ns);
        c6581os.m23572a(fFloatValue, c6516ns, false);
        c6581os.invalidateSelf();
    }
}
