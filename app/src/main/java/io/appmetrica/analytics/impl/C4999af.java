package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.af */
/* loaded from: classes2.dex */
public final class C4999af implements InterfaceC5382pn, InterfaceC5517v8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5517v8
    /* renamed from: a */
    public final int mo20123a(EnumC4465E8 enumC4465E8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        return TextUtils.isEmpty(c4585j8.f30338b) ? new byte[0] : Base64.decode(c4585j8.f30338b, 0);
    }
}
