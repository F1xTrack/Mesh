package defpackage;

import android.view.View;

/* renamed from: ho0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4223ho0 implements InterfaceC0324Dx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;

    public C4223ho0(View view, int i, int i2) {
        this.a = i;
        this.b = view;
        this.c = i2;
    }

    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) {
        int i = c1698Vn1.a.f(7).b;
        View view2 = this.b;
        int i2 = this.a;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c1698Vn1;
    }
}
