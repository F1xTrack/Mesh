package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.AbstractC7222ym;
import p000.C11264uE1;
import p000.VE1;

@SafeParcelable.Class(creator = "LastLocationRequestCreator")
/* loaded from: classes.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzv();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", m11119id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", m11119id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", m11119id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getModuleId", m11119id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getImpersonation", m11119id = 5)
    private final C11264uE1 zze;

    public static final class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;
        private String zzd;
        private C11264uE1 zze;

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
            this.zze = null;
        }

        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j) {
            Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            return this;
        }

        public Builder(LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zzc();
            this.zzd = lastLocationRequest.zzb();
            this.zze = lastLocationRequest.zza();
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(m11120id = 1) long j, @SafeParcelable.Param(m11120id = 2) int i, @SafeParcelable.Param(m11120id = 3) boolean z, @SafeParcelable.Param(m11120id = 4) String str, @SafeParcelable.Param(m11120id = 5) C11264uE1 c11264uE1) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str;
        this.zze = c11264uE1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd) && Objects.equal(this.zze, lastLocationRequest.zze);
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public String toString() {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sbM26238o.append("maxAge=");
            VE1.m8337a(this.zza, sbM26238o);
        }
        if (this.zzb != 0) {
            sbM26238o.append(", ");
            sbM26238o.append(zzo.zzb(this.zzb));
        }
        if (this.zzc) {
            sbM26238o.append(", bypass");
        }
        if (this.zzd != null) {
            sbM26238o.append(", moduleId=");
            sbM26238o.append(this.zzd);
        }
        if (this.zze != null) {
            sbM26238o.append(", impersonation=");
            sbM26238o.append(this.zze);
        }
        sbM26238o.append(']');
        return sbM26238o.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C11264uE1 zza() {
        return this.zze;
    }

    @Deprecated
    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzc;
    }
}
