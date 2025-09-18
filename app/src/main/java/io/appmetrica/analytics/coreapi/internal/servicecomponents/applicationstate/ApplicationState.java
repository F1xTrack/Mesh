package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes2.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND("background"),
    VISIBLE("visible");


    /* renamed from: a */
    private final String f29667a;

    ApplicationState(String str) {
        this.f29667a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f29667a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.f29667a;
    }
}
