package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC1374Vq;
import p000.PE1;

@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzn();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    @SafeParcelable.Field(getter = "getParcelableGeofences", m11119id = 1)
    private final List zza;

    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", m11119id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "", getter = "getTag", m11119id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getContextAttributionTag", m11119id = 4)
    private final String zzd;

    public static final class Builder {
        private final List zza = new ArrayList();

        @InitialTrigger
        private int zzb = 5;
        private String zzc = "";

        public Builder addGeofence(Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof PE1, "Geofence must be created using Geofence.Builder.");
            this.zza.add((PE1) geofence);
            return this;
        }

        public Builder addGeofences(List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(m11120id = 1) List list, @SafeParcelable.Param(m11120id = 2) @InitialTrigger int i, @SafeParcelable.Param(m11120id = 3) String str, @SafeParcelable.Param(m11120id = 4) String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.zza);
        sb.append(", initialTrigger=");
        sb.append(this.zzb);
        sb.append(", tag=");
        sb.append(this.zzc);
        sb.append(", attributionTag=");
        return AbstractC1374Vq.m8593l(sb, this.zzd, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final GeofencingRequest zza(String str) {
        return new GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }
}
