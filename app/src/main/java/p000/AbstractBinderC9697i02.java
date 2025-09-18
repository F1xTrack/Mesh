package p000;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: i02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9697i02 extends OA1 implements J02 {
    public AbstractBinderC9697i02() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // p000.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) LC1.m4923a(parcel, LocationSettingsResult.CREATOR);
        LC1.m4924b(parcel);
        mo2555f(locationSettingsResult);
        return true;
    }
}
