package defpackage;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"LpW0;", "LiW0;", "LqW0;", "<init>", "()V", "n71", "nW0", "react-native-screens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW0 */
/* loaded from: classes2.dex */
public final class C6473pW0 extends C4360iW0 implements InterfaceC6664qW0 {
    public DimmingFragment h;
    public C3708f6 i;
    public Toolbar j;
    public boolean k;
    public boolean l;
    public View m;
    public NB n;
    public C5661lG0 o;
    public C6091nW0 p;
    public final C6282oW0 q;
    public final C2530cW0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6473pW0(RV0 rv0) {
        super(rv0);
        O90.f(rv0, "screenView");
        this.q = new C6282oW0(this);
        this.r = new C2530cW0(1, this);
    }

    @Override // defpackage.C4360iW0, defpackage.InterfaceC5327jW0
    public final void l() {
        super.l();
        C6854rW0 headerConfig = h().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (h().getStackPresentation() != OV0.d) {
            return null;
        }
        return z ? AnimationUtils.loadAnimation(getContext(), R.anim.rns_slide_in_from_bottom) : AnimationUtils.loadAnimation(getContext(), R.anim.rns_slide_out_to_bottom);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        O90.f(menu, "menu");
        O90.f(menuInflater, "inflater");
        x(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // defpackage.C4360iW0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5795lz appBarLayout$ScrollingViewBehavior;
        C3708f6 c3708f6;
        C3708f6 c3708f62;
        C3708f6 c3708f63;
        Integer numValueOf;
        ColorStateList colorStateList;
        O90.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        O90.e(contextRequireContext, "requireContext(...)");
        this.p = new C6091nW0(contextRequireContext, this);
        RV0 rv0H = h();
        C6368oz c6368oz = new C6368oz(-1, -1);
        if (AbstractC3967gS1.b(h())) {
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            w(bottomSheetBehavior, C5357jg0.c);
            appBarLayout$ScrollingViewBehavior = bottomSheetBehavior;
        } else {
            appBarLayout$ScrollingViewBehavior = this.l ? null : new AppBarLayout$ScrollingViewBehavior();
        }
        c6368oz.b(appBarLayout$ScrollingViewBehavior);
        rv0H.setLayoutParams(c6368oz);
        if (AbstractC3967gS1.b(h())) {
            h().setClipToOutline(true);
            RV0 rv0H2 = h();
            float fB = AbstractC7586vL1.b(rv0H2.getSheetCornerRadius());
            GT0 gt0 = new GT0();
            GT0 gt02 = new GT0();
            C7897x c7897x = new C7897x(0.0f);
            C7897x c7897x2 = new C7897x(0.0f);
            C3759fN c3759fN = new C3759fN(0);
            C3759fN c3759fN2 = new C3759fN(0);
            C3759fN c3759fN3 = new C3759fN(0);
            C3759fN c3759fN4 = new C3759fN(0);
            AbstractC6659qU1 abstractC6659qU1A = AbstractC1938Yp1.a(0);
            C1701Vo1.d(abstractC6659qU1A);
            C7897x c7897x3 = new C7897x(fB);
            AbstractC6659qU1 abstractC6659qU1A2 = AbstractC1938Yp1.a(0);
            C1701Vo1.d(abstractC6659qU1A2);
            C7897x c7897x4 = new C7897x(fB);
            LZ0 lz0 = new LZ0();
            lz0.a = abstractC6659qU1A;
            lz0.b = abstractC6659qU1A2;
            lz0.c = gt0;
            lz0.d = gt02;
            lz0.e = c7897x3;
            lz0.f = c7897x4;
            lz0.g = c7897x;
            lz0.h = c7897x2;
            lz0.i = c3759fN;
            lz0.j = c3759fN2;
            lz0.k = c3759fN3;
            lz0.l = c3759fN4;
            C6145no0 c6145no0 = new C6145no0(lz0);
            Drawable background = rv0H2.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            } else {
                Drawable background2 = rv0H2.getBackground();
                C6145no0 c6145no02 = background2 instanceof C6145no0 ? (C6145no0) background2 : null;
                numValueOf = (c6145no02 == null || (colorStateList = c6145no02.a.e) == null) ? null : Integer.valueOf(colorStateList.getDefaultColor());
            }
            c6145no0.setTint(numValueOf != null ? numValueOf.intValue() : 0);
            rv0H2.setBackground(c6145no0);
            h().setElevation(h().getSheetElevation());
        }
        C6091nW0 c6091nW0 = this.p;
        if (c6091nW0 == null) {
            O90.o("coordinatorLayout");
            throw null;
        }
        RV0 rv0H3 = h();
        G02.b(rv0H3);
        c6091nW0.addView(rv0H3);
        if (!AbstractC3967gS1.b(h())) {
            Context context = getContext();
            if (context != null) {
                c3708f6 = new C3708f6(context);
                c3708f6.setBackgroundColor(0);
                c3708f6.setLayoutParams(new C3517e6());
            } else {
                c3708f6 = null;
            }
            this.i = c3708f6;
            C6091nW0 c6091nW02 = this.p;
            if (c6091nW02 == null) {
                O90.o("coordinatorLayout");
                throw null;
            }
            c6091nW02.addView(c3708f6);
            if (this.k && (c3708f63 = this.i) != null) {
                c3708f63.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.j;
            if (toolbar != null && (c3708f62 = this.i) != null) {
                G02.b(toolbar);
                c3708f62.addView(toolbar);
            }
            setHasOptionsMenu(true);
        }
        C6091nW0 c6091nW03 = this.p;
        if (c6091nW03 != null) {
            return c6091nW03;
        }
        O90.o("coordinatorLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        C6854rW0 headerConfig;
        O90.f(menu, "menu");
        if (!h().b() || ((headerConfig = h().getHeaderConfig()) != null && !headerConfig.e)) {
            x(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view = this.m;
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
            View viewH = h();
            while (true) {
                if (viewH == null) {
                    viewH = null;
                    break;
                } else if (viewH.isFocused()) {
                    break;
                } else {
                    viewH = viewH instanceof ViewGroup ? ((ViewGroup) viewH).getFocusedChild() : null;
                }
            }
            this.m = viewH;
        }
        super.onStop();
    }

    public final boolean v() {
        SV0 container = h().getContainer();
        if (!(container instanceof C5900mW0)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!O90.a(((C5900mW0) container).getRootScreen(), h())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C6473pW0) {
            return ((C6473pW0) parentFragment).v();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.google.android.material.bottomsheet.BottomSheetBehavior r15, defpackage.AbstractC1717Vu r16) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6473pW0.w(com.google.android.material.bottomsheet.BottomSheetBehavior, Vu):void");
    }

    public final void x(Menu menu) {
        menu.clear();
        C6854rW0 headerConfig = h().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig == null || configSubviewsCount <= 0) {
            return;
        }
        for (int i = 0; i < configSubviewsCount; i++) {
            Object obj = headerConfig.c.get(i);
            O90.e(obj, "get(...)");
            if (((C7618vW0) obj).getType() == EnumC7427uW0.e) {
                Context context = getContext();
                if (this.n == null && context != null) {
                    NB nb = new NB(context, this);
                    this.n = nb;
                    C5661lG0 c5661lG0 = this.o;
                    if (c5661lG0 != null) {
                        c5661lG0.invoke(nb);
                    }
                }
                MenuItem menuItemAdd = menu.add("");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(this.n);
                return;
            }
        }
    }

    public C6473pW0() {
        this.q = new C6282oW0(this);
        this.r = new C2530cW0(1, this);
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
