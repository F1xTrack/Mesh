package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: iH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4316iH1 extends AbstractRunnableC7951xG1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CG1 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4316iH1(CG1 cg1, Object obj, int i) {
        super(cg1, true);
        this.e = i;
        this.g = obj;
        this.f = cg1;
    }

    @Override // defpackage.AbstractRunnableC7951xG1
    public final void a() {
        switch (this.e) {
            case 0:
                if (((Boolean) this.g) == null) {
                    ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).clearMeasurementEnabled(this.a);
                    break;
                } else {
                    ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.a);
                    break;
                }
            case 1:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).retrieveAndUploadBatches(new SH1((RunnableC7990xT1) this.g));
                break;
            default:
                ((InterfaceC2099aF1) Preconditions.checkNotNull(this.f.h)).registerOnMeasurementEventListener((BinderC8141yG1) this.g);
                break;
        }
    }
}
