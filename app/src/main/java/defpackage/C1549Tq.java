package defpackage;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: Tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549Tq extends U0 {
    @Override // defpackage.U0, defpackage.InterfaceC0364Ek1
    public final void T0(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("index")) {
            ((InterfaceC1627Uq) ((BaseViewManager) ((InterfaceC0973Mg) this.b))).setIndex(view, obj == null ? 0 : ((Double) obj).intValue());
        } else {
            super.T0(view, str, obj);
        }
    }
}
