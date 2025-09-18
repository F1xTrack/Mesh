package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;

/* renamed from: bW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2341bW1 extends AbstractC1650Ux1 implements InterfaceC3600eX1 {
    public C2341bW1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void G(BE1 be1, LocationRequest locationRequest, BinderC6989sD1 binderC6989sD1) throws RemoteException {
        Parcel parcelZza = zza();
        LC1.c(parcelZza, be1);
        LC1.c(parcelZza, locationRequest);
        LC1.d(parcelZza, binderC6989sD1);
        zzc(88, parcelZza);
    }

    public final void H(LE1 le1) throws RemoteException {
        Parcel parcelZza = zza();
        LC1.c(parcelZza, le1);
        zzc(59, parcelZza);
    }
}
