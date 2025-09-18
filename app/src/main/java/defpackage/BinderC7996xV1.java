package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7996xV1 extends AbstractBinderC6795rC1 implements XJ1 {
    public final /* synthetic */ AtomicReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7996xV1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.a = atomicReference;
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C8382zX1.CREATOR);
        AbstractC6032nC1.d(parcel);
        m(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // defpackage.XJ1
    public final void m(List list) {
        synchronized (this.a) {
            this.a.set(list);
            this.a.notifyAll();
        }
    }
}
