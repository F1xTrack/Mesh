package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes.dex */
public final class SC1 extends UC1 {
    public final /* synthetic */ LocationSettingsRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SC1(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        super(RB1.b, googleApiClient);
        this.a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C8325zE1 c8325zE1 = (C8325zE1) anyClient;
        LocationSettingsRequest locationSettingsRequest = this.a;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) c8325zE1.getService();
        JD1 jd1 = new JD1(this);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, locationSettingsRequest);
        LC1.d(parcelZza, jd1);
        parcelZza.writeString(null);
        c2341bW1.zzc(63, parcelZza);
    }
}
