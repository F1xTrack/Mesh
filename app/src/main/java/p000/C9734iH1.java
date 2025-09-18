package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: iH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9734iH1 extends AbstractRunnableC11650xG1 {

    /* renamed from: e */
    public final /* synthetic */ int f29045e;

    /* renamed from: f */
    public final /* synthetic */ CG1 f29046f;

    /* renamed from: g */
    public final /* synthetic */ Object f29047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9734iH1(CG1 cg1, Object obj, int i) {
        super(cg1, true);
        this.f29045e = i;
        this.f29047g = obj;
        this.f29046f = cg1;
    }

    @Override // p000.AbstractRunnableC11650xG1
    /* renamed from: a */
    public final void mo1137a() {
        switch (this.f29045e) {
            case 0:
                if (((Boolean) this.f29047g) == null) {
                    ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f29046f.f1294h)).clearMeasurementEnabled(this.f45510a);
                    break;
                } else {
                    ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f29046f.f1294h)).setMeasurementEnabled(((Boolean) this.f29047g).booleanValue(), this.f45510a);
                    break;
                }
            case 1:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f29046f.f1294h)).retrieveAndUploadBatches(new SH1((RunnableC11676xT1) this.f29047g));
                break;
            default:
                ((InterfaceC8701aF1) Preconditions.checkNotNull(this.f29046f.f1294h)).registerOnMeasurementEventListener((BinderC11777yG1) this.f29047g);
                break;
        }
    }
}
