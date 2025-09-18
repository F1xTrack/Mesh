package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R40 implements T40 {

    /* renamed from: a */
    public IBinder f9991a;

    /* renamed from: G */
    public final boolean m6892G(BinderC1144SB binderC1144SB, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(T40.f11144d);
            parcelObtain.writeStrongInterface(binderC1144SB);
            S12.m7149a(parcelObtain, uri);
            S12.m7149a(parcelObtain, bundle);
            int size = arrayList.size();
            parcelObtain.writeInt(size);
            for (int i = 0; i < size; i++) {
                S12.m7149a(parcelObtain, (Parcelable) arrayList.get(i));
            }
            this.f9991a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: H */
    public final boolean m6893H(BinderC1144SB binderC1144SB) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(T40.f11144d);
            parcelObtain.writeStrongInterface(binderC1144SB);
            this.f9991a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: I */
    public final boolean m6894I() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(T40.f11144d);
            parcelObtain.writeLong(0L);
            this.f9991a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9991a;
    }
}
