package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: wm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7856wm0 extends ValueAnimator implements Choreographer.FrameCallback {
    public C1847Xl0 l;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public float j = -2.1474836E9f;
    public float k = 2.1474836E9f;
    public boolean m = false;
    public boolean n = false;

    public final float a() {
        C1847Xl0 c1847Xl0 = this.l;
        if (c1847Xl0 == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = c1847Xl0.l;
        return (f - f2) / (c1847Xl0.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        j(i());
        l(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            l(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C1847Xl0 c1847Xl0 = this.l;
        if (c1847Xl0 == null || !this.m) {
            return;
        }
        float fAbs = (this.f != 0 ? j - r4 : 0L) / ((1.0E9f / c1847Xl0.n) / Math.abs(this.d));
        float f = this.g;
        if (i()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fH = h();
        float fE = e();
        PointF pointF = AbstractC2215as0.a;
        boolean z = f2 >= fH && f2 <= fE;
        float f3 = this.g;
        float fB = AbstractC2215as0.b(f2, h(), e());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (!this.n || this.g != f3) {
            k();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    this.d = -this.d;
                } else {
                    float fE2 = i() ? e() : h();
                    this.g = fE2;
                    this.h = fE2;
                }
                this.f = j;
            } else {
                float fH2 = this.d < 0.0f ? h() : e();
                this.g = fH2;
                this.h = fH2;
                l(true);
                j(i());
            }
        }
        if (this.l == null) {
            return;
        }
        float f4 = this.h;
        if (f4 < this.j || f4 > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    public final float e() {
        C1847Xl0 c1847Xl0 = this.l;
        if (c1847Xl0 == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? c1847Xl0.m : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fH;
        float fE;
        float fH2;
        if (this.l == null) {
            return 0.0f;
        }
        if (i()) {
            fH = e() - this.h;
            fE = e();
            fH2 = h();
        } else {
            fH = this.h - h();
            fE = e();
            fH2 = h();
        }
        return fH / (fE - fH2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C1847Xl0 c1847Xl0 = this.l;
        if (c1847Xl0 == null) {
            return 0L;
        }
        return (long) c1847Xl0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final float h() {
        C1847Xl0 c1847Xl0 = this.l;
        if (c1847Xl0 == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? c1847Xl0.l : f;
    }

    public final boolean i() {
        return this.d < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final void j(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void k() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void l(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public final void m(float f) {
        if (this.g == f) {
            return;
        }
        float fB = AbstractC2215as0.b(f, h(), e());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        k();
    }

    public final void n(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        C1847Xl0 c1847Xl0 = this.l;
        float f3 = c1847Xl0 == null ? -3.4028235E38f : c1847Xl0.l;
        float f4 = c1847Xl0 == null ? Float.MAX_VALUE : c1847Xl0.m;
        float fB = AbstractC2215as0.b(f, f3, f4);
        float fB2 = AbstractC2215as0.b(f2, f3, f4);
        if (fB == this.j && fB2 == this.k) {
            return;
        }
        this.j = fB;
        this.k = fB2;
        m((int) AbstractC2215as0.b(this.h, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
