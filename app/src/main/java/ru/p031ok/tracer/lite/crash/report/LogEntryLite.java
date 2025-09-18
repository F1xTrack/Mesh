package ru.p031ok.tracer.lite.crash.report;

import java.io.IOException;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, m22267d2 = {"Lru/ok/tracer/lite/crash/report/LogEntryLite;", "", "", "ts", "", "messageString", "<init>", "(JLjava/lang/String;)V", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "", "seq", "LTf1;", "appendToApi", "(Ljava/lang/Appendable;I)V", "J", "getTs", "()J", "Ljava/lang/String;", "tracer-lite-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class LogEntryLite {
    private final String messageString;
    private final long ts;

    public LogEntryLite(long j, String str) {
        O90.m5968f(str, "messageString");
        this.ts = j;
        this.messageString = str;
    }

    public static /* synthetic */ void appendToApi$default(LogEntryLite logEntryLite, Appendable appendable, int i, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        logEntryLite.appendToApi(appendable, i);
    }

    public final void appendToApi(Appendable out, int seq) throws IOException {
        O90.m5968f(out, "out");
        out.append("#");
        out.append(String.valueOf(seq));
        out.append(" ");
        out.append(String.valueOf(this.ts));
        out.append(" | ");
        out.append(this.messageString);
        out.append("\n");
    }

    public final long getTs() {
        return this.ts;
    }
}
