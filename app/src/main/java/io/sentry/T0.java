package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class T0 implements InterfaceC5141l0 {
    public boolean a;
    public Double b;
    public boolean c;
    public Double d;
    public String e;
    public boolean f;
    public int g;
    public ConcurrentHashMap h;

    public T0(D1 d1, Y0 y0) {
        this.c = ((Boolean) y0.a).booleanValue();
        this.d = (Double) y0.b;
        this.a = ((Boolean) y0.c).booleanValue();
        this.b = (Double) y0.d;
        this.e = d1.getProfilingTracesDirPath();
        this.f = d1.isProfilingEnabled();
        this.g = d1.getProfilingTracesHz();
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("profile_sampled").r(iLogger, Boolean.valueOf(this.a));
        a0.u("profile_sample_rate").r(iLogger, this.b);
        a0.u("trace_sampled").r(iLogger, Boolean.valueOf(this.c));
        a0.u("trace_sample_rate").r(iLogger, this.d);
        a0.u("profiling_traces_dir_path").r(iLogger, this.e);
        a0.u("is_profiling_enabled").r(iLogger, Boolean.valueOf(this.f));
        a0.u("profiling_traces_hz").r(iLogger, Integer.valueOf(this.g));
        ConcurrentHashMap concurrentHashMap = this.h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.h, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
