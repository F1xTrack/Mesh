package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class f extends Binder implements IMetricaService {
    public static final /* synthetic */ int a = 0;

    @Override // com.yandex.metrica.IMetricaService
    public final void a(int i, Bundle bundle) {
        MetricaService.c.a(i, bundle);
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void b(Bundle bundle) {
        MetricaService.c.b(bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1598968902) {
            parcel2.writeString("com.yandex.metrica.IMetricaService");
            return true;
        }
        if (i == 1) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.c.a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.c.reportData(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 3) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.c.b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.c.a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i != 5) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("com.yandex.metrica.IMetricaService");
        MetricaService.c.a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        return true;
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void reportData(Bundle bundle) {
        MetricaService.c.reportData(bundle);
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void a(Bundle bundle) {
        MetricaService.c.a(bundle);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
