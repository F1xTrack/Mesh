package ru.ok.tracer.lite.crash.report;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.AbstractC7538v51;
import defpackage.AbstractC8069xu;
import defpackage.C6018n8;
import defpackage.O90;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ok/tracer/lite/crash/report/LogStorageLite;", "", "<init>", "()V", "", "msg", "LTf1;", "log", "(Ljava/lang/String;)V", "", "startElapsedRealtime", "J", "", "logsLength", "I", "Ln8;", "Lru/ok/tracer/lite/crash/report/LogEntryLite;", "logsDeque", "Ln8;", "", "getLogs$tracer_lite_crash_report_release", "()Ljava/util/List;", "logs", "tracer-lite-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LogStorageLite {
    private final C6018n8 logsDeque;
    private int logsLength;
    private final long startElapsedRealtime;

    public LogStorageLite() {
        this.startElapsedRealtime = Build.VERSION.SDK_INT >= 24 ? Process.getStartElapsedRealtime() : SystemClock.elapsedRealtime();
        this.logsDeque = new C6018n8();
    }

    public final List<LogEntryLite> getLogs$tracer_lite_crash_report_release() {
        List<LogEntryLite> listB0;
        synchronized (this.logsDeque) {
            listB0 = AbstractC8069xu.b0(this.logsDeque);
        }
        return listB0;
    }

    public final void log(String msg) {
        O90.f(msg, "msg");
        String strX = AbstractC7538v51.X(65506, msg);
        LogEntryLite logEntryLite = new LogEntryLite(SystemClock.elapsedRealtime() - this.startElapsedRealtime, strX);
        synchronized (this.logsDeque) {
            this.logsDeque.i(logEntryLite);
            this.logsLength = strX.length() + 30 + this.logsLength;
            while (this.logsLength > 65536) {
                this.logsDeque.y();
            }
        }
    }
}
