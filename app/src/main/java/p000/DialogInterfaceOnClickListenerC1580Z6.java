package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: Z6 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1580Z6 implements InterfaceC4033f7, DialogInterface.OnClickListener {

    /* renamed from: a */
    public DialogInterfaceC0571J3 f14720a;

    /* renamed from: b */
    public C1644a7 f14721b;

    /* renamed from: c */
    public CharSequence f14722c;

    /* renamed from: d */
    public final /* synthetic */ C4096g7 f14723d;

    public DialogInterfaceOnClickListenerC1580Z6(C4096g7 c4096g7) {
        this.f14723d = c4096g7;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: a */
    public final boolean mo9475a() {
        DialogInterfaceC0571J3 dialogInterfaceC0571J3 = this.f14720a;
        if (dialogInterfaceC0571J3 != null) {
            return dialogInterfaceC0571J3.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: c */
    public final int mo9476c() {
        return 0;
    }

    @Override // p000.InterfaceC4033f7
    public final void dismiss() {
        DialogInterfaceC0571J3 dialogInterfaceC0571J3 = this.f14720a;
        if (dialogInterfaceC0571J3 != null) {
            dialogInterfaceC0571J3.dismiss();
            this.f14720a = null;
        }
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: e */
    public final CharSequence mo9478e() {
        return this.f14722c;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: f */
    public final Drawable mo9479f() {
        return null;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: g */
    public final void mo9480g(CharSequence charSequence) {
        this.f14722c = charSequence;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: l */
    public final void mo9484l(int i, int i2) {
        if (this.f14721b == null) {
            return;
        }
        C4096g7 c4096g7 = this.f14723d;
        C0508I3 c0508i3 = new C0508I3(c4096g7.getPopupContext());
        CharSequence charSequence = this.f14722c;
        if (charSequence != null) {
            c0508i3.setTitle(charSequence);
        }
        C1644a7 c1644a7 = this.f14721b;
        int selectedItemPosition = c4096g7.getSelectedItemPosition();
        C0256E3 c0256e3 = c0508i3.f4670a;
        c0256e3.f2387p = c1644a7;
        c0256e3.f2388q = this;
        c0256e3.f2391t = selectedItemPosition;
        c0256e3.f2390s = true;
        DialogInterfaceC0571J3 dialogInterfaceC0571J3Create = c0508i3.create();
        this.f14720a = dialogInterfaceC0571J3Create;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0571J3Create.f5292f.f4008f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f14720a.show();
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: m */
    public final int mo9485m() {
        return 0;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: o */
    public final void mo3567o(ListAdapter listAdapter) {
        this.f14721b = (C1644a7) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4096g7 c4096g7 = this.f14723d;
        c4096g7.setSelection(i);
        if (c4096g7.getOnItemClickListener() != null) {
            c4096g7.performItemClick(null, i, this.f14721b.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: d */
    public final void mo9477d(int i) {
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: h */
    public final void mo9481h(Drawable drawable) {
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: i */
    public final void mo9482i(int i) {
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: k */
    public final void mo9483k(int i) {
    }
}
