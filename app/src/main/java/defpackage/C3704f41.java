package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: f41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3704f41 extends AbstractC6952s2 implements InterfaceC0069Aq0 {
    public Context d;
    public ActionBarContextView e;
    public VH f;
    public WeakReference g;
    public boolean h;
    public MenuC0225Cq0 i;

    @Override // defpackage.AbstractC6952s2
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.B(this);
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
        return this.i;
    }

    @Override // defpackage.AbstractC6952s2
    public final MenuInflater f() {
        return new C8111y61(this.e.getContext());
    }

    @Override // defpackage.InterfaceC0069Aq0
    public final boolean g(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        return ((C6860rY0) this.f.b).C(this, menuItem);
    }

    @Override // defpackage.AbstractC6952s2
    public final CharSequence h() {
        return this.e.getSubtitle();
    }

    @Override // defpackage.AbstractC6952s2
    public final CharSequence i() {
        return this.e.getTitle();
    }

    @Override // defpackage.AbstractC6952s2
    public final void j() {
        this.f.D(this, this.i);
    }

    @Override // defpackage.InterfaceC0069Aq0
    public final void k(MenuC0225Cq0 menuC0225Cq0) {
        j();
        C6189o2 c6189o2 = this.e.d;
        if (c6189o2 != null) {
            c6189o2.l();
        }
    }

    @Override // defpackage.AbstractC6952s2
    public final boolean l() {
        return this.e.s;
    }

    @Override // defpackage.AbstractC6952s2
    public final void n(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.AbstractC6952s2
    public final void o(int i) {
        p(this.d.getString(i));
    }

    @Override // defpackage.AbstractC6952s2
    public final void p(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC6952s2
    public final void q(int i) {
        r(this.d.getString(i));
    }

    @Override // defpackage.AbstractC6952s2
    public final void r(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC6952s2
    public final void s(boolean z) {
        this.b = z;
        this.e.setTitleOptional(z);
    }
}
