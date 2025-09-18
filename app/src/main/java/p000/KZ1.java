package p000;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class KZ1 extends AbstractC8349Tx1 {
    /* renamed from: G */
    public final InterfaceC9197e50 m4674G(BinderC8916bx0 binderC8916bx0, String str, int i, BinderC8916bx0 binderC8916bx02) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        KC1.m4579d(parcelZza, binderC8916bx02);
        Parcel parcelZzB = zzB(2, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }

    /* renamed from: H */
    public final InterfaceC9197e50 m4675H(BinderC8916bx0 binderC8916bx0, String str, int i, BinderC8916bx0 binderC8916bx02) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        KC1.m4579d(parcelZza, binderC8916bx02);
        Parcel parcelZzB = zzB(3, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }
}
