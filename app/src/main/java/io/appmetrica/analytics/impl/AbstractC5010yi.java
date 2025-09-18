package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5010yi implements InterfaceC4900u4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4900u4
    public abstract /* synthetic */ InterfaceC4876t4 a(Context context, C4710m5 c4710m5, C4518e4 c4518e4, D4 d4);

    public final InterfaceC4876t4 a(Z4 z4, C4710m5 c4710m5) {
        Sf sf;
        synchronized (c4710m5) {
            sf = (Sf) c4710m5.a.get(z4.toString());
        }
        return new C4986xi(sf);
    }
}
