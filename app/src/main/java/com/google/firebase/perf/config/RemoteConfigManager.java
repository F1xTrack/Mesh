package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C0786MU;
import p000.C11159tQ0;
import p000.C11991zy0;
import p000.C1254Tw;
import p000.C4108gJ;
import p000.C6556oV;
import p000.C6621pV;
import p000.C6989v4;
import p000.C7142xV;
import p000.C7277ze;
import p000.C9450g32;
import p000.EQ0;
import p000.InterfaceC7079wV;
import p000.InterfaceC9347fG0;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, InterfaceC7079wV> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C4108gJ cache;
    private final Executor executor;
    private C6621pV firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC9347fG0 firebaseRemoteConfigProvider;
    private static final C6989v4 logger = C6989v4.m25319d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C4108gJ.m18419b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS), getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        C7277ze c7277ze;
        try {
            c7277ze = (C7277ze) C0786MU.m5375d().m5380b(C7277ze.class);
        } catch (IllegalStateException unused) {
            logger.m25320a();
            c7277ze = null;
        }
        return c7277ze != null ? c7277ze.f46918a : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private InterfaceC7079wV getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        InterfaceC7079wV interfaceC7079wV = this.allRcConfigMap.get(str);
        C7142xV c7142xV = (C7142xV) interfaceC7079wV;
        if (c7142xV.f45662b != 2) {
            return null;
        }
        logger.m25321b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", c7142xV.m25909d(), str);
        return interfaceC7079wV;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m11326xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m23806b());
    }

    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m11327xc904e814(Exception exc) {
        logger.m25325g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        C6621pV c6621pV = this.firebaseRemoteConfig;
        C9450g32 c9450g32M18387n = c6621pV.m23805a().m18387n(c6621pV.f40116c, new C6556oV(c6621pV));
        c9450g32M18387n.mo11138e(this.executor, new EQ0(this));
        c9450g32M18387n.mo11137d(this.executor, new EQ0(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m23806b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C11991zy0 getBoolean(String str) {
        if (str == null) {
            logger.m25320a();
            return new C11991zy0();
        }
        InterfaceC7079wV remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C11991zy0(Boolean.valueOf(((C7142xV) remoteConfigValue).m25906a()));
            } catch (IllegalArgumentException unused) {
                C7142xV c7142xV = (C7142xV) remoteConfigValue;
                if (!c7142xV.m25909d().isEmpty()) {
                    logger.m25321b("Could not parse value: '%s' for key: '%s'.", c7142xV.m25909d(), str);
                }
            }
        }
        return new C11991zy0();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C11991zy0 getDouble(String str) {
        if (str == null) {
            logger.m25320a();
            return new C11991zy0();
        }
        InterfaceC7079wV remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C11991zy0(Double.valueOf(((C7142xV) remoteConfigValue).m25907b()));
            } catch (IllegalArgumentException unused) {
                C7142xV c7142xV = (C7142xV) remoteConfigValue;
                if (!c7142xV.m25909d().isEmpty()) {
                    logger.m25321b("Could not parse value: '%s' for key: '%s'.", c7142xV.m25909d(), str);
                }
            }
        }
        return new C11991zy0();
    }

    public C11991zy0 getLong(String str) {
        if (str == null) {
            logger.m25320a();
            return new C11991zy0();
        }
        InterfaceC7079wV remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C11991zy0(Long.valueOf(((C7142xV) remoteConfigValue).m25908c()));
            } catch (IllegalArgumentException unused) {
                C7142xV c7142xV = (C7142xV) remoteConfigValue;
                if (!c7142xV.m25909d().isEmpty()) {
                    logger.m25321b("Could not parse value: '%s' for key: '%s'.", c7142xV.m25909d(), str);
                }
            }
        }
        return new C11991zy0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        Object objValueOf;
        InterfaceC7079wV remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t;
        }
        try {
            if (t instanceof Boolean) {
                objValueOf = Boolean.valueOf(((C7142xV) remoteConfigValue).m25906a());
            } else if (t instanceof Double) {
                objValueOf = Double.valueOf(((C7142xV) remoteConfigValue).m25907b());
            } else if ((t instanceof Long) || (t instanceof Integer)) {
                objValueOf = Long.valueOf(((C7142xV) remoteConfigValue).m25908c());
            } else {
                if (!(t instanceof String)) {
                    T t2 = (T) ((C7142xV) remoteConfigValue).m25909d();
                    try {
                        logger.m25321b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        C7142xV c7142xV = (C7142xV) remoteConfigValue;
                        if (c7142xV.m25909d().isEmpty()) {
                            return t;
                        }
                        logger.m25321b("Could not parse value: '%s' for key: '%s'.", c7142xV.m25909d(), str);
                        return t;
                    }
                }
                objValueOf = ((C7142xV) remoteConfigValue).m25909d();
            }
            return objValueOf;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public C11991zy0 getString(String str) {
        if (str == null) {
            logger.m25320a();
            return new C11991zy0();
        }
        InterfaceC7079wV remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new C11991zy0(((C7142xV) remoteConfigValue).m25909d()) : new C11991zy0();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC9347fG0 interfaceC9347fG0;
        C11159tQ0 c11159tQ0;
        if (this.firebaseRemoteConfig == null && (interfaceC9347fG0 = this.firebaseRemoteConfigProvider) != null && (c11159tQ0 = (C11159tQ0) interfaceC9347fG0.get()) != null) {
            this.firebaseRemoteConfig = c11159tQ0.m24930b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        C6621pV c6621pV = this.firebaseRemoteConfig;
        return c6621pV == null || c6621pV.m23807c().f43095b == 1 || this.firebaseRemoteConfig.m23807c().f43095b == 2;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC9347fG0 interfaceC9347fG0) {
        this.firebaseRemoteConfigProvider = interfaceC9347fG0;
    }

    public void syncConfigValues(Map<String, InterfaceC7079wV> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        C1254Tw c1254TwM7826d = C1254Tw.m7826d();
        ConcurrentHashMap<String, InterfaceC7079wV> concurrentHashMap = this.allRcConfigMap;
        c1254TwM7826d.getClass();
        InterfaceC7079wV interfaceC7079wV = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (interfaceC7079wV == null) {
            logger.m25320a();
            return;
        }
        try {
            this.cache.m18424g("com.google.firebase.perf.ExperimentTTID", ((C7142xV) interfaceC7079wV).m25906a());
        } catch (Exception unused) {
            logger.m25320a();
        }
    }

    public RemoteConfigManager(C4108gJ c4108gJ, Executor executor, C6621pV c6621pV, long j, long j2) {
        ConcurrentHashMap<String, InterfaceC7079wV> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = c4108gJ;
        this.executor = executor;
        this.firebaseRemoteConfig = c6621pV;
        if (c6621pV == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(c6621pV.m23806b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
