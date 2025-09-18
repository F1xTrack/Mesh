package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC7222ym;

@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzag();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    @SafeParcelable.Field(getter = "getStartTimeMillis", m11119id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getEndTimeMillis", m11119id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getStatus", m11119id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", m11119id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", m11119id = 5)
    private final int zze;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(m11120id = 1) long j, @SafeParcelable.Param(m11120id = 2) long j2, @SafeParcelable.Param(m11120id = 3) int i, @SafeParcelable.Param(m11120id = 4) int i2, @SafeParcelable.Param(m11120id = 5) int i3) {
        Preconditions.checkArgument(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static List<SleepSegmentEvent> extractEvents(Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = this.zzc;
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("startMillis=", j, ", endMillis=");
        sbM26239p.append(j2);
        sbM26239p.append(", status=");
        sbM26239p.append(i);
        return sbM26239p.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
