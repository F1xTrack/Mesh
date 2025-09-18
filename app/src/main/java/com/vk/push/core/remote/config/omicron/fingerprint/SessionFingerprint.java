package com.vk.push.core.remote.config.omicron.fingerprint;

import com.vk.push.core.remote.config.omicron.SessionCounter;
import java.util.Map;

/* loaded from: classes2.dex */
public class SessionFingerprint implements OmicronFingerprint {
    public final SessionCounter a;

    public SessionFingerprint(SessionCounter sessionCounter) {
        this.a = sessionCounter;
    }

    @Override // com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        SessionCounter sessionCounter = this.a;
        map.put("current_session", Integer.valueOf(sessionCounter.getCurrentCount()));
        map.put("total_sessions", Integer.valueOf(sessionCounter.getTotalCount()));
    }
}
