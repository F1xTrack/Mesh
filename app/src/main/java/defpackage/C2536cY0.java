package defpackage;

import android.app.job.JobParameters;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: cY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2536cY0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ SendMetricsEventJobService f;
    public final /* synthetic */ JobParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2536cY0(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters, int i) {
        super(1);
        this.e = i;
        this.f = sendMetricsEventJobService;
        this.g = jobParameters;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                O90.f((Throwable) obj, "<anonymous parameter 0>");
                SendMetricsEventJobService sendMetricsEventJobService = this.f;
                JobParameters jobParameters = this.g;
                if (!sendMetricsEventJobService.c) {
                    sendMetricsEventJobService.jobFinished(jobParameters, false);
                }
                break;
            default:
                O90.f((C1518Tf1) obj, "it");
                SendMetricsEventJobService sendMetricsEventJobService2 = this.f;
                JobParameters jobParameters2 = this.g;
                if (!sendMetricsEventJobService2.c) {
                    sendMetricsEventJobService2.jobFinished(jobParameters2, false);
                }
                break;
        }
        return C1518Tf1.a;
    }
}
