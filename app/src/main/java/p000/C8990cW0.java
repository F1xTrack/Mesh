package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: cW0 */
/* loaded from: classes2.dex */
public final class C8990cW0 extends AbstractC1052Qi {

    /* renamed from: a */
    public final /* synthetic */ int f17580a;

    /* renamed from: b */
    public final /* synthetic */ Object f17581b;

    public /* synthetic */ C8990cW0(int i, Object obj) {
        this.f17580a = i;
        this.f17581b = obj;
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: a */
    public final void mo6007a(View view, float f) {
        switch (this.f17580a) {
            case 0:
                float fMax = Math.max(f, 0.0f);
                C9251eW0 c9251eW0 = (C9251eW0) this.f17581b;
                c9251eW0.f26732d = fMax;
                if (!c9251eW0.f26731c) {
                    c9251eW0.m18001n(c9251eW0.f26730b, c9251eW0.getReactHeight(), C9251eW0.m18000m(c9251eW0, c9251eW0.f26732d), c9251eW0.f26733e);
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: b */
    public final void mo6008b(int i, View view) {
        switch (this.f17580a) {
            case 0:
                if (i == 3 || i == 4 || i == 5 || i == 6) {
                    C9251eW0 c9251eW0 = (C9251eW0) this.f17581b;
                    if (i == 3 || i == 4 || i == 6) {
                        c9251eW0.m18001n(c9251eW0.f26730b, c9251eW0.getReactHeight(), c9251eW0.m18004q(i), c9251eW0.f26733e);
                    }
                    c9251eW0.getClass();
                    break;
                }
            default:
                if (i == 4 && C8433Vn1.m8551h(null, view.getRootWindowInsets()).f12756a.mo5841o(8)) {
                    view.requestFocus();
                    ((InputMethodManager) ((C10659pW0) this.f17581b).requireContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
        }
    }

    /* renamed from: c */
    private final void m10753c(View view, float f) {
    }
}
