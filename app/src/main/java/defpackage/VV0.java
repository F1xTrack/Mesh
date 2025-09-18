package defpackage;

import com.facebook.react.views.view.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class VV0 extends a {
    public UV0 a;

    public final UV0 getDelegate$react_native_screens_release() {
        return this.a;
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BottomSheetBehavior<RV0> sheetBehavior;
        UV0 uv0 = this.a;
        if (uv0 != null) {
            RV0 rv0 = (RV0) uv0;
            int i5 = i4 - i2;
            if (rv0.p.size() != 1 || ((Number) AbstractC8069xu.A(rv0.p)).doubleValue() != -1.0d || (sheetBehavior = rv0.getSheetBehavior()) == null || sheetBehavior.l == i5) {
                return;
            }
            sheetBehavior.l = i5;
        }
    }

    public final void setDelegate$react_native_screens_release(UV0 uv0) {
        this.a = uv0;
    }
}
