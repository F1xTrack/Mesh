package ru.ok.tracer.crash.report;

import kotlin.Metadata;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLiteKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"FEATURE_CRASH_REPORT", "Lru/ok/tracer/TracerFeature;", "getFEATURE_CRASH_REPORT", "()Lru/ok/tracer/TracerFeature;", "tracer-crash-report_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FEATURE_CRASH_REPORTKt {
    private static final TracerFeature FEATURE_CRASH_REPORT = new TracerFeature(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT);

    public static final TracerFeature getFEATURE_CRASH_REPORT() {
        return FEATURE_CRASH_REPORT;
    }
}
