package io.sentry;

import io.sentry.android.core.C5897m;
import io.sentry.config.AbstractC6003a;
import p000.C7253zG;

/* renamed from: io.sentry.O0 */
/* loaded from: classes2.dex */
public final class C5791O0 {

    /* renamed from: a */
    public final /* synthetic */ int f33345a;

    /* renamed from: b */
    public final C5897m f33346b;

    public /* synthetic */ C5791O0(C5897m c5897m, int i) {
        this.f33345a = i;
        this.f33346b = c5897m;
    }

    /* renamed from: a */
    public final C7253zG m21452a(C5760E c5760e, C5759D1 c5759d1) {
        switch (this.f33345a) {
            case 0:
                AbstractC6003a.m21735D(c5760e, "Hub is required");
                AbstractC6003a.m21735D(c5759d1, "SentryOptions is required");
                String cacheDirPath = this.f33346b.f33794a.getCacheDirPath();
                if (cacheDirPath != null && AbstractC6008d.m21772b(cacheDirPath, c5759d1.getLogger())) {
                    break;
                } else {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
            default:
                AbstractC6003a.m21735D(c5760e, "Hub is required");
                AbstractC6003a.m21735D(c5759d1, "SentryOptions is required");
                String outboxPath = this.f33346b.f33794a.getOutboxPath();
                if (outboxPath != null && AbstractC6008d.m21772b(outboxPath, c5759d1.getLogger())) {
                    break;
                } else {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
        }
        return null;
    }
}
