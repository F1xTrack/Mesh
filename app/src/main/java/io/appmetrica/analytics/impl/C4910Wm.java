package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.Wm */
/* loaded from: classes2.dex */
public final class C4910Wm extends AbstractC5200ig {
    public C4910Wm(C5139g5 c5139g5) {
        super(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        String strM20832i = this.f31942a.f31724c.m20832i();
        String str = c4821t5.f30768h;
        this.f31942a.f31724c.m20833j(str).m20875b();
        if (TextUtils.equals(strM20832i, str)) {
            return false;
        }
        this.f31942a.mo19635a(C5013b4.m20142o());
        return false;
    }
}
