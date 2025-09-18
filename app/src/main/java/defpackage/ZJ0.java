package defpackage;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class ZJ0 extends C8149yJ0 {
    public final /* synthetic */ C3370dK0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZJ0(C3370dK0 c3370dK0, C3370dK0 c3370dK02, boolean z, int i) {
        super(i, c3370dK02, z);
        this.x = c3370dK0;
    }

    @Override // defpackage.C8149yJ0, defpackage.A1
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        C3370dK0 c3370dK0 = this.x;
        int length = c3370dK0.getText().length();
        if (length > 0) {
            c3370dK0.setSelection(length);
        }
        return c3370dK0.h();
    }
}
