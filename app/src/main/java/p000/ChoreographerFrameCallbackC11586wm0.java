package p000;

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
public final class ChoreographerFrameCallbackC11586wm0 extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: l */
    public C8532Xl0 f45094l;

    /* renamed from: a */
    public final CopyOnWriteArraySet f45083a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final CopyOnWriteArraySet f45084b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final CopyOnWriteArraySet f45085c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public float f45086d = 1.0f;

    /* renamed from: e */
    public boolean f45087e = false;

    /* renamed from: f */
    public long f45088f = 0;

    /* renamed from: g */
    public float f45089g = 0.0f;

    /* renamed from: h */
    public float f45090h = 0.0f;

    /* renamed from: i */
    public int f45091i = 0;

    /* renamed from: j */
    public float f45092j = -2.1474836E9f;

    /* renamed from: k */
    public float f45093k = 2.1474836E9f;

    /* renamed from: m */
    public boolean f45095m = false;

    /* renamed from: n */
    public boolean f45096n = false;

    /* renamed from: a */
    public final float m25694a() {
        C8532Xl0 c8532Xl0 = this.f45094l;
        if (c8532Xl0 == null) {
            return 0.0f;
        }
        float f = this.f45090h;
        float f2 = c8532Xl0.f13958l;
        return (f - f2) / (c8532Xl0.f13959m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f45084b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f45085c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f45083a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f45084b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m25698j(m25697i());
        m25700l(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f45095m) {
            m25700l(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C8532Xl0 c8532Xl0 = this.f45094l;
        if (c8532Xl0 == null || !this.f45095m) {
            return;
        }
        float fAbs = (this.f45088f != 0 ? j - r4 : 0L) / ((1.0E9f / c8532Xl0.f13960n) / Math.abs(this.f45086d));
        float f = this.f45089g;
        if (m25697i()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fM25696h = m25696h();
        float fM25695e = m25695e();
        PointF pointF = AbstractC8778as0.f16638a;
        boolean z = f2 >= fM25696h && f2 <= fM25695e;
        float f3 = this.f45089g;
        float fM10350b = AbstractC8778as0.m10350b(f2, m25696h(), m25695e());
        this.f45089g = fM10350b;
        if (this.f45096n) {
            fM10350b = (float) Math.floor(fM10350b);
        }
        this.f45090h = fM10350b;
        this.f45088f = j;
        if (!this.f45096n || this.f45089g != f3) {
            m25699k();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.f45091i < getRepeatCount()) {
                Iterator it = this.f45084b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f45091i++;
                if (getRepeatMode() == 2) {
                    this.f45087e = !this.f45087e;
                    this.f45086d = -this.f45086d;
                } else {
                    float fM25695e2 = m25697i() ? m25695e() : m25696h();
                    this.f45089g = fM25695e2;
                    this.f45090h = fM25695e2;
                }
                this.f45088f = j;
            } else {
                float fM25696h2 = this.f45086d < 0.0f ? m25696h() : m25695e();
                this.f45089g = fM25696h2;
                this.f45090h = fM25696h2;
                m25700l(true);
                m25698j(m25697i());
            }
        }
        if (this.f45094l == null) {
            return;
        }
        float f4 = this.f45090h;
        if (f4 < this.f45092j || f4 > this.f45093k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f45092j), Float.valueOf(this.f45093k), Float.valueOf(this.f45090h)));
        }
    }

    /* renamed from: e */
    public final float m25695e() {
        C8532Xl0 c8532Xl0 = this.f45094l;
        if (c8532Xl0 == null) {
            return 0.0f;
        }
        float f = this.f45093k;
        return f == 2.1474836E9f ? c8532Xl0.f13959m : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM25696h;
        float fM25695e;
        float fM25696h2;
        if (this.f45094l == null) {
            return 0.0f;
        }
        if (m25697i()) {
            fM25696h = m25695e() - this.f45090h;
            fM25695e = m25695e();
            fM25696h2 = m25696h();
        } else {
            fM25696h = this.f45090h - m25696h();
            fM25695e = m25695e();
            fM25696h2 = m25696h();
        }
        return fM25696h / (fM25695e - fM25696h2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m25694a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C8532Xl0 c8532Xl0 = this.f45094l;
        if (c8532Xl0 == null) {
            return 0L;
        }
        return (long) c8532Xl0.m9111b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* renamed from: h */
    public final float m25696h() {
        C8532Xl0 c8532Xl0 = this.f45094l;
        if (c8532Xl0 == null) {
            return 0.0f;
        }
        float f = this.f45092j;
        return f == -2.1474836E9f ? c8532Xl0.f13958l : f;
    }

    /* renamed from: i */
    public final boolean m25697i() {
        return this.f45086d < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f45095m;
    }

    /* renamed from: j */
    public final void m25698j(boolean z) {
        Iterator it = this.f45084b.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public final void m25699k() {
        Iterator it = this.f45083a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* renamed from: l */
    public final void m25700l(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f45095m = false;
        }
    }

    /* renamed from: m */
    public final void m25701m(float f) {
        if (this.f45089g == f) {
            return;
        }
        float fM10350b = AbstractC8778as0.m10350b(f, m25696h(), m25695e());
        this.f45089g = fM10350b;
        if (this.f45096n) {
            fM10350b = (float) Math.floor(fM10350b);
        }
        this.f45090h = fM10350b;
        this.f45088f = 0L;
        m25699k();
    }

    /* renamed from: n */
    public final void m25702n(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        C8532Xl0 c8532Xl0 = this.f45094l;
        float f3 = c8532Xl0 == null ? -3.4028235E38f : c8532Xl0.f13958l;
        float f4 = c8532Xl0 == null ? Float.MAX_VALUE : c8532Xl0.f13959m;
        float fM10350b = AbstractC8778as0.m10350b(f, f3, f4);
        float fM10350b2 = AbstractC8778as0.m10350b(f2, f3, f4);
        if (fM10350b == this.f45092j && fM10350b2 == this.f45093k) {
            return;
        }
        this.f45092j = fM10350b;
        this.f45093k = fM10350b2;
        m25701m((int) AbstractC8778as0.m10350b(this.f45090h, fM10350b, fM10350b2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f45084b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f45083a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f45084b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f45085c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f45083a.remove(animatorUpdateListener);
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
        if (i == 2 || !this.f45087e) {
            return;
        }
        this.f45087e = false;
        this.f45086d = -this.f45086d;
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
