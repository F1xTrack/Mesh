package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: v61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7541v61 extends ActionMode {
    public final Context a;
    public final AbstractC6952s2 b;

    public C7541v61(Context context, AbstractC6952s2 abstractC6952s2) {
        this.a = context;
        this.b = abstractC6952s2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC2403br0(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.n(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.q(i);
    }
}
