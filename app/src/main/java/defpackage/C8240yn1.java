package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: yn1 */
/* loaded from: classes.dex */
public final class C8240yn1 extends FM1 implements InterfaceC3694f2 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public InterfaceC3541eE e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public C8050xn1 i;
    public C8050xn1 j;
    public VH k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public C6710ql1 s;
    public boolean t;
    public boolean u;
    public final C7860wn1 v;
    public final C7860wn1 w;
    public final A61 x;

    public C8240yn1(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new C7860wn1(this, 0);
        this.w = new C7860wn1(this, 1);
        this.x = new A61(4, this);
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.FM1
    public final boolean b() {
        C2165ab1 c2165ab1;
        InterfaceC3541eE interfaceC3541eE = this.e;
        if (interfaceC3541eE == null || (c2165ab1 = ((C3994gb1) interfaceC3541eE).a.M) == null || c2165ab1.b == null) {
            return false;
        }
        C2165ab1 c2165ab12 = ((C3994gb1) interfaceC3541eE).a.M;
        C0849Kq0 c0849Kq0 = c2165ab12 == null ? null : c2165ab12.b;
        if (c0849Kq0 == null) {
            return true;
        }
        c0849Kq0.collapseActionView();
        return true;
    }

    @Override // defpackage.FM1
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.FM1
    public final int d() {
        return ((C3994gb1) this.e).b;
    }

    @Override // defpackage.FM1
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ru.mes.dnevnik.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.FM1
    public final void g() {
        w(this.a.getResources().getBoolean(ru.mes.dnevnik.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.FM1
    public final boolean i(int i, KeyEvent keyEvent) {
        MenuC0225Cq0 menuC0225Cq0;
        C8050xn1 c8050xn1 = this.i;
        if (c8050xn1 == null || (menuC0225Cq0 = c8050xn1.e) == null) {
            return false;
        }
        menuC0225Cq0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0225Cq0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.FM1
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        n(z2);
    }

    @Override // defpackage.FM1
    public final void n(boolean z2) {
        int i = z2 ? 4 : 0;
        C3994gb1 c3994gb1 = (C3994gb1) this.e;
        int i2 = c3994gb1.b;
        this.h = true;
        c3994gb1.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.FM1
    public final void o() {
        C3994gb1 c3994gb1 = (C3994gb1) this.e;
        c3994gb1.a(c3994gb1.b & (-9));
    }

    @Override // defpackage.FM1
    public final void p(Drawable drawable) {
        C3994gb1 c3994gb1 = (C3994gb1) this.e;
        c3994gb1.f = drawable;
        int i = c3994gb1.b & 4;
        Toolbar toolbar = c3994gb1.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = c3994gb1.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.FM1
    public final void q(boolean z2) {
        C6710ql1 c6710ql1;
        this.t = z2;
        if (z2 || (c6710ql1 = this.s) == null) {
            return;
        }
        c6710ql1.a();
    }

    @Override // defpackage.FM1
    public final void r(CharSequence charSequence) {
        C3994gb1 c3994gb1 = (C3994gb1) this.e;
        c3994gb1.g = true;
        c3994gb1.h = charSequence;
        if ((c3994gb1.b & 8) != 0) {
            Toolbar toolbar = c3994gb1.a;
            toolbar.setTitle(charSequence);
            if (c3994gb1.g) {
                AbstractC6897rk1.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.FM1
    public final void s(CharSequence charSequence) {
        C3994gb1 c3994gb1 = (C3994gb1) this.e;
        if (c3994gb1.g) {
            return;
        }
        c3994gb1.h = charSequence;
        if ((c3994gb1.b & 8) != 0) {
            Toolbar toolbar = c3994gb1.a;
            toolbar.setTitle(charSequence);
            if (c3994gb1.g) {
                AbstractC6897rk1.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.FM1
    public final AbstractC6952s2 t(VH vh) {
        C8050xn1 c8050xn1 = this.i;
        if (c8050xn1 != null) {
            c8050xn1.b();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        C8050xn1 c8050xn12 = new C8050xn1(this, this.f.getContext(), vh);
        MenuC0225Cq0 menuC0225Cq0 = c8050xn12.e;
        menuC0225Cq0.w();
        try {
            if (!((C6860rY0) c8050xn12.f.b).D(c8050xn12, menuC0225Cq0)) {
                return null;
            }
            this.i = c8050xn12;
            c8050xn12.j();
            this.f.c(c8050xn12);
            u(true);
            return c8050xn12;
        } finally {
            menuC0225Cq0.v();
        }
    }

    public final void u(boolean z2) {
        C6519pl1 c6519pl1I;
        C6519pl1 c6519pl1I2;
        if (z2) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((C3994gb1) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((C3994gb1) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C3994gb1 c3994gb1 = (C3994gb1) this.e;
            c6519pl1I = AbstractC6897rk1.a(c3994gb1.a);
            c6519pl1I.a(0.0f);
            c6519pl1I.c(100L);
            c6519pl1I.d(new C3803fb1(c3994gb1, 4));
            c6519pl1I2 = this.f.i(0, 200L);
        } else {
            C3994gb1 c3994gb12 = (C3994gb1) this.e;
            C6519pl1 c6519pl1A = AbstractC6897rk1.a(c3994gb12.a);
            c6519pl1A.a(1.0f);
            c6519pl1A.c(200L);
            c6519pl1A.d(new C3803fb1(c3994gb12, 0));
            c6519pl1I = this.f.i(8, 100L);
            c6519pl1I2 = c6519pl1A;
        }
        C6710ql1 c6710ql1 = new C6710ql1();
        ArrayList arrayList = c6710ql1.a;
        arrayList.add(c6519pl1I);
        View view = (View) c6519pl1I.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c6519pl1I2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c6519pl1I2);
        c6710ql1.b();
    }

    public final void v(View view) {
        InterfaceC3541eE wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.mes.dnevnik.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ru.mes.dnevnik.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC3541eE) {
            wrapper = (InterfaceC3541eE) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ru.mes.dnevnik.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.mes.dnevnik.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC3541eE interfaceC3541eE = this.e;
        if (interfaceC3541eE == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(C8240yn1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C3994gb1) interfaceC3541eE).a.getContext();
        this.a = context;
        if ((((C3994gb1) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        w(context.getResources().getBoolean(ru.mes.dnevnik.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, AbstractC2104aH0.a, ru.mes.dnevnik.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC4021gk1.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((C3994gb1) this.e).getClass();
        } else {
            ((C3994gb1) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((C3994gb1) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void x(boolean z2) {
        boolean z3 = this.q || !this.p;
        View view = this.g;
        A61 a61 = this.x;
        if (!z3) {
            if (this.r) {
                this.r = false;
                C6710ql1 c6710ql1 = this.s;
                if (c6710ql1 != null) {
                    c6710ql1.a();
                }
                int i = this.n;
                C7860wn1 c7860wn1 = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    c7860wn1.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                C6710ql1 c6710ql12 = new C6710ql1();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C6519pl1 c6519pl1A = AbstractC6897rk1.a(this.d);
                c6519pl1A.e(f);
                View view2 = (View) c6519pl1A.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(a61 != null ? new Z5(a61, 1, view2) : null);
                }
                boolean z4 = c6710ql12.e;
                ArrayList arrayList = c6710ql12.a;
                if (!z4) {
                    arrayList.add(c6519pl1A);
                }
                if (this.o && view != null) {
                    C6519pl1 c6519pl1A2 = AbstractC6897rk1.a(view);
                    c6519pl1A2.e(f);
                    if (!c6710ql12.e) {
                        arrayList.add(c6519pl1A2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = y;
                boolean z5 = c6710ql12.e;
                if (!z5) {
                    c6710ql12.c = accelerateInterpolator;
                }
                if (!z5) {
                    c6710ql12.b = 250L;
                }
                if (!z5) {
                    c6710ql12.d = c7860wn1;
                }
                this.s = c6710ql12;
                c6710ql12.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        C6710ql1 c6710ql13 = this.s;
        if (c6710ql13 != null) {
            c6710ql13.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        C7860wn1 c7860wn12 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            C6710ql1 c6710ql14 = new C6710ql1();
            C6519pl1 c6519pl1A3 = AbstractC6897rk1.a(this.d);
            c6519pl1A3.e(0.0f);
            View view3 = (View) c6519pl1A3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(a61 != null ? new Z5(a61, 1, view3) : null);
            }
            boolean z6 = c6710ql14.e;
            ArrayList arrayList2 = c6710ql14.a;
            if (!z6) {
                arrayList2.add(c6519pl1A3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                C6519pl1 c6519pl1A4 = AbstractC6897rk1.a(view);
                c6519pl1A4.e(0.0f);
                if (!c6710ql14.e) {
                    arrayList2.add(c6519pl1A4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = z;
            boolean z7 = c6710ql14.e;
            if (!z7) {
                c6710ql14.c = decelerateInterpolator;
            }
            if (!z7) {
                c6710ql14.b = 250L;
            }
            if (!z7) {
                c6710ql14.d = c7860wn12;
            }
            this.s = c6710ql14;
            c6710ql14.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            c7860wn12.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC3639ek1.c(actionBarOverlayLayout);
        }
    }

    public C8240yn1(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new C7860wn1(this, 0);
        this.w = new C7860wn1(this, 1);
        this.x = new A61(4, this);
        v(dialog.getWindow().getDecorView());
    }
}
