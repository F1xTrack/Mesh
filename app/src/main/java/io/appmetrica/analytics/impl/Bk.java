package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class Bk implements S2 {
    public final Context a;

    public Bk(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.S2, io.appmetrica.analytics.impl.InterfaceC4702ll
    public final void a(C4583gl c4583gl) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    public final Context a() {
        return this.a;
    }
}
