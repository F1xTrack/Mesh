package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class Z6 implements InterfaceC3711f7, DialogInterface.OnClickListener {
    public J3 a;
    public C2073a7 b;
    public CharSequence c;
    public final /* synthetic */ C3902g7 d;

    public Z6(C3902g7 c3902g7) {
        this.d = c3902g7;
    }

    @Override // defpackage.InterfaceC3711f7
    public final boolean a() {
        J3 j3 = this.a;
        if (j3 != null) {
            return j3.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC3711f7
    public final int c() {
        return 0;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void dismiss() {
        J3 j3 = this.a;
        if (j3 != null) {
            j3.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.InterfaceC3711f7
    public final CharSequence e() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3711f7
    public final Drawable f() {
        return null;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void l(int i, int i2) {
        if (this.b == null) {
            return;
        }
        C3902g7 c3902g7 = this.d;
        I3 i3 = new I3(c3902g7.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i3.setTitle(charSequence);
        }
        C2073a7 c2073a7 = this.b;
        int selectedItemPosition = c3902g7.getSelectedItemPosition();
        E3 e3 = i3.a;
        e3.p = c2073a7;
        e3.q = this;
        e3.t = selectedItemPosition;
        e3.s = true;
        J3 j3Create = i3.create();
        this.a = j3Create;
        AlertController$RecycleListView alertController$RecycleListView = j3Create.f.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.InterfaceC3711f7
    public final int m() {
        return 0;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void o(ListAdapter listAdapter) {
        this.b = (C2073a7) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3902g7 c3902g7 = this.d;
        c3902g7.setSelection(i);
        if (c3902g7.getOnItemClickListener() != null) {
            c3902g7.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.InterfaceC3711f7
    public final void d(int i) {
    }

    @Override // defpackage.InterfaceC3711f7
    public final void h(Drawable drawable) {
    }

    @Override // defpackage.InterfaceC3711f7
    public final void i(int i) {
    }

    @Override // defpackage.InterfaceC3711f7
    public final void k(int i) {
    }
}
