package p000;

import android.media.metrics.LogSessionId;

/* renamed from: Qo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8174Qo0 {
    /* renamed from: a */
    public static void m6788a(C7654Go0 c7654Go0, NB0 nb0) {
        MB0 mb0 = nb0.f7539b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.f7032a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c7654Go0.f3908b.setString("log-session-id", logSessionId.getStringId());
    }
}
