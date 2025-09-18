package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class PB1 extends QA1 implements SB1 {
    public static SB1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof SB1 ? (SB1) iInterfaceQueryLocalInterface : new KB1(iBinder);
    }

    @Override // defpackage.QA1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        InterfaceC3515e50 interfaceC3515e50G = BinderC2421bx0.G(parcel.readStrongBinder());
        RA1 ra1 = (RA1) OC1.a(parcel, RA1.CREATOR);
        OC1.b(parcel);
        FB1 fb1NewBarcodeScanner = newBarcodeScanner(interfaceC3515e50G, ra1);
        parcel2.writeNoException();
        if (fb1NewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(fb1NewBarcodeScanner.asBinder());
        }
        return true;
    }
}
