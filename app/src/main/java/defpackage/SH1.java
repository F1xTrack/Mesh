package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class SH1 extends AbstractBinderC6795rC1 implements InterfaceC7948xF1 {
    public final /* synthetic */ RunnableC7990xT1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SH1(RunnableC7990xT1 runnableC7990xT1) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.a = runnableC7990xT1;
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) throws NumberFormatException {
        if (i != 2) {
            return false;
        }
        v();
        return true;
    }

    @Override // defpackage.InterfaceC7948xF1
    public final void v() throws NumberFormatException {
        this.a.run();
    }
}
