package p000;

import com.facebook.react.views.view.C1932a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class VV0 extends C1932a {

    /* renamed from: a */
    public UV0 f12595a;

    public final UV0 getDelegate$react_native_screens_release() {
        return this.f12595a;
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BottomSheetBehavior<RV0> sheetBehavior;
        UV0 uv0 = this.f12595a;
        if (uv0 != null) {
            RV0 rv0 = (RV0) uv0;
            int i5 = i4 - i2;
            if (rv0.f10234p.size() != 1 || ((Number) AbstractC7167xu.m25955A(rv0.f10234p)).doubleValue() != -1.0d || (sheetBehavior = rv0.getSheetBehavior()) == null || sheetBehavior.f18131l == i5) {
                return;
            }
            sheetBehavior.f18131l = i5;
        }
    }

    public final void setDelegate$react_native_screens_release(UV0 uv0) {
        this.f12595a = uv0;
    }
}
