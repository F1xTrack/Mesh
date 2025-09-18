package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.An */
/* loaded from: classes2.dex */
public final class C4380An implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f29878a = "WebView interface setup failed because javascript is disabled for the WebView.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).warning(this.f29878a, new Object[0]);
    }
}
