package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.V4 */
/* loaded from: classes2.dex */
public final class C4868V4 implements InterfaceC4918X6 {

    /* renamed from: a */
    public final String f30842a;

    /* renamed from: b */
    public final String f30843b;

    public C4868V4(C4964Z4 c4964z4) {
        this.f30842a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c4964z4.mo20057d() ? "main" : c4964z4.m20055b()}, 1));
        this.f30843b = "db_metrica_" + c4964z4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4918X6
    /* renamed from: a */
    public final String mo19902a() {
        return this.f30843b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4918X6
    /* renamed from: b */
    public final String mo19903b() {
        return this.f30842a;
    }
}
