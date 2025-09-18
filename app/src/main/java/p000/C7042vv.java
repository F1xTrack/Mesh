package p000;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;

/* renamed from: vv */
/* loaded from: classes.dex */
public final /* synthetic */ class C7042vv implements InterfaceC10017kV0 {

    /* renamed from: a */
    public final /* synthetic */ int f44601a;

    /* renamed from: b */
    public final /* synthetic */ Object f44602b;

    public /* synthetic */ C7042vv(int i, Object obj) {
        this.f44601a = i;
        this.f44602b = obj;
    }

    @Override // p000.InterfaceC10017kV0
    /* renamed from: a */
    public final Bundle mo18401a() {
        switch (this.f44601a) {
            case 0:
                return AbstractActivityC0499Hv.m3648d((AbstractActivityC0499Hv) this.f44602b);
            case 1:
                AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) this.f44602b;
                while (AbstractActivityC1730l.m10033f(abstractActivityC1730l.m10034e())) {
                }
                abstractActivityC1730l.f16193b.m10126e(EnumC7382Bi0.ON_STOP);
                return new Bundle();
            case 2:
                return ((AbstractC1733o) this.f44602b).m10056V();
            default:
                return C9505gV0.m18574a((C9505gV0) this.f44602b);
        }
    }
}
