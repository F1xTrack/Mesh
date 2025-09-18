package defpackage;

import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public final class FW0 implements InterfaceC0324Dx0 {
    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) {
        O90.f(view, "v");
        C1698Vn1 c1698Vn1I = AbstractC6897rk1.i(view, c1698Vn1);
        O90.e(c1698Vn1I, "onApplyWindowInsets(...)");
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            C1698Vn1 c1698Vn1F = c1698Vn1I.f(c1698Vn1I.b(), 0, c1698Vn1I.c(), c1698Vn1I.a());
            O90.e(c1698Vn1F, "replaceSystemWindowInsets(...)");
            return c1698Vn1F;
        }
        J80 j80F = c1698Vn1I.a.f(1);
        O90.e(j80F, "getInsets(...)");
        AbstractC0996Mn1 c0919Ln1 = i >= 30 ? new C0919Ln1() : i >= 29 ? new C0841Kn1() : new C0763Jn1();
        c0919Ln1.c(1, J80.b(j80F.a, 0, j80F.c, j80F.d));
        C1698Vn1 c1698Vn1B = c0919Ln1.b();
        O90.e(c1698Vn1B, "build(...)");
        return c1698Vn1B;
    }
}
