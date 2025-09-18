package io.appmetrica.analytics.impl;

import java.util.Collection;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.td */
/* loaded from: classes2.dex */
public final class C5472td implements InterfaceC5357on {

    /* renamed from: a */
    public final String f32629a;

    public C5472td(String str) {
        this.f32629a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(Collection<Object> collection) {
        return AbstractC5182hn.m20513a((Collection) collection) ? new C5307mn(this, false, AbstractC1374Vq.m8593l(new StringBuilder(), this.f32629a, " is null or empty.")) : new C5307mn(this, true, "");
    }
}
