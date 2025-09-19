package ru.p031ok.tracer.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import ru.p031ok.tracer.CoreTracerConfiguration;

@Metadata(m22266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m22267d2 = {"<anonymous>", "Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "invoke"}, m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerThreads$bgExecutor$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    public static final TracerThreads$bgExecutor$2 INSTANCE = new TracerThreads$bgExecutor$2();

    public TracerThreads$bgExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "tracer-scheduler");
    }

    @Override // p000.InterfaceC6434mZ
    public final Executor invoke() {
        Executor bgExecutor = CoreTracerConfiguration.INSTANCE.get().getBgExecutor();
        return bgExecutor != null ? new SequentialExecutor(bgExecutor) : Executors.newSingleThreadExecutor(new ThreadFactoryC6788a());
    }
}
