package io.appmetrica.analytics;

import java.util.Map;

/* loaded from: classes2.dex */
public interface DeferredDeeplinkParametersListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink parameters can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain valid deferred deeplink parameters."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a */
        private final String f29500a;

        Error(String str) {
            this.f29500a = str;
        }

        public String getDescription() {
            return this.f29500a;
        }
    }

    void onError(Error error, String str);

    void onParametersLoaded(Map<String, String> map);
}
