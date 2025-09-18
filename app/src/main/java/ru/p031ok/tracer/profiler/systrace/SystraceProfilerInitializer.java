package ru.p031ok.tracer.profiler.systrace;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7230yu;
import p000.O90;
import ru.p031ok.tracer.TracerInitializer;
import ru.p031ok.tracer.startup.Initializer;
import ru.p031ok.tracer.utils.Logger;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfilerInitializer;", "Lru/ok/tracer/startup/Initializer;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystraceProfilerInitializer implements Initializer<SystraceProfiler> {
    @Override // ru.p031ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return AbstractC7230yu.m26274e(TracerInitializer.class);
    }

    @Override // ru.p031ok.tracer.startup.Initializer
    public SystraceProfiler create(Context context) {
        O90.m5968f(context, "context");
        if (SystraceProfilerConfiguration.INSTANCE.get$tracer_profiler_systrace_release().getEnabled()) {
            Logger.d$default("Systrace profiler initialized!", null, 2, null);
        } else {
            Logger.d$default("Systrace profiler disabled!", null, 2, null);
        }
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        systraceProfiler.init$tracer_profiler_systrace_release(context);
        return systraceProfiler;
    }
}
