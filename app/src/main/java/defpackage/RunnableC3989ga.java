package defpackage;

import android.os.Process;
import ru.ok.tracer.utils.TracerThreads;

/* renamed from: ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3989ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ RunnableC3989ga(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(-16);
                this.b.run();
                break;
            default:
                TracerThreads.runInBgAfterStartup$lambda$0(this.b);
                break;
        }
    }
}
