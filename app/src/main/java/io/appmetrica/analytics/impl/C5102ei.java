package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ei */
/* loaded from: classes2.dex */
public final class C5102ei {

    /* renamed from: a */
    public final Revenue f31604a;

    /* renamed from: b */
    public final C4885Vl f31605b;

    /* renamed from: c */
    public final C5081dm f31606c;

    /* renamed from: d */
    public final C5081dm f31607d;

    /* renamed from: e */
    public final PublicLogger f31608e;

    public C5102ei(Revenue revenue, PublicLogger publicLogger) {
        this.f31608e = publicLogger;
        this.f31604a = revenue;
        this.f31605b = new C4885Vl(30720, "revenue payload", publicLogger);
        this.f31606c = new C5081dm(new C4885Vl(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f31607d = new C5081dm(new C4933Xl(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
