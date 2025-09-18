package defpackage;

import java.io.IOException;
import java.lang.Thread;
import ru.ok.tracer.heap.dumps.HeapDumps;

/* loaded from: classes2.dex */
public final /* synthetic */ class R20 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws IOException {
        HeapDumps.install$lambda$0(thread, th);
    }
}
