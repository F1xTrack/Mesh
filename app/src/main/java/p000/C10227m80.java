package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: m80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10227m80 {

    /* renamed from: A */
    public ColorStateList f37496A;

    /* renamed from: B */
    public Typeface f37497B;

    /* renamed from: a */
    public final int f37498a;

    /* renamed from: b */
    public final int f37499b;

    /* renamed from: c */
    public final int f37500c;

    /* renamed from: d */
    public final TimeInterpolator f37501d;

    /* renamed from: e */
    public final TimeInterpolator f37502e;

    /* renamed from: f */
    public final TimeInterpolator f37503f;

    /* renamed from: g */
    public final Context f37504g;

    /* renamed from: h */
    public final TextInputLayout f37505h;

    /* renamed from: i */
    public LinearLayout f37506i;

    /* renamed from: j */
    public int f37507j;

    /* renamed from: k */
    public FrameLayout f37508k;

    /* renamed from: l */
    public AnimatorSet f37509l;

    /* renamed from: m */
    public final float f37510m;

    /* renamed from: n */
    public int f37511n;

    /* renamed from: o */
    public int f37512o;

    /* renamed from: p */
    public CharSequence f37513p;

    /* renamed from: q */
    public boolean f37514q;

    /* renamed from: r */
    public C6803s7 f37515r;

    /* renamed from: s */
    public CharSequence f37516s;

    /* renamed from: t */
    public int f37517t;

    /* renamed from: u */
    public int f37518u;

    /* renamed from: v */
    public ColorStateList f37519v;

    /* renamed from: w */
    public CharSequence f37520w;

    /* renamed from: x */
    public boolean f37521x;

    /* renamed from: y */
    public C6803s7 f37522y;

    /* renamed from: z */
    public int f37523z;

    public C10227m80(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f37504g = context;
        this.f37505h = textInputLayout;
        this.f37510m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f37498a = AbstractC10490oB1.m23359d(context, R.attr.motionDurationShort4, 217);
        this.f37499b = AbstractC10490oB1.m23359d(context, R.attr.motionDurationMedium4, 167);
        this.f37500c = AbstractC10490oB1.m23359d(context, R.attr.motionDurationShort4, 167);
        this.f37501d = AbstractC10490oB1.m23360e(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC6467n5.f38093d);
        LinearInterpolator linearInterpolator = AbstractC6467n5.f38090a;
        this.f37502e = AbstractC10490oB1.m23360e(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f37503f = AbstractC10490oB1.m23360e(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m22683a(C6803s7 c6803s7, int i) {
        if (this.f37506i == null && this.f37508k == null) {
            Context context = this.f37504g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f37506i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f37506i;
            TextInputLayout textInputLayout = this.f37505h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f37508k = new FrameLayout(context);
            this.f37506i.addView(this.f37508k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m22684b();
            }
        }
        if (i == 0 || i == 1) {
            this.f37508k.setVisibility(0);
            this.f37508k.addView(c6803s7);
        } else {
            this.f37506i.addView(c6803s7, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f37506i.setVisibility(0);
        this.f37507j++;
    }

    /* renamed from: b */
    public final void m22684b() {
        if (this.f37506i != null) {
            TextInputLayout textInputLayout = this.f37505h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f37504g;
                boolean zM7409h = AbstractC8259Se1.m7409h(context);
                LinearLayout linearLayout = this.f37506i;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                int paddingStart = editText.getPaddingStart();
                if (zM7409h) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM7409h) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM7409h) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m22685c() {
        AnimatorSet animatorSet = this.f37509l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m22686d(ArrayList arrayList, boolean z, C6803s7 c6803s7, int i, int i2, int i3) {
        if (c6803s7 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c6803s7, (Property<C6803s7, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f37500c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f37499b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f37502e : this.f37503f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c6803s7, (Property<C6803s7, Float>) View.TRANSLATION_Y, -this.f37510m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f37498a);
            objectAnimatorOfFloat2.setInterpolator(this.f37501d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m22687e(int i) {
        if (i == 1) {
            return this.f37515r;
        }
        if (i != 2) {
            return null;
        }
        return this.f37522y;
    }

    /* renamed from: f */
    public final void m22688f() {
        this.f37513p = null;
        m22685c();
        if (this.f37511n == 1) {
            if (!this.f37521x || TextUtils.isEmpty(this.f37520w)) {
                this.f37512o = 0;
            } else {
                this.f37512o = 2;
            }
        }
        m22691i(this.f37511n, this.f37512o, m22690h(this.f37515r, ""));
    }

    /* renamed from: g */
    public final void m22689g(C6803s7 c6803s7, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f37506i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f37508k) != null) {
            frameLayout.removeView(c6803s7);
        } else {
            linearLayout.removeView(c6803s7);
        }
        int i2 = this.f37507j - 1;
        this.f37507j = i2;
        LinearLayout linearLayout2 = this.f37506i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m22690h(C6803s7 c6803s7, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        TextInputLayout textInputLayout = this.f37505h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f37512o == this.f37511n && c6803s7 != null && TextUtils.equals(c6803s7.getText(), charSequence));
    }

    /* renamed from: i */
    public final void m22691i(int i, int i2, boolean z) {
        TextView textViewM22687e;
        TextView textViewM22687e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f37509l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m22686d(arrayList, this.f37521x, this.f37522y, 2, i, i2);
            m22686d(arrayList, this.f37514q, this.f37515r, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C9971k80(this, i2, m22687e(i), i, m22687e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM22687e2 = m22687e(i2)) != null) {
                textViewM22687e2.setVisibility(0);
                textViewM22687e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM22687e = m22687e(i)) != null) {
                textViewM22687e.setVisibility(4);
                if (i == 1) {
                    textViewM22687e.setText((CharSequence) null);
                }
            }
            this.f37511n = i2;
        }
        TextInputLayout textInputLayout = this.f37505h;
        textInputLayout.m11270r();
        textInputLayout.m11273u(z, false);
        textInputLayout.m11276x();
    }
}
