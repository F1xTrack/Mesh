package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Cn */
/* loaded from: classes2.dex */
public final class C4430Cn {

    /* renamed from: a */
    public final ArrayList f29979a = new ArrayList();

    /* renamed from: b */
    public PublicLogger f29980b;

    /* renamed from: a */
    public final synchronized void m19303a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f29980b;
            if (publicLogger == null) {
                this.f29979a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
