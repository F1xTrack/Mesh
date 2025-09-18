package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.Bk */
/* loaded from: classes2.dex */
public final class C4402Bk implements InterfaceC4794S2 {

    /* renamed from: a */
    public final Context f29915a;

    public C4402Bk(Context context) {
        this.f29915a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4794S2, io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p026io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    /* renamed from: a */
    public final Context m19246a() {
        return this.f29915a;
    }
}
