package p000;

import android.view.View;

/* renamed from: ho0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9671ho0 implements InterfaceC7516Dx0 {

    /* renamed from: a */
    public final /* synthetic */ int f28603a;

    /* renamed from: b */
    public final /* synthetic */ View f28604b;

    /* renamed from: c */
    public final /* synthetic */ int f28605c;

    public C9671ho0(View view, int i, int i2) {
        this.f28603a = i;
        this.f28604b = view;
        this.f28605c = i2;
    }

    @Override // p000.InterfaceC7516Dx0
    /* renamed from: k */
    public final C8433Vn1 mo1953k(View view, C8433Vn1 c8433Vn1) {
        int i = c8433Vn1.f12756a.mo5837f(7).f5353b;
        View view2 = this.f28604b;
        int i2 = this.f28603a;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f28605c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c8433Vn1;
    }
}
