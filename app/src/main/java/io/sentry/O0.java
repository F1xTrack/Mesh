package io.sentry;

import defpackage.C8329zG;
import io.sentry.android.core.C5096m;

/* loaded from: classes2.dex */
public final class O0 {
    public final /* synthetic */ int a;
    public final C5096m b;

    public /* synthetic */ O0(C5096m c5096m, int i) {
        this.a = i;
        this.b = c5096m;
    }

    public final C8329zG a(E e, D1 d1) {
        switch (this.a) {
            case 0:
                io.sentry.config.a.D(e, "Hub is required");
                io.sentry.config.a.D(d1, "SentryOptions is required");
                String cacheDirPath = this.b.a.getCacheDirPath();
                if (cacheDirPath != null && AbstractC5116d.b(cacheDirPath, d1.getLogger())) {
                    break;
                } else {
                    d1.getLogger().k(EnumC5148n1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
            default:
                io.sentry.config.a.D(e, "Hub is required");
                io.sentry.config.a.D(d1, "SentryOptions is required");
                String outboxPath = this.b.a.getOutboxPath();
                if (outboxPath != null && AbstractC5116d.b(outboxPath, d1.getLogger())) {
                    break;
                } else {
                    d1.getLogger().k(EnumC5148n1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
        }
        return null;
    }
}
