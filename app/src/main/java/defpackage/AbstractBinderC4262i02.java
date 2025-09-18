package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: i02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4262i02 extends OA1 implements J02 {
    public AbstractBinderC4262i02() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // defpackage.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) LC1.a(parcel, LocationSettingsResult.CREATOR);
        LC1.b(parcel);
        f(locationSettingsResult);
        return true;
    }
}
