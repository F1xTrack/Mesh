package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;
import kotlin.Metadata;
import ru.mes.dnevnik.R;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m22267d2 = {"LpW0;", "LiW0;", "LqW0;", "<init>", "()V", "n71", "nW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: pW0 */
/* loaded from: classes2.dex */
public final class C10659pW0 extends C9763iW0 implements InterfaceC10787qW0 {

    /* renamed from: h */
    public DimmingFragment f40129h;

    /* renamed from: i */
    public C4032f6 f40130i;

    /* renamed from: j */
    public Toolbar f40131j;

    /* renamed from: k */
    public boolean f40132k;

    /* renamed from: l */
    public boolean f40133l;

    /* renamed from: m */
    public View f40134m;

    /* renamed from: n */
    public C0830NB f40135n;

    /* renamed from: o */
    public C10115lG0 f40136o;

    /* renamed from: p */
    public C10403nW0 f40137p;

    /* renamed from: q */
    public final C10531oW0 f40138q;

    /* renamed from: r */
    public final C8990cW0 f40139r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10659pW0(RV0 rv0) {
        super(rv0);
        O90.m5968f(rv0, "screenView");
        this.f40138q = new C10531oW0(this);
        this.f40139r = new C8990cW0(1, this);
    }

    @Override // p000.C9763iW0, p000.InterfaceC9891jW0
    /* renamed from: l */
    public final void mo13730l() {
        super.mo13730l();
        C10915rW0 headerConfig = mo13727h().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.m24396c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (mo13727h().getStackPresentation() != OV0.f8463d) {
            return null;
        }
        return z ? AnimationUtils.loadAnimation(getContext(), R.anim.rns_slide_in_from_bottom) : AnimationUtils.loadAnimation(getContext(), R.anim.rns_slide_out_to_bottom);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        O90.m5968f(menu, "menu");
        O90.m5968f(menuInflater, "inflater");
        m23814x(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // p000.C9763iW0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6397lz appBarLayout$ScrollingViewBehavior;
        C4032f6 c4032f6;
        C4032f6 c4032f62;
        C4032f6 c4032f63;
        Integer numValueOf;
        ColorStateList colorStateList;
        O90.m5968f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        O90.m5967e(contextRequireContext, "requireContext(...)");
        this.f40137p = new C10403nW0(contextRequireContext, this);
        RV0 rv0Mo13727h = mo13727h();
        C6588oz c6588oz = new C6588oz(-1, -1);
        if (AbstractC9500gS1.m18559b(mo13727h())) {
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            m23813w(bottomSheetBehavior, C9911jg0.f35320c);
            appBarLayout$ScrollingViewBehavior = bottomSheetBehavior;
        } else {
            appBarLayout$ScrollingViewBehavior = this.f40133l ? null : new AppBarLayout$ScrollingViewBehavior();
        }
        c6588oz.m23583b(appBarLayout$ScrollingViewBehavior);
        rv0Mo13727h.setLayoutParams(c6588oz);
        if (AbstractC9500gS1.m18559b(mo13727h())) {
            mo13727h().setClipToOutline(true);
            RV0 rv0Mo13727h2 = mo13727h();
            float fM25403b = AbstractC11406vL1.m25403b(rv0Mo13727h2.getSheetCornerRadius());
            GT0 gt0 = new GT0();
            GT0 gt02 = new GT0();
            C7110x c7110x = new C7110x(0.0f);
            C7110x c7110x2 = new C7110x(0.0f);
            C4049fN c4049fN = new C4049fN(0);
            C4049fN c4049fN2 = new C4049fN(0);
            C4049fN c4049fN3 = new C4049fN(0);
            C4049fN c4049fN4 = new C4049fN(0);
            AbstractC10784qU1 abstractC10784qU1M9385a = AbstractC8593Yp1.m9385a(0);
            C8435Vo1.m8558d(abstractC10784qU1M9385a);
            C7110x c7110x3 = new C7110x(fM25403b);
            AbstractC10784qU1 abstractC10784qU1M9385a2 = AbstractC8593Yp1.m9385a(0);
            C8435Vo1.m8558d(abstractC10784qU1M9385a2);
            C7110x c7110x4 = new C7110x(fM25403b);
            LZ0 lz0 = new LZ0();
            lz0.f6714a = abstractC10784qU1M9385a;
            lz0.f6715b = abstractC10784qU1M9385a2;
            lz0.f6716c = gt0;
            lz0.f6717d = gt02;
            lz0.f6718e = c7110x3;
            lz0.f6719f = c7110x4;
            lz0.f6720g = c7110x;
            lz0.f6721h = c7110x2;
            lz0.f6722i = c4049fN;
            lz0.f6723j = c4049fN2;
            lz0.f6724k = c4049fN3;
            lz0.f6725l = c4049fN4;
            C10439no0 c10439no0 = new C10439no0(lz0);
            Drawable background = rv0Mo13727h2.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            } else {
                Drawable background2 = rv0Mo13727h2.getBackground();
                C10439no0 c10439no02 = background2 instanceof C10439no0 ? (C10439no0) background2 : null;
                numValueOf = (c10439no02 == null || (colorStateList = c10439no02.f38516a.f37935e) == null) ? null : Integer.valueOf(colorStateList.getDefaultColor());
            }
            c10439no0.setTint(numValueOf != null ? numValueOf.intValue() : 0);
            rv0Mo13727h2.setBackground(c10439no0);
            mo13727h().setElevation(mo13727h().getSheetElevation());
        }
        C10403nW0 c10403nW0 = this.f40137p;
        if (c10403nW0 == null) {
            O90.m5977o("coordinatorLayout");
            throw null;
        }
        RV0 rv0Mo13727h3 = mo13727h();
        G02.m2880b(rv0Mo13727h3);
        c10403nW0.addView(rv0Mo13727h3);
        if (!AbstractC9500gS1.m18559b(mo13727h())) {
            Context context = getContext();
            if (context != null) {
                c4032f6 = new C4032f6(context);
                c4032f6.setBackgroundColor(0);
                c4032f6.setLayoutParams(new C3969e6());
            } else {
                c4032f6 = null;
            }
            this.f40130i = c4032f6;
            C10403nW0 c10403nW02 = this.f40137p;
            if (c10403nW02 == null) {
                O90.m5977o("coordinatorLayout");
                throw null;
            }
            c10403nW02.addView(c4032f6);
            if (this.f40132k && (c4032f63 = this.f40130i) != null) {
                c4032f63.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.f40131j;
            if (toolbar != null && (c4032f62 = this.f40130i) != null) {
                G02.m2880b(toolbar);
                c4032f62.addView(toolbar);
            }
            setHasOptionsMenu(true);
        }
        C10403nW0 c10403nW03 = this.f40137p;
        if (c10403nW03 != null) {
            return c10403nW03;
        }
        O90.m5977o("coordinatorLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        C10915rW0 headerConfig;
        O90.m5968f(menu, "menu");
        if (!mo13727h().m7028b() || ((headerConfig = mo13727h().getHeaderConfig()) != null && !headerConfig.f41697e)) {
            m23814x(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view = this.f40134m;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        PackageManager packageManager;
        Context context = getContext();
        if (context != null && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
            View viewMo13727h = mo13727h();
            while (true) {
                if (viewMo13727h == null) {
                    viewMo13727h = null;
                    break;
                } else if (viewMo13727h.isFocused()) {
                    break;
                } else {
                    viewMo13727h = viewMo13727h instanceof ViewGroup ? ((ViewGroup) viewMo13727h).getFocusedChild() : null;
                }
            }
            this.f40134m = viewMo13727h;
        }
        super.onStop();
    }

    /* renamed from: v */
    public final boolean m23812v() {
        SV0 container = mo13727h().getContainer();
        if (!(container instanceof C10275mW0)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!O90.m5963a(((C10275mW0) container).getRootScreen(), mo13727h())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C10659pW0) {
            return ((C10659pW0) parentFragment).m23812v();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x007f  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23813w(com.google.android.material.bottomsheet.BottomSheetBehavior r15, p000.AbstractC1378Vu r16) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10659pW0.m23813w(com.google.android.material.bottomsheet.BottomSheetBehavior, Vu):void");
    }

    /* renamed from: x */
    public final void m23814x(Menu menu) {
        menu.clear();
        C10915rW0 headerConfig = mo13727h().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig == null || configSubviewsCount <= 0) {
            return;
        }
        for (int i = 0; i < configSubviewsCount; i++) {
            Object obj = headerConfig.f41695c.get(i);
            O90.m5967e(obj, "get(...)");
            if (((C11427vW0) obj).getType() == EnumC11299uW0.f43716e) {
                Context context = getContext();
                if (this.f40135n == null && context != null) {
                    C0830NB c0830nb = new C0830NB(context, this);
                    this.f40135n = c0830nb;
                    C10115lG0 c10115lG0 = this.f40136o;
                    if (c10115lG0 != null) {
                        c10115lG0.invoke(c0830nb);
                    }
                }
                MenuItem menuItemAdd = menu.add("");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(this.f40135n);
                return;
            }
        }
    }

    public C10659pW0() {
        this.f40138q = new C10531oW0(this);
        this.f40139r = new C8990cW0(1, this);
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
