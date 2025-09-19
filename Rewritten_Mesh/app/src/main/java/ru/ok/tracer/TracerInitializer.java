package ru.ok.tracer;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.AbstractC8259yu;
import defpackage.O90;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.startup.Initializer;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Lru/ok/tracer/startup/Initializer;", "Lru/ok/tracer/Tracer;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerInitializer implements Initializer<Tracer> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return AbstractC8259yu.e(LoggerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public Tracer create(Context context) throws PackageManager.NameNotFoundException {
        O90.f(context, "context");
        Tracer tracer = Tracer.INSTANCE;
        tracer.init$tracer_commons_release(context);
        return tracer;
    }
}
