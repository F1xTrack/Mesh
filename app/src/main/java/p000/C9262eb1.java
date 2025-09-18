package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: eb1 */
/* loaded from: classes.dex */
public final class C9262eb1 extends FM1 {

    /* renamed from: a */
    public final C9518gb1 f26763a;

    /* renamed from: b */
    public final WindowCallbackC0070B6 f26764b;

    /* renamed from: c */
    public final C10909rT0 f26765c;

    /* renamed from: d */
    public boolean f26766d;

    /* renamed from: e */
    public boolean f26767e;

    /* renamed from: f */
    public boolean f26768f;

    /* renamed from: g */
    public final ArrayList f26769g = new ArrayList();

    /* renamed from: h */
    public final RunnableC10431nk0 f26770h = new RunnableC10431nk0(11, this);

    public C9262eb1(Toolbar toolbar, CharSequence charSequence, WindowCallbackC0070B6 windowCallbackC0070B6) {
        GQ0 gq0 = new GQ0(4, this);
        toolbar.getClass();
        C9518gb1 c9518gb1 = new C9518gb1(toolbar, false);
        this.f26763a = c9518gb1;
        windowCallbackC0070B6.getClass();
        this.f26764b = windowCallbackC0070B6;
        c9518gb1.f27872k = windowCallbackC0070B6;
        toolbar.setOnMenuItemClickListener(gq0);
        if (!c9518gb1.f27868g) {
            c9518gb1.f27869h = charSequence;
            if ((c9518gb1.f27863b & 8) != 0) {
                Toolbar toolbar2 = c9518gb1.f27862a;
                toolbar2.setTitle(charSequence);
                if (c9518gb1.f27868g) {
                    AbstractC10944rk1.m24483o(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f26765c = new C10909rT0(this);
    }

    @Override // p000.FM1
    /* renamed from: a */
    public final boolean mo2586a() {
        C6527o2 c6527o2;
        ActionMenuView actionMenuView = this.f26763a.f27862a.f15889a;
        return (actionMenuView == null || (c6527o2 = actionMenuView.f15846t) == null || !c6527o2.m23311b()) ? false : true;
    }

    @Override // p000.FM1
    /* renamed from: b */
    public final boolean mo2587b() {
        C7866Kq0 c7866Kq0;
        C8745ab1 c8745ab1 = this.f26763a.f27862a.f15881M;
        if (c8745ab1 == null || (c7866Kq0 = c8745ab1.f15580b) == null) {
            return false;
        }
        if (c8745ab1 == null) {
            c7866Kq0 = null;
        }
        if (c7866Kq0 == null) {
            return true;
        }
        c7866Kq0.collapseActionView();
        return true;
    }

    @Override // p000.FM1
    /* renamed from: c */
    public final void mo2588c(boolean z) {
        if (z == this.f26768f) {
            return;
        }
        this.f26768f = z;
        ArrayList arrayList = this.f26769g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.FM1
    /* renamed from: d */
    public final int mo2589d() {
        return this.f26763a.f27863b;
    }

    @Override // p000.FM1
    /* renamed from: e */
    public final Context mo2590e() {
        return this.f26763a.f27862a.getContext();
    }

    @Override // p000.FM1
    /* renamed from: f */
    public final boolean mo2591f() {
        C9518gb1 c9518gb1 = this.f26763a;
        Toolbar toolbar = c9518gb1.f27862a;
        RunnableC10431nk0 runnableC10431nk0 = this.f26770h;
        toolbar.removeCallbacks(runnableC10431nk0);
        Toolbar toolbar2 = c9518gb1.f27862a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        toolbar2.postOnAnimation(runnableC10431nk0);
        return true;
    }

    @Override // p000.FM1
    /* renamed from: h */
    public final void mo2593h() {
        this.f26763a.f27862a.removeCallbacks(this.f26770h);
    }

    @Override // p000.FM1
    /* renamed from: i */
    public final boolean mo2594i(int i, KeyEvent keyEvent) {
        Menu menuM18013u = m18013u();
        if (menuM18013u == null) {
            return false;
        }
        menuM18013u.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM18013u.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.FM1
    /* renamed from: j */
    public final boolean mo2595j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2596k();
        }
        return true;
    }

    @Override // p000.FM1
    /* renamed from: k */
    public final boolean mo2596k() {
        return this.f26763a.f27862a.m9870v();
    }

    @Override // p000.FM1
    /* renamed from: n */
    public final void mo2598n(boolean z) {
        int i = z ? 4 : 0;
        C9518gb1 c9518gb1 = this.f26763a;
        c9518gb1.m18585a((i & 4) | (c9518gb1.f27863b & (-5)));
    }

    @Override // p000.FM1
    /* renamed from: o */
    public final void mo2599o() {
        C9518gb1 c9518gb1 = this.f26763a;
        c9518gb1.m18585a(c9518gb1.f27863b & (-9));
    }

    @Override // p000.FM1
    /* renamed from: p */
    public final void mo2600p(Drawable drawable) {
        C9518gb1 c9518gb1 = this.f26763a;
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
    /* renamed from: r */
    public final void mo2602r(CharSequence charSequence) {
        C9518gb1 c9518gb1 = this.f26763a;
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
        C9518gb1 c9518gb1 = this.f26763a;
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

    /* renamed from: u */
    public final Menu m18013u() {
        boolean z = this.f26767e;
        C9518gb1 c9518gb1 = this.f26763a;
        if (!z) {
            C0926Oi c0926Oi = new C0926Oi(13, this);
            C10525oT0 c10525oT0 = new C10525oT0(this);
            Toolbar toolbar = c9518gb1.f27862a;
            toolbar.f15882N = c0926Oi;
            toolbar.f15883O = c10525oT0;
            ActionMenuView actionMenuView = toolbar.f15889a;
            if (actionMenuView != null) {
                actionMenuView.f15847u = c0926Oi;
                actionMenuView.f15848v = c10525oT0;
            }
            this.f26767e = true;
        }
        return c9518gb1.f27862a.getMenu();
    }

    @Override // p000.FM1
    /* renamed from: g */
    public final void mo2592g() {
    }

    @Override // p000.FM1
    /* renamed from: m */
    public final void mo2597m(boolean z) {
    }

    @Override // p000.FM1
    /* renamed from: q */
    public final void mo2601q(boolean z) {
    }
}
