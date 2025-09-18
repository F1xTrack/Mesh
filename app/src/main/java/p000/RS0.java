package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class RS0 extends Binder implements G50 {

    /* renamed from: b */
    public static final /* synthetic */ int f10182b = 0;

    /* renamed from: a */
    public final /* synthetic */ SS0 f10183a;

    public RS0(SS0 ss0) {
        this.f10183a = ss0;
        attachInterface(this, G50.f3566f);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = G50.f3566f;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        SS0 ss0 = this.f10183a;
        ss0.getClass();
        ss0.mo7371a(i3, (Bundle) objCreateFromParcel);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
