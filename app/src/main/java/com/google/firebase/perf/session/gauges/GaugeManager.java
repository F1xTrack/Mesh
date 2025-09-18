package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11153tN0;
import p000.AbstractC9441g02;
import p000.C0751Lw;
import p000.C0876Nv;
import p000.C10079l00;
import p000.C10207m00;
import p000.C10809qh0;
import p000.C11211tq0;
import p000.C11991zy0;
import p000.C1768bA;
import p000.C3911dA;
import p000.C4022ex;
import p000.C4211hx;
import p000.C6989v4;
import p000.C7115x4;
import p000.C7731Ia1;
import p000.C8619Zc1;
import p000.C9695i00;
import p000.C9823j00;
import p000.C9951k00;
import p000.EnumC3909d8;
import p000.JA0;
import p000.RunnableC1647aA;
import p000.RunnableC8176Qp0;
import p000.RunnableC9567h00;

@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC3909d8 applicationProcessState;
    private final C0751Lw configResolver;
    private final C10809qh0 cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C10809qh0 gaugeManagerExecutor;
    private C9951k00 gaugeMetadataManager;
    private final C10809qh0 memoryGaugeCollector;
    private String sessionId;
    private final C8619Zc1 transportManager;
    private static final C6989v4 logger = C6989v4.m25319d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C10809qh0(new C0876Nv(6)), C8619Zc1.f15028s, C0751Lw.m5135e(), null, new C10809qh0(new C0876Nv(7)), new C10809qh0(new C0876Nv(8)));
    }

    private static void collectGaugeMetricOnce(C1768bA c1768bA, C11211tq0 c11211tq0, C7731Ia1 c7731Ia1) {
        synchronized (c1768bA) {
            try {
                c1768bA.f16840b.schedule(new RunnableC1647aA(c1768bA, c7731Ia1, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C6989v4 c6989v4 = C1768bA.f16837g;
                e.getMessage();
                c6989v4.m25324f();
            }
        }
        c11211tq0.m24996a(c7731Ia1);
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC3909d8 enumC3909d8) {
        C4022ex c4022ex;
        long jLongValue;
        int iOrdinal = enumC3909d8.ordinal();
        if (iOrdinal != 1) {
            jLongValue = iOrdinal != 2 ? -1L : this.configResolver.m5154p();
        } else {
            C0751Lw c0751Lw = this.configResolver;
            c0751Lw.getClass();
            synchronized (C4022ex.class) {
                try {
                    if (C4022ex.f26948a == null) {
                        C4022ex.f26948a = new C4022ex();
                    }
                    c4022ex = C4022ex.f26948a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11991zy0 c11991zy0M5150l = c0751Lw.m5150l(c4022ex);
            if (c11991zy0M5150l.m26594b() && C0751Lw.m5138t(((Long) c11991zy0M5150l.m26593a()).longValue())) {
                jLongValue = ((Long) c11991zy0M5150l.m26593a()).longValue();
            } else {
                C11991zy0 c11991zy0 = c0751Lw.f6932a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (c11991zy0.m26594b() && C0751Lw.m5138t(((Long) c11991zy0.m26593a()).longValue())) {
                    c0751Lw.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) c11991zy0.m26593a()).longValue();
                } else {
                    C11991zy0 c11991zy0M5142c = c0751Lw.m5142c(c4022ex);
                    jLongValue = (c11991zy0M5142c.m26594b() && C0751Lw.m5138t(((Long) c11991zy0M5142c.m26593a()).longValue())) ? ((Long) c11991zy0M5142c.m26593a()).longValue() : c0751Lw.f6932a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        C6989v4 c6989v4 = C1768bA.f16837g;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    private C9823j00 getGaugeMetadata() {
        C9695i00 c9695i00M21955z = C9823j00.m21955z();
        int iM18380d = AbstractC9441g02.m18380d((AbstractC11153tN0.m24905q(5) * this.gaugeMetadataManager.f35480c.totalMem) / 1024);
        c9695i00M21955z.m23922n();
        C9823j00.m21953w((C9823j00) c9695i00M21955z.f40483b, iM18380d);
        int iM18380d2 = AbstractC9441g02.m18380d((AbstractC11153tN0.m24905q(5) * this.gaugeMetadataManager.f35478a.maxMemory()) / 1024);
        c9695i00M21955z.m23922n();
        C9823j00.m21951u((C9823j00) c9695i00M21955z.f40483b, iM18380d2);
        int iM18380d3 = AbstractC9441g02.m18380d((AbstractC11153tN0.m24905q(3) * this.gaugeMetadataManager.f35479b.getMemoryClass()) / 1024);
        c9695i00M21955z.m23922n();
        C9823j00.m21952v((C9823j00) c9695i00M21955z.f40483b, iM18380d3);
        return (C9823j00) c9695i00M21955z.m23920l();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC3909d8 enumC3909d8) {
        C4211hx c4211hx;
        long jLongValue;
        int iOrdinal = enumC3909d8.ordinal();
        if (iOrdinal != 1) {
            jLongValue = iOrdinal != 2 ? -1L : this.configResolver.m5155q();
        } else {
            C0751Lw c0751Lw = this.configResolver;
            c0751Lw.getClass();
            synchronized (C4211hx.class) {
                try {
                    if (C4211hx.f28691a == null) {
                        C4211hx.f28691a = new C4211hx();
                    }
                    c4211hx = C4211hx.f28691a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11991zy0 c11991zy0M5150l = c0751Lw.m5150l(c4211hx);
            if (c11991zy0M5150l.m26594b() && C0751Lw.m5138t(((Long) c11991zy0M5150l.m26593a()).longValue())) {
                jLongValue = ((Long) c11991zy0M5150l.m26593a()).longValue();
            } else {
                C11991zy0 c11991zy0 = c0751Lw.f6932a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (c11991zy0.m26594b() && C0751Lw.m5138t(((Long) c11991zy0.m26593a()).longValue())) {
                    c0751Lw.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) c11991zy0.m26593a()).longValue();
                } else {
                    C11991zy0 c11991zy0M5142c = c0751Lw.m5142c(c4211hx);
                    jLongValue = (c11991zy0M5142c.m26594b() && C0751Lw.m5138t(((Long) c11991zy0M5142c.m26593a()).longValue())) ? ((Long) c11991zy0M5142c.m26593a()).longValue() : c0751Lw.f6932a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        C6989v4 c6989v4 = C11211tq0.f43356f;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static /* synthetic */ C1768bA lambda$new$0() {
        return new C1768bA();
    }

    public static /* synthetic */ C11211tq0 lambda$new$1() {
        return new C11211tq0();
    }

    private boolean startCollectingCpuMetrics(long j, C7731Ia1 c7731Ia1) {
        if (j == -1) {
            logger.m25320a();
            return false;
        }
        C1768bA c1768bA = (C1768bA) this.cpuGaugeCollector.get();
        long j2 = c1768bA.f16842d;
        if (j2 == -1 || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = c1768bA.f16843e;
        if (scheduledFuture == null) {
            c1768bA.m10430a(j, c7731Ia1);
            return true;
        }
        if (c1768bA.f16844f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c1768bA.f16843e = null;
            c1768bA.f16844f = -1L;
        }
        c1768bA.m10430a(j, c7731Ia1);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, C7731Ia1 c7731Ia1) {
        if (j == -1) {
            logger.m25320a();
            return false;
        }
        C11211tq0 c11211tq0 = (C11211tq0) this.memoryGaugeCollector.get();
        C6989v4 c6989v4 = C11211tq0.f43356f;
        if (j <= 0) {
            c11211tq0.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = c11211tq0.f43360d;
        if (scheduledFuture == null) {
            c11211tq0.m24997b(j, c7731Ia1);
            return true;
        }
        if (c11211tq0.f43361e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c11211tq0.f43360d = null;
            c11211tq0.f43361e = -1L;
        }
        c11211tq0.m24997b(j, c7731Ia1);
        return true;
    }

    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, EnumC3909d8 enumC3909d8) {
        C10079l00 c10079l00M22615E = C10207m00.m22615E();
        while (!((C1768bA) this.cpuGaugeCollector.get()).f16839a.isEmpty()) {
            C3911dA c3911dA = (C3911dA) ((C1768bA) this.cpuGaugeCollector.get()).f16839a.poll();
            c10079l00M22615E.m23922n();
            C10207m00.m22619x((C10207m00) c10079l00M22615E.f40483b, c3911dA);
        }
        while (!((C11211tq0) this.memoryGaugeCollector.get()).f43358b.isEmpty()) {
            C7115x4 c7115x4 = (C7115x4) ((C11211tq0) this.memoryGaugeCollector.get()).f43358b.poll();
            c10079l00M22615E.m23922n();
            C10207m00.m22617v((C10207m00) c10079l00M22615E.f40483b, c7115x4);
        }
        c10079l00M22615E.m23922n();
        C10207m00.m22616u((C10207m00) c10079l00M22615E.f40483b, str);
        C8619Zc1 c8619Zc1 = this.transportManager;
        c8619Zc1.f15037i.execute(new RunnableC8176Qp0(c8619Zc1, (C10207m00) c10079l00M22615E.m23920l(), enumC3909d8, 13));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C9951k00(context);
    }

    public boolean logGaugeMetadata(String str, EnumC3909d8 enumC3909d8) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        C10079l00 c10079l00M22615E = C10207m00.m22615E();
        c10079l00M22615E.m23922n();
        C10207m00.m22616u((C10207m00) c10079l00M22615E.f40483b, str);
        C9823j00 gaugeMetadata = getGaugeMetadata();
        c10079l00M22615E.m23922n();
        C10207m00.m22618w((C10207m00) c10079l00M22615E.f40483b, gaugeMetadata);
        C10207m00 c10207m00 = (C10207m00) c10079l00M22615E.m23920l();
        C8619Zc1 c8619Zc1 = this.transportManager;
        c8619Zc1.f15037i.execute(new RunnableC8176Qp0(c8619Zc1, c10207m00, enumC3909d8, 13));
        return true;
    }

    public void startCollectingGauges(JA0 ja0, EnumC3909d8 enumC3909d8) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(enumC3909d8, ja0.f5369b);
        if (jStartCollectingGauges == -1) {
            logger.m25324f();
            return;
        }
        String str = ja0.f5368a;
        this.sessionId = str;
        this.applicationProcessState = enumC3909d8;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new RunnableC9567h00(this, str, enumC3909d8, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6989v4 c6989v4 = logger;
            e.getMessage();
            c6989v4.m25324f();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        EnumC3909d8 enumC3909d8 = this.applicationProcessState;
        C1768bA c1768bA = (C1768bA) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = c1768bA.f16843e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c1768bA.f16843e = null;
            c1768bA.f16844f = -1L;
        }
        C11211tq0 c11211tq0 = (C11211tq0) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = c11211tq0.f43360d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            c11211tq0.f43360d = null;
            c11211tq0.f43361e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new RunnableC9567h00(this, str, enumC3909d8, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC3909d8.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(C10809qh0 c10809qh0, C8619Zc1 c8619Zc1, C0751Lw c0751Lw, C9951k00 c9951k00, C10809qh0 c10809qh02, C10809qh0 c10809qh03) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC3909d8.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = c10809qh0;
        this.transportManager = c8619Zc1;
        this.configResolver = c0751Lw;
        this.gaugeMetadataManager = c9951k00;
        this.cpuGaugeCollector = c10809qh02;
        this.memoryGaugeCollector = c10809qh03;
    }

    public void collectGaugeMetricOnce(C7731Ia1 c7731Ia1) {
        collectGaugeMetricOnce((C1768bA) this.cpuGaugeCollector.get(), (C11211tq0) this.memoryGaugeCollector.get(), c7731Ia1);
    }

    private long startCollectingGauges(EnumC3909d8 enumC3909d8, C7731Ia1 c7731Ia1) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC3909d8);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, c7731Ia1)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC3909d8);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, c7731Ia1) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
