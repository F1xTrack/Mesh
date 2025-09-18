package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ac */
/* loaded from: classes2.dex */
public final class C4426ac implements InterfaceC4900u4, InterfaceC4591h5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4900u4
    public final InterfaceC4876t4 a(Context context, C4710m5 c4710m5, C4518e4 c4518e4, D4 d4) {
        Sf sf;
        C4476cc c4476cc = new C4476cc(c4518e4.b, c4518e4.a);
        Tf tf = new Tf(this);
        synchronized (c4710m5) {
            sf = (Sf) c4710m5.a(c4476cc, d4, tf, c4710m5.a);
        }
        return new C4451bc(context, sf);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4591h5
    public final Ma a(Context context, Z4 z4, C4 c4, Cl cl2) {
        return new C4526ec(context, cl2.e(), z4, c4, C4667ka.C.r(), C4667ka.C.f(), new Wf(cl2));
    }
}
