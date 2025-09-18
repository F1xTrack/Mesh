package defpackage;

import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: bY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2346bY0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ SendMetricsEventJobService f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2346bY0(SendMetricsEventJobService sendMetricsEventJobService, int i) {
        super(0);
        this.e = i;
        this.f = sendMetricsEventJobService;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return C5958mp1.c.j(this.f);
            default:
                ((C5958mp1) this.f.a.getValue()).a.e();
                return C1518Tf1.a;
        }
    }
}
