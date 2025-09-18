package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Bn */
/* loaded from: classes2.dex */
public final class C4405Bn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f29918a;

    /* renamed from: b */
    public final /* synthetic */ String f29919b = "WebView interface setup failed because of an exception.";

    public C4405Bn(Throwable th) {
        this.f29918a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f29918a, this.f29919b, new Object[0]);
    }
}
