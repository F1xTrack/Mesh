package p000;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11680xV1 extends AbstractBinderC10876rC1 implements XJ1 {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f45664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC11680xV1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f45664a = atomicReference;
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C11938zX1.CREATOR);
        AbstractC10364nC1.m23103d(parcel);
        mo8972m(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // p000.XJ1
    /* renamed from: m */
    public final void mo8972m(List list) {
        synchronized (this.f45664a) {
            this.f45664a.set(list);
            this.f45664a.notifyAll();
        }
    }
}
