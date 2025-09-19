package ru.ok.tracer.crash.report;

import android.content.Context;
import defpackage.AbstractC5702lU;
import defpackage.O90;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.minidump.Minidump;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ok/tracer/crash/report/TracerNativeCrashReport;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "getMinidumpDir", "(Landroid/content/Context;)Ljava/io/File;", "", "explicitEnabled", "calculateEnabled$tracer_crash_report_release", "(Ljava/lang/Boolean;)Z", "calculateEnabled", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/crash/report/LogStorage;", "logStorage", "Lru/ok/tracer/crash/report/CrashStorage;", "crashStorage", "LTf1;", "check$tracer_crash_report_release", "(Landroid/content/Context;Lru/ok/tracer/session/SessionStateStorage;Lru/ok/tracer/session/TagsStorage;Lru/ok/tracer/crash/report/LogStorage;Lru/ok/tracer/crash/report/CrashStorage;)V", "check", "installExceptionHandler$tracer_crash_report_release", "(Landroid/content/Context;)V", "installExceptionHandler", "", "DIR_MINIDUMP", "Ljava/lang/String;", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerNativeCrashReport {
    private static final String DIR_MINIDUMP = "minidump";
    public static final TracerNativeCrashReport INSTANCE = new TracerNativeCrashReport();

    private TracerNativeCrashReport() {
    }

    private final File getMinidumpDir(Context context) {
        return AbstractC5702lU.g(TracerFiles.INSTANCE.getTracerDir(context), DIR_MINIDUMP);
    }

    public final boolean calculateEnabled$tracer_crash_report_release(Boolean explicitEnabled) {
        if (O90.a(explicitEnabled, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            O90.a(explicitEnabled, Boolean.TRUE);
            return false;
        }
    }

    public final void check$tracer_crash_report_release(Context context, SessionStateStorage stateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage) {
        File[] fileArrListFiles;
        int i;
        Throwable th;
        int i2;
        byte[] bArrD;
        O90.f(context, "context");
        O90.f(stateStorage, "stateStorage");
        O90.f(tagsStorage, "tagsStorage");
        O90.f(logStorage, "logStorage");
        O90.f(crashStorage, "crashStorage");
        File minidumpDir = getMinidumpDir(context);
        if (!minidumpDir.exists() || (fileArrListFiles = minidumpDir.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        SystemState prevSystemState = stateStorage.getPrevSystemState();
        Throwable th2 = null;
        if (prevSystemState == null) {
            Logger.w$default("No prev system state but have minidumps", null, 2, null);
            return;
        }
        O90.e(fileArrListFiles, "minidumpFiles");
        int length = fileArrListFiles.length;
        int i3 = 0;
        while (i3 < length) {
            File file = fileArrListFiles[i3];
            try {
                O90.e(file, "minidumpFile");
                bArrD = AbstractC5702lU.d(file);
                FileUtils.deleteChecked(file);
            } catch (Exception unused) {
            }
            if (bArrD.length == 0) {
                Logger.w$default("Empty minidump. " + file, th2, 2, th2);
                i = i3;
                i2 = length;
                th = th2;
                i3 = i + 1;
                length = i2;
                th2 = th;
            } else {
                i = i3;
                i2 = length;
                th = th2;
                CrashStorage.save$default(crashStorage, CrashType.MINIDUMP, bArrD, prevSystemState, tagsStorage.getPrevTags(), (Map) null, logStorage.getPrevLogs(), 16, (Object) null);
                stateStorage.setPrevSessionStatus(SessionState.Status.NATIVE);
                i3 = i + 1;
                length = i2;
                th2 = th;
            }
        }
    }

    public final void installExceptionHandler$tracer_crash_report_release(Context context) {
        O90.f(context, "context");
        try {
            File minidumpDir = getMinidumpDir(context);
            FileUtils.mkdirsChecked(minidumpDir);
            Minidump.getInstance().installMinidumpWriter(minidumpDir.getPath());
        } catch (Throwable unused) {
        }
    }
}
