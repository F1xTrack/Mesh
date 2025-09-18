package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class GE {
    public static void a(AudioTrack audioTrack, NB0 nb0) {
        MB0 mb0 = nb0.b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
