package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

/* loaded from: classes.dex */
public final class XB1 extends AbstractC9596hC1 {

    /* renamed from: a */
    public final /* synthetic */ GeofencingRequest f13612a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f13613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XB1(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f13612a = geofencingRequest;
        this.f13613b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        S81 s81 = new S81();
        s81.f10598a.mo11135b(new C10641pN0(15, this));
        ((C11900zE1) anyClient).m26342i(this.f13612a, this.f13613b, s81);
    }
}
