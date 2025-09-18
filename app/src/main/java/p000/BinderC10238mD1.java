package p000;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;

/* renamed from: mD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC10238mD1 extends OA1 {

    /* renamed from: a */
    public final /* synthetic */ int f37564a;

    /* renamed from: b */
    public final /* synthetic */ S81 f37565b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC10238mD1(int i, S81 s81) {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        this.f37564a = i;
        switch (i) {
            case 1:
                this.f37565b = s81;
                super("com.google.android.gms.location.internal.ILocationStatusCallback");
                break;
            default:
                this.f37565b = s81;
                break;
        }
    }

    @Override // p000.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f37564a) {
            case 0:
                S81 s81 = this.f37565b;
                if (i == 1) {
                    int i3 = parcel.readInt();
                    parcel.createStringArray();
                    LC1.m4924b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i3)), s81);
                    break;
                } else if (i == 2) {
                    int i4 = parcel.readInt();
                    parcel.createStringArray();
                    LC1.m4924b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i4)), s81);
                    break;
                } else if (i == 3) {
                    int i5 = parcel.readInt();
                    LC1.m4924b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i5)), s81);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Status status = (Status) LC1.m4923a(parcel, Status.CREATOR);
                    Location location = (Location) LC1.m4923a(parcel, Location.CREATOR);
                    LC1.m4924b(parcel);
                    TaskUtil.setResultOrApiException(status, location, this.f37565b);
                    break;
                }
                break;
        }
        return true;
    }
}
