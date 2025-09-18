package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.zn */
/* loaded from: classes2.dex */
public final class C5632zn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f32941a = "WebView interface setup is successful.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).info(this.f32941a, new Object[0]);
    }
}
