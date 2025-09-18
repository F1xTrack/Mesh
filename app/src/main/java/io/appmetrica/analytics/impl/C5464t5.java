package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.t5 */
/* loaded from: classes2.dex */
public final class C5464t5 {

    /* renamed from: a */
    public final PublicLogger f32617a;

    public C5464t5(String str) {
        this.f32617a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    /* renamed from: a */
    public final int m21074a(int i) {
        if (i < 100) {
            this.f32617a.warning(AbstractC7222ym.m26230g(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i <= 10000) {
            return i;
        }
        this.f32617a.warning(AbstractC7222ym.m26230g(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return 10000;
    }
}
