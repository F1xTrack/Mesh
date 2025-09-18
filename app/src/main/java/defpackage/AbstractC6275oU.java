package defpackage;

import android.media.MediaDrm;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;

/* renamed from: oU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6275oU {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder g() {
        return new NetworkEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder k(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ TrackChangeEvent.Builder l(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
