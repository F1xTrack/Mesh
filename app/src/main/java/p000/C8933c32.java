package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.ActivityRecognitionApi;

/* renamed from: c32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8933c32 implements ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult removeActivityUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new W12(googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult requestActivityUpdates(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        return googleApiClient.execute(new C10980s12(googleApiClient, j, pendingIntent));
    }
}
