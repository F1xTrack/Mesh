package ru.ok.tracer.crash.report;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import defpackage.AbstractC2141aT1;
import defpackage.I1;
import defpackage.NP1;
import defpackage.O90;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.process.ProcessUtils;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/tracer/crash/report/AnrReporter;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/crash/report/LogStorage;", "logStorage", "Lru/ok/tracer/crash/report/CrashStorage;", "crashStorage", "LTf1;", "check", "(Landroid/content/Context;Lru/ok/tracer/session/SessionStateStorage;Lru/ok/tracer/session/TagsStorage;Lru/ok/tracer/crash/report/LogStorage;Lru/ok/tracer/crash/report/CrashStorage;)V", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AnrReporter {
    public static final AnrReporter INSTANCE = new AnrReporter();

    private AnrReporter() {
    }

    public final void check(Context context, SessionStateStorage stateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage) throws IOException {
        byte[] bArr;
        byte[] bArrF;
        O90.f(context, "context");
        O90.f(stateStorage, "stateStorage");
        O90.f(tagsStorage, "tagsStorage");
        O90.f(logStorage, "logStorage");
        O90.f(crashStorage, "crashStorage");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object systemService = context.getSystemService("activity");
        O90.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        try {
            List historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
            O90.e(historicalProcessExitReasons, "try {\n            activi…         return\n        }");
            String processName = ProcessUtils.getProcessName(context);
            Iterator it = historicalProcessExitReasons.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoF = I1.f(it.next());
                if (applicationExitInfoF.getReason() == 6) {
                    if (O90.a(applicationExitInfoF.getProcessName(), processName)) {
                        if (applicationExitInfoF.getTimestamp() < stateStorage.getPrevStartTs()) {
                            applicationExitInfoF.getTimestamp();
                        } else {
                            try {
                                InputStream traceInputStream = applicationExitInfoF.getTraceInputStream();
                                if (traceInputStream != null) {
                                    try {
                                        bArrF = NP1.f(traceInputStream);
                                        AbstractC2141aT1.a(traceInputStream, null);
                                    } finally {
                                    }
                                } else {
                                    bArrF = null;
                                }
                                bArr = bArrF;
                            } catch (Exception unused) {
                                bArr = null;
                            }
                            if (bArr == null || bArr.length == 0) {
                                Logger.w$default("ANR with empty trace. " + applicationExitInfoF.getDescription(), null, 2, null);
                            } else {
                                applicationExitInfoF.getTimestamp();
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
                        applicationExitInfoF.getProcessName();
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
