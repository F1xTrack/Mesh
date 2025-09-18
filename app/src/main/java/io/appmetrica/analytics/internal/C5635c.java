package io.appmetrica.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.internal.c */
/* loaded from: classes2.dex */
public final class C5635c implements IAppMetricaService {

    /* renamed from: a */
    public final IBinder f32951a;

    public C5635c(IBinder iBinder) {
        this.f32951a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32951a;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f32951a.transact(2, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f32951a.transact(3, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f32951a.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
