package p000;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: UY */
/* loaded from: classes.dex */
public abstract class AbstractC1293UY {
    /* renamed from: a */
    public static boolean m8080a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    /* renamed from: b */
    public static void m8081b(MediaDrm mediaDrm, byte[] bArr, NB0 nb0) {
        MB0 mb0 = nb0.f7539b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.f7032a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        AbstractC6555oU.m23447f(playbackComponent).setLogSessionId(logSessionId);
    }
}
