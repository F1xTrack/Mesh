package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;
import p000.AbstractC7222ym;

@KeepForSdk
@SafeParcelable.Class(creator = "ApiMetadataCreator")
/* loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    private static final ApiMetadata zza = newBuilder().build();

    @SafeParcelable.Field(getter = "getComplianceOptions", m11119id = 1)
    private final ComplianceOptions zzb;

    @KeepForSdk
    public static final class Builder {
        private ComplianceOptions zza;

        @KeepForSdk
        public ApiMetadata build() {
            return new ApiMetadata(this.zza);
        }

        @KeepForSdk
        public Builder setComplianceOptions(ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ApiMetadata(@SafeParcelable.Param(m11120id = 1) ComplianceOptions complianceOptions) {
        this.zzb = complianceOptions;
    }

    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(ComplianceOptions complianceOptions) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(complianceOptions);
        return builderNewBuilder.build();
    }

    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return zza;
    }

    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApiMetadata) {
            return Objects.equals(this.zzb, ((ApiMetadata) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    public final String toString() {
        return AbstractC7222ym.m26234k("ApiMetadata(complianceOptions=", String.valueOf(this.zzb), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, complianceOptions, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
