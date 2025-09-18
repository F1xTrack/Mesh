package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4741nc {
    public final Xl a;
    public final Xl b;
    public final A4 c;
    public final PublicLogger d;
    public final String e;

    public C4741nc(String str, PublicLogger publicLogger) {
        this(new A4(30), new Xl(50, str.concat("map key"), publicLogger), new Xl(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C4741nc(A4 a4, Xl xl, Xl xl2, String str, PublicLogger publicLogger) {
        this.c = a4;
        this.a = xl;
        this.b = xl2;
        this.e = str;
        this.d = publicLogger;
    }
}
