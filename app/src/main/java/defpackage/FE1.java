package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FE1> CREATOR = new C2093aD1(3);
    public final LocationRequest a;

    public FE1(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
            }
            builder.zzd(workSource);
        }
        if (z) {
            builder.setGranularity(1);
        }
        if (z2) {
            builder.zzc(2);
        }
        if (str != null) {
            builder.zzb(str);
        } else if (str2 != null) {
            builder.zzb(str2);
        }
        if (z3) {
            builder.zza(true);
        }
        if (z4) {
            builder.setWaitForAccurateLocation(true);
        }
        if (j != Long.MAX_VALUE) {
            builder.setMaxUpdateAgeMillis(j);
        }
        this.a = builder.build();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FE1) {
            return Objects.equal(this.a, ((FE1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
