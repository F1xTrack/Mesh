package ru.ok.tracer.lite;

import android.content.Context;
import defpackage.EnumC4205hi0;
import defpackage.InterfaceC6099nZ;
import defpackage.LB;
import defpackage.O90;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.inject.ProviderUtils;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;
import ru.ok.tracer.manifest.TracerLiteManifest;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001;B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0013\u0010:\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b9\u0010\u0011¨\u0006<"}, d2 = {"Lru/ok/tracer/lite/TracerLite;", "", "Landroid/content/Context;", "context", "", "libraryPackageName", "Lru/ok/tracer/lite/TracerLite$Configuration;", "configuration", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lru/ok/tracer/lite/TracerLite$Configuration;)V", "key", "value", "LTf1;", "setKey", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLibraryPackageName", "()Ljava/lang/String;", "getLibraryPackageName$annotations", "()V", "Lru/ok/tracer/lite/TracerLite$Configuration;", "getConfiguration", "()Lru/ok/tracer/lite/TracerLite$Configuration;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ok/tracer/manifest/TracerLiteManifest;", "manifest$delegate", "Lkotlin/Lazy;", "getManifest", "()Lru/ok/tracer/manifest/TracerLiteManifest;", "manifest", "Lru/ok/tracer/lite/TracerLibraryInfo;", "libraryInfo$delegate", "getLibraryInfo", "()Lru/ok/tracer/lite/TracerLibraryInfo;", "libraryInfo", "Lru/ok/tracer/lite/TagsStorageLite;", "tagsStorage", "Lru/ok/tracer/lite/TagsStorageLite;", "getTagsStorage$tracer_lite_commons_release", "()Lru/ok/tracer/lite/TagsStorageLite;", "Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "httpClientHolder", "Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "getHttpClientHolder$tracer_lite_commons_release", "()Lru/ok/tracer/lite/upload/TracerLiteHttpClientHolder;", "Lru/ok/tracer/lite/utils/TracerExecutorsHolder;", "executorHolder", "Lru/ok/tracer/lite/utils/TracerExecutorsHolder;", "getExecutorHolder$tracer_lite_commons_release", "()Lru/ok/tracer/lite/utils/TracerExecutorsHolder;", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "limits", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "getLimits$tracer_lite_commons_release", "()Lru/ok/tracer/lite/limits/TracerLiteLimits;", "getLibToken", "libToken", "Configuration", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLite {
    private final Configuration configuration;
    private final Context context;
    private final TracerExecutorsHolder executorHolder;
    private final TracerLiteHttpClientHolder httpClientHolder;

    /* renamed from: libraryInfo$delegate, reason: from kotlin metadata */
    private final Lazy libraryInfo;
    private final String libraryPackageName;
    private final TracerLiteLimits limits;

    /* renamed from: manifest$delegate, reason: from kotlin metadata */
    private final Lazy manifest;
    private final TagsStorageLite tagsStorage;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ok/tracer/lite/TracerLite$Configuration;", "", "builder", "Lru/ok/tracer/lite/TracerLite$Configuration$Builder;", "(Lru/ok/tracer/lite/TracerLite$Configuration$Builder;)V", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "apiUrlProvider", "Ljavax/inject/Provider;", "ioExecutor", "Ljava/util/concurrent/Executor;", "getIoExecutor$tracer_lite_commons_release", "()Ljava/util/concurrent/Executor;", "overrideLibToken", "getOverrideLibToken$tracer_lite_commons_release", "()Ljavax/inject/Provider;", "trafficStatsTag", "", "getTrafficStatsTag$tracer_lite_commons_release", "()I", "Builder", "Companion", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String DEFAULT_API_URL = "https://sdk-api.apptracer.ru";
        private final Provider apiUrlProvider;
        private final Executor ioExecutor;
        private final Provider overrideLibToken;
        private final int trafficStatsTag;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ok/tracer/lite/TracerLite$Configuration$Builder;", "", "()V", "value", "", "apiUrl", "getApiUrl", "()Ljava/lang/String;", "setApiUrl", "(Ljava/lang/String;)V", "apiUrlProvider", "Ljavax/inject/Provider;", "getApiUrlProvider", "()Ljavax/inject/Provider;", "setApiUrlProvider", "(Ljavax/inject/Provider;)V", "ioExecutor", "Ljava/util/concurrent/Executor;", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "setIoExecutor", "(Ljava/util/concurrent/Executor;)V", "overrideLibToken", "getOverrideLibToken", "setOverrideLibToken", "overrideLibTokenProvider", "getOverrideLibTokenProvider", "setOverrideLibTokenProvider", "trafficStatsTag", "", "getTrafficStatsTag", "()I", "setTrafficStatsTag", "(I)V", "build", "Lru/ok/tracer/lite/TracerLite$Configuration;", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Builder {
            private Executor ioExecutor;
            private Provider apiUrlProvider = ProviderUtils.providerOf(Configuration.DEFAULT_API_URL);
            private Provider overrideLibTokenProvider = ProviderUtils.providerOf(null);
            private int trafficStatsTag = -1;

            public final Configuration build() {
                return new Configuration(this, null);
            }

            public final String getApiUrl() {
                Object obj = this.apiUrlProvider.get();
                O90.e(obj, "apiUrlProvider.get()");
                return (String) obj;
            }

            public final Provider getApiUrlProvider() {
                return this.apiUrlProvider;
            }

            public final Executor getIoExecutor() {
                return this.ioExecutor;
            }

            public final String getOverrideLibToken() {
                return (String) this.overrideLibTokenProvider.get();
            }

            public final Provider getOverrideLibTokenProvider() {
                return this.overrideLibTokenProvider;
            }

            public final int getTrafficStatsTag() {
                return this.trafficStatsTag;
            }

            public final void setApiUrl(String str) {
                O90.f(str, "value");
                this.apiUrlProvider = ProviderUtils.providerOf(str);
            }

            public final void setApiUrlProvider(Provider provider) {
                O90.f(provider, "<set-?>");
                this.apiUrlProvider = provider;
            }

            public final void setIoExecutor(Executor executor) {
                this.ioExecutor = executor;
            }

            public final void setOverrideLibToken(String str) {
                this.overrideLibTokenProvider = ProviderUtils.providerOf(str);
            }

            public final void setOverrideLibTokenProvider(Provider provider) {
                O90.f(provider, "<set-?>");
                this.overrideLibTokenProvider = provider;
            }

            public final void setTrafficStatsTag(int i) {
                this.trafficStatsTag = i;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/tracer/lite/TracerLite$Configuration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/lite/TracerLite$Configuration$Builder;", "LTf1;", "block", "Lru/ok/tracer/lite/TracerLite$Configuration;", "build", "(LnZ;)Lru/ok/tracer/lite/TracerLite$Configuration;", "", "DEFAULT_API_URL", "Ljava/lang/String;", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Configuration build(InterfaceC6099nZ block) {
                O90.f(block, "block");
                Builder builder = new Builder();
                block.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ Configuration(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final String getApiUrl() {
            Object obj = this.apiUrlProvider.get();
            O90.e(obj, "apiUrlProvider.get()");
            return (String) obj;
        }

        /* renamed from: getIoExecutor$tracer_lite_commons_release, reason: from getter */
        public final Executor getIoExecutor() {
            return this.ioExecutor;
        }

        /* renamed from: getOverrideLibToken$tracer_lite_commons_release, reason: from getter */
        public final Provider getOverrideLibToken() {
            return this.overrideLibToken;
        }

        /* renamed from: getTrafficStatsTag$tracer_lite_commons_release, reason: from getter */
        public final int getTrafficStatsTag() {
            return this.trafficStatsTag;
        }

        private Configuration(Builder builder) {
            this.apiUrlProvider = builder.getApiUrlProvider();
            this.trafficStatsTag = builder.getTrafficStatsTag();
            this.overrideLibToken = builder.getOverrideLibTokenProvider();
            this.ioExecutor = builder.getIoExecutor();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TracerLite(Context context, String str) {
        this(context, str, null, 4, null);
        O90.f(context, "context");
        O90.f(str, "libraryPackageName");
    }

    public static /* synthetic */ void getLibraryPackageName$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TracerLiteManifest getManifest() {
        return (TracerLiteManifest) this.manifest.getValue();
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final Context getContext() {
        return this.context;
    }

    /* renamed from: getExecutorHolder$tracer_lite_commons_release, reason: from getter */
    public final TracerExecutorsHolder getExecutorHolder() {
        return this.executorHolder;
    }

    /* renamed from: getHttpClientHolder$tracer_lite_commons_release, reason: from getter */
    public final TracerLiteHttpClientHolder getHttpClientHolder() {
        return this.httpClientHolder;
    }

    public final String getLibToken() {
        String str = (String) this.configuration.getOverrideLibToken().get();
        if (str != null) {
            return str;
        }
        TracerLiteManifest manifest = getManifest();
        if (manifest != null) {
            return manifest.appToken();
        }
        return null;
    }

    public final TracerLibraryInfo getLibraryInfo() {
        return (TracerLibraryInfo) this.libraryInfo.getValue();
    }

    public final String getLibraryPackageName() {
        return this.libraryPackageName;
    }

    /* renamed from: getLimits$tracer_lite_commons_release, reason: from getter */
    public final TracerLiteLimits getLimits() {
        return this.limits;
    }

    /* renamed from: getTagsStorage$tracer_lite_commons_release, reason: from getter */
    public final TagsStorageLite getTagsStorage() {
        return this.tagsStorage;
    }

    public final void setKey(String key, String value) {
        O90.f(key, "key");
        this.tagsStorage.setKey(key, value);
    }

    public TracerLite(Context context, String str, Configuration configuration) {
        O90.f(context, "context");
        O90.f(str, "libraryPackageName");
        O90.f(configuration, "configuration");
        this.libraryPackageName = str;
        this.configuration = configuration;
        Context applicationContext = context.getApplicationContext();
        O90.e(applicationContext, "context.applicationContext");
        this.context = applicationContext;
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.manifest = LB.c(enumC4205hi0, new TracerLite$manifest$2(this));
        this.libraryInfo = LB.c(enumC4205hi0, new TracerLite$libraryInfo$2(this));
        this.tagsStorage = new TagsStorageLite();
        this.httpClientHolder = new TracerLiteHttpClientHolder(context, str, configuration.getTrafficStatsTag());
        this.executorHolder = new TracerExecutorsHolder(configuration.getIoExecutor(), str);
        this.limits = new TracerLiteLimits(context, str);
    }

    public /* synthetic */ TracerLite(Context context, String str, Configuration configuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new Configuration.Builder().build() : configuration);
    }
}
