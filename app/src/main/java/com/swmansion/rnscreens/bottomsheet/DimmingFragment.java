package com.swmansion.rnscreens.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1719a;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC0964PJ;
import p000.AbstractC1378Vu;
import p000.AbstractC7965Mn1;
import p000.C0901OJ;
import p000.C10275mW0;
import p000.C1027QJ;
import p000.C10295mg0;
import p000.C10659pW0;
import p000.C1131Rz;
import p000.C6846so;
import p000.C7809Jn1;
import p000.C7861Kn1;
import p000.C7913Ln1;
import p000.C8277Sn1;
import p000.C8433Vn1;
import p000.C9399fg0;
import p000.C9911jg0;
import p000.EnumC7382Bi0;
import p000.EnumC9507gW0;
import p000.InterfaceC10787qW0;
import p000.InterfaceC6947uP;
import p000.InterfaceC7516Dx0;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.J80;
import p000.M80;
import p000.O90;
import p000.OZ1;
import p000.RV0;
import p000.SV0;
import p000.V00;
import p000.ViewOnClickListenerC1250Ts;
import ru.mes.dnevnik.R;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, m22267d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingFragment;", "Landroidx/fragment/app/Fragment;", "LIi0;", "LqW0;", "Landroid/view/animation/Animation$AnimationListener;", "LDx0;", "", "OJ", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DimmingFragment extends Fragment implements InterfaceC7746Ii0, InterfaceC10787qW0, Animation.AnimationListener, InterfaceC7516Dx0 {

    /* renamed from: a */
    public final C10659pW0 f20252a;

    /* renamed from: b */
    public C1027QJ f20253b;

    /* renamed from: c */
    public V00 f20254c;

    /* renamed from: e */
    public boolean f20256e;

    /* renamed from: g */
    public C0901OJ f20258g;

    /* renamed from: i */
    public final List f20260i;

    /* renamed from: d */
    public final float f20255d = 0.15f;

    /* renamed from: f */
    public AbstractC1378Vu f20257f = C9911jg0.f35320c;

    /* renamed from: h */
    public final M80 f20259h = M80.f7000a;

    public DimmingFragment(C10659pW0 c10659pW0) {
        this.f20252a = c10659pW0;
        c10659pW0.getLifecycle().mo2368a(this);
        c10659pW0.f40129h = this;
        this.f20260i = c10659pW0.f29291b;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: a */
    public final void mo13722a(EnumC9507gW0 enumC9507gW0) {
        throw new C1131Rz("An operation is not implemented: Not yet implemented");
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: b */
    public final void mo13723b(SV0 sv0) {
        O90.m5968f(sv0, "container");
        this.f20252a.mo13723b(sv0);
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: d */
    public final Fragment mo13724d() {
        return this;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: e */
    public final ReactContext mo13725e() {
        Context context = getContext();
        if (context instanceof ReactContext) {
            return (ReactContext) context;
        }
        return null;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (AbstractC0964PJ.f8993a[enumC7382Bi0.ordinal()] == 1) {
            C10659pW0 c10659pW0 = this.f20252a;
            BottomSheetBehavior<RV0> sheetBehavior = c10659pW0.mo13727h().getSheetBehavior();
            if (sheetBehavior != null) {
                RV0 rv0Mo13727h = c10659pW0.mo13727h();
                C1027QJ c1027qj = this.f20253b;
                if (c1027qj == null) {
                    O90.m5977o("dimmingView");
                    throw null;
                }
                C0901OJ c0901oj = new C0901OJ(rv0Mo13727h, c1027qj, this.f20255d);
                this.f20258g = c0901oj;
                sheetBehavior.m11208s(c0901oj);
            }
        }
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: g */
    public final void mo13726g(EnumC9507gW0 enumC9507gW0) {
        throw new C1131Rz("An operation is not implemented: Not yet implemented");
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: h */
    public final RV0 mo13727h() {
        return this.f20252a.mo13727h();
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: i */
    public final void mo13728i(SV0 sv0) {
        O90.m5968f(sv0, "container");
        this.f20252a.mo13728i(sv0);
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: j, reason: from getter */
    public final List getF20260i() {
        return this.f20260i;
    }

    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        O90.m5968f(view, "v");
        C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
        boolean zMo5841o = c8277Sn1.mo5841o(8);
        J80 j80Mo5837f = c8277Sn1.mo5837f(8);
        O90.m5967e(j80Mo5837f, "getInsets(...)");
        C10659pW0 c10659pW0 = this.f20252a;
        if (zMo5841o) {
            this.f20256e = true;
            int i = j80Mo5837f.f5355d;
            this.f20257f = new C10295mg0(i);
            BottomSheetBehavior<RV0> sheetBehavior = c10659pW0.mo13727h().getSheetBehavior();
            if (sheetBehavior != null) {
                c10659pW0.m23813w(sheetBehavior, new C10295mg0(i));
            }
            if (isRemoving()) {
                return c8433Vn1;
            }
            J80 j80Mo5837f2 = c8277Sn1.mo5837f(2);
            O90.m5967e(j80Mo5837f2, "getInsets(...)");
            int i2 = Build.VERSION.SDK_INT;
            AbstractC7965Mn1 c7913Ln1 = i2 >= 30 ? new C7913Ln1(c8433Vn1) : i2 >= 29 ? new C7861Kn1(c8433Vn1) : new C7809Jn1(c8433Vn1);
            c7913Ln1.mo5106c(2, J80.m4201b(j80Mo5837f2.f5352a, j80Mo5837f2.f5353b, j80Mo5837f2.f5354c, 0));
            C8433Vn1 c8433Vn1Mo4414b = c7913Ln1.mo4414b();
            O90.m5967e(c8433Vn1Mo4414b, "build(...)");
            return c8433Vn1Mo4414b;
        }
        if (isRemoving()) {
            J80 j80Mo5837f3 = c8277Sn1.mo5837f(2);
            O90.m5967e(j80Mo5837f3, "getInsets(...)");
            int i3 = Build.VERSION.SDK_INT;
            AbstractC7965Mn1 c7913Ln12 = i3 >= 30 ? new C7913Ln1(c8433Vn1) : i3 >= 29 ? new C7861Kn1(c8433Vn1) : new C7809Jn1(c8433Vn1);
            c7913Ln12.mo5106c(2, J80.m4201b(j80Mo5837f3.f5352a, j80Mo5837f3.f5353b, j80Mo5837f3.f5354c, 0));
            C8433Vn1 c8433Vn1Mo4414b2 = c7913Ln12.mo4414b();
            O90.m5967e(c8433Vn1Mo4414b2, "build(...)");
            return c8433Vn1Mo4414b2;
        }
        BottomSheetBehavior<RV0> sheetBehavior2 = c10659pW0.mo13727h().getSheetBehavior();
        C9911jg0 c9911jg0 = C9911jg0.f35320c;
        if (sheetBehavior2 != null) {
            if (this.f20256e) {
                c10659pW0.m23813w(sheetBehavior2, C9399fg0.f27322c);
            } else if (!O90.m5963a(this.f20257f, c9911jg0)) {
                c10659pW0.m23813w(sheetBehavior2, c9911jg0);
            }
        }
        this.f20257f = c9911jg0;
        this.f20256e = false;
        J80 j80Mo5837f4 = c8277Sn1.mo5837f(2);
        O90.m5967e(j80Mo5837f4, "getInsets(...)");
        int i4 = Build.VERSION.SDK_INT;
        AbstractC7965Mn1 c7913Ln13 = i4 >= 30 ? new C7913Ln1(c8433Vn1) : i4 >= 29 ? new C7861Kn1(c8433Vn1) : new C7809Jn1(c8433Vn1);
        c7913Ln13.mo5106c(2, J80.m4201b(j80Mo5837f4.f5352a, j80Mo5837f4.f5353b, j80Mo5837f4.f5354c, 0));
        C8433Vn1 c8433Vn1Mo4414b3 = c7913Ln13.mo4414b();
        O90.m5967e(c8433Vn1Mo4414b3, "build(...)");
        return c8433Vn1Mo4414b3;
    }

    @Override // p000.InterfaceC9891jW0
    /* renamed from: l */
    public final void mo13730l() {
        this.f20252a.mo13730l();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SV0 container = this.f20252a.mo13727h().getContainer();
        C10275mW0 c10275mW0 = container instanceof C10275mW0 ? (C10275mW0) container : null;
        if (c10275mW0 != null) {
            c10275mW0.f37744i.add(this);
            c10275mW0.f10818d = true;
            c10275mW0.m7381g();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnimationUtils.loadAnimation(getContext(), z ? R.anim.rns_fade_in : R.anim.rns_fade_out);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        O90.m5968f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        O90.m5967e(contextRequireContext, "requireContext(...)");
        V00 v00 = new V00(contextRequireContext);
        v00.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v00.setBackgroundColor(0);
        v00.setId(View.generateViewId());
        this.f20254c = v00;
        Context contextRequireContext2 = requireContext();
        O90.m5967e(contextRequireContext2, "requireContext(...)");
        C1027QJ c1027qj = new C1027QJ(contextRequireContext2);
        c1027qj.setBackgroundColor(-16777216);
        c1027qj.setAlpha(this.f20255d);
        c1027qj.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c1027qj.setOnClickListener(new ViewOnClickListenerC1250Ts(2, this));
        this.f20253b = c1027qj;
        V00 v002 = this.f20254c;
        if (v002 == null) {
            O90.m5977o("containerView");
            throw null;
        }
        v002.addView(c1027qj);
        V00 v003 = this.f20254c;
        if (v003 != null) {
            return v003;
        }
        O90.m5977o("containerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f20259h.getClass();
        M80.f7001b.remove(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        this.f20259h.getClass();
        M80.f7001b.add(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C10659pW0 c10659pW0 = this.f20252a;
        Activity currentActivity = c10659pW0.mo13727h().getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        O90.m5967e(decorView, "getDecorView(...)");
        this.f20259h.m5275a(decorView);
        AbstractC1733o childFragmentManager = getChildFragmentManager();
        O90.m5967e(childFragmentManager, "getChildFragmentManager(...)");
        C1719a c1719a = new C1719a(childFragmentManager);
        c1719a.f43746o = true;
        c1719a.mo10013c(requireView().getId(), c10659pW0, null, 1);
        c1719a.m10015f(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        O90.m5968f(view, "view");
        C10659pW0 c10659pW0 = this.f20252a;
        if (c10659pW0.mo13727h().getSheetInitialDetentIndex() <= c10659pW0.mo13727h().getSheetLargestUndimmedDetentIndex()) {
            C1027QJ c1027qj = this.f20253b;
            if (c1027qj != null) {
                c1027qj.setAlpha(0.0f);
                return;
            } else {
                O90.m5977o("dimmingView");
                throw null;
            }
        }
        C1027QJ c1027qj2 = this.f20253b;
        if (c1027qj2 != null) {
            c1027qj2.setAlpha(this.f20255d);
        } else {
            O90.m5977o("dimmingView");
            throw null;
        }
    }

    /* renamed from: r */
    public final void m13731r() {
        BottomSheetBehavior<RV0> sheetBehavior;
        if (isRemoving()) {
            return;
        }
        C10659pW0 c10659pW0 = this.f20252a;
        ReactContext reactContext = c10659pW0.mo13727h().getReactContext();
        int iM6093d = OZ1.m6093d(reactContext);
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, c10659pW0.mo13727h().getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(iM6093d, c10659pW0.mo13727h().getId(), 18));
        }
        C0901OJ c0901oj = this.f20258g;
        if (c0901oj != null && (sheetBehavior = c10659pW0.mo13727h().getSheetBehavior()) != null) {
            sheetBehavior.f18112W.remove(c0901oj);
        }
        C1027QJ c1027qj = this.f20253b;
        if (c1027qj == null) {
            O90.m5977o("dimmingView");
            throw null;
        }
        c1027qj.setOnClickListener(null);
        c10659pW0.getClass();
        c10659pW0.getLifecycle().mo2369b(this);
        this.f20259h.getClass();
        M80.f7001b.remove(this);
        SV0 container = c10659pW0.mo13727h().getContainer();
        C10275mW0 c10275mW0 = container instanceof C10275mW0 ? (C10275mW0) container : null;
        if (c10275mW0 != null) {
            c10275mW0.f37744i.add(this);
            c10275mW0.f10818d = true;
            c10275mW0.m7381g();
        }
    }
}
