package ru.ok.tracer;

import android.app.Application;
import defpackage.NN;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.DefaultTracerLoggerDelegate;
import ru.ok.tracer.utils.TracerLoggerDelegate;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/tracer/TracerApplication;", "Landroid/app/Application;", "Lru/ok/tracer/HasTracerConfiguration;", "Lru/ok/tracer/HasTracerSystemInfo;", "Lru/ok/tracer/HasTracerLogger;", "()V", "tracerLoggerDelegate", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "getTracerLoggerDelegate", "()Lru/ok/tracer/utils/TracerLoggerDelegate;", "tracerSystemInfo", "", "", "getTracerSystemInfo", "()Ljava/util/Map;", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TracerApplication extends Application implements HasTracerConfiguration, HasTracerSystemInfo, HasTracerLogger {
    @Override // ru.ok.tracer.HasTracerLogger
    public TracerLoggerDelegate getTracerLoggerDelegate() {
        return DefaultTracerLoggerDelegate.INSTANCE;
    }

    @Override // ru.ok.tracer.HasTracerSystemInfo
    public Map<String, String> getTracerSystemInfo() {
        return NN.a;
    }
}
