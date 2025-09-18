package io.sentry.clientreport;

/* renamed from: io.sentry.clientreport.d */
/* loaded from: classes2.dex */
public enum EnumC6000d {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE("sample_rate"),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor"),
    BACKPRESSURE("backpressure");

    private final String reason;

    EnumC6000d(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
