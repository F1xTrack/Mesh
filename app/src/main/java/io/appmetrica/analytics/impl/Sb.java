package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Sb implements InterfaceC4900u4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4900u4
    /* renamed from: b */
    public final I4 a(Context context, C4710m5 c4710m5, C4518e4 c4518e4, D4 d4) {
        L4 l4;
        J4 j4 = new J4(c4518e4.b);
        M4 m4 = new M4();
        synchronized (c4710m5) {
            l4 = (L4) c4710m5.a(j4, d4, m4, c4710m5.b);
        }
        return new I4(context, l4, d4);
    }
}
