package p000;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* renamed from: vp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11465vp0 {
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m25497b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* renamed from: c */
    public static /* synthetic */ PlaybackErrorEvent.Builder m25498c() {
        return new PlaybackErrorEvent.Builder();
    }

    /* renamed from: h */
    public static /* synthetic */ PlaybackMetrics.Builder m25503h() {
        return new PlaybackMetrics.Builder();
    }

    /* renamed from: l */
    public static /* synthetic */ PlaybackStateEvent.Builder m25507l() {
        return new PlaybackStateEvent.Builder();
    }
}
