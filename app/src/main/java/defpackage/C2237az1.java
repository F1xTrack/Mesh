package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: az1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237az1 extends AbstractC6555px1 implements InterfaceC6561pz1 {
    public final C1653Uy1 O(BinderC2421bx0 binderC2421bx0, C0562Gy1 c0562Gy1) {
        C1653Uy1 c1653Uy1;
        Parcel parcelI = I();
        NC1.a(parcelI, binderC2421bx0);
        parcelI.writeInt(1);
        c0562Gy1.writeToParcel(parcelI, 0);
        Parcel parcelK = K(1, parcelI);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder == null) {
            c1653Uy1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c1653Uy1 = iInterfaceQueryLocalInterface instanceof C1653Uy1 ? (C1653Uy1) iInterfaceQueryLocalInterface : new C1653Uy1(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 1);
        }
        parcelK.recycle();
        return c1653Uy1;
    }
}
