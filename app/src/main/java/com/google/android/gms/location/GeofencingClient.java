package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes.dex */
public interface GeofencingClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    Task removeGeofences(PendingIntent pendingIntent);

    Task removeGeofences(List<String> list);
}
