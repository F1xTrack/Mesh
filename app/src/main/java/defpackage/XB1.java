package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* loaded from: classes.dex */
public final class XB1 extends AbstractC4110hC1 {
    public final /* synthetic */ GeofencingRequest a;
    public final /* synthetic */ PendingIntent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XB1(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = geofencingRequest;
        this.b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        S81 s81 = new S81();
        s81.a.b(new C6446pN0(15, this));
        ((C8325zE1) anyClient).i(this.a, this.b, s81);
    }
}
