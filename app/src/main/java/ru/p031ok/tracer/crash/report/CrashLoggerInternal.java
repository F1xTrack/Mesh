package ru.p031ok.tracer.crash.report;

import android.os.Looper;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.AbstractC7230yu;
import p000.O90;
import p000.RunnableC3973eA;
import p000.RunnableC8339Ts1;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.session.SessionState;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.TagsStorage;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerThreads;
import ru.p031ok.tracer.utils.config.ConfigStorage;

@Metadata(m22266d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m22267d2 = {"Lru/ok/tracer/crash/report/CrashLoggerInternal;", "", "Lru/ok/tracer/crash/report/CrashStorage;", "crashStorage", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/crash/report/LogStorage;", "logStorage", "Lru/ok/tracer/crash/report/SessionStateUploader;", "stateUploader", "Lru/ok/tracer/crash/report/CrashUploader;", "crashUploader", "<init>", "(Lru/ok/tracer/crash/report/CrashStorage;Lru/ok/tracer/session/SessionStateStorage;Lru/ok/tracer/session/TagsStorage;Lru/ok/tracer/crash/report/LogStorage;Lru/ok/tracer/crash/report/SessionStateUploader;Lru/ok/tracer/crash/report/CrashUploader;)V", "Lru/ok/tracer/SystemState;", "", "issueKey", "withIssueKey", "(Lru/ok/tracer/SystemState;Ljava/lang/String;)Lru/ok/tracer/SystemState;", "message", "LTf1;", "log", "(Ljava/lang/String;)V", "", "e", "reportCrash", "(Ljava/lang/Throwable;)V", "reportNonFatal", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lru/ok/tracer/crash/report/CrashStorage;", "Lru/ok/tracer/session/SessionStateStorage;", "Lru/ok/tracer/session/TagsStorage;", "Lru/ok/tracer/crash/report/LogStorage;", "Lru/ok/tracer/crash/report/SessionStateUploader;", "Lru/ok/tracer/crash/report/CrashUploader;", "", "nonFatalCounter", "I", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CrashLoggerInternal {
    private final CrashStorage crashStorage;
    private final CrashUploader crashUploader;
    private final LogStorage logStorage;
    private volatile int nonFatalCounter;
    private final SessionStateStorage stateStorage;
    private final SessionStateUploader stateUploader;
    private final TagsStorage tagsStorage;

    public CrashLoggerInternal(CrashStorage crashStorage, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) {
        O90.m5968f(crashStorage, "crashStorage");
        O90.m5968f(sessionStateStorage, "stateStorage");
        O90.m5968f(tagsStorage, "tagsStorage");
        O90.m5968f(logStorage, "logStorage");
        O90.m5968f(sessionStateUploader, "stateUploader");
        O90.m5968f(crashUploader, "crashUploader");
        this.crashStorage = crashStorage;
        this.stateStorage = sessionStateStorage;
        this.tagsStorage = tagsStorage;
        this.logStorage = logStorage;
        this.stateUploader = sessionStateUploader;
        this.crashUploader = crashUploader;
    }

    public static final void reportCrash$lambda$0(CrashLoggerInternal crashLoggerInternal, CrashDescription crashDescription, CountDownLatch countDownLatch) {
        O90.m5968f(crashLoggerInternal, "this$0");
        O90.m5968f(countDownLatch, "$lock");
        crashLoggerInternal.crashUploader.upload(AbstractC7230yu.m26274e(crashDescription));
        countDownLatch.countDown();
    }

    public static final void reportNonFatal$lambda$1(CrashLoggerInternal crashLoggerInternal, CrashDescription crashDescription) {
        O90.m5968f(crashLoggerInternal, "this$0");
        crashLoggerInternal.crashUploader.upload(AbstractC7230yu.m26274e(crashDescription));
    }

    private final SystemState withIssueKey(SystemState systemState, String str) {
        return (str == null || str.length() == 0) ? systemState : SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, false, false, AbstractC11077sn0.m24783k(systemState.getProperties(), new Pair("issueKey", str)), null, 6143, null);
    }

    public final void log(String message) {
        O90.m5968f(message, "message");
        this.logStorage.log(message);
    }

    public final void reportCrash(Throwable e) {
        O90.m5968f(e, "e");
        this.stateStorage.setCurrentSessionStatus(SessionState.Status.CRASH);
        if (!CrashReportConfiguration.INSTANCE.get$tracer_crash_report_release().getEnabled()) {
            Logger.v$default("Crash report disabled", null, 2, null);
            return;
        }
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT(), null, 2, null)) {
            Logger.d$default("Crash reporting limited", null, 2, null);
            return;
        }
        CrashStorage crashStorage = this.crashStorage;
        CrashType crashType = CrashType.CRASH;
        SystemState currentSystemState = this.stateStorage.getCurrentSystemState();
        List<String> tags = this.tagsStorage.getTags();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        O90.m5967e(allStackTraces, "getAllStackTraces()");
        CrashDescription crashDescriptionSave = crashStorage.save(crashType, e, currentSystemState, tags, allStackTraces, this.logStorage.getLogs());
        if (crashDescriptionSave != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            TracerThreads.INSTANCE.runOnIo(new RunnableC8339Ts1(this, crashDescriptionSave, countDownLatch, 13));
            long j = O90.m5963a(Looper.myLooper(), Looper.getMainLooper()) ? 5000L : 100000000L;
            this.stateUploader.waitSessionUpload(j);
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                Logger.d$default("Crash uploaded asap", null, 2, null);
            } else {
                Logger.d$default("Can't upload crash asap", null, 2, null);
            }
        }
    }

    public final void reportNonFatal(Throwable e, String issueKey) {
        O90.m5968f(e, "e");
        if (!CrashReportConfiguration.INSTANCE.get$tracer_crash_report_release().getEnabled()) {
            Logger.v$default("Crash report disabled", null, 2, null);
            return;
        }
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT(), null, 2, null)) {
            Logger.d$default("Crash reporting limited", null, 2, null);
            return;
        }
        int i = this.nonFatalCounter;
        this.nonFatalCounter = i + 1;
        if (i > 8) {
            Logger.d$default("Can't handle non fatal exception. Max non fatal count is reached for this session.", null, 2, null);
            return;
        }
        CrashDescription crashDescriptionSave$default = CrashStorage.save$default(this.crashStorage, CrashType.NON_FATAL, e, withIssueKey(this.stateStorage.getCurrentSystemState(), issueKey), this.tagsStorage.getTags(), (Map) null, this.logStorage.getLogs(), 16, (Object) null);
        if (crashDescriptionSave$default != null) {
            TracerThreads.INSTANCE.runOnIo(new RunnableC3973eA(this, 0, crashDescriptionSave$default));
        }
    }
}
