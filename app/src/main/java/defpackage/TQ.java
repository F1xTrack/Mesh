package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* loaded from: classes.dex */
public abstract class TQ {
    public static NB0 a(Context context, XQ xq, boolean z, String str) {
        MediaMetricsManager mediaMetricsManagerB = AbstractC7675vp0.b(context.getSystemService("media_metrics"));
        C8055xp0 c8055xp0 = mediaMetricsManagerB == null ? null : new C8055xp0(context, mediaMetricsManagerB.createPlaybackSession());
        if (c8055xp0 == null) {
            AbstractC6789rA1.h("MediaMetricsService unavailable.");
            return new NB0(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            C8323zE c8323zE = xq.r;
            c8323zE.getClass();
            c8323zE.f.a(c8055xp0);
        }
        return new NB0(c8055xp0.c.getSessionId(), str);
    }
}
