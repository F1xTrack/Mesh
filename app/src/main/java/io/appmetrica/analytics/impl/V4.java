package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class V4 implements X6 {
    public final String a;
    public final String b;

    public V4(Z4 z4) {
        this.a = String.format("component_%s.db", Arrays.copyOf(new Object[]{z4.d() ? "main" : z4.b()}, 1));
        this.b = "db_metrica_" + z4;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final String b() {
        return this.a;
    }
}
