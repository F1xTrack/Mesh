package ru.p031ok.tracer.crash.report;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.AbstractC9313f02;
import p000.C0779MN;
import p000.C6547oM;
import p000.EnumC6738rM;
import p000.O90;
import p000.RunnableC9967k60;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.crash.report.CrashReportConfiguration;
import ru.p031ok.tracer.session.SessionState;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.TagsStorage;
import ru.p031ok.tracer.utils.TracerThreads;
import ru.p031ok.tracer.utils.UncaughtExceptionHandlers;
import ru.p031ok.tracer.utils.config.ConfigStorage;

@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m22267d2 = {"Lru/ok/tracer/crash/report/TracerCrashReport;", "", "<init>", "()V", "", "e", "", "issueKey", "LTf1;", "report", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "reportUncaughtException$tracer_crash_report_release", "(Ljava/lang/Throwable;)V", "reportUncaughtException", "msg", "log", "(Ljava/lang/String;)V", "Lru/ok/tracer/session/SessionStateStorage;", "storage", "", "Lru/ok/tracer/session/SessionState;", "collectSessionStatesToUpload", "(Lru/ok/tracer/session/SessionStateStorage;)Ljava/util/List;", "Landroid/content/Context;", "context", "init$tracer_crash_report_release", "(Landroid/content/Context;)V", "init", "", "MAX_SESSIONS_TO_UPLOAD", "I", "", "MAX_SESSION_TIME_SPAN_TO_UPLOAD", "J", "Lru/ok/tracer/crash/report/CrashLoggerInternal;", "crashLoggerInternal", "Lru/ok/tracer/crash/report/CrashLoggerInternal;", "", "isDisabled", "Z", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerCrashReport {
    public static final TracerCrashReport INSTANCE = new TracerCrashReport();
    private static final int MAX_SESSIONS_TO_UPLOAD = 10;
    private static final long MAX_SESSION_TIME_SPAN_TO_UPLOAD;
    private static CrashLoggerInternal crashLoggerInternal;
    private static boolean isDisabled;

    static {
        int i = C6547oM.f38966d;
        MAX_SESSION_TIME_SPAN_TO_UPLOAD = C6547oM.m23369b(AbstractC9313f02.m18151d(4, EnumC6738rM.f41613f));
    }

    private TracerCrashReport() {
    }

    private final List<SessionState> collectSessionStatesToUpload(SessionStateStorage storage) {
        boolean zIsLimited$default = ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE(), null, 2, null);
        C0779MN c0779mn = C0779MN.f7117a;
        if (zIsLimited$default) {
            return c0779mn;
        }
        CrashFreeConfiguration.INSTANCE.get$tracer_crash_report_release();
        List<SessionState> prevSessionStates = storage.getPrevSessionStates();
        if (prevSessionStates.isEmpty() || prevSessionStates.size() >= 10) {
            return prevSessionStates;
        }
        long sessionStateUploadTs = storage.getSessionStateUploadTs();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = MAX_SESSION_TIME_SPAN_TO_UPLOAD;
        return (j >= Long.MAX_VALUE || sessionStateUploadTs + j > jCurrentTimeMillis) ? c0779mn : prevSessionStates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) throws IOException {
        SystemState prevSystemState;
        O90.m5968f(context, "$context");
        O90.m5968f(sessionStateStorage, "$stateStorage");
        O90.m5968f(tagsStorage, "$tagStorage");
        O90.m5968f(logStorage, "$logStorage");
        O90.m5968f(crashStorage, "$crashStorage");
        O90.m5968f(sessionStateUploader, "$stateUploader");
        O90.m5968f(crashUploader, "$crashUploader");
        CrashReportConfiguration.Companion companion = CrashReportConfiguration.INSTANCE;
        if (companion.get$tracer_crash_report_release().getSendAnr()) {
            AnrReporter.INSTANCE.check(context, sessionStateStorage, tagsStorage, logStorage, crashStorage);
        }
        if (companion.get$tracer_crash_report_release().getNativeEnabled()) {
            TracerNativeCrashReport.INSTANCE.check$tracer_crash_report_release(context, sessionStateStorage, tagsStorage, logStorage, crashStorage);
        }
        if (CrashFreeConfiguration.INSTANCE.get$tracer_crash_report_release().getEnabled() && (prevSystemState = sessionStateStorage.getPrevSystemState()) != null) {
            List<SessionState> listCollectSessionStatesToUpload = INSTANCE.collectSessionStatesToUpload(sessionStateStorage);
            if (!listCollectSessionStatesToUpload.isEmpty()) {
                try {
                    sessionStateUploader.upload(prevSystemState, listCollectSessionStatesToUpload, sessionStateStorage);
                } catch (Exception unused) {
                }
            }
        }
        if (!CrashReportConfiguration.INSTANCE.get$tracer_crash_report_release().getEnabled()) {
            crashStorage.deleteAll();
            return;
        }
        List<CrashDescription> all = crashStorage.readAll();
        if (!all.isEmpty()) {
            crashUploader.upload(all);
        }
        logStorage.clearPrevLogs();
        tagsStorage.clearPrevTags();
    }

    public static final void log(String msg) {
        O90.m5968f(msg, "msg");
        if (isDisabled) {
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            crashLoggerInternal2.log(msg);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    public static final void report(Throwable th) {
        O90.m5968f(th, "e");
        report$default(th, null, 2, null);
    }

    public static /* synthetic */ void report$default(Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        report(th, str);
    }

    public static final void reportUncaughtException$tracer_crash_report_release(Throwable e) {
        O90.m5968f(e, "e");
        if (isDisabled) {
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            crashLoggerInternal2.reportCrash(e);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    public final void init$tracer_crash_report_release(Context context) {
        O90.m5968f(context, "context");
        CrashReportConfiguration.Companion companion = CrashReportConfiguration.INSTANCE;
        if (!companion.get$tracer_crash_report_release().getEnabled()) {
            isDisabled = true;
            return;
        }
        if (companion.get$tracer_crash_report_release().getNativeEnabled()) {
            TracerNativeCrashReport.INSTANCE.installExceptionHandler$tracer_crash_report_release(context);
        }
        Tracer tracer = Tracer.INSTANCE;
        SessionStateStorage stateStorage = tracer.getStateStorage();
        TagsStorage tagsStorage = tracer.getTagsStorage();
        CrashStorage crashStorage = new CrashStorage(context);
        LogStorage logStorage = new LogStorage(context);
        CrashUploader crashUploader = new CrashUploader();
        SessionStateUploader sessionStateUploader = new SessionStateUploader();
        crashLoggerInternal = new CrashLoggerInternal(crashStorage, stateStorage, tagsStorage, logStorage, sessionStateUploader, crashUploader);
        TracerThreads.INSTANCE.runOnIo(new RunnableC9967k60(context, stateStorage, tagsStorage, logStorage, crashStorage, sessionStateUploader, crashUploader));
        UncaughtExceptionHandlers.prependDefault(new TracerUncaughtExceptionHandler());
    }

    public static final void report(Throwable e, String issueKey) {
        String string;
        O90.m5968f(e, "e");
        if (isDisabled) {
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strM25349X = null;
            if (issueKey != null && (string = AbstractC11374v51.m25350Y(issueKey).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    strM25349X = AbstractC11374v51.m25349X(32, string);
                }
            }
            crashLoggerInternal2.reportNonFatal(e, strM25349X);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }
}
