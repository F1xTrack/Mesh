package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.yi */
/* loaded from: classes2.dex */
public abstract class AbstractC5602yi implements InterfaceC5488u4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5488u4
    /* renamed from: a */
    public abstract /* synthetic */ InterfaceC5463t4 mo19283a(Context context, C5289m5 c5289m5, C5088e4 c5088e4, C4436D4 c4436d4);

    /* renamed from: a */
    public final InterfaceC5463t4 m21222a(C4964Z4 c4964z4, C5289m5 c5289m5) {
        C4807Sf c4807Sf;
        synchronized (c5289m5) {
            c4807Sf = (C4807Sf) c5289m5.f32167a.get(c4964z4.toString());
        }
        return new C5577xi(c4807Sf);
    }
}
