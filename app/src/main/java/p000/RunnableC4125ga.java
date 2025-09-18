package p000;

import android.os.Process;
import ru.p031ok.tracer.utils.TracerThreads;

/* renamed from: ga */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4125ga implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27852a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f27853b;

    public /* synthetic */ RunnableC4125ga(Runnable runnable, int i) {
        this.f27852a = i;
        this.f27853b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f27852a) {
            case 0:
                Process.setThreadPriority(-16);
                this.f27853b.run();
                break;
            default:
                TracerThreads.runInBgAfterStartup$lambda$0(this.f27853b);
                break;
        }
    }
}
