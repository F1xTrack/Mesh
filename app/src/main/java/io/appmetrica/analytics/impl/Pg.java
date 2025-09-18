package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Pg {
    public final T5 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final Yg e;

    public Pg(T5 t5, boolean z, int i, HashMap map, Yg yg) {
        this.a = t5;
        this.b = z;
        this.c = i;
        this.d = map;
        this.e = yg;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.a + ", serviceDataReporterType=" + this.c + ", environment=" + this.e + ", isCrashReport=" + this.b + ", trimmedFields=" + this.d + ')';
    }
}
