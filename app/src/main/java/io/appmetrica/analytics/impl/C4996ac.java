package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ac */
/* loaded from: classes2.dex */
public final class C4996ac implements InterfaceC5488u4, InterfaceC5164h5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5488u4
    /* renamed from: a */
    public final InterfaceC5463t4 mo19283a(Context context, C5289m5 c5289m5, C5088e4 c5088e4, C4436D4 c4436d4) {
        C4807Sf c4807Sf;
        C5046cc c5046cc = new C5046cc(c5088e4.f31525b, c5088e4.f31524a);
        C4831Tf c4831Tf = new C4831Tf(this);
        synchronized (c5289m5) {
            c4807Sf = (C4807Sf) c5289m5.m20697a(c5046cc, c4436d4, c4831Tf, c5289m5.f32167a);
        }
        return new C5021bc(context, c4807Sf);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5164h5
    /* renamed from: a */
    public final InterfaceC4659Ma mo19952a(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, C4428Cl c4428Cl) {
        return new C5096ec(context, c4428Cl.m19299e(), c4964z4, c4411c4, C5244ka.f32038C.m20633r(), C5244ka.f32038C.m20622f(), new C4903Wf(c4428Cl));
    }
}
