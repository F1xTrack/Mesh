package p000;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class ZJ0 extends C11782yJ0 {

    /* renamed from: x */
    public final /* synthetic */ C9099dK0 f14851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZJ0(C9099dK0 c9099dK0, C9099dK0 c9099dK02, boolean z, int i) {
        super(i, c9099dK02, z);
        this.f14851x = c9099dK0;
    }

    @Override // p000.C11782yJ0, p000.C0002A1
    /* renamed from: g */
    public final boolean mo14g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo14g(view, i, bundle);
        }
        C9099dK0 c9099dK0 = this.f14851x;
        int length = c9099dK0.getText().length();
        if (length > 0) {
            c9099dK0.setSelection(length);
        }
        return c9099dK0.m17539h();
    }
}
