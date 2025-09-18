package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Yl extends H4 {
    public final Hm g;

    public Yl(String str, String str2, Hm hm, on onVar, R2 r2) {
        super(0, str, str2, onVar, r2);
        this.g = hm;
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final void a(C4462bn c4462bn) {
        String str = (String) this.g.a((String) this.f);
        c4462bn.d.a = str == null ? new byte[0] : str.getBytes();
    }

    public final Hm h() {
        return this.g;
    }
}
