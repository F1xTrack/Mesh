package p000;

import com.google.firebase.perf.metrics.Trace;

/* renamed from: zW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11935zW0 {

    /* renamed from: a */
    public static final C6989v4 f46857a = C6989v4.m25319d();

    /* renamed from: a */
    public static void m26445a(Trace trace, C0916OY c0916oy) {
        int i = c0916oy.f8478a;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        int i2 = c0916oy.f8479b;
        if (i2 > 0) {
            trace.putMetric("_fr_slo", i2);
        }
        int i3 = c0916oy.f8480c;
        if (i3 > 0) {
            trace.putMetric("_fr_fzn", i3);
        }
        String str = trace.f18509d;
        f46857a.m25320a();
    }
}
