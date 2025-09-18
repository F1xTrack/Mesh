package p000;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jQ */
/* loaded from: classes.dex */
public final class C6236jQ extends AbstractRunnableC7152xf {

    /* renamed from: b */
    public final /* synthetic */ ExecutorService f35145b;

    /* renamed from: c */
    public final /* synthetic */ TimeUnit f35146c;

    public C6236jQ(ExecutorService executorService, TimeUnit timeUnit) {
        super(0);
        this.f35145b = executorService;
        this.f35146c = timeUnit;
    }

    @Override // p000.AbstractRunnableC7152xf
    /* renamed from: b */
    public final void mo19030b() {
        ExecutorService executorService = this.f35145b;
        try {
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f35146c)) {
                return;
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            executorService.shutdownNow();
        }
    }
}
