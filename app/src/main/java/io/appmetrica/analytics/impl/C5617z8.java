package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.z8 */
/* loaded from: classes2.dex */
public final class C5617z8 implements InterfaceC5382pn {

    /* renamed from: a */
    public final C4440D8 f32916a;

    public C5617z8() {
        this(new C4440D8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        String str = c4585j8.f30338b;
        return ((InterfaceC4415C8) this.f32916a.f30009a.m20862a(c4585j8.f30351o)).mo19266a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C5617z8(C4440D8 c4440d8) {
        this.f32916a = c4440d8;
    }
}
