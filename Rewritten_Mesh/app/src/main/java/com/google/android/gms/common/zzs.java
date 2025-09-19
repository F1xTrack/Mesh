package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.BinderC8916bx0;
import p000.InterfaceC9197e50;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getCallingPackage", m11119id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getCallingCertificateBinder", m11119id = 2, type = "android.os.IBinder")
    private final zzj zzb;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m11119id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", m11119id = 4)
    private final boolean zzd;

    public zzs(String str, zzj zzjVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            zzjVar = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzjVar, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m11120id = 1) String str, @SafeParcelable.Param(m11120id = 2) IBinder iBinder, @SafeParcelable.Param(m11120id = 3) boolean z, @SafeParcelable.Param(m11120id = 4) boolean z2) {
        this.zza = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                InterfaceC9197e50 interfaceC9197e50Zzd = com.google.android.gms.common.internal.zzz.zzg(iBinder).zzd();
                byte[] bArr = interfaceC9197e50Zzd == null ? null : (byte[]) BinderC8916bx0.m10547H(interfaceC9197e50Zzd);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.zzb = zzkVar;
        this.zzc = z;
        this.zzd = z2;
    }
}
