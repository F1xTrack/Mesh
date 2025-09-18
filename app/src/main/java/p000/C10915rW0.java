package p000;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.ArrayList;

/* renamed from: rW0 */
/* loaded from: classes2.dex */
public final class C10915rW0 extends AbstractC3991eS {

    /* renamed from: c */
    public final ArrayList f41695c;

    /* renamed from: d */
    public final C1585ZB f41696d;

    /* renamed from: e */
    public boolean f41697e;

    /* renamed from: f */
    public boolean f41698f;

    /* renamed from: g */
    public Integer f41699g;

    /* renamed from: h */
    public String f41700h;

    /* renamed from: i */
    public int f41701i;

    /* renamed from: j */
    public String f41702j;

    /* renamed from: k */
    public String f41703k;

    /* renamed from: l */
    public float f41704l;

    /* renamed from: m */
    public int f41705m;

    /* renamed from: n */
    public Integer f41706n;

    /* renamed from: o */
    public boolean f41707o;

    /* renamed from: p */
    public boolean f41708p;

    /* renamed from: q */
    public boolean f41709q;

    /* renamed from: r */
    public boolean f41710r;

    /* renamed from: s */
    public boolean f41711s;

    /* renamed from: t */
    public int f41712t;

    /* renamed from: u */
    public boolean f41713u;

    /* renamed from: v */
    public final int f41714v;

    /* renamed from: w */
    public final int f41715w;

    /* renamed from: x */
    public final ViewOnClickListenerC1250Ts f41716x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10915rW0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "context");
        this.f41695c = new ArrayList(3);
        this.f41711s = true;
        this.f41716x = new ViewOnClickListenerC1250Ts(6, this);
        setVisibility(8);
        C1585ZB c1585zb = new C1585ZB(s91, this);
        this.f41696d = c1585zb;
        this.f41714v = c1585zb.getContentInsetStart();
        this.f41715w = c1585zb.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (s91.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c1585zb.setBackgroundColor(typedValue.data);
        }
        c1585zb.setClipChildren(false);
    }

    /* renamed from: a */
    public static void m24394a(C10915rW0 c10915rW0) {
        O90.m5968f(c10915rW0, "this$0");
        C10659pW0 screenFragment = c10915rW0.getScreenFragment();
        if (screenFragment != null) {
            C10275mW0 screenStack = c10915rW0.getScreenStack();
            if (screenStack == null || !O90.m5963a(screenStack.getRootScreen(), screenFragment.mo13727h())) {
                if (!screenFragment.mo13727h().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.m19054r();
                    return;
                }
                SV0 container = screenFragment.mo13727h().getContainer();
                if (!(container instanceof C10275mW0)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                C10275mW0 c10275mW0 = (C10275mW0) container;
                c10275mW0.f37744i.add(screenFragment);
                c10275mW0.f10818d = true;
                c10275mW0.m7381g();
                return;
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof C10659pW0) {
                C10659pW0 c10659pW0 = (C10659pW0) parentFragment;
                if (!c10659pW0.mo13727h().getNativeBackButtonDismissalEnabled()) {
                    c10659pW0.m19054r();
                    return;
                }
                SV0 container2 = c10659pW0.mo13727h().getContainer();
                if (!(container2 instanceof C10275mW0)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                C10275mW0 c10275mW02 = (C10275mW0) container2;
                c10275mW02.f37744i.add(c10659pW0);
                c10275mW02.f10818d = true;
                c10275mW02.m7381g();
            }
        }
    }

    private final RV0 getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof RV0) {
            return (RV0) parent;
        }
        return null;
    }

    private final C10275mW0 getScreenStack() {
        RV0 screen = getScreen();
        SV0 container = screen != null ? screen.getContainer() : null;
        if (container instanceof C10275mW0) {
            return (C10275mW0) container;
        }
        return null;
    }

    /* renamed from: b */
    public final void m24395b() {
        RV0 screen;
        if (getParent() == null || this.f41709q || (screen = getScreen()) == null || screen.f10230l) {
            return;
        }
        m24396c();
    }

    /* renamed from: c */
    public final void m24396c() {
        TextView textView;
        Drawable navigationIcon;
        boolean z;
        boolean z2;
        C10659pW0 screenFragment;
        C10659pW0 screenFragment2;
        Toolbar toolbar;
        ReactContext reactContextMo13725e;
        C10275mW0 screenStack = getScreenStack();
        boolean z3 = screenStack == null || O90.m5963a(screenStack.getTopScreen(), getParent());
        if (this.f41713u && z3 && !this.f41709q) {
            C10659pW0 screenFragment3 = getScreenFragment();
            AbstractActivityC4221i6 abstractActivityC4221i6 = (AbstractActivityC4221i6) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (abstractActivityC4221i6 == null) {
                return;
            }
            String str = this.f41703k;
            C1585ZB c1585zb = this.f41696d;
            if (str != null) {
                if (str.equals("rtl")) {
                    c1585zb.setLayoutDirection(1);
                } else if (O90.m5963a(this.f41703k, "ltr")) {
                    c1585zb.setLayoutDirection(0);
                }
            }
            RV0 screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextMo13725e = (ReactContext) context;
                } else {
                    InterfaceC9891jW0 fragmentWrapper = screen.getFragmentWrapper();
                    reactContextMo13725e = fragmentWrapper != null ? fragmentWrapper.mo13725e() : null;
                }
                QB1.m6610m(screen, abstractActivityC4221i6, reactContextMo13725e);
            }
            if (this.f41697e) {
                if (c1585zb.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                C4032f6 c4032f6 = screenFragment2.f40130i;
                if (c4032f6 != null && (toolbar = screenFragment2.f40131j) != null && toolbar.getParent() == c4032f6) {
                    c4032f6.removeView(toolbar);
                }
                screenFragment2.f40131j = null;
                return;
            }
            if (c1585zb.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                C4032f6 c4032f62 = screenFragment.f40130i;
                if (c4032f62 != null) {
                    c4032f62.addView(c1585zb);
                }
                C3969e6 c3969e6 = new C3969e6();
                c3969e6.f26540a = 0;
                c1585zb.setLayoutParams(c3969e6);
                screenFragment.f40131j = c1585zb;
            }
            if (this.f41711s) {
                Integer num = this.f41699g;
                c1585zb.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
            } else if (c1585zb.getPaddingTop() > 0) {
                c1585zb.setPadding(0, 0, 0, 0);
            }
            abstractActivityC4221i6.m18967j(c1585zb);
            FM1 fm1M18965h = abstractActivityC4221i6.m18965h();
            if (fm1M18965h == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c1585zb.setContentInsetStartWithNavigation(this.f41715w);
            c1585zb.m9856d();
            RT0 rt0 = c1585zb.f15908t;
            int i = this.f41714v;
            rt0.m7018a(i, i);
            C10659pW0 screenFragment4 = getScreenFragment();
            fm1M18965h.mo2598n((screenFragment4 == null || !screenFragment4.m23812v() || this.f41707o) ? false : true);
            c1585zb.setNavigationOnClickListener(this.f41716x);
            C10659pW0 screenFragment5 = getScreenFragment();
            if (screenFragment5 != null && screenFragment5.f40132k != (z2 = this.f41708p)) {
                C4032f6 c4032f63 = screenFragment5.f40130i;
                if (c4032f63 != null) {
                    c4032f63.setElevation(z2 ? 0.0f : AbstractC11406vL1.m25403b(4.0f));
                }
                C4032f6 c4032f64 = screenFragment5.f40130i;
                if (c4032f64 != null) {
                    c4032f64.setStateListAnimator(null);
                }
                screenFragment5.f40132k = z2;
            }
            C10659pW0 screenFragment6 = getScreenFragment();
            if (screenFragment6 != null && screenFragment6.f40133l != (z = this.f41698f)) {
                ViewGroup.LayoutParams layoutParams = screenFragment6.mo13727h().getLayoutParams();
                O90.m5966d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((C6588oz) layoutParams).m23583b(z ? null : new AppBarLayout$ScrollingViewBehavior());
                screenFragment6.f40133l = z;
            }
            fm1M18965h.mo2602r(this.f41700h);
            if (TextUtils.isEmpty(this.f41700h)) {
                c1585zb.setContentInsetStartWithNavigation(0);
            }
            O90.m5968f(c1585zb, "toolbar");
            int childCount = c1585zb.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    textView = null;
                    break;
                }
                View childAt = c1585zb.getChildAt(i2);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (O90.m5963a(textView.getText(), c1585zb.getTitle())) {
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.f41701i;
            if (i3 != 0) {
                c1585zb.setTitleTextColor(i3);
            }
            if (textView != null) {
                String str2 = this.f41702j;
                if (str2 != null || this.f41705m > 0) {
                    Typeface typefaceM8004a = UO1.m8004a(null, 0, this.f41705m, str2, getContext().getAssets());
                    O90.m5967e(typefaceM8004a, "applyStyles(...)");
                    textView.setTypeface(typefaceM8004a);
                }
                float f = this.f41704l;
                if (f > 0.0f) {
                    textView.setTextSize(f);
                }
            }
            Integer num2 = this.f41706n;
            if (num2 != null) {
                c1585zb.setBackgroundColor(num2.intValue());
            }
            if (this.f41712t != 0 && (navigationIcon = c1585zb.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f41712t, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount2 = c1585zb.getChildCount() - 1; -1 < childCount2; childCount2--) {
                if (c1585zb.getChildAt(childCount2) instanceof C11427vW0) {
                    c1585zb.removeViewAt(childCount2);
                }
            }
            ArrayList arrayList = this.f41695c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = arrayList.get(i4);
                O90.m5967e(obj, "get(...)");
                C11427vW0 c11427vW0 = (C11427vW0) obj;
                EnumC11299uW0 type = c11427vW0.getType();
                if (type == EnumC11299uW0.f43715d) {
                    View childAt2 = c11427vW0.getChildAt(0);
                    ImageView imageView = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    fm1M18965h.mo2600p(imageView.getDrawable());
                } else {
                    C8873bb1 c8873bb1 = new C8873bb1(-1);
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        if (!this.f41710r) {
                            c1585zb.setNavigationIcon((Drawable) null);
                        }
                        c1585zb.setTitle((CharSequence) null);
                        c8873bb1.f17080a = 8388611;
                    } else if (iOrdinal == 1) {
                        ((ViewGroup.MarginLayoutParams) c8873bb1).width = -1;
                        c8873bb1.f17080a = 1;
                        c1585zb.setTitle((CharSequence) null);
                    } else if (iOrdinal == 2) {
                        c8873bb1.f17080a = 8388613;
                    }
                    c11427vW0.setLayoutParams(c8873bb1);
                    c1585zb.addView(c11427vW0);
                }
            }
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f41695c.size();
    }

    public final C10659pW0 getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof RV0)) {
            return null;
        }
        Fragment fragment = ((RV0) parent).getFragment();
        if (fragment instanceof C10659pW0) {
            return (C10659pW0) fragment;
        }
        return null;
    }

    public final C1585ZB getToolbar() {
        return this.f41696d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41713u = true;
        int iM6094e = OZ1.m6094e(this);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(iM6094e, getId(), 8));
        }
        if (this.f41699g == null) {
            this.f41699g = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top) : Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
        }
        m24396c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41713u = false;
        int iM6094e = OZ1.m6094e(this);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(iM6094e, getId(), 10));
        }
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.f41710r = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.f41706n = num;
    }

    public final void setDirection(String str) {
        this.f41703k = str;
    }

    public final void setHeaderHidden(boolean z) {
        this.f41697e = z;
    }

    public final void setHeaderTranslucent(boolean z) {
        this.f41698f = z;
    }

    public final void setHidden(boolean z) {
        this.f41697e = z;
    }

    public final void setHideBackButton(boolean z) {
        this.f41707o = z;
    }

    public final void setHideShadow(boolean z) {
        this.f41708p = z;
    }

    public final void setTintColor(int i) {
        this.f41712t = i;
    }

    public final void setTitle(String str) {
        this.f41700h = str;
    }

    public final void setTitleColor(int i) {
        this.f41701i = i;
    }

    public final void setTitleFontFamily(String str) {
        this.f41702j = str;
    }

    public final void setTitleFontSize(float f) {
        this.f41704l = f;
    }

    public final void setTitleFontWeight(String str) {
        this.f41705m = UO1.m8008e(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.f41711s = z;
    }

    public final void setTranslucent(boolean z) {
        this.f41698f = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
