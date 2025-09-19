package ru.p031ok.tracer.crash.report;

import java.lang.Thread;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/crash/report/TracerUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "<init>", "()V", "Ljava/lang/Thread;", "t", "", "e", "LTf1;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) {
        O90.m5968f(t, "t");
        O90.m5968f(e, "e");
        TracerCrashReport.reportUncaughtException$tracer_crash_report_release(e);
    }
}
