package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4532ei {
    public final Revenue a;
    public final Vl b;
    public final C4511dm c;
    public final C4511dm d;
    public final PublicLogger e;

    public C4532ei(Revenue revenue, PublicLogger publicLogger) {
        this.e = publicLogger;
        this.a = revenue;
        this.b = new Vl(30720, "revenue payload", publicLogger);
        this.c = new C4511dm(new Vl(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.d = new C4511dm(new Xl(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
