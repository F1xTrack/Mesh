package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import p000.AbstractActivityC0499Hv;
import p000.AbstractC0705LB;
import p000.B70;
import p000.C1225TT;
import p000.EnumC7382Bi0;
import p000.F71;
import p000.InterfaceC7746Ii0;
import p000.InterfaceC7902Li0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m22267d2 = {"Landroidx/activity/ImmLeaksCleaner;", "LIi0;", "B70", "C70", "D70", "activity_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC7746Ii0 {

    /* renamed from: b */
    public static final F71 f15736b = AbstractC0705LB.m4915b(C1225TT.f11383s);

    /* renamed from: a */
    public final AbstractActivityC0499Hv f15737a;

    public ImmLeaksCleaner(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        this.f15737a = abstractActivityC0499Hv;
    }

    @Override // p000.InterfaceC7746Ii0
    /* renamed from: f */
    public final void mo2792f(InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0) {
        if (enumC7382Bi0 != EnumC7382Bi0.ON_DESTROY) {
            return;
        }
        Object systemService = this.f15737a.getSystemService("input_method");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        B70 b70 = (B70) f15736b.getValue();
        Object objMo508b = b70.mo508b(inputMethodManager);
        if (objMo508b == null) {
            return;
        }
        synchronized (objMo508b) {
            View viewMo509c = b70.mo509c(inputMethodManager);
            if (viewMo509c == null) {
                return;
            }
            if (viewMo509c.isAttachedToWindow()) {
                return;
            }
            boolean zMo507a = b70.mo507a(inputMethodManager);
            if (zMo507a) {
                inputMethodManager.isActive();
            }
        }
    }
}
