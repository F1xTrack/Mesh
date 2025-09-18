package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.AbstractC1374Vq;

@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
@Deprecated
/* loaded from: classes.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m11119id = 1)
    public final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m11119id = 2)
    public final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", m11119id = 3)
    public final long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", m11119id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(m11120id = 1) int i, @SafeParcelable.Param(m11120id = 2) int i2, @SafeParcelable.Param(m11120id = 3) long j, @SafeParcelable.Param(m11120id = 4) long j2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.zza == zzacVar.zza && this.zzb == zzacVar.zzb && this.zzc == zzacVar.zzc && this.zzd == zzacVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc));
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        long j = this.zzd;
        long j2 = this.zzc;
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("NetworkLocationStatus: Wifi status: ", " Cell status: ", i, i2, " elapsed time NS: ");
        sbM8594m.append(j);
        sbM8594m.append(" system time ms: ");
        sbM8594m.append(j2);
        return sbM8594m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
