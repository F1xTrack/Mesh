package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.o0 */
/* loaded from: classes2.dex */
public enum EnumC6071o0 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
