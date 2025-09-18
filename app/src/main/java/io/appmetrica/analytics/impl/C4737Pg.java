package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Pg */
/* loaded from: classes2.dex */
public final class C4737Pg {

    /* renamed from: a */
    public final C4821T5 f30620a;

    /* renamed from: b */
    public final boolean f30621b;

    /* renamed from: c */
    public final int f30622c;

    /* renamed from: d */
    public final HashMap f30623d;

    /* renamed from: e */
    public final C4952Yg f30624e;

    public C4737Pg(C4821T5 c4821t5, boolean z, int i, HashMap map, C4952Yg c4952Yg) {
        this.f30620a = c4821t5;
        this.f30621b = z;
        this.f30622c = i;
        this.f30623d = map;
        this.f30624e = c4952Yg;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f30620a + ", serviceDataReporterType=" + this.f30622c + ", environment=" + this.f30624e + ", isCrashReport=" + this.f30621b + ", trimmedFields=" + this.f30623d + ')';
    }
}
