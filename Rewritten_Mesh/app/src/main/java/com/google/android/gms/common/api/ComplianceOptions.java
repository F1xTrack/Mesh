package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.AbstractC7222ym;

@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
/* loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;
    public static final ComplianceOptions zza;

    @SafeParcelable.Field(getter = "getCallerProductId", m11119id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", m11119id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", m11119id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "isUserData", m11119id = 4)
    private final boolean zze;

    @KeepForSdk
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @KeepForSdk
        public Builder setCallerProductId(int i) {
            this.zza = i;
            return this;
        }

        @KeepForSdk
        public Builder setDataOwnerProductId(int i) {
            this.zzb = i;
            return this;
        }

        @KeepForSdk
        public Builder setIsUserData(boolean z) {
            this.zzd = z;
            return this;
        }

        @KeepForSdk
        public Builder setProcessingReason(int i) {
            this.zzc = i;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        zza = builderNewBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(m11120id = 1) int i, @SafeParcelable.Param(m11120id = 2) int i2, @SafeParcelable.Param(m11120id = 3) int i3, @SafeParcelable.Param(m11120id = 4) boolean z) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceOptions{callerProductId=");
        sb.append(this.zzb);
        sb.append(", dataOwnerProductId=");
        sb.append(this.zzc);
        sb.append(", processingReason=");
        sb.append(this.zzd);
        sb.append(", isUserData=");
        return AbstractC7222ym.m26236m(sb, this.zze, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @KeepForSdk
    public static final Builder newBuilder(Context context) {
        return newBuilder();
    }
}
