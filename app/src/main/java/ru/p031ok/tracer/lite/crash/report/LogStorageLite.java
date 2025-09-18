package ru.p031ok.tracer.lite.crash.report;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;
import p000.C6470n8;
import p000.O90;

@Metadata(m22266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/LogStorageLite;", "", "<init>", "()V", "", "msg", "LTf1;", "log", "(Ljava/lang/String;)V", "", "startElapsedRealtime", "J", "", "logsLength", "I", "Ln8;", "Lru/ok/tracer/lite/crash/report/LogEntryLite;", "logsDeque", "Ln8;", "", "getLogs$tracer_lite_crash_report_release", "()Ljava/util/List;", "logs", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class LogStorageLite {
    private final C6470n8 logsDeque;
    private int logsLength;
    private final long startElapsedRealtime;

    public LogStorageLite() {
        this.startElapsedRealtime = Build.VERSION.SDK_INT >= 24 ? Process.getStartElapsedRealtime() : SystemClock.elapsedRealtime();
        this.logsDeque = new C6470n8();
    }

    public final List<LogEntryLite> getLogs$tracer_lite_crash_report_release() {
        List<LogEntryLite> listM25982b0;
        synchronized (this.logsDeque) {
            listM25982b0 = AbstractC7167xu.m25982b0(this.logsDeque);
        }
        return listM25982b0;
    }

    public final void log(String msg) {
        O90.m5968f(msg, "msg");
        String strM25349X = AbstractC11374v51.m25349X(65506, msg);
        LogEntryLite logEntryLite = new LogEntryLite(SystemClock.elapsedRealtime() - this.startElapsedRealtime, strM25349X);
        synchronized (this.logsDeque) {
            this.logsDeque.m23084i(logEntryLite);
            this.logsLength = strM25349X.length() + 30 + this.logsLength;
            while (this.logsLength > 65536) {
                this.logsDeque.m23092y();
            }
        }
    }
}
