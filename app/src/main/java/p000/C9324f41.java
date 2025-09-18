package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: f41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9324f41 extends AbstractC6798s2 implements InterfaceC7346Aq0 {

    /* renamed from: d */
    public Context f27041d;

    /* renamed from: e */
    public ActionBarContextView f27042e;

    /* renamed from: f */
    public C1339VH f27043f;

    /* renamed from: g */
    public WeakReference f27044g;

    /* renamed from: h */
    public boolean f27045h;

    /* renamed from: i */
    public MenuC7450Cq0 f27046i;

    @Override // p000.AbstractC6798s2
    /* renamed from: b */
    public final void mo18163b() {
        if (this.f27045h) {
            return;
        }
        this.f27045h = true;
        this.f27043f.m8359B(this);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: c */
    public final View mo18164c() {
        WeakReference weakReference = this.f27044g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: e */
    public final MenuC7450Cq0 mo18165e() {
        return this.f27046i;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: f */
    public final MenuInflater mo18166f() {
        return new C11757y61(this.f27042e.getContext());
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: g */
    public final boolean mo346g(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        return ((C10919rY0) this.f27043f.f12486b).m24404C(this, menuItem);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: h */
    public final CharSequence mo18167h() {
        return this.f27042e.getSubtitle();
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: i */
    public final CharSequence mo18168i() {
        return this.f27042e.getTitle();
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: j */
    public final void mo18169j() {
        this.f27043f.m8360D(this, this.f27046i);
    }

    @Override // p000.InterfaceC7346Aq0
    /* renamed from: k */
    public final void mo347k(MenuC7450Cq0 menuC7450Cq0) {
        mo18169j();
        C6527o2 c6527o2 = this.f27042e.f15793d;
        if (c6527o2 != null) {
            c6527o2.m23313l();
        }
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: l */
    public final boolean mo18170l() {
        return this.f27042e.f15808s;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: n */
    public final void mo18171n(View view) {
        this.f27042e.setCustomView(view);
        this.f27044g = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: o */
    public final void mo18172o(int i) {
        mo18173p(this.f27041d.getString(i));
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: p */
    public final void mo18173p(CharSequence charSequence) {
        this.f27042e.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: q */
    public final void mo18174q(int i) {
        mo18175r(this.f27041d.getString(i));
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: r */
    public final void mo18175r(CharSequence charSequence) {
        this.f27042e.setTitle(charSequence);
    }

    @Override // p000.AbstractC6798s2
    /* renamed from: s */
    public final void mo18176s(boolean z) {
        this.f42205b = z;
        this.f27042e.setTitleOptional(z);
    }
}
