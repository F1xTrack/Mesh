package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5308jQ extends AbstractRunnableC8024xf {
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ TimeUnit c;

    public C5308jQ(ExecutorService executorService, TimeUnit timeUnit) {
        super(0);
        this.b = executorService;
        this.c = timeUnit;
    }

    @Override // defpackage.AbstractRunnableC8024xf
    public final void b() {
        ExecutorService executorService = this.b;
        try {
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.c)) {
                return;
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            executorService.shutdownNow();
        }
    }
}
