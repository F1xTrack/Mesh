package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: Rn1 */
/* loaded from: classes.dex */
public final class C1386Rn1 extends C1308Qn1 {
    public static final C1698Vn1 q = C1698Vn1.h(null, WindowInsets.CONSUMED);

    public C1386Rn1(C1698Vn1 c1698Vn1, WindowInsets windowInsets) {
        super(c1698Vn1, windowInsets);
    }

    @Override // defpackage.AbstractC1074Nn1, defpackage.C1464Sn1
    public J80 f(int i) {
        return J80.c(this.c.getInsets(AbstractC1620Un1.a(i)));
    }

    @Override // defpackage.AbstractC1074Nn1, defpackage.C1464Sn1
    public boolean o(int i) {
        return this.c.isVisible(AbstractC1620Un1.a(i));
    }

    @Override // defpackage.AbstractC1074Nn1, defpackage.C1464Sn1
    public final void d(View view) {
    }
}
