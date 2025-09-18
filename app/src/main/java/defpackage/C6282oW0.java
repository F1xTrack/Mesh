package defpackage;

import android.view.View;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;

/* renamed from: oW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6282oW0 extends AbstractC1291Qi {
    public int a;
    public final /* synthetic */ C6473pW0 b;

    public C6282oW0(C6473pW0 c6473pW0) {
        this.b = c6473pW0;
        this.a = AbstractC3585eS1.d(c6473pW0.h().getSheetInitialDetentIndex(), c6473pW0.h().getSheetDetents().size());
    }

    @Override // defpackage.AbstractC1291Qi
    public final void b(int i, View view) {
        DimmingFragment dimmingFragment;
        boolean z = i == 3 || i == 4 || i == 5 || i == 6;
        C6473pW0 c6473pW0 = this.b;
        if (z) {
            this.a = i;
            RV0 rv0H = c6473pW0.h();
            int iB = AbstractC3585eS1.b(this.a, c6473pW0.h().getSheetDetents().size());
            int iD = OZ1.d(rv0H.a);
            InterfaceC7405uP reactEventDispatcher = rv0H.getReactEventDispatcher();
            if (reactEventDispatcher != null) {
                reactEventDispatcher.g(new C7328u01(iD, rv0H.getId(), iB, true));
            }
        } else if (i == 1) {
            RV0 rv0H2 = c6473pW0.h();
            int iB2 = AbstractC3585eS1.b(this.a, c6473pW0.h().getSheetDetents().size());
            int iD2 = OZ1.d(rv0H2.a);
            InterfaceC7405uP reactEventDispatcher2 = rv0H2.getReactEventDispatcher();
            if (reactEventDispatcher2 != null) {
                reactEventDispatcher2.g(new C7328u01(iD2, rv0H2.getId(), iB2, false));
            }
        }
        if (i != 5 || (dimmingFragment = c6473pW0.h) == null) {
            return;
        }
        dimmingFragment.r();
    }

    @Override // defpackage.AbstractC1291Qi
    public final void a(View view, float f) {
    }
}
