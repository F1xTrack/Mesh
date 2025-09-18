package p000;

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
public final class C4237iM extends AbstractC0151CO {

    /* renamed from: e */
    public final int f29096e;

    /* renamed from: f */
    public final int f29097f;

    /* renamed from: g */
    public final TimeInterpolator f29098g;

    /* renamed from: h */
    public AutoCompleteTextView f29099h;

    /* renamed from: i */
    public final ViewOnClickListenerC1250Ts f29100i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC1313Us f29101j;

    /* renamed from: k */
    public final C0267EE f29102k;

    /* renamed from: l */
    public boolean f29103l;

    /* renamed from: m */
    public boolean f29104m;

    /* renamed from: n */
    public boolean f29105n;

    /* renamed from: o */
    public long f29106o;

    /* renamed from: p */
    public AccessibilityManager f29107p;

    /* renamed from: q */
    public ValueAnimator f29108q;

    /* renamed from: r */
    public ValueAnimator f29109r;

    public C4237iM(C0088BO c0088bo) {
        super(c0088bo);
        this.f29100i = new ViewOnClickListenerC1250Ts(3, this);
        this.f29101j = new ViewOnFocusChangeListenerC1313Us(2, this);
        this.f29102k = new C0267EE(2, this);
        this.f29106o = Long.MAX_VALUE;
        this.f29097f = AbstractC10490oB1.m23359d(c0088bo.getContext(), R.attr.motionDurationShort3, 67);
        this.f29096e = AbstractC10490oB1.m23359d(c0088bo.getContext(), R.attr.motionDurationShort3, 50);
        this.f29098g = AbstractC10490oB1.m23360e(c0088bo.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC6467n5.f38090a);
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: a */
    public final void mo1160a() {
        if (this.f29107p.isTouchExplorationEnabled() && AbstractC11105t02.m24824c(this.f29099h) && !this.f1353d.hasFocus()) {
            this.f29099h.dismissDropDown();
        }
        this.f29099h.post(new RunnableC0204DE(9, this));
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: c */
    public final int mo1162c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: d */
    public final int mo1163d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1164e() {
        return this.f29101j;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: f */
    public final View.OnClickListener mo1165f() {
        return this.f29100i;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: h */
    public final C0267EE mo1167h() {
        return this.f29102k;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: i */
    public final boolean mo1168i(int i) {
        return i != 0;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: j */
    public final boolean mo1169j() {
        return this.f29103l;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: l */
    public final boolean mo1171l() {
        return this.f29105n;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: m */
    public final void mo1172m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f29099h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC1809bp(1, this));
        this.f29099h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: hM
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C4237iM c4237iM = this.f28395a;
                c4237iM.f29104m = true;
                c4237iM.f29106o = System.currentTimeMillis();
                c4237iM.m19005t(false);
            }
        });
        this.f29099h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1350a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC11105t02.m24824c(editText) && this.f29107p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            this.f1353d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: n */
    public final void mo1173n(C1009Q1 c1009q1) {
        if (!AbstractC11105t02.m24824c(this.f29099h)) {
            c1009q1.m6539k(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c1009q1.f9401a.isShowingHintText() : c1009q1.m6534f(4)) {
            c1009q1.m6541m(null);
        }
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: o */
    public final void mo1174o(AccessibilityEvent accessibilityEvent) {
        if (!this.f29107p.isEnabled() || AbstractC11105t02.m24824c(this.f29099h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f29105n && !this.f29099h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            m19006u();
            this.f29104m = true;
            this.f29106o = System.currentTimeMillis();
        }
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: r */
    public final void mo1177r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f29098g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f29097f);
        valueAnimatorOfFloat.addUpdateListener(new C0772MG(2, this));
        this.f29109r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f29096e);
        valueAnimatorOfFloat2.addUpdateListener(new C0772MG(2, this));
        this.f29108q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C3903d2(2, this));
        this.f29107p = (AccessibilityManager) this.f1352c.getSystemService("accessibility");
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: s */
    public final void mo1178s() {
        AutoCompleteTextView autoCompleteTextView = this.f29099h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f29099h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m19005t(boolean z) {
        if (this.f29105n != z) {
            this.f29105n = z;
            this.f29109r.cancel();
            this.f29108q.start();
        }
    }

    /* renamed from: u */
    public final void m19006u() {
        if (this.f29099h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29106o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f29104m = false;
        }
        if (this.f29104m) {
            this.f29104m = false;
            return;
        }
        m19005t(!this.f29105n);
        if (!this.f29105n) {
            this.f29099h.dismissDropDown();
        } else {
            this.f29099h.requestFocus();
            this.f29099h.showDropDown();
        }
    }
}
