package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class KZ1 extends AbstractC1572Tx1 {
    public final InterfaceC3515e50 G(BinderC2421bx0 binderC2421bx0, String str, int i, BinderC2421bx0 binderC2421bx02) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.d(parcelZza, binderC2421bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        KC1.d(parcelZza, binderC2421bx02);
        Parcel parcelZzB = zzB(2, parcelZza);
        InterfaceC3515e50 interfaceC3515e50G = BinderC2421bx0.G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3515e50G;
    }

    public final InterfaceC3515e50 H(BinderC2421bx0 binderC2421bx0, String str, int i, BinderC2421bx0 binderC2421bx02) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.d(parcelZza, binderC2421bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        KC1.d(parcelZza, binderC2421bx02);
        Parcel parcelZzB = zzB(3, parcelZza);
        InterfaceC3515e50 interfaceC3515e50G = BinderC2421bx0.G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3515e50G;
    }
}
