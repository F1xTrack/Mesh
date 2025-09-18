package p000;

import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: bY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8866bY0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f17065e;

    /* renamed from: f */
    public final /* synthetic */ SendMetricsEventJobService f17066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8866bY0(SendMetricsEventJobService sendMetricsEventJobService, int i) {
        super(0);
        this.f17065e = i;
        this.f17066f = sendMetricsEventJobService;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f17065e) {
            case 0:
                return C10314mp1.f37956c.m1942j(this.f17066f);
            default:
                ((C10314mp1) this.f17066f.f42137a.getValue()).f37958a.m5556e();
                return C8313Tf1.f11463a;
        }
    }
}
