package io.sentry;

import com.p019vk.push.core.base.AidlException;
import com.yandex.metrica.C2460e;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.android.core.internal.gestures.C5871a;
import io.sentry.backpressure.C5984b;
import io.sentry.backpressure.InterfaceC5983a;
import io.sentry.cache.InterfaceC5992d;
import io.sentry.clientreport.InterfaceC6002f;
import io.sentry.config.AbstractC6003a;
import io.sentry.hints.C6034i;
import io.sentry.internal.debugmeta.C6041b;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.internal.debugmeta.InterfaceC6040a;
import io.sentry.internal.modules.C6049e;
import io.sentry.internal.modules.InterfaceC6045a;
import io.sentry.protocol.C6102r;
import io.sentry.transport.C6152d;
import io.sentry.transport.C6156h;
import io.sentry.transport.InterfaceC6155g;
import io.sentry.util.AbstractC6172e;
import io.sentry.util.AbstractC6175h;
import io.sentry.util.C6170c;
import io.sentry.util.InterfaceC6169b;
import io.sentry.util.thread.C6178c;
import io.sentry.util.thread.InterfaceC6176a;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.sentry.D1 */
/* loaded from: classes2.dex */
public class C5759D1 {
    static final EnumC6069n1 DEFAULT_DIAGNOSTIC_LEVEL = EnumC6069n1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private InterfaceC5983a backpressureMonitor;
    private InterfaceC6145s1 beforeBreadcrumb;
    private InterfaceC6148t1 beforeEmitMetricCallback;
    private InterfaceC6167u1 beforeEnvelopeCallback;
    private InterfaceC6181v1 beforeSend;
    private InterfaceC6189w1 beforeSendReplay;
    private InterfaceC6192x1 beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    InterfaceC6002f clientReportRecorder;
    private InterfaceC5769H connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private C6195y1 cron;
    private final C6170c dateProvider;
    private boolean debug;
    private InterfaceC6040a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC6069n1 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableDefaultTagsForMetrics;
    private boolean enableExternalConfiguration;
    private boolean enableMetrics;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpanLocalMetricAggregation;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private InterfaceC5992d envelopeDiskCache;
    private final C6170c envelopeReader;
    private String environment;
    private final List<InterfaceC6165u> eventProcessors;
    private InterfaceC5796Q executorService;
    private final C6179v experimental;
    private long flushTimeoutMillis;
    private C6190x fullyDisplayedReporter;
    private final List<C5871a> gestureTargetLocators;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC5816X instrumenter;
    private final List<InterfaceC5819Y> integrations;
    private ILogger logger;
    private InterfaceC6176a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private EnumC5753B1 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private InterfaceC6045a modulesLoader;
    private final List<InterfaceC5793P> observers;
    private final List<InterfaceC5781L> optionsObservers;
    private final C6170c parsedDsn;
    private final List<InterfaceC5784M> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private InterfaceC6198z1 profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private C5750A1 proxy;
    private int readTimeoutMillis;
    private String release;
    private InterfaceC5770H0 replayController;
    private Double sampleRate;
    private C6102r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final C6170c serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private C5771H1 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private InterfaceC5756C1 tracesSampler;
    private InterfaceC5982b2 transactionPerformanceCollector;
    private InterfaceC5810V transactionProfiler;
    private InterfaceC5813W transportFactory;
    private InterfaceC6155g transportGate;
    private final List<Object> viewHierarchyExporters;

    public C5759D1(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        final int i = 0;
        this.parsedDsn = new C6170c(new InterfaceC6169b(this) { // from class: io.sentry.r1

            /* renamed from: b */
            public final /* synthetic */ C5759D1 f34512b;

            {
                this.f34512b = this;
            }

            @Override // io.sentry.util.InterfaceC6169b
            /* renamed from: c */
            public final Object mo3171c() {
                switch (i) {
                    case 0:
                        return C5759D1.m21382a(this.f34512b);
                    case 1:
                        C5759D1 c5759d1 = this.f34512b;
                        c5759d1.getClass();
                        return new C6061m0(c5759d1);
                    default:
                        return C5759D1.m21383b(this.f34512b);
                }
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = C6166u0.f34658a;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i2 = 1;
        this.serializer = new C6170c(new InterfaceC6169b(this) { // from class: io.sentry.r1

            /* renamed from: b */
            public final /* synthetic */ C5759D1 f34512b;

            {
                this.f34512b = this;
            }

            @Override // io.sentry.util.InterfaceC6169b
            /* renamed from: c */
            public final Object mo3171c() {
                switch (i2) {
                    case 0:
                        return C5759D1.m21382a(this.f34512b);
                    case 1:
                        C5759D1 c5759d1 = this.f34512b;
                        c5759d1.getClass();
                        return new C6061m0(c5759d1);
                    default:
                        return C5759D1.m21383b(this.f34512b);
                }
            }
        });
        final int i3 = 2;
        this.envelopeReader = new C6170c(new InterfaceC6169b(this) { // from class: io.sentry.r1

            /* renamed from: b */
            public final /* synthetic */ C5759D1 f34512b;

            {
                this.f34512b = this;
            }

            @Override // io.sentry.util.InterfaceC6169b
            /* renamed from: c */
            public final Object mo3171c() {
                switch (i3) {
                    case 0:
                        return C5759D1.m21382a(this.f34512b);
                    case 1:
                        C5759D1 c5759d1 = this.f34512b;
                        c5759d1.getClass();
                        return new C6061m0(c5759d1);
                    default:
                        return C5759D1.m21383b(this.f34512b);
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C6197z0.f34752a;
        this.transportGate = C6152d.f34634b;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C6180v0.f34674d;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = C6156h.f34640a;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = EnumC5753B1.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C6180v0.f34676f;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C6059l1(this);
        this.modulesLoader = C6049e.f34212a;
        this.debugMetaLoader = C6041b.f34196a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC5816X.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = C6178c.f34671a;
        this.traceOptionsRequests = true;
        this.dateProvider = new C6170c(new C5754C(2));
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = C6180v0.f34675e;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C6190x.f34735b;
        this.connectionStatusProvider = new C6115r0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.backpressureMonitor = C5984b.f34085a;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.enableMetrics = false;
        this.enableDefaultTagsForMetrics = true;
        this.enableSpanLocalMetricAggregation = true;
        this.profilingTracesHz = AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
        this.cron = null;
        this.replayController = C6180v0.f34673c;
        this.enableScreenTracking = true;
        C6102r c6102r = new C6102r("sentry.java", "7.20.1");
        c6102r.f34431b = "7.20.1";
        this.experimental = new C6179v();
        this.sessionReplay = new C5771H1(z, c6102r);
        if (z) {
            return;
        }
        this.executorService = new C2460e(4, false);
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new C6068n0(this));
        copyOnWriteArrayList.add(new C6054k(this));
        if (!AbstractC6172e.f34662a) {
            copyOnWriteArrayList.add(new C6054k());
        }
        setSentryClientName("sentry.java/7.20.1");
        setSdkVersion(c6102r);
        C6059l1.m21830v().m21832o("maven:io.sentry:sentry", "7.20.1");
    }

    /* renamed from: a */
    public static /* synthetic */ C6114r m21382a(C5759D1 c5759d1) {
        return new C6114r(c5759d1.dsn);
    }

    /* renamed from: b */
    public static /* synthetic */ C6143s m21383b(C5759D1 c5759d1) {
        c5759d1.getClass();
        return new C6143s((InterfaceC5801S) c5759d1.serializer.m21880a());
    }

    public static C5759D1 empty() {
        return new C5759D1(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC6165u interfaceC6165u) {
        this.eventProcessors.add(interfaceC6165u);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(InterfaceC5819Y interfaceC5819Y) {
        this.integrations.add(interfaceC5819Y);
    }

    public void addOptionsObserver(InterfaceC5781L interfaceC5781L) {
        this.optionsObservers.add(interfaceC5781L);
    }

    public void addPerformanceCollector(InterfaceC5784M interfaceC5784M) {
        this.performanceCollectors.add(interfaceC5784M);
    }

    public void addScopeObserver(InterfaceC5793P interfaceC5793P) {
        this.observers.add(interfaceC5793P);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public InterfaceC5983a getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC6145s1 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public InterfaceC6148t1 getBeforeEmitMetricCallback() {
        return null;
    }

    public InterfaceC6167u1 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public InterfaceC6181v1 getBeforeSend() {
        return this.beforeSend;
    }

    public InterfaceC6189w1 getBeforeSendReplay() {
        return null;
    }

    public InterfaceC6192x1 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public InterfaceC6002f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public InterfaceC5769H getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public C6195y1 getCron() {
        return this.cron;
    }

    public InterfaceC5981b1 getDateProvider() {
        return (InterfaceC5981b1) this.dateProvider.m21880a();
    }

    public InterfaceC6040a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC6069n1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    @Deprecated
    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public InterfaceC5992d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC5772I getEnvelopeReader() {
        return (InterfaceC5772I) this.envelopeReader.m21880a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC6165u> getEventProcessors() {
        return this.eventProcessors;
    }

    public InterfaceC5796Q getExecutorService() {
        return this.executorService;
    }

    public C6179v getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C6190x getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<C5871a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC5816X getInstrumenter() {
        return this.instrumenter;
    }

    public List<InterfaceC5819Y> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public InterfaceC6176a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public EnumC5753B1 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public InterfaceC6045a getModulesLoader() {
        return this.modulesLoader;
    }

    public List<InterfaceC5781L> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<InterfaceC5784M> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC6198z1 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public C5750A1 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public InterfaceC5770H0 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC5793P> getScopeObservers() {
        return this.observers;
    }

    public C6102r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC5801S getSerializer() {
        return (InterfaceC5801S) this.serializer.m21880a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public C5771H1 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public InterfaceC5756C1 getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public InterfaceC5982b2 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public InterfaceC5810V getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC5813W getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC6155g getTransportGate() {
        return this.transportGate;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableDefaultTagsForMetrics() {
        return isEnableMetrics() && this.enableDefaultTagsForMetrics;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpanLocalMetricAggregation() {
        return isEnableMetrics() && this.enableSpanLocalMetricAggregation;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() throws IllegalArgumentException {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(C6187w c6187w) {
        String str = c6187w.f34708a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c6187w.f34709b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c6187w.f34710c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c6187w.f34711d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c6187w.f34712e;
        if (str5 != null) {
            setServerName(str5);
        }
        C5750A1 c5750a1 = c6187w.f34720m;
        if (c5750a1 != null) {
            setProxy(c5750a1);
        }
        Boolean bool = c6187w.f34713f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c6187w.f34728u;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Boolean bool3 = c6187w.f34716i;
        if (bool3 != null) {
            setEnableTracing(bool3);
        }
        Double d = c6187w.f34717j;
        if (d != null) {
            setTracesSampleRate(d);
        }
        Double d2 = c6187w.f34718k;
        if (d2 != null) {
            setProfilesSampleRate(d2);
        }
        Boolean bool4 = c6187w.f34714g;
        if (bool4 != null) {
            setDebug(bool4.booleanValue());
        }
        Boolean bool5 = c6187w.f34715h;
        if (bool5 != null) {
            setEnableDeduplication(bool5.booleanValue());
        }
        Boolean bool6 = c6187w.f34729v;
        if (bool6 != null) {
            setSendClientReports(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c6187w.f34719l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c6187w.f34722o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c6187w.f34721n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c6187w.f34727t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c6187w.f34723p != null) {
            setTracePropagationTargets(new ArrayList(c6187w.f34723p));
        }
        Iterator it4 = new ArrayList(c6187w.f34724q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c6187w.f34725r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = c6187w.f34726s;
        if (l != null) {
            setIdleTimeout(l);
        }
        Iterator it5 = c6187w.f34730w.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c6187w.f34731x;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c6187w.f34732y;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c6187w.f34705A;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c6187w.f34733z != null) {
            setIgnoredCheckIns(new ArrayList(c6187w.f34733z));
        }
        Boolean bool10 = c6187w.f34706B;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        if (c6187w.f34707C != null) {
            if (getCron() == null) {
                setCron(c6187w.f34707C);
                return;
            }
            if (c6187w.f34707C.f34746a != null) {
                getCron().f34746a = c6187w.f34707C.f34746a;
            }
            if (c6187w.f34707C.f34747b != null) {
                getCron().f34747b = c6187w.f34707C.f34747b;
            }
            if (c6187w.f34707C.f34748c != null) {
                getCron().f34748c = c6187w.f34707C.f34748c;
            }
            if (c6187w.f34707C.f34749d != null) {
                getCron().f34749d = c6187w.f34707C.f34749d;
            }
            if (c6187w.f34707C.f34750e != null) {
                getCron().f34750e = c6187w.f34707C.f34750e;
            }
        }
    }

    public C6114r retrieveParsedDsn() throws IllegalArgumentException {
        return (C6114r) this.parsedDsn.m21880a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(InterfaceC5983a interfaceC5983a) {
        this.backpressureMonitor = interfaceC5983a;
    }

    public void setBeforeBreadcrumb(InterfaceC6145s1 interfaceC6145s1) {
        this.beforeBreadcrumb = interfaceC6145s1;
    }

    public void setBeforeEmitMetricCallback(InterfaceC6148t1 interfaceC6148t1) {
    }

    public void setBeforeEnvelopeCallback(InterfaceC6167u1 interfaceC6167u1) {
        this.beforeEnvelopeCallback = interfaceC6167u1;
    }

    public void setBeforeSend(InterfaceC6181v1 interfaceC6181v1) {
        this.beforeSend = interfaceC6181v1;
    }

    public void setBeforeSendReplay(InterfaceC6189w1 interfaceC6189w1) {
    }

    public void setBeforeSendTransaction(InterfaceC6192x1 interfaceC6192x1) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(InterfaceC5769H interfaceC5769H) {
        this.connectionStatusProvider = interfaceC5769H;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setCron(C6195y1 c6195y1) {
        this.cron = c6195y1;
    }

    public void setDateProvider(InterfaceC5981b1 interfaceC5981b1) {
        C6170c c6170c = this.dateProvider;
        synchronized (c6170c) {
            c6170c.f34660a = interfaceC5981b1;
        }
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(InterfaceC6040a interfaceC6040a) {
        if (interfaceC6040a == null) {
            interfaceC6040a = C6041b.f34196a;
        }
        this.debugMetaLoader = interfaceC6040a;
    }

    public void setDiagnosticLevel(EnumC6069n1 enumC6069n1) {
        if (enumC6069n1 == null) {
            enumC6069n1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC6069n1;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        String string;
        this.dsn = str;
        C6170c c6170c = this.parsedDsn;
        synchronized (c6170c) {
            string = null;
            c6170c.f34660a = null;
        }
        String str2 = this.dsn;
        ILogger iLogger = this.logger;
        Charset charset = AbstractC6175h.f34667a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(AbstractC6175h.f34667a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                iLogger.mo21406d(EnumC6069n1.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                iLogger.mo21407k(EnumC6069n1.INFO, "string: %s could not calculate its hash", th, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableDefaultTagsForMetrics(boolean z) {
        this.enableDefaultTagsForMetrics = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableMetrics(boolean z) {
        this.enableMetrics = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpanLocalMetricAggregation(boolean z) {
        this.enableSpanLocalMetricAggregation = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    @Deprecated
    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(InterfaceC5992d interfaceC5992d) {
        if (interfaceC5992d == null) {
            interfaceC5992d = C6156h.f34640a;
        }
        this.envelopeDiskCache = interfaceC5992d;
    }

    public void setEnvelopeReader(InterfaceC5772I interfaceC5772I) {
        C6170c c6170c = this.envelopeReader;
        if (interfaceC5772I == null) {
            interfaceC5772I = C6144s0.f34613a;
        }
        synchronized (c6170c) {
            c6170c.f34660a = interfaceC5772I;
        }
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(InterfaceC5796Q interfaceC5796Q) {
        if (interfaceC5796Q != null) {
            this.executorService = interfaceC5796Q;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setFullyDisplayedReporter(C6190x c6190x) {
        this.fullyDisplayedReporter = c6190x;
    }

    public void setGestureTargetLocators(List<C5871a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(EnumC5816X enumC5816X) {
        this.instrumenter = enumC5816X;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? C6166u0.f34658a : new C6042c(this, iLogger);
    }

    public void setMainThreadChecker(InterfaceC6176a interfaceC6176a) {
        this.mainThreadChecker = interfaceC6176a;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(EnumC5753B1 enumC5753B1) {
        this.maxRequestBodySize = enumC5753B1;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(InterfaceC6045a interfaceC6045a) {
        if (interfaceC6045a == null) {
            interfaceC6045a = C6049e.f34212a;
        }
        this.modulesLoader = interfaceC6045a;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (AbstractC6003a.m21764y(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC6198z1 interfaceC6198z1) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(C5750A1 c5750a1) {
        this.proxy = c5750a1;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(InterfaceC5770H0 interfaceC5770H0) {
        if (interfaceC5770H0 == null) {
            interfaceC5770H0 = C6180v0.f34673c;
        }
        this.replayController = interfaceC5770H0;
    }

    public void setSampleRate(Double d) {
        if (AbstractC6003a.m21764y(d, true)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(C6102r c6102r) {
        C6102r c6102r2 = getSessionReplay().f33295m;
        C6102r c6102r3 = this.sdkVersion;
        if (c6102r3 != null && c6102r2 != null && c6102r3.equals(c6102r2)) {
            getSessionReplay().f33295m = c6102r;
        }
        this.sdkVersion = c6102r;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C6059l1(this);
        } else {
            this.clientReportRecorder = new C6034i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC5801S interfaceC5801S) {
        C6170c c6170c = this.serializer;
        if (interfaceC5801S == null) {
            interfaceC5801S = C6188w0.f34734a;
        }
        synchronized (c6170c) {
            c6170c.f34660a = interfaceC5801S;
        }
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(C5771H1 c5771h1) {
        this.sessionReplay = c5771h1;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    @Deprecated
    public void setShutdownTimeout(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (AbstractC6003a.m21764y(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(InterfaceC5756C1 interfaceC5756C1) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(InterfaceC5982b2 interfaceC5982b2) {
        this.transactionPerformanceCollector = interfaceC5982b2;
    }

    public void setTransactionProfiler(InterfaceC5810V interfaceC5810V) {
        if (this.transactionProfiler != C6180v0.f34676f || interfaceC5810V == null) {
            return;
        }
        this.transactionProfiler = interfaceC5810V;
    }

    public void setTransportFactory(InterfaceC5813W interfaceC5813W) {
        if (interfaceC5813W == null) {
            interfaceC5813W = C6197z0.f34752a;
        }
        this.transportFactory = interfaceC5813W;
    }

    public void setTransportGate(InterfaceC6155g interfaceC6155g) {
        if (interfaceC6155g == null) {
            interfaceC6155g = C6152d.f34634b;
        }
        this.transportGate = interfaceC6155g;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
