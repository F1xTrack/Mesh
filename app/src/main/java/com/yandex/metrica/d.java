package com.yandex.metrica;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d implements IMetricaService {
    public IBinder a;

    @Override // com.yandex.metrica.IMetricaService
    public final void a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.a.transact(4, parcelObtain, null, 1)) {
                int i = f.a;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void b(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.a.transact(3, parcelObtain, null, 1)) {
                int i = f.a;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void reportData(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.a.transact(2, parcelObtain, null, 1)) {
                int i = f.a;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.yandex.metrica.IMetricaService
    public final void a(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.a.transact(5, parcelObtain, null, 1)) {
                int i2 = f.a;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
