package defpackage;

import android.view.WindowInsets;

/* renamed from: On1 */
/* loaded from: classes.dex */
public class C1152On1 extends AbstractC1074Nn1 {
    public J80 m;

    public C1152On1(C1698Vn1 c1698Vn1, WindowInsets windowInsets) {
        super(c1698Vn1, windowInsets);
        this.m = null;
    }

    @Override // defpackage.C1464Sn1
    public C1698Vn1 b() {
        return C1698Vn1.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.C1464Sn1
    public C1698Vn1 c() {
        return C1698Vn1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.C1464Sn1
    public final J80 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = J80.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.C1464Sn1
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.C1464Sn1
    public void r(J80 j80) {
        this.m = j80;
    }
}
