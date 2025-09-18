package ru.p031ok.tracer.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.O90;
import p000.RunnableC4125ga;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, m22267d2 = {"Lru/ok/tracer/utils/TracerThreads;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "LTf1;", "runOnIo", "(Ljava/lang/Runnable;)V", "runInBgSequential", "runInBgAfterStartup", "Ljava/util/concurrent/Executor;", "ioExecutor$delegate", "Lkotlin/Lazy;", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "ioExecutor", "bgExecutor$delegate", "getBgExecutor", "bgExecutor", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerThreads {
    public static final TracerThreads INSTANCE = new TracerThreads();

    /* renamed from: ioExecutor$delegate, reason: from kotlin metadata */
    private static final Lazy ioExecutor = AbstractC0705LB.m4915b(TracerThreads$ioExecutor$2.INSTANCE);

    /* renamed from: bgExecutor$delegate, reason: from kotlin metadata */
    private static final Lazy bgExecutor = AbstractC0705LB.m4915b(TracerThreads$bgExecutor$2.INSTANCE);

    private TracerThreads() {
    }

    private final Executor getBgExecutor() {
        Object value = bgExecutor.getValue();
        O90.m5967e(value, "<get-bgExecutor>(...)");
        return (Executor) value;
    }

    private final Executor getIoExecutor() {
        return (Executor) ioExecutor.getValue();
    }

    public static final void runInBgAfterStartup$lambda$0(Runnable runnable) {
        O90.m5968f(runnable, "$runnable");
        INSTANCE.runInBgSequential(runnable);
    }

    public final void runInBgAfterStartup(Runnable runnable) {
        O90.m5968f(runnable, "runnable");
        new Handler(Looper.getMainLooper()).post(new RunnableC4125ga(runnable, 1));
    }

    public final void runInBgSequential(Runnable runnable) {
        O90.m5968f(runnable, "runnable");
        getBgExecutor().execute(runnable);
    }

    public final void runOnIo(Runnable runnable) {
        O90.m5968f(runnable, "runnable");
        getIoExecutor().execute(runnable);
    }
}
