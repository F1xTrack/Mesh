package defpackage;

import android.app.job.JobParameters;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* loaded from: classes2.dex */
public final class VA0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ PersistableConfigSyncJobService f;
    public final /* synthetic */ JobParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VA0(PersistableConfigSyncJobService persistableConfigSyncJobService, JobParameters jobParameters, int i) {
        super(1);
        this.e = i;
        this.f = persistableConfigSyncJobService;
        this.g = jobParameters;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                Throwable th = (Throwable) obj;
                O90.f(th, "throwable");
                int i = PersistableConfigSyncJobService.f;
                PersistableConfigSyncJobService persistableConfigSyncJobService = this.f;
                persistableConfigSyncJobService.getClass();
                C7600vQ0 c7600vQ0 = th instanceof BQ0 ? new C7600vQ0("Network exception in background sync job", th) : th instanceof InterruptedException ? new C7600vQ0("Background sync job was canceled", th) : new C7600vQ0("Unknown error in background sync job", th);
                persistableConfigSyncJobService.b.a(c7600vQ0);
                persistableConfigSyncJobService.c.a(c7600vQ0);
                JobParameters jobParameters = this.g;
                if (!persistableConfigSyncJobService.e) {
                    persistableConfigSyncJobService.jobFinished(jobParameters, false);
                }
                break;
            default:
                O90.f((C1518Tf1) obj, "it");
                PersistableConfigSyncJobService persistableConfigSyncJobService2 = this.f;
                JobParameters jobParameters2 = this.g;
                if (!persistableConfigSyncJobService2.e) {
                    persistableConfigSyncJobService2.jobFinished(jobParameters2, false);
                }
                break;
        }
        return C1518Tf1.a;
    }
}
