package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p000.AbstractC0933Op;

/* loaded from: classes.dex */
public interface FusedLocationProviderClient extends HasApiKey<Api.ApiOptions.NoOptions> {

    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @Deprecated
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    Task flushLocations();

    Task getCurrentLocation(int i, AbstractC0933Op abstractC0933Op);

    Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, AbstractC0933Op abstractC0933Op);

    Task getLastLocation();

    Task getLastLocation(LastLocationRequest lastLocationRequest);

    Task getLocationAvailability();

    Task removeLocationUpdates(PendingIntent pendingIntent);

    Task removeLocationUpdates(LocationCallback locationCallback);

    Task removeLocationUpdates(LocationListener locationListener);

    Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener);

    Task setMockLocation(Location location);

    Task setMockMode(boolean z);
}
