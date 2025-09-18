package p000;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: GE */
/* loaded from: classes.dex */
public abstract class AbstractC0393GE {
    /* renamed from: a */
    public static void m3000a(AudioTrack audioTrack, NB0 nb0) {
        MB0 mb0 = nb0.f7539b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.f7032a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
