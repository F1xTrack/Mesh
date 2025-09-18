package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ru.mes.dnevnik.R;

/* renamed from: Xs */
/* loaded from: classes.dex */
public final class C1867Xs extends CO {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ViewOnClickListenerC1555Ts j;
    public final ViewOnFocusChangeListenerC1633Us k;
    public AnimatorSet l;
    public ValueAnimator m;

    public C1867Xs(BO bo) {
        super(bo);
        this.j = new ViewOnClickListenerC1555Ts(0, this);
        this.k = new ViewOnFocusChangeListenerC1633Us(0, this);
        this.e = AbstractC6220oB1.d(bo.getContext(), R.attr.motionDurationShort3, 100);
        this.f = AbstractC6220oB1.d(bo.getContext(), R.attr.motionDurationShort3, 150);
        this.g = AbstractC6220oB1.e(bo.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC6009n5.a);
        this.h = AbstractC6220oB1.e(bo.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC6009n5.d);
    }

    @Override // defpackage.CO
    public final void a() {
        if (this.b.p != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.CO
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.CO
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.CO
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.CO
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.CO
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.CO
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.CO
    public final void p(boolean z) {
        if (this.b.p == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.CO
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs
            public final /* synthetic */ C1867Xs b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C1867Xs c1867Xs = this.b;
                        c1867Xs.getClass();
                        c1867Xs.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1867Xs c1867Xs2 = this.b;
                        c1867Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1867Xs2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs
            public final /* synthetic */ C1867Xs b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C1867Xs c1867Xs = this.b;
                        c1867Xs.getClass();
                        c1867Xs.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1867Xs c1867Xs2 = this.b;
                        c1867Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1867Xs2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new C1789Ws(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs
            public final /* synthetic */ C1867Xs b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C1867Xs c1867Xs = this.b;
                        c1867Xs.getClass();
                        c1867Xs.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1867Xs c1867Xs2 = this.b;
                        c1867Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1867Xs2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C1789Ws(this, 1));
    }

    @Override // defpackage.CO
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new G4(22, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
