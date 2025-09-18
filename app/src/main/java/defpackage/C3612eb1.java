package defpackage;

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
public final class C3612eb1 extends FM1 {
    public final C3994gb1 a;
    public final B6 b;
    public final C6845rT0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final RunnableC6133nk0 h = new RunnableC6133nk0(11, this);

    public C3612eb1(Toolbar toolbar, CharSequence charSequence, B6 b6) {
        GQ0 gq0 = new GQ0(4, this);
        toolbar.getClass();
        C3994gb1 c3994gb1 = new C3994gb1(toolbar, false);
        this.a = c3994gb1;
        b6.getClass();
        this.b = b6;
        c3994gb1.k = b6;
        toolbar.setOnMenuItemClickListener(gq0);
        if (!c3994gb1.g) {
            c3994gb1.h = charSequence;
            if ((c3994gb1.b & 8) != 0) {
                Toolbar toolbar2 = c3994gb1.a;
                toolbar2.setTitle(charSequence);
                if (c3994gb1.g) {
                    AbstractC6897rk1.o(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.c = new C6845rT0(this);
    }

    @Override // defpackage.FM1
    public final boolean a() {
        C6189o2 c6189o2;
        ActionMenuView actionMenuView = this.a.a.a;
        return (actionMenuView == null || (c6189o2 = actionMenuView.t) == null || !c6189o2.b()) ? false : true;
    }

    @Override // defpackage.FM1
    public final boolean b() {
        C0849Kq0 c0849Kq0;
        C2165ab1 c2165ab1 = this.a.a.M;
        if (c2165ab1 == null || (c0849Kq0 = c2165ab1.b) == null) {
            return false;
        }
        if (c2165ab1 == null) {
            c0849Kq0 = null;
        }
        if (c0849Kq0 == null) {
            return true;
        }
        c0849Kq0.collapseActionView();
        return true;
    }

    @Override // defpackage.FM1
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.FM1
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.FM1
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.FM1
    public final boolean f() {
        C3994gb1 c3994gb1 = this.a;
        Toolbar toolbar = c3994gb1.a;
        RunnableC6133nk0 runnableC6133nk0 = this.h;
        toolbar.removeCallbacks(runnableC6133nk0);
        Toolbar toolbar2 = c3994gb1.a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        toolbar2.postOnAnimation(runnableC6133nk0);
        return true;
    }

    @Override // defpackage.FM1
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.FM1
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuU = u();
        if (menuU == null) {
            return false;
        }
        menuU.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuU.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.FM1
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.FM1
    public final boolean k() {
        return this.a.a.v();
    }

    @Override // defpackage.FM1
    public final void n(boolean z) {
        int i = z ? 4 : 0;
        C3994gb1 c3994gb1 = this.a;
        c3994gb1.a((i & 4) | (c3994gb1.b & (-5)));
    }

    @Override // defpackage.FM1
    public final void o() {
        C3994gb1 c3994gb1 = this.a;
        c3994gb1.a(c3994gb1.b & (-9));
    }

    @Override // defpackage.FM1
    public final void p(Drawable drawable) {
        C3994gb1 c3994gb1 = this.a;
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
    public final void r(CharSequence charSequence) {
        C3994gb1 c3994gb1 = this.a;
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
        C3994gb1 c3994gb1 = this.a;
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

    public final Menu u() {
        boolean z = this.e;
        C3994gb1 c3994gb1 = this.a;
        if (!z) {
            C1135Oi c1135Oi = new C1135Oi(13, this);
            C6273oT0 c6273oT0 = new C6273oT0(this);
            Toolbar toolbar = c3994gb1.a;
            toolbar.N = c1135Oi;
            toolbar.O = c6273oT0;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.u = c1135Oi;
                actionMenuView.v = c6273oT0;
            }
            this.e = true;
        }
        return c3994gb1.a.getMenu();
    }

    @Override // defpackage.FM1
    public final void g() {
    }

    @Override // defpackage.FM1
    public final void m(boolean z) {
    }

    @Override // defpackage.FM1
    public final void q(boolean z) {
    }
}
