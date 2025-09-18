package p000;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class BV1 extends AbstractBinderC10876rC1 implements InterfaceC9230eL1 {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BV1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f847a = atomicReference;
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        C8739aY1 c8739aY1 = (C8739aY1) AbstractC10364nC1.m23100a(parcel, C8739aY1.CREATOR);
        AbstractC10364nC1.m23103d(parcel);
        mo735r(c8739aY1);
        return true;
    }

    @Override // p000.InterfaceC9230eL1
    /* renamed from: r */
    public final void mo735r(C8739aY1 c8739aY1) {
        synchronized (this.f847a) {
            this.f847a.set(c8739aY1);
            this.f847a.notifyAll();
        }
    }
}
