package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes.dex */
public final class SC1 extends UC1 {

    /* renamed from: a */
    public final /* synthetic */ LocationSettingsRequest f10620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SC1(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        super(RB1.f10060b, googleApiClient);
        this.f10620a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C11900zE1 c11900zE1 = (C11900zE1) anyClient;
        LocationSettingsRequest locationSettingsRequest = this.f10620a;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) c11900zE1.getService();
        JD1 jd1 = new JD1(this);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, locationSettingsRequest);
        LC1.m4926d(parcelZza, jd1);
        parcelZza.writeString(null);
        c8863bW1.zzc(63, parcelZza);
    }
}
