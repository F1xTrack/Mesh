package p000;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class SH1 extends AbstractBinderC10876rC1 implements InterfaceC11648xF1 {

    /* renamed from: a */
    public final /* synthetic */ RunnableC11676xT1 f10674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SH1(RunnableC11676xT1 runnableC11676xT1) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f10674a = runnableC11676xT1;
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) throws NumberFormatException {
        if (i != 2) {
            return false;
        }
        mo3337v();
        return true;
    }

    @Override // p000.InterfaceC11648xF1
    /* renamed from: v */
    public final void mo3337v() throws NumberFormatException {
        this.f10674a.run();
    }
}
