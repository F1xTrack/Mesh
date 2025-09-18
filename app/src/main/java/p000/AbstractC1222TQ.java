package p000;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* renamed from: TQ */
/* loaded from: classes.dex */
public abstract class AbstractC1222TQ {
    /* renamed from: a */
    public static NB0 m7693a(Context context, C1474XQ c1474xq, boolean z, String str) {
        MediaMetricsManager mediaMetricsManagerM25497b = AbstractC11465vp0.m25497b(context.getSystemService("media_metrics"));
        C11719xp0 c11719xp0 = mediaMetricsManagerM25497b == null ? null : new C11719xp0(context, mediaMetricsManagerM25497b.createPlaybackSession());
        if (c11719xp0 == null) {
            AbstractC10872rA1.m24175h("MediaMetricsService unavailable.");
            return new NB0(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            C7251zE c7251zE = c1474xq.f13736r;
            c7251zE.getClass();
            c7251zE.f46736f.m8129a(c11719xp0);
        }
        return new NB0(c11719xp0.f45819c.getSessionId(), str);
    }
}
