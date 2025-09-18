package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.yandex.metrica.f */
/* loaded from: classes2.dex */
public final class BinderC2461f extends Binder implements IMetricaService {

    /* renamed from: a */
    public static final /* synthetic */ int f20813a = 0;

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: a */
    public final void mo13787a(int i, Bundle bundle) {
        MetricaService.f20732c.mo13892a(i, bundle);
    }

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: b */
    public final void mo13789b(Bundle bundle) {
        MetricaService.f20732c.mo13902b(bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1598968902) {
            parcel2.writeString("com.yandex.metrica.IMetricaService");
            return true;
        }
        if (i == 1) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f20732c.mo13899a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f20732c.reportData(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 3) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f20732c.mo13902b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
            MetricaService.f20732c.mo13896a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i != 5) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("com.yandex.metrica.IMetricaService");
        MetricaService.f20732c.mo13892a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        return true;
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void reportData(Bundle bundle) {
        MetricaService.f20732c.reportData(bundle);
    }

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: a */
    public final void mo13788a(Bundle bundle) {
        MetricaService.f20732c.mo13896a(bundle);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
