package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ru.mes.dnevnik.R;

/* renamed from: Xs */
/* loaded from: classes.dex */
public final class C1502Xs extends AbstractC0151CO {

    /* renamed from: e */
    public final int f14000e;

    /* renamed from: f */
    public final int f14001f;

    /* renamed from: g */
    public final TimeInterpolator f14002g;

    /* renamed from: h */
    public final TimeInterpolator f14003h;

    /* renamed from: i */
    public EditText f14004i;

    /* renamed from: j */
    public final ViewOnClickListenerC1250Ts f14005j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC1313Us f14006k;

    /* renamed from: l */
    public AnimatorSet f14007l;

    /* renamed from: m */
    public ValueAnimator f14008m;

    public C1502Xs(C0088BO c0088bo) {
        super(c0088bo);
        this.f14005j = new ViewOnClickListenerC1250Ts(0, this);
        this.f14006k = new ViewOnFocusChangeListenerC1313Us(0, this);
        this.f14000e = AbstractC10490oB1.m23359d(c0088bo.getContext(), R.attr.motionDurationShort3, 100);
        this.f14001f = AbstractC10490oB1.m23359d(c0088bo.getContext(), R.attr.motionDurationShort3, 150);
        this.f14002g = AbstractC10490oB1.m23360e(c0088bo.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC6467n5.f38090a);
        this.f14003h = AbstractC10490oB1.m23360e(c0088bo.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38093d);
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: a */
    public final void mo1160a() {
        if (this.f1351b.f791p != null) {
            return;
        }
        m9175t(m9176u());
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: c */
    public final int mo1162c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: d */
    public final int mo1163d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1164e() {
        return this.f14006k;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: f */
    public final View.OnClickListener mo1165f() {
        return this.f14005j;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: g */
    public final View.OnFocusChangeListener mo1166g() {
        return this.f14006k;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: m */
    public final void mo1172m(EditText editText) {
        this.f14004i = editText;
        this.f1350a.setEndIconVisible(m9176u());
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: p */
    public final void mo1175p(boolean z) {
        if (this.f1351b.f791p == null) {
            return;
        }
        m9175t(z);
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: r */
    public final void mo1177r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f14003h);
        valueAnimatorOfFloat.setDuration(this.f14001f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs

            /* renamed from: b */
            public final /* synthetic */ C1502Xs f12840b;

            {
                this.f12840b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C1502Xs c1502Xs = this.f12840b;
                        c1502Xs.getClass();
                        c1502Xs.f1353d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1502Xs c1502Xs2 = this.f12840b;
                        c1502Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1502Xs2.f1353d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f14002g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f14000e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs

            /* renamed from: b */
            public final /* synthetic */ C1502Xs f12840b;

            {
                this.f12840b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C1502Xs c1502Xs = this.f12840b;
                        c1502Xs.getClass();
                        c1502Xs.f1353d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1502Xs c1502Xs2 = this.f12840b;
                        c1502Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1502Xs2.f1353d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14007l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f14007l.addListener(new C1439Ws(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Vs

            /* renamed from: b */
            public final /* synthetic */ C1502Xs f12840b;

            {
                this.f12840b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C1502Xs c1502Xs = this.f12840b;
                        c1502Xs.getClass();
                        c1502Xs.f1353d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C1502Xs c1502Xs2 = this.f12840b;
                        c1502Xs2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c1502Xs2.f1353d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f14008m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C1439Ws(this, 1));
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: s */
    public final void mo1178s() {
        EditText editText = this.f14004i;
        if (editText != null) {
            editText.post(new RunnableC0383G4(22, this));
        }
    }

    /* renamed from: t */
    public final void m9175t(boolean z) {
        boolean z2 = this.f1351b.m701d() == z;
        if (z && !this.f14007l.isRunning()) {
            this.f14008m.cancel();
            this.f14007l.start();
            if (z2) {
                this.f14007l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f14007l.cancel();
        this.f14008m.start();
        if (z2) {
            this.f14008m.end();
        }
    }

    /* renamed from: u */
    public final boolean m9176u() {
        EditText editText = this.f14004i;
        return editText != null && (editText.hasFocus() || this.f1353d.hasFocus()) && this.f14004i.getText().length() > 0;
    }
}
