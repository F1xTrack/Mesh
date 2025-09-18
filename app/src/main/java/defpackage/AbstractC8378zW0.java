package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* renamed from: zW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8378zW0 {
    public static final C7533v4 a = C7533v4.d();

    public static void a(Trace trace, OY oy) {
        int i = oy.a;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        int i2 = oy.b;
        if (i2 > 0) {
            trace.putMetric("_fr_slo", i2);
        }
        int i3 = oy.c;
        if (i3 > 0) {
            trace.putMetric("_fr_fzn", i3);
        }
        String str = trace.d;
        a.a();
    }
}
