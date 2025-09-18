package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kb */
/* loaded from: classes2.dex */
public final class C5245kb implements InterfaceC5357on {
    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(String str) {
        return str == null ? new C5307mn(this, false, "key is null") : str.startsWith("appmetrica") ? new C5307mn(this, false, "key starts with appmetrica") : str.length() > 200 ? new C5307mn(this, false, "key length more then 200 characters") : new C5307mn(this, true, "");
    }
}
