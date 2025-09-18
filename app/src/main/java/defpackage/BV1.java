package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class BV1 extends AbstractBinderC6795rC1 implements InterfaceC3564eL1 {
    public final /* synthetic */ AtomicReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BV1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.a = atomicReference;
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        C2156aY1 c2156aY1 = (C2156aY1) AbstractC6032nC1.a(parcel, C2156aY1.CREATOR);
        AbstractC6032nC1.d(parcel);
        r(c2156aY1);
        return true;
    }

    @Override // defpackage.InterfaceC3564eL1
    public final void r(C2156aY1 c2156aY1) {
        synchronized (this.a) {
            this.a.set(c2156aY1);
            this.a.notifyAll();
        }
    }
}
