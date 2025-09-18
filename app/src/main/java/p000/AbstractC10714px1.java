package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: px1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10714px1 implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f40458a;

    /* renamed from: b */
    public final IBinder f40459b;

    /* renamed from: g */
    public final String f40460g;

    public /* synthetic */ AbstractC10714px1(IBinder iBinder, String str, int i) {
        this.f40458a = i;
        this.f40459b = iBinder;
        this.f40460g = str;
    }

    /* renamed from: G */
    public Parcel m23898G() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f40460g);
        return parcelObtain;
    }

    /* renamed from: H */
    public void m23899H(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f40459b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: I */
    public Parcel m23900I() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f40460g);
        return parcelObtain;
    }

    /* renamed from: J */
    public Parcel m23901J(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f40459b.transact(i, parcel, parcelObtain, 0);
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

    /* renamed from: K */
    public Parcel m23902K(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f40459b.transact(i, parcel, parcelObtain, 0);
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

    /* renamed from: L */
    public void m23903L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f40459b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: M */
    public void m23904M(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f40459b.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: N */
    public void m23905N(Parcel parcel) {
        try {
            this.f40459b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f40458a) {
        }
        return this.f40459b;
    }
}
