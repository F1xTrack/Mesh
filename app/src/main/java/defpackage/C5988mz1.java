package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* renamed from: mz1 */
/* loaded from: classes.dex */
public final class C5988mz1 extends AbstractC3722fA1 {
    public final /* synthetic */ PendingIntent a;
    public final /* synthetic */ LocationRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5988mz1(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = pendingIntent;
        this.b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).m(this.a, this.b, C5453kA1.a(this));
    }
}
