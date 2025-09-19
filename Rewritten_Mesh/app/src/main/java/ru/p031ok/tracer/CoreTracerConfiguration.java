package ru.p031ok.tracer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11077sn0;
import p000.BP0;
import p000.GE0;
import p000.IP0;
import p000.InterfaceC10293mf0;
import p000.InterfaceC6497nZ;
import p000.O90;
import ru.p031ok.tracer.base.inject.ProviderUtils;

@Metadata(m22266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m22267d2 = {"Lru/ok/tracer/CoreTracerConfiguration;", "Lru/ok/tracer/TracerConfiguration;", "builder", "Lru/ok/tracer/CoreTracerConfiguration$Builder;", "(Lru/ok/tracer/CoreTracerConfiguration$Builder;)V", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "apiUrl$delegate", "Lru/ok/tracer/ConfigurationProperty;", "bgExecutor", "Ljava/util/concurrent/Executor;", "getBgExecutor$tracer_commons_release", "()Ljava/util/concurrent/Executor;", "debugUpload", "", "getDebugUpload", "()Z", "initialKeys", "", "getInitialKeys$tracer_commons_release", "()Ljava/util/Map;", "ioExecutor", "getIoExecutor$tracer_commons_release", "overrideAppToken", "getOverrideAppToken", "overrideAppToken$delegate", "trafficStatsTag", "", "getTrafficStatsTag$tracer_commons_release", "()I", "getFeature", "Lru/ok/tracer/TracerFeature;", "Builder", "Companion", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CoreTracerConfiguration implements TracerConfiguration {
    static final /* synthetic */ InterfaceC10293mf0[] $$delegatedProperties;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String DEFAULT_API_URL = "https://sdk-api.apptracer.ru";

    /* renamed from: apiUrl$delegate, reason: from kotlin metadata */
    private final ConfigurationProperty apiUrl;
    private final Executor bgExecutor;
    private final boolean debugUpload;
    private final Map<String, String> initialKeys;
    private final Executor ioExecutor;

    /* renamed from: overrideAppToken$delegate, reason: from kotlin metadata */
    private final ConfigurationProperty overrideAppToken;
    private final int trafficStatsTag;

    @Metadata(m22266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010+\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\"H\u0007J\u0016\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005J\u001a\u00106\u001a\u00020\u00002\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000508J\u000e\u00109\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000bJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\"R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0080\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006>"}, m22267d2 = {"Lru/ok/tracer/CoreTracerConfiguration$Builder;", "", "()V", "apiUrlProvider", "Ljavax/inject/Provider;", "", "getApiUrlProvider$tracer_commons_release", "()Ljavax/inject/Provider;", "setApiUrlProvider$tracer_commons_release", "(Ljavax/inject/Provider;)V", "bgExecutor", "Ljava/util/concurrent/Executor;", "getBgExecutor$tracer_commons_release", "()Ljava/util/concurrent/Executor;", "setBgExecutor$tracer_commons_release", "(Ljava/util/concurrent/Executor;)V", "debugUpload", "", "getDebugUpload$tracer_commons_release", "()Ljava/lang/Boolean;", "setDebugUpload$tracer_commons_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "initialKeys", "", "getInitialKeys$tracer_commons_release", "()Ljava/util/Map;", "ioExecutor", "getIoExecutor$tracer_commons_release", "setIoExecutor$tracer_commons_release", "overrideAppTokenProvider", "getOverrideAppTokenProvider$tracer_commons_release", "setOverrideAppTokenProvider$tracer_commons_release", "trafficStatsTag", "", "getTrafficStatsTag$tracer_commons_release", "()Ljava/lang/Integer;", "setTrafficStatsTag$tracer_commons_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "Lru/ok/tracer/CoreTracerConfiguration;", "provideApiUrl", "provideOverrideAppToken", "setApiUrl", "apiUrl", "setBgExecutor", "executor", "setDebugUpload", "setExperimentalMaxTagsCount", "maxTagsCount", "setInitialKey", "key", "value", "setInitialKeys", "map", "", "setIoExecutor", "setOverrideAppToken", "overrideAppToken", "setTrafficStatsTag", "tag", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {
        private Provider apiUrlProvider;
        private Executor bgExecutor;
        private Boolean debugUpload;
        private final Map<String, String> initialKeys = new LinkedHashMap();
        private Executor ioExecutor;
        private Provider overrideAppTokenProvider;
        private Integer trafficStatsTag;

        public final CoreTracerConfiguration build() {
            return new CoreTracerConfiguration(this, null);
        }

        /* renamed from: getApiUrlProvider$tracer_commons_release, reason: from getter */
        public final Provider getApiUrlProvider() {
            return this.apiUrlProvider;
        }

        /* renamed from: getBgExecutor$tracer_commons_release, reason: from getter */
        public final Executor getBgExecutor() {
            return this.bgExecutor;
        }

        /* renamed from: getDebugUpload$tracer_commons_release, reason: from getter */
        public final Boolean getDebugUpload() {
            return this.debugUpload;
        }

        public final Map<String, String> getInitialKeys$tracer_commons_release() {
            return this.initialKeys;
        }

        /* renamed from: getIoExecutor$tracer_commons_release, reason: from getter */
        public final Executor getIoExecutor() {
            return this.ioExecutor;
        }

        /* renamed from: getOverrideAppTokenProvider$tracer_commons_release, reason: from getter */
        public final Provider getOverrideAppTokenProvider() {
            return this.overrideAppTokenProvider;
        }

        /* renamed from: getTrafficStatsTag$tracer_commons_release, reason: from getter */
        public final Integer getTrafficStatsTag() {
            return this.trafficStatsTag;
        }

        public final Builder provideApiUrl(Provider apiUrlProvider) {
            O90.m5968f(apiUrlProvider, "apiUrlProvider");
            this.apiUrlProvider = apiUrlProvider;
            return this;
        }

        public final Builder provideOverrideAppToken(Provider overrideAppTokenProvider) {
            O90.m5968f(overrideAppTokenProvider, "overrideAppTokenProvider");
            this.overrideAppTokenProvider = overrideAppTokenProvider;
            return this;
        }

        public final Builder setApiUrl(String apiUrl) {
            O90.m5968f(apiUrl, "apiUrl");
            return provideApiUrl(ProviderUtils.providerOf(apiUrl));
        }

        public final void setApiUrlProvider$tracer_commons_release(Provider provider) {
            this.apiUrlProvider = provider;
        }

        public final Builder setBgExecutor(Executor executor) {
            O90.m5968f(executor, "executor");
            this.bgExecutor = executor;
            return this;
        }

        public final void setBgExecutor$tracer_commons_release(Executor executor) {
            this.bgExecutor = executor;
        }

        public final Builder setDebugUpload(boolean debugUpload) {
            this.debugUpload = Boolean.valueOf(debugUpload);
            return this;
        }

        public final void setDebugUpload$tracer_commons_release(Boolean bool) {
            this.debugUpload = bool;
        }

        public final Builder setExperimentalMaxTagsCount(int maxTagsCount) {
            return this;
        }

        public final Builder setInitialKey(String key, String value) {
            O90.m5968f(key, "key");
            O90.m5968f(value, "value");
            this.initialKeys.put(key, value);
            return this;
        }

        public final Builder setInitialKeys(Map<String, String> map) {
            O90.m5968f(map, "map");
            this.initialKeys.putAll(map);
            return this;
        }

        public final Builder setIoExecutor(Executor executor) {
            O90.m5968f(executor, "executor");
            this.ioExecutor = executor;
            return this;
        }

        public final void setIoExecutor$tracer_commons_release(Executor executor) {
            this.ioExecutor = executor;
        }

        public final Builder setOverrideAppToken(String overrideAppToken) {
            O90.m5968f(overrideAppToken, "overrideAppToken");
            return provideOverrideAppToken(ProviderUtils.providerOf(overrideAppToken));
        }

        public final void setOverrideAppTokenProvider$tracer_commons_release(Provider provider) {
            this.overrideAppTokenProvider = provider;
        }

        public final Builder setTrafficStatsTag(int tag) {
            this.trafficStatsTag = Integer.valueOf(tag);
            return this;
        }

        public final void setTrafficStatsTag$tracer_commons_release(Integer num) {
            this.trafficStatsTag = num;
        }
    }

    @Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m22267d2 = {"Lru/ok/tracer/CoreTracerConfiguration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/CoreTracerConfiguration$Builder;", "LTf1;", "block", "Lru/ok/tracer/CoreTracerConfiguration;", LocalNotification.Visibility.PRIVATE, "(LnZ;)Lru/ok/tracer/CoreTracerConfiguration;", "build", "get", "()Lru/ok/tracer/CoreTracerConfiguration;", "", "DEFAULT_API_URL", "Ljava/lang/String;", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoreTracerConfiguration get() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_COREKt.getFEATURE_CORE());
            CoreTracerConfiguration coreTracerConfiguration = tracerConfiguration instanceof CoreTracerConfiguration ? (CoreTracerConfiguration) tracerConfiguration : null;
            return coreTracerConfiguration == null ? new Builder().build() : coreTracerConfiguration;
        }

        /* renamed from: private */
        public final CoreTracerConfiguration m26691private(InterfaceC6497nZ interfaceC6497nZ) {
            O90.m5968f(interfaceC6497nZ, "block");
            Builder builder = new Builder();
            interfaceC6497nZ.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    static {
        GE0 ge0 = new GE0("apiUrl", "getApiUrl()Ljava/lang/String;");
        IP0 ip0 = BP0.f799a;
        $$delegatedProperties = new InterfaceC10293mf0[]{ip0.mo3850f(ge0), ip0.mo3850f(new GE0("overrideAppToken", "getOverrideAppToken()Ljava/lang/String;"))};
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ CoreTracerConfiguration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final String getApiUrl() {
        return (String) this.apiUrl.getValue((TracerConfiguration) this, $$delegatedProperties[0]);
    }

    /* renamed from: getBgExecutor$tracer_commons_release, reason: from getter */
    public final Executor getBgExecutor() {
        return this.bgExecutor;
    }

    public final boolean getDebugUpload() {
        return this.debugUpload;
    }

    @Override // ru.p031ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_COREKt.getFEATURE_CORE();
    }

    public final Map<String, String> getInitialKeys$tracer_commons_release() {
        return this.initialKeys;
    }

    /* renamed from: getIoExecutor$tracer_commons_release, reason: from getter */
    public final Executor getIoExecutor() {
        return this.ioExecutor;
    }

    public final String getOverrideAppToken() {
        return (String) this.overrideAppToken.getValue((TracerConfiguration) this, $$delegatedProperties[1]);
    }

    /* renamed from: getTrafficStatsTag$tracer_commons_release, reason: from getter */
    public final int getTrafficStatsTag() {
        return this.trafficStatsTag;
    }

    private CoreTracerConfiguration(Builder builder) {
        this.apiUrl = new ConfigurationProperty(builder.getApiUrlProvider(), "https://sdk-api.apptracer.ru");
        this.overrideAppToken = new ConfigurationProperty(builder.getOverrideAppTokenProvider(), null);
        Boolean debugUpload = builder.getDebugUpload();
        this.debugUpload = debugUpload != null ? debugUpload.booleanValue() : false;
        this.initialKeys = AbstractC11077sn0.m24787o(builder.getInitialKeys$tracer_commons_release());
        Integer trafficStatsTag = builder.getTrafficStatsTag();
        this.trafficStatsTag = trafficStatsTag != null ? trafficStatsTag.intValue() : -1;
        this.ioExecutor = builder.getIoExecutor();
        this.bgExecutor = builder.getBgExecutor();
    }
}
