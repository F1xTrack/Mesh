package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.j5 */
/* loaded from: classes2.dex */
public final class C5214j5 {

    /* renamed from: a */
    public final String f31956a;

    public C5214j5(String str) {
        this.f31956a = str;
    }

    /* renamed from: a */
    public final PublicLogger m20587a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f31956a);
    }
}
