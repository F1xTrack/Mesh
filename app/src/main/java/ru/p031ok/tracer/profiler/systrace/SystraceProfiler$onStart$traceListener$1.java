package ru.p031ok.tracer.profiler.systrace;

import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import p000.AbstractC10132lO1;
import p000.MD0;
import p000.O90;
import p000.RunnableC9844j81;
import ru.p031ok.tracer.profiler.systrace.SystraceHook;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler;
import ru.p031ok.tracer.utils.Logger;

@Metadata(m22266d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"ru/ok/tracer/profiler/systrace/SystraceProfiler$onStart$traceListener$1", "Lru/ok/tracer/profiler/systrace/SystraceHook$TraceListener;", "Ljava/lang/Thread;", "execThread", "Ljava/lang/Runnable;", "stopRunnable", "LTf1;", "onStart", "(Ljava/lang/Thread;Ljava/lang/Runnable;)V", "Ljava/io/File;", "file", "onFinish", "(Ljava/io/File;)V", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystraceProfiler$onStart$traceListener$1 implements SystraceHook.TraceListener {
    final /* synthetic */ long $duration;
    final /* synthetic */ long $startRealtime;
    final /* synthetic */ String $tag;

    public SystraceProfiler$onStart$traceListener$1(long j, long j2, String str) {
        this.$duration = j;
        this.$startRealtime = j2;
        this.$tag = str;
    }

    public static final void onFinish$lambda$1(File file, String str, long j) {
        O90.m5968f(file, "$file");
        O90.m5968f(str, "$tag");
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        SystraceProfiler.state = new SystraceProfiler.Finished(file, str, j);
    }

    public static final void onStart$lambda$0(Thread thread, Runnable runnable) {
        O90.m5968f(thread, "$execThread");
        O90.m5968f(runnable, "$stopRunnable");
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        SystraceProfiler.state = new SystraceProfiler.InProgress(thread, runnable);
    }

    @Override // ru.ok.tracer.profiler.systrace.SystraceHook.TraceListener
    public void onFinish(File file) {
        O90.m5968f(file, "file");
        long jM22417b = AbstractC10132lO1.m22417b(this.$duration, SystemClock.elapsedRealtime() - this.$startRealtime);
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        RunnableC9844j81 runnableC9844j81 = new RunnableC9844j81(file, this.$tag, jM22417b, 0);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC9844j81.run();
        } else {
            SystraceProfiler.mainHandler.post(runnableC9844j81);
        }
    }

    @Override // ru.ok.tracer.profiler.systrace.SystraceHook.TraceListener
    public void onStart(Thread execThread, Runnable stopRunnable) {
        O90.m5968f(execThread, "execThread");
        O90.m5968f(stopRunnable, "stopRunnable");
        Logger.d$default("SystraceProfiler: started", null, 2, null);
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        MD0 md0 = new MD0(execThread, 26, stopRunnable);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            md0.run();
        } else {
            SystraceProfiler.mainHandler.post(md0);
        }
        SystraceProfiler.mainHandler.postDelayed(stopRunnable, this.$duration);
    }
}
