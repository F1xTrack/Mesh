package p000;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: Rn1 */
/* loaded from: classes.dex */
public final class C8225Rn1 extends C8173Qn1 {

    /* renamed from: q */
    public static final C8433Vn1 f10423q = C8433Vn1.m8551h(null, WindowInsets.CONSUMED);

    public C8225Rn1(C8433Vn1 c8433Vn1, WindowInsets windowInsets) {
        super(c8433Vn1, windowInsets);
    }

    @Override // p000.AbstractC8017Nn1, p000.C8277Sn1
    /* renamed from: f */
    public J80 mo5837f(int i) {
        return J80.m4202c(this.f8002c.getInsets(AbstractC8381Un1.m8152a(i)));
    }

    @Override // p000.AbstractC8017Nn1, p000.C8277Sn1
    /* renamed from: o */
    public boolean mo5841o(int i) {
        return this.f8002c.isVisible(AbstractC8381Un1.m8152a(i));
    }

    @Override // p000.AbstractC8017Nn1, p000.C8277Sn1
    /* renamed from: d */
    public final void mo5836d(View view) {
    }
}
