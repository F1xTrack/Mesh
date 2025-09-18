package p000;

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
    public static final Parcelable.Creator<LE1> CREATOR = new C8697aD1(4);

    /* renamed from: a */
    public final int f6567a;

    /* renamed from: b */
    public final FE1 f6568b;

    /* renamed from: c */
    public final zzu f6569c;

    /* renamed from: d */
    public final zzr f6570d;

    /* renamed from: e */
    public final PendingIntent f6571e;

    /* renamed from: f */
    public final TR1 f6572f;

    /* renamed from: g */
    public final String f6573g;

    public LE1(int i, FE1 fe1, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f6567a = i;
        this.f6568b = fe1;
        TR1 no1 = null;
        this.f6569c = iBinder != null ? zzt.zzb(iBinder) : null;
        this.f6571e = pendingIntent;
        this.f6570d = iBinder2 != null ? zzq.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            no1 = iInterfaceQueryLocalInterface instanceof TR1 ? (TR1) iInterfaceQueryLocalInterface : new NO1(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }
        this.f6572f = no1;
        this.f6573g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f6567a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f6568b, i, false);
        zzu zzuVar = this.f6569c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzuVar == null ? null : zzuVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f6571e, i, false);
        zzr zzrVar = this.f6570d;
        SafeParcelWriter.writeIBinder(parcel, 5, zzrVar == null ? null : zzrVar.asBinder(), false);
        TR1 tr1 = this.f6572f;
        SafeParcelWriter.writeIBinder(parcel, 6, tr1 != null ? tr1.asBinder() : null, false);
        SafeParcelWriter.writeString(parcel, 8, this.f6573g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
