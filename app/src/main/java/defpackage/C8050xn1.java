package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: xn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8050xn1 extends AbstractC6952s2 implements InterfaceC0069Aq0 {
    public final Context d;
    public final MenuC0225Cq0 e;
    public VH f;
    public WeakReference g;
    public final /* synthetic */ C8240yn1 h;

    public C8050xn1(C8240yn1 c8240yn1, Context context, VH vh) {
        this.h = c8240yn1;
        this.d = context;
        this.f = vh;
        MenuC0225Cq0 menuC0225Cq0 = new MenuC0225Cq0(context);
        menuC0225Cq0.l = 1;
        this.e = menuC0225Cq0;
        menuC0225Cq0.e = this;
    }

    @Override // defpackage.AbstractC6952s2
    public final void b() {
        C8240yn1 c8240yn1 = this.h;
        if (c8240yn1.i != this) {
            return;
        }
        if (c8240yn1.p) {
            c8240yn1.j = this;
            c8240yn1.k = this.f;
        } else {
            this.f.B(this);
        }
        this.f = null;
        c8240yn1.u(false);
        ActionBarContextView actionBarContextView = c8240yn1.f;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        c8240yn1.c.setHideOnContentScrollEnabled(c8240yn1.u);
        c8240yn1.i = null;
    }

    @Override // defpackage.AbstractC6952s2
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC6952s2
    public final MenuC0225Cq0 e() {
        return this.e;
    }

    @Override // defpackage.AbstractC6952s2
    public final MenuInflater f() {
        return new C8111y61(this.d);
    }

    @Override // defpackage.InterfaceC0069Aq0
    public final boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        VH vh = this.f;
        if (vh != null) {
            return ((C6860rY0) vh.b).C(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.AbstractC6952s2
    public final CharSequence h() {
        return this.h.f.getSubtitle();
    }

    @Override // defpackage.AbstractC6952s2
    public final CharSequence i() {
        return this.h.f.getTitle();
    }

    @Override // defpackage.AbstractC6952s2
    public final void j() {
        if (this.h.i != this) {
            return;
        }
        MenuC0225Cq0 menuC0225Cq0 = this.e;
        menuC0225Cq0.w();
        try {
            this.f.D(this, menuC0225Cq0);
        } finally {
            menuC0225Cq0.v();
        }
    }

    @Override // defpackage.InterfaceC0069Aq0
    public final void k(MenuC0225Cq0 menuC0225Cq0) {
        if (this.f == null) {
            return;
        }
        j();
        C6189o2 c6189o2 = this.h.f.d;
        if (c6189o2 != null) {
            c6189o2.l();
        }
    }

    @Override // defpackage.AbstractC6952s2
    public final boolean l() {
        return this.h.f.s;
    }

    @Override // defpackage.AbstractC6952s2
    public final void n(View view) {
        this.h.f.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.AbstractC6952s2
    public final void o(int i) {
        p(this.h.a.getResources().getString(i));
    }

    @Override // defpackage.AbstractC6952s2
    public final void p(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC6952s2
    public final void q(int i) {
        r(this.h.a.getResources().getString(i));
    }

    @Override // defpackage.AbstractC6952s2
    public final void r(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC6952s2
    public final void s(boolean z) {
        this.b = z;
        this.h.f.setTitleOptional(z);
    }
}
