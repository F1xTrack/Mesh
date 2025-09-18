package com.yandex.metrica;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.yandex.metrica.d */
/* loaded from: classes2.dex */
public final class C2459d implements IMetricaService {

    /* renamed from: a */
    public IBinder f20785a;

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: a */
    public final void mo13788a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.f20785a.transact(4, parcelObtain, null, 1)) {
                int i = BinderC2461f.f20813a;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20785a;
    }

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: b */
    public final void mo13789b(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.f20785a.transact(3, parcelObtain, null, 1)) {
                int i = BinderC2461f.f20813a;
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
            if (!this.f20785a.transact(2, parcelObtain, null, 1)) {
                int i = BinderC2461f.f20813a;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.yandex.metrica.IMetricaService
    /* renamed from: a */
    public final void mo13787a(int i, Bundle bundle) {
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
            if (!this.f20785a.transact(5, parcelObtain, null, 1)) {
                int i2 = BinderC2461f.f20813a;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
