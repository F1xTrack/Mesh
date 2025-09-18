package io.appmetrica.analytics.impl;

import defpackage.AbstractC8235ym;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Dh implements on {
    public final Map a;

    public Dh(Map<String, ?> map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(String str) {
        return this.a.containsKey(str) ? new mn(this, false, AbstractC8235ym.k("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new mn(this, true, "");
    }
}
