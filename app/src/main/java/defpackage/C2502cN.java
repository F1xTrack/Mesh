package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;

/* renamed from: cN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2502cN implements InterfaceC0324Dx0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2502cN(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0324Dx0
    public final C1698Vn1 k(View view, C1698Vn1 c1698Vn1) {
        switch (this.a) {
            case 0:
                C3378dN c3378dN = (C3378dN) this.b;
                O90.f(c3378dN, "this$0");
                O90.f(view, "v");
                ViewGroup viewGroupB = AbstractC7404uO1.b(c3378dN.a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                boolean z = c3378dN.f;
                boolean z2 = true;
                boolean z3 = !z || c3378dN.b;
                if (z && !c3378dN.c) {
                    z2 = false;
                }
                C1464Sn1 c1464Sn1 = c1698Vn1.a;
                J80 j80F = c1464Sn1.f(2);
                O90.e(j80F, "getInsets(...)");
                J80 j80F2 = c1464Sn1.f(7);
                O90.e(j80F2, "getInsets(...)");
                layoutParams.setMargins(j80F.a, z3 ? 0 : j80F2.b, j80F.c, z2 ? 0 : j80F.d);
                if (viewGroupB != null) {
                    viewGroupB.setLayoutParams(layoutParams);
                }
                C1698Vn1 c1698Vn1I = AbstractC6897rk1.i(view, c1698Vn1);
                O90.e(c1698Vn1I, "onApplyWindowInsets(...)");
                return c1698Vn1I.f(c1698Vn1I.b(), c3378dN.b ? 0 : c1698Vn1I.d(), c1698Vn1I.c(), c1698Vn1I.a());
            default:
                return ((WindowsInsetsManager) this.b).onApplyWindowInsetsListener(view, c1698Vn1);
        }
    }
}
