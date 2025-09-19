package ru.ok.tracer.utils;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.ok.tracer.CoreTracerConfiguration;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerThreads$bgExecutor$2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public static final TracerThreads$bgExecutor$2 INSTANCE = new TracerThreads$bgExecutor$2();

    public TracerThreads$bgExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "tracer-scheduler");
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Executor invoke() {
        Executor bgExecutor = CoreTracerConfiguration.INSTANCE.get().getBgExecutor();
        return bgExecutor != null ? new SequentialExecutor(bgExecutor) : Executors.newSingleThreadExecutor(new a());
    }
}
