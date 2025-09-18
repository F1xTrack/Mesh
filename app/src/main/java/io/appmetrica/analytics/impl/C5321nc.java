package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.nc */
/* loaded from: classes2.dex */
public final class C5321nc {

    /* renamed from: a */
    public final C4933Xl f32270a;

    /* renamed from: b */
    public final C4933Xl f32271b;

    /* renamed from: c */
    public final C4361A4 f32272c;

    /* renamed from: d */
    public final PublicLogger f32273d;

    /* renamed from: e */
    public final String f32274e;

    public C5321nc(String str, PublicLogger publicLogger) {
        this(new C4361A4(30), new C4933Xl(50, str.concat("map key"), publicLogger), new C4933Xl(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C5321nc(C4361A4 c4361a4, C4933Xl c4933Xl, C4933Xl c4933Xl2, String str, PublicLogger publicLogger) {
        this.f32272c = c4361a4;
        this.f32270a = c4933Xl;
        this.f32271b = c4933Xl2;
        this.f32274e = str;
        this.f32273d = publicLogger;
    }
}
