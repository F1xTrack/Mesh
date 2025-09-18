package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.T0 */
/* loaded from: classes2.dex */
public final class C5805T0 implements InterfaceC6058l0 {

    /* renamed from: a */
    public boolean f33401a;

    /* renamed from: b */
    public Double f33402b;

    /* renamed from: c */
    public boolean f33403c;

    /* renamed from: d */
    public Double f33404d;

    /* renamed from: e */
    public String f33405e;

    /* renamed from: f */
    public boolean f33406f;

    /* renamed from: g */
    public int f33407g;

    /* renamed from: h */
    public ConcurrentHashMap f33408h;

    public C5805T0(C5759D1 c5759d1, C5820Y0 c5820y0) {
        this.f33403c = ((Boolean) c5820y0.f33441a).booleanValue();
        this.f33404d = (Double) c5820y0.f33442b;
        this.f33401a = ((Boolean) c5820y0.f33443c).booleanValue();
        this.f33402b = (Double) c5820y0.f33444d;
        this.f33405e = c5759d1.getProfilingTracesDirPath();
        this.f33406f = c5759d1.isProfilingEnabled();
        this.f33407g = c5759d1.getProfilingTracesHz();
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("profile_sampled").mo13825r(iLogger, Boolean.valueOf(this.f33401a));
        interfaceC5749A0.mo13828u("profile_sample_rate").mo13825r(iLogger, this.f33402b);
        interfaceC5749A0.mo13828u("trace_sampled").mo13825r(iLogger, Boolean.valueOf(this.f33403c));
        interfaceC5749A0.mo13828u("trace_sample_rate").mo13825r(iLogger, this.f33404d);
        interfaceC5749A0.mo13828u("profiling_traces_dir_path").mo13825r(iLogger, this.f33405e);
        interfaceC5749A0.mo13828u("is_profiling_enabled").mo13825r(iLogger, Boolean.valueOf(this.f33406f));
        interfaceC5749A0.mo13828u("profiling_traces_hz").mo13825r(iLogger, Integer.valueOf(this.f33407g));
        ConcurrentHashMap concurrentHashMap = this.f33408h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f33408h, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
