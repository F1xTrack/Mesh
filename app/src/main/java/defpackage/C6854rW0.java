package defpackage;

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
public final class C6854rW0 extends AbstractC3583eS {
    public final ArrayList c;
    public final ZB d;
    public boolean e;
    public boolean f;
    public Integer g;
    public String h;
    public int i;
    public String j;
    public String k;
    public float l;
    public int m;
    public Integer n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public final int v;
    public final int w;
    public final ViewOnClickListenerC1555Ts x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6854rW0(S91 s91) {
        super(s91);
        O90.f(s91, "context");
        this.c = new ArrayList(3);
        this.s = true;
        this.x = new ViewOnClickListenerC1555Ts(6, this);
        setVisibility(8);
        ZB zb = new ZB(s91, this);
        this.d = zb;
        this.v = zb.getContentInsetStart();
        this.w = zb.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (s91.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            zb.setBackgroundColor(typedValue.data);
        }
        zb.setClipChildren(false);
    }

    public static void a(C6854rW0 c6854rW0) {
        O90.f(c6854rW0, "this$0");
        C6473pW0 screenFragment = c6854rW0.getScreenFragment();
        if (screenFragment != null) {
            C5900mW0 screenStack = c6854rW0.getScreenStack();
            if (screenStack == null || !O90.a(screenStack.getRootScreen(), screenFragment.h())) {
                if (!screenFragment.h().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.r();
                    return;
                }
                SV0 container = screenFragment.h().getContainer();
                if (!(container instanceof C5900mW0)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                C5900mW0 c5900mW0 = (C5900mW0) container;
                c5900mW0.i.add(screenFragment);
                c5900mW0.d = true;
                c5900mW0.g();
                return;
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof C6473pW0) {
                C6473pW0 c6473pW0 = (C6473pW0) parentFragment;
                if (!c6473pW0.h().getNativeBackButtonDismissalEnabled()) {
                    c6473pW0.r();
                    return;
                }
                SV0 container2 = c6473pW0.h().getContainer();
                if (!(container2 instanceof C5900mW0)) {
                    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
                }
                C5900mW0 c5900mW02 = (C5900mW0) container2;
                c5900mW02.i.add(c6473pW0);
                c5900mW02.d = true;
                c5900mW02.g();
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

    private final C5900mW0 getScreenStack() {
        RV0 screen = getScreen();
        SV0 container = screen != null ? screen.getContainer() : null;
        if (container instanceof C5900mW0) {
            return (C5900mW0) container;
        }
        return null;
    }

    public final void b() {
        RV0 screen;
        if (getParent() == null || this.q || (screen = getScreen()) == null || screen.l) {
            return;
        }
        c();
    }

    public final void c() {
        TextView textView;
        Drawable navigationIcon;
        boolean z;
        boolean z2;
        C6473pW0 screenFragment;
        C6473pW0 screenFragment2;
        Toolbar toolbar;
        ReactContext reactContextE;
        C5900mW0 screenStack = getScreenStack();
        boolean z3 = screenStack == null || O90.a(screenStack.getTopScreen(), getParent());
        if (this.u && z3 && !this.q) {
            C6473pW0 screenFragment3 = getScreenFragment();
            AbstractActivityC4281i6 abstractActivityC4281i6 = (AbstractActivityC4281i6) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (abstractActivityC4281i6 == null) {
                return;
            }
            String str = this.k;
            ZB zb = this.d;
            if (str != null) {
                if (str.equals("rtl")) {
                    zb.setLayoutDirection(1);
                } else if (O90.a(this.k, "ltr")) {
                    zb.setLayoutDirection(0);
                }
            }
            RV0 screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextE = (ReactContext) context;
                } else {
                    InterfaceC5327jW0 fragmentWrapper = screen.getFragmentWrapper();
                    reactContextE = fragmentWrapper != null ? fragmentWrapper.e() : null;
                }
                QB1.m(screen, abstractActivityC4281i6, reactContextE);
            }
            if (this.e) {
                if (zb.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                C3708f6 c3708f6 = screenFragment2.i;
                if (c3708f6 != null && (toolbar = screenFragment2.j) != null && toolbar.getParent() == c3708f6) {
                    c3708f6.removeView(toolbar);
                }
                screenFragment2.j = null;
                return;
            }
            if (zb.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                C3708f6 c3708f62 = screenFragment.i;
                if (c3708f62 != null) {
                    c3708f62.addView(zb);
                }
                C3517e6 c3517e6 = new C3517e6();
                c3517e6.a = 0;
                zb.setLayoutParams(c3517e6);
                screenFragment.j = zb;
            }
            if (this.s) {
                Integer num = this.g;
                zb.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
            } else if (zb.getPaddingTop() > 0) {
                zb.setPadding(0, 0, 0, 0);
            }
            abstractActivityC4281i6.j(zb);
            FM1 fm1H = abstractActivityC4281i6.h();
            if (fm1H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            zb.setContentInsetStartWithNavigation(this.w);
            zb.d();
            RT0 rt0 = zb.t;
            int i = this.v;
            rt0.a(i, i);
            C6473pW0 screenFragment4 = getScreenFragment();
            fm1H.n((screenFragment4 == null || !screenFragment4.v() || this.o) ? false : true);
            zb.setNavigationOnClickListener(this.x);
            C6473pW0 screenFragment5 = getScreenFragment();
            if (screenFragment5 != null && screenFragment5.k != (z2 = this.p)) {
                C3708f6 c3708f63 = screenFragment5.i;
                if (c3708f63 != null) {
                    c3708f63.setElevation(z2 ? 0.0f : AbstractC7586vL1.b(4.0f));
                }
                C3708f6 c3708f64 = screenFragment5.i;
                if (c3708f64 != null) {
                    c3708f64.setStateListAnimator(null);
                }
                screenFragment5.k = z2;
            }
            C6473pW0 screenFragment6 = getScreenFragment();
            if (screenFragment6 != null && screenFragment6.l != (z = this.f)) {
                ViewGroup.LayoutParams layoutParams = screenFragment6.h().getLayoutParams();
                O90.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((C6368oz) layoutParams).b(z ? null : new AppBarLayout$ScrollingViewBehavior());
                screenFragment6.l = z;
            }
            fm1H.r(this.h);
            if (TextUtils.isEmpty(this.h)) {
                zb.setContentInsetStartWithNavigation(0);
            }
            O90.f(zb, "toolbar");
            int childCount = zb.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    textView = null;
                    break;
                }
                View childAt = zb.getChildAt(i2);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    if (O90.a(textView.getText(), zb.getTitle())) {
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.i;
            if (i3 != 0) {
                zb.setTitleTextColor(i3);
            }
            if (textView != null) {
                String str2 = this.j;
                if (str2 != null || this.m > 0) {
                    Typeface typefaceA = UO1.a(null, 0, this.m, str2, getContext().getAssets());
                    O90.e(typefaceA, "applyStyles(...)");
                    textView.setTypeface(typefaceA);
                }
                float f = this.l;
                if (f > 0.0f) {
                    textView.setTextSize(f);
                }
            }
            Integer num2 = this.n;
            if (num2 != null) {
                zb.setBackgroundColor(num2.intValue());
            }
            if (this.t != 0 && (navigationIcon = zb.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.t, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount2 = zb.getChildCount() - 1; -1 < childCount2; childCount2--) {
                if (zb.getChildAt(childCount2) instanceof C7618vW0) {
                    zb.removeViewAt(childCount2);
                }
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = arrayList.get(i4);
                O90.e(obj, "get(...)");
                C7618vW0 c7618vW0 = (C7618vW0) obj;
                EnumC7427uW0 type = c7618vW0.getType();
                if (type == EnumC7427uW0.d) {
                    View childAt2 = c7618vW0.getChildAt(0);
                    ImageView imageView = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    fm1H.p(imageView.getDrawable());
                } else {
                    C2356bb1 c2356bb1 = new C2356bb1(-1);
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        if (!this.r) {
                            zb.setNavigationIcon((Drawable) null);
                        }
                        zb.setTitle((CharSequence) null);
                        c2356bb1.a = 8388611;
                    } else if (iOrdinal == 1) {
                        ((ViewGroup.MarginLayoutParams) c2356bb1).width = -1;
                        c2356bb1.a = 1;
                        zb.setTitle((CharSequence) null);
                    } else if (iOrdinal == 2) {
                        c2356bb1.a = 8388613;
                    }
                    c7618vW0.setLayoutParams(c2356bb1);
                    zb.addView(c7618vW0);
                }
            }
        }
    }

    public final int getConfigSubviewsCount() {
        return this.c.size();
    }

    public final C6473pW0 getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof RV0)) {
            return null;
        }
        Fragment fragment = ((RV0) parent).getFragment();
        if (fragment instanceof C6473pW0) {
            return (C6473pW0) fragment;
        }
        return null;
    }

    public final ZB getToolbar() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
        int iE = OZ1.e(this);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C7098so(iE, getId(), 8));
        }
        if (this.g == null) {
            this.g = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top) : Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u = false;
        int iE = OZ1.e(this);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C7098so(iE, getId(), 10));
        }
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.r = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.n = num;
    }

    public final void setDirection(String str) {
        this.k = str;
    }

    public final void setHeaderHidden(boolean z) {
        this.e = z;
    }

    public final void setHeaderTranslucent(boolean z) {
        this.f = z;
    }

    public final void setHidden(boolean z) {
        this.e = z;
    }

    public final void setHideBackButton(boolean z) {
        this.o = z;
    }

    public final void setHideShadow(boolean z) {
        this.p = z;
    }

    public final void setTintColor(int i) {
        this.t = i;
    }

    public final void setTitle(String str) {
        this.h = str;
    }

    public final void setTitleColor(int i) {
        this.i = i;
    }

    public final void setTitleFontFamily(String str) {
        this.j = str;
    }

    public final void setTitleFontSize(float f) {
        this.l = f;
    }

    public final void setTitleFontWeight(String str) {
        this.m = UO1.e(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.s = z;
    }

    public final void setTranslucent(boolean z) {
        this.f = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
