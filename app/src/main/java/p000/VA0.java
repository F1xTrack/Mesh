package p000;

import android.app.job.JobParameters;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* loaded from: classes2.dex */
public final class VA0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f12390e;

    /* renamed from: f */
    public final /* synthetic */ PersistableConfigSyncJobService f12391f;

    /* renamed from: g */
    public final /* synthetic */ JobParameters f12392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VA0(PersistableConfigSyncJobService persistableConfigSyncJobService, JobParameters jobParameters, int i) {
        super(1);
        this.f12390e = i;
        this.f12391f = persistableConfigSyncJobService;
        this.f12392g = jobParameters;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f12390e) {
            case 0:
                Throwable th = (Throwable) obj;
                O90.m5968f(th, "throwable");
                int i = PersistableConfigSyncJobService.f42143f;
                PersistableConfigSyncJobService persistableConfigSyncJobService = this.f12391f;
                persistableConfigSyncJobService.getClass();
                C11415vQ0 c11415vQ0 = th instanceof BQ0 ? new C11415vQ0("Network exception in background sync job", th) : th instanceof InterruptedException ? new C11415vQ0("Background sync job was canceled", th) : new C11415vQ0("Unknown error in background sync job", th);
                persistableConfigSyncJobService.f42145b.mo1679a(c11415vQ0);
                persistableConfigSyncJobService.f42146c.m9645a(c11415vQ0);
                JobParameters jobParameters = this.f12392g;
                if (!persistableConfigSyncJobService.f42148e) {
                    persistableConfigSyncJobService.jobFinished(jobParameters, false);
                }
                break;
            default:
                O90.m5968f((C8313Tf1) obj, "it");
                PersistableConfigSyncJobService persistableConfigSyncJobService2 = this.f12391f;
                JobParameters jobParameters2 = this.f12392g;
                if (!persistableConfigSyncJobService2.f42148e) {
                    persistableConfigSyncJobService2.jobFinished(jobParameters2, false);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
