package io.sentry;

import com.vk.push.core.base.AidlException;
import com.yandex.varioqub.config.model.ConfigValue;
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

/* loaded from: classes2.dex */
public class D1 {
    static final EnumC5148n1 DEFAULT_DIAGNOSTIC_LEVEL = EnumC5148n1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.a backpressureMonitor;
    private InterfaceC5169s1 beforeBreadcrumb;
    private InterfaceC5172t1 beforeEmitMetricCallback;
    private InterfaceC5175u1 beforeEnvelopeCallback;
    private InterfaceC5178v1 beforeSend;
    private InterfaceC5181w1 beforeSendReplay;
    private InterfaceC5184x1 beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    io.sentry.clientreport.f clientReportRecorder;
    private H connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private C5187y1 cron;
    private final io.sentry.util.c dateProvider;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC5148n1 diagnosticLevel;
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
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.c envelopeReader;
    private String environment;
    private final List<InterfaceC5173u> eventProcessors;
    private Q executorService;
    private final C5176v experimental;
    private long flushTimeoutMillis;
    private C5182x fullyDisplayedReporter;
    private final List<io.sentry.android.core.internal.gestures.a> gestureTargetLocators;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private X instrumenter;
    private final List<Y> integrations;
    private ILogger logger;
    private io.sentry.util.thread.a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private B1 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<P> observers;
    private final List<L> optionsObservers;
    private final io.sentry.util.c parsedDsn;
    private final List<M> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private InterfaceC5190z1 profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private A1 proxy;
    private int readTimeoutMillis;
    private String release;
    private H0 replayController;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.c serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private H1 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private C1 tracesSampler;
    private b2 transactionPerformanceCollector;
    private V transactionProfiler;
    private W transportFactory;
    private io.sentry.transport.g transportGate;
    private final List<Object> viewHierarchyExporters;

    public D1(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        final int i = 0;
        this.parsedDsn = new io.sentry.util.c(new io.sentry.util.b(this) { // from class: io.sentry.r1
            public final /* synthetic */ D1 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.b
            public final Object c() {
                switch (i) {
                    case 0:
                        return D1.a(this.b);
                    case 1:
                        D1 d1 = this.b;
                        d1.getClass();
                        return new C5144m0(d1);
                    default:
                        return D1.b(this.b);
                }
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = C5174u0.a;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i2 = 1;
        this.serializer = new io.sentry.util.c(new io.sentry.util.b(this) { // from class: io.sentry.r1
            public final /* synthetic */ D1 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.b
            public final Object c() {
                switch (i2) {
                    case 0:
                        return D1.a(this.b);
                    case 1:
                        D1 d1 = this.b;
                        d1.getClass();
                        return new C5144m0(d1);
                    default:
                        return D1.b(this.b);
                }
            }
        });
        final int i3 = 2;
        this.envelopeReader = new io.sentry.util.c(new io.sentry.util.b(this) { // from class: io.sentry.r1
            public final /* synthetic */ D1 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.b
            public final Object c() {
                switch (i3) {
                    case 0:
                        return D1.a(this.b);
                    case 1:
                        D1 d1 = this.b;
                        d1.getClass();
                        return new C5144m0(d1);
                    default:
                        return D1.b(this.b);
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C5189z0.a;
        this.transportGate = io.sentry.transport.d.b;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C5177v0.d;
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.h.a;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = B1.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C5177v0.f;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C5142l1(this);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = X.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = io.sentry.util.thread.c.a;
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.c(new C(2));
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = C5177v0.e;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C5182x.b;
        this.connectionStatusProvider = new C5165r0();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.backpressureMonitor = io.sentry.backpressure.b.a;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.enableMetrics = false;
        this.enableDefaultTagsForMetrics = true;
        this.enableSpanLocalMetricAggregation = true;
        this.profilingTracesHz = AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
        this.cron = null;
        this.replayController = C5177v0.c;
        this.enableScreenTracking = true;
        io.sentry.protocol.r rVar = new io.sentry.protocol.r("sentry.java", "7.20.1");
        rVar.b = "7.20.1";
        this.experimental = new C5176v();
        this.sessionReplay = new H1(z, rVar);
        if (z) {
            return;
        }
        this.executorService = new com.yandex.metrica.e(4, false);
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new C5147n0(this));
        copyOnWriteArrayList.add(new C5137k(this));
        if (!io.sentry.util.e.a) {
            copyOnWriteArrayList.add(new C5137k());
        }
        setSentryClientName("sentry.java/7.20.1");
        setSdkVersion(rVar);
        C5142l1.v().o("maven:io.sentry:sentry", "7.20.1");
    }

    public static /* synthetic */ r a(D1 d1) {
        return new r(d1.dsn);
    }

    public static /* synthetic */ C5167s b(D1 d1) {
        d1.getClass();
        return new C5167s((S) d1.serializer.a());
    }

    public static D1 empty() {
        return new D1(true);
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

    public void addEventProcessor(InterfaceC5173u interfaceC5173u) {
        this.eventProcessors.add(interfaceC5173u);
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

    public void addIntegration(Y y) {
        this.integrations.add(y);
    }

    public void addOptionsObserver(L l) {
        this.optionsObservers.add(l);
    }

    public void addPerformanceCollector(M m) {
        this.performanceCollectors.add(m);
    }

    public void addScopeObserver(P p) {
        this.observers.add(p);
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

    public io.sentry.backpressure.a getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public InterfaceC5169s1 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public InterfaceC5172t1 getBeforeEmitMetricCallback() {
        return null;
    }

    public InterfaceC5175u1 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public InterfaceC5178v1 getBeforeSend() {
        return this.beforeSend;
    }

    public InterfaceC5181w1 getBeforeSendReplay() {
        return null;
    }

    public InterfaceC5184x1 getBeforeSendTransaction() {
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

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public H getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public C5187y1 getCron() {
        return this.cron;
    }

    public InterfaceC5112b1 getDateProvider() {
        return (InterfaceC5112b1) this.dateProvider.a();
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC5148n1 getDiagnosticLevel() {
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

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public I getEnvelopeReader() {
        return (I) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC5173u> getEventProcessors() {
        return this.eventProcessors;
    }

    public Q getExecutorService() {
        return this.executorService;
    }

    public C5176v getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C5182x getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.android.core.internal.gestures.a> getGestureTargetLocators() {
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

    public X getInstrumenter() {
        return this.instrumenter;
    }

    public List<Y> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public io.sentry.util.thread.a getMainThreadChecker() {
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

    public B1 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public List<L> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<M> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public InterfaceC5190z1 getProfilesSampler() {
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

    public A1 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public H0 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<P> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public S getSerializer() {
        return (S) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public H1 getSessionReplay() {
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

    public C1 getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public b2 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public V getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public W getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.g getTransportGate() {
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

    public void merge(C5179w c5179w) {
        String str = c5179w.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = c5179w.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = c5179w.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = c5179w.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = c5179w.e;
        if (str5 != null) {
            setServerName(str5);
        }
        A1 a1 = c5179w.m;
        if (a1 != null) {
            setProxy(a1);
        }
        Boolean bool = c5179w.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = c5179w.u;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Boolean bool3 = c5179w.i;
        if (bool3 != null) {
            setEnableTracing(bool3);
        }
        Double d = c5179w.j;
        if (d != null) {
            setTracesSampleRate(d);
        }
        Double d2 = c5179w.k;
        if (d2 != null) {
            setProfilesSampleRate(d2);
        }
        Boolean bool4 = c5179w.g;
        if (bool4 != null) {
            setDebug(bool4.booleanValue());
        }
        Boolean bool5 = c5179w.h;
        if (bool5 != null) {
            setEnableDeduplication(bool5.booleanValue());
        }
        Boolean bool6 = c5179w.v;
        if (bool6 != null) {
            setSendClientReports(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(c5179w.l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c5179w.o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c5179w.n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c5179w.t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c5179w.p != null) {
            setTracePropagationTargets(new ArrayList(c5179w.p));
        }
        Iterator it4 = new ArrayList(c5179w.q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = c5179w.r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = c5179w.s;
        if (l != null) {
            setIdleTimeout(l);
        }
        Iterator it5 = c5179w.w.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = c5179w.x;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = c5179w.y;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = c5179w.A;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (c5179w.z != null) {
            setIgnoredCheckIns(new ArrayList(c5179w.z));
        }
        Boolean bool10 = c5179w.B;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        if (c5179w.C != null) {
            if (getCron() == null) {
                setCron(c5179w.C);
                return;
            }
            if (c5179w.C.a != null) {
                getCron().a = c5179w.C.a;
            }
            if (c5179w.C.b != null) {
                getCron().b = c5179w.C.b;
            }
            if (c5179w.C.c != null) {
                getCron().c = c5179w.C.c;
            }
            if (c5179w.C.d != null) {
                getCron().d = c5179w.C.d;
            }
            if (c5179w.C.e != null) {
                getCron().e = c5179w.C.e;
            }
        }
    }

    public r retrieveParsedDsn() throws IllegalArgumentException {
        return (r) this.parsedDsn.a();
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

    public void setBackpressureMonitor(io.sentry.backpressure.a aVar) {
        this.backpressureMonitor = aVar;
    }

    public void setBeforeBreadcrumb(InterfaceC5169s1 interfaceC5169s1) {
        this.beforeBreadcrumb = interfaceC5169s1;
    }

    public void setBeforeEmitMetricCallback(InterfaceC5172t1 interfaceC5172t1) {
    }

    public void setBeforeEnvelopeCallback(InterfaceC5175u1 interfaceC5175u1) {
        this.beforeEnvelopeCallback = interfaceC5175u1;
    }

    public void setBeforeSend(InterfaceC5178v1 interfaceC5178v1) {
        this.beforeSend = interfaceC5178v1;
    }

    public void setBeforeSendReplay(InterfaceC5181w1 interfaceC5181w1) {
    }

    public void setBeforeSendTransaction(InterfaceC5184x1 interfaceC5184x1) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionStatusProvider(H h) {
        this.connectionStatusProvider = h;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setCron(C5187y1 c5187y1) {
        this.cron = c5187y1;
    }

    public void setDateProvider(InterfaceC5112b1 interfaceC5112b1) {
        io.sentry.util.c cVar = this.dateProvider;
        synchronized (cVar) {
            cVar.a = interfaceC5112b1;
        }
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDiagnosticLevel(EnumC5148n1 enumC5148n1) {
        if (enumC5148n1 == null) {
            enumC5148n1 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC5148n1;
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
        io.sentry.util.c cVar = this.parsedDsn;
        synchronized (cVar) {
            string = null;
            cVar.a = null;
        }
        String str2 = this.dsn;
        ILogger iLogger = this.logger;
        Charset charset = io.sentry.util.h.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.h.a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                iLogger.d(EnumC5148n1.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                iLogger.k(EnumC5148n1.INFO, "string: %s could not calculate its hash", th, str2);
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

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.h.a;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(I i) {
        io.sentry.util.c cVar = this.envelopeReader;
        if (i == null) {
            i = C5168s0.a;
        }
        synchronized (cVar) {
            cVar.a = i;
        }
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(Q q) {
        if (q != null) {
            this.executorService = q;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setFullyDisplayedReporter(C5182x c5182x) {
        this.fullyDisplayedReporter = c5182x;
    }

    public void setGestureTargetLocators(List<io.sentry.android.core.internal.gestures.a> list) {
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

    public void setInstrumenter(X x) {
        this.instrumenter = x;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? C5174u0.a : new io.sentry.internal.debugmeta.c(this, iLogger);
    }

    public void setMainThreadChecker(io.sentry.util.thread.a aVar) {
        this.mainThreadChecker = aVar;
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

    public void setMaxRequestBodySize(B1 b1) {
        this.maxRequestBodySize = b1;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.config.a.y(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(InterfaceC5190z1 interfaceC5190z1) {
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

    public void setProxy(A1 a1) {
        this.proxy = a1;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(H0 h0) {
        if (h0 == null) {
            h0 = C5177v0.c;
        }
        this.replayController = h0;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.config.a.y(d, true)) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVar2 = getSessionReplay().m;
        io.sentry.protocol.r rVar3 = this.sdkVersion;
        if (rVar3 != null && rVar2 != null && rVar3.equals(rVar2)) {
            getSessionReplay().m = rVar;
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C5142l1(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.i();
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

    public void setSerializer(S s) {
        io.sentry.util.c cVar = this.serializer;
        if (s == null) {
            s = C5180w0.a;
        }
        synchronized (cVar) {
            cVar.a = s;
        }
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(H1 h1) {
        this.sessionReplay = h1;
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
        if (io.sentry.config.a.y(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(C1 c1) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(b2 b2Var) {
        this.transactionPerformanceCollector = b2Var;
    }

    public void setTransactionProfiler(V v) {
        if (this.transactionProfiler != C5177v0.f || v == null) {
            return;
        }
        this.transactionProfiler = v;
    }

    public void setTransportFactory(W w) {
        if (w == null) {
            w = C5189z0.a;
        }
        this.transportFactory = w;
    }

    public void setTransportGate(io.sentry.transport.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.d.b;
        }
        this.transportGate = gVar;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
