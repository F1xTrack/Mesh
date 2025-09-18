package io.sentry;

import com.google.android.gms.common.Scopes;

/* renamed from: io.sentry.j */
/* loaded from: classes2.dex */
public enum EnumC6051j {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC6051j(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
