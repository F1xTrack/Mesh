package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public class Wg implements InterfaceC4900u4, InterfaceC4591h5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4591h5
    /* renamed from: b */
    public C4567g5 a(Context context, Z4 z4, C4 c4, Cl cl2) {
        return new Xg(context, z4, c4, C4667ka.C.f(), cl2.e(), new Wf(cl2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4900u4
    public final InterfaceC4876t4 a(Context context, C4710m5 c4710m5, C4518e4 c4518e4, D4 d4) {
        Sf sf;
        Z4 z4 = new Z4(c4518e4.b, c4518e4.a);
        Tf tf = new Tf(this);
        synchronized (c4710m5) {
            sf = (Sf) c4710m5.a(z4, d4, tf, c4710m5.a);
        }
        return new Rf(context, sf);
    }
}
