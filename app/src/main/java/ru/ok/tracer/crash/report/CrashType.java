package ru.ok.tracer.crash.report;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/crash/report/CrashType;", "", "apiValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "CRASH", "NON_FATAL", "MINIDUMP", "ANR", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public enum CrashType {
    CRASH("CRASH"),
    NON_FATAL("NON_FATAL"),
    MINIDUMP("MINIDUMP"),
    ANR("ANR");

    private final String apiValue;

    CrashType(String str) {
        this.apiValue = str;
    }

    public final String getApiValue() {
        return this.apiValue;
    }
}
