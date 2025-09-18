package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;

/* renamed from: bW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8863bW1 extends AbstractC8401Ux1 implements InterfaceC9254eX1 {
    public C8863bW1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: G */
    public final void m10457G(BE1 be1, LocationRequest locationRequest, BinderC11006sD1 binderC11006sD1) throws RemoteException {
        Parcel parcelZza = zza();
        LC1.m4925c(parcelZza, be1);
        LC1.m4925c(parcelZza, locationRequest);
        LC1.m4926d(parcelZza, binderC11006sD1);
        zzc(88, parcelZza);
    }

    /* renamed from: H */
    public final void m10458H(LE1 le1) throws RemoteException {
        Parcel parcelZza = zza();
        LC1.m4925c(parcelZza, le1);
        zzc(59, parcelZza);
    }
}
