package io.appmetrica.analytics.impl;

import java.util.Map;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.Dh */
/* loaded from: classes2.dex */
public final class C4449Dh implements InterfaceC5357on {

    /* renamed from: a */
    public final Map f30024a;

    public C4449Dh(Map<String, ?> map) {
        this.f30024a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(String str) {
        return this.f30024a.containsKey(str) ? new C5307mn(this, false, AbstractC7222ym.m26234k("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C5307mn(this, true, "");
    }
}
