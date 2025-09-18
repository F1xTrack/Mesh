package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Xw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1881Xw1 extends AbstractBinderC1491Sw1 implements InterfaceC2422bx1 {
    @Override // defpackage.AbstractBinderC1491Sw1
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                AbstractC1647Uw1.b(parcel);
                break;
            case 4:
                AbstractC1647Uw1.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC1647Uw1.b(parcel);
                break;
            case 7:
                AbstractC1647Uw1.b(parcel);
                break;
            case 8:
                C5409jx1 c5409jx1 = (C5409jx1) AbstractC1647Uw1.a(parcel, C5409jx1.CREATOR);
                AbstractC1647Uw1.b(parcel);
                zab(c5409jx1);
                break;
            case 9:
                AbstractC1647Uw1.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
