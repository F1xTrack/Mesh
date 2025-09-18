package ru.ok.tracer.base.sessionuuuid;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tracer/base/sessionuuuid/SessionUuidHolder;", "", "()V", "sessionUuid", "", "getSessionUuid", "()Ljava/lang/String;", "setSessionUuid", "(Ljava/lang/String;)V", "tracer-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
final class SessionUuidHolder {
    public static final SessionUuidHolder INSTANCE = new SessionUuidHolder();
    private static String sessionUuid = SessionUuidUtils.createSessionUuid();

    private SessionUuidHolder() {
    }

    public final String getSessionUuid() {
        return sessionUuid;
    }

    public final void setSessionUuid(String str) {
        O90.f(str, "<set-?>");
        sessionUuid = str;
    }
}
