package p000;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: yY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11813yY1 extends AbstractC8349Tx1 {
    /* renamed from: G */
    public final InterfaceC9197e50 m26165G(BinderC8916bx0 binderC8916bx0, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(2, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }

    /* renamed from: H */
    public final InterfaceC9197e50 m26166H(BinderC8916bx0 binderC8916bx0, String str, int i, BinderC8916bx0 binderC8916bx02) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        KC1.m4579d(parcelZza, binderC8916bx02);
        Parcel parcelZzB = zzB(8, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }

    /* renamed from: I */
    public final InterfaceC9197e50 m26167I(BinderC8916bx0 binderC8916bx0, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(4, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }

    /* renamed from: J */
    public final InterfaceC9197e50 m26168J(BinderC8916bx0 binderC8916bx0, String str, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4579d(parcelZza, binderC8916bx0);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        Parcel parcelZzB = zzB(7, parcelZza);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }
}
