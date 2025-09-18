package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.GeofenceStatusCodes;

/* renamed from: mD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5844mD1 extends OA1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ S81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5844mD1(int i, S81 s81) {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        this.a = i;
        switch (i) {
            case 1:
                this.b = s81;
                super("com.google.android.gms.location.internal.ILocationStatusCallback");
                break;
            default:
                this.b = s81;
                break;
        }
    }

    @Override // defpackage.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.a) {
            case 0:
                S81 s81 = this.b;
                if (i == 1) {
                    int i3 = parcel.readInt();
                    parcel.createStringArray();
                    LC1.b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i3)), s81);
                    break;
                } else if (i == 2) {
                    int i4 = parcel.readInt();
                    parcel.createStringArray();
                    LC1.b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i4)), s81);
                    break;
                } else if (i == 3) {
                    int i5 = parcel.readInt();
                    LC1.b(parcel);
                    TaskUtil.setResultOrApiException(new Status(GeofenceStatusCodes.zza(i5)), s81);
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Status status = (Status) LC1.a(parcel, Status.CREATOR);
                    Location location = (Location) LC1.a(parcel, Location.CREATOR);
                    LC1.b(parcel);
                    TaskUtil.setResultOrApiException(status, location, this.b);
                    break;
                }
                break;
        }
        return true;
    }
}
