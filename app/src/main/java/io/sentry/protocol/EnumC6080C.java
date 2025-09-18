package io.sentry.protocol;

import java.util.Locale;

/* renamed from: io.sentry.protocol.C */
/* loaded from: classes2.dex */
public enum EnumC6080C {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
