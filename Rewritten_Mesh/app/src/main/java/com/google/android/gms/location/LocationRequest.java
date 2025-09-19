package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.yandex.varioqub.config.model.ConfigValue;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;
import p000.C11264uE1;
import p000.VE1;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", m11119id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", m11119id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", m11119id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", m11119id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", m11119id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", m11119id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", m11119id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", m11119id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = ResultCode.ERROR, getter = "getMaxUpdateAgeMillis", m11119id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", m11119id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", m11119id = 13)
    private final int zzk;

    @SafeParcelable.Field(getter = "getModuleId", m11119id = 14)
    private final String zzl;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", m11119id = 15)
    private final boolean zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", m11119id = 16)
    private final WorkSource zzn;

    @SafeParcelable.Field(getter = "getImpersonation", m11119id = 17)
    private final C11264uE1 zzo;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = VE1.f12459a;
        synchronized (sb) {
            sb.setLength(0);
            VE1.m8337a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = jElapsedRealtime + j;
        if (((jElapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    public boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j) {
        Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
        this.zze = j;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = Math.max(1L, j - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j) {
        Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "invalid numUpdates: "));
        }
        this.zzf = i;
        return this;
    }

    @Deprecated
    public LocationRequest setPriority(int i) {
        zzae.zza(i);
        this.zza = i;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f);
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    public String toString() {
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("Request[");
        if (isPassive()) {
            sbM26238o.append(zzae.zzb(this.zza));
        } else {
            sbM26238o.append("@");
            if (isBatched()) {
                VE1.m8337a(this.zzb, sbM26238o);
                sbM26238o.append("/");
                VE1.m8337a(this.zzd, sbM26238o);
            } else {
                VE1.m8337a(this.zzb, sbM26238o);
            }
            sbM26238o.append(" ");
            sbM26238o.append(zzae.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sbM26238o.append(", minUpdateInterval=");
            sbM26238o.append(zzf(this.zzc));
        }
        if (this.zzg > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            sbM26238o.append(", minUpdateDistance=");
            sbM26238o.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            sbM26238o.append(", maxUpdateAge=");
            sbM26238o.append(zzf(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sbM26238o.append(", duration=");
            VE1.m8337a(this.zze, sbM26238o);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sbM26238o.append(", maxUpdates=");
            sbM26238o.append(this.zzf);
        }
        if (this.zzk != 0) {
            sbM26238o.append(", ");
            sbM26238o.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            sbM26238o.append(", ");
            sbM26238o.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            sbM26238o.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            sbM26238o.append(", bypass");
        }
        if (this.zzl != null) {
            sbM26238o.append(", moduleId=");
            sbM26238o.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            sbM26238o.append(", ");
            sbM26238o.append(this.zzn);
        }
        if (this.zzo != null) {
            sbM26238o.append(", impersonation=");
            sbM26238o.append(this.zzo);
        }
        sbM26238o.append(']');
        return sbM26238o.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzk;
    }

    public final WorkSource zzb() {
        return this.zzn;
    }

    public final C11264uE1 zzc() {
        return this.zzo;
    }

    @Deprecated
    public final String zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzm;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private String zzl;
        private boolean zzm;
        private WorkSource zzn;
        private C11264uE1 zzo;

        public Builder(int i, long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i);
            this.zza = i;
            this.zzb = j;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public LocationRequest build() {
            int i = this.zza;
            long j = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j;
            } else if (i != 105) {
                jMin = Math.min(jMin, j);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j2 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j3 = this.zzi;
            return new LocationRequest(i, j, jMin, jMax, Long.MAX_VALUE, j2, i2, f, z, j3 == -1 ? this.zzb : j3, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        public Builder setDurationMillis(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zze = j;
            return this;
        }

        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzj = i;
            return this;
        }

        public Builder setIntervalMillis(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j;
            return this;
        }

        public Builder setMaxUpdates(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.zzf = i;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f) {
            Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j;
            return this;
        }

        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zza = i;
            return this;
        }

        public Builder setWaitForAccurateLocation(boolean z) {
            this.zzh = z;
            return this;
        }

        public final Builder zza(boolean z) {
            this.zzm = z;
            return this;
        }

        @Deprecated
        public final Builder zzb(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        public final Builder zzc(int i) {
            int i2;
            boolean z;
            if (i == 0 || i == 1) {
                i2 = i;
                z = true;
            } else {
                i2 = 2;
                if (i == 2) {
                    z = true;
                    i = 2;
                } else {
                    i2 = i;
                    z = false;
                }
            }
            Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.zzk = i2;
            return this;
        }

        public final Builder zzd(WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }

        public Builder(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(m11120id = 1) int i, @SafeParcelable.Param(m11120id = 2) long j, @SafeParcelable.Param(m11120id = 3) long j2, @SafeParcelable.Param(m11120id = 8) long j3, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", m11121id = 5) long j4, @SafeParcelable.Param(m11120id = 10) long j5, @SafeParcelable.Param(m11120id = 6) int i2, @SafeParcelable.Param(m11120id = 7) float f, @SafeParcelable.Param(m11120id = 9) boolean z, @SafeParcelable.Param(m11120id = 11) long j6, @SafeParcelable.Param(m11120id = 12) int i3, @SafeParcelable.Param(m11120id = 13) int i4, @SafeParcelable.Param(m11120id = 14) String str, @SafeParcelable.Param(m11120id = 15) boolean z2, @SafeParcelable.Param(m11120id = 16) WorkSource workSource, @SafeParcelable.Param(m11120id = 17) C11264uE1 c11264uE1) {
        this.zza = i;
        long j7 = j;
        this.zzb = j7;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j7;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = str;
        this.zzm = z2;
        this.zzn = workSource;
        this.zzo = c11264uE1;
    }
}
