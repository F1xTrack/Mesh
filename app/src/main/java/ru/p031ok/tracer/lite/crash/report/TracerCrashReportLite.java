package ru.p031ok.tracer.lite.crash.report;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0705LB;
import p000.AbstractC11374v51;
import p000.EnumC9659hi0;
import p000.InterfaceC6497nZ;
import p000.O90;
import p000.RunnableC8176Qp0;
import ru.p031ok.tracer.lite.TagsStorageLite;
import ru.p031ok.tracer.lite.TracerLite;
import ru.p031ok.tracer.lite.crash.report.upload.CrashUploaderLite;
import ru.p031ok.tracer.lite.limits.TracerLiteLimits;
import ru.p031ok.tracer.lite.utils.TracerExecutorsHolder;

@Metadata(m22266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0002/0B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite;", "", "Lru/ok/tracer/lite/TracerLite;", "tracer", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "configuration", "<init>", "(Lru/ok/tracer/lite/TracerLite;Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;)V", "", "e", "", "issueKey", "LTf1;", "report", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "msg", "log", "(Ljava/lang/String;)V", "Lru/ok/tracer/lite/TracerLite;", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "Lru/ok/tracer/lite/crash/report/LogStorageLite;", "logStorage", "Lru/ok/tracer/lite/crash/report/LogStorageLite;", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "limits", "Lru/ok/tracer/lite/limits/TracerLiteLimits;", "Lru/ok/tracer/lite/crash/report/upload/CrashUploaderLite;", "uploader", "Lru/ok/tracer/lite/crash/report/upload/CrashUploaderLite;", "", "nonFatalsEnabled$delegate", "Lkotlin/Lazy;", "getNonFatalsEnabled", "()Z", "nonFatalsEnabled", "Ljava/util/concurrent/atomic/AtomicInteger;", "kotlin.jvm.PlatformType", "nonFatalCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lru/ok/tracer/lite/TagsStorageLite;", "getTagsStorage", "()Lru/ok/tracer/lite/TagsStorageLite;", "tagsStorage", "Ljava/util/concurrent/Executor;", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "ioExecutor", "Companion", "Configuration", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerCrashReportLite {

    /* renamed from: a */
    public static final /* synthetic */ int f42126a = 0;
    private final Configuration configuration;
    private final TracerLiteLimits limits;
    private final LogStorageLite logStorage;
    private final AtomicInteger nonFatalCounter;

    /* renamed from: nonFatalsEnabled$delegate, reason: from kotlin metadata */
    private final Lazy nonFatalsEnabled;
    private final TracerLite tracer;
    private final CrashUploaderLite uploader;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final ConcurrentHashMap<String, AtomicInteger> nonFatalCounters = new ConcurrentHashMap<>();

    @Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Companion;", "", "()V", "nonFatalCounters", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "", "builder", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration$Builder;", "(Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration$Builder;)V", "obfuscatedNonFatalsEnabled", "", "getObfuscatedNonFatalsEnabled$tracer_lite_crash_report_release", "()Z", "Builder", "Companion", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean obfuscatedNonFatalsEnabled;

        @Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration$Builder;", "", "()V", "obfuscatedNonFatalsEnabled", "", "getObfuscatedNonFatalsEnabled", "()Z", "setObfuscatedNonFatalsEnabled", "(Z)V", "build", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
        public static final class Builder {
            private boolean obfuscatedNonFatalsEnabled;

            public final Configuration build() {
                return new Configuration(this, null);
            }

            public final boolean getObfuscatedNonFatalsEnabled() {
                return this.obfuscatedNonFatalsEnabled;
            }

            public final void setObfuscatedNonFatalsEnabled(boolean z) {
                this.obfuscatedNonFatalsEnabled = z;
            }
        }

        @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration$Builder;", "LTf1;", "block", "Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "build", "(LnZ;)Lru/ok/tracer/lite/crash/report/TracerCrashReportLite$Configuration;", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Configuration build(InterfaceC6497nZ block) {
                O90.m5968f(block, "block");
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

        /* renamed from: getObfuscatedNonFatalsEnabled$tracer_lite_crash_report_release, reason: from getter */
        public final boolean getObfuscatedNonFatalsEnabled() {
            return this.obfuscatedNonFatalsEnabled;
        }

        private Configuration(Builder builder) {
            this.obfuscatedNonFatalsEnabled = builder.getObfuscatedNonFatalsEnabled();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TracerCrashReportLite(TracerLite tracerLite) {
        this(tracerLite, null, 2, null);
        O90.m5968f(tracerLite, "tracer");
    }

    private final Executor getIoExecutor() {
        return TracerExecutorsHolder.INSTANCE.get(this.tracer).getIoExecutor();
    }

    private final boolean getNonFatalsEnabled() {
        return ((Boolean) this.nonFatalsEnabled.getValue()).booleanValue();
    }

    private final TagsStorageLite getTagsStorage() {
        return TagsStorageLite.INSTANCE.get(this.tracer);
    }

    public static /* synthetic */ void report$default(TracerCrashReportLite tracerCrashReportLite, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerCrashReportLite.report(th, str);
    }

    public static final void report$lambda$1(TracerCrashReportLite tracerCrashReportLite, Throwable th, String str) {
        String string;
        O90.m5968f(tracerCrashReportLite, "this$0");
        O90.m5968f(th, "$e");
        CrashUploaderLite crashUploaderLite = tracerCrashReportLite.uploader;
        String strM25349X = null;
        if (str != null && (string = AbstractC11374v51.m25350Y(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                strM25349X = AbstractC11374v51.m25349X(32, string);
            }
        }
        crashUploaderLite.upload(th, strM25349X, tracerCrashReportLite.logStorage.getLogs$tracer_lite_crash_report_release(), tracerCrashReportLite.getTagsStorage().getTags());
    }

    public final void log(String msg) {
        O90.m5968f(msg, "msg");
        this.logStorage.log(msg);
    }

    public final void report(Throwable th) {
        O90.m5968f(th, "e");
        report$default(this, th, null, 2, null);
    }

    public TracerCrashReportLite(TracerLite tracerLite, Configuration configuration) {
        AtomicInteger atomicIntegerPutIfAbsent;
        O90.m5968f(tracerLite, "tracer");
        O90.m5968f(configuration, "configuration");
        this.tracer = tracerLite;
        this.configuration = configuration;
        this.logStorage = new LogStorageLite();
        TracerLiteLimits tracerLiteLimits = TracerLiteLimits.INSTANCE.get(tracerLite);
        this.limits = tracerLiteLimits;
        this.uploader = new CrashUploaderLite(tracerLite, tracerLiteLimits);
        this.nonFatalsEnabled = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new TracerCrashReportLite$nonFatalsEnabled$2(this));
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = nonFatalCounters;
        String libraryPackageName = tracerLite.getLibraryPackageName();
        AtomicInteger atomicInteger = concurrentHashMap.get(libraryPackageName);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(libraryPackageName, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        this.nonFatalCounter = atomicInteger;
    }

    public final void report(Throwable e, String issueKey) {
        O90.m5968f(e, "e");
        if (getNonFatalsEnabled() && !this.limits.isLimited(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT, null) && this.nonFatalCounter.incrementAndGet() <= 8) {
            getIoExecutor().execute(new RunnableC8176Qp0(this, e, issueKey, 12));
        }
    }

    public /* synthetic */ TracerCrashReportLite(TracerLite tracerLite, Configuration configuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tracerLite, (i & 2) != 0 ? new Configuration.Builder().build() : configuration);
    }
}
