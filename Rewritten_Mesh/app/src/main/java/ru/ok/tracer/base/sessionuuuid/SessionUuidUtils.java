package ru.ok.tracer.base.sessionuuuid;

import defpackage.O90;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"createSessionUuid", "", "getCurrentSessionUuid", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionUuidUtils {
    public static final String createSessionUuid() {
        String string = UUID.randomUUID().toString();
        O90.e(string, "randomUUID().toString()");
        return string;
    }

    public static final String getCurrentSessionUuid() {
        return SessionUuidHolder.INSTANCE.getSessionUuid();
    }
}
