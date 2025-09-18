package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.t3 */
/* loaded from: classes2.dex */
public final class C5462t3 implements InterfaceC5382pn {

    /* renamed from: a */
    public final C4440D8 f32616a;

    public C5462t3() {
        this(new C4440D8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5382pn
    /* renamed from: a */
    public final byte[] mo19606a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        byte[] bArrDecode = new byte[0];
        String str = c4585j8.f30338b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C4440D8 c4440d8 = this.f32616a;
        return ((InterfaceC4415C8) c4440d8.f30009a.m20862a(c4585j8.f30351o)).mo19266a(bArrDecode);
    }

    public C5462t3(C4440D8 c4440d8) {
        this.f32616a = c4440d8;
    }
}
