package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: iM */
/* loaded from: classes.dex */
public final class C4329iM extends CO {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC1555Ts i;
    public final ViewOnFocusChangeListenerC1633Us j;
    public final EE k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public C4329iM(BO bo) {
        super(bo);
        this.i = new ViewOnClickListenerC1555Ts(3, this);
        this.j = new ViewOnFocusChangeListenerC1633Us(2, this);
        this.k = new EE(2, this);
        this.o = Long.MAX_VALUE;
        this.f = AbstractC6220oB1.d(bo.getContext(), R.attr.motionDurationShort3, 67);
        this.e = AbstractC6220oB1.d(bo.getContext(), R.attr.motionDurationShort3, 50);
        this.g = AbstractC6220oB1.e(bo.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC6009n5.a);
    }

    @Override // defpackage.CO
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && AbstractC7138t02.c(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new DE(9, this));
    }

    @Override // defpackage.CO
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.CO
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.CO
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.CO
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.CO
    public final EE h() {
        return this.k;
    }

    @Override // defpackage.CO
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.CO
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.CO
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.CO
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC2396bp(1, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: hM
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4329iM c4329iM = this.a;
                c4329iM.m = true;
                c4329iM.o = System.currentTimeMillis();
                c4329iM.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC7138t02.c(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.CO
    public final void n(Q1 q1) {
        if (!AbstractC7138t02.c(this.h)) {
            q1.k(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? q1.a.isShowingHintText() : q1.f(4)) {
            q1.m(null);
        }
    }

    @Override // defpackage.CO
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || AbstractC7138t02.c(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // defpackage.CO
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new MG(2, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new MG(2, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C3313d2(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.CO
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
