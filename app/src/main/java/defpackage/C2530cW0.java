package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: cW0 */
/* loaded from: classes2.dex */
public final class C2530cW0 extends AbstractC1291Qi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2530cW0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.AbstractC1291Qi
    public final void a(View view, float f) {
        switch (this.a) {
            case 0:
                float fMax = Math.max(f, 0.0f);
                C3596eW0 c3596eW0 = (C3596eW0) this.b;
                c3596eW0.d = fMax;
                if (!c3596eW0.c) {
                    c3596eW0.n(c3596eW0.b, c3596eW0.getReactHeight(), C3596eW0.m(c3596eW0, c3596eW0.d), c3596eW0.e);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC1291Qi
    public final void b(int i, View view) {
        switch (this.a) {
            case 0:
                if (i == 3 || i == 4 || i == 5 || i == 6) {
                    C3596eW0 c3596eW0 = (C3596eW0) this.b;
                    if (i == 3 || i == 4 || i == 6) {
                        c3596eW0.n(c3596eW0.b, c3596eW0.getReactHeight(), c3596eW0.q(i), c3596eW0.e);
                    }
                    c3596eW0.getClass();
                    break;
                }
            default:
                if (i == 4 && C1698Vn1.h(null, view.getRootWindowInsets()).a.o(8)) {
                    view.requestFocus();
                    ((InputMethodManager) ((C6473pW0) this.b).requireContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
        }
    }

    private final void c(View view, float f) {
    }
}
