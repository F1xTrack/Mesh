package p000;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Xw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8555Xw1 extends AbstractBinderC8295Sw1 implements InterfaceC8917bx1 {
    @Override // p000.AbstractBinderC8295Sw1
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                AbstractC8399Uw1.m8203b(parcel);
                break;
            case 4:
                AbstractC8399Uw1.m8203b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC8399Uw1.m8203b(parcel);
                break;
            case 7:
                AbstractC8399Uw1.m8203b(parcel);
                break;
            case 8:
                C9946jx1 c9946jx1 = (C9946jx1) AbstractC8399Uw1.m8202a(parcel, C9946jx1.CREATOR);
                AbstractC8399Uw1.m8203b(parcel);
                zab(c9946jx1);
                break;
            case 9:
                AbstractC8399Uw1.m8203b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
