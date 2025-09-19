package ru.p031ok.tracer.crash.report;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0506I1;
import p000.AbstractC8729aT1;
import p000.NP1;
import p000.O90;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.base.process.ProcessUtils;
import ru.p031ok.tracer.session.SessionState;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.TagsStorage;
import ru.p031ok.tracer.utils.Logger;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m22267d2 = {"Lru/ok/tracer/crash/report/AnrReporter;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/crash/report/LogStorage;", "logStorage", "Lru/ok/tracer/crash/report/CrashStorage;", "crashStorage", "LTf1;", "check", "(Landroid/content/Context;Lru/ok/tracer/session/SessionStateStorage;Lru/ok/tracer/session/TagsStorage;Lru/ok/tracer/crash/report/LogStorage;Lru/ok/tracer/crash/report/CrashStorage;)V", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class AnrReporter {
    public static final AnrReporter INSTANCE = new AnrReporter();

    private AnrReporter() {
    }

    public final void check(Context context, SessionStateStorage stateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage) throws IOException {
        byte[] bArr;
        byte[] bArrM5672f;
        O90.m5968f(context, "context");
        O90.m5968f(stateStorage, "stateStorage");
        O90.m5968f(tagsStorage, "tagsStorage");
        O90.m5968f(logStorage, "logStorage");
        O90.m5968f(crashStorage, "crashStorage");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object systemService = context.getSystemService("activity");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        try {
            List historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
            O90.m5967e(historicalProcessExitReasons, "try {\n            activi…         return\n        }");
            String processName = ProcessUtils.getProcessName(context);
            Iterator it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoM3701f = AbstractC0506I1.m3701f(it.next());
                if (applicationExitInfoM3701f.getReason() == 6) {
                    if (O90.m5963a(applicationExitInfoM3701f.getProcessName(), processName)) {
                        if (applicationExitInfoM3701f.getTimestamp() < stateStorage.getPrevStartTs()) {
                            applicationExitInfoM3701f.getTimestamp();
                        } else {
                            try {
                                InputStream traceInputStream = applicationExitInfoM3701f.getTraceInputStream();
                                if (traceInputStream != null) {
                                    try {
                                        bArrM5672f = NP1.m5672f(traceInputStream);
                                        AbstractC8729aT1.m9749a(traceInputStream, null);
                                    } finally {
                                    }
                                } else {
                                    bArrM5672f = null;
                                }
                                bArr = bArrM5672f;
                            } catch (Exception unused) {
                                bArr = null;
                            }
                            if (bArr == null || bArr.length == 0) {
                                Logger.w$default("ANR with empty trace. " + applicationExitInfoM3701f.getDescription(), null, 2, null);
                            } else {
                                applicationExitInfoM3701f.getTimestamp();
                                SystemState prevSystemState = stateStorage.getPrevSystemState();
                                if (prevSystemState == null) {
                                    Logger.w$default("No prevSystemState", null, 2, null);
                                } else {
                                    CrashStorage.save$default(crashStorage, CrashType.ANR, bArr, prevSystemState, tagsStorage.getPrevTags(), (Map) null, logStorage.getPrevLogs(), 16, (Object) null);
                                    stateStorage.setPrevSessionStatus(SessionState.Status.ANR);
                                }
                            }
                        }
                    } else {
                        applicationExitInfoM3701f.getProcessName();
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
