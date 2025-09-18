package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzq;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzt;
import com.google.android.gms.location.zzu;

/* loaded from: classes.dex */
public final class LE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LE1> CREATOR = new C2093aD1(4);
    public final int a;
    public final FE1 b;
    public final zzu c;
    public final zzr d;
    public final PendingIntent e;
    public final TR1 f;
    public final String g;

    public LE1(int i, FE1 fe1, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.a = i;
        this.b = fe1;
        TR1 no1 = null;
        this.c = iBinder != null ? zzt.zzb(iBinder) : null;
        this.e = pendingIntent;
        this.d = iBinder2 != null ? zzq.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            no1 = iInterfaceQueryLocalInterface instanceof TR1 ? (TR1) iInterfaceQueryLocalInterface : new NO1(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }
        this.f = no1;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        zzu zzuVar = this.c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzuVar == null ? null : zzuVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.e, i, false);
        zzr zzrVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 5, zzrVar == null ? null : zzrVar.asBinder(), false);
        TR1 tr1 = this.f;
        SafeParcelWriter.writeIBinder(parcel, 6, tr1 != null ? tr1.asBinder() : null, false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
