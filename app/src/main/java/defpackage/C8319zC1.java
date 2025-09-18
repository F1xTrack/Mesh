package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: zC1 */
/* loaded from: classes.dex */
public final class C8319zC1 extends GoogleApi implements GeofencingClient {
    @Override // com.google.android.gms.location.GeofencingClient
    public final Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C2192ak1(geofencingRequest.zza(getContextAttributionTag()), 6, pendingIntent)).setMethodKey(2424).build());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C5996n11(12, pendingIntent)).setMethodKey(2425).build());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(List list) {
        return doWrite(TaskApiCall.builder().run(new A61(9, list)).setMethodKey(2425).build());
    }
}
