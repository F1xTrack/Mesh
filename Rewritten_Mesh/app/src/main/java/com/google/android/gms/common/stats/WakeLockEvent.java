package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    @SafeParcelable.VersionField(m11122id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getTimeMillis", m11119id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getEventType", m11119id = 11)
    private final int zzc;

    @SafeParcelable.Field(getter = "getWakeLockName", m11119id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", m11119id = 10)
    private final String zze;

    @SafeParcelable.Field(getter = "getCodePackage", m11119id = 17)
    private final String zzf;

    @SafeParcelable.Field(getter = "getWakeLockType", m11119id = 5)
    private final int zzg;

    @SafeParcelable.Field(getter = "getCallingPackages", m11119id = 6)
    private final List zzh;

    @SafeParcelable.Field(getter = "getEventKey", m11119id = 12)
    private final String zzi;

    @SafeParcelable.Field(getter = "getElapsedRealtime", m11119id = 8)
    private final long zzj;

    @SafeParcelable.Field(getter = "getDeviceState", m11119id = 14)
    private final int zzk;

    @SafeParcelable.Field(getter = "getHostPackage", m11119id = 13)
    private final String zzl;

    @SafeParcelable.Field(getter = "getBeginPowerPercentage", m11119id = 15)
    private final float zzm;

    @SafeParcelable.Field(getter = "getTimeout", m11119id = 16)
    private final long zzn;

    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", m11119id = 18)
    private final boolean zzo;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(m11120id = 1) int i, @SafeParcelable.Param(m11120id = 2) long j, @SafeParcelable.Param(m11120id = 11) int i2, @SafeParcelable.Param(m11120id = 4) String str, @SafeParcelable.Param(m11120id = 5) int i3, @SafeParcelable.Param(m11120id = 6) List list, @SafeParcelable.Param(m11120id = 12) String str2, @SafeParcelable.Param(m11120id = 8) long j2, @SafeParcelable.Param(m11120id = 14) int i4, @SafeParcelable.Param(m11120id = 10) String str3, @SafeParcelable.Param(m11120id = 13) String str4, @SafeParcelable.Param(m11120id = 15) float f, @SafeParcelable.Param(m11120id = 16) long j3, @SafeParcelable.Param(m11120id = 17) String str5, @SafeParcelable.Param(m11120id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String strJoin = list == null ? "" : TextUtils.join(StringUtils.COMMA, list);
        int i = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f = this.zzm;
        String str3 = this.zzf;
        int i2 = this.zzg;
        String str4 = this.zzd;
        boolean z = this.zzo;
        StringBuilder sb = new StringBuilder("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3 != null ? str3 : "");
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
