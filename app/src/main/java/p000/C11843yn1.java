package p000;

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
public final class C11843yn1 extends FM1 implements InterfaceC4028f2 {

    /* renamed from: y */
    public static final AccelerateInterpolator f46459y = new AccelerateInterpolator();

    /* renamed from: z */
    public static final DecelerateInterpolator f46460z = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f46461a;

    /* renamed from: b */
    public Context f46462b;

    /* renamed from: c */
    public ActionBarOverlayLayout f46463c;

    /* renamed from: d */
    public ActionBarContainer f46464d;

    /* renamed from: e */
    public InterfaceC3977eE f46465e;

    /* renamed from: f */
    public ActionBarContextView f46466f;

    /* renamed from: g */
    public final View f46467g;

    /* renamed from: h */
    public boolean f46468h;

    /* renamed from: i */
    public C11716xn1 f46469i;

    /* renamed from: j */
    public C11716xn1 f46470j;

    /* renamed from: k */
    public C1339VH f46471k;

    /* renamed from: l */
    public boolean f46472l;

    /* renamed from: m */
    public final ArrayList f46473m;

    /* renamed from: n */
    public int f46474n;

    /* renamed from: o */
    public boolean f46475o;

    /* renamed from: p */
    public boolean f46476p;

    /* renamed from: q */
    public boolean f46477q;

    /* renamed from: r */
    public boolean f46478r;

    /* renamed from: s */
    public C10818ql1 f46479s;

    /* renamed from: t */
    public boolean f46480t;

    /* renamed from: u */
    public boolean f46481u;

    /* renamed from: v */
    public final C11589wn1 f46482v;

    /* renamed from: w */
    public final C11589wn1 f46483w;

    /* renamed from: x */
    public final A61 f46484x;

    public C11843yn1(Activity activity, boolean z) {
        new ArrayList();
        this.f46473m = new ArrayList();
        this.f46474n = 0;
        this.f46475o = true;
        this.f46478r = true;
        this.f46482v = new C11589wn1(this, 0);
        this.f46483w = new C11589wn1(this, 1);
        this.f46484x = new A61(4, this);
        View decorView = activity.getWindow().getDecorView();
        m26252v(decorView);
        if (z) {
            return;
        }
        this.f46467g = decorView.findViewById(R.id.content);
    }

    @Override // p000.FM1
    /* renamed from: b */
    public final boolean mo2587b() {
        C8745ab1 c8745ab1;
        InterfaceC3977eE interfaceC3977eE = this.f46465e;
        if (interfaceC3977eE == null || (c8745ab1 = ((C9518gb1) interfaceC3977eE).f27862a.f15881M) == null || c8745ab1.f15580b == null) {
            return false;
        }
        C8745ab1 c8745ab12 = ((C9518gb1) interfaceC3977eE).f27862a.f15881M;
        C7866Kq0 c7866Kq0 = c8745ab12 == null ? null : c8745ab12.f15580b;
        if (c7866Kq0 == null) {
            return true;
        }
        c7866Kq0.collapseActionView();
        return true;
    }

    @Override // p000.FM1
    /* renamed from: c */
    public final void mo2588c(boolean z) {
        if (z == this.f46472l) {
            return;
        }
        this.f46472l = z;
        ArrayList arrayList = this.f46473m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.FM1
    /* renamed from: d */
    public final int mo2589d() {
        return ((C9518gb1) this.f46465e).f27863b;
    }

    @Override // p000.FM1
    /* renamed from: e */
    public final Context mo2590e() {
        if (this.f46462b == null) {
            TypedValue typedValue = new TypedValue();
            this.f46461a.getTheme().resolveAttribute(ru.mes.dnevnik.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f46462b = new ContextThemeWrapper(this.f46461a, i);
            } else {
                this.f46462b = this.f46461a;
            }
        }
        return this.f46462b;
    }

    @Override // p000.FM1
    /* renamed from: g */
    public final void mo2592g() {
        m26253w(this.f46461a.getResources().getBoolean(ru.mes.dnevnik.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000.FM1
    /* renamed from: i */
    public final boolean mo2594i(int i, KeyEvent keyEvent) {
        MenuC7450Cq0 menuC7450Cq0;
        C11716xn1 c11716xn1 = this.f46469i;
        if (c11716xn1 == null || (menuC7450Cq0 = c11716xn1.f45792e) == null) {
            return false;
        }
        menuC7450Cq0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC7450Cq0.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.FM1
    /* renamed from: m */
    public final void mo2597m(boolean z) {
        if (this.f46468h) {
            return;
        }
        mo2598n(z);
    }

    @Override // p000.FM1
    /* renamed from: n */
    public final void mo2598n(boolean z) {
        int i = z ? 4 : 0;
        C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
        int i2 = c9518gb1.f27863b;
        this.f46468h = true;
        c9518gb1.m18585a((i & 4) | (i2 & (-5)));
    }

    @Override // p000.FM1
    /* renamed from: o */
    public final void mo2599o() {
        C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
        c9518gb1.m18585a(c9518gb1.f27863b & (-9));
    }

    @Override // p000.FM1
    /* renamed from: p */
    public final void mo2600p(Drawable drawable) {
        C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
        c9518gb1.f27867f = drawable;
        int i = c9518gb1.f27863b & 4;
        Toolbar toolbar = c9518gb1.f27862a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = c9518gb1.f27876o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // p000.FM1
    /* renamed from: q */
    public final void mo2601q(boolean z) {
        C10818ql1 c10818ql1;
        this.f46480t = z;
        if (z || (c10818ql1 = this.f46479s) == null) {
            return;
        }
        c10818ql1.m24057a();
    }

    @Override // p000.FM1
    /* renamed from: r */
    public final void mo2602r(CharSequence charSequence) {
        C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
        c9518gb1.f27868g = true;
        c9518gb1.f27869h = charSequence;
        if ((c9518gb1.f27863b & 8) != 0) {
            Toolbar toolbar = c9518gb1.f27862a;
            toolbar.setTitle(charSequence);
            if (c9518gb1.f27868g) {
                AbstractC10944rk1.m24483o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.FM1
    /* renamed from: s */
    public final void mo2603s(CharSequence charSequence) {
        C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
        if (c9518gb1.f27868g) {
            return;
        }
        c9518gb1.f27869h = charSequence;
        if ((c9518gb1.f27863b & 8) != 0) {
            Toolbar toolbar = c9518gb1.f27862a;
            toolbar.setTitle(charSequence);
            if (c9518gb1.f27868g) {
                AbstractC10944rk1.m24483o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.FM1
    /* renamed from: t */
    public final AbstractC6798s2 mo2604t(C1339VH c1339vh) {
        C11716xn1 c11716xn1 = this.f46469i;
        if (c11716xn1 != null) {
            c11716xn1.mo18163b();
        }
        this.f46463c.setHideOnContentScrollEnabled(false);
        this.f46466f.m9835e();
        C11716xn1 c11716xn12 = new C11716xn1(this, this.f46466f.getContext(), c1339vh);
        MenuC7450Cq0 menuC7450Cq0 = c11716xn12.f45792e;
        menuC7450Cq0.m1424w();
        try {
            if (!((C10919rY0) c11716xn12.f45793f.f12486b).m24405D(c11716xn12, menuC7450Cq0)) {
                return null;
            }
            this.f46469i = c11716xn12;
            c11716xn12.mo18169j();
            this.f46466f.m9833c(c11716xn12);
            m26251u(true);
            return c11716xn12;
        } finally {
            menuC7450Cq0.m1423v();
        }
    }

    /* renamed from: u */
    public final void m26251u(boolean z) {
        C10690pl1 c10690pl1M9837i;
        C10690pl1 c10690pl1M9837i2;
        if (z) {
            if (!this.f46477q) {
                this.f46477q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f46463c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m26254x(false);
            }
        } else if (this.f46477q) {
            this.f46477q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f46463c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m26254x(false);
        }
        if (!this.f46464d.isLaidOut()) {
            if (z) {
                ((C9518gb1) this.f46465e).f27862a.setVisibility(4);
                this.f46466f.setVisibility(0);
                return;
            } else {
                ((C9518gb1) this.f46465e).f27862a.setVisibility(0);
                this.f46466f.setVisibility(8);
                return;
            }
        }
        if (z) {
            C9518gb1 c9518gb1 = (C9518gb1) this.f46465e;
            c10690pl1M9837i = AbstractC10944rk1.m24469a(c9518gb1.f27862a);
            c10690pl1M9837i.m23870a(0.0f);
            c10690pl1M9837i.m23872c(100L);
            c10690pl1M9837i.m23873d(new C9390fb1(c9518gb1, 4));
            c10690pl1M9837i2 = this.f46466f.m9837i(0, 200L);
        } else {
            C9518gb1 c9518gb12 = (C9518gb1) this.f46465e;
            C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(c9518gb12.f27862a);
            c10690pl1M24469a.m23870a(1.0f);
            c10690pl1M24469a.m23872c(200L);
            c10690pl1M24469a.m23873d(new C9390fb1(c9518gb12, 0));
            c10690pl1M9837i = this.f46466f.m9837i(8, 100L);
            c10690pl1M9837i2 = c10690pl1M24469a;
        }
        C10818ql1 c10818ql1 = new C10818ql1();
        ArrayList arrayList = c10818ql1.f41128a;
        arrayList.add(c10690pl1M9837i);
        View view = (View) c10690pl1M9837i.f40376a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c10690pl1M9837i2.f40376a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c10690pl1M9837i2);
        c10818ql1.m24058b();
    }

    /* renamed from: v */
    public final void m26252v(View view) {
        InterfaceC3977eE wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.mes.dnevnik.R.id.decor_content_parent);
        this.f46463c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ru.mes.dnevnik.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC3977eE) {
            wrapper = (InterfaceC3977eE) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f46465e = wrapper;
        this.f46466f = (ActionBarContextView) view.findViewById(ru.mes.dnevnik.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.mes.dnevnik.R.id.action_bar_container);
        this.f46464d = actionBarContainer;
        InterfaceC3977eE interfaceC3977eE = this.f46465e;
        if (interfaceC3977eE == null || this.f46466f == null || actionBarContainer == null) {
            throw new IllegalStateException(C11843yn1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C9518gb1) interfaceC3977eE).f27862a.getContext();
        this.f46461a = context;
        if ((((C9518gb1) this.f46465e).f27863b & 4) != 0) {
            this.f46468h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f46465e.getClass();
        m26253w(context.getResources().getBoolean(ru.mes.dnevnik.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f46461a.obtainStyledAttributes(null, AbstractC8704aH0.f15423a, ru.mes.dnevnik.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f46463c;
            if (!actionBarOverlayLayout2.f15821g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f46481u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f46464d;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18624s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: w */
    public final void m26253w(boolean z) {
        if (z) {
            this.f46464d.setTabContainer(null);
            ((C9518gb1) this.f46465e).getClass();
        } else {
            ((C9518gb1) this.f46465e).getClass();
            this.f46464d.setTabContainer(null);
        }
        this.f46465e.getClass();
        ((C9518gb1) this.f46465e).f27862a.setCollapsible(false);
        this.f46463c.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: x */
    public final void m26254x(boolean z) {
        boolean z2 = this.f46477q || !this.f46476p;
        View view = this.f46467g;
        A61 a61 = this.f46484x;
        if (!z2) {
            if (this.f46478r) {
                this.f46478r = false;
                C10818ql1 c10818ql1 = this.f46479s;
                if (c10818ql1 != null) {
                    c10818ql1.m24057a();
                }
                int i = this.f46474n;
                C11589wn1 c11589wn1 = this.f46482v;
                if (i != 0 || (!this.f46480t && !z)) {
                    c11589wn1.mo18261c();
                    return;
                }
                this.f46464d.setAlpha(1.0f);
                this.f46464d.setTransitioning(true);
                C10818ql1 c10818ql12 = new C10818ql1();
                float f = -this.f46464d.getHeight();
                if (z) {
                    this.f46464d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(this.f46464d);
                c10690pl1M24469a.m23874e(f);
                View view2 = (View) c10690pl1M24469a.f40376a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(a61 != null ? new C1579Z5(a61, 1, view2) : null);
                }
                boolean z3 = c10818ql12.f41132e;
                ArrayList arrayList = c10818ql12.f41128a;
                if (!z3) {
                    arrayList.add(c10690pl1M24469a);
                }
                if (this.f46475o && view != null) {
                    C10690pl1 c10690pl1M24469a2 = AbstractC10944rk1.m24469a(view);
                    c10690pl1M24469a2.m23874e(f);
                    if (!c10818ql12.f41132e) {
                        arrayList.add(c10690pl1M24469a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f46459y;
                boolean z4 = c10818ql12.f41132e;
                if (!z4) {
                    c10818ql12.f41130c = accelerateInterpolator;
                }
                if (!z4) {
                    c10818ql12.f41129b = 250L;
                }
                if (!z4) {
                    c10818ql12.f41131d = c11589wn1;
                }
                this.f46479s = c10818ql12;
                c10818ql12.m24058b();
                return;
            }
            return;
        }
        if (this.f46478r) {
            return;
        }
        this.f46478r = true;
        C10818ql1 c10818ql13 = this.f46479s;
        if (c10818ql13 != null) {
            c10818ql13.m24057a();
        }
        this.f46464d.setVisibility(0);
        int i2 = this.f46474n;
        C11589wn1 c11589wn12 = this.f46483w;
        if (i2 == 0 && (this.f46480t || z)) {
            this.f46464d.setTranslationY(0.0f);
            float f2 = -this.f46464d.getHeight();
            if (z) {
                this.f46464d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f46464d.setTranslationY(f2);
            C10818ql1 c10818ql14 = new C10818ql1();
            C10690pl1 c10690pl1M24469a3 = AbstractC10944rk1.m24469a(this.f46464d);
            c10690pl1M24469a3.m23874e(0.0f);
            View view3 = (View) c10690pl1M24469a3.f40376a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(a61 != null ? new C1579Z5(a61, 1, view3) : null);
            }
            boolean z5 = c10818ql14.f41132e;
            ArrayList arrayList2 = c10818ql14.f41128a;
            if (!z5) {
                arrayList2.add(c10690pl1M24469a3);
            }
            if (this.f46475o && view != null) {
                view.setTranslationY(f2);
                C10690pl1 c10690pl1M24469a4 = AbstractC10944rk1.m24469a(view);
                c10690pl1M24469a4.m23874e(0.0f);
                if (!c10818ql14.f41132e) {
                    arrayList2.add(c10690pl1M24469a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f46460z;
            boolean z6 = c10818ql14.f41132e;
            if (!z6) {
                c10818ql14.f41130c = decelerateInterpolator;
            }
            if (!z6) {
                c10818ql14.f41129b = 250L;
            }
            if (!z6) {
                c10818ql14.f41131d = c11589wn12;
            }
            this.f46479s = c10818ql14;
            c10818ql14.m24058b();
        } else {
            this.f46464d.setAlpha(1.0f);
            this.f46464d.setTranslationY(0.0f);
            if (this.f46475o && view != null) {
                view.setTranslationY(0.0f);
            }
            c11589wn12.mo18261c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46463c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9280ek1.m18029c(actionBarOverlayLayout);
        }
    }

    public C11843yn1(Dialog dialog) {
        new ArrayList();
        this.f46473m = new ArrayList();
        this.f46474n = 0;
        this.f46475o = true;
        this.f46478r = true;
        this.f46482v = new C11589wn1(this, 0);
        this.f46483w = new C11589wn1(this, 1);
        this.f46484x = new A61(4, this);
        m26252v(dialog.getWindow().getDecorView());
    }
}
