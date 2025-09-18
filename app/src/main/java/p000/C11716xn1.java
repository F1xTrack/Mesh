package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: xn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11716xn1 extends AbstractC6798s2 implements InterfaceC7346Aq0 {

    /* renamed from: d */
    public final Context f45791d;

    /* renamed from: e */
    public final MenuC7450Cq0 f45792e;

    /* renamed from: f */
    public C1339VH f45793f;

    /* renamed from: g */
    public WeakReference f45794g;

    /* renamed from: h */
    public final /* synthetic */ C11843yn1 f45795h;

    public C11716xn1(C11843yn1 c11843yn1, Context context, C1339VH c1339vh) {
        this.f45795h = c11843yn1;
        this.f45791d = context;
        this.f45793f = c1339vh;
        MenuC7450Cq0 menuC7450Cq0 = new MenuC7450Cq0(context);
        menuC7450Cq0.f1713l = 1;
        this.f45792e = menuC7450Cq0;
        menuC7450Cq0.f1706e = this;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: b */
    public final void mo18163b() {
        C11843yn1 c11843yn1 = this.f45795h;
        if (c11843yn1.f46469i != this) {
            return;
        }
        if (c11843yn1.f46476p) {
            c11843yn1.f46470j = this;
            c11843yn1.f46471k = this.f45793f;
        } else {
            this.f45793f.m8359B(this);
        }
        this.f45793f = null;
        c11843yn1.m26251u(false);
        ActionBarContextView actionBarContextView = c11843yn1.f46466f;
        if (actionBarContextView.f15800k == null) {
            actionBarContextView.m9835e();
        }
        c11843yn1.f46463c.setHideOnContentScrollEnabled(c11843yn1.f46481u);
        c11843yn1.f46469i = null;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: c */
    public final View mo18164c() {
        WeakReference weakReference = this.f45794g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: e */
    public final MenuC7450Cq0 mo18165e() {
        return this.f45792e;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: f */
    public final MenuInflater mo18166f() {
        return new C11757y61(this.f45791d);
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public final boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        C1339VH c1339vh = this.f45793f;
        if (c1339vh != null) {
            return ((C10919rY0) c1339vh.f12486b).m24404C(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: h */
    public final CharSequence mo18167h() {
        return this.f45795h.f46466f.getSubtitle();
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: i */
    public final CharSequence mo18168i() {
        return this.f45795h.f46466f.getTitle();
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: j */
    public final void mo18169j() {
        if (this.f45795h.f46469i != this) {
            return;
        }
        MenuC7450Cq0 menuC7450Cq0 = this.f45792e;
        menuC7450Cq0.m1424w();
        try {
            this.f45793f.m8360D(this, menuC7450Cq0);
        } finally {
            menuC7450Cq0.m1423v();
        }
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    public final void mo347k(MenuC7450Cq0 menuC7450Cq0) {
        if (this.f45793f == null) {
            return;
        }
        mo18169j();
        C6527o2 c6527o2 = this.f45795h.f46466f.f15793d;
        if (c6527o2 != null) {
            c6527o2.m23313l();
        }
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: l */
    public final boolean mo18170l() {
        return this.f45795h.f46466f.f15808s;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: n */
    public final void mo18171n(View view) {
        this.f45795h.f46466f.setCustomView(view);
        this.f45794g = new WeakReference(view);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: o */
    public final void mo18172o(int i) {
        mo18173p(this.f45795h.f46461a.getResources().getString(i));
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: p */
    public final void mo18173p(CharSequence charSequence) {
        this.f45795h.f46466f.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: q */
    public final void mo18174q(int i) {
        mo18175r(this.f45795h.f46461a.getResources().getString(i));
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: r */
    public final void mo18175r(CharSequence charSequence) {
        this.f45795h.f46466f.setTitle(charSequence);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: s */
    public final void mo18176s(boolean z) {
        this.f42205b = z;
        this.f45795h.f46466f.setTitleOptional(z);
    }
}
