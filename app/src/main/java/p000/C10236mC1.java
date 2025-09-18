package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;

/* renamed from: mC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10236mC1 implements GeofencingApi {
    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new XB1(googleApiClient, geofencingRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new C8823bC1(googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult addGeofences(GoogleApiClient googleApiClient, List list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return googleApiClient.execute(new XB1(googleApiClient, builder.build(), pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult removeGeofences(GoogleApiClient googleApiClient, List list) {
        return googleApiClient.execute(new C8951cC1(googleApiClient, list));
    }
}
