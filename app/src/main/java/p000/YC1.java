package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsApi;

/* loaded from: classes.dex */
public final class YC1 implements SettingsApi {
    @Override // com.google.android.gms.location.SettingsApi
    public final PendingResult checkLocationSettings(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        return googleApiClient.enqueue(new SC1(googleApiClient, locationSettingsRequest));
    }
}
