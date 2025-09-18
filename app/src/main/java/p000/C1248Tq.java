package p000;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: Tq */
/* loaded from: classes.dex */
public final class C1248Tq extends AbstractC1259U0 {
    @Override // p000.AbstractC1259U0, p000.InterfaceC7543Ek1
    /* renamed from: T0 */
    public final void mo2373T0(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("index")) {
            ((InterfaceC1311Uq) ((BaseViewManager) ((InterfaceC0798Mg) this.f11615b))).setIndex(view, obj == null ? 0 : ((Double) obj).intValue());
        } else {
            super.mo2373T0(view, str, obj);
        }
    }
}
