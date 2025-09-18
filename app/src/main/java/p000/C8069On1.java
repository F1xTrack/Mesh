package p000;

import android.view.WindowInsets;

/* renamed from: On1 */
/* loaded from: classes.dex */
public class C8069On1 extends AbstractC8017Nn1 {

    /* renamed from: m */
    public J80 f8624m;

    public C8069On1(C8433Vn1 c8433Vn1, WindowInsets windowInsets) {
        super(c8433Vn1, windowInsets);
        this.f8624m = null;
    }

    @Override // p000.C8277Sn1
    /* renamed from: b */
    public C8433Vn1 mo6139b() {
        return C8433Vn1.m8551h(null, this.f8002c.consumeStableInsets());
    }

    @Override // p000.C8277Sn1
    /* renamed from: c */
    public C8433Vn1 mo6140c() {
        return C8433Vn1.m8551h(null, this.f8002c.consumeSystemWindowInsets());
    }

    @Override // p000.C8277Sn1
    /* renamed from: h */
    public final J80 mo6141h() {
        if (this.f8624m == null) {
            WindowInsets windowInsets = this.f8002c;
            this.f8624m = J80.m4201b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f8624m;
    }

    @Override // p000.C8277Sn1
    /* renamed from: m */
    public boolean mo6142m() {
        return this.f8002c.isConsumed();
    }

    @Override // p000.C8277Sn1
    /* renamed from: r */
    public void mo6143r(J80 j80) {
        this.f8624m = j80;
    }
}
