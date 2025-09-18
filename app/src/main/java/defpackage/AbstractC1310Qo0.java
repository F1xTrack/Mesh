package defpackage;

import android.media.metrics.LogSessionId;

/* renamed from: Qo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1310Qo0 {
    public static void a(C0531Go0 c0531Go0, NB0 nb0) {
        MB0 mb0 = nb0.b;
        mb0.getClass();
        LogSessionId logSessionId = mb0.a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c0531Go0.b.setString("log-session-id", logSessionId.getStringId());
    }
}
