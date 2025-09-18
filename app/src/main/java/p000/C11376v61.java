package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: v61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11376v61 extends ActionMode {

    /* renamed from: a */
    public final Context f44160a;

    /* renamed from: b */
    public final AbstractC6798s2 f44161b;

    public C11376v61(Context context, AbstractC6798s2 abstractC6798s2) {
        this.f44160a = context;
        this.f44161b = abstractC6798s2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f44161b.mo18163b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f44161b.mo18164c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC8904br0(this.f44160a, this.f44161b.mo18165e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f44161b.mo18166f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f44161b.mo18167h();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f44161b.f42206c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f44161b.mo18168i();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f44161b.f42205b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f44161b.mo18169j();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f44161b.mo18170l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f44161b.mo18171n(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f44161b.mo18173p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f44161b.f42206c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f44161b.mo18175r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f44161b.mo18176s(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f44161b.mo18172o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f44161b.mo18174q(i);
    }
}
