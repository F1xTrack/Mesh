package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: io.appmetrica.analytics.identifiers.impl.m */
/* loaded from: classes2.dex */
public final class C4347m implements InterfaceC4349o {

    /* renamed from: a */
    public final IBinder f29828a;

    public C4347m(IBinder iBinder) {
        this.f29828a = iBinder;
    }

    /* renamed from: a */
    public final String m19176a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f29828a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29828a;
    }

    /* renamed from: b */
    public final boolean m19177b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f29828a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
