package ru.p031ok.tracer.crash.report;

import android.content.Context;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC6366lU;
import p000.O90;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.minidump.Minidump;
import ru.p031ok.tracer.session.SessionState;
import ru.p031ok.tracer.session.SessionStateStorage;
import ru.p031ok.tracer.session.TagsStorage;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerFiles;

@Metadata(m22266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m22267d2 = {"Lru/ok/tracer/crash/report/TracerNativeCrashReport;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "getMinidumpDir", "(Landroid/content/Context;)Ljava/io/File;", "", "explicitEnabled", "calculateEnabled$tracer_crash_report_release", "(Ljava/lang/Boolean;)Z", "calculateEnabled", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/crash/report/LogStorage;", "logStorage", "Lru/ok/tracer/crash/report/CrashStorage;", "crashStorage", "LTf1;", "check$tracer_crash_report_release", "(Landroid/content/Context;Lru/ok/tracer/session/SessionStateStorage;Lru/ok/tracer/session/TagsStorage;Lru/ok/tracer/crash/report/LogStorage;Lru/ok/tracer/crash/report/CrashStorage;)V", "check", "installExceptionHandler$tracer_crash_report_release", "(Landroid/content/Context;)V", "installExceptionHandler", "", "DIR_MINIDUMP", "Ljava/lang/String;", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerNativeCrashReport {
    private static final String DIR_MINIDUMP = "minidump";
    public static final TracerNativeCrashReport INSTANCE = new TracerNativeCrashReport();

    private TracerNativeCrashReport() {
    }

    private final File getMinidumpDir(Context context) {
        return AbstractC6366lU.m22437g(TracerFiles.INSTANCE.getTracerDir(context), DIR_MINIDUMP);
    }

    public final boolean calculateEnabled$tracer_crash_report_release(Boolean explicitEnabled) {
        if (O90.m5963a(explicitEnabled, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            O90.m5963a(explicitEnabled, Boolean.TRUE);
            return false;
        }
    }

    public final void check$tracer_crash_report_release(Context context, SessionStateStorage stateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage) {
        File[] fileArrListFiles;
        int i;
        Throwable th;
        int i2;
        byte[] bArrM22434d;
        O90.m5968f(context, "context");
        O90.m5968f(stateStorage, "stateStorage");
        O90.m5968f(tagsStorage, "tagsStorage");
        O90.m5968f(logStorage, "logStorage");
        O90.m5968f(crashStorage, "crashStorage");
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
        O90.m5967e(fileArrListFiles, "minidumpFiles");
        int length = fileArrListFiles.length;
        int i3 = 0;
        while (i3 < length) {
            File file = fileArrListFiles[i3];
            try {
                O90.m5967e(file, "minidumpFile");
                bArrM22434d = AbstractC6366lU.m22434d(file);
                FileUtils.deleteChecked(file);
            } catch (Exception unused) {
            }
            if (bArrM22434d.length == 0) {
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
                CrashStorage.save$default(crashStorage, CrashType.MINIDUMP, bArrM22434d, prevSystemState, tagsStorage.getPrevTags(), (Map) null, logStorage.getPrevLogs(), 16, (Object) null);
                stateStorage.setPrevSessionStatus(SessionState.Status.NATIVE);
                i3 = i + 1;
                length = i2;
                th2 = th;
            }
        }
    }

    public final void installExceptionHandler$tracer_crash_report_release(Context context) {
        O90.m5968f(context, "context");
        try {
            File minidumpDir = getMinidumpDir(context);
            FileUtils.mkdirsChecked(minidumpDir);
            Minidump.getInstance().installMinidumpWriter(minidumpDir.getPath());
        } catch (Throwable unused) {
        }
    }
}
