package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Sb */
/* loaded from: classes2.dex */
public final class C4803Sb implements InterfaceC5488u4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5488u4
    /* renamed from: b */
    public final C4557I4 mo19283a(Context context, C5289m5 c5289m5, C5088e4 c5088e4, C4436D4 c4436d4) {
        C4629L4 c4629l4;
        C4581J4 c4581j4 = new C4581J4(c5088e4.f31525b);
        C4653M4 c4653m4 = new C4653M4();
        synchronized (c5289m5) {
            c4629l4 = (C4629L4) c5289m5.m20697a(c4581j4, c4436d4, c4653m4, c5289m5.f32168b);
        }
        return new C4557I4(context, c4629l4, c4436d4);
    }
}
