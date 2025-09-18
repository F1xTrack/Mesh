package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.BinderC8916bx0;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getCallingPackage", m11119id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m11119id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", m11119id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCallingContextBinder", m11119id = 4, type = "android.os.IBinder")
    private final Context zzd;

    @SafeParcelable.Field(getter = "getIsChimeraPackage", m11119id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", m11119id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m11120id = 1) String str, @SafeParcelable.Param(m11120id = 2) boolean z, @SafeParcelable.Param(m11120id = 3) boolean z2, @SafeParcelable.Param(m11120id = 4) IBinder iBinder, @SafeParcelable.Param(m11120id = 5) boolean z3, @SafeParcelable.Param(m11120id = 6) boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) BinderC8916bx0.m10547H(BinderC8916bx0.m10546G(iBinder));
        this.zze = z3;
        this.zzf = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, new BinderC8916bx0(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
