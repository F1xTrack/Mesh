package defpackage;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;

/* renamed from: eD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3540eD1 extends GoogleApi implements SettingsClient {
    @Override // com.google.android.gms.location.SettingsClient
    public final Task checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return doRead(TaskApiCall.builder().run(new C5826m71(9, locationSettingsRequest)).setMethodKey(2426).build());
    }
}
