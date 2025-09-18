package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Wg */
/* loaded from: classes2.dex */
public class C4904Wg implements InterfaceC5488u4, InterfaceC5164h5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5164h5
    /* renamed from: b */
    public C5139g5 mo19952a(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, C4428Cl c4428Cl) {
        return new C4928Xg(context, c4964z4, c4411c4, C5244ka.f32038C.m20622f(), c4428Cl.m19299e(), new C4903Wf(c4428Cl));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5488u4
    /* renamed from: a */
    public final InterfaceC5463t4 mo19283a(Context context, C5289m5 c5289m5, C5088e4 c5088e4, C4436D4 c4436d4) {
        C4807Sf c4807Sf;
        C4964Z4 c4964z4 = new C4964Z4(c5088e4.f31525b, c5088e4.f31524a);
        C4831Tf c4831Tf = new C4831Tf(this);
        synchronized (c5289m5) {
            c4807Sf = (C4807Sf) c5289m5.m20697a(c4964z4, c4436d4, c4831Tf, c5289m5.f32167a);
        }
        return new C4783Rf(context, c4807Sf);
    }
}
