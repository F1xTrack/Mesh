package p000;

import android.app.job.JobParameters;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: cY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8994cY0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f17598e;

    /* renamed from: f */
    public final /* synthetic */ SendMetricsEventJobService f17599f;

    /* renamed from: g */
    public final /* synthetic */ JobParameters f17600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8994cY0(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters, int i) {
        super(1);
        this.f17598e = i;
        this.f17599f = sendMetricsEventJobService;
        this.f17600g = jobParameters;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f17598e) {
            case 0:
                O90.m5968f((Throwable) obj, "<anonymous parameter 0>");
                SendMetricsEventJobService sendMetricsEventJobService = this.f17599f;
                JobParameters jobParameters = this.f17600g;
                if (!sendMetricsEventJobService.f42139c) {
                    sendMetricsEventJobService.jobFinished(jobParameters, false);
                }
                break;
            default:
                O90.m5968f((C8313Tf1) obj, "it");
                SendMetricsEventJobService sendMetricsEventJobService2 = this.f17599f;
                JobParameters jobParameters2 = this.f17600g;
                if (!sendMetricsEventJobService2.f42139c) {
                    sendMetricsEventJobService2.jobFinished(jobParameters2, false);
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
