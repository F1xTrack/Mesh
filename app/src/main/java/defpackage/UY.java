package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class UY {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, NB0 nb0) {
        MB0 mb0 = nb0.b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        AbstractC6275oU.f(playbackComponent).setLogSessionId(logSessionId);
    }
}
