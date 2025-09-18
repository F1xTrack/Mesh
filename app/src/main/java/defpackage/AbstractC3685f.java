package defpackage;

import android.app.usage.StorageStatsManager;
import android.media.AudioFocusRequest;

/* renamed from: f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3685f {
    public static /* bridge */ /* synthetic */ StorageStatsManager f(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder k(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder o(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ void t() {
    }
}
