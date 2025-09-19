package ru.p031ok.tracer.base.sessionuuuid;

import java.util.UUID;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m22267d2 = {"createSessionUuid", "", "getCurrentSessionUuid", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SessionUuidUtils {
    public static final String createSessionUuid() {
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "randomUUID().toString()");
        return string;
    }

    public static final String getCurrentSessionUuid() {
        return SessionUuidHolder.INSTANCE.getSessionUuid();
    }
}
