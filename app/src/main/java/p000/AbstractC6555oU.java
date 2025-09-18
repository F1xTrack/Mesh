package p000;

import android.media.MediaDrm;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* renamed from: oU */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6555oU {
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m23447f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* renamed from: g */
    public static /* synthetic */ NetworkEvent.Builder m23448g() {
        return new NetworkEvent.Builder();
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m23452k(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* renamed from: l */
    public static /* synthetic */ TrackChangeEvent.Builder m23453l(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
