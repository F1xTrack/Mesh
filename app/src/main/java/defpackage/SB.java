package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class SB extends Binder implements Q40 {
    public final Handler a;
    public final /* synthetic */ OJ1 b;

    public SB(OJ1 oj1) {
        this.b = oj1;
        attachInterface(this, Q40.c);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = Q40.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.a;
        switch (i) {
            case 2:
                handler.post(new RB(this, parcel.readInt(), (Bundle) R12.a(parcel, Bundle.CREATOR)));
                return true;
            case 3:
                handler.post(new RB(this, parcel.readString(), (Bundle) R12.a(parcel, Bundle.CREATOR), 2));
                return true;
            case 4:
                handler.post(new RB(this, (Bundle) R12.a(parcel, Bundle.CREATOR), 3));
                parcel2.writeNoException();
                return true;
            case 5:
                handler.post(new RB(this, parcel.readString(), (Bundle) R12.a(parcel, Bundle.CREATOR), 4));
                parcel2.writeNoException();
                return true;
            case 6:
                handler.post(new RB(this, parcel.readInt(), (Uri) R12.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) R12.a(parcel, Bundle.CREATOR)));
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                handler.post(new RB(this, parcel.readInt(), parcel.readInt(), (Bundle) R12.a(parcel, Bundle.CREATOR)));
                return true;
            case 9:
                handler.post(new RB(this, (Bundle) R12.a(parcel, Bundle.CREATOR), 7));
                return true;
            case 10:
                handler.post(new RB(this, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) R12.a(parcel, Bundle.CREATOR)));
                return true;
            case 11:
                handler.post(new RB(this, (Bundle) R12.a(parcel, Bundle.CREATOR), 9));
                return true;
            case 12:
                handler.post(new RB(this, (Bundle) R12.a(parcel, Bundle.CREATOR), 0));
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
