package io.appmetrica.analytics;

/* loaded from: classes2.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a */
        private final String f29498a;

        Error(String str) {
            this.f29498a = str;
        }

        public String getDescription() {
            return this.f29498a;
        }
    }

    void onDeeplinkLoaded(String str);

    void onError(Error error, String str);
}
