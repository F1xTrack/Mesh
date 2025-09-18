package io.sentry;

import com.google.android.gms.common.Scopes;
import io.sentry.clientreport.C5998b;
import io.sentry.protocol.C6078A;
import java.io.IOException;

/* renamed from: io.sentry.m1 */
/* loaded from: classes2.dex */
public enum EnumC6062m1 implements InterfaceC6058l0 {
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

    EnumC6062m1(String str) {
        this.itemType = str;
    }

    public static EnumC6062m1 resolve(Object obj) {
        return obj instanceof C6039i1 ? Event : obj instanceof C6078A ? Transaction : obj instanceof C5792O1 ? Session : obj instanceof C5998b ? ClientReport : Attachment;
    }

    public static EnumC6062m1 valueOfLabel(String str) {
        for (EnumC6062m1 enumC6062m1 : values()) {
            if (enumC6062m1.itemType.equals(str)) {
                return enumC6062m1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13811d(this.itemType);
    }
}
