package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: px1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6555px1 implements IInterface {
    public final /* synthetic */ int a;
    public final IBinder b;
    public final String g;

    public /* synthetic */ AbstractC6555px1(IBinder iBinder, String str, int i) {
        this.a = i;
        this.b = iBinder;
        this.g = str;
    }

    public Parcel G() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.g);
        return parcelObtain;
    }

    public void H(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel I() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.g);
        return parcelObtain;
    }

    public Parcel J(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel K(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void M(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void N(Parcel parcel) {
        try {
            this.b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.a) {
        }
        return this.b;
    }
}
