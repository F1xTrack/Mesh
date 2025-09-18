package p000;

import android.view.View;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;

/* renamed from: oW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10531oW0 extends AbstractC1052Qi {

    /* renamed from: a */
    public int f39064a;

    /* renamed from: b */
    public final /* synthetic */ C10659pW0 f39065b;

    public C10531oW0(C10659pW0 c10659pW0) {
        this.f39065b = c10659pW0;
        this.f39064a = AbstractC9244eS1.m17994d(c10659pW0.mo13727h().getSheetInitialDetentIndex(), c10659pW0.mo13727h().getSheetDetents().size());
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: b */
    public final void mo6008b(int i, View view) {
        DimmingFragment dimmingFragment;
        boolean z = i == 3 || i == 4 || i == 5 || i == 6;
        C10659pW0 c10659pW0 = this.f39065b;
        if (z) {
            this.f39064a = i;
            RV0 rv0Mo13727h = c10659pW0.mo13727h();
            int iM17992b = AbstractC9244eS1.m17992b(this.f39064a, c10659pW0.mo13727h().getSheetDetents().size());
            int iM6093d = OZ1.m6093d(rv0Mo13727h.f10219a);
            InterfaceC6947uP reactEventDispatcher = rv0Mo13727h.getReactEventDispatcher();
            if (reactEventDispatcher != null) {
                reactEventDispatcher.mo11046g(new C11232u01(iM6093d, rv0Mo13727h.getId(), iM17992b, true));
            }
        } else if (i == 1) {
            RV0 rv0Mo13727h2 = c10659pW0.mo13727h();
            int iM17992b2 = AbstractC9244eS1.m17992b(this.f39064a, c10659pW0.mo13727h().getSheetDetents().size());
            int iM6093d2 = OZ1.m6093d(rv0Mo13727h2.f10219a);
            InterfaceC6947uP reactEventDispatcher2 = rv0Mo13727h2.getReactEventDispatcher();
            if (reactEventDispatcher2 != null) {
                reactEventDispatcher2.mo11046g(new C11232u01(iM6093d2, rv0Mo13727h2.getId(), iM17992b2, false));
            }
        }
        if (i != 5 || (dimmingFragment = c10659pW0.f40129h) == null) {
            return;
        }
        dimmingFragment.m13731r();
    }

    @Override // p000.AbstractC1052Qi
    /* renamed from: a */
    public final void mo6007a(View view, float f) {
    }
}
