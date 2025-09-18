package com.p019vk.push.core.remote.config.omicron.fingerprint;

import com.p019vk.push.core.remote.config.omicron.SessionCounter;
import java.util.Map;

/* loaded from: classes2.dex */
public class SessionFingerprint implements OmicronFingerprint {

    /* renamed from: a */
    public final SessionCounter f20547a;

    public SessionFingerprint(SessionCounter sessionCounter) {
        this.f20547a = sessionCounter;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint
    public void collect(Map<String, Object> map) {
        SessionCounter sessionCounter = this.f20547a;
        map.put("current_session", Integer.valueOf(sessionCounter.getCurrentCount()));
        map.put("total_sessions", Integer.valueOf(sessionCounter.getTotalCount()));
    }
}
