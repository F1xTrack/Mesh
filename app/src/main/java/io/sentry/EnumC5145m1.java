package io.sentry;

import com.google.android.gms.common.Scopes;
import java.io.IOException;

/* renamed from: io.sentry.m1 */
/* loaded from: classes2.dex */
public enum EnumC5145m1 implements InterfaceC5141l0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Statsd("statsd"),
    Feedback("feedback"),
    Unknown("__unknown__");

    private final String itemType;

    EnumC5145m1(String str) {
        this.itemType = str;
    }

    public static EnumC5145m1 resolve(Object obj) {
        return obj instanceof C5133i1 ? Event : obj instanceof io.sentry.protocol.A ? Transaction : obj instanceof O1 ? Session : obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static EnumC5145m1 valueOfLabel(String str) {
        for (EnumC5145m1 enumC5145m1 : values()) {
            if (enumC5145m1.itemType.equals(str)) {
                return enumC5145m1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.d(this.itemType);
    }
}
