package ru.p031ok.tracer;

import android.app.Application;
import java.util.Map;
import kotlin.Metadata;
import p000.C0842NN;
import ru.p031ok.tracer.utils.DefaultTracerLoggerDelegate;
import ru.p031ok.tracer.utils.TracerLoggerDelegate;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/TracerApplication;", "Landroid/app/Application;", "Lru/ok/tracer/HasTracerConfiguration;", "Lru/ok/tracer/HasTracerSystemInfo;", "Lru/ok/tracer/HasTracerLogger;", "()V", "tracerLoggerDelegate", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "getTracerLoggerDelegate", "()Lru/ok/tracer/utils/TracerLoggerDelegate;", "tracerSystemInfo", "", "", "getTracerSystemInfo", "()Ljava/util/Map;", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public abstract class TracerApplication extends Application implements HasTracerConfiguration, HasTracerSystemInfo, HasTracerLogger {
    @Override // ru.p031ok.tracer.HasTracerLogger
    public TracerLoggerDelegate getTracerLoggerDelegate() {
        return DefaultTracerLoggerDelegate.INSTANCE;
    }

    @Override // ru.p031ok.tracer.HasTracerSystemInfo
    public Map<String, String> getTracerSystemInfo() {
        return C0842NN.f7735a;
    }
}
